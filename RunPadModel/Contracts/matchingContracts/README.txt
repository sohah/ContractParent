README

This is a matching contract between the implementation and the specification. 
The requirement is as follows:

/**
 * This implementation is match, the pad with the following requirements:
 *
 * -- this pad has the following requirements for states:
 -- 1. if current launch_bt is true then it must be the case that the start_bt is on now and also in the previous step.
 -- 2. if ignition is true for only one step after launch_bt is true. That is ignition is true only if the previous
 --	 step launch was on and it wasn't the case that in the previous step that iginition was on nore was the reset.
 -- 3. there will be one state where start_bt, launch_bt, ignition are on, followed by a step where
 -- 	start_bt, launch_bt and reset_btn are on, while the ignition is off. The following step would be
 --	reseting everything, that is all buttons are false.
 */
