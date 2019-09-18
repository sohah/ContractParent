This folder contains references of different related work and how we are different from them. I am going to try to write also a review on the papers that we have discussed in the meeting for future reference.

## Symbolic Repairs for GR(1) Specifications:

This is a journal draft version that Danielle has sent over. I should keep track of where she actually publishes it.
The paper is talking about extending AADL that is used by agree to support modeling of failures. It defines different modes of failures as well as it allows safety engineers to weave various types of faults into the nominal system model. It tries to address limitations and challenges behind determining how errors propagate through the software components, which is usually a costly and time-consuming task. 
The paper contains some description about a small model of WBS. A basic reference about WBS is found [https://www.sae.org/standards/content/air6110/](here)


## Combinatorial Sketching for Finite Programs:

This praper describe system called sketching as a programming language by which the user can define forms of building holes. 

Sketching relies on building two version of the program, one that is straight forward but probably slow and the other is a bit complex but you think that it is faster, though you are not quite sure about the details of how to write this complex program. The tool basically does a combinatorial search for all possible alternatives in a specific cost/depth and/or loop unrolls.

The way that there exist some implementation that sort of guides the synthesis process is similar to what we have were we rely on an implementation to guide the repair of contract properties. 

The language supports, loops, recursive functions as well as some complex data structures like arrays. 
To create an SMT query for the solver for loops for instance, sketch unroll the loop for a default number of times, and adds an assertion to check that the loop condition can still be valid, if this the case then this SMT query is regnerated by unrolling the loop a bit more and the process is repeated. 

We are different in two different ways:
- the fact that we are repairing a property and its model elements, rather than an implementation repair.
- we do not need to unroll loops of the implementation instead we use k-induction to verify that correctness between the specification and the implementation.





