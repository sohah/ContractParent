/*
 * Code generation for system model 'CONFIG_Functional'
 * For more details, see corresponding source file CONFIG_Functional.c
 *
 */
#ifndef RTW_HEADER_CONFIG_Functional_h_
#define RTW_HEADER_CONFIG_Functional_h_
#ifndef CONFIG_Functional_COMMON_INCLUDES_
# define CONFIG_Functional_COMMON_INCLUDES_
#include <string.h>
#include "rtwtypes.h"
#include "rtw_continuous.h"
#include "rtw_solver.h"
#endif                                 /* CONFIG_Functional_COMMON_INCLUDES_ */

#include "CONFIG_Functional_types.h"

/* Block signals for model 'CONFIG_Functional' */
typedef struct {
  uint8_T Patient_ID;
  uint8_T Drug_Name;
  uint8_T Drug_Concentration;
  uint8_T VTBI_Total;
  uint8_T Total_Duration;
  uint8_T Flow_Rate_Basal;
  uint8_T Flow_Rate_Intermittent_Bolus;
  uint8_T Duration_Intermittent_Bolus;
  uint8_T Interval_Intermittent_Bolus;
  uint8_T Flow_Rate_Patient_Bolus;
  uint8_T Duration_Patient_Bolus;
  uint8_T Lockout_Period_Patient_Bolus;
  uint8_T Max_Number_of_Patient_Bolus;
  uint8_T Entered_Reservoir_Volume;
  uint8_T Configuration_Type;
  uint8_T Drug_Name_d;
  uint8_T Drug_Concentration_High;
  uint8_T Drug_Concentration_Low;
  uint8_T VTBI_High;
  uint8_T VTBI_Low;
  uint8_T Number_Max_Patient_Bolus;
  uint8_T Flow_Rate_KVO;
  uint8_T Flow_Rate_High;
  uint8_T Flow_Rate_Low;
  uint8_T Empty_Reservoir;
  uint8_T Max_Config_Duration;
  uint8_T Reservoir_Volume;
  uint8_T CONFIG_OUT_Patient_ID;       /* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Drug_Name;        /* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Drug_Concentration;/* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Infusion_Total_Duration;/* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Vtbi_Total;       /* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Flow_Rate_Basal;  /* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Flow_Rate_Intermittent_bolus;/* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Intermittent_Bolus_Duration;/* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Interval_Intermittent_bolus;/* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Flow_Rate_Patient_bolus;/* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Patient_bolus_Duration;/* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Lock_Out_Duration;/* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Max_Patient_bolus;/* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Flow_Rate_KVO;    /* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Entered_Reservoir_Volume;/* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Reservoir_Volume; /* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Configured;       /* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Error_Message_ID; /* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Log_Message_ID;   /* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Config_Timer;     /* '<Root>/Config  Sub-System' */
  uint8_T CONFIG_OUT_Config_Mode;      /* '<Root>/Config  Sub-System' */
  boolean_T Infusion_Initiate;
  boolean_T Next;
  boolean_T Back;
  boolean_T Cancel;
  boolean_T In_Therapy;
  boolean_T CONFIG_OUT_Request_Configuration_Type;/* '<Root>/Config  Sub-System' */
  boolean_T CONFIG_OUT_Request_Confirm_Infusion_Initiate;/* '<Root>/Config  Sub-System' */
  boolean_T CONFIG_OUT_Request_Patient_Drug_Info;/* '<Root>/Config  Sub-System' */
  boolean_T CONFIG_OUT_Request_Infusion_Info;/* '<Root>/Config  Sub-System' */
} B_CONFIG_Functional_c_T;

/* Block states (auto storage) for model 'CONFIG_Functional' */
typedef struct {
  uint8_T is_active_c2_CONFIG_Functional;/* '<Root>/Config  Sub-System' */
  uint8_T is_c2_CONFIG_Functional;     /* '<Root>/Config  Sub-System' */
  uint8_T is_Configuration;            /* '<Root>/Config  Sub-System' */
  uint8_T is_Prescription_Config;      /* '<Root>/Config  Sub-System' */
  uint8_T is_Patient_Drug_info;        /* '<Root>/Config  Sub-System' */
  uint8_T is_Infusion_info;            /* '<Root>/Config  Sub-System' */
  uint8_T t_DrugConcentration;         /* '<Root>/Config  Sub-System' */
  uint8_T t_DrugName;                  /* '<Root>/Config  Sub-System' */
  uint8_T t_Duration_pbolus;           /* '<Root>/Config  Sub-System' */
  uint8_T t_Duration_sbolus;           /* '<Root>/Config  Sub-System' */
  uint8_T t_Duration_total;            /* '<Root>/Config  Sub-System' */
  uint8_T t_FlowRate_basal;            /* '<Root>/Config  Sub-System' */
  uint8_T t_FlowRate_kvo;              /* '<Root>/Config  Sub-System' */
  uint8_T t_FlowRate_pbolus;           /* '<Root>/Config  Sub-System' */
  uint8_T t_FlowRate_sbolus;           /* '<Root>/Config  Sub-System' */
  uint8_T t_Interval_sbolus;           /* '<Root>/Config  Sub-System' */
  uint8_T t_LockOutPeriod_pbolus;      /* '<Root>/Config  Sub-System' */
  uint8_T t_NumberMax_pbolus;          /* '<Root>/Config  Sub-System' */
  uint8_T t_PatientID;                 /* '<Root>/Config  Sub-System' */
  uint8_T t_EnteredReservoirVolume;    /* '<Root>/Config  Sub-System' */
  uint8_T t_VTBI_total;                /* '<Root>/Config  Sub-System' */
  uint8_T validate;                    /* '<Root>/Config  Sub-System' */
  uint8_T value;                       /* '<Root>/Config  Sub-System' */
  uint8_T Selected_Config_Type;        /* '<Root>/Config  Sub-System' */
  boolean_T New_Configuration;         /* '<Root>/Config  Sub-System' */
} DW_CONFIG_Functional_f_T;

/* Real-time Model Data Structure */
struct tag_RTM_CONFIG_Functional_T {
  const char_T **errorStatus;
};

typedef struct {
  B_CONFIG_Functional_c_T rtb;
  DW_CONFIG_Functional_f_T rtdw;
  RT_MODEL_CONFIG_Functional_T rtm;
} MdlrefDW_CONFIG_Functional_T;

/* Model reference registration function */
extern void CONFIG_Functional_initialize(const char_T **rt_errorStatus,
  RT_MODEL_CONFIG_Functional_T *const CONFIG_Functional_M,
  B_CONFIG_Functional_c_T *localB, DW_CONFIG_Functional_f_T *localDW);
extern void CONFIG_Functional_Init(B_CONFIG_Functional_c_T *localB,
  DW_CONFIG_Functional_f_T *localDW);
extern void CONFIG_Functional(const Top_Level_Mode_Outputs *rtu_TLM_MODE_IN,
  const Prescription_Inputs *rtu_PRES_IN, const Operator_Commands *rtu_OP_CMD_IN,
  const Drug_Database_Inputs *rtu_DB_IN, const Device_Configuration_Inputs
  *rtu_CONST_IN, const System_Status_Outputs *rtu_SYS_STAT_IN, Config_Outputs
  *rty_CONFIG_OUT, B_CONFIG_Functional_c_T *localB, DW_CONFIG_Functional_f_T
  *localDW);

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
 * '<Root>' : 'CONFIG_Functional'
 * '<S1>'   : 'CONFIG_Functional/Config  Sub-System'
 */
#endif                                 /* RTW_HEADER_CONFIG_Functional_h_ */
