/*
 * GPCA_SW_Functional.h
 *
 * Code generation for model "GPCA_SW_Functional".
 *
 * Model version              : 1.1238
 * Simulink Coder version : 8.4 (R2013a) 13-Feb-2013
 * C source code generated on : Tue Aug 20 14:29:47 2013
 *
 * Target selection: grt.tlc
 * Note: GRT includes extra infrastructure and instrumentation for prototyping
 * Embedded hardware selection: 32-bit Generic
 * Code generation objectives: Unspecified
 * Validation result: Not run
 */
#ifndef RTW_HEADER_GPCA_SW_Functional_h_
#define RTW_HEADER_GPCA_SW_Functional_h_
#ifndef GPCA_SW_Functional_COMMON_INCLUDES_
# define GPCA_SW_Functional_COMMON_INCLUDES_
#include <float.h>
#include <stddef.h>
#include <string.h>
#include "rtwtypes.h"
#include "rtw_continuous.h"
#include "rtw_solver.h"
#include "rt_logging.h"
#include "rt_nonfinite.h"
#endif                                 /* GPCA_SW_Functional_COMMON_INCLUDES_ */

#include "GPCA_SW_Functional_types.h"

/* Child system includes */
#include "GPCA_SW_Logical_Architecture.h"

/* Macros for accessing real-time model data structure */
#ifndef rtmGetFinalTime
# define rtmGetFinalTime(rtm)          ((rtm)->Timing.tFinal)
#endif

#ifndef rtmGetRTWLogInfo
# define rtmGetRTWLogInfo(rtm)         ((rtm)->rtwLogInfo)
#endif

#ifndef rtmGetErrorStatus
# define rtmGetErrorStatus(rtm)        ((rtm)->errorStatus)
#endif

#ifndef rtmSetErrorStatus
# define rtmSetErrorStatus(rtm, val)   ((rtm)->errorStatus = (val))
#endif

#ifndef rtmGetErrorStatusPointer
# define rtmGetErrorStatusPointer(rtm) ((const char_T **)(&((rtm)->errorStatus)))
#endif

#ifndef rtmGetStopRequested
# define rtmGetStopRequested(rtm)      ((rtm)->Timing.stopRequestedFlag)
#endif

#ifndef rtmSetStopRequested
# define rtmSetStopRequested(rtm, val) ((rtm)->Timing.stopRequestedFlag = (val))
#endif

#ifndef rtmGetStopRequestedPtr
# define rtmGetStopRequestedPtr(rtm)   (&((rtm)->Timing.stopRequestedFlag))
#endif

#ifndef rtmGetT
# define rtmGetT(rtm)                  ((rtm)->Timing.taskTime0)
#endif

#ifndef rtmGetTFinal
# define rtmGetTFinal(rtm)             ((rtm)->Timing.tFinal)
#endif

/* Block signals (auto storage) */
typedef struct {
  GPCA_SW_Outputs GPCASOFTWARE;        /* '<Root>/GPCA SOFTWARE' */
} B_GPCA_SW_Functional_T;

/* Block states (auto storage) for system '<Root>' */
typedef struct {
  MdlrefDW_GPCA_SW_Logical_Architecture_T GPCASOFTWARE_DWORK1;/* '<Root>/GPCA SOFTWARE' */
} DW_GPCA_SW_Functional_T;

/* External inputs (root inport signals with auto storage) */
typedef struct {
  Device_Sensor_Inputs SENSOR_IN;      /* '<Root>/SENSOR_IN' */
  Device_Configuration_Inputs CONST_IN;/* '<Root>/CONST_IN' */
  Operator_Commands OP_CMD_IN;         /* '<Root>/OP_CMD_IN' */
  Drug_Database_Inputs DB_IN;          /* '<Root>/DB_IN' */
  Prescription_Inputs PRES_IN;         /* '<Root>/PRES_IN' */
  Patient_Inputs PATIENT_IN;           /* '<Root>/PATIENT_IN' */
} ExtU_GPCA_SW_Functional_T;

/* External outputs (root outports fed by signals with auto storage) */
typedef struct {
  GPCA_SW_Outputs GPCA_SW_OUT;         /* '<Root>/GPCA_SW_OUT' */
} ExtY_GPCA_SW_Functional_T;

/* Real-time Model Data Structure */
struct tag_RTM_GPCA_SW_Functional_T {
  const char_T *errorStatus;
  RTWLogInfo *rtwLogInfo;

  /*
   * Timing:
   * The following substructure contains information regarding
   * the timing information for the model.
   */
  struct {
    time_T taskTime0;
    uint32_T clockTick0;
    uint32_T clockTickH0;
    time_T stepSize0;
    time_T tFinal;
    boolean_T stopRequestedFlag;
  } Timing;
};

/* Block signals (auto storage) */
extern B_GPCA_SW_Functional_T GPCA_SW_Functional_B;

/* Block states (auto storage) */
extern DW_GPCA_SW_Functional_T GPCA_SW_Functional_DW;

/* External inputs (root inport signals with auto storage) */
extern ExtU_GPCA_SW_Functional_T GPCA_SW_Functional_U;

/* External outputs (root outports fed by signals with auto storage) */
extern ExtY_GPCA_SW_Functional_T GPCA_SW_Functional_Y;

/* External data declarations for dependent source files */
extern const GPCA_SW_Outputs GPCA_SW_Functional_rtZGPCA_SW_Outputs;/* GPCA_SW_Outputs ground */

/* Model entry point functions */
extern void GPCA_SW_Functional_initialize(void);
extern void GPCA_SW_Functional_step(void);
extern void GPCA_SW_Functional_terminate(void);

/* Real-time Model object */
extern RT_MODEL_GPCA_SW_Functional_T *const GPCA_SW_Functional_M;

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
 * '<Root>' : 'GPCA_SW_Functional'
 */
#endif                                 /* RTW_HEADER_GPCA_SW_Functional_h_ */
