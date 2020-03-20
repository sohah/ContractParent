/*
 * Code generation for system model 'Logging_Functional'
 * For more details, see corresponding source file Logging_Functional.c
 *
 */
#ifndef RTW_HEADER_Logging_Functional_h_
#define RTW_HEADER_Logging_Functional_h_
#ifndef Logging_Functional_COMMON_INCLUDES_
# define Logging_Functional_COMMON_INCLUDES_
#include <string.h>
#include "rtwtypes.h"
#include "rtw_continuous.h"
#include "rtw_solver.h"
#endif                                 /* Logging_Functional_COMMON_INCLUDES_ */

#include "Logging_Functional_types.h"

/* Block signals for model 'Logging_Functional' */
typedef struct {
  uint8_T Log_Message_ID;
  uint8_T Log_Message_ID_e;
  uint8_T Log_Message_ID_eu;
  uint8_T Log_Message_ID_n;
  uint8_T Log_Message_ID_eue;
  uint8_T LOGGING_OUT_Log;             /* '<Root>/Log Sub-System' */
  boolean_T LOGGING_OUT_Logging_Failed;/* '<Root>/Log Sub-System' */
} B_Logging_Functional_c_T;

/* Block states (auto storage) for model 'Logging_Functional' */
typedef struct {
  uint8_T is_active_c2_Logging_Functional;/* '<Root>/Log Sub-System' */
  uint8_T is_c2_Logging_Functional;    /* '<Root>/Log Sub-System' */
} DW_Logging_Functional_f_T;

/* Real-time Model Data Structure */
struct tag_RTM_Logging_Functional_T {
  const char_T **errorStatus;
};

typedef struct {
  B_Logging_Functional_c_T rtb;
  DW_Logging_Functional_f_T rtdw;
  RT_MODEL_Logging_Functional_T rtm;
} MdlrefDW_Logging_Functional_T;

/* Model reference registration function */
extern void Logging_Functional_initialize(const char_T **rt_errorStatus,
  RT_MODEL_Logging_Functional_T *const Logging_Functional_M,
  B_Logging_Functional_c_T *localB, DW_Logging_Functional_f_T *localDW);
extern void Logging_Functional_Init(B_Logging_Functional_c_T *localB,
  DW_Logging_Functional_f_T *localDW);
extern void Logging_Functional(const Top_Level_Mode_Outputs *rtu_TLM_MODE_IN,
  const Config_Outputs *rtu_CONFIG_IN, const Alarm_Outputs *rtu_ALARM_IN, const
  System_Status_Outputs *rtu_SYS_STAT_IN, const Infusion_Manager_Outputs
  *rtu_IM_IN, Log_Output *rty_LOG_OUT, B_Logging_Functional_c_T *localB,
  DW_Logging_Functional_f_T *localDW);

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
 * '<Root>' : 'Logging_Functional'
 * '<S1>'   : 'Logging_Functional/Log Sub-System'
 */
#endif                                 /* RTW_HEADER_Logging_Functional_h_ */
