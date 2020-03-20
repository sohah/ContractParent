/*
 * System_Monitor_Functional_types.h
 *
 * Code generation for model "System_Monitor_Functional".
 *
 * Model version              : 1.1157
 * Simulink Coder version : 8.4 (R2013a) 13-Feb-2013
 * C source code generated on : Thu Sep 12 09:50:24 2013
 *
 * Target selection: grt.tlc
 * Note: GRT includes extra infrastructure and instrumentation for prototyping
 * Embedded hardware selection: 32-bit Generic
 * Code generation objective: Debugging
 * Validation result: Not run
 */
#ifndef RTW_HEADER_System_Monitor_Functional_types_h_
#define RTW_HEADER_System_Monitor_Functional_types_h_
#include "rtwtypes.h"
#ifndef _DEFINED_TYPEDEF_FOR_Top_Level_Mode_Outputs_
#define _DEFINED_TYPEDEF_FOR_Top_Level_Mode_Outputs_

typedef struct {
  boolean_T System_On;
  boolean_T Request_Confirm_Stop;
  uint8_T Log_Message_ID;
} Top_Level_Mode_Outputs;

#endif

#ifndef _DEFINED_TYPEDEF_FOR_System_Monitor_Output_
#define _DEFINED_TYPEDEF_FOR_System_Monitor_Output_

typedef struct {
  boolean_T System_Monitor_Failed;
} System_Monitor_Output;

#endif

/* Forward declaration for rtModel */
typedef struct tag_RTM_System_Monitor_Functional_T
  RT_MODEL_System_Monitor_Functional_T;

#endif                                 /* RTW_HEADER_System_Monitor_Functional_types_h_ */
