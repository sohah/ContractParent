/*
 * Code generation for system model 'INFUSION_MGR_Functional'
 * For more details, see corresponding source file INFUSION_MGR_Functional.c
 *
 */
#ifndef RTW_HEADER_INFUSION_MGR_Functional_h_
#define RTW_HEADER_INFUSION_MGR_Functional_h_
#ifndef INFUSION_MGR_Functional_COMMON_INCLUDES_
# define INFUSION_MGR_Functional_COMMON_INCLUDES_
#include <string.h>
#include "rtwtypes.h"
#include "rtw_continuous.h"
#include "rtw_solver.h"
#endif                                 /* INFUSION_MGR_Functional_COMMON_INCLUDES_ */

#include "INFUSION_MGR_Functional_types.h"
#include "../../../GPCA_SW_Functional_grt_rtw/tmwtypes.h"

/* Block signals for model 'INFUSION_MGR_Functional' */
typedef struct {
  uint8_T Highest_Level_Alarm;
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
  uint8_T Configured;
  uint8_T Volume_Infused;
  uint8_T IM_OUT_Flow_Rate_Commanded;  /* '<Root>/Infusion Manager Sub-System' */
  uint8_T IM_OUT_Current_System_Mode;  /* '<Root>/Infusion Manager Sub-System' */
  uint8_T IM_OUT_Log_Message_ID;       /* '<Root>/Infusion Manager Sub-System' */
  uint8_T IM_OUT_Actual_Infusion_Duration;/* '<Root>/Infusion Manager Sub-System' */
  boolean_T Infusion_Initiate;
  boolean_T Infusion_Inhibit;
  boolean_T Infusion_Cancel;
  boolean_T Patient_Bolus_Request;
  boolean_T Reservoir_Empty;
  boolean_T IM_OUT_New_Infusion;       /* '<Root>/Infusion Manager Sub-System' */
} B_INFUSION_MGR_Functional_c_T;

/* Block states (auto storage) for model 'INFUSION_MGR_Functional' */
typedef struct {
  uint8_T is_active_c2_INFUSION_MGR_Functional;/* '<Root>/Infusion Manager Sub-System' */
  uint8_T is_c2_INFUSION_MGR_Functional;/* '<Root>/Infusion Manager Sub-System' */
  uint8_T is_Infusion_Manager;         /* '<Root>/Infusion Manager Sub-System' */
  uint8_T is_THERAPY;                  /* '<Root>/Infusion Manager Sub-System' */
  uint8_T is_Arbiter;                  /* '<Root>/Infusion Manager Sub-System' */
  uint8_T is_active_Arbiter;           /* '<Root>/Infusion Manager Sub-System' */
  uint8_T is_Alarm_Paused;             /* '<Root>/Infusion Manager Sub-System' */
  uint8_T is_active_Alarm_Paused;      /* '<Root>/Infusion Manager Sub-System' */
  uint8_T is_Manual_Paused;            /* '<Root>/Infusion Manager Sub-System' */
  uint8_T is_active_Manual_Paused;     /* '<Root>/Infusion Manager Sub-System' */
  uint8_T is_BASAL;                    /* '<Root>/Infusion Manager Sub-System' */
  uint8_T is_active_BASAL;             /* '<Root>/Infusion Manager Sub-System' */
  uint8_T is_Arbiter_d;                /* '<Root>/Infusion Manager Sub-System' */
  uint8_T is_active_Arbiter_c;         /* '<Root>/Infusion Manager Sub-System' */
  uint8_T is_PATIENT;                  /* '<Root>/Infusion Manager Sub-System' */
  uint8_T is_active_PATIENT;           /* '<Root>/Infusion Manager Sub-System' */
  uint8_T is_INTERMITTENT;             /* '<Root>/Infusion Manager Sub-System' */
  uint8_T is_active_INTERMITTENT;      /* '<Root>/Infusion Manager Sub-System' */
  uint8_T sbolus_timer;                /* '<Root>/Infusion Manager Sub-System' */
  uint8_T pbolus_timer;                /* '<Root>/Infusion Manager Sub-System' */
  uint8_T lock_timer;                  /* '<Root>/Infusion Manager Sub-System' */
  uint8_T number_pbolus;               /* '<Root>/Infusion Manager Sub-System' */
  uint8_T sbolusInter_timer;           /* '<Root>/Infusion Manager Sub-System' */
  boolean_T sbolus_req;                /* '<Root>/Infusion Manager Sub-System' */
  boolean_T inPatientBolus;            /* '<Root>/Infusion Manager Sub-System' */
} DW_INFUSION_MGR_Functional_f_T;

/* Real-time Model Data Structure */
struct tag_RTM_INFUSION_MGR_Functional_T {
  const char_T **errorStatus;
};

typedef struct {
  B_INFUSION_MGR_Functional_c_T rtb;
  DW_INFUSION_MGR_Functional_f_T rtdw;
  RT_MODEL_INFUSION_MGR_Functional_T rtm;
} MdlrefDW_INFUSION_MGR_Functional_T;

/* Model reference registration function */
extern void INFUSION_MGR_Functional_initialize(const char_T **rt_errorStatus,
  RT_MODEL_INFUSION_MGR_Functional_T *const INFUSION_MGR_Functional_M,
  B_INFUSION_MGR_Functional_c_T *localB, DW_INFUSION_MGR_Functional_f_T *localDW);
extern void INFUSION_MGR_Functional_Init(B_INFUSION_MGR_Functional_c_T *localB,
  DW_INFUSION_MGR_Functional_f_T *localDW);
extern void INFUSION_MGR_Functional(const Top_Level_Mode_Outputs
  *rtu_TLM_MODE_IN, const Operator_Commands *rtu_OP_CMD_IN, const Patient_Inputs
  *rtu_PATIENT_IN, const Config_Outputs *rtu_CONFIG_IN, const Alarm_Outputs
  *rtu_ALARM_IN, const System_Status_Outputs *rtu_SYS_STAT_IN,
  Infusion_Manager_Outputs *rty_IM_OUT, B_INFUSION_MGR_Functional_c_T *localB,
  DW_INFUSION_MGR_Functional_f_T *localDW);

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
 * '<Root>' : 'INFUSION_MGR_Functional'
 * '<S1>'   : 'INFUSION_MGR_Functional/Infusion Manager Sub-System'
 */
#endif                                 /* RTW_HEADER_INFUSION_MGR_Functional_h_ */
