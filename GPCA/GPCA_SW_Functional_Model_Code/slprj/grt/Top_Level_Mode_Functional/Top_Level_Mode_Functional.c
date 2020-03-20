/*
 * Code generation for system model 'Top_Level_Mode_Functional'
 *
 * Model                      : Top_Level_Mode_Functional
 * Model version              : 1.1167
 * Simulink Coder version : 8.4 (R2013a) 13-Feb-2013
 * C source code generated on : Thu Sep 12 09:50:34 2013
 *
 * Note that the functions contained in this file are part of a Simulink
 * model, and are not self-contained algorithms.
 */

#include "Top_Level_Mode_Functional.h"
#include "Top_Level_Mode_Functional_private.h"

/* Named constants for Chart: '<Root>/Top Level Mode Sub-System' */
#define Top_Level_Mode_Functional_IN_Confirm_Stop ((uint8_T)1U)
#define Top_Level_Mode_Functional_IN_NOT_ON ((uint8_T)1U)
#define Top_Level_Mode_Functional_IN_NO_ACTIVE_CHILD ((uint8_T)0U)
#define Top_Level_Mode_Functional_IN_OFF ((uint8_T)1U)
#define Top_Level_Mode_Functional_IN_ON ((uint8_T)2U)
#define Top_Level_Mode_Functional_IN_TOP_Level_Mode ((uint8_T)2U)

/* Forward declaration for local functions */
static void Top_Level_Mode_Functional_writeLog(uint8_T logEvent,
  B_Top_Level_Mode_Functional_c_T *localB);
static real_T Top_Level_Mode_Functional_Step_Scaling_Factor(uint8_T inputVal);

/* Function for Chart: '<Root>/Top Level Mode Sub-System' */
static void Top_Level_Mode_Functional_writeLog(uint8_T logEvent,
  B_Top_Level_Mode_Functional_c_T *localB)
{
  /* Graphical Function 'writeLog': '<S1>:4072' */
  /* Transition: '<S1>:4065' */
  localB->TLM_MODE_OUT_Log_Message_ID = logEvent;
}

/* Function for Chart: '<Root>/Top Level Mode Sub-System' */
static real_T Top_Level_Mode_Functional_Step_Scaling_Factor(uint8_T inputVal)
{
  /* Graphical Function 'Step_Scaling_Factor': '<S1>:4070' */
  /* Transition: '<S1>:4064' */
  return inputVal;
}

/* Initial conditions for referenced model: 'Top_Level_Mode_Functional' */
void Top_Level_Mode_Functional_Init(B_Top_Level_Mode_Functional_c_T *localB,
  DW_Top_Level_Mode_Functional_f_T *localDW)
{
  /* InitializeConditions for Chart: '<Root>/Top Level Mode Sub-System' */
  localDW->is_TOP_Level_Mode = Top_Level_Mode_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_Confirm_Stop = Top_Level_Mode_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_c2_Top_Level_Mode_Functional = 0U;
  localDW->is_c2_Top_Level_Mode_Functional =
    Top_Level_Mode_Functional_IN_NO_ACTIVE_CHILD;
  localDW->confirmStopTimer = 0.0;
  localB->TLM_MODE_OUT_Request_Confirm_Stop = FALSE;
  localB->TLM_MODE_OUT_Log_Message_ID = 0U;
}

/* Output and update for referenced model: 'Top_Level_Mode_Functional' */
void Top_Level_Mode_Functional(const Operator_Commands *rtu_OP_CMD_IN, const
  Device_Configuration_Inputs *rtu_CONST_IN, Top_Level_Mode_Outputs
  *rty_TLM_MODE_OUT, B_Top_Level_Mode_Functional_c_T *localB,
  DW_Top_Level_Mode_Functional_f_T *localDW)
{
  boolean_T System_Stop;
  boolean_T Cancel;
  boolean_T TLM_MODE_OUT_System_On;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_OP_CMD_IN_at_outport_0' */
  System_Stop = rtu_OP_CMD_IN->System_Stop;
  Cancel = rtu_OP_CMD_IN->Cancel;

  /* Chart: '<Root>/Top Level Mode Sub-System' incorporates:
   *  BusSelector: '<Root>/BusConversion_InsertedFor_CONST_IN_at_outport_0'
   *  BusSelector: '<Root>/BusConversion_InsertedFor_OP_CMD_IN_at_outport_0'
   */
  /* Gateway: Top Level Mode Sub-System */
  /* During: Top Level Mode Sub-System */
  if (localDW->is_active_c2_Top_Level_Mode_Functional == 0U) {
    /* Entry: Top Level Mode Sub-System */
    localDW->is_active_c2_Top_Level_Mode_Functional = 1U;

    /* Entry Internal: Top Level Mode Sub-System */
    if (rtu_OP_CMD_IN->System_Start) {
      /* Transition: '<S1>:4040' */
      localDW->is_c2_Top_Level_Mode_Functional =
        Top_Level_Mode_Functional_IN_TOP_Level_Mode;

      /* Entry 'TOP_Level_Mode': '<S1>:4024' */
      TLM_MODE_OUT_System_On = TRUE;

      /* Entry Internal 'TOP_Level_Mode': '<S1>:4024' */
      /* Transition: '<S1>:4056' */
      localDW->is_TOP_Level_Mode = Top_Level_Mode_Functional_IN_Confirm_Stop;

      /* Entry Internal 'Confirm_Stop': '<S1>:4050' */
      if (rtu_OP_CMD_IN->System_Stop) {
        /* Transition: '<S1>:4057' */
        localDW->is_Confirm_Stop = Top_Level_Mode_Functional_IN_ON;

        /* Entry 'ON': '<S1>:4055' */
        localB->TLM_MODE_OUT_Request_Confirm_Stop = TRUE;
        localDW->confirmStopTimer++;
      } else {
        /* Transition: '<S1>:4051' */
        localDW->is_Confirm_Stop = Top_Level_Mode_Functional_IN_OFF;

        /* Entry 'OFF': '<S1>:4054' */
        localB->TLM_MODE_OUT_Request_Confirm_Stop = FALSE;
        localDW->confirmStopTimer = 0.0;
      }
    } else {
      /* Transition: '<S1>:4038' */
      localDW->is_c2_Top_Level_Mode_Functional =
        Top_Level_Mode_Functional_IN_NOT_ON;

      /* Entry 'NOT_ON': '<S1>:4034' */
      TLM_MODE_OUT_System_On = FALSE;
    }
  } else if (localDW->is_c2_Top_Level_Mode_Functional ==
             Top_Level_Mode_Functional_IN_NOT_ON) {
    /* During 'NOT_ON': '<S1>:4034' */
    if (rtu_OP_CMD_IN->System_Start) {
      /* Transition: '<S1>:4042' */
      Top_Level_Mode_Functional_writeLog(1U, localB);

      /* Exit 'NOT_ON': '<S1>:4034' */
      localDW->is_c2_Top_Level_Mode_Functional =
        Top_Level_Mode_Functional_IN_TOP_Level_Mode;

      /* Entry 'TOP_Level_Mode': '<S1>:4024' */
      TLM_MODE_OUT_System_On = TRUE;

      /* Entry Internal 'TOP_Level_Mode': '<S1>:4024' */
      /* Transition: '<S1>:4056' */
      localDW->is_TOP_Level_Mode = Top_Level_Mode_Functional_IN_Confirm_Stop;

      /* Entry Internal 'Confirm_Stop': '<S1>:4050' */
      if (System_Stop) {
        /* Transition: '<S1>:4057' */
        localDW->is_Confirm_Stop = Top_Level_Mode_Functional_IN_ON;

        /* Entry 'ON': '<S1>:4055' */
        localB->TLM_MODE_OUT_Request_Confirm_Stop = TRUE;
        localDW->confirmStopTimer++;
      } else {
        /* Transition: '<S1>:4051' */
        localDW->is_Confirm_Stop = Top_Level_Mode_Functional_IN_OFF;

        /* Entry 'OFF': '<S1>:4054' */
        localB->TLM_MODE_OUT_Request_Confirm_Stop = FALSE;
        localDW->confirmStopTimer = 0.0;
      }
    } else {
      TLM_MODE_OUT_System_On = FALSE;
    }
  } else {
    /* During 'TOP_Level_Mode': '<S1>:4024' */
    TLM_MODE_OUT_System_On = TRUE;

    /* During 'Confirm_Stop': '<S1>:4050' */
    if (localDW->is_Confirm_Stop == Top_Level_Mode_Functional_IN_OFF) {
      /* During 'OFF': '<S1>:4054' */
      if (rtu_OP_CMD_IN->System_Stop) {
        /* Transition: '<S1>:4052' */
        localDW->is_Confirm_Stop = Top_Level_Mode_Functional_IN_ON;

        /* Entry 'ON': '<S1>:4055' */
        localB->TLM_MODE_OUT_Request_Confirm_Stop = TRUE;
        localDW->confirmStopTimer++;
      }
    } else {
      /* During 'ON': '<S1>:4055' */
      if (!rtu_OP_CMD_IN->System_Start) {
        /* Transition: '<S1>:4039' */
        Top_Level_Mode_Functional_writeLog(2U, localB);

        /* Exit Internal 'TOP_Level_Mode': '<S1>:4024' */
        /* Exit Internal 'Confirm_Stop': '<S1>:4050' */
        localDW->is_Confirm_Stop = Top_Level_Mode_Functional_IN_NO_ACTIVE_CHILD;
        localDW->is_TOP_Level_Mode =
          Top_Level_Mode_Functional_IN_NO_ACTIVE_CHILD;

        /* Exit 'TOP_Level_Mode': '<S1>:4024' */
        localDW->is_c2_Top_Level_Mode_Functional =
          Top_Level_Mode_Functional_IN_NOT_ON;

        /* Entry 'NOT_ON': '<S1>:4034' */
        TLM_MODE_OUT_System_On = FALSE;
      } else {
        if (Cancel || (localDW->confirmStopTimer >
                       Top_Level_Mode_Functional_Step_Scaling_Factor
                       (rtu_CONST_IN->Max_Confirm_Stop_Duration))) {
          /* Transition: '<S1>:4053' */
          localDW->is_Confirm_Stop = Top_Level_Mode_Functional_IN_OFF;

          /* Entry 'OFF': '<S1>:4054' */
          localB->TLM_MODE_OUT_Request_Confirm_Stop = FALSE;
          localDW->confirmStopTimer = 0.0;
        } else {
          localDW->confirmStopTimer++;
        }
      }
    }
  }

  /* End of Chart: '<Root>/Top Level Mode Sub-System' */

  /* BusCreator: '<Root>/BusConversion_InsertedFor_TLM_MODE_OUT_at_inport_0' */
  rty_TLM_MODE_OUT->System_On = TLM_MODE_OUT_System_On;
  rty_TLM_MODE_OUT->Request_Confirm_Stop =
    localB->TLM_MODE_OUT_Request_Confirm_Stop;
  rty_TLM_MODE_OUT->Log_Message_ID = localB->TLM_MODE_OUT_Log_Message_ID;
}

/* Model initialize function */
void Top_Level_Mode_Functional_initialize(const char_T **rt_errorStatus,
  RT_MODEL_Top_Level_Mode_Functional_T *const Top_Level_Mode_Functional_M,
  B_Top_Level_Mode_Functional_c_T *localB, DW_Top_Level_Mode_Functional_f_T
  *localDW)
{
  /* Registration code */

  /* initialize error status */
  rtmSetErrorStatusPointer(Top_Level_Mode_Functional_M, rt_errorStatus);

  /* block I/O */
  (void) memset(((void *) localB), 0,
                sizeof(B_Top_Level_Mode_Functional_c_T));

  /* states (dwork) */
  (void) memset((void *)localDW, 0,
                sizeof(DW_Top_Level_Mode_Functional_f_T));
}
