This folder contains a bunch of Agree models for different versions of WBS.
In this folder there are three projects:
(1) WBS_arch4_4wheels:
This is the simplest one. It has half of the wheels of the larger model, so the verification takes less time, contracts are a bit easier to read, and less numerous.

(2) WBS_arch4_v2:
This is the full version based on AIR6110. The contracts at the top level are named according to the safety properties in that document and all subsystems are there according to their descriptions. It takes a while to run verification, but only a couple of minutes for the whole thing. So not too bad.

(3) WBS_arch4_v3:
Same as v2 but a sensor subsystem is added to eliminate single points of failure at the sensors. 
