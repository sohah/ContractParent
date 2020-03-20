/*
 * Code generation for system model 'ALARM_Functional'
 * For more details, see corresponding source file ALARM_Functional.c
 *
 */
#ifndef RTW_HEADER_ALARM_Functional_h_
#define RTW_HEADER_ALARM_Functional_h_
#ifndef ALARM_Functional_COMMON_INCLUDES_
# define ALARM_Functional_COMMON_INCLUDES_
#include <string.h>
#include "rtwtypes.h"
#include "rtw_continuous.h"
#include "rtw_solver.h"
#include "rtw_shared_utils.h"
#endif                                 /* ALARM_Functional_COMMON_INCLUDES_ */

#include "ALARM_Functional_types.h"
#include "../../../GPCA_SW_Functional_grt_rtw/rtwtypes.h"

/* Block signals for model 'ALARM_Functional' */
typedef struct {
  uint8_T Commanded_Flow_Rate;
  uint8_T Current_System_Mode;
  uint8_T Disable_Audio;
  uint8_T VTBI_High;
  uint8_T Flow_Rate_High;
  uint8_T Flow_Rate_Low;
  uint8_T Flow_Rate;
  uint8_T Audio_Enable_Duration;
  uint8_T Audio_Level;
  uint8_T Config_Warning_Duration;
  uint8_T Low_Reservoir;
  uint8_T Max_Duration_Over_Infusion;
  uint8_T Max_Duration_Under_Infusion;
  uint8_T Max_Paused_Duration;
  uint8_T Max_Idle_Duration;
  uint8_T Tolerance_Max;
  uint8_T Tolerance_Min;
  uint8_T Reservoir_Volume;
  uint8_T Volume_Infused;
  uint8_T Config_Timer;
  uint8_T ALARM_OUT_Display_Audio_Disabled_Indicator;/* '<Root>/Alarm  Sub-System' */
  uint8_T ALARM_OUT_Display_Notification_Command;/* '<Root>/Alarm  Sub-System' */
  uint8_T ALARM_OUT_Audio_Notification_Command;/* '<Root>/Alarm  Sub-System' */
  uint8_T ALARM_OUT_Highest_Level_Alarm;/* '<Root>/Alarm  Sub-System' */
  uint8_T ALARM_OUT_Log_Message_ID;    /* '<Root>/Alarm  Sub-System' */
  boolean_T System_On;
  boolean_T System_Monitor_Failed;
  boolean_T Logging_Failed;
  boolean_T Infusion_Initiate;
  boolean_T Notification_Cancel;
  boolean_T Flow_Rate_Not_Stable;
  boolean_T Air_In_Line;
  boolean_T Occlusion;
  boolean_T Door_Open;
  boolean_T Temp;
  boolean_T Air_Pressure;
  boolean_T Humidity;
  boolean_T Battery_Depleted;
  boolean_T Battery_Low;
  boolean_T Battery_Unable_To_Charge;
  boolean_T Supply_Voltage;
  boolean_T CPU_In_Error;
  boolean_T RTC_In_Error;
  boolean_T Watchdog_Interrupted;
  boolean_T Memory_Corrupted;
  boolean_T Pump_Too_Hot;
  boolean_T Pump_Overheated;
  boolean_T Reservoir_Empty;
  boolean_T In_Therapy;
} B_ALARM_Functional_c_T;

/* Block states (auto storage) for model 'ALARM_Functional' */
typedef struct {
  uint8_T is_active_c2_ALARM_Functional;/* '<Root>/Alarm  Sub-System' */
  uint8_T is_c2_ALARM_Functional;      /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_Notification;      /* '<Root>/Alarm  Sub-System' */
  uint8_T is_Visual;                   /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_Visual;            /* '<Root>/Alarm  Sub-System' */
  uint8_T is_Audio;                    /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_Audio;             /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_CheckAlarm;        /* '<Root>/Alarm  Sub-System' */
  uint8_T is_CancelAlarm;              /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_CancelAlarm;       /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_SetAlarmStatus;    /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_Level4;            /* '<Root>/Alarm  Sub-System' */
  uint8_T is_IsEmptyReservoir;         /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_IsEmptyReservoir;  /* '<Root>/Alarm  Sub-System' */
  uint8_T is_IsSystemMonitorFailed;    /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_IsSystemMonitorFailed;/* '<Root>/Alarm  Sub-System' */
  uint8_T is_IsEnviromentalError;      /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_IsEnviromentalError;/* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_Level3;            /* '<Root>/Alarm  Sub-System' */
  uint8_T is_IsOverInfusionFlowRate;   /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_IsOverInfusionFlowRate;/* '<Root>/Alarm  Sub-System' */
  uint8_T is_InfusionNotStartedWarning;/* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_InfusionNotStartedWarning;/* '<Root>/Alarm  Sub-System' */
  uint8_T is_IsOverInfusionVTBI;       /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_IsOverInfusionVTBI;/* '<Root>/Alarm  Sub-System' */
  uint8_T is_IsAirInLine;              /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_IsAirInLine;       /* '<Root>/Alarm  Sub-System' */
  uint8_T is_IsOcclusion;              /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_IsOcclusion;       /* '<Root>/Alarm  Sub-System' */
  uint8_T is_IsDoorOpen;               /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_IsDoorOpen;        /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_Level2;            /* '<Root>/Alarm  Sub-System' */
  uint8_T is_IsLowReservoir;           /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_IsLowReservoir;    /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_Level1;            /* '<Root>/Alarm  Sub-System' */
  uint8_T is_IsUnderInfusion;          /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_IsUnderInfusion;   /* '<Root>/Alarm  Sub-System' */
  uint8_T is_IsFlowRateNotStable;      /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_IsFlowRateNotStable;/* '<Root>/Alarm  Sub-System' */
  uint8_T is_IsIdleTimeExceeded;       /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_IsIdleTimeExceeded;/* '<Root>/Alarm  Sub-System' */
  uint8_T is_IsPausedTimeExceeded;     /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_IsPausedTimeExceeded;/* '<Root>/Alarm  Sub-System' */
  uint8_T is_IsConfigTimeWarning;      /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_IsConfigTimeWarning;/* '<Root>/Alarm  Sub-System' */
  uint8_T is_IsBatteryError;           /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_IsBatteryError;    /* '<Root>/Alarm  Sub-System' */
  uint8_T is_IsPumpHot;                /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_IsPumpHot;         /* '<Root>/Alarm  Sub-System' */
  uint8_T is_IsLoggingFailed;          /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_IsLoggingFailed;   /* '<Root>/Alarm  Sub-System' */
  uint8_T is_IsHardwareError;          /* '<Root>/Alarm  Sub-System' */
  uint8_T is_active_IsHardwareError;   /* '<Root>/Alarm  Sub-System' */
  uint8_T overInfusionTimer;           /* '<Root>/Alarm  Sub-System' */
  uint8_T underInfusionTimer;          /* '<Root>/Alarm  Sub-System' */
  uint8_T currentAlarm;                /* '<Root>/Alarm  Sub-System' */
  uint8_T audioTimer;                  /* '<Root>/Alarm  Sub-System' */
  uint8_T cancelAlarm;                 /* '<Root>/Alarm  Sub-System' */
  uint8_T Max_Alarm_Level;             /* '<Root>/Alarm  Sub-System' */
  uint8_T idletimer;                   /* '<Root>/Alarm  Sub-System' */
  uint8_T pausedtimer;                 /* '<Root>/Alarm  Sub-System' */
} DW_ALARM_Functional_f_T;

/* Real-time Model Data Structure */
struct tag_RTM_ALARM_Functional_T {
  const char_T **errorStatus;
};

typedef struct {
  B_ALARM_Functional_c_T rtb;
  DW_ALARM_Functional_f_T rtdw;
  RT_MODEL_ALARM_Functional_T rtm;
} MdlrefDW_ALARM_Functional_T;

/* Model reference registration function */
extern void ALARM_Functional_initialize(const char_T **rt_errorStatus,
  RT_MODEL_ALARM_Functional_T *const ALARM_Functional_M, B_ALARM_Functional_c_T *
  localB, DW_ALARM_Functional_f_T *localDW);
extern void ALARM_Functional_Init(B_ALARM_Functional_c_T *localB,
  DW_ALARM_Functional_f_T *localDW);
extern void ALARM_Functional(const Infusion_Manager_Outputs *rtu_IM_IN, const
  Top_Level_Mode_Outputs *rtu_TLM_MODE_IN, const System_Monitor_Output
  *rtu_SYS_MON_IN, const Log_Output *rtu_LOGGING_IN, const Operator_Commands
  *rtu_OP_CMD_IN, const Drug_Database_Inputs *rtu_DB_IN, const
  Device_Sensor_Inputs *rtu_SENSOR_IN, const Device_Configuration_Inputs
  *rtu_CONST_IN, const System_Status_Outputs *rtu_SYS_STAT_IN, const
  Config_Outputs *rtu_CONFIG_IN, Alarm_Outputs *rty_ALARM_OUT,
  B_ALARM_Functional_c_T *localB, DW_ALARM_Functional_f_T *localDW);

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
 * '<Root>' : 'ALARM_Functional'
 * '<S1>'   : 'ALARM_Functional/Alarm  Sub-System'
 */
#endif                                 /* RTW_HEADER_ALARM_Functional_h_ */
