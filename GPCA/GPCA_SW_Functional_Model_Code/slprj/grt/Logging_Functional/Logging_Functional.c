/*
 * Code generation for system model 'Logging_Functional'
 *
 * Model                      : Logging_Functional
 * Model version              : 1.1169
 * Simulink Coder version : 8.4 (R2013a) 13-Feb-2013
 * C source code generated on : Thu Sep 12 09:50:07 2013
 *
 * Note that the functions contained in this file are part of a Simulink
 * model, and are not self-contained algorithms.
 */

#include "Logging_Functional.h"
#include "Logging_Functional_private.h"

/* Named constants for Chart: '<Root>/Log Sub-System' */
#define Logging_Functional_IN_NOT_ON   ((uint8_T)1U)
#define Logging_Functional_IN_NO_ACTIVE_CHILD ((uint8_T)0U)
#define Logging_Functional_IN_TOP_Level_Mode ((uint8_T)2U)

/* Forward declaration for local functions */
static void Logging_Functional_writeLog(B_Logging_Functional_c_T *localB);

/* Function for Chart: '<Root>/Log Sub-System' */
static void Logging_Functional_writeLog(B_Logging_Functional_c_T *localB)
{
  /* Graphical Function 'writeLog': '<S1>:4055' */
  /* Transition: '<S1>:4059' */
  localB->LOGGING_OUT_Log = 0U;
  if ((localB->Log_Message_ID_n > 0) || (localB->Log_Message_ID_eue > 0) ||
      (localB->Log_Message_ID > 0) || (localB->Log_Message_ID_e > 0) ||
      (localB->Log_Message_ID_eu > 0)) {
    /* Transition: '<S1>:4057' */
    localB->LOGGING_OUT_Log = 1U;
  }
}

/* Initial conditions for referenced model: 'Logging_Functional' */
void Logging_Functional_Init(B_Logging_Functional_c_T *localB,
  DW_Logging_Functional_f_T *localDW)
{
  /* InitializeConditions for Chart: '<Root>/Log Sub-System' */
  localDW->is_active_c2_Logging_Functional = 0U;
  localDW->is_c2_Logging_Functional = Logging_Functional_IN_NO_ACTIVE_CHILD;
  localB->LOGGING_OUT_Log = 0U;
  localB->LOGGING_OUT_Logging_Failed = FALSE;
}

/* Output and update for referenced model: 'Logging_Functional' */
void Logging_Functional(const Top_Level_Mode_Outputs *rtu_TLM_MODE_IN, const
  Config_Outputs *rtu_CONFIG_IN, const Alarm_Outputs *rtu_ALARM_IN, const
  System_Status_Outputs *rtu_SYS_STAT_IN, const Infusion_Manager_Outputs
  *rtu_IM_IN, Log_Output *rty_LOG_OUT, B_Logging_Functional_c_T *localB,
  DW_Logging_Functional_f_T *localDW)
{
  /* BusSelector: '<Root>/BusConversion_InsertedFor_ALARM_IN_at_outport_0' */
  localB->Log_Message_ID = rtu_ALARM_IN->Log_Message_ID;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_CONFIG_IN_at_outport_0' */
  localB->Log_Message_ID_e = rtu_CONFIG_IN->Log_Message_ID;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_IM_IN_at_outport_0' */
  localB->Log_Message_ID_eu = rtu_IM_IN->Log_Message_ID;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_TLM_MODE_IN_at_outport_0' */
  localB->Log_Message_ID_n = rtu_TLM_MODE_IN->Log_Message_ID;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_SYS_STAT_IN_at_outport_0' */
  localB->Log_Message_ID_eue = rtu_SYS_STAT_IN->Log_Message_ID;

  /* Chart: '<Root>/Log Sub-System' incorporates:
   *  BusSelector: '<Root>/BusConversion_InsertedFor_TLM_MODE_IN_at_outport_0'
   */
  /* Gateway: Log Sub-System */
  /* During: Log Sub-System */
  if (localDW->is_active_c2_Logging_Functional == 0U) {
    /* Entry: Log Sub-System */
    localDW->is_active_c2_Logging_Functional = 1U;

    /* Entry Internal: Log Sub-System */
    if (rtu_TLM_MODE_IN->System_On) {
      /* Transition: '<S1>:4040' */
      localDW->is_c2_Logging_Functional = Logging_Functional_IN_TOP_Level_Mode;

      /* Entry 'TOP_Level_Mode': '<S1>:4024' */
      localB->LOGGING_OUT_Logging_Failed = FALSE;
      Logging_Functional_writeLog(localB);
    } else {
      /* Transition: '<S1>:4038' */
      localDW->is_c2_Logging_Functional = Logging_Functional_IN_NOT_ON;

      /* Entry 'NOT_ON': '<S1>:4034' */
      localB->LOGGING_OUT_Log = 0U;
    }
  } else if (localDW->is_c2_Logging_Functional == Logging_Functional_IN_NOT_ON)
  {
    /* During 'NOT_ON': '<S1>:4034' */
    if (rtu_TLM_MODE_IN->System_On) {
      /* Transition: '<S1>:4042' */
      /* Exit 'NOT_ON': '<S1>:4034' */
      localB->LOGGING_OUT_Log = 0U;
      localDW->is_c2_Logging_Functional = Logging_Functional_IN_TOP_Level_Mode;

      /* Entry 'TOP_Level_Mode': '<S1>:4024' */
      localB->LOGGING_OUT_Logging_Failed = FALSE;
      Logging_Functional_writeLog(localB);
    } else {
      localB->LOGGING_OUT_Log = 0U;
    }
  } else {
    /* During 'TOP_Level_Mode': '<S1>:4024' */
    if (!rtu_TLM_MODE_IN->System_On) {
      /* Transition: '<S1>:4039' */
      /* Exit 'TOP_Level_Mode': '<S1>:4024' */
      localB->LOGGING_OUT_Logging_Failed = FALSE;
      Logging_Functional_writeLog(localB);
      localDW->is_c2_Logging_Functional = Logging_Functional_IN_NOT_ON;

      /* Entry 'NOT_ON': '<S1>:4034' */
      localB->LOGGING_OUT_Log = 0U;
    } else {
      localB->LOGGING_OUT_Logging_Failed = FALSE;
      Logging_Functional_writeLog(localB);
    }
  }

  /* End of Chart: '<Root>/Log Sub-System' */

  /* BusCreator: '<Root>/BusConversion_InsertedFor_LOG_OUT_at_inport_0' */
  rty_LOG_OUT->Log = localB->LOGGING_OUT_Log;
  rty_LOG_OUT->Logging_Failed = localB->LOGGING_OUT_Logging_Failed;
}

/* Model initialize function */
void Logging_Functional_initialize(const char_T **rt_errorStatus,
  RT_MODEL_Logging_Functional_T *const Logging_Functional_M,
  B_Logging_Functional_c_T *localB, DW_Logging_Functional_f_T *localDW)
{
  /* Registration code */

  /* initialize error status */
  rtmSetErrorStatusPointer(Logging_Functional_M, rt_errorStatus);

  /* block I/O */
  (void) memset(((void *) localB), 0,
                sizeof(B_Logging_Functional_c_T));

  /* states (dwork) */
  (void) memset((void *)localDW, 0,
                sizeof(DW_Logging_Functional_f_T));
}
