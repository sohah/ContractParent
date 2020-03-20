/*
 * Code generation for system model 'GPCA_SW_Logical_Architecture'
 *
 * Model                      : GPCA_SW_Logical_Architecture
 * Model version              : 1.1265
 * Simulink Coder version : 8.4 (R2013a) 13-Feb-2013
 * C source code generated on : Thu Sep 12 09:50:47 2013
 *
 * Note that the functions contained in this file are part of a Simulink
 * model, and are not self-contained algorithms.
 */

#include "GPCA_SW_Logical_Architecture.h"
#include "GPCA_SW_Logical_Architecture_private.h"
#include "../ALARM_Functional/ALARM_Functional.h"
#include "../SYS_STATS_Functional/SYS_STATS_Functional.h"
#include "../CONFIG_Functional/CONFIG_Functional.h"
#include "../INFUSION_MGR_Functional/INFUSION_MGR_Functional.h"
#include "../Logging_Functional/Logging_Functional.h"
#include "../System_Monitor_Functional/System_Monitor_Functional.h"
#include "../Top_Level_Mode_Functional/Top_Level_Mode_Functional.h"

/* Initial conditions for referenced model: 'GPCA_SW_Logical_Architecture' */
void GPCA_SW_Logical_Architecture_Init(DW_GPCA_SW_Logical_Architecture_f_T
  *localDW)
{
  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay' */
  localDW->UnitDelay_1_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay' */
  localDW->UnitDelay_2_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay' */
  localDW->UnitDelay_3_DSTATE = FALSE;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay' */
  localDW->UnitDelay_4_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay' */
  localDW->UnitDelay_5_DSTATE = 0U;

  /* InitializeConditions for ModelReference: '<Root>/TOP_LEVEL_MODE' */
  Top_Level_Mode_Functional_Init(&(localDW->TOP_LEVEL_MODE_DWORK1.rtb),
    &(localDW->TOP_LEVEL_MODE_DWORK1.rtdw));

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay2' */
  localDW->UnitDelay2_1_DSTATE = FALSE;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay3' */
  localDW->UnitDelay3_1_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay3' */
  localDW->UnitDelay3_2_DSTATE = FALSE;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_1_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_2_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_3_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_4_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_5_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_6_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_7_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_8_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_9_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_10_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_11_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_12_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_13_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_14_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_15_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_16_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_17_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_18_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_19_DSTATE = FALSE;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_20_DSTATE = FALSE;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_21_DSTATE = FALSE;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_22_DSTATE = FALSE;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_23_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_24_DSTATE = 0U;

  /* InitializeConditions for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_25_DSTATE = 0U;

  /* InitializeConditions for ModelReference: '<Root>/SYSTEM_STATUS' */
  SYS_STATS_Functional_Init(&(localDW->SYSTEM_STATUS_DWORK1.rtdw));

  /* InitializeConditions for ModelReference: '<Root>/ALARM' */
  ALARM_Functional_Init(&(localDW->ALARM_DWORK1.rtb),
                        &(localDW->ALARM_DWORK1.rtdw));

  /* InitializeConditions for ModelReference: '<Root>/CONFIGURATION' */
  CONFIG_Functional_Init(&(localDW->CONFIGURATION_DWORK1.rtb),
    &(localDW->CONFIGURATION_DWORK1.rtdw));

  /* InitializeConditions for ModelReference: '<Root>/INFUSION_MANAGER' */
  INFUSION_MGR_Functional_Init(&(localDW->INFUSION_MANAGER_DWORK1.rtb),
    &(localDW->INFUSION_MANAGER_DWORK1.rtdw));

  /* InitializeConditions for ModelReference: '<Root>/LOGGING' */
  Logging_Functional_Init(&(localDW->LOGGING_DWORK1.rtb),
    &(localDW->LOGGING_DWORK1.rtdw));

  /* InitializeConditions for ModelReference: '<Root>/SYSTEM_MONITOR' */
  System_Monitor_Functional_Init(&(localDW->SYSTEM_MONITOR_DWORK1.rtb),
    &(localDW->SYSTEM_MONITOR_DWORK1.rtdw));
}

/* Outputs for referenced model: 'GPCA_SW_Logical_Architecture' */
void GPCA_SW_Logical_Architecture(const Device_Sensor_Inputs *rtu_SENSOR_IN,
  const Device_Configuration_Inputs *rtu_CONST_IN, const Operator_Commands
  *rtu_OP_CMD_IN, const Drug_Database_Inputs *rtu_DB_IN, const
  Prescription_Inputs *rtu_PRES_IN, const Patient_Inputs *rtu_PATIENT_IN,
  GPCA_SW_Outputs *rty_GPCA_SW_OUT, B_GPCA_SW_Logical_Architecture_c_T *localB,
  DW_GPCA_SW_Logical_Architecture_f_T *localDW)
{
  /* local block i/o variables */
  Config_Outputs rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_;
  Config_Outputs rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_;
  Device_Sensor_Inputs rtb_BusConversion_InsertedFor_ALARM_at_inport_6_Bu;
  Device_Configuration_Inputs rtb_BusConversion_InsertedFor_CONFIGURATION_at_inp;
  Operator_Commands rtb_BusConversion_InsertedFor_INFUSION_MANAGER_a_l;
  Drug_Database_Inputs rtb_BusConversion_InsertedFor_CONFIGURATION_at_i_n;
  Prescription_Inputs rtb_BusConversion_InsertedFor_CONFIGURATION_at_i_g;
  Patient_Inputs rtb_BusConversion_InsertedFor_INFUSION_MANAGER_a_i;
  Infusion_Manager_Outputs rtb_BusConversion_InsertedFor_LOGGING_at_inport_4_;
  Top_Level_Mode_Outputs rtb_BusConversion_InsertedFor_SYSTEM_MONITOR_at_in;
  Top_Level_Mode_Outputs rtb_BusConversion_InsertedFor_LOGGING_at_inport_0_;
  System_Monitor_Output rtb_BusConversion_InsertedFor_ALARM_at_inport_2_Bu;
  Log_Output rtb_BusConversion_InsertedFor_ALARM_at_inport_3_Bu;
  System_Status_Outputs rtb_SYSTEM_STATUS;
  System_Status_Outputs rtb_BusConversion_InsertedFor_INFUSION_MANAGER_a_d;
  System_Status_Outputs rtb_BusConversion_InsertedFor_LOGGING_at_inport_3_;
  Alarm_Outputs rtb_BusConversion_InsertedFor_LOGGING_at_inport_2_;
  Alarm_Outputs rtb_BusConversion_InsertedFor_INFUSION_MANAGER_a_k;
  uint8_T rtb_Commanded_Flow_Rate;
  uint8_T rtb_Current_System_Mode;
  boolean_T rtb_New_Infusion;
  uint8_T rtb_Log_Message_ID;
  uint8_T rtb_Actual_Infusion_Duration;
  uint8_T rtb_VTBI_Total;
  uint8_T rtb_Flow_Rate_Basal;
  uint8_T rtb_Flow_Rate_Intermittent_Bolus;
  uint8_T rtb_Duration_Intermittent_Bolus;
  uint8_T rtb_Interval_Intermittent_Bolus;
  uint8_T rtb_Flow_Rate_Patient_Bolus;
  uint8_T rtb_Duration_Patient_Bolus;
  uint8_T rtb_Lockout_Period_Patient_Bolus;
  uint8_T rtb_Max_Number_of_Patient_Bolus;
  uint8_T rtb_Flow_Rate_KVO_n;
  uint8_T rtb_Entered_Reservoir_Volume;
  uint8_T rtb_Reservoir_Volume;
  uint8_T rtb_Configured;
  uint8_T rtb_Error_Message_ID;
  boolean_T rtb_Request_Confirm_Infusion_Initiate;
  boolean_T rtb_Request_Patient_Drug_Info;
  boolean_T rtb_Request_Infusion_Info;
  uint8_T rtb_Log_Message_ID_e;
  uint8_T rtb_Config_Timer;
  uint8_T rtb_Config_Mode;

  /* UnitDelay: '<Root>/Unit Delay' */
  rtb_Commanded_Flow_Rate = localDW->UnitDelay_1_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay' */
  rtb_Current_System_Mode = localDW->UnitDelay_2_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay' */
  rtb_New_Infusion = localDW->UnitDelay_3_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay' */
  rtb_Log_Message_ID = localDW->UnitDelay_4_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay' */
  rtb_Actual_Infusion_Duration = localDW->UnitDelay_5_DSTATE;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_ALARM_at_inport_0' incorporates:
   *  UnitDelay: '<Root>/Unit Delay'
   */
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_4_.Commanded_Flow_Rate =
    localDW->UnitDelay_1_DSTATE;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_4_.Current_System_Mode =
    localDW->UnitDelay_2_DSTATE;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_4_.New_Infusion =
    localDW->UnitDelay_3_DSTATE;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_4_.Log_Message_ID =
    localDW->UnitDelay_4_DSTATE;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_4_.Actual_Infusion_Duration =
    localDW->UnitDelay_5_DSTATE;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_TOP_LEVEL_MODE_at_inport_0' */
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_a_l = *rtu_OP_CMD_IN;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_TOP_LEVEL_MODE_at_inport_1' */
  rtb_BusConversion_InsertedFor_CONFIGURATION_at_inp = *rtu_CONST_IN;

  /* ModelReference: '<Root>/TOP_LEVEL_MODE' */
  Top_Level_Mode_Functional(&rtb_BusConversion_InsertedFor_INFUSION_MANAGER_a_l,
    &rtb_BusConversion_InsertedFor_CONFIGURATION_at_inp, &localB->TOP_LEVEL_MODE,
    &(localDW->TOP_LEVEL_MODE_DWORK1.rtb), &(localDW->TOP_LEVEL_MODE_DWORK1.rtdw));

  /* BusCreator: '<Root>/BusConversion_InsertedFor_ALARM_at_inport_1' */
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_0_ = localB->TOP_LEVEL_MODE;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_ALARM_at_inport_2' incorporates:
   *  UnitDelay: '<Root>/Unit Delay2'
   */
  rtb_BusConversion_InsertedFor_ALARM_at_inport_2_Bu.System_Monitor_Failed =
    localDW->UnitDelay2_1_DSTATE;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_ALARM_at_inport_3' incorporates:
   *  UnitDelay: '<Root>/Unit Delay3'
   */
  rtb_BusConversion_InsertedFor_ALARM_at_inport_3_Bu.Log =
    localDW->UnitDelay3_1_DSTATE;
  rtb_BusConversion_InsertedFor_ALARM_at_inport_3_Bu.Logging_Failed =
    localDW->UnitDelay3_2_DSTATE;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_ALARM_at_inport_4' */
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_a_l = *rtu_OP_CMD_IN;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_ALARM_at_inport_5' */
  rtb_BusConversion_InsertedFor_CONFIGURATION_at_i_n = *rtu_DB_IN;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_ALARM_at_inport_6' */
  rtb_BusConversion_InsertedFor_ALARM_at_inport_6_Bu = *rtu_SENSOR_IN;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_ALARM_at_inport_7' */
  rtb_BusConversion_InsertedFor_CONFIGURATION_at_inp = *rtu_CONST_IN;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_0' */
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inpor_i.Commanded_Flow_Rate
    = rtb_Commanded_Flow_Rate;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inpor_i.Current_System_Mode
    = rtb_Current_System_Mode;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inpor_i.New_Infusion =
    rtb_New_Infusion;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inpor_i.Log_Message_ID =
    rtb_Log_Message_ID;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inpor_i.Actual_Infusion_Duration
    = rtb_Actual_Infusion_Duration;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_1' */
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inpor_d =
    localB->TOP_LEVEL_MODE;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_2' */
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inpor_a = *rtu_SENSOR_IN;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_3' */
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inpor_l = *rtu_CONST_IN;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Commanded_Flow_Rate = localDW->UnitDelay1_1_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Current_System_Mode = localDW->UnitDelay1_2_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Log_Message_ID = localDW->UnitDelay1_3_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Actual_Infusion_Duration = localDW->UnitDelay1_4_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_VTBI_Total = localDW->UnitDelay1_5_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Flow_Rate_Basal = localDW->UnitDelay1_6_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Flow_Rate_Intermittent_Bolus = localDW->UnitDelay1_7_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Duration_Intermittent_Bolus = localDW->UnitDelay1_8_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Interval_Intermittent_Bolus = localDW->UnitDelay1_9_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Flow_Rate_Patient_Bolus = localDW->UnitDelay1_10_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Duration_Patient_Bolus = localDW->UnitDelay1_11_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Lockout_Period_Patient_Bolus = localDW->UnitDelay1_12_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Max_Number_of_Patient_Bolus = localDW->UnitDelay1_13_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Flow_Rate_KVO_n = localDW->UnitDelay1_14_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Entered_Reservoir_Volume = localDW->UnitDelay1_15_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Reservoir_Volume = localDW->UnitDelay1_16_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Configured = localDW->UnitDelay1_17_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Error_Message_ID = localDW->UnitDelay1_18_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_New_Infusion = localDW->UnitDelay1_19_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Request_Confirm_Infusion_Initiate = localDW->UnitDelay1_20_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Request_Patient_Drug_Info = localDW->UnitDelay1_21_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Request_Infusion_Info = localDW->UnitDelay1_22_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Log_Message_ID_e = localDW->UnitDelay1_23_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Config_Timer = localDW->UnitDelay1_24_DSTATE;

  /* UnitDelay: '<Root>/Unit Delay1' */
  rtb_Config_Mode = localDW->UnitDelay1_25_DSTATE;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_4' incorporates:
   *  UnitDelay: '<Root>/Unit Delay1'
   */
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Patient_ID =
    localDW->UnitDelay1_1_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Drug_Name =
    localDW->UnitDelay1_2_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Drug_Concentration =
    localDW->UnitDelay1_3_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Infusion_Total_Duration
    = localDW->UnitDelay1_4_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.VTBI_Total =
    localDW->UnitDelay1_5_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Flow_Rate_Basal =
    localDW->UnitDelay1_6_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Flow_Rate_Intermittent_Bolus
    = localDW->UnitDelay1_7_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Duration_Intermittent_Bolus
    = localDW->UnitDelay1_8_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Interval_Intermittent_Bolus
    = localDW->UnitDelay1_9_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Flow_Rate_Patient_Bolus
    = localDW->UnitDelay1_10_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Duration_Patient_Bolus
    = localDW->UnitDelay1_11_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Lockout_Period_Patient_Bolus
    = localDW->UnitDelay1_12_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Max_Number_of_Patient_Bolus
    = localDW->UnitDelay1_13_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Flow_Rate_KVO =
    localDW->UnitDelay1_14_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Entered_Reservoir_Volume
    = localDW->UnitDelay1_15_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Reservoir_Volume =
    localDW->UnitDelay1_16_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Configured =
    localDW->UnitDelay1_17_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Error_Message_ID =
    localDW->UnitDelay1_18_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Request_Config_Type
    = localDW->UnitDelay1_19_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Request_Confirm_Infusion_Initiate
    = localDW->UnitDelay1_20_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Request_Patient_Drug_Info
    = localDW->UnitDelay1_21_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Request_Infusion_Info
    = localDW->UnitDelay1_22_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Log_Message_ID =
    localDW->UnitDelay1_23_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Config_Timer =
    localDW->UnitDelay1_24_DSTATE;
  localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_.Config_Mode =
    localDW->UnitDelay1_25_DSTATE;

  /* ModelReference: '<Root>/SYSTEM_STATUS' */
  SYS_STATS_Functional
    (&localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inpor_i,
     &localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inpor_d,
     &localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inpor_a,
     &localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inpor_l,
     &localB->BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_,
     &rtb_SYSTEM_STATUS, &(localDW->SYSTEM_STATUS_DWORK1.rtb),
     &(localDW->SYSTEM_STATUS_DWORK1.rtdw));

  /* BusCreator: '<Root>/BusConversion_InsertedFor_ALARM_at_inport_8' */
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_3_ = rtb_SYSTEM_STATUS;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_ALARM_at_inport_9' */
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Patient_ID =
    rtb_Commanded_Flow_Rate;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Drug_Name =
    rtb_Current_System_Mode;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Drug_Concentration =
    rtb_Log_Message_ID;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Infusion_Total_Duration =
    rtb_Actual_Infusion_Duration;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.VTBI_Total = rtb_VTBI_Total;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Flow_Rate_Basal =
    rtb_Flow_Rate_Basal;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Flow_Rate_Intermittent_Bolus
    = rtb_Flow_Rate_Intermittent_Bolus;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Duration_Intermittent_Bolus
    = rtb_Duration_Intermittent_Bolus;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Interval_Intermittent_Bolus
    = rtb_Interval_Intermittent_Bolus;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Flow_Rate_Patient_Bolus =
    rtb_Flow_Rate_Patient_Bolus;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Duration_Patient_Bolus =
    rtb_Duration_Patient_Bolus;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Lockout_Period_Patient_Bolus
    = rtb_Lockout_Period_Patient_Bolus;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Max_Number_of_Patient_Bolus
    = rtb_Max_Number_of_Patient_Bolus;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Flow_Rate_KVO =
    rtb_Flow_Rate_KVO_n;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Entered_Reservoir_Volume =
    rtb_Entered_Reservoir_Volume;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Reservoir_Volume =
    rtb_Reservoir_Volume;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Configured = rtb_Configured;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Error_Message_ID =
    rtb_Error_Message_ID;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Request_Config_Type =
    rtb_New_Infusion;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Request_Confirm_Infusion_Initiate
    = rtb_Request_Confirm_Infusion_Initiate;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Request_Patient_Drug_Info =
    rtb_Request_Patient_Drug_Info;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Request_Infusion_Info =
    rtb_Request_Infusion_Info;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Log_Message_ID =
    rtb_Log_Message_ID_e;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Config_Timer =
    rtb_Config_Timer;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Config_Mode =
    rtb_Config_Mode;

  /* ModelReference: '<Root>/ALARM' */
  ALARM_Functional(&rtb_BusConversion_InsertedFor_LOGGING_at_inport_4_,
                   &rtb_BusConversion_InsertedFor_LOGGING_at_inport_0_,
                   &rtb_BusConversion_InsertedFor_ALARM_at_inport_2_Bu,
                   &rtb_BusConversion_InsertedFor_ALARM_at_inport_3_Bu,
                   &rtb_BusConversion_InsertedFor_INFUSION_MANAGER_a_l,
                   &rtb_BusConversion_InsertedFor_CONFIGURATION_at_i_n,
                   &rtb_BusConversion_InsertedFor_ALARM_at_inport_6_Bu,
                   &rtb_BusConversion_InsertedFor_CONFIGURATION_at_inp,
                   &rtb_BusConversion_InsertedFor_LOGGING_at_inport_3_,
                   &rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_,
                   &localB->ALARM, &(localDW->ALARM_DWORK1.rtb),
                   &(localDW->ALARM_DWORK1.rtdw));

  /* BusCreator: '<Root>/BusConversion_InsertedFor_CONFIGURATION_at_inport_0' */
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_0_ = localB->TOP_LEVEL_MODE;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_CONFIGURATION_at_inport_1' */
  rtb_BusConversion_InsertedFor_CONFIGURATION_at_i_g = *rtu_PRES_IN;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_CONFIGURATION_at_inport_2' */
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_a_l = *rtu_OP_CMD_IN;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_CONFIGURATION_at_inport_3' */
  rtb_BusConversion_InsertedFor_CONFIGURATION_at_i_n = *rtu_DB_IN;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_CONFIGURATION_at_inport_4' */
  rtb_BusConversion_InsertedFor_CONFIGURATION_at_inp = *rtu_CONST_IN;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_CONFIGURATION_at_inport_5' */
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_3_ = rtb_SYSTEM_STATUS;

  /* ModelReference: '<Root>/CONFIGURATION' */
  CONFIG_Functional(&rtb_BusConversion_InsertedFor_LOGGING_at_inport_0_,
                    &rtb_BusConversion_InsertedFor_CONFIGURATION_at_i_g,
                    &rtb_BusConversion_InsertedFor_INFUSION_MANAGER_a_l,
                    &rtb_BusConversion_InsertedFor_CONFIGURATION_at_i_n,
                    &rtb_BusConversion_InsertedFor_CONFIGURATION_at_inp,
                    &rtb_BusConversion_InsertedFor_LOGGING_at_inport_3_,
                    &localB->CONFIGURATION, &(localDW->CONFIGURATION_DWORK1.rtb),
                    &(localDW->CONFIGURATION_DWORK1.rtdw));

  /* BusSelector: '<Root>/BusConversion_InsertedFor_CONFIGURATION_at_outport_0' */
  localB->Patient_ID = localB->CONFIGURATION.Patient_ID;
  localB->Drug_Name = localB->CONFIGURATION.Drug_Name;
  localB->Drug_Concentration = localB->CONFIGURATION.Drug_Concentration;
  localB->Infusion_Total_Duration =
    localB->CONFIGURATION.Infusion_Total_Duration;
  localB->VTBI_Total = localB->CONFIGURATION.VTBI_Total;
  localB->Flow_Rate_Basal = localB->CONFIGURATION.Flow_Rate_Basal;
  localB->Flow_Rate_Intermittent_Bolus =
    localB->CONFIGURATION.Flow_Rate_Intermittent_Bolus;
  localB->Duration_Intermittent_Bolus =
    localB->CONFIGURATION.Duration_Intermittent_Bolus;
  localB->Interval_Intermittent_Bolus =
    localB->CONFIGURATION.Interval_Intermittent_Bolus;
  localB->Flow_Rate_Patient_Bolus =
    localB->CONFIGURATION.Flow_Rate_Patient_Bolus;
  localB->Duration_Patient_Bolus = localB->CONFIGURATION.Duration_Patient_Bolus;
  localB->Lockout_Period_Patient_Bolus =
    localB->CONFIGURATION.Lockout_Period_Patient_Bolus;
  localB->Max_Number_of_Patient_Bolus =
    localB->CONFIGURATION.Max_Number_of_Patient_Bolus;
  localB->Flow_Rate_KVO = localB->CONFIGURATION.Flow_Rate_KVO;
  localB->Entered_Reservoir_Volume =
    localB->CONFIGURATION.Entered_Reservoir_Volume;
  localB->Reservoir_Volume = localB->CONFIGURATION.Reservoir_Volume;
  localB->Configured = localB->CONFIGURATION.Configured;
  localB->Error_Message_ID = localB->CONFIGURATION.Error_Message_ID;
  localB->Request_Config_Type = localB->CONFIGURATION.Request_Config_Type;
  localB->Request_Confirm_Infusion_Initiate =
    localB->CONFIGURATION.Request_Confirm_Infusion_Initiate;
  localB->Request_Patient_Drug_Info =
    localB->CONFIGURATION.Request_Patient_Drug_Info;
  localB->Request_Infusion_Info = localB->CONFIGURATION.Request_Infusion_Info;
  localB->Log_Message_ID = localB->CONFIGURATION.Log_Message_ID;
  localB->Config_Timer = localB->CONFIGURATION.Config_Timer;
  localB->Config_Mode = localB->CONFIGURATION.Config_Mode;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_LOGGING_at_inport_0' */
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_0_ = localB->TOP_LEVEL_MODE;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_LOGGING_at_inport_1' */
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Patient_ID =
    localB->Patient_ID;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Drug_Name =
    localB->Drug_Name;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Drug_Concentration =
    localB->Drug_Concentration;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Infusion_Total_Duration =
    localB->Infusion_Total_Duration;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.VTBI_Total =
    localB->VTBI_Total;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Flow_Rate_Basal =
    localB->Flow_Rate_Basal;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Flow_Rate_Intermittent_Bolus
    = localB->Flow_Rate_Intermittent_Bolus;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Duration_Intermittent_Bolus
    = localB->Duration_Intermittent_Bolus;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Interval_Intermittent_Bolus
    = localB->Interval_Intermittent_Bolus;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Flow_Rate_Patient_Bolus =
    localB->Flow_Rate_Patient_Bolus;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Duration_Patient_Bolus =
    localB->Duration_Patient_Bolus;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Lockout_Period_Patient_Bolus
    = localB->Lockout_Period_Patient_Bolus;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Max_Number_of_Patient_Bolus
    = localB->Max_Number_of_Patient_Bolus;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Flow_Rate_KVO =
    localB->Flow_Rate_KVO;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Entered_Reservoir_Volume =
    localB->Entered_Reservoir_Volume;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Reservoir_Volume =
    localB->Reservoir_Volume;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Configured =
    localB->Configured;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Error_Message_ID =
    localB->Error_Message_ID;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Request_Config_Type =
    localB->Request_Config_Type;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Request_Confirm_Infusion_Initiate
    = localB->Request_Confirm_Infusion_Initiate;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Request_Patient_Drug_Info =
    localB->Request_Patient_Drug_Info;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Request_Infusion_Info =
    localB->Request_Infusion_Info;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Log_Message_ID =
    localB->Log_Message_ID;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Config_Timer =
    localB->Config_Timer;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_.Config_Mode =
    localB->Config_Mode;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_LOGGING_at_inport_2' */
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_2_ = localB->ALARM;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_LOGGING_at_inport_3' */
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_3_ = rtb_SYSTEM_STATUS;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_INFUSION_MANAGER_at_inport_0' */
  rtb_BusConversion_InsertedFor_SYSTEM_MONITOR_at_in = localB->TOP_LEVEL_MODE;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_INFUSION_MANAGER_at_inport_1' */
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_a_l = *rtu_OP_CMD_IN;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_INFUSION_MANAGER_at_inport_2' */
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_a_i = *rtu_PATIENT_IN;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_INFUSION_MANAGER_at_inport_3' */
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Patient_ID =
    localB->Patient_ID;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Drug_Name =
    localB->Drug_Name;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Drug_Concentration =
    localB->Drug_Concentration;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Infusion_Total_Duration =
    localB->Infusion_Total_Duration;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.VTBI_Total =
    localB->VTBI_Total;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Flow_Rate_Basal =
    localB->Flow_Rate_Basal;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Flow_Rate_Intermittent_Bolus
    = localB->Flow_Rate_Intermittent_Bolus;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Duration_Intermittent_Bolus
    = localB->Duration_Intermittent_Bolus;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Interval_Intermittent_Bolus
    = localB->Interval_Intermittent_Bolus;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Flow_Rate_Patient_Bolus =
    localB->Flow_Rate_Patient_Bolus;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Duration_Patient_Bolus =
    localB->Duration_Patient_Bolus;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Lockout_Period_Patient_Bolus
    = localB->Lockout_Period_Patient_Bolus;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Max_Number_of_Patient_Bolus
    = localB->Max_Number_of_Patient_Bolus;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Flow_Rate_KVO =
    localB->Flow_Rate_KVO;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Entered_Reservoir_Volume =
    localB->Entered_Reservoir_Volume;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Reservoir_Volume =
    localB->Reservoir_Volume;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Configured =
    localB->Configured;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Error_Message_ID =
    localB->Error_Message_ID;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Request_Config_Type =
    localB->Request_Config_Type;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Request_Confirm_Infusion_Initiate
    = localB->Request_Confirm_Infusion_Initiate;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Request_Patient_Drug_Info =
    localB->Request_Patient_Drug_Info;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Request_Infusion_Info =
    localB->Request_Infusion_Info;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Log_Message_ID =
    localB->Log_Message_ID;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Config_Timer =
    localB->Config_Timer;
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_.Config_Mode =
    localB->Config_Mode;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_INFUSION_MANAGER_at_inport_4' */
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_a_k = localB->ALARM;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_INFUSION_MANAGER_at_inport_5' */
  rtb_BusConversion_InsertedFor_INFUSION_MANAGER_a_d = rtb_SYSTEM_STATUS;

  /* ModelReference: '<Root>/INFUSION_MANAGER' */
  INFUSION_MGR_Functional(&rtb_BusConversion_InsertedFor_SYSTEM_MONITOR_at_in,
    &rtb_BusConversion_InsertedFor_INFUSION_MANAGER_a_l,
    &rtb_BusConversion_InsertedFor_INFUSION_MANAGER_a_i,
    &rtb_BusConversion_InsertedFor_INFUSION_MANAGER_at_,
    &rtb_BusConversion_InsertedFor_INFUSION_MANAGER_a_k,
    &rtb_BusConversion_InsertedFor_INFUSION_MANAGER_a_d,
    &localB->INFUSION_MANAGER, &(localDW->INFUSION_MANAGER_DWORK1.rtb),
    &(localDW->INFUSION_MANAGER_DWORK1.rtdw));

  /* BusSelector: '<Root>/BusConversion_InsertedFor_INFUSION_MANAGER_at_outport_0' */
  localB->Commanded_Flow_Rate = localB->INFUSION_MANAGER.Commanded_Flow_Rate;
  localB->Current_System_Mode = localB->INFUSION_MANAGER.Current_System_Mode;
  localB->New_Infusion = localB->INFUSION_MANAGER.New_Infusion;
  localB->Log_Message_ID_e = localB->INFUSION_MANAGER.Log_Message_ID;
  localB->Actual_Infusion_Duration =
    localB->INFUSION_MANAGER.Actual_Infusion_Duration;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_LOGGING_at_inport_4' */
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_4_.Commanded_Flow_Rate =
    localB->Commanded_Flow_Rate;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_4_.Current_System_Mode =
    localB->Current_System_Mode;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_4_.New_Infusion =
    localB->New_Infusion;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_4_.Log_Message_ID =
    localB->Log_Message_ID_e;
  rtb_BusConversion_InsertedFor_LOGGING_at_inport_4_.Actual_Infusion_Duration =
    localB->Actual_Infusion_Duration;

  /* ModelReference: '<Root>/LOGGING' */
  Logging_Functional(&rtb_BusConversion_InsertedFor_LOGGING_at_inport_0_,
                     &rtb_BusConversion_InsertedFor_LOGGING_at_inport_1_,
                     &rtb_BusConversion_InsertedFor_LOGGING_at_inport_2_,
                     &rtb_BusConversion_InsertedFor_LOGGING_at_inport_3_,
                     &rtb_BusConversion_InsertedFor_LOGGING_at_inport_4_,
                     &localB->LOGGING, &(localDW->LOGGING_DWORK1.rtb),
                     &(localDW->LOGGING_DWORK1.rtdw));

  /* BusSelector: '<Root>/BusConversion_InsertedFor_LOGGING_at_outport_0' */
  localB->Log = localB->LOGGING.Log;
  localB->Logging_Failed = localB->LOGGING.Logging_Failed;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_GPCA_SW_OUT_at_inport_0' */
  rty_GPCA_SW_OUT->Request_Confirm_Stop =
    localB->TOP_LEVEL_MODE.Request_Confirm_Stop;
  rty_GPCA_SW_OUT->Log = localB->Log;
  rty_GPCA_SW_OUT->Current_System_Mode = localB->Current_System_Mode;
  rty_GPCA_SW_OUT->Actual_Infusion_Duration = localB->Actual_Infusion_Duration;
  rty_GPCA_SW_OUT->Commanded_Flow_Rate = localB->Commanded_Flow_Rate;
  rty_GPCA_SW_OUT->Volume_Infused = rtb_SYSTEM_STATUS.Volume_Infused;
  rty_GPCA_SW_OUT->Reservoir_Volume = rtb_SYSTEM_STATUS.Reservoir_Volume;
  rty_GPCA_SW_OUT->Is_Audio_Disabled = localB->ALARM.Is_Audio_Disabled;
  rty_GPCA_SW_OUT->Notification_Message = localB->ALARM.Notification_Message;
  rty_GPCA_SW_OUT->Audio_Notification_Command =
    localB->ALARM.Audio_Notification_Command;
  rty_GPCA_SW_OUT->Patient_ID = localB->Patient_ID;
  rty_GPCA_SW_OUT->Drug_Name = localB->Drug_Name;
  rty_GPCA_SW_OUT->Drug_Concentration = localB->Drug_Concentration;
  rty_GPCA_SW_OUT->Infusion_Total_Duration = localB->Infusion_Total_Duration;
  rty_GPCA_SW_OUT->VTBI_Total = localB->VTBI_Total;
  rty_GPCA_SW_OUT->Flow_Rate_Basal = localB->Flow_Rate_Basal;
  rty_GPCA_SW_OUT->Flow_Rate_Intermittent_Bolus =
    localB->Flow_Rate_Intermittent_Bolus;
  rty_GPCA_SW_OUT->Duration_Intermittent_Bolus =
    localB->Duration_Intermittent_Bolus;
  rty_GPCA_SW_OUT->Interval_Intermittent_Bolus =
    localB->Interval_Intermittent_Bolus;
  rty_GPCA_SW_OUT->Flow_Rate_Patient_Bolus = localB->Flow_Rate_Patient_Bolus;
  rty_GPCA_SW_OUT->Duration_Patient_Bolus = localB->Duration_Patient_Bolus;
  rty_GPCA_SW_OUT->Lockout_Period_Patient_Bolus =
    localB->Lockout_Period_Patient_Bolus;
  rty_GPCA_SW_OUT->Max_Number_of_Patient_Bolus =
    localB->Max_Number_of_Patient_Bolus;
  rty_GPCA_SW_OUT->Flow_Rate_KVO = localB->Flow_Rate_KVO;
  rty_GPCA_SW_OUT->Entered_Reservoir_Volume = localB->Entered_Reservoir_Volume;
  rty_GPCA_SW_OUT->Configured = localB->Configured;
  rty_GPCA_SW_OUT->Error_Message_ID = localB->Error_Message_ID;
  rty_GPCA_SW_OUT->Request_Config_Type = localB->Request_Config_Type;
  rty_GPCA_SW_OUT->Request_Confirm_Infusion_Initiate =
    localB->Request_Confirm_Infusion_Initiate;
  rty_GPCA_SW_OUT->Request_Patient_Drug_Info = localB->Request_Patient_Drug_Info;
  rty_GPCA_SW_OUT->Request_Infusion_Info = localB->Request_Infusion_Info;

  /* BusCreator: '<Root>/BusConversion_InsertedFor_SYSTEM_MONITOR_at_inport_0' */
  rtb_BusConversion_InsertedFor_SYSTEM_MONITOR_at_in = localB->TOP_LEVEL_MODE;

  /* ModelReference: '<Root>/SYSTEM_MONITOR' */
  System_Monitor_Functional(&rtb_BusConversion_InsertedFor_SYSTEM_MONITOR_at_in,
    &localB->SYSTEM_MONITOR, &(localDW->SYSTEM_MONITOR_DWORK1.rtb),
    &(localDW->SYSTEM_MONITOR_DWORK1.rtdw));

  /* BusSelector: '<Root>/BusConversion_InsertedFor_SYSTEM_MONITOR_at_outport_0' */
  localB->System_Monitor_Failed = localB->SYSTEM_MONITOR.System_Monitor_Failed;
}

/* Update for referenced model: 'GPCA_SW_Logical_Architecture' */
void GPCA_SW_Logical_Architecture_Update(B_GPCA_SW_Logical_Architecture_c_T
  *localB, DW_GPCA_SW_Logical_Architecture_f_T *localDW)
{
  /* Update for UnitDelay: '<Root>/Unit Delay' */
  localDW->UnitDelay_1_DSTATE = localB->Commanded_Flow_Rate;

  /* Update for UnitDelay: '<Root>/Unit Delay' */
  localDW->UnitDelay_2_DSTATE = localB->Current_System_Mode;

  /* Update for UnitDelay: '<Root>/Unit Delay' */
  localDW->UnitDelay_3_DSTATE = localB->New_Infusion;

  /* Update for UnitDelay: '<Root>/Unit Delay' */
  localDW->UnitDelay_4_DSTATE = localB->Log_Message_ID_e;

  /* Update for UnitDelay: '<Root>/Unit Delay' */
  localDW->UnitDelay_5_DSTATE = localB->Actual_Infusion_Duration;

  /* Update for UnitDelay: '<Root>/Unit Delay2' */
  localDW->UnitDelay2_1_DSTATE = localB->System_Monitor_Failed;

  /* Update for UnitDelay: '<Root>/Unit Delay3' */
  localDW->UnitDelay3_1_DSTATE = localB->Log;

  /* Update for UnitDelay: '<Root>/Unit Delay3' */
  localDW->UnitDelay3_2_DSTATE = localB->Logging_Failed;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_1_DSTATE = localB->Patient_ID;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_2_DSTATE = localB->Drug_Name;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_3_DSTATE = localB->Drug_Concentration;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_4_DSTATE = localB->Infusion_Total_Duration;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_5_DSTATE = localB->VTBI_Total;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_6_DSTATE = localB->Flow_Rate_Basal;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_7_DSTATE = localB->Flow_Rate_Intermittent_Bolus;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_8_DSTATE = localB->Duration_Intermittent_Bolus;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_9_DSTATE = localB->Interval_Intermittent_Bolus;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_10_DSTATE = localB->Flow_Rate_Patient_Bolus;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_11_DSTATE = localB->Duration_Patient_Bolus;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_12_DSTATE = localB->Lockout_Period_Patient_Bolus;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_13_DSTATE = localB->Max_Number_of_Patient_Bolus;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_14_DSTATE = localB->Flow_Rate_KVO;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_15_DSTATE = localB->Entered_Reservoir_Volume;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_16_DSTATE = localB->Reservoir_Volume;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_17_DSTATE = localB->Configured;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_18_DSTATE = localB->Error_Message_ID;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_19_DSTATE = localB->Request_Config_Type;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_20_DSTATE = localB->Request_Confirm_Infusion_Initiate;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_21_DSTATE = localB->Request_Patient_Drug_Info;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_22_DSTATE = localB->Request_Infusion_Info;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_23_DSTATE = localB->Log_Message_ID;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_24_DSTATE = localB->Config_Timer;

  /* Update for UnitDelay: '<Root>/Unit Delay1' */
  localDW->UnitDelay1_25_DSTATE = localB->Config_Mode;

  /* Update for ModelReference: '<Root>/SYSTEM_STATUS' */
  SYS_STATS_Functional_Update(&(localDW->SYSTEM_STATUS_DWORK1.rtb),
    &(localDW->SYSTEM_STATUS_DWORK1.rtdw));
}

/* Model initialize function */
void GPCA_SW_Logical_Architecture_initialize(const char_T **rt_errorStatus,
  RT_MODEL_GPCA_SW_Logical_Architecture_T *const GPCA_SW_Logical_Architecture_M,
  B_GPCA_SW_Logical_Architecture_c_T *localB,
  DW_GPCA_SW_Logical_Architecture_f_T *localDW)
{
  /* Registration code */

  /* initialize error status */
  rtmSetErrorStatusPointer(GPCA_SW_Logical_Architecture_M, rt_errorStatus);

  /* block I/O */
  (void) memset(((void *) localB), 0,
                sizeof(B_GPCA_SW_Logical_Architecture_c_T));

  /* states (dwork) */
  (void) memset((void *)localDW, 0,
                sizeof(DW_GPCA_SW_Logical_Architecture_f_T));

  /* Model Initialize fcn for ModelReference Block: '<Root>/ALARM' */
  ALARM_Functional_initialize(rtmGetErrorStatusPointer
    (GPCA_SW_Logical_Architecture_M), &(localDW->ALARM_DWORK1.rtm),
    &(localDW->ALARM_DWORK1.rtb), &(localDW->ALARM_DWORK1.rtdw));

  /* Model Initialize fcn for ModelReference Block: '<Root>/CONFIGURATION' */
  CONFIG_Functional_initialize(rtmGetErrorStatusPointer
    (GPCA_SW_Logical_Architecture_M), &(localDW->CONFIGURATION_DWORK1.rtm),
    &(localDW->CONFIGURATION_DWORK1.rtb), &(localDW->CONFIGURATION_DWORK1.rtdw));

  /* Model Initialize fcn for ModelReference Block: '<Root>/INFUSION_MANAGER' */
  INFUSION_MGR_Functional_initialize(rtmGetErrorStatusPointer
    (GPCA_SW_Logical_Architecture_M), &(localDW->INFUSION_MANAGER_DWORK1.rtm),
                                     &(localDW->INFUSION_MANAGER_DWORK1.rtb),
    &(localDW->INFUSION_MANAGER_DWORK1.rtdw));

  /* Model Initialize fcn for ModelReference Block: '<Root>/LOGGING' */
  Logging_Functional_initialize(rtmGetErrorStatusPointer
    (GPCA_SW_Logical_Architecture_M), &(localDW->LOGGING_DWORK1.rtm),
    &(localDW->LOGGING_DWORK1.rtb), &(localDW->LOGGING_DWORK1.rtdw));

  /* Model Initialize fcn for ModelReference Block: '<Root>/SYSTEM_MONITOR' */
  System_Monitor_Functional_initialize(rtmGetErrorStatusPointer
    (GPCA_SW_Logical_Architecture_M), &(localDW->SYSTEM_MONITOR_DWORK1.rtm),
    &(localDW->SYSTEM_MONITOR_DWORK1.rtb), &(localDW->SYSTEM_MONITOR_DWORK1.rtdw));

  /* Model Initialize fcn for ModelReference Block: '<Root>/SYSTEM_STATUS' */
  SYS_STATS_Functional_initialize(rtmGetErrorStatusPointer
    (GPCA_SW_Logical_Architecture_M), &(localDW->SYSTEM_STATUS_DWORK1.rtm),
    &(localDW->SYSTEM_STATUS_DWORK1.rtb), &(localDW->SYSTEM_STATUS_DWORK1.rtdw));

  /* Model Initialize fcn for ModelReference Block: '<Root>/TOP_LEVEL_MODE' */
  Top_Level_Mode_Functional_initialize(rtmGetErrorStatusPointer
    (GPCA_SW_Logical_Architecture_M), &(localDW->TOP_LEVEL_MODE_DWORK1.rtm),
    &(localDW->TOP_LEVEL_MODE_DWORK1.rtb), &(localDW->TOP_LEVEL_MODE_DWORK1.rtdw));
}
