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
