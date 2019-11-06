### JBMC: A Bounded Model Checking Tool for Verifying Java Bytecode - CAV'2018

This paper presents JBMC. It is basically an extension to BMC with an upper layer that translates java bytecode programs into the corresponding BMC form. In this work, they support symbolic model checker and uses SAT to check satisfiablity of assert statements inserted into the code. They have made a model version of some of the standard libray to be able to run on, this is what they call the Java Operational Model. 

They also talked about supporting string operations, and they have provided an example about that. It is unclear however what they have done to model memory, heap allocation, object creation and stuff like that.

Their results surprisingly reported a number of problems (bigs) in JPF.

