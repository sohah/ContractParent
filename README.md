# ContractDiscovery

This repo is for Contract Discovery. The idea is that we often are given an implementation and we have a general idea of its basic specification, however we have no garauntees whether our expectations hold true over the implementation or not. Pleople then tend to test programs or verify programs with the hope that have a meaningful understanding of the behaviour of a given implementation. Unfortuntely these techniques fall short in one important aspect, mainly abstraction. While repair exists for programs, we have no known way of repairing specification given some implementation. The purpose of this project is to allow the specification to be repaired or even discovered from a limited specification and some given implementation. 

The folder [./OldImplementation](OldImplementation) is an old verion of the implemenation where we sort of replicated what Jkind did and so we realized that the best way to go really is to use JKind as a back-engine to do the counter example search and the synthesis query. 
In the old Java Ranger repo (here https://github.com/sohah/VeritestingTransformations), is our new tool that uses JKind as a backend.
