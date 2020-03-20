/*
 * Code generation for system model 'SYS_STATS_Functional'
 *
 * Model                      : SYS_STATS_Functional
 * Model version              : 1.1404
 * Simulink Coder version : 8.4 (R2013a) 13-Feb-2013
 * C source code generated on : Thu Sep 12 09:50:15 2013
 *
 * Note that the functions contained in this file are part of a Simulink
 * model, and are not self-contained algorithms.
 */

#include <stdio.h>
#include "SYS_STATS_Functional.h"
#include "SYS_STATS_Functional_private.h"
#include "../../../GPCA_SW_Functional_grt_rtw/tmwtypes.h"
#include "../../../GPCA_SW_Functional_grt_rtw/rtwtypes.h"

/* Initial conditions for referenced model: 'SYS_STATS_Functional' */
void SYS_STATS_Functional_Init(DW_SYS_STATS_Functional_f_T *localDW)
{
  /* InitializeConditions for UnitDelay: '<S5>/Unit Delay' */
  localDW->UnitDelay_DSTATE = 0U;
}

/* Outputs for referenced model: 'SYS_STATS_Functional' */
void SYS_STATS_Functional(const Infusion_Manager_Outputs *rtu_IM_IN, 
	const Top_Level_Mode_Outputs *rtu_TLM_MODE_IN, 
	const Device_Sensor_Inputs *rtu_SENSOR_IN, 
	const Device_Configuration_Inputs *rtu_CONST_IN, const
  Config_Outputs *rtu_CONFIG_IN, System_Status_Outputs *rty_SYS_STAT_OUT,
  B_SYS_STATS_Functional_c_T *localB, DW_SYS_STATS_Functional_f_T *localDW)
{
  uint8_T rtb_Reservoir_Volume_e;
  uint8_T tmp;

  /* Switch: '<S4>/Reservoir_Volume' incorporates:
   *  Constant: '<S4>/Constant'
   *  Product: '<S4>/Divide'
   *  Sum: '<S4>/Subtract'
   *  Switch: '<S4>/Reservoir_Empty'
   */
//     printf("\n\r1: %d %d %d %d %d\n\r",rty_SYS_STAT_OUT->Reservoir_Empty,rtb_Reservoir_Volume_e,
//     	rtu_CONST_IN->Empty_Reservoir,rtu_CONFIG_IN->Reservoir_Volume,rtu_SENSOR_IN->Flow_Rate);
  if (rtu_TLM_MODE_IN->System_On) {
    rtb_Reservoir_Volume_e = (uint8_T)(rtu_CONFIG_IN->Reservoir_Volume -
      rtu_SENSOR_IN->Flow_Rate);

    /* Switch: '<S4>/if then ' incorporates:
     *  Product: '<S4>/Divide'
     *  RelationalOperator: '<S4>/Relational Operator'
     *  Sum: '<S4>/Subtract'
     */
//     printf("2: %d %d %d\n\r",rty_SYS_STAT_OUT->Reservoir_Empty,rtb_Reservoir_Volume_e,rtu_CONST_IN->Empty_Reservoir);
    rty_SYS_STAT_OUT->Reservoir_Empty = (rtb_Reservoir_Volume_e <
      rtu_CONST_IN->Empty_Reservoir);
  } else {
    rtb_Reservoir_Volume_e = 0U;

    /* Switch: '<S4>/if then ' incorporates:
     *  Constant: '<S4>/Constant'
     *  Constant: '<S4>/Constant16'
     */
    rty_SYS_STAT_OUT->Reservoir_Empty = FALSE;
  }
//     printf("3: %d %d %d\n\r",rty_SYS_STAT_OUT->Reservoir_Empty,rtb_Reservoir_Volume_e,rtu_CONST_IN->Empty_Reservoir);

  /* End of Switch: '<S4>/Reservoir_Volume' */

  /* Switch: '<S5>/if then 4 ' incorporates:
   *  Constant: '<S5>/Constant8'
   *  Logic: '<S5>/Logical Operator3'
   *  UnitDelay: '<S5>/Unit Delay'
   */
  if (!rtu_IM_IN->New_Infusion) {
    tmp = localDW->UnitDelay_DSTATE;
  } else {
    tmp = 0U;
  }

  /* End of Switch: '<S5>/if then 4 ' */

  /* Sum: '<S5>/Subtract1' incorporates:
   *  Product: '<S5>/Divide1'
   */
  localB->Subtract1 = (uint8_T)((uint32_T)tmp + rtu_SENSOR_IN->Flow_Rate);
//     printf("10: %d %d %d %d\n\r",localB->Subtract1,tmp,rtu_SENSOR_IN->Flow_Rate,localDW->UnitDelay_DSTATE);

  /* Switch: '<S3>/Total_Volume_Infused2' incorporates:
   *  Constant: '<S3>/Constant20'
   *  Constant: '<S3>/Constant21'
   *  Switch: '<S2>/In_Therapy'
   */
  if (rtu_TLM_MODE_IN->System_On) {
    rty_SYS_STAT_OUT->Log_Message_ID = 8U;

    /* Switch: '<S2>/if then6' incorporates:
     *  Constant: '<S2>/Constant5'
     *  Constant: '<S3>/Constant21'
     *  RelationalOperator: '<S2>/Relational Operator1'
     */
    rty_SYS_STAT_OUT->In_Therapy = (rtu_IM_IN->Current_System_Mode > 1);
  } else {
    rty_SYS_STAT_OUT->Log_Message_ID = 0U;

    /* Switch: '<S2>/if then6' incorporates:
     *  Constant: '<S2>/Constant17'
     *  Constant: '<S3>/Constant20'
     */
    rty_SYS_STAT_OUT->In_Therapy = FALSE;
  }

  /* End of Switch: '<S3>/Total_Volume_Infused2' */

  /* BusCreator: '<Root>/BusConversion_InsertedFor_SYS_STAT_OUT_at_inport_0' */
  rty_SYS_STAT_OUT->Reservoir_Volume = rtb_Reservoir_Volume_e;

  /* Switch: '<S5>/Total_Volume_Infused' */
  if (rtu_TLM_MODE_IN->System_On) {
    /* BusCreator: '<Root>/BusConversion_InsertedFor_SYS_STAT_OUT_at_inport_0' */
    rty_SYS_STAT_OUT->Volume_Infused = localB->Subtract1;
  } else {
    /* BusCreator: '<Root>/BusConversion_InsertedFor_SYS_STAT_OUT_at_inport_0' incorporates:
     *  Constant: '<S5>/Constant9'
     */
    rty_SYS_STAT_OUT->Volume_Infused = 0U;
  }

  /* End of Switch: '<S5>/Total_Volume_Infused' */
}

/* Update for referenced model: 'SYS_STATS_Functional' */
void SYS_STATS_Functional_Update(B_SYS_STATS_Functional_c_T *localB,
  DW_SYS_STATS_Functional_f_T *localDW)
{
  /* Update for UnitDelay: '<S5>/Unit Delay' */
  localDW->UnitDelay_DSTATE = localB->Subtract1;
}

/* Model initialize function */
void SYS_STATS_Functional_initialize(const char_T **rt_errorStatus,
  RT_MODEL_SYS_STATS_Functional_T *const SYS_STATS_Functional_M,
  B_SYS_STATS_Functional_c_T *localB, DW_SYS_STATS_Functional_f_T *localDW)
{
  /* Registration code */

  /* initialize error status */
  rtmSetErrorStatusPointer(SYS_STATS_Functional_M, rt_errorStatus);

  /* block I/O */
  (void) memset(((void *) localB), 0,
                sizeof(B_SYS_STATS_Functional_c_T));

  /* states (dwork) */
  (void) memset((void *)localDW, 0,
                sizeof(DW_SYS_STATS_Functional_f_T));
}
