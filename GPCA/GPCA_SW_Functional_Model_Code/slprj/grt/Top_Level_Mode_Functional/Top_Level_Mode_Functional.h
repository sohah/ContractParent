/*
 * Code generation for system model 'Top_Level_Mode_Functional'
 * For more details, see corresponding source file Top_Level_Mode_Functional.c
 *
 */
#ifndef RTW_HEADER_Top_Level_Mode_Functional_h_
#define RTW_HEADER_Top_Level_Mode_Functional_h_
#ifndef Top_Level_Mode_Functional_COMMON_INCLUDES_
# define Top_Level_Mode_Functional_COMMON_INCLUDES_
#include <string.h>
#include "rtwtypes.h"
#include "rtw_continuous.h"
#include "rtw_solver.h"
#endif                                 /* Top_Level_Mode_Functional_COMMON_INCLUDES_ */

#include "Top_Level_Mode_Functional_types.h"

/* Block signals for model 'Top_Level_Mode_Functional' */
typedef struct {
  uint8_T TLM_MODE_OUT_Log_Message_ID; /* '<Root>/Top Level Mode Sub-System' */
  boolean_T TLM_MODE_OUT_Request_Confirm_Stop;/* '<Root>/Top Level Mode Sub-System' */
} B_Top_Level_Mode_Functional_c_T;

/* Block states (auto storage) for model 'Top_Level_Mode_Functional' */
typedef struct {
  real_T confirmStopTimer;             /* '<Root>/Top Level Mode Sub-System' */
  uint8_T is_active_c2_Top_Level_Mode_Functional;/* '<Root>/Top Level Mode Sub-System' */
  uint8_T is_c2_Top_Level_Mode_Functional;/* '<Root>/Top Level Mode Sub-System' */
  uint8_T is_TOP_Level_Mode;           /* '<Root>/Top Level Mode Sub-System' */
  uint8_T is_Confirm_Stop;             /* '<Root>/Top Level Mode Sub-System' */
} DW_Top_Level_Mode_Functional_f_T;

/* Real-time Model Data Structure */
struct tag_RTM_Top_Level_Mode_Functional_T {
  const char_T **errorStatus;
};

typedef struct {
  B_Top_Level_Mode_Functional_c_T rtb;
  DW_Top_Level_Mode_Functional_f_T rtdw;
  RT_MODEL_Top_Level_Mode_Functional_T rtm;
} MdlrefDW_Top_Level_Mode_Functional_T;

/* Model reference registration function */
extern void Top_Level_Mode_Functional_initialize(const char_T **rt_errorStatus,
  RT_MODEL_Top_Level_Mode_Functional_T *const Top_Level_Mode_Functional_M,
  B_Top_Level_Mode_Functional_c_T *localB, DW_Top_Level_Mode_Functional_f_T
  *localDW);
extern void Top_Level_Mode_Functional_Init(B_Top_Level_Mode_Functional_c_T
  *localB, DW_Top_Level_Mode_Functional_f_T *localDW);
extern void Top_Level_Mode_Functional(const Operator_Commands *rtu_OP_CMD_IN,
  const Device_Configuration_Inputs *rtu_CONST_IN, Top_Level_Mode_Outputs
  *rty_TLM_MODE_OUT, B_Top_Level_Mode_Functional_c_T *localB,
  DW_Top_Level_Mode_Functional_f_T *localDW);

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
 * '<Root>' : 'Top_Level_Mode_Functional'
 * '<S1>'   : 'Top_Level_Mode_Functional/Top Level Mode Sub-System'
 */
#endif                                 /* RTW_HEADER_Top_Level_Mode_Functional_h_ */
