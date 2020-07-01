This folder contains references of different related work and how we are different from them. I am going to try to write also a review on the papers that we have discussed in the meeting for future reference.

## The Safety Annex for the Architecture Analysis and Design Language:

This is a journal draft version that Danielle has sent over. I should keep track of where she actually publishes it.
The paper is talking about extending AADL that is used by agree to support modeling of failures. It defines different modes of failures as well as it allows safety engineers to weave various types of faults into the nominal system model. It tries to address limitations and challenges behind determining how errors propagate through the software components, which is usually a costly and time-consuming task. 
The paper contains some description about a small model of WBS. A basic reference about WBS is found [https://www.sae.org/standards/content/air6110/](here)


## Combinatorial Sketching for Finite Programs:ASPLOS 2006 (Program Repair Category)

This praper describe system called sketching as a programming language by which the user can define forms of building holes. 

Sketching relies on building two version of the program, one that is straight forward but probably slow and the other is a bit complex but you think that it is faster, though you are not quite sure about the details of how to write this complex program. The tool basically does a combinatorial search for all possible alternatives in a specific cost/depth and/or loop unrolls.

The way that there exist some implementation that sort of guides the synthesis process is similar to what we have were we rely on an implementation to guide the repair of contract properties. 

The language supports, loops, recursive functions as well as some complex data structures like arrays. 
To create an SMT query for the solver for loops for instance, sketch unroll the loop for a default number of times, and adds an assertion to check that the loop condition can still be valid, if this the case then this SMT query is regnerated by unrolling the loop a bit more and the process is repeated. 

We are different in two different ways:
- the fact that we are repairing a property and its model elements, rather than an implementation repair.
- we do not need to unroll loops of the implementation instead we use k-induction to verify that correctness between the specification and the implementation.


## Towards Practical Program Repair with On-Demand Candidate Generation SIGPLAN 2018 (Program Repair Category)


This is basically a program repair paper that uses sketching. The paper tries to use some runtime information which can prune way some repair candidates. The main points about this paper is 
- They are not using SMT in the repair or the synthesis, instead they sort of create holes where each hole have a set of valid candidates. 
- they define a grammar for hole expression, i.e., expressions that can contain holes in them. 
- based on their algorithm, the create a version of the program that have these sketch-hole-statements, then they wait until execution reaches this point, they pick the closest candidate (defined in the next point), and proceed with the execution, if the execution does not fire the test case, then they back track and give a different value to that particular hole. This prevents them from having to make choices for all the holes in advance, they sort of wait until execution arrives and they pick another candidate. 
- they sort candidates based on closeness to the statement to be repaired, i.e., they give priority of objects/variables defined closer to the repaired statement than those defined a bit earlier in the program. 

This paper have a good performance results, and it is another advocate for having sketch-like repair for contracts. 

I can't think of how we are better than them, except we are trying to do repair on a different level, mainly the spec instead of the program.


## SketchFix- (Program Repair Category)

Sketchfix is about program repair using Sketch approach. They use in the backend SketechEd.
Their general idea is that "Generate and Validate" type of repair, iteratively generate candidate programs with possible fixes. Validate them against given tests, until a candidate that passes all the test if found.
problem: large number of candidates, needs to be generated, compiled and tested.
They propose On-Demand candidate generation through sketching.
Their key insight is that the space of candidate programs can be pruned substantially by utilizing runtime information and by generating candidates on-demand during test validation. Example, consider trying to fix a faulty condition in a while-loop as well as the body of the loop; if a test execution raises an exception upon evaluating a specific candidate while-loop condition, all candidates of the while-loop body are pruned from search for that choice of the candidate condition expression.
Thus they do runtime, on-demand, lazy candidate generation.
SketchFix work as follows:
Given a suspicious location in the program that needs a repair, SketchFix transforms that location to an AST node-level schema that is made of possible holes.
The program is then compiled once and the generated Sketch represents a number of valid/possible candidates. 
Possible candidates are ranked and explored by EdSketch, possibly backtracking and exploring a different choice. 
SketchFix defines transformation schemas at a fine granularity and prioritizes first the schemas that introduce smaller perturbations to the original program (less # of holes, and keep the main structure). 

After transforming the original faulty program to sketches based on the schemas, SketechFix executes test cases to synthesize sketches with on-demand candidate generation. 
SketchFix will not generate concrete candidates for a hole until the test execution reaches the hole. 
The candidates are created based on the runtime information. For instance, no candidates for field dereferences for null variables.

They evaluated SketchFix on the Defect4J, which consists of 357 real defects from 5 open source Java applications. 
SketchFix uses an existing spectrum-based fault localization technique called Ochiai. The figure shows repair results of SketchFix over top 50 suspicious statements.SketchFix is able to repair 19 out of 357 in average of 23 min.

Not that, SketchFix explores the search space of repair candidates for each program sketch until the space of candidates is exhausted or we find a pre-defined number of repairs that pass all tests. Currently we terminate after finding the first repair yet we set the number of output repairs as configurable. They also used java parser to generate the program sketches.

I have a power point presentation from the secuity group, which might be uselful to go to for further reference.


## Feedback-Driven Dynamic Invariant Discovery - (Invariant Discovery Category)
This paper is about a tool iDiscovery that utlizes Daikon, SPF and Green to discover invariants. Basically the whole idea is that, given some test cases, the tool uses Daikon to discover invariants, they instruement them into the code, and check their validity with SPF, if they fail, new tests are generated which are used on the original program (without the assertions) to generate the traces to be supplied to Daikon to generate new assertions. Using this loop, assertions can be refined, they stop when Daikon's assertions are fixed, that is they reach a fix point with Daikon's generation of assertions.

The paper proposes two optimizations, (1) assertion restrictions and (2) violation assertions. In the first optimization they focus symbolic exection on checking one assertion at a time. The goal really is to reduce the complexity of the queries generated from adding too many assertions, especially if under the sat of one assertion another is check, that is there is no need need to recheck the previous one, because at that point we know that it is true (sat). For this they use some backtracking primitives supplied by JPF, where inserted assertions are only checked once down one path. The second optimization really generates a counter example of an assertion once, that is if there are multiple paths in which they all hit this assertion, then there is a possibility that a few of them would violate the assertion, for this, they just record the first violation and they do not recheck the assertion on subsequent pathes. 

The have interesting evaluation. Mainly they measured three things: (1) the effect with and without optimizations, (2) the effect of every optimization sperately, (3) the effect of having different sets of test suits to start with as the initial set for Daikon invariant generation. The also compared usage of green solver with and without the optimiations turned on. Generally, the effect of optimizations were good for it either convered faster, in less time and less iterations, there are in fact two benchmarks that used to time out in 20hours without these optimizations turned on, and with the optimizations turned on they could actually finish in more than an hour. Also their second study seems to be say different things about the optimizations, their first optimization seems to reduce the time and also the number of iterations, the later part they have not justified and I am not sure why it happned, while the second optimization seems to reduce the time without reducing the number of iterations, comparing without the optimizations. Also when they reported about reusing constraints using green solver, it seems that that was also quite a boots to their performance as it saved more time needed to talk to the solver. Finally for the initial set of starting test cases, seems that starting with the initial set being the set genreated by running the symbolic execution seems to give the best results, but they do have a bit of detailed discussion about that part, which is perhaps useful to go back to, if I ever wanted to talk about his particular part.


## SymInfer: Inferring Program Invariants using Symbolic States (ASE 2017) (Invariant Discovery)

This paper is similar to iDiscovery in someways. It discovers invariants of programs using Counter Example Guided framework  like iDiscovery and it uses invariant generation tool DIG, while iDiscovery uses Daikon. However this paper uses the symbolic state of the program, which is not only the path condition at particular line of code, but also all symbolic values of all program variables at that particular location. In iDiscovery, only the path condition was used. 

symInfer, uses the symbolic state to generate diverse concrete candidates of inputs to DIG, which is used for invariant generation, and it uses the symbolic state as well to refute candidate invariants from DIG.

The main advantage of this paper, is that they are able to produce non-linear invariants by utilizing DIG and by using their symbolic state. The compare themselves with PIE, which they call the state of the art in invariant discovery/inference. PIE uses machine learning, a good next candidate for reading.

We can think of what we are doing is some sort of capture of ths symbolic state, but it is not for the whole program/method instead of a portion of it.


## Data-Driven Precondition Inference with Learned Features - (Invariant Discovery) PLDI'16

This paper presents PIE that uses test cases and a program to find preconditions. PIE learns features automatically as opposed to other systems taht needs to have the features to be manually entered. PIE can also be used to infer loop invariants. 
PIE takes three inputs, (1) the function that we want to find the preconditions for, (2) test input, and (3) postcondition, which is a function that would take categorize every result/output to ether true or false to distinguish a good from bad test case where a good test case is a passing test case and where a bad test case is a test case that has resulted in an exception being raised. 

PIE employes the following:
1. PIE learns features via Program Synthesis. The intution behind learning is that whenever two tests conflict, that is they overlap in the set of features yet one test case is in the good pile and the other is in the bad pile, then these test cases must have different preconditions. The goal then becomes to learn a new feature that would distinguish the difference between the two test cases, i.e., enable the seperation between the good and the bad test cases. PIE's feature learner uses a form of search-based program synthesis to generate a feature that resolves all conflicts in a given "conflict group", where a conflict group is a set of tests that induce teh same feature vector and participate in the conflict, i.e., at least one test in G and one in B. Given a set of consants and operations for each type of data in the tests, the feature learner enumeartes candidate boolean expressions in order of increasing size until it finds one that seperates the good and he bad tests in the given conflict group. 
2. So this is for learning features, by PIE too needs to generate boolean predicates as preconditions, to do that, PIE employes some machine learning algorithm that creates the smallest (in size) and weakest precondition in CNF form (conjunction of disjunction). 
3. PIE can be used as a subroutine to discover loop invariants, and by loop invariants they mean that the genrated invariant must satisfy three conditions: (a) it must be valid initially, (b) it is inductive, and (3) it should be enough to prove the assertion inside the loop body. 

The novality of the approach is to combine the good things from the two worlds, program synthesis over constants and operations on the type can grow exponentialy, but can be reasonable to synthesis a feature rather than the invariant for the whole program, and data-driven precondition inference, which can be used to infer the precondition easily but has the limitation of having to supply the fixed features to learn the precondition from. By combining learning of features via program synthesis and learning of boolean CNF formulas, PIE has combined the good things from the two worlds.

Evaluation of PIE was 
1. to learn preconditions of some OCaml functions and compare them to the documentation. 
2. they had an experement that shows the two parameters the PIE deployed, the maximum number of test cases and the maximum number of conflict (conflict group size in terms of the test cases that it contains). PIE's point for the later is to show that if we are trying to synthesis a feature where all the test cases are in conflict then the synthesis for features is overly used and can quickly hit resource limit.
3. They presented PIE results when running it on 3 benchmarks, including linear arithmetic, non-linear arithmetic and strings.

Weaknes: general weakness from having to use data-driven approach because it is restricted to the number of test cases given. 
They have also reported 14 cases where PIE either failed due to time or memory or it produced incorrect or incomplete preconditions due to some tool limitations.


## Symbolic Repairs for GR(1) Specifications - ICSE'19
In this paper the authors suggest repairing GR(1) unrealizable specifications, where GR(1) is a fragment of assume-guarantee fragment of LTL, and the unrealizability is defined as "there exists an environment that satisfy all the assumptions while FORCING the system to violate its guarantees. The paper has 3 key contributions, they suggest two symbolic approaches for repair (thus they promote it as efficient) and the third is that they introduce the notion of repair core. 

The example they provide is not realizable because the enviroment can always choose c to be true and therefore the system will not be able to make the 'just' rule realizable.

The first approach is based on JVTS, which is a name that they give to symbolic counter example. The approach uses counter example of unrealizable system and generates symbolic counter example from it, then it tries to avoid it by adding the right assumption, that invalidates certain states or certain transitions. The paper uses two repair algorithms for JVTS, one that generates the assumptions from the JVTS and another that uses the assumptions in a breadth-first search to check if the specification is realizable under the assumptions generated from JVTS>

The second approach is not based on counter example, instead it is based on the specification. The approach computes safety assumptions that ensures the safety guarantees can be satisfied, a justice assumption for each justice guarantee and an initial assumption to prevent losing initial states. It computes that by first collecting all states that the enviroment and system initial assumptions, transitions, safety, and justice agree. It then tries to find states where environment was holding but the system justice was not, finally it tries to find the winning states of the system and allow only inital states that match them. It finally returns the new initial assumptions, safety assumptions, and justice assumptions.

Their third contribution is that they provide a repair core, which is a locally minimal subset of a repair that is already a repair. To find that they apply delta debugging algorithm which involves multiple calls to check realizability, each with different subset of addditional assumptions.

- The difference between this work and ours is mainly addressing two different problems, while this work is trying to find assumptions to make an unrealizable specification realizable, we try to repair a specification to some realizable implementation. 
- The notion of repair core in their terms is trying to find the "smalles set of assumptions to add", their notion is rather syntactic, that is they true to find the smallest subset of assumptions in the already discovered assumptions that repairs the spec. In our work however, we were looking for the smallest semantic rathere than syntactic repair. 
- One important note is that both algorithm assumes a gamma-sat spec, that is there exists some satisfaiblity to all the assumptions and guarantees for them to be able to repair. So, that means that they are unable to repair a and !a.
- Does not repair everything by definition of gamma-sat.
- Redundancy in spec after repair: “although given the suggested repair, some assumptions that appear already in the original specification may become unnecessary for realizability, we choose not to remove any assumptions but only to suggest new ones to add.”
- Addition of free unconstrained free variables have quiet overhead.
Q: still not sure if both JVTS is incomplete besides losing on repairs that yields gamma-unsat.


## AutoTap: Synthesizing and Repairing Trigger-Action Programs Using LTL Properties - ICSE'19

This paper is talking about TAP programs and how to automate generating rules for none technical users. TAP programs are programs that are use to program IoT devices. Users can though writing conflicting and incorrect rules. The paper suggest a way to enable users to write LTL formulas that would describe their intended properties, then using their tool they can synthesize rules that satisfy these rules. 

The paper starts with a user study where they asked users to express properties they would want their IoT to do. Using this study, they came up with 7 types of templates that they can use to express various users properties and they under the hood translate these templates into LTL formulas.

Now to allow their tool (AutoTAP) to synthesize the corresponding rules they did the following
(1) they translated the devices specifications into a transition system. They also in this step translated existing TAP rules to the same transition system.
(2) using the desired user's property \phi, they negated it.
(3) they combined both (1) and (2) and generated the Buchi Automaton. Thus the product would show all allowable executions that can go to the accepteing state of \not \phi, which would represent all edges that they would want to remove from the transition system.

(4) they removed these transitions by adding rules that by pass the undesriable transitions whenever they are about to occur. This is their way to synthesize rules that would satisfy the user's desried added property \phi. 

Note that these added rules are both property compliant in terms of the added property, and also they are accomedating, in terms of not disabling any device behaviour that originally satisfy the proerpties.

# Main Take Away

The arguement that I tried to make is to, say we can use their model to where we can express the implementation as the transition system and the unmatching property as their safety property. Thus if we negated the safety property we will identify all edges that exists in the implemenation that would lead to the invalid accepting state. We can use some technique the correpsonds to their technique of generating rules to append changes on the property that they wish to fix.

The main takeaway is to realize that their model is using finite state machine, whereas in our model because we wanted to present the implementation that can present large finite state (due to arithemtics) it will be difficult to use their technique basically to generate the Buchi automaton.

Nice reference/follow up paper to read is their reference #25.


## Automated Repair of Feature Interaction Failures in Autmomated Driving Systems - ISSTA'20




# Question of Measuring Quality
Combinatorial Sketch for finite programs addressed that by showing on case study AES cipher implementation using sketch. They showed that sketch was able to synthesis the most difficult part of AES implementation and they showed why it is an efficient implementation by comparing its run against and open SSL implementation.

## Symbolic Repairs for GR(1) Specifications
they have not discussed quality of the repairs, instead they focused on correctness and performance of their tool. They mentioned though the fact that their JVTS can provide multiple repair suggestions, the question of which repair to be used in terms of quality to future work. 
Important information though is that it seems that the notion of quality that they want to use is defined using the "size of the omega-language statisfying an LTL formula"

## SemFix: 
For SemFix the evaluation used only the success-rate of repairting and the performance as a measurement against another system that used genetic programming technique for repair.




