This document is composed of three main sections, the first section describes the current algorithm and implementations in TCG for SPF, the second section describes the current algorithm for TCG of JR, and finally the third section is some related work for TCG papers.

# SPF TCG Algorithm
1. When execution starts we build call graph and select the entry point to start the analysis.
2. The analysis phase collects, obligations and tie them to some other reachable obligations.

  a. Collecting Obligations
    This is done by creating the Control Flow Graph of the method we are currently analyzing and collecting obligations of all branching instructions in this method. Whenever we hit a method call, that is within the application code (i.e., a user defined method call) we create its corresponding CFG and do the same thing again.
    The current approach then collects inter-procedural obligations of user code, however it misses calls to user's application code due to library call-backs. This can be easily extened by visiting the methods in the perviously constructed call graph that were missed during the walking of method invocations.

  b. Collecting reachable obligations
    Reachable obligations are collected only intera-procedural. The algorithm starts with a branching instructions and then walks through the CFG filtering only successor nodes.
    The algorithm thus collectes the reachable nodes of the then-side and of the else-side to seperate both cases.
    The algorithm is not yet inter-procedural but can be extended by collecting obligations in the pervious nodes, as reacheable for all method invocations.
    
3. Dynamically during execution, we collect coverage of obligations as they occur and we currently use the reachable obligations to recognize if a particular path is useful to find any uncovered obligation or not. Depending on that we can terminate the path early.

Also so far we also compute dynamically an ordering between the reachable uncovered obligations of the then and the else-side. But remains to guide SPF to explore the more promising side.


# JR TCG Algorithm
Not started yet


# Related Work

## To Call, or Not to Call: Contrasting Direct and Indirect Branch Coverage in Test Generation - SBST'18

This paper is contrasting two approaches of branch coverage, one where branch coverage can be checked out through indriect calls and another where the branch coverage has to happen through a direct call for it to be checked out as coveraged. 

Basically the paper concludes that both as the good and their bad parts, with favoring the technique of coveraging using indirect calls. One important distinction that the paper tries to make is that in the indirect calls, not all behaviours of control flows can be explored because it depends on whatever was passed as a call. Same thing also applies for direct calls, using different method calls to try to collect branch coverage, can also miss-up on the various states that the object can exist in. 
The direct calls is more to me like unit test whereas the indrect calls are mroe like system testing. 

The findings ass per found by the paper are:
• Given a two-minute search budget, traditional Branch Coverage discovers 10.40% more faults and has a 13.59% higher average likelihood of fault detection than Direct Branch Coverage. With a ten-minute budget, traditional Branch Coverage discovers 4.32% more faults and has a 7.61% higher average likelihood of fault detection.
• Similarly, traditional Branch Coverage attains an average 7.94-9.00% higher Line Coverage and 9.09-10.20% higher Branch Coverage over the code, as well as 8.06-9.46% higher coverage over the faulty lines of code.
• However, each method covers portions of the code and detects faults that the other does not. By examining methods in isolation, Direct Branch Coverage is less constrained in the input it uses to cover each method. Traditional Branch Coverage is able to leverage the context in which methods interact to detect faults that emerge from those interactions.
