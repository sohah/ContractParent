/*
 * Code generation for system model 'ALARM_Functional'
 *
 * Model                      : ALARM_Functional
 * Model version              : 1.1326
 * Simulink Coder version : 8.4 (R2013a) 13-Feb-2013
 * C source code generated on : Thu Sep 12 09:49:37 2013
 *
 * Note that the functions contained in this file are part of a Simulink
 * model, and are not self-contained algorithms.
 */

#include "stdio.h"
#include "ALARM_Functional.h"
#include "ALARM_Functional_private.h"
#include "../../../GPCA_SW_Functional_grt_rtw/rtwtypes.h"
#include "../_sharedutils/div_s32.h"

/* Named constants for Chart: '<Root>/Alarm  Sub-System' */
#define ALARM_Functional_IN_AlarmDisplay ((uint8_T)1U)
#define ALARM_Functional_IN_Alarms     ((uint8_T)1U)
#define ALARM_Functional_IN_Check      ((uint8_T)1U)
#define ALARM_Functional_IN_Disabled   ((uint8_T)1U)
#define ALARM_Functional_IN_Monitor    ((uint8_T)2U)
#define ALARM_Functional_IN_NOT_ON     ((uint8_T)2U)
#define ALARM_Functional_IN_NO_ACTIVE_CHILD ((uint8_T)0U)
#define ALARM_Functional_IN_No         ((uint8_T)1U)
#define ALARM_Functional_IN_OFF        ((uint8_T)2U)
#define ALARM_Functional_IN_OFF_i      ((uint8_T)1U)
#define ALARM_Functional_IN_ON         ((uint8_T)3U)
#define ALARM_Functional_IN_ON_a       ((uint8_T)2U)
#define ALARM_Functional_IN_Silenced   ((uint8_T)4U)
#define ALARM_Functional_IN_Yes        ((uint8_T)2U)
#define ALARM_Functional_IN_Yes_o      ((uint8_T)3U)
#define ALARM_Functional_IN_counting   ((uint8_T)3U)

/* Forward declaration for local functions */
static void ALARM_Functional_writeLog(uint8_T logEvent, B_ALARM_Functional_c_T
  *localB);
static uint8_T ALARM_Functional_checkOverInfusionFlowRate(B_ALARM_Functional_c_T
  *localB);
static real_T ALARM_Functional_Step_Scaling_Factor(uint8_T inputVal);
static uint8_T ALARM_Functional_checkUnderInfusion(B_ALARM_Functional_c_T
  *localB);
static void ALARM_Functional_Level1(B_ALARM_Functional_c_T *localB,
  DW_ALARM_Functional_f_T *localDW);
static real_T ALARM_Functional_setCurrentAlarm(DW_ALARM_Functional_f_T *localDW);
static uint8_T ALARM_Functional_setHighestAlarm(DW_ALARM_Functional_f_T *localDW);
static void ALARM_Functional_CheckAlarm(B_ALARM_Functional_c_T *localB,
  DW_ALARM_Functional_f_T *localDW);
static void ALARM_Functional_Alarms(B_ALARM_Functional_c_T *localB,
  DW_ALARM_Functional_f_T *localDW);
static void ALARM_Functional_enter_internal_CheckAlarm(B_ALARM_Functional_c_T
  *localB, DW_ALARM_Functional_f_T *localDW);
static void ALARM_Functional_enter_internal_Alarms(B_ALARM_Functional_c_T
  *localB, DW_ALARM_Functional_f_T *localDW);

/* Function for Chart: '<Root>/Alarm  Sub-System' */
static void ALARM_Functional_writeLog(uint8_T logEvent, B_ALARM_Functional_c_T
  *localB)
{
  /* Graphical Function 'writeLog': '<S1>:1478' */
  /* Transition: '<S1>:1480' */
  localB->ALARM_OUT_Log_Message_ID = logEvent;
}

/* Function for Chart: '<Root>/Alarm  Sub-System' */
static uint8_T ALARM_Functional_checkOverInfusionFlowRate(B_ALARM_Functional_c_T
  *localB)
{
  uint8_T ov;

  /* Graphical Function 'checkOverInfusionFlowRate': '<S1>:4055' */
  /* Transition: '<S1>:4061' */
  ov = 0U;
  if (localB->In_Therapy) {
    /* Transition: '<S1>:4062' */
    if (localB->Flow_Rate > localB->Flow_Rate_High) {
      /* Transition: '<S1>:4063' */
      ov = 1U;
    } else if (localB->Flow_Rate > localB->Commanded_Flow_Rate * div_s32
               (localB->Tolerance_Max, 100) + localB->Commanded_Flow_Rate) {
      /* Transition: '<S1>:4064' */
      ov = 1U;
    } else {
      if (localB->Flow_Rate > localB->Commanded_Flow_Rate * div_s32
          (localB->Tolerance_Min, 100) + localB->Commanded_Flow_Rate) {
        /* Transition: '<S1>:4065' */
        ov = 2U;
      }
    }
  }

  return ov;
}
//TODO: Soha
/* Function for Chart: '<Root>/Alarm  Sub-System' */
static real_T ALARM_Functional_Step_Scaling_Factor(uint8_T inputVal)
{
  /* Graphical Function 'Step_Scaling_Factor': '<S1>:4730' */
  /* Transition: '<S1>:4732' */
  return inputVal;
}

/* Function for Chart: '<Root>/Alarm  Sub-System' */
static uint8_T ALARM_Functional_checkUnderInfusion(B_ALARM_Functional_c_T
  *localB)
{
  uint8_T c;

  /* Graphical Function 'checkUnderInfusion': '<S1>:4130' */
  /* Transition: '<S1>:4137' */
  c = 0U;
  if (localB->In_Therapy) {
    /* Transition: '<S1>:4139' */
    if (localB->Flow_Rate < localB->Flow_Rate_Low) {
      /* Transition: '<S1>:4138' */
      c = 1U;
    } else if (localB->Flow_Rate < localB->Commanded_Flow_Rate -
               localB->Commanded_Flow_Rate * div_s32(localB->Tolerance_Max, 100))
    {
      /* Transition: '<S1>:4140' */
      c = 1U;
    } else {
      if (localB->Flow_Rate < localB->Commanded_Flow_Rate -
          localB->Commanded_Flow_Rate * div_s32(localB->Tolerance_Min, 100)) {
        /* Transition: '<S1>:4142' */
        c = 2U;
      }
    }
  }

  return c;
}

/* Function for Chart: '<Root>/Alarm  Sub-System' */
static void ALARM_Functional_Level1(B_ALARM_Functional_c_T *localB,
  DW_ALARM_Functional_f_T *localDW)
{
  uint8_T underInfusion;

  /* During 'Level1': '<S1>:4113' */
  /* During 'InfusionNotStartedWarning': '<S1>:4577' */
  if (localDW->is_InfusionNotStartedWarning == ALARM_Functional_IN_No) {
    /* During 'No': '<S1>:4583' */
    if (localB->Infusion_Initiate && (!localB->Reservoir_Empty)) {
      /* Transition: '<S1>:4580' */
      localDW->is_InfusionNotStartedWarning = ALARM_Functional_IN_Yes;
    }
  } else {
    /* During 'Yes': '<S1>:4582' */
    if (localB->Infusion_Initiate && (!localB->Reservoir_Empty)) {
      /* Transition: '<S1>:4707' */
      localDW->is_InfusionNotStartedWarning = ALARM_Functional_IN_Yes;
    } else {
      /* Transition: '<S1>:4581' */
      localDW->is_InfusionNotStartedWarning = ALARM_Functional_IN_No;
    }
  }

  /* During 'IsUnderInfusion': '<S1>:4114' */
  underInfusion = ALARM_Functional_checkUnderInfusion(localB);
  switch (localDW->is_IsUnderInfusion) {
   case ALARM_Functional_IN_Check:
    /* During 'Check': '<S1>:4127' */
    if (underInfusion == 1) {
      /* Transition: '<S1>:4119' */
      localDW->is_IsUnderInfusion = ALARM_Functional_IN_Yes_o;

      /* Entry 'Yes': '<S1>:4126' */
    } else {
      if (underInfusion == 2) {
        /* Transition: '<S1>:4121' */
        localDW->underInfusionTimer = 0U;
        localDW->is_IsUnderInfusion = ALARM_Functional_IN_Monitor;

        /* Entry 'Monitor': '<S1>:4128' */
      }
    }
    break;

   case ALARM_Functional_IN_Monitor:
    /* During 'Monitor': '<S1>:4128' */
    if ((underInfusion == 1) || ((real_T)localDW->underInfusionTimer >
         ALARM_Functional_Step_Scaling_Factor
         (localB->Max_Duration_Under_Infusion))) {
      /* Transition: '<S1>:4122' */
      localDW->underInfusionTimer = 0U;
      localDW->is_IsUnderInfusion = ALARM_Functional_IN_Yes_o;

      /* Entry 'Yes': '<S1>:4126' */
    } else if (underInfusion == 2) {
      /* Transition: '<S1>:4124' */
      localDW->underInfusionTimer++;
      localDW->is_IsUnderInfusion = ALARM_Functional_IN_Monitor;

      /* Entry 'Monitor': '<S1>:4128' */
    } else {
      if (underInfusion == 0) {
        /* Transition: '<S1>:4118' */
        localDW->underInfusionTimer = 0U;
        localDW->is_IsUnderInfusion = ALARM_Functional_IN_Check;

        /* Entry 'Check': '<S1>:4127' */
      }
    }
    break;

   default:
    /* During 'Yes': '<S1>:4126' */
    if (localDW->cancelAlarm == 10) {
      /* Transition: '<S1>:4502' */
      localDW->is_IsUnderInfusion = ALARM_Functional_IN_Check;

      /* Entry 'Check': '<S1>:4127' */
    }
    break;
  }

  /* During 'IsFlowRateNotStable': '<S1>:4143' */
  if (localDW->is_IsFlowRateNotStable == ALARM_Functional_IN_No) {
    /* During 'No': '<S1>:4148' */
    if (localB->In_Therapy && localB->Flow_Rate_Not_Stable) {
      /* Transition: '<S1>:4145' */
      localDW->is_IsFlowRateNotStable = ALARM_Functional_IN_Yes;
    }
  } else {
    /* During 'Yes': '<S1>:4147' */
    if ((localDW->cancelAlarm == 11) && (!localB->Flow_Rate_Not_Stable)) {
      /* Transition: '<S1>:4146' */
      localDW->is_IsFlowRateNotStable = ALARM_Functional_IN_No;
    }
  }

  /* During 'IsIdleTimeExceeded': '<S1>:4149' */
  switch (localDW->is_IsIdleTimeExceeded) {
   case ALARM_Functional_IN_No:
    /* During 'No': '<S1>:4153' */
    if ((localB->Current_System_Mode == 1) &&
        (ALARM_Functional_Step_Scaling_Factor(localB->Max_Idle_Duration) == 1.0))
    {
      /* Transition: '<S1>:4750' */
      /* Exit 'No': '<S1>:4153' */
      localDW->idletimer = 0U;
      localDW->is_IsIdleTimeExceeded = ALARM_Functional_IN_Yes;
    } else if (localB->Current_System_Mode == 1) {
      /* Transition: '<S1>:4746' */
      /* Exit 'No': '<S1>:4153' */
      localDW->idletimer = 0U;
      localDW->is_IsIdleTimeExceeded = ALARM_Functional_IN_counting;

      /* Entry 'counting': '<S1>:4745' */
      localDW->idletimer++;
    } else {
      localDW->idletimer = 0U;
    }
    break;

   case ALARM_Functional_IN_Yes:
    /* During 'Yes': '<S1>:4154' */
    if (localDW->cancelAlarm == 12) {
      /* Transition: '<S1>:4152' */
      localDW->is_IsIdleTimeExceeded = ALARM_Functional_IN_No;

      /* Entry 'No': '<S1>:4153' */
      localDW->idletimer = 0U;
    }
    break;

   default:
    /* During 'counting': '<S1>:4745' */
    if ((real_T)localDW->idletimer >= ALARM_Functional_Step_Scaling_Factor
        (localB->Max_Idle_Duration)) {
      /* Transition: '<S1>:4747' */
      /* Exit 'counting': '<S1>:4745' */
      localDW->idletimer++;
      localDW->is_IsIdleTimeExceeded = ALARM_Functional_IN_Yes;
    } else {
      localDW->idletimer++;
    }
    break;
  }

  /* During 'IsPausedTimeExceeded': '<S1>:4155' */
  switch (localDW->is_IsPausedTimeExceeded) {
   case ALARM_Functional_IN_No:
    /* During 'No': '<S1>:4756' */
    if (((localB->Current_System_Mode == 6) || (localB->Current_System_Mode == 7)
         || (localB->Current_System_Mode == 8)) &&
        (ALARM_Functional_Step_Scaling_Factor(localB->Max_Paused_Duration) ==
         1.0)) {
      /* Transition: '<S1>:4761' */
      /* Exit 'No': '<S1>:4756' */
      localDW->pausedtimer = 0U;
      localDW->is_IsPausedTimeExceeded = ALARM_Functional_IN_Yes;
    } else if ((localB->Current_System_Mode == 6) ||
               (localB->Current_System_Mode == 7) ||
               (localB->Current_System_Mode == 8)) {
      /* Transition: '<S1>:4757' */
      /* Exit 'No': '<S1>:4756' */
      localDW->pausedtimer = 0U;
      localDW->is_IsPausedTimeExceeded = ALARM_Functional_IN_counting;

      /* Entry 'counting': '<S1>:4752' */
      localDW->pausedtimer++;
    } else {
      localDW->pausedtimer = 0U;
    }
    break;

   case ALARM_Functional_IN_Yes:
    /* During 'Yes': '<S1>:4755' */
    if (localDW->cancelAlarm == 13) {
      /* Transition: '<S1>:4754' */
      localDW->is_IsPausedTimeExceeded = ALARM_Functional_IN_No;

      /* Entry 'No': '<S1>:4756' */
      localDW->pausedtimer = 0U;
    }
    break;

   default:
    /* During 'counting': '<S1>:4752' */
    if ((real_T)localDW->pausedtimer >= ALARM_Functional_Step_Scaling_Factor
        (localB->Max_Paused_Duration)) {
      /* Transition: '<S1>:4758' */
      /* Exit 'counting': '<S1>:4752' */
      localDW->pausedtimer++;
      localDW->is_IsPausedTimeExceeded = ALARM_Functional_IN_Yes;
    } else {
      localDW->pausedtimer++;
    }
    break;
  }

  /* During 'IsConfigTimeWarning': '<S1>:4161' */
  if (localDW->is_IsConfigTimeWarning == ALARM_Functional_IN_No) {
    /* During 'No': '<S1>:4166' */
    if ((real_T)localB->Config_Timer > ALARM_Functional_Step_Scaling_Factor
        (localB->Config_Warning_Duration)) {
      /* Transition: '<S1>:4163' */
      localDW->is_IsConfigTimeWarning = ALARM_Functional_IN_Yes;
    }
  } else {
    /* During 'Yes': '<S1>:4165' */
    if ((localDW->cancelAlarm == 14) && (!((real_T)localB->Config_Timer >
          ALARM_Functional_Step_Scaling_Factor(localB->Config_Warning_Duration))))
    {
      /* Transition: '<S1>:4164' */
      localDW->is_IsConfigTimeWarning = ALARM_Functional_IN_No;
    }
  }

  /* During 'IsBatteryError': '<S1>:4167' */
  if (localDW->is_IsBatteryError == ALARM_Functional_IN_No) {
    /* During 'No': '<S1>:4172' */
    if (localB->Battery_Low || localB->Battery_Unable_To_Charge ||
        localB->Supply_Voltage) {
      /* Transition: '<S1>:4169' */
      localDW->is_IsBatteryError = ALARM_Functional_IN_Yes;
    }
  } else {
    /* During 'Yes': '<S1>:4171' */
    if ((localDW->cancelAlarm == 15) && (!(localB->Battery_Low ||
          localB->Battery_Unable_To_Charge || localB->Supply_Voltage))) {
      /* Transition: '<S1>:4170' */
      localDW->is_IsBatteryError = ALARM_Functional_IN_No;
    }
  }

  /* During 'IsPumpHot': '<S1>:4173' */
  if (localDW->is_IsPumpHot == ALARM_Functional_IN_No) {
    /* During 'No': '<S1>:4178' */
    if (localB->Pump_Overheated) {
      /* Transition: '<S1>:4175' */
      localDW->is_IsPumpHot = ALARM_Functional_IN_Yes;
    }
  } else {
    /* During 'Yes': '<S1>:4177' */
    if ((localDW->cancelAlarm == 16) && (!localB->Pump_Overheated)) {
      /* Transition: '<S1>:4176' */
      localDW->is_IsPumpHot = ALARM_Functional_IN_No;
    }
  }

  /* During 'IsLoggingFailed': '<S1>:4179' */
  if (localDW->is_IsLoggingFailed == ALARM_Functional_IN_No) {
    /* During 'No': '<S1>:4184' */
    if (localB->Logging_Failed) {
      /* Transition: '<S1>:4181' */
      localDW->is_IsLoggingFailed = ALARM_Functional_IN_Yes;
    }
  } else {
    /* During 'Yes': '<S1>:4183' */
    if ((localDW->cancelAlarm == 17) && (!localB->Logging_Failed)) {
      /* Transition: '<S1>:4182' */
      localDW->is_IsLoggingFailed = ALARM_Functional_IN_No;
    }
  }

  /* During 'IsSystemMonitorFailed': '<S1>:4185' */
  if (localDW->is_IsSystemMonitorFailed == ALARM_Functional_IN_No) {
    /* During 'No': '<S1>:4190' */
    if (localB->System_Monitor_Failed) {
      /* Transition: '<S1>:4187' */
      localDW->is_IsSystemMonitorFailed = ALARM_Functional_IN_Yes;
    }
  } else {
    /* During 'Yes': '<S1>:4189' */
    if ((localDW->cancelAlarm == 18) && (!localB->System_Monitor_Failed)) {
      /* Transition: '<S1>:4188' */
      localDW->is_IsSystemMonitorFailed = ALARM_Functional_IN_No;
    }
  }
}

/* Function for Chart: '<Root>/Alarm  Sub-System' */
static real_T ALARM_Functional_setCurrentAlarm(DW_ALARM_Functional_f_T *localDW)
{
  real_T s;

  /* Graphical Function 'setCurrentAlarm': '<S1>:3955' */
  /* Transition: '<S1>:3975' */
  s = 0.0;
  localDW->Max_Alarm_Level = 0U;
  if (localDW->is_InfusionNotStartedWarning == ALARM_Functional_IN_Yes) {
    /* Transition: '<S1>:4593' */
    s = 19.0;
    localDW->Max_Alarm_Level = 1U;
  } else {
    /* Transition: '<S1>:4591' */
  }

  if (localDW->is_IsSystemMonitorFailed == ALARM_Functional_IN_Yes) {
    /* Transition: '<S1>:3976' */
    s = 18.0;
    localDW->Max_Alarm_Level = 1U;
  } else {
    /* Transition: '<S1>:3977' */
  }

  if (localDW->is_IsLoggingFailed == ALARM_Functional_IN_Yes) {
    /* Transition: '<S1>:3979' */
    s = 17.0;
    localDW->Max_Alarm_Level = 1U;
  } else {
    /* Transition: '<S1>:3978' */
  }

  if (localDW->is_IsPumpHot == ALARM_Functional_IN_Yes) {
    /* Transition: '<S1>:3981' */
    s = 16.0;
    localDW->Max_Alarm_Level = 1U;
  } else {
    /* Transition: '<S1>:3980' */
  }

  if (localDW->is_IsBatteryError == ALARM_Functional_IN_Yes) {
    /* Transition: '<S1>:3982' */
    s = 15.0;
    localDW->Max_Alarm_Level = 1U;
  } else {
    /* Transition: '<S1>:3983' */
  }

  if (localDW->is_IsConfigTimeWarning == ALARM_Functional_IN_Yes) {
    /* Transition: '<S1>:3985' */
    s = 14.0;
    localDW->Max_Alarm_Level = 1U;
  } else {
    /* Transition: '<S1>:3984' */
  }

  if (localDW->is_IsPausedTimeExceeded == ALARM_Functional_IN_Yes) {
    /* Transition: '<S1>:3986' */
    s = 13.0;
    localDW->Max_Alarm_Level = 1U;
  } else {
    /* Transition: '<S1>:3987' */
  }

  if (localDW->is_IsIdleTimeExceeded == ALARM_Functional_IN_Yes) {
    /* Transition: '<S1>:3989' */
    s = 12.0;
    localDW->Max_Alarm_Level = 1U;
  } else {
    /* Transition: '<S1>:3988' */
  }

  if (localDW->is_IsFlowRateNotStable == ALARM_Functional_IN_Yes) {
    /* Transition: '<S1>:3991' */
    s = 11.0;
    localDW->Max_Alarm_Level = 1U;
  } else {
    /* Transition: '<S1>:3990' */
  }

  if (localDW->is_IsUnderInfusion == ALARM_Functional_IN_Yes_o) {
    /* Transition: '<S1>:3992' */
    s = 10.0;
    localDW->Max_Alarm_Level = 1U;
  } else {
    /* Transition: '<S1>:3993' */
  }

  if (localDW->is_IsLowReservoir == ALARM_Functional_IN_Yes) {
    /* Transition: '<S1>:3994' */
    s = 9.0;
    localDW->Max_Alarm_Level = 2U;
  } else {
    /* Transition: '<S1>:3995' */
  }

  if (localDW->is_IsDoorOpen == ALARM_Functional_IN_Yes) {
    /* Transition: '<S1>:3997' */
    s = 8.0;
    localDW->Max_Alarm_Level = 3U;
  } else {
    /* Transition: '<S1>:3996' */
  }

  if (localDW->is_IsOcclusion == ALARM_Functional_IN_Yes) {
    /* Transition: '<S1>:3999' */
    s = 7.0;
    localDW->Max_Alarm_Level = 3U;
  } else {
    /* Transition: '<S1>:3998' */
  }

  if (localDW->is_IsAirInLine == ALARM_Functional_IN_Yes) {
    /* Transition: '<S1>:4000' */
    s = 6.0;
    localDW->Max_Alarm_Level = 3U;
  } else {
    /* Transition: '<S1>:4001' */
  }

  if (localDW->is_IsOverInfusionVTBI == ALARM_Functional_IN_Yes) {
    /* Transition: '<S1>:4003' */
    s = 5.0;
    localDW->Max_Alarm_Level = 3U;
  } else {
    /* Transition: '<S1>:4002' */
  }

  if (localDW->is_IsOverInfusionFlowRate == ALARM_Functional_IN_Yes_o) {
    /* Transition: '<S1>:4005' */
    s = 4.0;
    localDW->Max_Alarm_Level = 3U;
  } else {
    /* Transition: '<S1>:4004' */
  }

  if (localDW->is_IsHardwareError == ALARM_Functional_IN_Yes) {
    /* Transition: '<S1>:4007' */
    s = 3.0;
    localDW->Max_Alarm_Level = 4U;
  } else {
    /* Transition: '<S1>:4006' */
  }

  if (localDW->is_IsEnviromentalError == ALARM_Functional_IN_Yes) {
    /* Transition: '<S1>:4009' */
    s = 2.0;
    localDW->Max_Alarm_Level = 4U;
  } else {
    /* Transition: '<S1>:4008' */
  }

  if (localDW->is_IsEmptyReservoir == ALARM_Functional_IN_Yes) {
    /* Transition: '<S1>:4011' */
    s = 1.0;
    localDW->Max_Alarm_Level = 4U;
  } else {
    /* Transition: '<S1>:4010' */
  }

  return s;
}

/* Function for Chart: '<Root>/Alarm  Sub-System' */
static uint8_T ALARM_Functional_setHighestAlarm(DW_ALARM_Functional_f_T *localDW)
{
  /* Graphical Function 'setHighestAlarm': '<S1>:4098' */
  /* Transition: '<S1>:4104' */
  return localDW->Max_Alarm_Level;
}

/* Function for Chart: '<Root>/Alarm  Sub-System' */
static void ALARM_Functional_CheckAlarm(B_ALARM_Functional_c_T *localB,
  DW_ALARM_Functional_f_T *localDW)
{
  uint8_T overInfusion;

  /* During 'CheckAlarm': '<S1>:3953' */
  /* During 'CancelAlarm': '<S1>:4012' */
  if (localDW->is_CancelAlarm == ALARM_Functional_IN_OFF_i) {
    /* During 'OFF': '<S1>:4017' */
    if ((localDW->currentAlarm > 0) && localB->Notification_Cancel) {
      /* Transition: '<S1>:4014' */
      localDW->is_CancelAlarm = ALARM_Functional_IN_ON_a;

      /* Entry 'ON': '<S1>:4016' */
      localDW->cancelAlarm = localDW->currentAlarm;
      ALARM_Functional_writeLog(3U, localB);
    }
  } else {
    /* During 'ON': '<S1>:4016' */
    /* Transition: '<S1>:4015' */
    localDW->is_CancelAlarm = ALARM_Functional_IN_OFF_i;
  }

  /* During 'Level4': '<S1>:4019' */
  /* During 'IsEmptyReservoir': '<S1>:4020' */
  if (localDW->is_IsEmptyReservoir == ALARM_Functional_IN_No) {
    /* During 'No': '<S1>:4024' */
    if (localB->In_Therapy && localB->Reservoir_Empty) {
      /* Transition: '<S1>:4022' */
      localDW->is_IsEmptyReservoir = ALARM_Functional_IN_Yes;
    }
  } else {
    /* During 'Yes': '<S1>:4025' */
    if (localB->In_Therapy && localB->Reservoir_Empty) {
      /* Transition: '<S1>:4615' */
      localDW->is_IsEmptyReservoir = ALARM_Functional_IN_Yes;
    } else {
      if ((localDW->cancelAlarm == 1) && (!localB->Reservoir_Empty)) {
        /* Transition: '<S1>:4023' */
        localDW->is_IsEmptyReservoir = ALARM_Functional_IN_No;
      }
    }
  }

  /* During 'IsHardwareError': '<S1>:4217' */
  if (localDW->is_IsHardwareError == ALARM_Functional_IN_No) {
    /* During 'No': '<S1>:4222' */
    if (localB->Battery_Depleted || localB->RTC_In_Error || localB->CPU_In_Error
        || localB->Memory_Corrupted || localB->Pump_Too_Hot ||
        localB->Watchdog_Interrupted) {
      /* Transition: '<S1>:4223' */
      localDW->is_IsHardwareError = ALARM_Functional_IN_Yes;
    }
  } else {
    /* During 'Yes': '<S1>:4220' */
    if ((localDW->cancelAlarm == 2) && (!(localB->Battery_Depleted ||
          localB->RTC_In_Error || localB->CPU_In_Error ||
          localB->Memory_Corrupted || localB->Pump_Too_Hot ||
          localB->Watchdog_Interrupted))) {
      /* Transition: '<S1>:4221' */
      localDW->is_IsHardwareError = ALARM_Functional_IN_No;
    }
  }

  /* During 'IsEnviromentalError': '<S1>:4032' */
  if (localDW->is_IsEnviromentalError == ALARM_Functional_IN_No) {
    /* During 'No': '<S1>:4037' */
    if (localB->Temp || localB->Humidity || localB->Air_Pressure) {
      /* Transition: '<S1>:4034' */
      localDW->is_IsEnviromentalError = ALARM_Functional_IN_Yes;
    }
  } else {
    /* During 'Yes': '<S1>:4036' */
    if ((localDW->cancelAlarm == 3) && (!(localB->Temp || localB->Humidity ||
          localB->Air_Pressure))) {
      /* Transition: '<S1>:4035' */
      localDW->is_IsEnviromentalError = ALARM_Functional_IN_No;
    }
  }

  /* During 'Level3': '<S1>:4038' */
  /* During 'IsOverInfusionFlowRate': '<S1>:4039' */
  overInfusion = ALARM_Functional_checkOverInfusionFlowRate(localB);
  switch (localDW->is_IsOverInfusionFlowRate) {
   case ALARM_Functional_IN_Check:
    /* During 'Check': '<S1>:4052' */
    if (overInfusion == 1) {
      /* Transition: '<S1>:4044' */
      /* Exit 'Check': '<S1>:4052' */
      localDW->is_IsOverInfusionFlowRate = ALARM_Functional_IN_Yes_o;

      /* Entry 'Yes': '<S1>:4051' */
    } else {
      if (overInfusion == 2) {
        /* Transition: '<S1>:4046' */
        localDW->overInfusionTimer = 0U;

        /* Exit 'Check': '<S1>:4052' */
        localDW->is_IsOverInfusionFlowRate = ALARM_Functional_IN_Monitor;

        /* Entry 'Monitor': '<S1>:4053' */
      }
    }
    break;

   case ALARM_Functional_IN_Monitor:
    /* During 'Monitor': '<S1>:4053' */
    if ((overInfusion == 1) || ((real_T)localDW->overInfusionTimer >
         ALARM_Functional_Step_Scaling_Factor(localB->Max_Duration_Over_Infusion)))
    {
      /* Transition: '<S1>:4047' */
      localDW->overInfusionTimer = 0U;

      /* Exit 'Monitor': '<S1>:4053' */
      localDW->is_IsOverInfusionFlowRate = ALARM_Functional_IN_Yes_o;

      /* Entry 'Yes': '<S1>:4051' */
    } else if (overInfusion == 0) {
      /* Transition: '<S1>:4042' */
      localDW->overInfusionTimer = 0U;

      /* Exit 'Monitor': '<S1>:4053' */
      localDW->is_IsOverInfusionFlowRate = ALARM_Functional_IN_Check;

      /* Entry 'Check': '<S1>:4052' */
    } else {
      if (overInfusion == 2) {
        /* Transition: '<S1>:4049' */
        localDW->overInfusionTimer++;

        /* Exit 'Monitor': '<S1>:4053' */
        localDW->is_IsOverInfusionFlowRate = ALARM_Functional_IN_Monitor;

        /* Entry 'Monitor': '<S1>:4053' */
      }
    }
    break;

   default:
    /* During 'Yes': '<S1>:4051' */
    if (overInfusion == 1) {
      /* Transition: '<S1>:4701' */
      localDW->is_IsOverInfusionFlowRate = ALARM_Functional_IN_Yes_o;

      /* Entry 'Yes': '<S1>:4051' */
    } else {
      if (localDW->cancelAlarm == 4) {
        /* Transition: '<S1>:4501' */
        localDW->is_IsOverInfusionFlowRate = ALARM_Functional_IN_Check;

        /* Entry 'Check': '<S1>:4052' */
      }
    }
    break;
  }

  /* During 'IsOverInfusionVTBI': '<S1>:4066' */
  if (localDW->is_IsOverInfusionVTBI == ALARM_Functional_IN_No) {
    /* During 'No': '<S1>:4071' */
    if (localB->In_Therapy && (localB->Volume_Infused > localB->VTBI_High)) {
      /* Transition: '<S1>:4068' */
      localDW->is_IsOverInfusionVTBI = ALARM_Functional_IN_Yes;
    }
  } else {
    /* During 'Yes': '<S1>:4070' */
    if (localB->In_Therapy && (localB->Volume_Infused > localB->VTBI_High)) {
      /* Transition: '<S1>:4702' */
      localDW->is_IsOverInfusionVTBI = ALARM_Functional_IN_Yes;
    } else {
      if (localDW->cancelAlarm == 5) {
        /* Transition: '<S1>:4069' */
        localDW->is_IsOverInfusionVTBI = ALARM_Functional_IN_No;
      }
    }
  }

  /* During 'IsAirInLine': '<S1>:4072' */
  if (localDW->is_IsAirInLine == ALARM_Functional_IN_No) {
    /* During 'No': '<S1>:4077' */
    if (localB->Air_In_Line) {
      /* Transition: '<S1>:4074' */
      localDW->is_IsAirInLine = ALARM_Functional_IN_Yes;
    }
  } else {
    /* During 'Yes': '<S1>:4076' */
    if ((localDW->cancelAlarm == 6) && (!localB->Air_In_Line)) {
      /* Transition: '<S1>:4075' */
      localDW->is_IsAirInLine = ALARM_Functional_IN_No;
    }
  }

  /* During 'IsOcclusion': '<S1>:4078' */
  if (localDW->is_IsOcclusion == ALARM_Functional_IN_No) {
    /* During 'No': '<S1>:4083' */
    if (localB->Occlusion) {
      /* Transition: '<S1>:4080' */
      localDW->is_IsOcclusion = ALARM_Functional_IN_Yes;
    }
  } else {
    /* During 'Yes': '<S1>:4082' */
    if ((localDW->cancelAlarm == 7) && (!localB->Occlusion)) {
      /* Transition: '<S1>:4081' */
      localDW->is_IsOcclusion = ALARM_Functional_IN_No;
    }
  }

  /* During 'IsDoorOpen': '<S1>:4084' */
  if (localDW->is_IsDoorOpen == ALARM_Functional_IN_No) {
    /* During 'No': '<S1>:4088' */
    if (localB->Door_Open) {
      /* Transition: '<S1>:4086' */
      localDW->is_IsDoorOpen = ALARM_Functional_IN_Yes;
    }
  } else {
    /* During 'Yes': '<S1>:4089' */
    if ((localDW->cancelAlarm == 8) && (!localB->Door_Open)) {
      /* Transition: '<S1>:4087' */
      localDW->is_IsDoorOpen = ALARM_Functional_IN_No;
    }
  }

  /* During 'Level2': '<S1>:4090' */
  /* During 'IsLowReservoir': '<S1>:4091' */
  if (localDW->is_IsLowReservoir == ALARM_Functional_IN_No) {
    /* During 'No': '<S1>:4095' */
    if (localB->In_Therapy && (localB->Reservoir_Volume < localB->Low_Reservoir))
    {
      /* Transition: '<S1>:4093' */
      localDW->is_IsLowReservoir = ALARM_Functional_IN_Yes;
    }
  } else {
    /* During 'Yes': '<S1>:4096' */
    if ((localDW->cancelAlarm == 9) && (!(localB->Reservoir_Volume <
          localB->Low_Reservoir))) {
      /* Transition: '<S1>:4094' */
      localDW->is_IsLowReservoir = ALARM_Functional_IN_No;
    }
  }

  ALARM_Functional_Level1(localB, localDW);

  /* During 'SetAlarmStatus': '<S1>:4018' */
  localDW->currentAlarm = (uint8_T)ALARM_Functional_setCurrentAlarm(localDW);
  localB->ALARM_OUT_Highest_Level_Alarm = ALARM_Functional_setHighestAlarm
    (localDW);
}

/* Function for Chart: '<Root>/Alarm  Sub-System' */
static void ALARM_Functional_Alarms(B_ALARM_Functional_c_T *localB,
  DW_ALARM_Functional_f_T *localDW)
{
  /* During 'Alarms': '<S1>:3907' */
  if (!localB->System_On) {
    /* Transition: '<S1>:3901' */
    /* Exit Internal 'Alarms': '<S1>:3907' */
    /* Exit Internal 'Notification': '<S1>:3908' */
    /* Exit Internal 'Audio': '<S1>:3919' */
    switch (localDW->is_Audio) {
     case ALARM_Functional_IN_Disabled:
      /* Exit 'Disabled': '<S1>:3939' */
      localB->ALARM_OUT_Audio_Notification_Command = 0U;
      localDW->is_Audio = ALARM_Functional_IN_NO_ACTIVE_CHILD;
      break;

     case ALARM_Functional_IN_OFF:
      /* Exit 'OFF': '<S1>:3937' */
      localB->ALARM_OUT_Audio_Notification_Command = 0U;
      localDW->is_Audio = ALARM_Functional_IN_NO_ACTIVE_CHILD;
      break;

     case ALARM_Functional_IN_ON:
      /* Exit 'ON': '<S1>:3938' */
      localB->ALARM_OUT_Audio_Notification_Command = localB->Audio_Level;
      localDW->is_Audio = ALARM_Functional_IN_NO_ACTIVE_CHILD;
      break;

     case ALARM_Functional_IN_Silenced:
      /* Exit 'Silenced': '<S1>:3952' */
      localB->ALARM_OUT_Audio_Notification_Command = 0U;
      localDW->is_Audio = ALARM_Functional_IN_NO_ACTIVE_CHILD;
      break;

     default:
      localDW->is_Audio = ALARM_Functional_IN_NO_ACTIVE_CHILD;
      break;
    }

    /* Exit 'Audio': '<S1>:3919' */
    localB->ALARM_OUT_Display_Audio_Disabled_Indicator = localB->Disable_Audio;
    localDW->is_active_Audio = 0U;

    /* Exit Internal 'Visual': '<S1>:3909' */
    if (localDW->is_Visual == ALARM_Functional_IN_AlarmDisplay) {
      /* Exit 'AlarmDisplay': '<S1>:3913' */
      localB->ALARM_OUT_Display_Notification_Command = localDW->currentAlarm;
      localDW->is_Visual = ALARM_Functional_IN_NO_ACTIVE_CHILD;
    } else {
      localDW->is_Visual = ALARM_Functional_IN_NO_ACTIVE_CHILD;
    }

    localDW->is_active_Visual = 0U;
    localDW->is_active_Notification = 0U;

    /* Exit Internal 'CheckAlarm': '<S1>:3953' */
    /* Exit 'SetAlarmStatus': '<S1>:4018' */
    localDW->currentAlarm = (uint8_T)ALARM_Functional_setCurrentAlarm(localDW);
    localB->ALARM_OUT_Highest_Level_Alarm = ALARM_Functional_setHighestAlarm
      (localDW);
    localDW->cancelAlarm = 0U;
    localDW->is_active_SetAlarmStatus = 0U;

    /* Exit Internal 'Level1': '<S1>:4113' */
    /* Exit Internal 'IsSystemMonitorFailed': '<S1>:4185' */
    localDW->is_IsSystemMonitorFailed = ALARM_Functional_IN_NO_ACTIVE_CHILD;
    localDW->is_active_IsSystemMonitorFailed = 0U;

    /* Exit Internal 'IsLoggingFailed': '<S1>:4179' */
    localDW->is_IsLoggingFailed = ALARM_Functional_IN_NO_ACTIVE_CHILD;
    localDW->is_active_IsLoggingFailed = 0U;

    /* Exit Internal 'IsPumpHot': '<S1>:4173' */
    localDW->is_IsPumpHot = ALARM_Functional_IN_NO_ACTIVE_CHILD;
    localDW->is_active_IsPumpHot = 0U;

    /* Exit Internal 'IsBatteryError': '<S1>:4167' */
    localDW->is_IsBatteryError = ALARM_Functional_IN_NO_ACTIVE_CHILD;
    localDW->is_active_IsBatteryError = 0U;

    /* Exit Internal 'IsConfigTimeWarning': '<S1>:4161' */
    localDW->is_IsConfigTimeWarning = ALARM_Functional_IN_NO_ACTIVE_CHILD;
    localDW->is_active_IsConfigTimeWarning = 0U;

    /* Exit Internal 'IsPausedTimeExceeded': '<S1>:4155' */
    switch (localDW->is_IsPausedTimeExceeded) {
     case ALARM_Functional_IN_No:
      /* Exit 'No': '<S1>:4756' */
      localDW->pausedtimer = 0U;
      localDW->is_IsPausedTimeExceeded = ALARM_Functional_IN_NO_ACTIVE_CHILD;
      break;

     case ALARM_Functional_IN_counting:
      /* Exit 'counting': '<S1>:4752' */
      localDW->pausedtimer++;
      localDW->is_IsPausedTimeExceeded = ALARM_Functional_IN_NO_ACTIVE_CHILD;
      break;

     default:
      localDW->is_IsPausedTimeExceeded = ALARM_Functional_IN_NO_ACTIVE_CHILD;
      break;
    }

    localDW->is_active_IsPausedTimeExceeded = 0U;

    /* Exit Internal 'IsIdleTimeExceeded': '<S1>:4149' */
    switch (localDW->is_IsIdleTimeExceeded) {
     case ALARM_Functional_IN_No:
      /* Exit 'No': '<S1>:4153' */
      localDW->idletimer = 0U;
      localDW->is_IsIdleTimeExceeded = ALARM_Functional_IN_NO_ACTIVE_CHILD;
      break;

     case ALARM_Functional_IN_counting:
      /* Exit 'counting': '<S1>:4745' */
      localDW->idletimer++;
      localDW->is_IsIdleTimeExceeded = ALARM_Functional_IN_NO_ACTIVE_CHILD;
      break;

     default:
      localDW->is_IsIdleTimeExceeded = ALARM_Functional_IN_NO_ACTIVE_CHILD;
      break;
    }

    localDW->is_active_IsIdleTimeExceeded = 0U;

    /* Exit Internal 'IsFlowRateNotStable': '<S1>:4143' */
    localDW->is_IsFlowRateNotStable = ALARM_Functional_IN_NO_ACTIVE_CHILD;
    localDW->is_active_IsFlowRateNotStable = 0U;

    /* Exit Internal 'IsUnderInfusion': '<S1>:4114' */
    localDW->is_IsUnderInfusion = ALARM_Functional_IN_NO_ACTIVE_CHILD;

    /* Exit 'IsUnderInfusion': '<S1>:4114' */
    localDW->is_active_IsUnderInfusion = 0U;

    /* Exit Internal 'InfusionNotStartedWarning': '<S1>:4577' */
    localDW->is_InfusionNotStartedWarning = ALARM_Functional_IN_NO_ACTIVE_CHILD;
    localDW->is_active_InfusionNotStartedWarning = 0U;
    localDW->is_active_Level1 = 0U;

    /* Exit Internal 'Level2': '<S1>:4090' */
    /* Exit Internal 'IsLowReservoir': '<S1>:4091' */
    localDW->is_IsLowReservoir = ALARM_Functional_IN_NO_ACTIVE_CHILD;
    localDW->is_active_IsLowReservoir = 0U;
    localDW->is_active_Level2 = 0U;

    /* Exit Internal 'Level3': '<S1>:4038' */
    /* Exit Internal 'IsDoorOpen': '<S1>:4084' */
    localDW->is_IsDoorOpen = ALARM_Functional_IN_NO_ACTIVE_CHILD;
    localDW->is_active_IsDoorOpen = 0U;

    /* Exit Internal 'IsOcclusion': '<S1>:4078' */
    localDW->is_IsOcclusion = ALARM_Functional_IN_NO_ACTIVE_CHILD;
    localDW->is_active_IsOcclusion = 0U;

    /* Exit Internal 'IsAirInLine': '<S1>:4072' */
    localDW->is_IsAirInLine = ALARM_Functional_IN_NO_ACTIVE_CHILD;
    localDW->is_active_IsAirInLine = 0U;

    /* Exit Internal 'IsOverInfusionVTBI': '<S1>:4066' */
    localDW->is_IsOverInfusionVTBI = ALARM_Functional_IN_NO_ACTIVE_CHILD;
    localDW->is_active_IsOverInfusionVTBI = 0U;

    /* Exit Internal 'IsOverInfusionFlowRate': '<S1>:4039' */
    switch (localDW->is_IsOverInfusionFlowRate) {
     case ALARM_Functional_IN_Check:
      /* Exit 'Check': '<S1>:4052' */
      localDW->is_IsOverInfusionFlowRate = ALARM_Functional_IN_NO_ACTIVE_CHILD;
      break;

     case ALARM_Functional_IN_Monitor:
      /* Exit 'Monitor': '<S1>:4053' */
      localDW->is_IsOverInfusionFlowRate = ALARM_Functional_IN_NO_ACTIVE_CHILD;
      break;

     default:
      localDW->is_IsOverInfusionFlowRate = ALARM_Functional_IN_NO_ACTIVE_CHILD;
      break;
    }

    /* Exit 'IsOverInfusionFlowRate': '<S1>:4039' */
    localDW->is_active_IsOverInfusionFlowRate = 0U;
    localDW->is_active_Level3 = 0U;

    /* Exit Internal 'Level4': '<S1>:4019' */
    /* Exit Internal 'IsEnviromentalError': '<S1>:4032' */
    localDW->is_IsEnviromentalError = ALARM_Functional_IN_NO_ACTIVE_CHILD;
    localDW->is_active_IsEnviromentalError = 0U;

    /* Exit Internal 'IsHardwareError': '<S1>:4217' */
    localDW->is_IsHardwareError = ALARM_Functional_IN_NO_ACTIVE_CHILD;
    localDW->is_active_IsHardwareError = 0U;

    /* Exit Internal 'IsEmptyReservoir': '<S1>:4020' */
    localDW->is_IsEmptyReservoir = ALARM_Functional_IN_NO_ACTIVE_CHILD;
    localDW->is_active_IsEmptyReservoir = 0U;
    localDW->is_active_Level4 = 0U;

    /* Exit Internal 'CancelAlarm': '<S1>:4012' */
    localDW->is_CancelAlarm = ALARM_Functional_IN_NO_ACTIVE_CHILD;
    localDW->is_active_CancelAlarm = 0U;
    localDW->is_active_CheckAlarm = 0U;
    localDW->is_c2_ALARM_Functional = ALARM_Functional_IN_NOT_ON;
  } else {
    ALARM_Functional_CheckAlarm(localB, localDW);

    /* During 'Notification': '<S1>:3908' */
    /* During 'Visual': '<S1>:3909' */
    if (localDW->is_Visual == ALARM_Functional_IN_AlarmDisplay) {
      /* During 'AlarmDisplay': '<S1>:3913' */
      if (localDW->currentAlarm == 0) {
        /* Transition: '<S1>:3912' */
        /* Exit 'AlarmDisplay': '<S1>:3913' */
        localDW->is_Visual = ALARM_Functional_IN_OFF;

        /* Entry 'OFF': '<S1>:3914' */
        localB->ALARM_OUT_Display_Notification_Command = 0U;
      } else if (localDW->currentAlarm > 0) {
        /* Transition: '<S1>:4614' */
        /* Exit 'AlarmDisplay': '<S1>:3913' */
        localDW->is_Visual = ALARM_Functional_IN_AlarmDisplay;

        /* Entry 'AlarmDisplay': '<S1>:3913' */
        localB->ALARM_OUT_Display_Notification_Command = localDW->currentAlarm;
      } else {
        localB->ALARM_OUT_Display_Notification_Command = localDW->currentAlarm;
      }
    } else {
      /* During 'OFF': '<S1>:3914' */
      if (localDW->currentAlarm > 0) {
        /* Transition: '<S1>:3911' */
        localDW->is_Visual = ALARM_Functional_IN_AlarmDisplay;

        /* Entry 'AlarmDisplay': '<S1>:3913' */
        localB->ALARM_OUT_Display_Notification_Command = localDW->currentAlarm;
      }
    }

    /* During 'Audio': '<S1>:3919' */
    localB->ALARM_OUT_Display_Audio_Disabled_Indicator = localB->Disable_Audio;
    switch (localDW->is_Audio) {
     case ALARM_Functional_IN_Disabled:
      /* During 'Disabled': '<S1>:3939' */
      if (localB->Disable_Audio == 2) {
        /* Transition: '<S1>:4610' */
        /* Exit 'Disabled': '<S1>:3939' */
        localDW->is_Audio = ALARM_Functional_IN_Silenced;

        /* Entry 'Silenced': '<S1>:3952' */
        localDW->audioTimer = 0U;
        localB->ALARM_OUT_Audio_Notification_Command = 0U;
        localDW->audioTimer++;
      } else {
        /* Transition: '<S1>:4604' */
        if ((localB->ALARM_OUT_Highest_Level_Alarm > 2) &&
            (localB->Disable_Audio == 0)) {
          /* Transition: '<S1>:4736' */
          /* Exit 'Disabled': '<S1>:3939' */
          localDW->is_Audio = ALARM_Functional_IN_ON;

          /* Entry 'ON': '<S1>:3938' */
          localB->ALARM_OUT_Audio_Notification_Command = localB->Audio_Level;
        } else if (localB->Disable_Audio == 0) {
          /* Transition: '<S1>:3934' */
          /* Transition: '<S1>:3928' */
          /* Exit 'Disabled': '<S1>:3939' */
          localDW->is_Audio = ALARM_Functional_IN_OFF;

          /* Entry 'OFF': '<S1>:3937' */
          localB->ALARM_OUT_Audio_Notification_Command = 0U;
        } else {
          localB->ALARM_OUT_Audio_Notification_Command = 0U;
        }
      }
      break;

     case ALARM_Functional_IN_OFF:
      /* During 'OFF': '<S1>:3937' */
      if (localB->Disable_Audio == 1) {
        /* Transition: '<S1>:4743' */
        /* Exit 'OFF': '<S1>:3937' */
        localDW->is_Audio = ALARM_Functional_IN_Disabled;

        /* Entry 'Disabled': '<S1>:3939' */
        localB->ALARM_OUT_Audio_Notification_Command = 0U;
      } else {
        /* Transition: '<S1>:4738' */
        if (localB->Disable_Audio == 2) {
          /* Transition: '<S1>:4739' */
          /* Exit 'OFF': '<S1>:3937' */
          localDW->is_Audio = ALARM_Functional_IN_Silenced;

          /* Entry 'Silenced': '<S1>:3952' */
          localDW->audioTimer = 0U;
          localB->ALARM_OUT_Audio_Notification_Command = 0U;
          localDW->audioTimer++;
        } else if ((localB->ALARM_OUT_Highest_Level_Alarm > 2) &&
                   (localB->Disable_Audio == 0)) {
          /* Transition: '<S1>:3925' */
          /* Exit 'OFF': '<S1>:3937' */
          localDW->is_Audio = ALARM_Functional_IN_ON;

          /* Entry 'ON': '<S1>:3938' */
          localB->ALARM_OUT_Audio_Notification_Command = localB->Audio_Level;
        } else {
          localB->ALARM_OUT_Audio_Notification_Command = 0U;
        }
      }
      break;

     case ALARM_Functional_IN_ON:
      /* During 'ON': '<S1>:3938' */
      if (localB->Disable_Audio == 1) {
        /* Transition: '<S1>:3931' */
        /* Exit 'ON': '<S1>:3938' */
        localDW->is_Audio = ALARM_Functional_IN_Disabled;

        /* Entry 'Disabled': '<S1>:3939' */
        localB->ALARM_OUT_Audio_Notification_Command = 0U;
      } else {
        /* Transition: '<S1>:3927' */
        if (localB->Disable_Audio == 2) {
          /* Transition: '<S1>:4739' */
          /* Exit 'ON': '<S1>:3938' */
          localDW->is_Audio = ALARM_Functional_IN_Silenced;

          /* Entry 'Silenced': '<S1>:3952' */
          localDW->audioTimer = 0U;
          localB->ALARM_OUT_Audio_Notification_Command = 0U;
          localDW->audioTimer++;
        } else if ((localB->ALARM_OUT_Highest_Level_Alarm > 2) &&
                   (localB->Disable_Audio == 0)) {
          /* Transition: '<S1>:4609' */
          /* Exit 'ON': '<S1>:3938' */
          localDW->is_Audio = ALARM_Functional_IN_ON;

          /* Entry 'ON': '<S1>:3938' */
          localB->ALARM_OUT_Audio_Notification_Command = localB->Audio_Level;
        } else {
          /* Transition: '<S1>:3926' */
          /* Exit 'ON': '<S1>:3938' */
          localDW->is_Audio = ALARM_Functional_IN_OFF;

          /* Entry 'OFF': '<S1>:3937' */
          localB->ALARM_OUT_Audio_Notification_Command = 0U;
        }
      }
      break;

     default:
      /* During 'Silenced': '<S1>:3952' */
      if (localB->Disable_Audio == 1) {
        /* Transition: '<S1>:4611' */
        /* Exit 'Silenced': '<S1>:3952' */
        localDW->is_Audio = ALARM_Functional_IN_Disabled;

        /* Entry 'Disabled': '<S1>:3939' */
        localB->ALARM_OUT_Audio_Notification_Command = 0U;
      } else {
        /* Transition: '<S1>:4605' */
        if ((localB->ALARM_OUT_Highest_Level_Alarm > 2) &&
            (localB->Disable_Audio == 0)) {
          /* Transition: '<S1>:4736' */
          /* Exit 'Silenced': '<S1>:3952' */
          localDW->is_Audio = ALARM_Functional_IN_ON;

          /* Entry 'ON': '<S1>:3938' */
          localB->ALARM_OUT_Audio_Notification_Command = localB->Audio_Level;
        } else {
          if (((real_T)localDW->audioTimer >
               ALARM_Functional_Step_Scaling_Factor
               (localB->Audio_Enable_Duration)) || (localB->Disable_Audio == 0))
          {
            /* Transition: '<S1>:3936' */
            /* Transition: '<S1>:3928' */
            /* Exit 'Silenced': '<S1>:3952' */
            localDW->is_Audio = ALARM_Functional_IN_OFF;

            /* Entry 'OFF': '<S1>:3937' */
            localB->ALARM_OUT_Audio_Notification_Command = 0U;
          } else {
            localB->ALARM_OUT_Audio_Notification_Command = 0U;
            localDW->audioTimer++;
          }
        }
      }
      break;
    }
  }
}

/* Function for Chart: '<Root>/Alarm  Sub-System' */
static void ALARM_Functional_enter_internal_CheckAlarm(B_ALARM_Functional_c_T
  *localB, DW_ALARM_Functional_f_T *localDW)
{
  uint8_T overInfusion;

  /* Entry Internal 'CheckAlarm': '<S1>:3953' */
  localDW->is_active_CancelAlarm = 1U;

  /* Entry Internal 'CancelAlarm': '<S1>:4012' */
  /* Transition: '<S1>:4013' */
  localDW->is_CancelAlarm = ALARM_Functional_IN_OFF_i;
  localDW->is_active_Level4 = 1U;

  /* Entry Internal 'Level4': '<S1>:4019' */
  localDW->is_active_IsEmptyReservoir = 1U;

  /* Entry Internal 'IsEmptyReservoir': '<S1>:4020' */
  if (localB->In_Therapy && localB->Reservoir_Empty) {
    /* Transition: '<S1>:4193' */
    localDW->is_IsEmptyReservoir = ALARM_Functional_IN_Yes;
  } else {
    /* Transition: '<S1>:4021' */
    localDW->is_IsEmptyReservoir = ALARM_Functional_IN_No;
  }

  localDW->is_active_IsHardwareError = 1U;

  /* Entry Internal 'IsHardwareError': '<S1>:4217' */
  if (localB->Battery_Depleted || localB->RTC_In_Error || localB->CPU_In_Error ||
      localB->Memory_Corrupted || localB->Pump_Too_Hot ||
      localB->Watchdog_Interrupted) {
    /* Transition: '<S1>:4224' */
    localDW->is_IsHardwareError = ALARM_Functional_IN_Yes;
  } else {
    /* Transition: '<S1>:4219' */
    localDW->is_IsHardwareError = ALARM_Functional_IN_No;
  }

  localDW->is_active_IsEnviromentalError = 1U;

  /* Entry Internal 'IsEnviromentalError': '<S1>:4032' */
  if (localB->Temp || localB->Humidity || localB->Air_Pressure) {
    /* Transition: '<S1>:4198' */
    localDW->is_IsEnviromentalError = ALARM_Functional_IN_Yes;
  } else {
    /* Transition: '<S1>:4033' */
    localDW->is_IsEnviromentalError = ALARM_Functional_IN_No;
  }

  localDW->is_active_Level3 = 1U;

  /* Entry Internal 'Level3': '<S1>:4038' */
  localDW->is_active_IsOverInfusionFlowRate = 1U;

  /* Entry 'IsOverInfusionFlowRate': '<S1>:4039' */
  overInfusion = ALARM_Functional_checkOverInfusionFlowRate(localB);

  /* Entry Internal 'IsOverInfusionFlowRate': '<S1>:4039' */
  if (overInfusion == 1) {
    /* Transition: '<S1>:4697' */
    localDW->is_IsOverInfusionFlowRate = ALARM_Functional_IN_Yes_o;

    /* Entry 'Yes': '<S1>:4051' */
  } else if (overInfusion == 2) {
    /* Transition: '<S1>:4699' */
    localDW->is_IsOverInfusionFlowRate = ALARM_Functional_IN_Monitor;

    /* Entry 'Monitor': '<S1>:4053' */
  } else {
    /* Transition: '<S1>:4041' */
    localDW->is_IsOverInfusionFlowRate = ALARM_Functional_IN_Check;

    /* Entry 'Check': '<S1>:4052' */
  }

  localDW->is_active_IsOverInfusionVTBI = 1U;

  /* Entry Internal 'IsOverInfusionVTBI': '<S1>:4066' */
  if (localB->In_Therapy && (localB->Volume_Infused > localB->VTBI_High)) {
    /* Transition: '<S1>:4201' */
    localDW->is_IsOverInfusionVTBI = ALARM_Functional_IN_Yes;
  } else {
    /* Transition: '<S1>:4067' */
    localDW->is_IsOverInfusionVTBI = ALARM_Functional_IN_No;
  }

  localDW->is_active_IsAirInLine = 1U;

  /* Entry Internal 'IsAirInLine': '<S1>:4072' */
  if (localB->Air_In_Line) {
    /* Transition: '<S1>:4202' */
    localDW->is_IsAirInLine = ALARM_Functional_IN_Yes;
  } else {
    /* Transition: '<S1>:4073' */
    localDW->is_IsAirInLine = ALARM_Functional_IN_No;
  }

  localDW->is_active_IsOcclusion = 1U;

  /* Entry Internal 'IsOcclusion': '<S1>:4078' */
  if (localB->Occlusion) {
    /* Transition: '<S1>:4203' */
    localDW->is_IsOcclusion = ALARM_Functional_IN_Yes;
  } else {
    /* Transition: '<S1>:4079' */
    localDW->is_IsOcclusion = ALARM_Functional_IN_No;
  }

  localDW->is_active_IsDoorOpen = 1U;

  /* Entry Internal 'IsDoorOpen': '<S1>:4084' */
  if (localB->Door_Open) {
    /* Transition: '<S1>:4204' */
    localDW->is_IsDoorOpen = ALARM_Functional_IN_Yes;
  } else {
    /* Transition: '<S1>:4085' */
    localDW->is_IsDoorOpen = ALARM_Functional_IN_No;
  }

  localDW->is_active_Level2 = 1U;

  /* Entry Internal 'Level2': '<S1>:4090' */
  localDW->is_active_IsLowReservoir = 1U;

  /* Entry Internal 'IsLowReservoir': '<S1>:4091' */
  if (localB->In_Therapy && (localB->Reservoir_Volume < localB->Low_Reservoir))
  {
    /* Transition: '<S1>:4205' */
    localDW->is_IsLowReservoir = ALARM_Functional_IN_Yes;
  } else {
    /* Transition: '<S1>:4092' */
    localDW->is_IsLowReservoir = ALARM_Functional_IN_No;
  }

  localDW->is_active_Level1 = 1U;

  /* Entry Internal 'Level1': '<S1>:4113' */
  localDW->is_active_InfusionNotStartedWarning = 1U;

  /* Entry Internal 'InfusionNotStartedWarning': '<S1>:4577' */
  if (localB->Infusion_Initiate && (!localB->Reservoir_Empty)) {
    /* Transition: '<S1>:4578' */
    localDW->is_InfusionNotStartedWarning = ALARM_Functional_IN_Yes;
  } else {
    /* Transition: '<S1>:4579' */
    localDW->is_InfusionNotStartedWarning = ALARM_Functional_IN_No;
  }

  localDW->is_active_IsUnderInfusion = 1U;

  /* Entry 'IsUnderInfusion': '<S1>:4114' */
  overInfusion = ALARM_Functional_checkUnderInfusion(localB);

  /* Entry Internal 'IsUnderInfusion': '<S1>:4114' */
  if (overInfusion == 1) {
    /* Transition: '<S1>:4709' */
    localDW->is_IsUnderInfusion = ALARM_Functional_IN_Yes_o;

    /* Entry 'Yes': '<S1>:4126' */
  } else if (overInfusion == 2) {
    /* Transition: '<S1>:4710' */
    localDW->is_IsUnderInfusion = ALARM_Functional_IN_Monitor;

    /* Entry 'Monitor': '<S1>:4128' */
  } else {
    /* Transition: '<S1>:4116' */
    localDW->is_IsUnderInfusion = ALARM_Functional_IN_Check;

    /* Entry 'Check': '<S1>:4127' */
  }

  localDW->is_active_IsFlowRateNotStable = 1U;

  /* Entry Internal 'IsFlowRateNotStable': '<S1>:4143' */
  if (localB->In_Therapy && localB->Flow_Rate_Not_Stable) {
    /* Transition: '<S1>:4210' */
    localDW->is_IsFlowRateNotStable = ALARM_Functional_IN_Yes;
  } else {
    /* Transition: '<S1>:4144' */
    localDW->is_IsFlowRateNotStable = ALARM_Functional_IN_No;
  }

  localDW->is_active_IsIdleTimeExceeded = 1U;

  /* Entry Internal 'IsIdleTimeExceeded': '<S1>:4149' */
  if ((localB->Current_System_Mode == 1) &&
      (ALARM_Functional_Step_Scaling_Factor(localB->Max_Idle_Duration) == 1.0))
  {
    /* Transition: '<S1>:4749' */
    localDW->is_IsIdleTimeExceeded = ALARM_Functional_IN_Yes;
  } else if (localB->Current_System_Mode == 1) {
    /* Transition: '<S1>:4748' */
    localDW->idletimer = 0U;
    localDW->is_IsIdleTimeExceeded = ALARM_Functional_IN_counting;

    /* Entry 'counting': '<S1>:4745' */
    localDW->idletimer++;
  } else {
    /* Transition: '<S1>:4150' */
    localDW->is_IsIdleTimeExceeded = ALARM_Functional_IN_No;

    /* Entry 'No': '<S1>:4153' */
    localDW->idletimer = 0U;
  }

  localDW->is_active_IsPausedTimeExceeded = 1U;

  /* Entry Internal 'IsPausedTimeExceeded': '<S1>:4155' */
  if (((localB->Current_System_Mode == 6) || (localB->Current_System_Mode == 7) ||
       (localB->Current_System_Mode == 8)) &&
      (ALARM_Functional_Step_Scaling_Factor(localB->Max_Paused_Duration) == 1.0))
  {
    /* Transition: '<S1>:4760' */
    localDW->is_IsPausedTimeExceeded = ALARM_Functional_IN_Yes;
  } else if ((localB->Current_System_Mode == 6) || (localB->Current_System_Mode ==
              7) || (localB->Current_System_Mode == 8)) {
    /* Transition: '<S1>:4759' */
    localDW->pausedtimer = 0U;
    localDW->is_IsPausedTimeExceeded = ALARM_Functional_IN_counting;

    /* Entry 'counting': '<S1>:4752' */
    localDW->pausedtimer++;
  } else {
    /* Transition: '<S1>:4753' */
    localDW->is_IsPausedTimeExceeded = ALARM_Functional_IN_No;

    /* Entry 'No': '<S1>:4756' */
    localDW->pausedtimer = 0U;
  }

  localDW->is_active_IsConfigTimeWarning = 1U;

  /* Entry Internal 'IsConfigTimeWarning': '<S1>:4161' */
  if ((real_T)localB->Config_Timer > ALARM_Functional_Step_Scaling_Factor
      (localB->Config_Warning_Duration)) {
    /* Transition: '<S1>:4207' */
    localDW->is_IsConfigTimeWarning = ALARM_Functional_IN_Yes;
  } else {
    /* Transition: '<S1>:4162' */
    localDW->is_IsConfigTimeWarning = ALARM_Functional_IN_No;
  }

  localDW->is_active_IsBatteryError = 1U;

  /* Entry Internal 'IsBatteryError': '<S1>:4167' */
  if (localB->Battery_Low || localB->Battery_Unable_To_Charge ||
      localB->Supply_Voltage) {
    /* Transition: '<S1>:4212' */
    localDW->is_IsBatteryError = ALARM_Functional_IN_Yes;
  } else {
    /* Transition: '<S1>:4168' */
    localDW->is_IsBatteryError = ALARM_Functional_IN_No;
  }

  localDW->is_active_IsPumpHot = 1U;

  /* Entry Internal 'IsPumpHot': '<S1>:4173' */
  if (localB->Pump_Overheated) {
    /* Transition: '<S1>:4208' */
    localDW->is_IsPumpHot = ALARM_Functional_IN_Yes;
  } else {
    /* Transition: '<S1>:4174' */
    localDW->is_IsPumpHot = ALARM_Functional_IN_No;
  }

  localDW->is_active_IsLoggingFailed = 1U;

  /* Entry Internal 'IsLoggingFailed': '<S1>:4179' */
  if (localB->Logging_Failed) {
    /* Transition: '<S1>:4213' */
    localDW->is_IsLoggingFailed = ALARM_Functional_IN_Yes;
  } else {
    /* Transition: '<S1>:4180' */
    localDW->is_IsLoggingFailed = ALARM_Functional_IN_No;
  }

  localDW->is_active_IsSystemMonitorFailed = 1U;

  /* Entry Internal 'IsSystemMonitorFailed': '<S1>:4185' */
  if (localB->System_Monitor_Failed) {
    /* Transition: '<S1>:4209' */
    localDW->is_IsSystemMonitorFailed = ALARM_Functional_IN_Yes;
  } else {
    /* Transition: '<S1>:4186' */
    localDW->is_IsSystemMonitorFailed = ALARM_Functional_IN_No;
  }

  localDW->is_active_SetAlarmStatus = 1U;

  /* Entry 'SetAlarmStatus': '<S1>:4018' */
  localDW->currentAlarm = (uint8_T)ALARM_Functional_setCurrentAlarm(localDW);
  localB->ALARM_OUT_Highest_Level_Alarm = ALARM_Functional_setHighestAlarm
    (localDW);
}

/* Function for Chart: '<Root>/Alarm  Sub-System' */
static void ALARM_Functional_enter_internal_Alarms(B_ALARM_Functional_c_T
  *localB, DW_ALARM_Functional_f_T *localDW)
{
  /* Entry Internal 'Alarms': '<S1>:3907' */
  localDW->is_active_CheckAlarm = 1U;
  ALARM_Functional_enter_internal_CheckAlarm(localB, localDW);
  localDW->is_active_Notification = 1U;

  /* Entry Internal 'Notification': '<S1>:3908' */
  localDW->is_active_Visual = 1U;

  /* Entry Internal 'Visual': '<S1>:3909' */
  if (localDW->currentAlarm > 0) {
    /* Transition: '<S1>:4608' */
    localDW->is_Visual = ALARM_Functional_IN_AlarmDisplay;

    /* Entry 'AlarmDisplay': '<S1>:3913' */
    localB->ALARM_OUT_Display_Notification_Command = localDW->currentAlarm;
  } else {
    /* Transition: '<S1>:3910' */
    localDW->is_Visual = ALARM_Functional_IN_OFF;

    /* Entry 'OFF': '<S1>:3914' */
    localB->ALARM_OUT_Display_Notification_Command = 0U;
  }

  localDW->is_active_Audio = 1U;

  /* Entry 'Audio': '<S1>:3919' */
  localB->ALARM_OUT_Display_Audio_Disabled_Indicator = localB->Disable_Audio;

  /* Entry Internal 'Audio': '<S1>:3919' */
  if (localB->Disable_Audio == 1) {
    /* Transition: '<S1>:4599' */
    localDW->is_Audio = ALARM_Functional_IN_Disabled;

    /* Entry 'Disabled': '<S1>:3939' */
    localB->ALARM_OUT_Audio_Notification_Command = 0U;
  } else if (localB->Disable_Audio == 2) {
    /* Transition: '<S1>:4600' */
    localDW->is_Audio = ALARM_Functional_IN_Silenced;

    /* Entry 'Silenced': '<S1>:3952' */
    localDW->audioTimer = 0U;
    localB->ALARM_OUT_Audio_Notification_Command = 0U;
    localDW->audioTimer++;
  } else if ((localB->ALARM_OUT_Highest_Level_Alarm > 2) &&
             (localB->Disable_Audio == 0)) {
    /* Transition: '<S1>:4601' */
    localDW->is_Audio = ALARM_Functional_IN_ON;

    /* Entry 'ON': '<S1>:3938' */
    localB->ALARM_OUT_Audio_Notification_Command = localB->Audio_Level;
  } else {
    /* Transition: '<S1>:3924' */
    localDW->is_Audio = ALARM_Functional_IN_OFF;

    /* Entry 'OFF': '<S1>:3937' */
    localB->ALARM_OUT_Audio_Notification_Command = 0U;
  }
}

/* Initial conditions for referenced model: 'ALARM_Functional' */
void ALARM_Functional_Init(B_ALARM_Functional_c_T *localB,
  DW_ALARM_Functional_f_T *localDW)
{
  /* InitializeConditions for Chart: '<Root>/Alarm  Sub-System' */
  localDW->is_active_CheckAlarm = 0U;
  localDW->is_active_CancelAlarm = 0U;
  localDW->is_CancelAlarm = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_Level1 = 0U;
  localDW->is_active_InfusionNotStartedWarning = 0U;
  localDW->is_InfusionNotStartedWarning = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_IsBatteryError = 0U;
  localDW->is_IsBatteryError = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_IsConfigTimeWarning = 0U;
  localDW->is_IsConfigTimeWarning = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_IsFlowRateNotStable = 0U;
  localDW->is_IsFlowRateNotStable = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_IsIdleTimeExceeded = 0U;
  localDW->is_IsIdleTimeExceeded = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_IsLoggingFailed = 0U;
  localDW->is_IsLoggingFailed = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_IsPausedTimeExceeded = 0U;
  localDW->is_IsPausedTimeExceeded = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_IsPumpHot = 0U;
  localDW->is_IsPumpHot = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_IsSystemMonitorFailed = 0U;
  localDW->is_IsSystemMonitorFailed = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_IsUnderInfusion = 0U;
  localDW->is_IsUnderInfusion = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_Level2 = 0U;
  localDW->is_active_IsLowReservoir = 0U;
  localDW->is_IsLowReservoir = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_Level3 = 0U;
  localDW->is_active_IsAirInLine = 0U;
  localDW->is_IsAirInLine = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_IsDoorOpen = 0U;
  localDW->is_IsDoorOpen = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_IsOcclusion = 0U;
  localDW->is_IsOcclusion = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_IsOverInfusionFlowRate = 0U;
  localDW->is_IsOverInfusionFlowRate = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_IsOverInfusionVTBI = 0U;
  localDW->is_IsOverInfusionVTBI = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_Level4 = 0U;
  localDW->is_active_IsEmptyReservoir = 0U;
  localDW->is_IsEmptyReservoir = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_IsEnviromentalError = 0U;
  localDW->is_IsEnviromentalError = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_IsHardwareError = 0U;
  localDW->is_IsHardwareError = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_SetAlarmStatus = 0U;
  localDW->is_active_Notification = 0U;
  localDW->is_active_Audio = 0U;
  localDW->is_Audio = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_Visual = 0U;
  localDW->is_Visual = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_c2_ALARM_Functional = 0U;
  localDW->is_c2_ALARM_Functional = ALARM_Functional_IN_NO_ACTIVE_CHILD;
  localDW->overInfusionTimer = 0U;
  localDW->underInfusionTimer = 0U;
  localDW->currentAlarm = 0U;
  localDW->audioTimer = 0U;
  localDW->cancelAlarm = 0U;
  localDW->Max_Alarm_Level = 0U;
  localDW->idletimer = 0U;
  localDW->pausedtimer = 0U;
  localB->ALARM_OUT_Display_Audio_Disabled_Indicator = 0U;
  localB->ALARM_OUT_Display_Notification_Command = 0U;
  localB->ALARM_OUT_Audio_Notification_Command = 0U;
  localB->ALARM_OUT_Highest_Level_Alarm = 0U;
  localB->ALARM_OUT_Log_Message_ID = 0U;
}

/* Output and update for referenced model: 'ALARM_Functional' */
void ALARM_Functional(const Infusion_Manager_Outputs *rtu_IM_IN, const
                      Top_Level_Mode_Outputs *rtu_TLM_MODE_IN, const
                      System_Monitor_Output *rtu_SYS_MON_IN, const Log_Output
                      *rtu_LOGGING_IN, const Operator_Commands *rtu_OP_CMD_IN,
                      const Drug_Database_Inputs *rtu_DB_IN, const
                      Device_Sensor_Inputs *rtu_SENSOR_IN, const
                      Device_Configuration_Inputs *rtu_CONST_IN, const
                      System_Status_Outputs *rtu_SYS_STAT_IN, const
                      Config_Outputs *rtu_CONFIG_IN, Alarm_Outputs
                      *rty_ALARM_OUT, B_ALARM_Functional_c_T *localB,
                      DW_ALARM_Functional_f_T *localDW)
{
  /* BusSelector: '<Root>/BusConversion_InsertedFor_IM_IN_at_outport_0' */
  localB->Commanded_Flow_Rate = rtu_IM_IN->Commanded_Flow_Rate;
  localB->Current_System_Mode = rtu_IM_IN->Current_System_Mode;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_TLM_MODE_IN_at_outport_0' */
  localB->System_On = rtu_TLM_MODE_IN->System_On;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_SYS_MON_IN_at_outport_0' */
  localB->System_Monitor_Failed = rtu_SYS_MON_IN->System_Monitor_Failed;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_LOGGING_IN_at_outport_0' */
  localB->Logging_Failed = rtu_LOGGING_IN->Logging_Failed;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_OP_CMD_IN_at_outport_0' */
  localB->Infusion_Initiate = rtu_OP_CMD_IN->Infusion_Initiate;
  localB->Disable_Audio = rtu_OP_CMD_IN->Disable_Audio;
  localB->Notification_Cancel = rtu_OP_CMD_IN->Notification_Cancel;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_DB_IN_at_outport_0' */
  localB->VTBI_High = rtu_DB_IN->VTBI_High;
  localB->Flow_Rate_High = rtu_DB_IN->Flow_Rate_High;
  localB->Flow_Rate_Low = rtu_DB_IN->Flow_Rate_Low;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_SENSOR_IN_at_outport_0' */
  localB->Flow_Rate = rtu_SENSOR_IN->Flow_Rate;
  localB->Flow_Rate_Not_Stable = rtu_SENSOR_IN->Flow_Rate_Not_Stable;
  localB->Air_In_Line = rtu_SENSOR_IN->Air_In_Line;
  localB->Occlusion = rtu_SENSOR_IN->Occlusion;
  localB->Door_Open = rtu_SENSOR_IN->Door_Open;
  localB->Temp = rtu_SENSOR_IN->Temp;
  localB->Air_Pressure = rtu_SENSOR_IN->Air_Pressure;
  localB->Humidity = rtu_SENSOR_IN->Humidity;
  localB->Battery_Depleted = rtu_SENSOR_IN->Battery_Depleted;
  localB->Battery_Low = rtu_SENSOR_IN->Battery_Low;
  localB->Battery_Unable_To_Charge = rtu_SENSOR_IN->Battery_Unable_To_Charge;
  localB->Supply_Voltage = rtu_SENSOR_IN->Supply_Voltage;
  localB->CPU_In_Error = rtu_SENSOR_IN->CPU_In_Error;
  localB->RTC_In_Error = rtu_SENSOR_IN->RTC_In_Error;
  localB->Watchdog_Interrupted = rtu_SENSOR_IN->Watchdog_Interrupted;
  localB->Memory_Corrupted = rtu_SENSOR_IN->Memory_Corrupted;
  localB->Pump_Too_Hot = rtu_SENSOR_IN->Pump_Too_Hot;
  localB->Pump_Overheated = rtu_SENSOR_IN->Pump_Overheated;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_CONST_IN_at_outport_0' */
  localB->Audio_Enable_Duration = rtu_CONST_IN->Audio_Enable_Duration;
  localB->Audio_Level = rtu_CONST_IN->Audio_Level;
  localB->Config_Warning_Duration = rtu_CONST_IN->Config_Warning_Duration;
  localB->Low_Reservoir = rtu_CONST_IN->Low_Reservoir;
  localB->Max_Duration_Over_Infusion = rtu_CONST_IN->Max_Duration_Over_Infusion;
  localB->Max_Duration_Under_Infusion =
    rtu_CONST_IN->Max_Duration_Under_Infusion;
  localB->Max_Paused_Duration = rtu_CONST_IN->Max_Paused_Duration;
  localB->Max_Idle_Duration = rtu_CONST_IN->Max_Idle_Duration;
  localB->Tolerance_Max = rtu_CONST_IN->Tolerance_Max;
  localB->Tolerance_Min = rtu_CONST_IN->Tolerance_Min;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_SYS_STAT_IN_at_outport_0' */
  localB->Reservoir_Empty = rtu_SYS_STAT_IN->Reservoir_Empty;
  localB->Reservoir_Volume = rtu_SYS_STAT_IN->Reservoir_Volume;
  localB->Volume_Infused = rtu_SYS_STAT_IN->Volume_Infused;
  localB->In_Therapy = rtu_SYS_STAT_IN->In_Therapy;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_CONFIG_IN_at_outport_0' */
  localB->Config_Timer = rtu_CONFIG_IN->Config_Timer;

  /* Chart: '<Root>/Alarm  Sub-System' */
  /* Gateway: Alarm  Sub-System */
  /* During: Alarm  Sub-System */
  if (localDW->is_active_c2_ALARM_Functional == 0U) {
    /* Entry: Alarm  Sub-System */
    localDW->is_active_c2_ALARM_Functional = 1U;

    /* Entry Internal: Alarm  Sub-System */
    if (localB->System_On) {
      /* Transition: '<S1>:4696' */
      localDW->is_c2_ALARM_Functional = ALARM_Functional_IN_Alarms;
      ALARM_Functional_enter_internal_Alarms(localB, localDW);
    } else {
      /* Transition: '<S1>:3904' */
      localDW->is_c2_ALARM_Functional = ALARM_Functional_IN_NOT_ON;
    }
  } else if (localDW->is_c2_ALARM_Functional == ALARM_Functional_IN_Alarms) {
    ALARM_Functional_Alarms(localB, localDW);
  } else {
    /* During 'NOT_ON': '<S1>:3899' */
    if (localB->System_On) {
      /* Transition: '<S1>:3900' */
      localDW->is_c2_ALARM_Functional = ALARM_Functional_IN_Alarms;
      ALARM_Functional_enter_internal_Alarms(localB, localDW);
    }
  }

  /* End of Chart: '<Root>/Alarm  Sub-System' */

  /* BusCreator: '<Root>/BusConversion_InsertedFor_ALARM_OUT_at_inport_0' */
  rty_ALARM_OUT->Is_Audio_Disabled =
    localB->ALARM_OUT_Display_Audio_Disabled_Indicator;
  rty_ALARM_OUT->Notification_Message =
    localB->ALARM_OUT_Display_Notification_Command;
  rty_ALARM_OUT->Audio_Notification_Command =
    localB->ALARM_OUT_Audio_Notification_Command;
  rty_ALARM_OUT->Highest_Level_Alarm = localB->ALARM_OUT_Highest_Level_Alarm;
  rty_ALARM_OUT->Log_Message_ID = localB->ALARM_OUT_Log_Message_ID;
}

/* Model initialize function */
void ALARM_Functional_initialize(const char_T **rt_errorStatus,
  RT_MODEL_ALARM_Functional_T *const ALARM_Functional_M, B_ALARM_Functional_c_T *
  localB, DW_ALARM_Functional_f_T *localDW)
{
  /* Registration code */

  /* initialize error status */
  rtmSetErrorStatusPointer(ALARM_Functional_M, rt_errorStatus);

  /* block I/O */
  (void) memset(((void *) localB), 0,
                sizeof(B_ALARM_Functional_c_T));

  /* states (dwork) */
  (void) memset((void *)localDW, 0,
                sizeof(DW_ALARM_Functional_f_T));
}
