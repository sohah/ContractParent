This file is used for reference of all meetings going forward as of what we have discussed there.

## Sept. 10th, 2019
We mainly concluded the meeting that we want to run our tool on real programs. We decided that we going to use the Java implementation of WBS and the AGREE contract to try to discover what the implementation is actually doing.

We talked about different submission one of them is to target [NierICSE2020](https://conf.researchr.org/track/icse-2020/icse-2020-New-Ideas-and-Emerging-Results).
Deadline of paper submission is Oct. 15th 2019

## Sept. 13th, 2019 - one-to-one meeting with Stephen and Sanjai
We talked about using the tool in two modes:
- the first mode is useful if we have an implementation but not a specification. There we can write the specification in terms of inputs and outputs and some constraints/properties where we use the implementation and our technique not only to validate the property but also to repair it. In this way we are different than others work in two different ways: first we are repairing instead of just verifying, the second is that we are not unrolling loops, instead we are using induction to verify properties.
- the second mode is where we have a model with the implementation. In that form, we can repair the specification and potientially be able to propagate repairs among other components affected by the property in AGREE like world.

## Sept. 17th, 2019
We talked about :

1. a small expandable problem that can grow in depth in terms of properties and can be easily be written. The program descibes a voting mechanism where there exists 3 inputs (a,b,c) that initially can be boolean but later can be some int value. When they become an int we can add a threshold that describes valid input range. The output of the voting system is either an Alarm or an Error. Basically the whole point becomes under what conditions are we going to raise the alarm and the error output. This can be tuned by various implementation and verified using various properties. Also another thing we can add to this system is time, that is we can have a counter the counts how many steps in which certain condition holds until we fire the alarm or the error signal.

2. we also discussed using our tool to verify some generaly used java programs, but seems that our current implementation won't exactly expand to this context just yet.

3. Finally we addressed that probably what we need is a sketch like system by which the user can guide the search process of a valid repair, by either selecting places where he wishes to do a repair or by providing certain components for the expression, i.e., plus and two local variables on which the search will try to come up with some expression that is composed of only these three components in some way in order for the property to hold.
