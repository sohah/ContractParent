/*
 * Code generation for system model 'System_Monitor_Functional'
 * For more details, see corresponding source file System_Monitor_Functional.c
 *
 */
#ifndef RTW_HEADER_System_Monitor_Functional_h_
#define RTW_HEADER_System_Monitor_Functional_h_
#ifndef System_Monitor_Functional_COMMON_INCLUDES_
# define System_Monitor_Functional_COMMON_INCLUDES_
#include <string.h>
#include "rtwtypes.h"
#include "rtw_continuous.h"
#include "rtw_solver.h"
#endif                                 /* System_Monitor_Functional_COMMON_INCLUDES_ */

#include "System_Monitor_Functional_types.h"

/* Block signals for model 'System_Monitor_Functional' */
typedef struct {
  boolean_T SYS_MON_OUT_System_Monitor_Failed;/* '<Root>/System Monitor Sub-System' */
} B_System_Monitor_Functional_c_T;

/* Block states (auto storage) for model 'System_Monitor_Functional' */
typedef struct {
  uint8_T is_active_c1_System_Monitor_Functional;/* '<Root>/System Monitor Sub-System' */
  uint8_T is_c1_System_Monitor_Functional;/* '<Root>/System Monitor Sub-System' */
} DW_System_Monitor_Functional_f_T;

/* Real-time Model Data Structure */
struct tag_RTM_System_Monitor_Functional_T {
  const char_T **errorStatus;
};

typedef struct {
  B_System_Monitor_Functional_c_T rtb;
  DW_System_Monitor_Functional_f_T rtdw;
  RT_MODEL_System_Monitor_Functional_T rtm;
} MdlrefDW_System_Monitor_Functional_T;

/* Model reference registration function */
extern void System_Monitor_Functional_initialize(const char_T **rt_errorStatus,
  RT_MODEL_System_Monitor_Functional_T *const System_Monitor_Functional_M,
  B_System_Monitor_Functional_c_T *localB, DW_System_Monitor_Functional_f_T
  *localDW);
extern void System_Monitor_Functional_Init(B_System_Monitor_Functional_c_T
  *localB, DW_System_Monitor_Functional_f_T *localDW);
extern void System_Monitor_Functional(const Top_Level_Mode_Outputs
  *rtu_TLM_MODE_IN, System_Monitor_Output *rty_SYS_MON_OUT,
  B_System_Monitor_Functional_c_T *localB, DW_System_Monitor_Functional_f_T
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
 * '<Root>' : 'System_Monitor_Functional'
 * '<S1>'   : 'System_Monitor_Functional/System Monitor Sub-System'
 */
#endif                                 /* RTW_HEADER_System_Monitor_Functional_h_ */
