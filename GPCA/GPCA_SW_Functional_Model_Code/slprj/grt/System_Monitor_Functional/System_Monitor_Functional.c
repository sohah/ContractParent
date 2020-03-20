/*
 * Code generation for system model 'System_Monitor_Functional'
 *
 * Model                      : System_Monitor_Functional
 * Model version              : 1.1157
 * Simulink Coder version : 8.4 (R2013a) 13-Feb-2013
 * C source code generated on : Thu Sep 12 09:50:24 2013
 *
 * Note that the functions contained in this file are part of a Simulink
 * model, and are not self-contained algorithms.
 */

#include "System_Monitor_Functional.h"
#include "System_Monitor_Functional_private.h"

/* Named constants for Chart: '<Root>/System Monitor Sub-System' */
#define System_Monitor_Functional_IN_NOT_ON ((uint8_T)1U)
#define System_Monitor_Functional_IN_NO_ACTIVE_CHILD ((uint8_T)0U)
#define System_Monitor_Functional_IN_System_Monitor ((uint8_T)2U)

/* Initial conditions for referenced model: 'System_Monitor_Functional' */
void System_Monitor_Functional_Init(B_System_Monitor_Functional_c_T *localB,
  DW_System_Monitor_Functional_f_T *localDW)
{
  /* InitializeConditions for Chart: '<Root>/System Monitor Sub-System' */
  localDW->is_active_c1_System_Monitor_Functional = 0U;
  localDW->is_c1_System_Monitor_Functional =
    System_Monitor_Functional_IN_NO_ACTIVE_CHILD;
  localB->SYS_MON_OUT_System_Monitor_Failed = FALSE;
}

/* Output and update for referenced model: 'System_Monitor_Functional' */
void System_Monitor_Functional(const Top_Level_Mode_Outputs *rtu_TLM_MODE_IN,
  System_Monitor_Output *rty_SYS_MON_OUT, B_System_Monitor_Functional_c_T
  *localB, DW_System_Monitor_Functional_f_T *localDW)
{
  /* Chart: '<Root>/System Monitor Sub-System' */
  /* Gateway: System Monitor Sub-System */
  /* During: System Monitor Sub-System */
  if (localDW->is_active_c1_System_Monitor_Functional == 0U) {
    /* Entry: System Monitor Sub-System */
    localDW->is_active_c1_System_Monitor_Functional = 1U;

    /* Entry Internal: System Monitor Sub-System */
    if (rtu_TLM_MODE_IN->System_On) {
      /* Transition: '<S1>:1' */
      localDW->is_c1_System_Monitor_Functional =
        System_Monitor_Functional_IN_System_Monitor;

      /* Entry 'System_Monitor': '<S1>:6' */
      localB->SYS_MON_OUT_System_Monitor_Failed = FALSE;
    } else {
      /* Transition: '<S1>:5' */
      localDW->is_c1_System_Monitor_Functional =
        System_Monitor_Functional_IN_NOT_ON;
    }
  } else if (localDW->is_c1_System_Monitor_Functional ==
             System_Monitor_Functional_IN_NOT_ON) {
    /* During 'NOT_ON': '<S1>:3' */
    if (rtu_TLM_MODE_IN->System_On) {
      /* Transition: '<S1>:2' */
      localDW->is_c1_System_Monitor_Functional =
        System_Monitor_Functional_IN_System_Monitor;

      /* Entry 'System_Monitor': '<S1>:6' */
      localB->SYS_MON_OUT_System_Monitor_Failed = FALSE;
    }
  } else {
    /* During 'System_Monitor': '<S1>:6' */
    if (!rtu_TLM_MODE_IN->System_On) {
      /* Transition: '<S1>:4' */
      /* Exit 'System_Monitor': '<S1>:6' */
      localB->SYS_MON_OUT_System_Monitor_Failed = FALSE;
      localDW->is_c1_System_Monitor_Functional =
        System_Monitor_Functional_IN_NOT_ON;
    } else {
      localB->SYS_MON_OUT_System_Monitor_Failed = FALSE;
    }
  }

  /* End of Chart: '<Root>/System Monitor Sub-System' */

  /* BusCreator: '<Root>/BusConversion_InsertedFor_SYS_MON_OUT_at_inport_0' */
  rty_SYS_MON_OUT->System_Monitor_Failed =
    localB->SYS_MON_OUT_System_Monitor_Failed;
}

/* Model initialize function */
void System_Monitor_Functional_initialize(const char_T **rt_errorStatus,
  RT_MODEL_System_Monitor_Functional_T *const System_Monitor_Functional_M,
  B_System_Monitor_Functional_c_T *localB, DW_System_Monitor_Functional_f_T
  *localDW)
{
  /* Registration code */

  /* initialize error status */
  rtmSetErrorStatusPointer(System_Monitor_Functional_M, rt_errorStatus);

  /* block I/O */
  (void) memset(((void *) localB), 0,
                sizeof(B_System_Monitor_Functional_c_T));

  /* states (dwork) */
  (void) memset((void *)localDW, 0,
                sizeof(DW_System_Monitor_Functional_f_T));
}
