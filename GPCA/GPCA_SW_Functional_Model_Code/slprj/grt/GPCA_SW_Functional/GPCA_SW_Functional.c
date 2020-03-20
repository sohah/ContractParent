/*
 * GPCA_SW_Functional.c
 *
 * Code generation for model "GPCA_SW_Functional".
 *
 * Model version              : 1.1249
 * Simulink Coder version : 8.4 (R2013a) 13-Feb-2013
 * C source code generated on : Thu Sep 12 09:51:01 2013
 *
 * Target selection: grt.tlc
 * Note: GRT includes extra infrastructure and instrumentation for prototyping
 * Embedded hardware selection: 32-bit Generic
 * Code generation objective: Debugging
 * Validation result: Not run
 */
#include "GPCA_SW_Functional.h"
#include "GPCA_SW_Functional_private.h"
#include "../GPCA_SW_Logical_Architecture/GPCA_SW_Logical_Architecture.h"
#include "../../../GPCA_SW_Functional_grt_rtw/rtwtypes.h"

const GPCA_SW_Outputs GPCA_SW_Functional_rtZGPCA_SW_Outputs = {
  FALSE,                               /* Request_Confirm_Stop */
  0U,                                  /* Log */
  0U,                                  /* Current_System_Mode */
  0U,                                  /* Actual_Infusion_Duration */
  0U,                                  /* Commanded_Flow_Rate */
  0U,                                  /* Volume_Infused */
  0U,                                  /* Reservoir_Volume */
  0U,                                  /* Is_Audio_Disabled */
  0U,                                  /* Notification_Message */
  0U,                                  /* Audio_Notification_Command */
  0U,                                  /* Patient_ID */
  0U,                                  /* Drug_Name */
  0U,                                  /* Drug_Concentration */
  0U,                                  /* Infusion_Total_Duration */
  0U,                                  /* VTBI_Total */
  0U,                                  /* Flow_Rate_Basal */
  0U,                                  /* Flow_Rate_Intermittent_Bolus */
  0U,                                  /* Duration_Intermittent_Bolus */
  0U,                                  /* Interval_Intermittent_Bolus */
  0U,                                  /* Flow_Rate_Patient_Bolus */
  0U,                                  /* Duration_Patient_Bolus */
  0U,                                  /* Lockout_Period_Patient_Bolus */
  0U,                                  /* Max_Number_of_Patient_Bolus */
  0U,                                  /* Flow_Rate_KVO */
  0U,                                  /* Entered_Reservoir_Volume */
  0U,                                  /* Configured */
  0U,                                  /* Error_Message_ID */
  FALSE,                               /* Request_Config_Type */
  FALSE,                               /* Request_Confirm_Infusion_Initiate */
  FALSE,                               /* Request_Patient_Drug_Info */
  FALSE                                /* Request_Infusion_Info */
} ;                                    /* GPCA_SW_Outputs ground */

/* Block signals (auto storage) */
B_GPCA_SW_Functional_T GPCA_SW_Functional_B;

/* Block states (auto storage) */
DW_GPCA_SW_Functional_T GPCA_SW_Functional_DW;

/* External inputs (root inport signals with auto storage) */
ExtU_GPCA_SW_Functional_T GPCA_SW_Functional_U;

/* External outputs (root outports fed by signals with auto storage) */
ExtY_GPCA_SW_Functional_T GPCA_SW_Functional_Y;

/* Real-time model */
RT_MODEL_GPCA_SW_Functional_T GPCA_SW_Functional_M_;
RT_MODEL_GPCA_SW_Functional_T *const GPCA_SW_Functional_M =
  &GPCA_SW_Functional_M_;

/* Model step function */
void GPCA_SW_Functional_step(void)
{
  /* local block i/o variables */
  Device_Sensor_Inputs rtb_BusConversion_InsertedFor_GPCASOFTWARE_at_inpo;
  Device_Configuration_Inputs rtb_BusConversion_InsertedFor_GPCASOFTWARE_at_in_b;
  Operator_Commands rtb_BusConversion_InsertedFor_GPCASOFTWARE_at_in_i;
  Drug_Database_Inputs rtb_BusConversion_InsertedFor_GPCASOFTWARE_at_in_m;
  Prescription_Inputs rtb_BusConversion_InsertedFor_GPCASOFTWARE_at_in_c;
  Patient_Inputs rtb_BusConversion_InsertedFor_GPCASOFTWARE_at_i_bo;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_GPCA SOFTWARE_at_inport_0' incorporates:
   *  Inport: '<Root>/SENSOR_IN'
   */
  rtb_BusConversion_InsertedFor_GPCASOFTWARE_at_inpo =
    GPCA_SW_Functional_U.SENSOR_IN;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_GPCA SOFTWARE_at_inport_1' incorporates:
   *  Inport: '<Root>/CONST_IN'
   */
  rtb_BusConversion_InsertedFor_GPCASOFTWARE_at_in_b =
    GPCA_SW_Functional_U.CONST_IN;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_GPCA SOFTWARE_at_inport_2' incorporates:
   *  Inport: '<Root>/OP_CMD_IN'
   */
  rtb_BusConversion_InsertedFor_GPCASOFTWARE_at_in_i =
    GPCA_SW_Functional_U.OP_CMD_IN;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_GPCA SOFTWARE_at_inport_3' incorporates:
   *  Inport: '<Root>/DB_IN'
   */
  rtb_BusConversion_InsertedFor_GPCASOFTWARE_at_in_m =
    GPCA_SW_Functional_U.DB_IN;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_GPCA SOFTWARE_at_inport_4' incorporates:
   *  Inport: '<Root>/PRES_IN'
   */
  rtb_BusConversion_InsertedFor_GPCASOFTWARE_at_in_c =
    GPCA_SW_Functional_U.PRES_IN;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_GPCA SOFTWARE_at_inport_5' incorporates:
   *  Inport: '<Root>/PATIENT_IN'
   */
  rtb_BusConversion_InsertedFor_GPCASOFTWARE_at_i_bo =
    GPCA_SW_Functional_U.PATIENT_IN;

  /* ModelReference: '<Root>/GPCA SOFTWARE' */
  GPCA_SW_Logical_Architecture
    (&rtb_BusConversion_InsertedFor_GPCASOFTWARE_at_inpo,
     &rtb_BusConversion_InsertedFor_GPCASOFTWARE_at_in_b,
     &rtb_BusConversion_InsertedFor_GPCASOFTWARE_at_in_i,
     &rtb_BusConversion_InsertedFor_GPCASOFTWARE_at_in_m,
     &rtb_BusConversion_InsertedFor_GPCASOFTWARE_at_in_c,
     &rtb_BusConversion_InsertedFor_GPCASOFTWARE_at_i_bo,
     &GPCA_SW_Functional_B.GPCASOFTWARE,
     &(GPCA_SW_Functional_DW.GPCASOFTWARE_DWORK1.rtb),
     &(GPCA_SW_Functional_DW.GPCASOFTWARE_DWORK1.rtdw));

  /* Outport: '<Root>/GPCA_SW_OUT' incorporates:
   *  BusCreator: '<Root>/BusConversion_InsertedFor_GPCA_SW_OUT_at_inport_0'
   */
  GPCA_SW_Functional_Y.GPCA_SW_OUT = GPCA_SW_Functional_B.GPCASOFTWARE;

  /* Update for ModelReference: '<Root>/GPCA SOFTWARE' */
  GPCA_SW_Logical_Architecture_Update
    (&(GPCA_SW_Functional_DW.GPCASOFTWARE_DWORK1.rtb),
     &(GPCA_SW_Functional_DW.GPCASOFTWARE_DWORK1.rtdw));
}

/* Model initialize function */
void GPCA_SW_Functional_initialize(void)
{
  /* Registration code */

  /* initialize error status */
  rtmSetErrorStatus(GPCA_SW_Functional_M, (NULL));

  /* block I/O */
  (void) memset(((void *) &GPCA_SW_Functional_B), 0,
                sizeof(B_GPCA_SW_Functional_T));

  /* states (dwork) */
  (void) memset((void *)&GPCA_SW_Functional_DW, 0,
                sizeof(DW_GPCA_SW_Functional_T));

  /* external inputs */
  (void) memset((void *)&GPCA_SW_Functional_U, 0,
                sizeof(ExtU_GPCA_SW_Functional_T));

  /* external outputs */
  GPCA_SW_Functional_Y.GPCA_SW_OUT = GPCA_SW_Functional_rtZGPCA_SW_Outputs;

  /* Model Initialize fcn for ModelReference Block: '<Root>/GPCA SOFTWARE' */
  GPCA_SW_Logical_Architecture_initialize(rtmGetErrorStatusPointer
    (GPCA_SW_Functional_M), &(GPCA_SW_Functional_DW.GPCASOFTWARE_DWORK1.rtm),
    &(GPCA_SW_Functional_DW.GPCASOFTWARE_DWORK1.rtb),
    &(GPCA_SW_Functional_DW.GPCASOFTWARE_DWORK1.rtdw));

  /* InitializeConditions for ModelReference: '<Root>/GPCA SOFTWARE' */
  GPCA_SW_Logical_Architecture_Init
    (&(GPCA_SW_Functional_DW.GPCASOFTWARE_DWORK1.rtdw));
}

/* Model terminate function */
void GPCA_SW_Functional_terminate(void)
{
  /* (no terminate code required) */
}
