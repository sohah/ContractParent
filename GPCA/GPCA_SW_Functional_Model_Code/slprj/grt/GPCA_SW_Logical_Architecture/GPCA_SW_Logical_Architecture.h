/*
 * Code generation for system model 'GPCA_SW_Logical_Architecture'
 * For more details, see corresponding source file GPCA_SW_Logical_Architecture.c
 *
 */
#ifndef RTW_HEADER_GPCA_SW_Logical_Architecture_h_
#define RTW_HEADER_GPCA_SW_Logical_Architecture_h_
#ifndef GPCA_SW_Logical_Architecture_COMMON_INCLUDES_
# define GPCA_SW_Logical_Architecture_COMMON_INCLUDES_
#include <string.h>
#include "rtwtypes.h"
#include "rtw_continuous.h"
#include "rtw_solver.h"
#endif                                 /* GPCA_SW_Logical_Architecture_COMMON_INCLUDES_ */

#include "GPCA_SW_Logical_Architecture_types.h"

/* Child system includes */
#include "Top_Level_Mode_Functional.h"
#include "System_Monitor_Functional.h"
#include "SYS_STATS_Functional.h"
#include "Logging_Functional.h"
#include "INFUSION_MGR_Functional.h"
#include "CONFIG_Functional.h"
#include "ALARM_Functional.h"
#include "../Top_Level_Mode_Functional/Top_Level_Mode_Functional.h"
#include "../SYS_STATS_Functional/SYS_STATS_Functional.h"
#include "../ALARM_Functional/ALARM_Functional.h"
#include "../CONFIG_Functional/CONFIG_Functional.h"
#include "../INFUSION_MGR_Functional/INFUSION_MGR_Functional.h"
#include "../Logging_Functional/Logging_Functional.h"
#include "../System_Monitor_Functional/System_Monitor_Functional.h"

/* Block signals for model 'GPCA_SW_Logical_Architecture' */
typedef struct {
  Config_Outputs BusConversion_InsertedFor_SYSTEM_STATUS_at_inport_;
  Config_Outputs CONFIGURATION;        /* '<Root>/CONFIGURATION' */
  Device_Sensor_Inputs BusConversion_InsertedFor_SYSTEM_STATUS_at_inpor_a;
  Device_Configuration_Inputs BusConversion_InsertedFor_SYSTEM_STATUS_at_inpor_l;
  Infusion_Manager_Outputs BusConversion_InsertedFor_SYSTEM_STATUS_at_inpor_i;
  Infusion_Manager_Outputs INFUSION_MANAGER;/* '<Root>/INFUSION_MANAGER' */
  Top_Level_Mode_Outputs TOP_LEVEL_MODE;/* '<Root>/TOP_LEVEL_MODE' */
  Top_Level_Mode_Outputs BusConversion_InsertedFor_SYSTEM_STATUS_at_inpor_d;
  System_Monitor_Output SYSTEM_MONITOR;/* '<Root>/SYSTEM_MONITOR' */
  Log_Output LOGGING;                  /* '<Root>/LOGGING' */
  Alarm_Outputs ALARM;                 /* '<Root>/ALARM' */
  uint8_T Patient_ID;
  uint8_T Drug_Name;
  uint8_T Drug_Concentration;
  uint8_T Infusion_Total_Duration;
  uint8_T VTBI_Total;
  uint8_T Flow_Rate_Basal;
  uint8_T Flow_Rate_Intermittent_Bolus;
  uint8_T Duration_Intermittent_Bolus;
  uint8_T Interval_Intermittent_Bolus;
  uint8_T Flow_Rate_Patient_Bolus;
  uint8_T Duration_Patient_Bolus;
  uint8_T Lockout_Period_Patient_Bolus;
  uint8_T Max_Number_of_Patient_Bolus;
  uint8_T Flow_Rate_KVO;
  uint8_T Entered_Reservoir_Volume;
  uint8_T Reservoir_Volume;
  uint8_T Configured;
  uint8_T Error_Message_ID;
  uint8_T Log_Message_ID;
  uint8_T Config_Timer;
  uint8_T Config_Mode;
  uint8_T Commanded_Flow_Rate;
  uint8_T Current_System_Mode;
  uint8_T Log_Message_ID_e;
  uint8_T Actual_Infusion_Duration;
  uint8_T Log;
  boolean_T Request_Config_Type;
  boolean_T Request_Confirm_Infusion_Initiate;
  boolean_T Request_Patient_Drug_Info;
  boolean_T Request_Infusion_Info;
  boolean_T New_Infusion;
  boolean_T Logging_Failed;
  boolean_T System_Monitor_Failed;
} B_GPCA_SW_Logical_Architecture_c_T;

/* Block states (auto storage) for model 'GPCA_SW_Logical_Architecture' */
typedef struct {
  uint8_T UnitDelay_1_DSTATE;          /* '<Root>/Unit Delay' */
  uint8_T UnitDelay_2_DSTATE;          /* '<Root>/Unit Delay' */
  uint8_T UnitDelay_4_DSTATE;          /* '<Root>/Unit Delay' */
  uint8_T UnitDelay_5_DSTATE;          /* '<Root>/Unit Delay' */
  uint8_T UnitDelay3_1_DSTATE;         /* '<Root>/Unit Delay3' */
  uint8_T UnitDelay1_1_DSTATE;         /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_2_DSTATE;         /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_3_DSTATE;         /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_4_DSTATE;         /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_5_DSTATE;         /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_6_DSTATE;         /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_7_DSTATE;         /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_8_DSTATE;         /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_9_DSTATE;         /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_10_DSTATE;        /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_11_DSTATE;        /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_12_DSTATE;        /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_13_DSTATE;        /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_14_DSTATE;        /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_15_DSTATE;        /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_16_DSTATE;        /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_17_DSTATE;        /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_18_DSTATE;        /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_23_DSTATE;        /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_24_DSTATE;        /* '<Root>/Unit Delay1' */
  uint8_T UnitDelay1_25_DSTATE;        /* '<Root>/Unit Delay1' */
  boolean_T UnitDelay_3_DSTATE;        /* '<Root>/Unit Delay' */
  boolean_T UnitDelay2_1_DSTATE;       /* '<Root>/Unit Delay2' */
  boolean_T UnitDelay3_2_DSTATE;       /* '<Root>/Unit Delay3' */
  boolean_T UnitDelay1_19_DSTATE;      /* '<Root>/Unit Delay1' */
  boolean_T UnitDelay1_20_DSTATE;      /* '<Root>/Unit Delay1' */
  boolean_T UnitDelay1_21_DSTATE;      /* '<Root>/Unit Delay1' */
  boolean_T UnitDelay1_22_DSTATE;      /* '<Root>/Unit Delay1' */
  MdlrefDW_Top_Level_Mode_Functional_T TOP_LEVEL_MODE_DWORK1;/* '<Root>/TOP_LEVEL_MODE' */
  MdlrefDW_SYS_STATS_Functional_T SYSTEM_STATUS_DWORK1;/* '<Root>/SYSTEM_STATUS' */
  MdlrefDW_ALARM_Functional_T ALARM_DWORK1;/* '<Root>/ALARM' */
  MdlrefDW_CONFIG_Functional_T CONFIGURATION_DWORK1;/* '<Root>/CONFIGURATION' */
  MdlrefDW_INFUSION_MGR_Functional_T INFUSION_MANAGER_DWORK1;/* '<Root>/INFUSION_MANAGER' */
  MdlrefDW_Logging_Functional_T LOGGING_DWORK1;/* '<Root>/LOGGING' */
  MdlrefDW_System_Monitor_Functional_T SYSTEM_MONITOR_DWORK1;/* '<Root>/SYSTEM_MONITOR' */
} DW_GPCA_SW_Logical_Architecture_f_T;

/* Real-time Model Data Structure */
struct tag_RTM_GPCA_SW_Logical_Architecture_T {
  const char_T **errorStatus;
};

typedef struct {
  B_GPCA_SW_Logical_Architecture_c_T rtb;
  DW_GPCA_SW_Logical_Architecture_f_T rtdw;
  RT_MODEL_GPCA_SW_Logical_Architecture_T rtm;
} MdlrefDW_GPCA_SW_Logical_Architecture_T;

/* Model reference registration function */
extern void GPCA_SW_Logical_Architecture_initialize(const char_T
  **rt_errorStatus, RT_MODEL_GPCA_SW_Logical_Architecture_T *const
  GPCA_SW_Logical_Architecture_M, B_GPCA_SW_Logical_Architecture_c_T *localB,
  DW_GPCA_SW_Logical_Architecture_f_T *localDW);
extern void GPCA_SW_Logical_Architecture_Init
  (DW_GPCA_SW_Logical_Architecture_f_T *localDW);
extern void GPCA_SW_Logical_Architecture_Update
  (B_GPCA_SW_Logical_Architecture_c_T *localB,
   DW_GPCA_SW_Logical_Architecture_f_T *localDW);
extern void GPCA_SW_Logical_Architecture(const Device_Sensor_Inputs
  *rtu_SENSOR_IN, const Device_Configuration_Inputs *rtu_CONST_IN, const
  Operator_Commands *rtu_OP_CMD_IN, const Drug_Database_Inputs *rtu_DB_IN, const
  Prescription_Inputs *rtu_PRES_IN, const Patient_Inputs *rtu_PATIENT_IN,
  GPCA_SW_Outputs *rty_GPCA_SW_OUT, B_GPCA_SW_Logical_Architecture_c_T *localB,
  DW_GPCA_SW_Logical_Architecture_f_T *localDW);

/*-
 * The generated code includes comments that allow you to trace directly
 * back to the appropriate location in the model.  The basic format
 * is <system>/block_name, where system is the system number (uniquely
 * assigned by Simulink) and block_name is the name of the block.
 *
 * Use the MATLAB hilite_system command to trace the generated code back
 * to the model.  For example,
 *
 * hilite_system('<S3>')    - opens system 3
 * hilite_system('<S3>/Kp') - opens and selects block Kp which resides in S3
 *
 * Here is the system hierarchy for this model
 *
 * '<Root>' : 'GPCA_SW_Logical_Architecture'
 */
#endif                                 /* RTW_HEADER_GPCA_SW_Logical_Architecture_h_ */
