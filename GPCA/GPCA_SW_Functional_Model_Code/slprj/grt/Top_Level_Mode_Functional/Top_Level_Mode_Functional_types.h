/*
 * Top_Level_Mode_Functional_types.h
 *
 * Code generation for model "Top_Level_Mode_Functional".
 *
 * Model version              : 1.1167
 * Simulink Coder version : 8.4 (R2013a) 13-Feb-2013
 * C source code generated on : Thu Sep 12 09:50:34 2013
 *
 * Target selection: grt.tlc
 * Note: GRT includes extra infrastructure and instrumentation for prototyping
 * Embedded hardware selection: 32-bit Generic
 * Code generation objective: Debugging
 * Validation result: Not run
 */
#ifndef RTW_HEADER_Top_Level_Mode_Functional_types_h_
#define RTW_HEADER_Top_Level_Mode_Functional_types_h_
#include "rtwtypes.h"
#ifndef _DEFINED_TYPEDEF_FOR_Operator_Commands_
#define _DEFINED_TYPEDEF_FOR_Operator_Commands_

typedef struct {
  boolean_T System_Start;
  boolean_T System_Stop;
  boolean_T Infusion_Initiate;
  boolean_T Infusion_Inhibit;
  boolean_T Infusion_Cancel;
  boolean_T Data_Config;
  boolean_T Next;
  boolean_T Back;
  boolean_T Cancel;
  boolean_T Keyboard;
  uint8_T Disable_Audio;
  boolean_T Notification_Cancel;
  uint8_T Configuration_Type;
  boolean_T Confirm_Stop;
} Operator_Commands;

#endif

#ifndef _DEFINED_TYPEDEF_FOR_Device_Configuration_Inputs_
#define _DEFINED_TYPEDEF_FOR_Device_Configuration_Inputs_

typedef struct {
  uint8_T Audio_Enable_Duration;
  uint8_T Audio_Level;
  uint8_T Config_Warning_Duration;
  uint8_T Empty_Reservoir;
  uint8_T Low_Reservoir;
  uint8_T Max_Config_Duration;
  uint8_T Max_Duration_Over_Infusion;
  uint8_T Max_Duration_Under_Infusion;
  uint8_T Max_Paused_Duration;
  uint8_T Max_Idle_Duration;
  uint8_T Tolerance_Max;
  uint8_T Tolerance_Min;
  uint8_T Log_Interval;
  uint8_T System_Test_Interval;
  uint8_T Max_Display_Duration;
  uint8_T Max_Confirm_Stop_Duration;
} Device_Configuration_Inputs;

#endif

#ifndef _DEFINED_TYPEDEF_FOR_Top_Level_Mode_Outputs_
#define _DEFINED_TYPEDEF_FOR_Top_Level_Mode_Outputs_

typedef struct {
  boolean_T System_On;
  boolean_T Request_Confirm_Stop;
  uint8_T Log_Message_ID;
} Top_Level_Mode_Outputs;

#endif

/* Forward declaration for rtModel */
typedef struct tag_RTM_Top_Level_Mode_Functional_T
  RT_MODEL_Top_Level_Mode_Functional_T;

#endif                                 /* RTW_HEADER_Top_Level_Mode_Functional_types_h_ */
