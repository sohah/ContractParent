/*
 * C:\Anitha\SVN\src\2010-GpcaMedicalDevice\Model\controller\slprj\grt\_sharedutils\div_s32.c
 *
 * Code generation for model "ALARM_Functional".
 *
 * Model version              : 1.1326
 * Simulink Coder version : 8.4 (R2013a) 13-Feb-2013
 * C source code generated on : Thu Sep 12 09:49:37 2013
 * Created for block: ALARM_Functional
 */

#include "rtwtypes.h"
#include "rtw_shared_utils.h"
#include "../../../GPCA_SW_Functional_grt_rtw/tmwtypes.h"


//TODO: SOHA
int32_T div_s32(int32_T numerator, int32_T denominator) {
    int32_T quotient;
    uint32_T tempAbsQuotient;
    uint32_T quotientNeedsNegation;
    if (denominator == 0) {
        quotient = numerator >= 0 ? MAX_int32_T : MIN_int32_T;

        /* Divide by zero handler */
    } else {
        quotientNeedsNegation = (uint32_T) ((numerator < 0) != (denominator < 0));
        tempAbsQuotient = (uint32_T) (numerator >= 0 ? numerator : -numerator) /
                          (denominator >= 0 ? denominator : -denominator);
        quotient = quotientNeedsNegation ? -(int32_T) tempAbsQuotient : (int32_T)
                tempAbsQuotient;
    }

    return quotient;
}
