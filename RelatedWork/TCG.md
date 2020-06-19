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
