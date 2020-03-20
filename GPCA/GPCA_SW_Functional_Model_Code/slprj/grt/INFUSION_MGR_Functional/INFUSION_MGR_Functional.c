/*
 * Code generation for system model 'INFUSION_MGR_Functional'
 *
 * Model                      : INFUSION_MGR_Functional
 * Model version              : 1.1141
 * Simulink Coder version : 8.4 (R2013a) 13-Feb-2013
 * C source code generated on : Thu Sep 12 09:49:58 2013
 *
 * Note that the functions contained in this file are part of a Simulink
 * model, and are not self-contained algorithms.
 */

#include <stdio.h>
#include "INFUSION_MGR_Functional.h"
#include "INFUSION_MGR_Functional_private.h"
#include "../../../GPCA_SW_Functional_grt_rtw/tmwtypes.h"
#include "../../../GPCA_SW_Functional_grt_rtw/rtwtypes.h"

#define DEBUG 0
#define DB_PRINTF(...) do { if (DEBUG) fprintf(stdout, __VA_ARGS__); } while (0)

/* Named constants for Chart: '<Root>/Infusion Manager Sub-System' */
#define INFUSION_MGR_Functional_IN_ACTIVE ((uint8_T)1U)
#define INFUSION_MGR_Functional_IN_Basal ((uint8_T)1U)
#define INFUSION_MGR_Functional_IN_IDLE ((uint8_T)1U)
#define INFUSION_MGR_Functional_IN_Infusion_Manager ((uint8_T)1U)
#define INFUSION_MGR_Functional_IN_Intermittent_Bolus ((uint8_T)2U)
#define INFUSION_MGR_Functional_IN_LOCKOUT ((uint8_T)1U)
#define INFUSION_MGR_Functional_IN_Manual_Paused_KVO ((uint8_T)1U)
#define INFUSION_MGR_Functional_IN_NOT_ON ((uint8_T)2U)
#define INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD ((uint8_T)0U)
#define INFUSION_MGR_Functional_IN_OFF ((uint8_T)1U)
#define INFUSION_MGR_Functional_IN_OFF_b ((uint8_T)2U)
#define INFUSION_MGR_Functional_IN_ON  ((uint8_T)2U)
#define INFUSION_MGR_Functional_IN_ON_b ((uint8_T)3U)
#define INFUSION_MGR_Functional_IN_PAUSED ((uint8_T)2U)
#define INFUSION_MGR_Functional_IN_Patient_Bolus ((uint8_T)3U)
#define INFUSION_MGR_Functional_IN_Paused_KVO ((uint8_T)2U)
#define INFUSION_MGR_Functional_IN_Paused_NoKVO ((uint8_T)3U)
#define INFUSION_MGR_Functional_IN_THERAPY ((uint8_T)2U)

/* Forward declaration for local functions */
static real_T INFUSION_MGR_Functional_Step_Scaling_Factor(uint8_T inputVal);
static void INFUSION_MGR_Functional_writeLog(real_T logEvent,
  B_INFUSION_MGR_Functional_c_T *localB);
static void INFUSION_MGR_Functional_resetForNewInfusion
  (B_INFUSION_MGR_Functional_c_T *localB, DW_INFUSION_MGR_Functional_f_T
   *localDW);
static void INFUSION_MGR_Functional_exit_internal_ACTIVE
  (DW_INFUSION_MGR_Functional_f_T *localDW);
static void INFUSION_MGR_Functional_exit_internal_PAUSED
  (B_INFUSION_MGR_Functional_c_T *localB, DW_INFUSION_MGR_Functional_f_T
   *localDW);
static void INFUSION_MGR_Functional_TherapyExitOperations
  (B_INFUSION_MGR_Functional_c_T *localB);
static real_T INFUSION_MGR_Functional_sbolus_trigger
  (B_INFUSION_MGR_Functional_c_T *localB, DW_INFUSION_MGR_Functional_f_T
   *localDW);
static void INFUSION_MGR_Functional_enter_internal_ACTIVE
  (B_INFUSION_MGR_Functional_c_T *localB, DW_INFUSION_MGR_Functional_f_T
   *localDW);
static void INFUSION_MGR_Functional_enter_internal_PAUSED
  (B_INFUSION_MGR_Functional_c_T *localB, DW_INFUSION_MGR_Functional_f_T
   *localDW);
static void INFUSION_MGR_Functional_resetAllInfusionDetails
  (B_INFUSION_MGR_Functional_c_T *localB, DW_INFUSION_MGR_Functional_f_T
   *localDW);
static void INFUSION_MGR_Functional_THERAPY(B_INFUSION_MGR_Functional_c_T
  *localB, DW_INFUSION_MGR_Functional_f_T *localDW);

/* Function for Chart: '<Root>/Infusion Manager Sub-System' */
static real_T INFUSION_MGR_Functional_Step_Scaling_Factor(uint8_T inputVal)
{
  /* Graphical Function 'Step_Scaling_Factor': '<S1>:4016' */
  /* Transition: '<S1>:4013' */
  return inputVal;
}

/* Function for Chart: '<Root>/Infusion Manager Sub-System' */
static void INFUSION_MGR_Functional_writeLog(real_T logEvent,
  B_INFUSION_MGR_Functional_c_T *localB)
{
  /* Graphical Function 'writeLog': '<S1>:3724' */
  /* Transition: '<S1>:3726' */
  localB->IM_OUT_Log_Message_ID = (uint8_T)logEvent;
}

/* Function for Chart: '<Root>/Infusion Manager Sub-System' */
static void INFUSION_MGR_Functional_resetForNewInfusion
  (B_INFUSION_MGR_Functional_c_T *localB, DW_INFUSION_MGR_Functional_f_T
   *localDW)
{
  /* Graphical Function 'resetForNewInfusion': '<S1>:3956' */
  /* Transition: '<S1>:3958' */
  localDW->sbolus_timer = 0U;
  localDW->pbolus_timer = 0U;
  localDW->number_pbolus = 0U;
  localDW->sbolusInter_timer = 0U;
  localB->IM_OUT_Flow_Rate_Commanded = 0U;
  localB->IM_OUT_Actual_Infusion_Duration = 0U;
  INFUSION_MGR_Functional_writeLog(1.0, localB);
}

/* Function for Chart: '<Root>/Infusion Manager Sub-System' */
static void INFUSION_MGR_Functional_exit_internal_ACTIVE
  (DW_INFUSION_MGR_Functional_f_T *localDW)
{
  /* Exit Internal 'ACTIVE': '<S1>:3905' */
  /* Exit Internal 'Arbiter': '<S1>:3913' */
  localDW->is_Arbiter_d = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_Arbiter_c = 0U;

  /* Exit Internal 'INTERMITTENT': '<S1>:3936' */
  if (localDW->is_INTERMITTENT == INFUSION_MGR_Functional_IN_ON) {
    /* Exit 'ON': '<S1>:3941' */
    localDW->sbolus_timer++;
    localDW->sbolus_req = FALSE;
    localDW->is_INTERMITTENT = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
  } else {
    localDW->is_INTERMITTENT = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
  }

  localDW->is_active_INTERMITTENT = 0U;

  /* Exit Internal 'PATIENT': '<S1>:3927' */
  if (localDW->is_PATIENT == INFUSION_MGR_Functional_IN_ON_b) {
    /* Exit 'ON': '<S1>:3934' */
    localDW->pbolus_timer++;
    localDW->is_PATIENT = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
  } else {
    localDW->is_PATIENT = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
  }

  localDW->is_active_PATIENT = 0U;

  /* Exit Internal 'BASAL': '<S1>:3907' */
  localDW->is_BASAL = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_BASAL = 0U;
}

/* Function for Chart: '<Root>/Infusion Manager Sub-System' */
static void INFUSION_MGR_Functional_exit_internal_PAUSED
  (B_INFUSION_MGR_Functional_c_T *localB, DW_INFUSION_MGR_Functional_f_T
   *localDW)
{
  /* Exit Internal 'PAUSED': '<S1>:3876' */
  /* Exit Internal 'Arbiter': '<S1>:3877' */
  switch (localDW->is_Arbiter) {
   case INFUSION_MGR_Functional_IN_Manual_Paused_KVO:
    /* Exit 'Manual_Paused_KVO': '<S1>:3892' */
    localB->IM_OUT_Flow_Rate_Commanded = localB->Flow_Rate_KVO;
    localB->IM_OUT_Current_System_Mode = 8U;
    localDW->is_Arbiter = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
    break;

   case INFUSION_MGR_Functional_IN_Paused_KVO:
    /* Exit 'Paused_KVO': '<S1>:3891' */
    localB->IM_OUT_Flow_Rate_Commanded = localB->Flow_Rate_KVO;
    localB->IM_OUT_Current_System_Mode = 7U;
    localDW->is_Arbiter = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
    break;

   case INFUSION_MGR_Functional_IN_Paused_NoKVO:
    /* Exit 'Paused_NoKVO': '<S1>:3890' */
    localB->IM_OUT_Flow_Rate_Commanded = 0U;
    localB->IM_OUT_Current_System_Mode = 6U;
    localDW->is_Arbiter = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
    break;

   default:
    localDW->is_Arbiter = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
    break;
  }

  localDW->is_active_Arbiter = 0U;

  /* Exit Internal 'Manual_Paused': '<S1>:3899' */
  localDW->is_Manual_Paused = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_Manual_Paused = 0U;

  /* Exit Internal 'Alarm_Paused': '<S1>:3893' */
  localDW->is_Alarm_Paused = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_Alarm_Paused = 0U;
}

/* Function for Chart: '<Root>/Infusion Manager Sub-System' */
static void INFUSION_MGR_Functional_TherapyExitOperations
  (B_INFUSION_MGR_Functional_c_T *localB)
{
  /* Graphical Function 'TherapyExitOperations': '<S1>:3953' */
  /* Transition: '<S1>:3955' */
  localB->IM_OUT_Flow_Rate_Commanded = 0U;
  localB->IM_OUT_New_Infusion = FALSE;
}

/* Function for Chart: '<Root>/Infusion Manager Sub-System' */
static real_T INFUSION_MGR_Functional_sbolus_trigger
  (B_INFUSION_MGR_Functional_c_T *localB, DW_INFUSION_MGR_Functional_f_T
   *localDW)
{
  real_T sb;

  /* Graphical Function 'sbolus_trigger': '<S1>:3943' */
  /* Transition: '<S1>:3947' */
  sb = 0.0;
  if (!(((real_T)localDW->sbolusInter_timer >
         INFUSION_MGR_Functional_Step_Scaling_Factor
         (localB->Interval_Intermittent_Bolus)) || ((real_T)
        localDW->sbolusInter_timer < INFUSION_MGR_Functional_Step_Scaling_Factor
        (localB->Interval_Intermittent_Bolus)) || (!((real_T)
         localDW->sbolusInter_timer ==
         INFUSION_MGR_Functional_Step_Scaling_Factor
         (localB->Interval_Intermittent_Bolus))))) {
    /* Transition: '<S1>:3949' */
    sb = 1.0;
    localDW->sbolusInter_timer = 0U;
  } else {
    /* Transition: '<S1>:3948' */
  }

  return sb;
}

/* Function for Chart: '<Root>/Infusion Manager Sub-System' */
static void INFUSION_MGR_Functional_enter_internal_ACTIVE
  (B_INFUSION_MGR_Functional_c_T *localB, DW_INFUSION_MGR_Functional_f_T
   *localDW)
{
  /* Entry Internal 'ACTIVE': '<S1>:3905' */
  localDW->is_active_BASAL = 1U;

  /* Entry Internal 'BASAL': '<S1>:3907' */
  /* Transition: '<S1>:3908' */
  localDW->is_BASAL = INFUSION_MGR_Functional_IN_ON;
  localDW->is_active_PATIENT = 1U;

  /* Entry Internal 'PATIENT': '<S1>:3927' */
  if (localDW->inPatientBolus) {
    /* Transition: '<S1>:3930' */
    localDW->is_PATIENT = INFUSION_MGR_Functional_IN_LOCKOUT;

    /* Entry 'LOCKOUT': '<S1>:3935' */
    localDW->lock_timer++;
  } else {
    /* Transition: '<S1>:3928' */
    localDW->is_PATIENT = INFUSION_MGR_Functional_IN_OFF_b;

    /* Entry 'OFF': '<S1>:3933' */
    localDW->pbolus_timer = 0U;
    localDW->inPatientBolus = FALSE;
  }

  localDW->is_active_INTERMITTENT = 1U;

  /* Entry 'INTERMITTENT': '<S1>:3936' */
  localDW->sbolusInter_timer++;

  /* Entry Internal 'INTERMITTENT': '<S1>:3936' */
  /* Transition: '<S1>:3937' */
  localDW->is_INTERMITTENT = INFUSION_MGR_Functional_IN_OFF;

  /* Entry 'OFF': '<S1>:3940' */
  localDW->sbolus_timer = 0U;
  localDW->sbolus_req = FALSE;
  localDW->sbolus_req = (INFUSION_MGR_Functional_sbolus_trigger(localB, localDW)
    != 0.0);
  localDW->is_active_Arbiter_c = 1U;

  /* Entry Internal 'Arbiter': '<S1>:3913' */
  /* Transition: '<S1>:3916' */
  if (localDW->is_PATIENT == INFUSION_MGR_Functional_IN_ON_b) {
    /* Transition: '<S1>:3917' */
    localDW->is_Arbiter_d = INFUSION_MGR_Functional_IN_Patient_Bolus;

    /* Entry 'Patient_Bolus': '<S1>:3924' */
    localB->IM_OUT_Flow_Rate_Commanded = localB->Flow_Rate_Patient_Bolus;
    localB->IM_OUT_Current_System_Mode = 4U;
  } else if (localDW->is_INTERMITTENT == INFUSION_MGR_Functional_IN_ON) {
    /* Transition: '<S1>:3918' */
    localDW->is_Arbiter_d = INFUSION_MGR_Functional_IN_Intermittent_Bolus;

    /* Entry 'Intermittent_Bolus': '<S1>:3925' */
    localB->IM_OUT_Flow_Rate_Commanded = localB->Flow_Rate_Intermittent_Bolus;
    localB->IM_OUT_Current_System_Mode = 3U;
  } else {
    /* Transition: '<S1>:3919' */
    localDW->is_Arbiter_d = INFUSION_MGR_Functional_IN_Basal;

    /* Entry 'Basal': '<S1>:3926' */
    localB->IM_OUT_Flow_Rate_Commanded = localB->Flow_Rate_Basal;
    localB->IM_OUT_Current_System_Mode = 2U;
  }
}

/* Function for Chart: '<Root>/Infusion Manager Sub-System' */
static void INFUSION_MGR_Functional_enter_internal_PAUSED
  (B_INFUSION_MGR_Functional_c_T *localB, DW_INFUSION_MGR_Functional_f_T
   *localDW)
{
  /* Entry Internal 'PAUSED': '<S1>:3876' */
  localDW->is_active_Alarm_Paused = 1U;

  /* Entry Internal 'Alarm_Paused': '<S1>:3893' */
  if (localB->Highest_Level_Alarm >= 3) {
    /* Transition: '<S1>:3964' */
    localDW->is_Alarm_Paused = INFUSION_MGR_Functional_IN_ON;
  } else {
    /* Transition: '<S1>:3894' */
    localDW->is_Alarm_Paused = INFUSION_MGR_Functional_IN_OFF;
  }

  localDW->is_active_Manual_Paused = 1U;

  /* Entry Internal 'Manual_Paused': '<S1>:3899' */
  if (localB->Infusion_Inhibit) {
    /* Transition: '<S1>:3965' */
    localDW->is_Manual_Paused = INFUSION_MGR_Functional_IN_ON;
  } else {
    /* Transition: '<S1>:3900' */
    localDW->is_Manual_Paused = INFUSION_MGR_Functional_IN_OFF;
  }

  localDW->is_active_Arbiter = 1U;

  /* Entry Internal 'Arbiter': '<S1>:3877' */
  /* Transition: '<S1>:3881' */
  if ((localDW->is_Alarm_Paused == INFUSION_MGR_Functional_IN_ON) &&
      (localB->Highest_Level_Alarm == 4)) {
    /* Transition: '<S1>:3882' */
    localDW->is_Arbiter = INFUSION_MGR_Functional_IN_Paused_NoKVO;

    /* Entry 'Paused_NoKVO': '<S1>:3890' */
    localB->IM_OUT_Flow_Rate_Commanded = 0U;
    localB->IM_OUT_Current_System_Mode = 6U;
  } else if ((localDW->is_Alarm_Paused == INFUSION_MGR_Functional_IN_ON) &&
             (localB->Highest_Level_Alarm == 3)) {
    /* Transition: '<S1>:3884' */
    localDW->is_Arbiter = INFUSION_MGR_Functional_IN_Paused_KVO;

    /* Entry 'Paused_KVO': '<S1>:3891' */
    localB->IM_OUT_Flow_Rate_Commanded = localB->Flow_Rate_KVO;
    localB->IM_OUT_Current_System_Mode = 7U;
  } else {
    /* Transition: '<S1>:3883' */
    localDW->is_Arbiter = INFUSION_MGR_Functional_IN_Manual_Paused_KVO;

    /* Entry 'Manual_Paused_KVO': '<S1>:3892' */
    localB->IM_OUT_Flow_Rate_Commanded = localB->Flow_Rate_KVO;
    localB->IM_OUT_Current_System_Mode = 8U;
  }
}

/* Function for Chart: '<Root>/Infusion Manager Sub-System' */
static void INFUSION_MGR_Functional_resetAllInfusionDetails
  (B_INFUSION_MGR_Functional_c_T *localB, DW_INFUSION_MGR_Functional_f_T
   *localDW)
{
  /* Graphical Function 'resetAllInfusionDetails': '<S1>:3959' */
  /* Transition: '<S1>:3961' */
  INFUSION_MGR_Functional_resetForNewInfusion(localB, localDW);
  localDW->lock_timer = 0U;
  localDW->inPatientBolus = FALSE;
  localDW->number_pbolus = 0U;
}

/* Function for Chart: '<Root>/Infusion Manager Sub-System' */
static void INFUSION_MGR_Functional_THERAPY(B_INFUSION_MGR_Functional_c_T
  *localB, DW_INFUSION_MGR_Functional_f_T *localDW)
{
	DB_PRINTF("1: %2x %2x ",localB->Infusion_Initiate,localB->Reservoir_Empty);
	
  /* During 'THERAPY': '<S1>:3867' */
  if ((localB->Infusion_Initiate && localB->Reservoir_Empty) ||
      (localB->Configured < 1) || localB->Infusion_Cancel) {
    /* Transition: '<S1>:3987' */
    /* Exit Internal 'THERAPY': '<S1>:3867' */
    switch (localDW->is_THERAPY) {
     case INFUSION_MGR_Functional_IN_ACTIVE:
      INFUSION_MGR_Functional_exit_internal_ACTIVE(localDW);
      localDW->is_THERAPY = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
      break;

     case INFUSION_MGR_Functional_IN_PAUSED:
      INFUSION_MGR_Functional_exit_internal_PAUSED(localB, localDW);
      localDW->is_THERAPY = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
      break;

     default:
      localDW->is_THERAPY = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
      break;
    }

    /* Exit 'THERAPY': '<S1>:3867' */
    INFUSION_MGR_Functional_TherapyExitOperations(localB);
    localDW->is_Infusion_Manager = INFUSION_MGR_Functional_IN_IDLE;

    /* Entry 'IDLE': '<S1>:3866' */
    localB->IM_OUT_Current_System_Mode = 1U;
    localB->IM_OUT_Flow_Rate_Commanded = 0U;
    INFUSION_MGR_Functional_resetAllInfusionDetails(localB, localDW);
  } else if (localB->Infusion_Initiate && (localB->Configured == 1) &&
             localB->Reservoir_Empty) 
             {
    /* Transition: '<S1>:3861' */
    INFUSION_MGR_Functional_resetForNewInfusion(localB, localDW);

    /* Transition: '<S1>:3863' */
    localB->IM_OUT_New_Infusion = TRUE;

    /* Exit Internal 'THERAPY': '<S1>:3867' */
    switch (localDW->is_THERAPY) {
     case INFUSION_MGR_Functional_IN_ACTIVE:
      INFUSION_MGR_Functional_exit_internal_ACTIVE(localDW);
      localDW->is_THERAPY = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
      break;

     case INFUSION_MGR_Functional_IN_PAUSED:
      INFUSION_MGR_Functional_exit_internal_PAUSED(localB, localDW);
      localDW->is_THERAPY = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
      break;

     default:
      localDW->is_THERAPY = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
      break;
    }

    /* Exit 'THERAPY': '<S1>:3867' */
    INFUSION_MGR_Functional_TherapyExitOperations(localB);
    localDW->is_Infusion_Manager = INFUSION_MGR_Functional_IN_THERAPY;

    /* Entry Internal 'THERAPY': '<S1>:3867' */
    if (localB->Infusion_Inhibit || (localB->Highest_Level_Alarm >= 3)) {
      /* Transition: '<S1>:3994' */
      localDW->is_THERAPY = INFUSION_MGR_Functional_IN_PAUSED;
      INFUSION_MGR_Functional_enter_internal_PAUSED(localB, localDW);
    } else {
      /* Transition: '<S1>:3875' */
      localDW->is_THERAPY = INFUSION_MGR_Functional_IN_ACTIVE;
      INFUSION_MGR_Functional_enter_internal_ACTIVE(localB, localDW);
    }
  } else {
    if (((real_T)localB->IM_OUT_Actual_Infusion_Duration >=
         INFUSION_MGR_Functional_Step_Scaling_Factor((uint8_T)
          (localB->Infusion_Total_Duration - 1))) || (localB->Volume_Infused >=
         localB->VTBI_Total)) 
         {
      /* Transition: '<S1>:3865' */
      /* Exit Internal 'THERAPY': '<S1>:3867' */
      switch (localDW->is_THERAPY) {
       case INFUSION_MGR_Functional_IN_ACTIVE:
        INFUSION_MGR_Functional_exit_internal_ACTIVE(localDW);
        localDW->is_THERAPY = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
        break;

       case INFUSION_MGR_Functional_IN_PAUSED:
        INFUSION_MGR_Functional_exit_internal_PAUSED(localB, localDW);
        localDW->is_THERAPY = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
        break;

       default:
        localDW->is_THERAPY = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
        break;
      }

      /* Exit 'THERAPY': '<S1>:3867' */
      INFUSION_MGR_Functional_TherapyExitOperations(localB);
      localDW->is_Infusion_Manager = INFUSION_MGR_Functional_IN_IDLE;

      /* Entry 'IDLE': '<S1>:3866' */
      localB->IM_OUT_Current_System_Mode = 1U;
      localB->IM_OUT_Flow_Rate_Commanded = 0U;
      INFUSION_MGR_Functional_resetAllInfusionDetails(localB, localDW);
    } else {
      localB->IM_OUT_New_Infusion = FALSE;
      if (localDW->is_THERAPY == INFUSION_MGR_Functional_IN_ACTIVE) {
        /* During 'ACTIVE': '<S1>:3905' */
        if (localB->Infusion_Inhibit || (localB->Highest_Level_Alarm >= 3)) {
          /* Transition: '<S1>:3871' */
          INFUSION_MGR_Functional_exit_internal_ACTIVE(localDW);
          localDW->is_THERAPY = INFUSION_MGR_Functional_IN_PAUSED;
          INFUSION_MGR_Functional_enter_internal_PAUSED(localB, localDW);
        } else {
          /* During 'BASAL': '<S1>:3907' */
          if (localDW->is_BASAL == INFUSION_MGR_Functional_IN_OFF) {
            /* During 'OFF': '<S1>:3912' */
            if (localB->Infusion_Initiate) {
              /* Transition: '<S1>:3909' */
              localDW->is_BASAL = INFUSION_MGR_Functional_IN_ON;
            }
          } else {
            /* During 'ON': '<S1>:3911' */
            if ((real_T)localB->IM_OUT_Actual_Infusion_Duration >=
                INFUSION_MGR_Functional_Step_Scaling_Factor((uint8_T)
                 (localB->Infusion_Total_Duration - 1))) {
              /* Transition: '<S1>:3910' */
              localDW->is_BASAL = INFUSION_MGR_Functional_IN_OFF;
            }
          }

          /* During 'PATIENT': '<S1>:3927' */
          switch (localDW->is_PATIENT) {
           case INFUSION_MGR_Functional_IN_LOCKOUT:
            /* During 'LOCKOUT': '<S1>:3935' */
            if ((real_T)localDW->lock_timer >=
                INFUSION_MGR_Functional_Step_Scaling_Factor((uint8_T)
                 (localB->Lockout_Period_Patient_Bolus - 1))) {
              /* Transition: '<S1>:3931' */
              localDW->is_PATIENT = INFUSION_MGR_Functional_IN_OFF_b;

              /* Entry 'OFF': '<S1>:3933' */
              localDW->pbolus_timer = 0U;
              localDW->inPatientBolus = FALSE;
            } else {
              localDW->lock_timer++;
            }
            break;

           case INFUSION_MGR_Functional_IN_OFF_b:
            /* During 'OFF': '<S1>:3933' */
            if (localB->Patient_Bolus_Request && (localB->Highest_Level_Alarm <
                 2) && (localDW->number_pbolus <
                        localB->Max_Number_of_Patient_Bolus)) {
              /* Transition: '<S1>:3929' */
              localDW->is_PATIENT = INFUSION_MGR_Functional_IN_ON_b;

              /* Entry 'ON': '<S1>:3934' */
              localDW->number_pbolus++;
              localDW->inPatientBolus = TRUE;
              localDW->pbolus_timer++;
            }
            break;

           default:
            /* During 'ON': '<S1>:3934' */
            if (((real_T)localDW->pbolus_timer >=
                 INFUSION_MGR_Functional_Step_Scaling_Factor((uint8_T)
                  (localB->Duration_Patient_Bolus - 1))) ||
                (localB->Highest_Level_Alarm == 2)) {
              /* Transition: '<S1>:3932' */
              localDW->lock_timer = 0U;

              /* Exit 'ON': '<S1>:3934' */
              localDW->pbolus_timer++;
              localDW->is_PATIENT = INFUSION_MGR_Functional_IN_LOCKOUT;

              /* Entry 'LOCKOUT': '<S1>:3935' */
              localDW->lock_timer++;
            } else {
              localDW->pbolus_timer++;
            }
            break;
          }

          /* During 'INTERMITTENT': '<S1>:3936' */
          localDW->sbolusInter_timer++;
          if (localDW->is_INTERMITTENT == INFUSION_MGR_Functional_IN_OFF) {
            /* During 'OFF': '<S1>:3940' */
            if (localDW->sbolus_req && (localB->Highest_Level_Alarm < 2)) {
              /* Transition: '<S1>:3938' */
              localDW->is_INTERMITTENT = INFUSION_MGR_Functional_IN_ON;
            } else {
              localDW->sbolus_req = (INFUSION_MGR_Functional_sbolus_trigger
                (localB, localDW) != 0.0);
            }
          } else {
            /* During 'ON': '<S1>:3941' */
            if (((real_T)localDW->sbolus_timer >=
                 INFUSION_MGR_Functional_Step_Scaling_Factor((uint8_T)
                  (localB->Duration_Intermittent_Bolus - 1))) ||
                (localB->Highest_Level_Alarm == 2)) {
              /* Transition: '<S1>:3939' */
              /* Exit 'ON': '<S1>:3941' */
              localDW->is_INTERMITTENT = INFUSION_MGR_Functional_IN_OFF;

              /* Entry 'OFF': '<S1>:3940' */
              localDW->sbolus_timer = 0U;
              localDW->sbolus_req = FALSE;
              localDW->sbolus_req = (INFUSION_MGR_Functional_sbolus_trigger
                (localB, localDW) != 0.0);
            } else {
              localDW->sbolus_timer++;
              localDW->sbolus_req = FALSE;
            }
          }

          /* During 'Arbiter': '<S1>:3913' */
          switch (localDW->is_Arbiter_d) {
           case INFUSION_MGR_Functional_IN_Basal:
            /* During 'Basal': '<S1>:3926' */
            /* Transition: '<S1>:3923' */
            /* Transition: '<S1>:3920' */
            localB->IM_OUT_Actual_Infusion_Duration++;

            /* Transition: '<S1>:4002' */
            if (localDW->is_PATIENT == INFUSION_MGR_Functional_IN_ON_b) {
              /* Transition: '<S1>:3917' */
              localDW->is_Arbiter_d = INFUSION_MGR_Functional_IN_Patient_Bolus;

              /* Entry 'Patient_Bolus': '<S1>:3924' */
              localB->IM_OUT_Flow_Rate_Commanded =
                localB->Flow_Rate_Patient_Bolus;
              localB->IM_OUT_Current_System_Mode = 4U;
            } else if (localDW->is_INTERMITTENT == INFUSION_MGR_Functional_IN_ON)
            {
              /* Transition: '<S1>:3918' */
              localDW->is_Arbiter_d =
                INFUSION_MGR_Functional_IN_Intermittent_Bolus;

              /* Entry 'Intermittent_Bolus': '<S1>:3925' */
              localB->IM_OUT_Flow_Rate_Commanded =
                localB->Flow_Rate_Intermittent_Bolus;
              localB->IM_OUT_Current_System_Mode = 3U;
            } else {
              /* Transition: '<S1>:3919' */
              localDW->is_Arbiter_d = INFUSION_MGR_Functional_IN_Basal;

              /* Entry 'Basal': '<S1>:3926' */
              localB->IM_OUT_Flow_Rate_Commanded = localB->Flow_Rate_Basal;
              localB->IM_OUT_Current_System_Mode = 2U;
            }
            break;

           case INFUSION_MGR_Functional_IN_Intermittent_Bolus:
            /* During 'Intermittent_Bolus': '<S1>:3925' */
            /* Transition: '<S1>:3922' */
            /* Transition: '<S1>:3920' */
            localB->IM_OUT_Actual_Infusion_Duration++;

            /* Transition: '<S1>:4002' */
            if (localDW->is_PATIENT == INFUSION_MGR_Functional_IN_ON_b) {
              /* Transition: '<S1>:3917' */
              localDW->is_Arbiter_d = INFUSION_MGR_Functional_IN_Patient_Bolus;

              /* Entry 'Patient_Bolus': '<S1>:3924' */
              localB->IM_OUT_Flow_Rate_Commanded =
                localB->Flow_Rate_Patient_Bolus;
              localB->IM_OUT_Current_System_Mode = 4U;
            } else if (localDW->is_INTERMITTENT == INFUSION_MGR_Functional_IN_ON)
            {
              /* Transition: '<S1>:3918' */
              localDW->is_Arbiter_d =
                INFUSION_MGR_Functional_IN_Intermittent_Bolus;

              /* Entry 'Intermittent_Bolus': '<S1>:3925' */
              localB->IM_OUT_Flow_Rate_Commanded =
                localB->Flow_Rate_Intermittent_Bolus;
              localB->IM_OUT_Current_System_Mode = 3U;
            } else {
              /* Transition: '<S1>:3919' */
              localDW->is_Arbiter_d = INFUSION_MGR_Functional_IN_Basal;

              /* Entry 'Basal': '<S1>:3926' */
              localB->IM_OUT_Flow_Rate_Commanded = localB->Flow_Rate_Basal;
              localB->IM_OUT_Current_System_Mode = 2U;
            }
            break;

           default:
            /* During 'Patient_Bolus': '<S1>:3924' */
            /* Transition: '<S1>:3921' */
            /* Transition: '<S1>:3920' */
            localB->IM_OUT_Actual_Infusion_Duration++;

            /* Transition: '<S1>:4002' */
            if (localDW->is_PATIENT == INFUSION_MGR_Functional_IN_ON_b) {
              /* Transition: '<S1>:3917' */
              localDW->is_Arbiter_d = INFUSION_MGR_Functional_IN_Patient_Bolus;

              /* Entry 'Patient_Bolus': '<S1>:3924' */
              localB->IM_OUT_Flow_Rate_Commanded =
                localB->Flow_Rate_Patient_Bolus;
              localB->IM_OUT_Current_System_Mode = 4U;
            } else if (localDW->is_INTERMITTENT == INFUSION_MGR_Functional_IN_ON)
            {
              /* Transition: '<S1>:3918' */
              localDW->is_Arbiter_d =
                INFUSION_MGR_Functional_IN_Intermittent_Bolus;

              /* Entry 'Intermittent_Bolus': '<S1>:3925' */
              localB->IM_OUT_Flow_Rate_Commanded =
                localB->Flow_Rate_Intermittent_Bolus;
              localB->IM_OUT_Current_System_Mode = 3U;
            } else {
              /* Transition: '<S1>:3919' */
              localDW->is_Arbiter_d = INFUSION_MGR_Functional_IN_Basal;

              /* Entry 'Basal': '<S1>:3926' */
              localB->IM_OUT_Flow_Rate_Commanded = localB->Flow_Rate_Basal;
              localB->IM_OUT_Current_System_Mode = 2U;
            }
            break;
          }
        }
      } else {
        /* During 'PAUSED': '<S1>:3876' */
        if (localB->Infusion_Initiate && (localB->Highest_Level_Alarm < 3) &&
            (!localB->Infusion_Inhibit)) {
          /* Transition: '<S1>:3870' */
          INFUSION_MGR_Functional_exit_internal_PAUSED(localB, localDW);
          localDW->is_THERAPY = INFUSION_MGR_Functional_IN_ACTIVE;
          INFUSION_MGR_Functional_enter_internal_ACTIVE(localB, localDW);
        } else {
          /* During 'Alarm_Paused': '<S1>:3893' */
          if (localDW->is_Alarm_Paused == INFUSION_MGR_Functional_IN_OFF) {
            /* During 'OFF': '<S1>:3897' */
            if (localB->Highest_Level_Alarm >= 3) {
              /* Transition: '<S1>:3895' */
              localDW->is_Alarm_Paused = INFUSION_MGR_Functional_IN_ON;
            }
          } else {
            /* During 'ON': '<S1>:3898' */
            if (localB->Infusion_Initiate && (localB->Highest_Level_Alarm < 3))
            {
              /* Transition: '<S1>:3896' */
              localDW->is_Alarm_Paused = INFUSION_MGR_Functional_IN_OFF;
            }
          }

          /* During 'Manual_Paused': '<S1>:3899' */
          if (localDW->is_Manual_Paused == INFUSION_MGR_Functional_IN_OFF) {
            /* During 'OFF': '<S1>:3903' */
            if (localB->Infusion_Inhibit) {
              /* Transition: '<S1>:3901' */
              localDW->is_Manual_Paused = INFUSION_MGR_Functional_IN_ON;
            }
          } else {
            /* During 'ON': '<S1>:3904' */
            if (localB->Infusion_Initiate && (!localB->Infusion_Inhibit)) {
              /* Transition: '<S1>:3902' */
              localDW->is_Manual_Paused = INFUSION_MGR_Functional_IN_OFF;
            }
          }

          /* During 'Arbiter': '<S1>:3877' */
          switch (localDW->is_Arbiter) {
           case INFUSION_MGR_Functional_IN_Manual_Paused_KVO:
            /* During 'Manual_Paused_KVO': '<S1>:3892' */
            /* Transition: '<S1>:3888' */
            /* Transition: '<S1>:3889' */
            /* Transition: '<S1>:3885' */
            if ((localDW->is_Alarm_Paused == INFUSION_MGR_Functional_IN_ON) &&
                (localB->Highest_Level_Alarm == 4)) {
              /* Transition: '<S1>:3882' */
              /* Exit 'Manual_Paused_KVO': '<S1>:3892' */
              localDW->is_Arbiter = INFUSION_MGR_Functional_IN_Paused_NoKVO;

              /* Entry 'Paused_NoKVO': '<S1>:3890' */
              localB->IM_OUT_Flow_Rate_Commanded = 0U;
              localB->IM_OUT_Current_System_Mode = 6U;
            } else if ((localDW->is_Alarm_Paused ==
                        INFUSION_MGR_Functional_IN_ON) &&
                       (localB->Highest_Level_Alarm == 3)) {
              /* Transition: '<S1>:3884' */
              /* Exit 'Manual_Paused_KVO': '<S1>:3892' */
              localDW->is_Arbiter = INFUSION_MGR_Functional_IN_Paused_KVO;

              /* Entry 'Paused_KVO': '<S1>:3891' */
              localB->IM_OUT_Flow_Rate_Commanded = localB->Flow_Rate_KVO;
              localB->IM_OUT_Current_System_Mode = 7U;
            } else {
              /* Transition: '<S1>:3883' */
              /* Exit 'Manual_Paused_KVO': '<S1>:3892' */
              localDW->is_Arbiter = INFUSION_MGR_Functional_IN_Manual_Paused_KVO;

              /* Entry 'Manual_Paused_KVO': '<S1>:3892' */
              localB->IM_OUT_Flow_Rate_Commanded = localB->Flow_Rate_KVO;
              localB->IM_OUT_Current_System_Mode = 8U;
            }
            break;

           case INFUSION_MGR_Functional_IN_Paused_KVO:
            /* During 'Paused_KVO': '<S1>:3891' */
            /* Transition: '<S1>:3887' */
            /* Transition: '<S1>:3889' */
            /* Transition: '<S1>:3885' */
            if ((localDW->is_Alarm_Paused == INFUSION_MGR_Functional_IN_ON) &&
                (localB->Highest_Level_Alarm == 4)) {
              /* Transition: '<S1>:3882' */
              /* Exit 'Paused_KVO': '<S1>:3891' */
              localDW->is_Arbiter = INFUSION_MGR_Functional_IN_Paused_NoKVO;

              /* Entry 'Paused_NoKVO': '<S1>:3890' */
              localB->IM_OUT_Flow_Rate_Commanded = 0U;
              localB->IM_OUT_Current_System_Mode = 6U;
            } else if ((localDW->is_Alarm_Paused ==
                        INFUSION_MGR_Functional_IN_ON) &&
                       (localB->Highest_Level_Alarm == 3)) {
              /* Transition: '<S1>:3884' */
              /* Exit 'Paused_KVO': '<S1>:3891' */
              localDW->is_Arbiter = INFUSION_MGR_Functional_IN_Paused_KVO;

              /* Entry 'Paused_KVO': '<S1>:3891' */
              localB->IM_OUT_Flow_Rate_Commanded = localB->Flow_Rate_KVO;
              localB->IM_OUT_Current_System_Mode = 7U;
            } else {
              /* Transition: '<S1>:3883' */
              /* Exit 'Paused_KVO': '<S1>:3891' */
              localDW->is_Arbiter = INFUSION_MGR_Functional_IN_Manual_Paused_KVO;

              /* Entry 'Manual_Paused_KVO': '<S1>:3892' */
              localB->IM_OUT_Flow_Rate_Commanded = localB->Flow_Rate_KVO;
              localB->IM_OUT_Current_System_Mode = 8U;
            }
            break;

           default:
            /* During 'Paused_NoKVO': '<S1>:3890' */
            /* Transition: '<S1>:3886' */
            /* Transition: '<S1>:3889' */
            /* Transition: '<S1>:3885' */
            if ((localDW->is_Alarm_Paused == INFUSION_MGR_Functional_IN_ON) &&
                (localB->Highest_Level_Alarm == 4)) {
              /* Transition: '<S1>:3882' */
              /* Exit 'Paused_NoKVO': '<S1>:3890' */
              localDW->is_Arbiter = INFUSION_MGR_Functional_IN_Paused_NoKVO;

              /* Entry 'Paused_NoKVO': '<S1>:3890' */
              localB->IM_OUT_Flow_Rate_Commanded = 0U;
              localB->IM_OUT_Current_System_Mode = 6U;
            } else if ((localDW->is_Alarm_Paused ==
                        INFUSION_MGR_Functional_IN_ON) &&
                       (localB->Highest_Level_Alarm == 3)) {
              /* Transition: '<S1>:3884' */
              /* Exit 'Paused_NoKVO': '<S1>:3890' */
              localDW->is_Arbiter = INFUSION_MGR_Functional_IN_Paused_KVO;

              /* Entry 'Paused_KVO': '<S1>:3891' */
              localB->IM_OUT_Flow_Rate_Commanded = localB->Flow_Rate_KVO;
              localB->IM_OUT_Current_System_Mode = 7U;
            } else {
              /* Transition: '<S1>:3883' */
              /* Exit 'Paused_NoKVO': '<S1>:3890' */
              localDW->is_Arbiter = INFUSION_MGR_Functional_IN_Manual_Paused_KVO;

              /* Entry 'Manual_Paused_KVO': '<S1>:3892' */
              localB->IM_OUT_Flow_Rate_Commanded = localB->Flow_Rate_KVO;
              localB->IM_OUT_Current_System_Mode = 8U;
            }
            break;
          }
        }
      }
    }
  }
}

/* Initial conditions for referenced model: 'INFUSION_MGR_Functional' */
void INFUSION_MGR_Functional_Init(B_INFUSION_MGR_Functional_c_T *localB,
  DW_INFUSION_MGR_Functional_f_T *localDW)
{
  /* InitializeConditions for Chart: '<Root>/Infusion Manager Sub-System' */
  localDW->is_Infusion_Manager = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_THERAPY = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_Arbiter_c = 0U;
  localDW->is_Arbiter_d = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_BASAL = 0U;
  localDW->is_BASAL = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_INTERMITTENT = 0U;
  localDW->is_INTERMITTENT = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_PATIENT = 0U;
  localDW->is_PATIENT = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_Alarm_Paused = 0U;
  localDW->is_Alarm_Paused = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_Arbiter = 0U;
  localDW->is_Arbiter = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_Manual_Paused = 0U;
  localDW->is_Manual_Paused = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_c2_INFUSION_MGR_Functional = 0U;
  localDW->is_c2_INFUSION_MGR_Functional =
    INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
  localDW->sbolus_req = FALSE;
  localDW->sbolus_timer = 0U;
  localDW->pbolus_timer = 0U;
  localDW->lock_timer = 0U;
  localDW->number_pbolus = 0U;
  localDW->inPatientBolus = FALSE;
  localDW->sbolusInter_timer = 0U;
  localB->IM_OUT_Flow_Rate_Commanded = 0U;
  localB->IM_OUT_Current_System_Mode = 0U;
  localB->IM_OUT_New_Infusion = FALSE;
  localB->IM_OUT_Log_Message_ID = 0U;
  localB->IM_OUT_Actual_Infusion_Duration = 0U;
}

/* Output and update for referenced model: 'INFUSION_MGR_Functional' */
void INFUSION_MGR_Functional(const Top_Level_Mode_Outputs *rtu_TLM_MODE_IN,
  const Operator_Commands *rtu_OP_CMD_IN, const Patient_Inputs *rtu_PATIENT_IN,
  const Config_Outputs *rtu_CONFIG_IN, const Alarm_Outputs *rtu_ALARM_IN, const
  System_Status_Outputs *rtu_SYS_STAT_IN, Infusion_Manager_Outputs *rty_IM_OUT,
  B_INFUSION_MGR_Functional_c_T *localB, DW_INFUSION_MGR_Functional_f_T *localDW)
{
  /* BusSelector: '<Root>/BusConversion_InsertedFor_ALARM_IN_at_outport_0' */
  localB->Highest_Level_Alarm = rtu_ALARM_IN->Highest_Level_Alarm;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_CONFIG_IN_at_outport_0' */
  localB->Infusion_Total_Duration = rtu_CONFIG_IN->Infusion_Total_Duration;
  localB->VTBI_Total = rtu_CONFIG_IN->VTBI_Total;
  localB->Flow_Rate_Basal = rtu_CONFIG_IN->Flow_Rate_Basal;
  localB->Flow_Rate_Intermittent_Bolus =
    rtu_CONFIG_IN->Flow_Rate_Intermittent_Bolus;
  localB->Duration_Intermittent_Bolus =
    rtu_CONFIG_IN->Duration_Intermittent_Bolus;
  localB->Interval_Intermittent_Bolus =
    rtu_CONFIG_IN->Interval_Intermittent_Bolus;
  localB->Flow_Rate_Patient_Bolus = rtu_CONFIG_IN->Flow_Rate_Patient_Bolus;
  localB->Duration_Patient_Bolus = rtu_CONFIG_IN->Duration_Patient_Bolus;
  localB->Lockout_Period_Patient_Bolus =
    rtu_CONFIG_IN->Lockout_Period_Patient_Bolus;
  localB->Max_Number_of_Patient_Bolus =
    rtu_CONFIG_IN->Max_Number_of_Patient_Bolus;
  localB->Flow_Rate_KVO = rtu_CONFIG_IN->Flow_Rate_KVO;
  localB->Configured = rtu_CONFIG_IN->Configured;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_OP_CMD_IN_at_outport_0' */
  localB->Infusion_Initiate = rtu_OP_CMD_IN->Infusion_Initiate;
  localB->Infusion_Inhibit = rtu_OP_CMD_IN->Infusion_Inhibit;
  localB->Infusion_Cancel = rtu_OP_CMD_IN->Infusion_Cancel;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_PATIENT_IN_at_outport_0' */
  localB->Patient_Bolus_Request = rtu_PATIENT_IN->Patient_Bolus_Request;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_SYS_STAT_IN_at_outport_0' */
  localB->Reservoir_Empty = rtu_SYS_STAT_IN->Reservoir_Empty;
  localB->Volume_Infused = rtu_SYS_STAT_IN->Volume_Infused;

  /* Chart: '<Root>/Infusion Manager Sub-System' incorporates:
   *  BusSelector: '<Root>/BusConversion_InsertedFor_TLM_MODE_IN_at_outport_0'
   */
  /* Gateway: Infusion Manager Sub-System */
  /* During: Infusion Manager Sub-System */
  DB_PRINTF("10: ");
  if (localDW->is_active_c2_INFUSION_MGR_Functional == 0U) {
    /* Entry: Infusion Manager Sub-System */
    DB_PRINTF("11: ");
    localDW->is_active_c2_INFUSION_MGR_Functional = 1U;

    /* Entry Internal: Infusion Manager Sub-System */
    if (rtu_TLM_MODE_IN->System_On) {
      /* Transition: '<S1>:3986' */
      localDW->is_c2_INFUSION_MGR_Functional =
        INFUSION_MGR_Functional_IN_Infusion_Manager;

      /* Entry Internal 'Infusion_Manager': '<S1>:3858' */
      /* Transition: '<S1>:3860' */
      localDW->is_Infusion_Manager = INFUSION_MGR_Functional_IN_IDLE;

      /* Entry 'IDLE': '<S1>:3866' */
      localB->IM_OUT_Current_System_Mode = 1U;
      localB->IM_OUT_Flow_Rate_Commanded = 0U;
      INFUSION_MGR_Functional_resetAllInfusionDetails(localB, localDW);
    } else {
      /* Transition: '<S1>:3744' */
      localDW->is_c2_INFUSION_MGR_Functional = INFUSION_MGR_Functional_IN_NOT_ON;

      /* Entry 'NOT_ON': '<S1>:3740' */
      localB->IM_OUT_Current_System_Mode = 0U;
      localB->IM_OUT_Flow_Rate_Commanded = 0U;
    }
  } else if (localDW->is_c2_INFUSION_MGR_Functional ==
             INFUSION_MGR_Functional_IN_Infusion_Manager) {
    /* During 'Infusion_Manager': '<S1>:3858' */
    DB_PRINTF("12: ");
    if (!rtu_TLM_MODE_IN->System_On) {
      /* Transition: '<S1>:3732' */
      /* Exit Internal 'Infusion_Manager': '<S1>:3858' */
      switch (localDW->is_Infusion_Manager) {
       case INFUSION_MGR_Functional_IN_IDLE:
        /* Exit 'IDLE': '<S1>:3866' */
        localB->IM_OUT_Current_System_Mode = 1U;
        localB->IM_OUT_Flow_Rate_Commanded = 0U;
        INFUSION_MGR_Functional_resetAllInfusionDetails(localB, localDW);
        localDW->is_Infusion_Manager =
          INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
        break;

       case INFUSION_MGR_Functional_IN_THERAPY:
        /* Exit Internal 'THERAPY': '<S1>:3867' */
        switch (localDW->is_THERAPY) {
         case INFUSION_MGR_Functional_IN_ACTIVE:
          INFUSION_MGR_Functional_exit_internal_ACTIVE(localDW);
          localDW->is_THERAPY = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
          break;

         case INFUSION_MGR_Functional_IN_PAUSED:
          INFUSION_MGR_Functional_exit_internal_PAUSED(localB, localDW);
          localDW->is_THERAPY = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
          break;

         default:
          localDW->is_THERAPY = INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
          break;
        }

        /* Exit 'THERAPY': '<S1>:3867' */
        INFUSION_MGR_Functional_TherapyExitOperations(localB);
        localDW->is_Infusion_Manager =
          INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
        break;

       default:
        localDW->is_Infusion_Manager =
          INFUSION_MGR_Functional_IN_NO_ACTIVE_CHILD;
        break;
      }

      localDW->is_c2_INFUSION_MGR_Functional = INFUSION_MGR_Functional_IN_NOT_ON;

      /* Entry 'NOT_ON': '<S1>:3740' */
      localB->IM_OUT_Current_System_Mode = 0U;
      localB->IM_OUT_Flow_Rate_Commanded = 0U;
    } else if (localDW->is_Infusion_Manager == INFUSION_MGR_Functional_IN_IDLE)
    {
    DB_PRINTF("13: ");
    	DB_PRINTF("2: %d %d %d ",localB->Infusion_Initiate, localB->Configured ,localB->Reservoir_Empty);
      /* During 'IDLE': '<S1>:3866' */
      if (localB->Infusion_Cancel || localB->Infusion_Inhibit) {
    DB_PRINTF("30: ");
        /* Transition: '<S1>:3993' */
        /* Exit 'IDLE': '<S1>:3866' */
        localB->IM_OUT_Current_System_Mode = 1U;
        localB->IM_OUT_Flow_Rate_Commanded = 0U;
        INFUSION_MGR_Functional_resetAllInfusionDetails(localB, localDW);
        localDW->is_Infusion_Manager = INFUSION_MGR_Functional_IN_IDLE;

        /* Entry 'IDLE': '<S1>:3866' */
        localB->IM_OUT_Current_System_Mode = 1U;
        localB->IM_OUT_Flow_Rate_Commanded = 0U;
        INFUSION_MGR_Functional_resetAllInfusionDetails(localB, localDW);
      } else if (localB->Infusion_Initiate && (localB->Configured > 0) &&
                 (!localB->Reservoir_Empty)) {
    DB_PRINTF("31: ");
        /* Transition: '<S1>:3864' */
        INFUSION_MGR_Functional_resetAllInfusionDetails(localB, localDW);

        /* Transition: '<S1>:3863' */
        localB->IM_OUT_New_Infusion = TRUE;

        /* Exit 'IDLE': '<S1>:3866' */
        localB->IM_OUT_Current_System_Mode = 1U;
        localB->IM_OUT_Flow_Rate_Commanded = 0U;
        INFUSION_MGR_Functional_resetAllInfusionDetails(localB, localDW);
        localDW->is_Infusion_Manager = INFUSION_MGR_Functional_IN_THERAPY;

        /* Entry Internal 'THERAPY': '<S1>:3867' */
        if (localB->Infusion_Inhibit || (localB->Highest_Level_Alarm >= 3)) {
          /* Transition: '<S1>:3994' */
          localDW->is_THERAPY = INFUSION_MGR_Functional_IN_PAUSED;
          INFUSION_MGR_Functional_enter_internal_PAUSED(localB, localDW);
        } else {
          /* Transition: '<S1>:3875' */
          localDW->is_THERAPY = INFUSION_MGR_Functional_IN_ACTIVE;
          INFUSION_MGR_Functional_enter_internal_ACTIVE(localB, localDW);
        }
      } else {
    DB_PRINTF("32: ");
        localB->IM_OUT_Current_System_Mode = 1U;
        localB->IM_OUT_Flow_Rate_Commanded = 0U;
      }
    } else {
    DB_PRINTF("14: ");
      INFUSION_MGR_Functional_THERAPY(localB, localDW);
    }
  } else {
    DB_PRINTF("20: ");
    /* During 'NOT_ON': '<S1>:3740' */
    if (rtu_TLM_MODE_IN->System_On) {
      /* Transition: '<S1>:3741' */
      /* Exit 'NOT_ON': '<S1>:3740' */
      localDW->is_c2_INFUSION_MGR_Functional =
        INFUSION_MGR_Functional_IN_Infusion_Manager;

      /* Entry Internal 'Infusion_Manager': '<S1>:3858' */
      /* Transition: '<S1>:3860' */
      localDW->is_Infusion_Manager = INFUSION_MGR_Functional_IN_IDLE;

      /* Entry 'IDLE': '<S1>:3866' */
      localB->IM_OUT_Current_System_Mode = 1U;
      localB->IM_OUT_Flow_Rate_Commanded = 0U;
      INFUSION_MGR_Functional_resetAllInfusionDetails(localB, localDW);
    } else {
      localB->IM_OUT_Current_System_Mode = 0U;
      localB->IM_OUT_Flow_Rate_Commanded = 0U;
    }
  }

  /* End of Chart: '<Root>/Infusion Manager Sub-System' */

  /* BusCreator: '<Root>/BusConversion_InsertedFor_IM_OUT_at_inport_0' */
  rty_IM_OUT->Commanded_Flow_Rate = localB->IM_OUT_Flow_Rate_Commanded;
  rty_IM_OUT->Current_System_Mode = localB->IM_OUT_Current_System_Mode;
  rty_IM_OUT->New_Infusion = localB->IM_OUT_New_Infusion;
  rty_IM_OUT->Log_Message_ID = localB->IM_OUT_Log_Message_ID;
  rty_IM_OUT->Actual_Infusion_Duration = localB->IM_OUT_Actual_Infusion_Duration;
}

/* Model initialize function */
void INFUSION_MGR_Functional_initialize(const char_T **rt_errorStatus,
  RT_MODEL_INFUSION_MGR_Functional_T *const INFUSION_MGR_Functional_M,
  B_INFUSION_MGR_Functional_c_T *localB, DW_INFUSION_MGR_Functional_f_T *localDW)
{
  /* Registration code */

  /* initialize error status */
  rtmSetErrorStatusPointer(INFUSION_MGR_Functional_M, rt_errorStatus);

  /* block I/O */
  (void) memset(((void *) localB), 0,
                sizeof(B_INFUSION_MGR_Functional_c_T));

  /* states (dwork) */
  (void) memset((void *)localDW, 0,
                sizeof(DW_INFUSION_MGR_Functional_f_T));
}
