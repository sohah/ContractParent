## Infusion Prop4
### Repairing 

  `p1 = (System_On and (Highest_Level_Alarm = 3) => (Commanded_Flow_Rate <= Flow_Rate_KVO));` 
  
### to

  `p1 = (((not System_On) or (Highest_Level_Alarm = 4)) => ((Commanded_Flow_Rate = 0) xor false));`

## Infusion Prop14
### Repairing 

  `p1 = (System_On and (Current_System_Mode = 6 or Current_System_Mode = 7 or Current_System_Mode = 8 )) => (Commanded_Flow_Rate <= Flow_Rate_KVO);` 
### to

`p1 = ((((Current_System_Mode >= 2) or (Commanded_Flow_Rate = 0)) xor ((Current_System_Mode > 8) xor (Current_System_Mode = 5))) and (((Current_System_Mode < 0) or (Current_System_Mode >= 1)) xor ((Current_System_Mode >= 0) => (not System_On))));`

`p2 = ((((Current_System_Mode >= 0) xor (Current_System_Mode > 6)) => ((Current_System_Mode < 1) xor (not System_On))) => (Commanded_Flow_Rate <= Flow_Rate_KVO));`

`p3 = ((System_On and (((Current_System_Mode = 6) xor (Current_System_Mode < 1)) xor ((Current_System_Mode >= 5) and (Current_System_Mode >= 2)))) => (Commanded_Flow_Rate <= Flow_Rate_KVO));`

`p4 = ((System_On and (((Current_System_Mode <= 0) xor (Current_System_Mode >= 7)) or (Current_System_Mode = 8))) => (Commanded_Flow_Rate <= Flow_Rate_KVO));`

`p5 = ((System_On and (((Current_System_Mode > 6) or (Current_System_Mode = 7)) or (Current_System_Mode = 8))) => (Commanded_Flow_Rate <= Flow_Rate_KVO)); `
 

