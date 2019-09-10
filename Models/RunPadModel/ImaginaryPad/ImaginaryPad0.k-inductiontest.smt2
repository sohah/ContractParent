(set-option :produce-models true)
(define-fun T ((%init Bool) ($sig$0 Int) ($ignition$0 Bool) ($start_bt$0 Bool) ($launch_bt$0 Bool) ($reset_flag$0 Bool) ($p1$0 Bool) ($sig$1 Int) ($ignition$1 Bool) ($start_bt$1 Bool) ($launch_bt$1 Bool) ($reset_flag$1 Bool) ($p1$1 Bool)) Bool (and (= $start_bt$1 (ite %init false (ite $reset_flag$1 false (ite (and (and (not $start_bt$0) (not $launch_bt$0)) (= $sig$1 0)) true $start_bt$0)))) (= $launch_bt$1 (ite %init false (ite $reset_flag$1 false (ite (and (and $start_bt$0 (not $launch_bt$0)) (= $sig$1 1)) true $launch_bt$0)))) (= $ignition$1 (ite %init false (and $launch_bt$0 (not $reset_flag$1)))) (= $reset_flag$1 (ite %init false $ignition$0)) (= $p1$1 (=> $ignition$1 (and $launch_bt$0 $start_bt$0)))))
(declare-fun %init () Bool)
(declare-fun $sig$~1 () Int)
(declare-fun $ignition$~1 () Bool)
(declare-fun $start_bt$~1 () Bool)
(declare-fun $launch_bt$~1 () Bool)
(declare-fun $reset_flag$~1 () Bool)
(declare-fun $p1$~1 () Bool)
(assert (and (<= 0 $sig$~1) (<= $sig$~1 2)))
; K = 0
(declare-fun $sig$0 () Int)
(declare-fun $ignition$0 () Bool)
(declare-fun $start_bt$0 () Bool)
(declare-fun $launch_bt$0 () Bool)
(declare-fun $reset_flag$0 () Bool)
(declare-fun $p1$0 () Bool)
(assert (and (<= 0 $sig$0) (<= $sig$0 2)))
(assert (T %init $sig$~1 $ignition$~1 $start_bt$~1 $launch_bt$~1 $reset_flag$~1 $p1$~1 $sig$0 $ignition$0 $start_bt$0 $launch_bt$0 $reset_flag$0 $p1$0))
(assert true)
(declare-fun act1 () Bool)
(assert (=> act1 (not (=> true $p1$0))))
(check-sat act1)
(echo "@DONE")
; Z3: sat
; Z3: @DONE
(get-model)
(echo "@DONE")
; Z3: (model
; Z3:   (define-fun act1 () Bool
; Z3:     true)
; Z3:   (define-fun $p1$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt$0 () Bool
; Z3:     true)
; Z3:   (define-fun %init () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt$~1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $ignition$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$~1 () Int
; Z3:     0)
; Z3:   (define-fun $ignition$0 () Bool
; Z3:     true)
; Z3:   (define-fun $sig$0 () Int
; Z3:     0)
; Z3: )
; Z3: @DONE
; K = 1
(declare-fun $sig$1 () Int)
(declare-fun $ignition$1 () Bool)
(declare-fun $start_bt$1 () Bool)
(declare-fun $launch_bt$1 () Bool)
(declare-fun $reset_flag$1 () Bool)
(declare-fun $p1$1 () Bool)
(assert (and (<= 0 $sig$1) (<= $sig$1 2)))
(assert (T false $sig$0 $ignition$0 $start_bt$0 $launch_bt$0 $reset_flag$0 $p1$0 $sig$1 $ignition$1 $start_bt$1 $launch_bt$1 $reset_flag$1 $p1$1))
(assert true)
(declare-fun act2 () Bool)
(assert (=> act2 (not (=> $p1$0 $p1$1))))
(check-sat act2)
(echo "@DONE")
; Z3: unsat
; Z3: @DONE
(assert $p1$0)
(assert $p1$1)
