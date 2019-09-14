This file is used for reference of all meetings going forward as of what we have discussed there.

## Sept. 10th, 2019
We mainly concluded the meeting that we want to run our tool on real programs. We decided that we going to use the Java implementation of WBS and the AGREE contract to try to discover what the implementation is actually doing.

We talked about different submission one of them is to target [NierICSE2020](https://conf.researchr.org/track/icse-2020/icse-2020-New-Ideas-and-Emerging-Results).
Deadline of paper submission is Oct. 15th 2019

## Sept. 13th, 2019 - one-to-one meeting with Stephen and Sanjai
We talked about using the tool in two modes:
- the first mode is useful if we have an implementation but not a specification. There we can write the specification in terms of inputs and outputs and some constraints/properties where we use the implementation and our technique not only to validate the property but also to repair it. In this way we are different than others work in two different ways: first we are repairing instead of just verifying, the second is that we are not unrolling loops, instead we are using induction to verify properties.
- the second mode is where we have a model with the implementation. In that form, we can repair the specification and potientially be able to propagate repairs among other components affected by the property in AGREE like world.
