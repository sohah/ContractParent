(set-option :produce-models true)
(set-option :produce-unsat-cores true)
(define-fun T ((%init Bool) ($sig$0 Int) ($ignition$0 Bool) ($start_bt$0 Bool) ($launch_bt$0 Bool) ($reset_flag$0 Bool) ($p1$0 Bool) ($H~0.in$0 Bool) ($H~0.out$0 Bool) ($Y~0.out$0 Bool) ($sig$1 Int) ($ignition$1 Bool) ($start_bt$1 Bool) ($launch_bt$1 Bool) ($reset_flag$1 Bool) ($p1$1 Bool) ($H~0.in$1 Bool) ($H~0.out$1 Bool) ($Y~0.out$1 Bool)) Bool (and (= $start_bt$1 (ite %init false (ite $reset_flag$0 false (ite (and (and (not $start_bt$0) (not $launch_bt$0)) (= $sig$1 0)) true $start_bt$0)))) (= $launch_bt$1 (ite %init false (ite $reset_flag$0 false (ite (and (and $start_bt$0 (not $launch_bt$0)) (= $sig$1 1)) true $launch_bt$0)))) (= $ignition$1 (ite %init false (and $launch_bt$0 (and (not $ignition$0) (not $reset_flag$0))))) (= $reset_flag$1 (ite %init false (and $ignition$0 (not $reset_flag$0)))) (= $p1$1 $H~0.out$1) (= $H~0.in$1 (=> $reset_flag$1 $Y~0.out$1)) (= $H~0.out$1 (ite %init $H~0.in$1 (and $H~0.in$1 $H~0.out$0))) (= $Y~0.out$1 (ite %init false $ignition$0))))
(declare-fun %init () Bool)
; Proposed 19 candidates
(declare-fun $sig$~1 () Int)
(declare-fun $ignition$~1 () Bool)
(declare-fun $start_bt$~1 () Bool)
(declare-fun $launch_bt$~1 () Bool)
(declare-fun $reset_flag$~1 () Bool)
(declare-fun $p1$~1 () Bool)
(declare-fun $H~0.in$~1 () Bool)
(declare-fun $H~0.out$~1 () Bool)
(declare-fun $Y~0.out$~1 () Bool)
(assert (and (<= 0 $sig$~1) (<= $sig$~1 2)))
(declare-fun $sig$0 () Int)
(declare-fun $ignition$0 () Bool)
(declare-fun $start_bt$0 () Bool)
(declare-fun $launch_bt$0 () Bool)
(declare-fun $reset_flag$0 () Bool)
(declare-fun $p1$0 () Bool)
(declare-fun $H~0.in$0 () Bool)
(declare-fun $H~0.out$0 () Bool)
(declare-fun $Y~0.out$0 () Bool)
(assert (and (<= 0 $sig$0) (<= $sig$0 2)))
; K = 1
(push 1)
(assert (T true $sig$~1 $ignition$~1 $start_bt$~1 $launch_bt$~1 $reset_flag$~1 $p1$~1 $H~0.in$~1 $H~0.out$~1 $Y~0.out$~1 $sig$0 $ignition$0 $start_bt$0 $launch_bt$0 $reset_flag$0 $p1$0 $H~0.in$0 $H~0.out$0 $Y~0.out$0))
(declare-fun act1 () Bool)
(assert (=> act1 (not (and false (= $sig$0 0) (= $sig$0 1) (= $sig$0 2) $p1$0 (not $p1$0) $reset_flag$0 (not $reset_flag$0) $Y~0.out$0 (not $Y~0.out$0) $start_bt$0 (not $start_bt$0) $H~0.out$0 (not $H~0.out$0) $launch_bt$0 (not $launch_bt$0) $ignition$0 (not $ignition$0)))))
(check-sat act1)
(echo "@DONE")
; Z3: sat
; Z3: @DONE
(get-model)
(echo "@DONE")
; Z3: (model 
; Z3:   (define-fun act1 () Bool
; Z3:     true)
; Z3:   (define-fun $H~0.out$0 () Bool
; Z3:     true)
; Z3:   (define-fun $launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $p1$0 () Bool
; Z3:     true)
; Z3:   (define-fun $H~0.in$0 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $Y~0.out$0 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$~1 () Int
; Z3:     0)
; Z3:   (define-fun $ignition$0 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$0 () Int
; Z3:     0)
; Z3: )
; Z3: @DONE
; Finished single base step refinement
