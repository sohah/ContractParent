/*
 * Code generation for system model 'CONFIG_Functional'
 *
 * Model                      : CONFIG_Functional
 * Model version              : 1.1164
 * Simulink Coder version : 8.4 (R2013a) 13-Feb-2013
 * C source code generated on : Thu Sep 12 09:49:47 2013
 *
 * Note that the functions contained in this file are part of a Simulink
 * model, and are not self-contained algorithms.
 */

#include <stdio.h>
#include "CONFIG_Functional.h"
#include "CONFIG_Functional_private.h"
#include "../../../GPCA_SW_Functional_grt_rtw/tmwtypes.h"
#include "../../../GPCA_SW_Functional_grt_rtw/rtwtypes.h"

#define DEBUG 0
#define DB_PRINTF(...) do { if (DEBUG) fprintf(stdout, __VA_ARGS__); } while (0)

/* Named constants for Chart: '<Root>/Config  Sub-System' */
#define CONFIG_Functional_IN_Configuration ((uint8_T)1U)
#define CONFIG_Functional_IN_ConfirmInfusionInitation ((uint8_T)1U)
#define CONFIG_Functional_IN_DisplayErrorMessage ((uint8_T)1U)
#define CONFIG_Functional_IN_DisplayParam ((uint8_T)2U)
#define CONFIG_Functional_IN_GetDrugSafeValues ((uint8_T)3U)
#define CONFIG_Functional_IN_GetInfusionParam ((uint8_T)1U)
#define CONFIG_Functional_IN_GetParam  ((uint8_T)4U)
#define CONFIG_Functional_IN_Infusion_info ((uint8_T)2U)
#define CONFIG_Functional_IN_MAIN      ((uint8_T)1U)
#define CONFIG_Functional_IN_NOT_ON    ((uint8_T)2U)
#define CONFIG_Functional_IN_NO_ACTIVE_CHILD ((uint8_T)0U)
#define CONFIG_Functional_IN_Patient_Drug_info ((uint8_T)3U)
#define CONFIG_Functional_IN_Prescription_Config ((uint8_T)2U)
#define CONFIG_Functional_IN_RequestInfusionParam ((uint8_T)2U)
#define CONFIG_Functional_IN_SelectType ((uint8_T)4U)
#define CONFIG_Functional_IN_ValidateInfusionParam ((uint8_T)3U)
#define CONFIG_Functional_IN_ValidateParam ((uint8_T)5U)

/* Forward declaration for local functions */
static real_T CONFIG_Functional_Step_Scaling_Factor(uint8_T inputVal);
static void CONFIG_Functional_writeLog(uint8_T logEvent, B_CONFIG_Functional_c_T
  *localB);
static void CONFIG_Functional_cancelConfigValues(B_CONFIG_Functional_c_T *localB,
  DW_CONFIG_Functional_f_T *localDW);
static void CONFIG_Functional_checkIfPrescriptionAvailable
  (B_CONFIG_Functional_c_T *localB, DW_CONFIG_Functional_f_T *localDW);
static void CONFIG_Functional_saveConfigValues(B_CONFIG_Functional_c_T *localB,
  DW_CONFIG_Functional_f_T *localDW);
static void CONFIG_Functional_copyCurrentValuesToTemp(B_CONFIG_Functional_c_T
  *localB, DW_CONFIG_Functional_f_T *localDW);
static void CONFIG_Functional_setReservoirVolume(B_CONFIG_Functional_c_T *localB,
  DW_CONFIG_Functional_f_T *localDW);
static real_T CONFIG_Functional_checkPatient_DrugParam(B_CONFIG_Functional_c_T
  *localB, DW_CONFIG_Functional_f_T *localDW);
static real_T CONFIG_Functional_checkInfusionParam(B_CONFIG_Functional_c_T
  *localB, DW_CONFIG_Functional_f_T *localDW);
static real_T CONFIG_Functional_CheckDrugName(real_T z, B_CONFIG_Functional_c_T *
  localB);
static void CONFIG_Functional_Prescription_Config(B_CONFIG_Functional_c_T
  *localB, DW_CONFIG_Functional_f_T *localDW);

/* Function for Chart: '<Root>/Config  Sub-System' */
static real_T CONFIG_Functional_Step_Scaling_Factor(uint8_T inputVal)
{
  /* Graphical Function 'Step_Scaling_Factor': '<S1>:4565' */
  /* Transition: '<S1>:4566' */
  return inputVal;
}

/* Function for Chart: '<Root>/Config  Sub-System' */
static void CONFIG_Functional_writeLog(uint8_T logEvent, B_CONFIG_Functional_c_T
  *localB)
{
  /* Graphical Function 'writeLog': '<S1>:4537' */
  /* Transition: '<S1>:4539' */
  localB->CONFIG_OUT_Log_Message_ID = logEvent;
}

/* Function for Chart: '<Root>/Config  Sub-System' */
static void CONFIG_Functional_cancelConfigValues(B_CONFIG_Functional_c_T *localB,
  DW_CONFIG_Functional_f_T *localDW)
{
  /* Graphical Function 'cancelConfigValues': '<S1>:4522' */
  /* Transition: '<S1>:4524' */
  localDW->t_PatientID = 0U;
  localDW->t_DrugName = 0U;
  localDW->t_DrugConcentration = 0U;
  localDW->t_EnteredReservoirVolume = 0U;
  localDW->t_VTBI_total = 0U;
  localDW->t_Duration_total = 0U;
  localDW->t_FlowRate_basal = 0U;
  localDW->t_FlowRate_sbolus = 0U;
  localDW->t_FlowRate_pbolus = 0U;
  localDW->t_FlowRate_kvo = 0U;
  localDW->t_Duration_sbolus = 0U;
  localDW->t_Duration_pbolus = 0U;
  localDW->t_LockOutPeriod_pbolus = 0U;
  localDW->t_NumberMax_pbolus = 0U;
  localDW->t_Interval_sbolus = 0U;
  CONFIG_Functional_writeLog(2U, localB);
}

/* Function for Chart: '<Root>/Config  Sub-System' */
static void CONFIG_Functional_checkIfPrescriptionAvailable
  (B_CONFIG_Functional_c_T *localB, DW_CONFIG_Functional_f_T *localDW)
{
  /* Graphical Function 'checkIfPrescriptionAvailable': '<S1>:4573' */
  /* Transition: '<S1>:4584' */
  if (!localDW->New_Configuration) {
    /* Transition: '<S1>:4581' */
    if ((localB->CONFIG_OUT_Patient_ID > 0) && (localB->CONFIG_OUT_Drug_Name > 0)
        && (localB->CONFIG_OUT_Drug_Concentration > 0) &&
        (localB->CONFIG_OUT_Vtbi_Total > 0) &&
        (localB->CONFIG_OUT_Infusion_Total_Duration > 0) &&
        (localB->CONFIG_OUT_Flow_Rate_Basal > 0)) {
      /* Transition: '<S1>:4575' */
      localB->CONFIG_OUT_Configured = 3U;
    } else {
      /* Transition: '<S1>:4582' */
      localB->CONFIG_OUT_Configured = 0U;
    }
  } else {
    /* Transition: '<S1>:4586' */
    localDW->New_Configuration = FALSE;
  }
}

/* Function for Chart: '<Root>/Config  Sub-System' */
static void CONFIG_Functional_saveConfigValues(B_CONFIG_Functional_c_T *localB,
  DW_CONFIG_Functional_f_T *localDW)
{
  /* Graphical Function 'saveConfigValues': '<S1>:4519' */
  /* Transition: '<S1>:4521' */
  localB->CONFIG_OUT_Patient_ID = localDW->t_PatientID;
  localB->CONFIG_OUT_Drug_Name = localDW->t_DrugName;
  localB->CONFIG_OUT_Drug_Concentration = localDW->t_DrugConcentration;
  localB->CONFIG_OUT_Entered_Reservoir_Volume =
    localDW->t_EnteredReservoirVolume;
  localB->CONFIG_OUT_Vtbi_Total = localDW->t_VTBI_total;
  localB->CONFIG_OUT_Infusion_Total_Duration = localDW->t_Duration_total;
  localB->CONFIG_OUT_Flow_Rate_Basal = localDW->t_FlowRate_basal;
  localB->CONFIG_OUT_Flow_Rate_Intermittent_bolus = localDW->t_FlowRate_sbolus;
  localB->CONFIG_OUT_Flow_Rate_Patient_bolus = localDW->t_FlowRate_pbolus;
  localB->CONFIG_OUT_Flow_Rate_KVO = localDW->t_FlowRate_kvo;
  localB->CONFIG_OUT_Intermittent_Bolus_Duration = localDW->t_Duration_sbolus;
  localB->CONFIG_OUT_Patient_bolus_Duration = localDW->t_Duration_pbolus;
  localB->CONFIG_OUT_Lock_Out_Duration = localDW->t_LockOutPeriod_pbolus;
  localB->CONFIG_OUT_Max_Patient_bolus = localDW->t_NumberMax_pbolus;
  localB->CONFIG_OUT_Interval_Intermittent_bolus = localDW->t_Interval_sbolus;
  localB->CONFIG_OUT_Reservoir_Volume =
    localB->CONFIG_OUT_Entered_Reservoir_Volume;
  localB->CONFIG_OUT_Configured = localDW->Selected_Config_Type;
  localDW->New_Configuration = TRUE;
  CONFIG_Functional_cancelConfigValues(localB, localDW);
  CONFIG_Functional_writeLog(1U, localB);
}

/* Function for Chart: '<Root>/Config  Sub-System' */
static void CONFIG_Functional_copyCurrentValuesToTemp(B_CONFIG_Functional_c_T
  *localB, DW_CONFIG_Functional_f_T *localDW)
{
  /* Graphical Function 'copyCurrentValuesToTemp': '<S1>:4592' */
  /* Transition: '<S1>:4594' */
  localDW->t_PatientID = localB->CONFIG_OUT_Patient_ID;
  localDW->t_DrugName = localB->CONFIG_OUT_Drug_Name;
  localDW->t_DrugConcentration = localB->CONFIG_OUT_Drug_Concentration;
  localDW->t_VTBI_total = localB->CONFIG_OUT_Vtbi_Total;
  localDW->t_Duration_total = localB->CONFIG_OUT_Infusion_Total_Duration;
  localDW->t_FlowRate_basal = localB->CONFIG_OUT_Flow_Rate_Basal;
  localDW->t_FlowRate_sbolus = localB->CONFIG_OUT_Flow_Rate_Intermittent_bolus;
  localDW->t_FlowRate_pbolus = localB->CONFIG_OUT_Flow_Rate_Patient_bolus;
  localDW->t_FlowRate_kvo = localB->CONFIG_OUT_Flow_Rate_KVO;
  localDW->t_Duration_sbolus = localB->CONFIG_OUT_Intermittent_Bolus_Duration;
  localDW->t_Duration_pbolus = localB->CONFIG_OUT_Patient_bolus_Duration;
  localDW->t_LockOutPeriod_pbolus = localB->CONFIG_OUT_Lock_Out_Duration;
  localDW->t_NumberMax_pbolus = localB->CONFIG_OUT_Max_Patient_bolus;
  localDW->t_Interval_sbolus = localB->CONFIG_OUT_Interval_Intermittent_bolus;
  localDW->t_EnteredReservoirVolume =
    localB->CONFIG_OUT_Entered_Reservoir_Volume;
}

/* Function for Chart: '<Root>/Config  Sub-System' */
static void CONFIG_Functional_setReservoirVolume(B_CONFIG_Functional_c_T *localB,
  DW_CONFIG_Functional_f_T *localDW)
{
  /* Graphical Function 'setReservoirVolume': '<S1>:4596' */
  if (!localDW->New_Configuration) {
    /* Transition: '<S1>:4603' */
    localB->CONFIG_OUT_Reservoir_Volume = localB->Reservoir_Volume;
  }
}

/* Function for Chart: '<Root>/Config  Sub-System' */
static real_T CONFIG_Functional_checkPatient_DrugParam(B_CONFIG_Functional_c_T
  *localB, DW_CONFIG_Functional_f_T *localDW)
{
  real_T v;

  /* Graphical Function 'checkPatient_DrugParam': '<S1>:4472' */
  /* Transition: '<S1>:4476' */
  v = 1.0;
  if ((localDW->t_DrugConcentration < localB->Drug_Concentration_Low) ||
      (localDW->t_DrugConcentration > localB->Drug_Concentration_High)) {
    /* Transition: '<S1>:4477' */
    v = 0.0;
  } else {
    if (localDW->t_EnteredReservoirVolume < localB->Empty_Reservoir) {
      /* Transition: '<S1>:4478' */
      v = 0.0;
    }
  }

  return v;
}

/* Function for Chart: '<Root>/Config  Sub-System' */
static real_T CONFIG_Functional_checkInfusionParam(B_CONFIG_Functional_c_T
  *localB, DW_CONFIG_Functional_f_T *localDW)
{
  real_T vi;

  /* Graphical Function 'checkInfusionParam': '<S1>:4498' */
  /* Transition: '<S1>:4508' */
  vi = 1.0;
  if ((localDW->t_VTBI_total > localB->VTBI_High) || (localDW->t_VTBI_total <
       localB->VTBI_Low)) {
    /* Transition: '<S1>:4509' */
    vi = 0.0;
    DB_PRINTF("1: %d %d %d ",localDW->t_VTBI_total,localB->VTBI_High,localB->VTBI_Low);
  } else if ((localDW->t_FlowRate_basal < localB->Flow_Rate_Low) ||
             (localDW->t_FlowRate_basal > localB->Flow_Rate_High)) {
    /* Transition: '<S1>:4510' */
    vi = 0.0;
    DB_PRINTF("%d: ",2);
  } else if ((localDW->t_FlowRate_sbolus < localB->Flow_Rate_Low) ||
             (localDW->t_FlowRate_sbolus > localB->Flow_Rate_High)) {
    /* Transition: '<S1>:4511' */
    vi = 0.0;
    DB_PRINTF("3: ");
  } else if ((localDW->t_FlowRate_pbolus < localB->Flow_Rate_Low) ||
             (localDW->t_FlowRate_pbolus > localB->Flow_Rate_High)) {
    /* Transition: '<S1>:4512' */
    vi = 0.0;
    DB_PRINTF("4: ");
  } else if (localDW->t_Duration_sbolus > localDW->t_Interval_sbolus) {
    /* Transition: '<S1>:4513' */
    vi = 0.0;
    DB_PRINTF("5: ");
  } else if (localDW->t_NumberMax_pbolus > localB->Number_Max_Patient_Bolus) {
    /* Transition: '<S1>:4515' */
    vi = 0.0;
    DB_PRINTF("6: ");
  } else {
    if ((localDW->t_FlowRate_pbolus < localDW->t_FlowRate_basal) ||
        (localDW->t_FlowRate_sbolus < localDW->t_FlowRate_basal)) {
      /* Transition: '<S1>:4514' */
      vi = 0.0;
    DB_PRINTF("7: ");
    }
  }

  return vi;
}

/* Function for Chart: '<Root>/Config  Sub-System' */
static real_T CONFIG_Functional_CheckDrugName(real_T z, B_CONFIG_Functional_c_T *
  localB)
{
  real_T y;

  /* Graphical Function 'CheckDrugName': '<S1>:4481' */
  /* Transition: '<S1>:4484' */
  y = 1.0;
  if (z != localB->Drug_Name_d) {
    /* Transition: '<S1>:4485' */
    y = 0.0;
  }

  return y;
}

/* Function for Chart: '<Root>/Config  Sub-System' */
static void CONFIG_Functional_Prescription_Config(B_CONFIG_Functional_c_T
  *localB, DW_CONFIG_Functional_f_T *localDW)
{
  /* During 'Prescription_Config': '<S1>:4445' */
  if (((real_T)localB->CONFIG_OUT_Config_Timer >
       CONFIG_Functional_Step_Scaling_Factor(localB->Max_Config_Duration)) ||
      localB->Cancel) {
    /* Transition: '<S1>:4443' */
    DB_PRINTF("%2d: ",51);
    CONFIG_Functional_cancelConfigValues(localB, localDW);

    /* Exit Internal 'Prescription_Config': '<S1>:4445' */
    switch (localDW->is_Prescription_Config) {
     case CONFIG_Functional_IN_Infusion_info:
      /* Exit Internal 'Infusion_info': '<S1>:4487' */
      localDW->is_Infusion_info = CONFIG_Functional_IN_NO_ACTIVE_CHILD;

      /* Exit 'Infusion_info': '<S1>:4487' */
      localB->CONFIG_OUT_Config_Mode = 4U;
      localDW->is_Prescription_Config = CONFIG_Functional_IN_NO_ACTIVE_CHILD;
      break;

     case CONFIG_Functional_IN_Patient_Drug_info:
      /* Exit Internal 'Patient_Drug_info': '<S1>:4456' */
      localDW->is_Patient_Drug_info = CONFIG_Functional_IN_NO_ACTIVE_CHILD;

      /* Exit 'Patient_Drug_info': '<S1>:4456' */
      localB->CONFIG_OUT_Config_Mode = 3U;
      localDW->is_Prescription_Config = CONFIG_Functional_IN_NO_ACTIVE_CHILD;
      break;

     default:
      localDW->is_Prescription_Config = CONFIG_Functional_IN_NO_ACTIVE_CHILD;
      break;
    }

    /* Exit 'Prescription_Config': '<S1>:4445' */
    localDW->is_Configuration = CONFIG_Functional_IN_MAIN;

    /* Entry 'MAIN': '<S1>:4518' */
    localB->CONFIG_OUT_Config_Mode = 1U;
    localB->CONFIG_OUT_Config_Timer = 0U;
    CONFIG_Functional_setReservoirVolume(localB, localDW);
    CONFIG_Functional_checkIfPrescriptionAvailable(localB, localDW);
  } else {
    DB_PRINTF("52: %d ",localDW->is_Prescription_Config);
    localB->CONFIG_OUT_Config_Timer++;
    localB->CONFIG_OUT_Reservoir_Volume = localB->Reservoir_Volume;
    CONFIG_Functional_checkIfPrescriptionAvailable(localB, localDW);
    switch (localDW->is_Prescription_Config) {
     case CONFIG_Functional_IN_ConfirmInfusionInitation:
      /* During 'ConfirmInfusionInitation': '<S1>:4517' */
      if (localB->Infusion_Initiate) {
    DB_PRINTF("%s: ","53a");
        /* Transition: '<S1>:4444' */
        localB->CONFIG_OUT_Request_Confirm_Infusion_Initiate = FALSE;
        CONFIG_Functional_saveConfigValues(localB, localDW);
        localDW->is_Prescription_Config = CONFIG_Functional_IN_NO_ACTIVE_CHILD;

        /* Exit 'Prescription_Config': '<S1>:4445' */
        localDW->is_Configuration = CONFIG_Functional_IN_MAIN;

        /* Entry 'MAIN': '<S1>:4518' */
        localB->CONFIG_OUT_Config_Mode = 1U;
        localB->CONFIG_OUT_Config_Timer = 0U;
        CONFIG_Functional_setReservoirVolume(localB, localDW);
        CONFIG_Functional_checkIfPrescriptionAvailable(localB, localDW);
      } else {
    DB_PRINTF("%s: ","53b");
        localB->CONFIG_OUT_Request_Confirm_Infusion_Initiate = TRUE;
      }
      break;

     case CONFIG_Functional_IN_Infusion_info:
      /* During 'Infusion_info': '<S1>:4487' */
      if (localB->Back && (!localB->In_Therapy)) {
    DB_PRINTF("%s: ","54a");
        /* Transition: '<S1>:4450' */
        /* Exit Internal 'Infusion_info': '<S1>:4487' */
        localDW->is_Infusion_info = CONFIG_Functional_IN_NO_ACTIVE_CHILD;

        /* Exit 'Infusion_info': '<S1>:4487' */
        localDW->is_Prescription_Config = CONFIG_Functional_IN_Patient_Drug_info;

        /* Entry 'Patient_Drug_info': '<S1>:4456' */
        localB->CONFIG_OUT_Config_Mode = 3U;

        /* Entry Internal 'Patient_Drug_info': '<S1>:4456' */
        /* Transition: '<S1>:4459' */
        localDW->is_Patient_Drug_info = CONFIG_Functional_IN_DisplayParam;

        /* Entry 'DisplayParam': '<S1>:4466' */
        localB->CONFIG_OUT_Request_Patient_Drug_Info = TRUE;
        localDW->validate = 0U;
      } else {
    DB_PRINTF("%s: ","54b");
        localB->CONFIG_OUT_Config_Mode = 4U;
        switch (localDW->is_Infusion_info) {
         case CONFIG_Functional_IN_GetInfusionParam:
    DB_PRINTF("541: ");
          /* During 'GetInfusionParam': '<S1>:4495' */
          if (localB->Next == 1) {
            /* Transition: '<S1>:4491' */
            localDW->is_Infusion_info =
              CONFIG_Functional_IN_ValidateInfusionParam;

            /* Entry 'ValidateInfusionParam': '<S1>:4496' */
            localDW->validate = (uint8_T)CONFIG_Functional_checkInfusionParam
              (localB, localDW);
              DB_PRINTF("z: %d ",localDW->validate);
          }
          break;

         case CONFIG_Functional_IN_RequestInfusionParam:
    DB_PRINTF("542: ");
          /* During 'RequestInfusionParam': '<S1>:4494' */
          if (localB->Next == 1) {
    DB_PRINTF("a: ");
            /* Transition: '<S1>:4488' */
            localDW->is_Infusion_info = CONFIG_Functional_IN_GetInfusionParam;

            /* Entry 'GetInfusionParam': '<S1>:4495' */
            localDW->t_VTBI_total = localB->VTBI_Total;
            localDW->t_Duration_total = localB->Total_Duration;
            localDW->t_FlowRate_basal = localB->Flow_Rate_Basal;
            localDW->t_FlowRate_sbolus = localB->Flow_Rate_Intermittent_Bolus;
            localDW->t_FlowRate_pbolus = localB->Flow_Rate_Patient_Bolus;
            localDW->t_Duration_sbolus = localB->Duration_Intermittent_Bolus;
            localDW->t_Duration_pbolus = localB->Duration_Patient_Bolus;
            localDW->t_LockOutPeriod_pbolus =
              localB->Lockout_Period_Patient_Bolus;
            localDW->t_NumberMax_pbolus = localB->Max_Number_of_Patient_Bolus;
            localDW->t_Interval_sbolus = localB->Interval_Intermittent_Bolus;
            localDW->t_FlowRate_kvo = localB->Flow_Rate_KVO;
            localB->CONFIG_OUT_Request_Infusion_Info = FALSE;
          } else {
     DB_PRINTF("b: ");
           if (localB->Next == 1) {
              /* Transition: '<S1>:4490' */
     DB_PRINTF("c: ");
             localDW->is_Infusion_info =
                CONFIG_Functional_IN_ValidateInfusionParam;

              /* Entry 'ValidateInfusionParam': '<S1>:4496' */
              localDW->validate = (uint8_T)CONFIG_Functional_checkInfusionParam
                (localB, localDW);
            }
          }
          break;

         default:
    DB_PRINTF("543: ");
          /* During 'ValidateInfusionParam': '<S1>:4496' */
          if (!(localDW->validate != 0)) {
            /* Transition: '<S1>:4492' */
            localDW->is_Infusion_info =
              CONFIG_Functional_IN_RequestInfusionParam;

            /* Entry 'RequestInfusionParam': '<S1>:4494' */
            localB->CONFIG_OUT_Request_Infusion_Info = TRUE;
            localDW->validate = 0U;
          } else {
            /* Transition: '<S1>:4493' */
            localDW->is_Infusion_info = CONFIG_Functional_IN_NO_ACTIVE_CHILD;

            /* Exit 'Infusion_info': '<S1>:4487' */
            localB->CONFIG_OUT_Config_Mode = 4U;
            localDW->is_Prescription_Config =
              CONFIG_Functional_IN_ConfirmInfusionInitation;

            /* Entry 'ConfirmInfusionInitation': '<S1>:4517' */
            localB->CONFIG_OUT_Request_Confirm_Infusion_Initiate = TRUE;
          }
          break;
        }
      }
      break;

     case CONFIG_Functional_IN_Patient_Drug_info:
    DB_PRINTF("55: ");
      /* During 'Patient_Drug_info': '<S1>:4456' */
      localB->CONFIG_OUT_Config_Mode = 3U;
      switch (localDW->is_Patient_Drug_info) {
       case CONFIG_Functional_IN_DisplayErrorMessage:
    DB_PRINTF("551: ");
        /* During 'DisplayErrorMessage': '<S1>:4468' */
        /* Transition: '<S1>:4460' */
        localDW->is_Patient_Drug_info = CONFIG_Functional_IN_DisplayParam;

        /* Entry 'DisplayParam': '<S1>:4466' */
        localB->CONFIG_OUT_Request_Patient_Drug_Info = TRUE;
        localDW->validate = 0U;
        break;

       case CONFIG_Functional_IN_DisplayParam:
    DB_PRINTF("552: %d ",localB->Next);
        /* During 'DisplayParam': '<S1>:4466' */
        if (localB->Next == 1) {
          /* Transition: '<S1>:4457' */
          localDW->is_Patient_Drug_info = CONFIG_Functional_IN_GetParam;

          /* Entry 'GetParam': '<S1>:4467' */
          localDW->t_PatientID = localB->Patient_ID;
          localDW->t_DrugName = localB->Drug_Name;
          localDW->t_DrugConcentration = localB->Drug_Concentration;
          localDW->t_EnteredReservoirVolume = localB->Entered_Reservoir_Volume;
          localB->CONFIG_OUT_Request_Patient_Drug_Info = FALSE;
        } else {
          if (localB->Next == 1) {
            /* Transition: '<S1>:4461' */
            localDW->is_Patient_Drug_info = CONFIG_Functional_IN_ValidateParam;

            /* Entry 'ValidateParam': '<S1>:4470' */
            localDW->validate = (uint8_T)
              CONFIG_Functional_checkPatient_DrugParam(localB, localDW);
            localB->CONFIG_OUT_Request_Patient_Drug_Info = FALSE;
            localDW->value = 0U;
          }
        }
        break;

       case CONFIG_Functional_IN_GetDrugSafeValues:
    DB_PRINTF("553: ");
        /* During 'GetDrugSafeValues': '<S1>:4469' */
        if (localDW->value != 0) {
          /* Transition: '<S1>:4464' */
          localDW->is_Patient_Drug_info = CONFIG_Functional_IN_ValidateParam;

          /* Entry 'ValidateParam': '<S1>:4470' */
          localDW->validate = (uint8_T)CONFIG_Functional_checkPatient_DrugParam
            (localB, localDW);
          localB->CONFIG_OUT_Request_Patient_Drug_Info = FALSE;
          localDW->value = 0U;
        } else {
          /* Transition: '<S1>:4462' */
          localDW->is_Patient_Drug_info =
            CONFIG_Functional_IN_DisplayErrorMessage;

          /* Entry 'DisplayErrorMessage': '<S1>:4468' */
          localB->CONFIG_OUT_Error_Message_ID = 5U;
        }
        break;

       case CONFIG_Functional_IN_GetParam:
        /* During 'GetParam': '<S1>:4467' */
DB_PRINTF("554: ");
        if (localB->Next == 1) {
          /* Transition: '<S1>:4458' */
          localDW->value = 0U;
          localDW->is_Patient_Drug_info = CONFIG_Functional_IN_GetDrugSafeValues;

          /* Entry 'GetDrugSafeValues': '<S1>:4469' */
          localB->CONFIG_OUT_Drug_Name = localDW->t_DrugName;
          localDW->value = (uint8_T)CONFIG_Functional_CheckDrugName((real_T)
            localDW->t_DrugName, localB);
        }
        break;

       default:
    DB_PRINTF("555: ");
        /* During 'ValidateParam': '<S1>:4470' */
        if (!(localDW->validate != 0)) {
          /* Transition: '<S1>:4463' */
          localDW->is_Patient_Drug_info =
            CONFIG_Functional_IN_DisplayErrorMessage;

          /* Entry 'DisplayErrorMessage': '<S1>:4468' */
          localB->CONFIG_OUT_Error_Message_ID = 5U;
        } else {
          /* Transition: '<S1>:4465' */
          localDW->is_Patient_Drug_info = CONFIG_Functional_IN_NO_ACTIVE_CHILD;

          /* Exit 'Patient_Drug_info': '<S1>:4456' */
          localDW->is_Prescription_Config = CONFIG_Functional_IN_Infusion_info;

          /* Entry 'Infusion_info': '<S1>:4487' */
          localB->CONFIG_OUT_Config_Mode = 4U;

          /* Entry Internal 'Infusion_info': '<S1>:4487' */
          /* Transition: '<S1>:4489' */
          localDW->is_Infusion_info = CONFIG_Functional_IN_RequestInfusionParam;

          /* Entry 'RequestInfusionParam': '<S1>:4494' */
          localB->CONFIG_OUT_Request_Infusion_Info = TRUE;
          localDW->validate = 0U;
        }
        break;
      }
      break;

     default:
      /* During 'SelectType': '<S1>:4486' */
      if (localB->Configuration_Type > 0) {
    DB_PRINTF("56a: %d ",localB->In_Therapy);
        /* Transition: '<S1>:4451' */
        localB->CONFIG_OUT_Request_Configuration_Type = FALSE;
        localDW->Selected_Config_Type = localB->Configuration_Type;
        CONFIG_Functional_copyCurrentValuesToTemp(localB, localDW);
        if (localB->In_Therapy) {
          /* Transition: '<S1>:4452' */
          localDW->is_Prescription_Config = CONFIG_Functional_IN_Infusion_info;

          /* Entry 'Infusion_info': '<S1>:4487' */
          localB->CONFIG_OUT_Config_Mode = 4U;

          /* Entry Internal 'Infusion_info': '<S1>:4487' */
          /* Transition: '<S1>:4489' */
          localDW->is_Infusion_info = CONFIG_Functional_IN_RequestInfusionParam;

          /* Entry 'RequestInfusionParam': '<S1>:4494' */
          localB->CONFIG_OUT_Request_Infusion_Info = TRUE;
          localDW->validate = 0U;
        } else {
          /* Transition: '<S1>:4447' */
          localDW->is_Prescription_Config =
            CONFIG_Functional_IN_Patient_Drug_info;

          /* Entry 'Patient_Drug_info': '<S1>:4456' */
          localB->CONFIG_OUT_Config_Mode = 3U;

          /* Entry Internal 'Patient_Drug_info': '<S1>:4456' */
          /* Transition: '<S1>:4459' */
          localDW->is_Patient_Drug_info = CONFIG_Functional_IN_DisplayParam;

          /* Entry 'DisplayParam': '<S1>:4466' */
          localB->CONFIG_OUT_Request_Patient_Drug_Info = TRUE;
          localDW->validate = 0U;
        }
      }
        else
        {
                DB_PRINTF("56b: ");
                }
      break;
    }
  }
}

/* Initial conditions for referenced model: 'CONFIG_Functional' */
void CONFIG_Functional_Init(B_CONFIG_Functional_c_T *localB,
  DW_CONFIG_Functional_f_T *localDW)
{
  /* InitializeConditions for Chart: '<Root>/Config  Sub-System' */
  localDW->is_Configuration = CONFIG_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_Prescription_Config = CONFIG_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_Infusion_info = CONFIG_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_Patient_Drug_info = CONFIG_Functional_IN_NO_ACTIVE_CHILD;
  localDW->is_active_c2_CONFIG_Functional = 0U;
  localDW->is_c2_CONFIG_Functional = CONFIG_Functional_IN_NO_ACTIVE_CHILD;
  localDW->t_DrugConcentration = 0U;
  localDW->t_DrugName = 0U;
  localDW->t_Duration_pbolus = 0U;
  localDW->t_Duration_sbolus = 0U;
  localDW->t_Duration_total = 0U;
  localDW->t_FlowRate_basal = 0U;
  localDW->t_FlowRate_kvo = 0U;
  localDW->t_FlowRate_pbolus = 0U;
  localDW->t_FlowRate_sbolus = 0U;
  localDW->t_Interval_sbolus = 0U;
  localDW->t_LockOutPeriod_pbolus = 0U;
  localDW->t_NumberMax_pbolus = 0U;
  localDW->t_PatientID = 0U;
  localDW->t_EnteredReservoirVolume = 0U;
  localDW->t_VTBI_total = 0U;
  localDW->validate = 0U;
  localDW->value = 0U;
  localDW->New_Configuration = FALSE;
  localDW->Selected_Config_Type = 0U;
  localB->CONFIG_OUT_Patient_ID = 0U;
  localB->CONFIG_OUT_Drug_Name = 0U;
  localB->CONFIG_OUT_Drug_Concentration = 0U;
  localB->CONFIG_OUT_Infusion_Total_Duration = 0U;
  localB->CONFIG_OUT_Vtbi_Total = 0U;
  localB->CONFIG_OUT_Flow_Rate_Basal = 0U;
  localB->CONFIG_OUT_Flow_Rate_Intermittent_bolus = 0U;
  localB->CONFIG_OUT_Intermittent_Bolus_Duration = 0U;
  localB->CONFIG_OUT_Interval_Intermittent_bolus = 0U;
  localB->CONFIG_OUT_Flow_Rate_Patient_bolus = 0U;
  localB->CONFIG_OUT_Patient_bolus_Duration = 0U;
  localB->CONFIG_OUT_Lock_Out_Duration = 0U;
  localB->CONFIG_OUT_Max_Patient_bolus = 0U;
  localB->CONFIG_OUT_Flow_Rate_KVO = 0U;
  localB->CONFIG_OUT_Entered_Reservoir_Volume = 0U;
  localB->CONFIG_OUT_Reservoir_Volume = 0U;
  localB->CONFIG_OUT_Configured = 0U;
  localB->CONFIG_OUT_Error_Message_ID = 0U;
  localB->CONFIG_OUT_Request_Configuration_Type = FALSE;
  localB->CONFIG_OUT_Request_Confirm_Infusion_Initiate = FALSE;
  localB->CONFIG_OUT_Request_Patient_Drug_Info = FALSE;
  localB->CONFIG_OUT_Request_Infusion_Info = FALSE;
  localB->CONFIG_OUT_Log_Message_ID = 0U;
  localB->CONFIG_OUT_Config_Timer = 0U;
  localB->CONFIG_OUT_Config_Mode = 0U;
}

/* Output and update for referenced model: 'CONFIG_Functional' */
void CONFIG_Functional(const Top_Level_Mode_Outputs *rtu_TLM_MODE_IN, const
  Prescription_Inputs *rtu_PRES_IN, const Operator_Commands *rtu_OP_CMD_IN,
  const Drug_Database_Inputs *rtu_DB_IN, const Device_Configuration_Inputs
  *rtu_CONST_IN, const System_Status_Outputs *rtu_SYS_STAT_IN, Config_Outputs
  *rty_CONFIG_OUT, B_CONFIG_Functional_c_T *localB, DW_CONFIG_Functional_f_T
  *localDW)
{
DB_PRINTF("90: %d %d ",rtu_PRES_IN->Patient_ID,rtu_DB_IN->Drug_Name);

  /* BusSelector: '<Root>/BusConversion_InsertedFor_PRES_IN_at_outport_0' */
  localB->Patient_ID = rtu_PRES_IN->Patient_ID;
  localB->Drug_Name = rtu_PRES_IN->Drug_Name;
  localB->Drug_Concentration = rtu_PRES_IN->Drug_Concentration;
  localB->VTBI_Total = rtu_PRES_IN->VTBI_Total;
  localB->Total_Duration = rtu_PRES_IN->Total_Duration;
  localB->Flow_Rate_Basal = rtu_PRES_IN->Flow_Rate_Basal;
  localB->Flow_Rate_Intermittent_Bolus =
    rtu_PRES_IN->Flow_Rate_Intermittent_Bolus;
  localB->Duration_Intermittent_Bolus = rtu_PRES_IN->Duration_Intermittent_Bolus;
  localB->Interval_Intermittent_Bolus = rtu_PRES_IN->Interval_Intermittent_Bolus;
  localB->Flow_Rate_Patient_Bolus = rtu_PRES_IN->Flow_Rate_Patient_Bolus;
  localB->Duration_Patient_Bolus = rtu_PRES_IN->Duration_Patient_Bolus;
  localB->Lockout_Period_Patient_Bolus =
    rtu_PRES_IN->Lockout_Period_Patient_Bolus;
  localB->Max_Number_of_Patient_Bolus = rtu_PRES_IN->Max_Number_of_Patient_Bolus;
  localB->Entered_Reservoir_Volume = rtu_PRES_IN->Entered_Reservoir_Volume;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_OP_CMD_IN_at_outport_0' */
  localB->Infusion_Initiate = rtu_OP_CMD_IN->Infusion_Initiate;
  localB->Next = rtu_OP_CMD_IN->Next;
  localB->Back = rtu_OP_CMD_IN->Back;
  localB->Cancel = rtu_OP_CMD_IN->Cancel;
  localB->Configuration_Type = rtu_OP_CMD_IN->Configuration_Type;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_DB_IN_at_outport_0' */
  localB->Drug_Name_d = rtu_DB_IN->Drug_Name;
  localB->Drug_Concentration_High = rtu_DB_IN->Drug_Concentration_High;
  localB->Drug_Concentration_Low = rtu_DB_IN->Drug_Concentration_Low;
  localB->VTBI_High = rtu_DB_IN->VTBI_High;
  localB->VTBI_Low = rtu_DB_IN->VTBI_Low;
  localB->Number_Max_Patient_Bolus = rtu_DB_IN->Number_Max_Patient_Bolus;
  localB->Flow_Rate_KVO = rtu_DB_IN->Flow_Rate_KVO;
  localB->Flow_Rate_High = rtu_DB_IN->Flow_Rate_High;
  localB->Flow_Rate_Low = rtu_DB_IN->Flow_Rate_Low;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_CONST_IN_at_outport_0' */
  localB->Empty_Reservoir = rtu_CONST_IN->Empty_Reservoir;
  localB->Max_Config_Duration = rtu_CONST_IN->Max_Config_Duration;

  /* BusSelector: '<Root>/BusConversion_InsertedFor_SYS_STAT_IN_at_outport_0' */
  localB->Reservoir_Volume = rtu_SYS_STAT_IN->Reservoir_Volume;
  localB->In_Therapy = rtu_SYS_STAT_IN->In_Therapy;

  /* Chart: '<Root>/Config  Sub-System' incorporates:
   *  BusSelector: '<Root>/BusConversion_InsertedFor_OP_CMD_IN_at_outport_0'
   *  BusSelector: '<Root>/BusConversion_InsertedFor_TLM_MODE_IN_at_outport_0'
   */
  /* Gateway: Config  Sub-System */
  /* During: Config  Sub-System */
  if (localDW->is_active_c2_CONFIG_Functional == 0U) {
    /* Entry: Config  Sub-System */
    localDW->is_active_c2_CONFIG_Functional = 1U;

    /* Entry Internal: Config  Sub-System */
    if (rtu_TLM_MODE_IN->System_On) {
      /* Transition: '<S1>:4535' */
      localDW->is_c2_CONFIG_Functional = CONFIG_Functional_IN_Configuration;

      /* Entry Internal 'Configuration': '<S1>:4440' */
      /* Transition: '<S1>:4441' */
      localDW->is_Configuration = CONFIG_Functional_IN_MAIN;

      /* Entry 'MAIN': '<S1>:4518' */
      localB->CONFIG_OUT_Config_Mode = 1U;
      localB->CONFIG_OUT_Config_Timer = 0U;
      CONFIG_Functional_setReservoirVolume(localB, localDW);
      CONFIG_Functional_checkIfPrescriptionAvailable(localB, localDW);
    } else {
      /* Transition: '<S1>:4534' */
      localDW->is_c2_CONFIG_Functional = CONFIG_Functional_IN_NOT_ON;
    }
  } else if (localDW->is_c2_CONFIG_Functional ==
             CONFIG_Functional_IN_Configuration) {
    /* During 'Configuration': '<S1>:4440' */
    if (!rtu_TLM_MODE_IN->System_On) {
      /* Transition: '<S1>:4531' */
      /* Exit Internal 'Configuration': '<S1>:4440' */
      switch (localDW->is_Configuration) {
       case CONFIG_Functional_IN_MAIN:
        /* Exit 'MAIN': '<S1>:4518' */
        localB->CONFIG_OUT_Config_Mode = 1U;
        localB->CONFIG_OUT_Config_Timer = 0U;
        CONFIG_Functional_setReservoirVolume(localB, localDW);
        CONFIG_Functional_checkIfPrescriptionAvailable(localB, localDW);
        localDW->is_Configuration = CONFIG_Functional_IN_NO_ACTIVE_CHILD;
        break;

       case CONFIG_Functional_IN_Prescription_Config:
        /* Exit Internal 'Prescription_Config': '<S1>:4445' */
        switch (localDW->is_Prescription_Config) {
         case CONFIG_Functional_IN_Infusion_info:
          /* Exit Internal 'Infusion_info': '<S1>:4487' */
          localDW->is_Infusion_info = CONFIG_Functional_IN_NO_ACTIVE_CHILD;

          /* Exit 'Infusion_info': '<S1>:4487' */
          localB->CONFIG_OUT_Config_Mode = 4U;
          localDW->is_Prescription_Config = CONFIG_Functional_IN_NO_ACTIVE_CHILD;
          break;

         case CONFIG_Functional_IN_Patient_Drug_info:
          /* Exit Internal 'Patient_Drug_info': '<S1>:4456' */
          localDW->is_Patient_Drug_info = CONFIG_Functional_IN_NO_ACTIVE_CHILD;

          /* Exit 'Patient_Drug_info': '<S1>:4456' */
          localB->CONFIG_OUT_Config_Mode = 3U;
          localDW->is_Prescription_Config = CONFIG_Functional_IN_NO_ACTIVE_CHILD;
          break;

         default:
          localDW->is_Prescription_Config = CONFIG_Functional_IN_NO_ACTIVE_CHILD;
          break;
        }

        /* Exit 'Prescription_Config': '<S1>:4445' */
        localB->CONFIG_OUT_Config_Timer++;
        localDW->is_Configuration = CONFIG_Functional_IN_NO_ACTIVE_CHILD;
        break;

       default:
        localDW->is_Configuration = CONFIG_Functional_IN_NO_ACTIVE_CHILD;
        break;
      }

      localDW->is_c2_CONFIG_Functional = CONFIG_Functional_IN_NOT_ON;
    } else if (localDW->is_Configuration == CONFIG_Functional_IN_MAIN) {
      /* During 'MAIN': '<S1>:4518' */
DB_PRINTF("91: ");
      if (rtu_OP_CMD_IN->Data_Config || (localB->Infusion_Initiate &&
           (localB->CONFIG_OUT_Configured == 0))) {
        /* Transition: '<S1>:4442' */
        /* Exit 'MAIN': '<S1>:4518' */
DB_PRINTF("92: ");
        localB->CONFIG_OUT_Config_Mode = 1U;
        localB->CONFIG_OUT_Config_Timer = 0U;
        CONFIG_Functional_setReservoirVolume(localB, localDW);
        CONFIG_Functional_checkIfPrescriptionAvailable(localB, localDW);
        localDW->is_Configuration = CONFIG_Functional_IN_Prescription_Config;

        /* Entry 'Prescription_Config': '<S1>:4445' */
        localB->CONFIG_OUT_Config_Timer++;
        localB->CONFIG_OUT_Reservoir_Volume = localB->Reservoir_Volume;
        localB->CONFIG_OUT_Config_Mode = 2U;
        CONFIG_Functional_checkIfPrescriptionAvailable(localB, localDW);

        /* Entry Internal 'Prescription_Config': '<S1>:4445' */
        /* Transition: '<S1>:4449' */
        localDW->is_Prescription_Config = CONFIG_Functional_IN_SelectType;

        /* Entry 'SelectType': '<S1>:4486' */
        localB->CONFIG_OUT_Request_Configuration_Type = TRUE;
      } else {
DB_PRINTF("93: ");
        localB->CONFIG_OUT_Config_Mode = 1U;
        localB->CONFIG_OUT_Config_Timer = 0U;
        CONFIG_Functional_setReservoirVolume(localB, localDW);
        CONFIG_Functional_checkIfPrescriptionAvailable(localB, localDW);
      }
    } else {
DB_PRINTF("94: ");
      CONFIG_Functional_Prescription_Config(localB, localDW);
    }
  } else {
DB_PRINTF("95: ");
    /* During 'NOT_ON': '<S1>:4532' */
    if (rtu_TLM_MODE_IN->System_On) {
      /* Transition: '<S1>:4533' */
      localDW->is_c2_CONFIG_Functional = CONFIG_Functional_IN_Configuration;

      /* Entry Internal 'Configuration': '<S1>:4440' */
      /* Transition: '<S1>:4441' */
      localDW->is_Configuration = CONFIG_Functional_IN_MAIN;

      /* Entry 'MAIN': '<S1>:4518' */
      localB->CONFIG_OUT_Config_Mode = 1U;
      localB->CONFIG_OUT_Config_Timer = 0U;
      CONFIG_Functional_setReservoirVolume(localB, localDW);
      CONFIG_Functional_checkIfPrescriptionAvailable(localB, localDW);
    }
  }

  /* End of Chart: '<Root>/Config  Sub-System' */

  /* BusCreator: '<Root>/BusConversion_InsertedFor_CONFIG_OUT_at_inport_0' */
  rty_CONFIG_OUT->Patient_ID = localB->CONFIG_OUT_Patient_ID;
  rty_CONFIG_OUT->Drug_Name = localB->CONFIG_OUT_Drug_Name;
  rty_CONFIG_OUT->Drug_Concentration = localB->CONFIG_OUT_Drug_Concentration;
  rty_CONFIG_OUT->Infusion_Total_Duration =
    localB->CONFIG_OUT_Infusion_Total_Duration;
  rty_CONFIG_OUT->VTBI_Total = localB->CONFIG_OUT_Vtbi_Total;
  rty_CONFIG_OUT->Flow_Rate_Basal = localB->CONFIG_OUT_Flow_Rate_Basal;
  rty_CONFIG_OUT->Flow_Rate_Intermittent_Bolus =
    localB->CONFIG_OUT_Flow_Rate_Intermittent_bolus;
  rty_CONFIG_OUT->Duration_Intermittent_Bolus =
    localB->CONFIG_OUT_Intermittent_Bolus_Duration;
  rty_CONFIG_OUT->Interval_Intermittent_Bolus =
    localB->CONFIG_OUT_Interval_Intermittent_bolus;
  rty_CONFIG_OUT->Flow_Rate_Patient_Bolus =
    localB->CONFIG_OUT_Flow_Rate_Patient_bolus;
  rty_CONFIG_OUT->Duration_Patient_Bolus =
    localB->CONFIG_OUT_Patient_bolus_Duration;
  rty_CONFIG_OUT->Lockout_Period_Patient_Bolus =
    localB->CONFIG_OUT_Lock_Out_Duration;
  rty_CONFIG_OUT->Max_Number_of_Patient_Bolus =
    localB->CONFIG_OUT_Max_Patient_bolus;
  rty_CONFIG_OUT->Flow_Rate_KVO = localB->CONFIG_OUT_Flow_Rate_KVO;
  rty_CONFIG_OUT->Entered_Reservoir_Volume =
    localB->CONFIG_OUT_Entered_Reservoir_Volume;
  rty_CONFIG_OUT->Reservoir_Volume = localB->CONFIG_OUT_Reservoir_Volume;
  rty_CONFIG_OUT->Configured = localB->CONFIG_OUT_Configured;
  rty_CONFIG_OUT->Error_Message_ID = localB->CONFIG_OUT_Error_Message_ID;
  rty_CONFIG_OUT->Request_Config_Type =
    localB->CONFIG_OUT_Request_Configuration_Type;
  rty_CONFIG_OUT->Request_Confirm_Infusion_Initiate =
    localB->CONFIG_OUT_Request_Confirm_Infusion_Initiate;
  rty_CONFIG_OUT->Request_Patient_Drug_Info =
    localB->CONFIG_OUT_Request_Patient_Drug_Info;
  rty_CONFIG_OUT->Request_Infusion_Info =
    localB->CONFIG_OUT_Request_Infusion_Info;
  rty_CONFIG_OUT->Log_Message_ID = localB->CONFIG_OUT_Log_Message_ID;
  rty_CONFIG_OUT->Config_Timer = localB->CONFIG_OUT_Config_Timer;
  rty_CONFIG_OUT->Config_Mode = localB->CONFIG_OUT_Config_Mode;
}

/* Model initialize function */
void CONFIG_Functional_initialize(const char_T **rt_errorStatus,
  RT_MODEL_CONFIG_Functional_T *const CONFIG_Functional_M,
  B_CONFIG_Functional_c_T *localB, DW_CONFIG_Functional_f_T *localDW)
{
  /* Registration code */

  /* initialize error status */
  rtmSetErrorStatusPointer(CONFIG_Functional_M, rt_errorStatus);

  /* block I/O */
  (void) memset(((void *) localB), 0,
                sizeof(B_CONFIG_Functional_c_T));

  /* states (dwork) */
  (void) memset((void *)localDW, 0,
                sizeof(DW_CONFIG_Functional_f_T));
}
