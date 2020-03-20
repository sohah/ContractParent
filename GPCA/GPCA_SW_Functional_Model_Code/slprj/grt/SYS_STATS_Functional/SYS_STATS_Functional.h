/*
 * Code generation for system model 'SYS_STATS_Functional'
 * For more details, see corresponding source file SYS_STATS_Functional.c
 *
 */
#ifndef RTW_HEADER_SYS_STATS_Functional_h_
#define RTW_HEADER_SYS_STATS_Functional_h_
#ifndef SYS_STATS_Functional_COMMON_INCLUDES_
# define SYS_STATS_Functional_COMMON_INCLUDES_
#include <string.h>
#include "rtwtypes.h"
#include "rtw_continuous.h"
#include "rtw_solver.h"
#endif                                 /* SYS_STATS_Functional_COMMON_INCLUDES_ */

#include "SYS_STATS_Functional_types.h"
#include "../../../GPCA_SW_Functional_grt_rtw/tmwtypes.h"

/* Block signals for model 'SYS_STATS_Functional' */
typedef struct {
  uint8_T Subtract1;                   /* '<S5>/Subtract1' */
} B_SYS_STATS_Functional_c_T;

/* Block states (auto storage) for model 'SYS_STATS_Functional' */
typedef struct {
  uint8_T UnitDelay_DSTATE;            /* '<S5>/Unit Delay' */
} DW_SYS_STATS_Functional_f_T;

/* Real-time Model Data Structure */
struct tag_RTM_SYS_STATS_Functional_T {
  const char_T **errorStatus;
};

typedef struct {
  B_SYS_STATS_Functional_c_T rtb;
  DW_SYS_STATS_Functional_f_T rtdw;
  RT_MODEL_SYS_STATS_Functional_T rtm;
} MdlrefDW_SYS_STATS_Functional_T;

/* Model reference registration function */
extern void SYS_STATS_Functional_initialize(const char_T **rt_errorStatus,
  RT_MODEL_SYS_STATS_Functional_T *const SYS_STATS_Functional_M,
  B_SYS_STATS_Functional_c_T *localB, DW_SYS_STATS_Functional_f_T *localDW);
extern void SYS_STATS_Functional_Init(DW_SYS_STATS_Functional_f_T *localDW);
extern void SYS_STATS_Functional_Update(B_SYS_STATS_Functional_c_T *localB,
  DW_SYS_STATS_Functional_f_T *localDW);
extern void SYS_STATS_Functional(const Infusion_Manager_Outputs *rtu_IM_IN,
  const Top_Level_Mode_Outputs *rtu_TLM_MODE_IN, const Device_Sensor_Inputs
  *rtu_SENSOR_IN, const Device_Configuration_Inputs *rtu_CONST_IN, const
  Config_Outputs *rtu_CONFIG_IN, System_Status_Outputs *rty_SYS_STAT_OUT,
  B_SYS_STATS_Functional_c_T *localB, DW_SYS_STATS_Functional_f_T *localDW);

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
 * '<Root>' : 'SYS_STATS_Functional'
 * '<S1>'   : 'SYS_STATS_Functional/System Status  Sub-System'
 * '<S2>'   : 'SYS_STATS_Functional/System Status  Sub-System/In_Therapy'
 * '<S3>'   : 'SYS_STATS_Functional/System Status  Sub-System/Log'
 * '<S4>'   : 'SYS_STATS_Functional/System Status  Sub-System/Reservoir_Status'
 * '<S5>'   : 'SYS_STATS_Functional/System Status  Sub-System/Total_Volume_Infused'
 */
#endif                                 /* RTW_HEADER_SYS_STATS_Functional_h_ */
