(set-option :produce-models true)
(set-option :produce-unsat-cores true)
(define-fun T ((%init Bool) ($sig$0 Int) ($ignition$0 Bool) ($reset_flag$0 Bool) ($p1$0 Bool) ($start_bt_val~0.start_bt$0 Bool) ($start_bt_val~0.launch_bt$0 Bool) ($start_bt_val~0.reset_flag$0 Bool) ($start_bt_val~0.start_bt_out$0 Bool) ($launch_bt_val~0.start_bt$0 Bool) ($launch_bt_val~0.launch_bt$0 Bool) ($launch_bt_val~0.reset_flag$0 Bool) ($launch_bt_val~0.launch_bt_out$0 Bool) ($sig$1 Int) ($ignition$1 Bool) ($reset_flag$1 Bool) ($p1$1 Bool) ($start_bt_val~0.start_bt$1 Bool) ($start_bt_val~0.launch_bt$1 Bool) ($start_bt_val~0.reset_flag$1 Bool) ($start_bt_val~0.start_bt_out$1 Bool) ($launch_bt_val~0.start_bt$1 Bool) ($launch_bt_val~0.launch_bt$1 Bool) ($launch_bt_val~0.reset_flag$1 Bool) ($launch_bt_val~0.launch_bt_out$1 Bool)) Bool (and (= $ignition$1 (ite %init false $launch_bt_val~0.launch_bt_out$0)) (= $reset_flag$1 (ite %init false $ignition$0)) (= $p1$1 (=> $launch_bt_val~0.launch_bt_out$1 $start_bt_val~0.start_bt_out$1)) (= $start_bt_val~0.start_bt$1 (ite %init false $start_bt_val~0.start_bt_out$0)) (= $start_bt_val~0.launch_bt$1 (ite %init false $launch_bt_val~0.launch_bt_out$0)) (= $start_bt_val~0.reset_flag$1 (ite %init false $reset_flag$0)) (= $start_bt_val~0.start_bt_out$1 (ite %init false (ite $start_bt_val~0.reset_flag$1 false (ite (and (and (not $start_bt_val~0.start_bt$0) (not $start_bt_val~0.launch_bt$0)) (= $sig$1 0)) true $start_bt_val~0.start_bt$0)))) (= $launch_bt_val~0.start_bt$1 (ite %init false $start_bt_val~0.start_bt_out$0)) (= $launch_bt_val~0.launch_bt$1 (ite %init false $launch_bt_val~0.launch_bt_out$0)) (= $launch_bt_val~0.reset_flag$1 (ite %init false $reset_flag$0)) (= $launch_bt_val~0.launch_bt_out$1 (ite %init false (ite $launch_bt_val~0.reset_flag$1 false (ite (and (and $launch_bt_val~0.start_bt$0 (not $launch_bt_val~0.launch_bt$0)) (= $sig$1 1)) true $launch_bt_val~0.launch_bt$0))))))
(declare-fun %init () Bool)
; Proposed 27 candidates
(declare-fun $sig$~1 () Int)
(declare-fun $ignition$~1 () Bool)
(declare-fun $reset_flag$~1 () Bool)
(declare-fun $p1$~1 () Bool)
(declare-fun $start_bt_val~0.start_bt$~1 () Bool)
(declare-fun $start_bt_val~0.launch_bt$~1 () Bool)
(declare-fun $start_bt_val~0.reset_flag$~1 () Bool)
(declare-fun $start_bt_val~0.start_bt_out$~1 () Bool)
(declare-fun $launch_bt_val~0.start_bt$~1 () Bool)
(declare-fun $launch_bt_val~0.launch_bt$~1 () Bool)
(declare-fun $launch_bt_val~0.reset_flag$~1 () Bool)
(declare-fun $launch_bt_val~0.launch_bt_out$~1 () Bool)
(assert (and (<= 0 $sig$~1) (<= $sig$~1 2)))
(declare-fun $sig$0 () Int)
(declare-fun $ignition$0 () Bool)
(declare-fun $reset_flag$0 () Bool)
(declare-fun $p1$0 () Bool)
(declare-fun $start_bt_val~0.start_bt$0 () Bool)
(declare-fun $start_bt_val~0.launch_bt$0 () Bool)
(declare-fun $start_bt_val~0.reset_flag$0 () Bool)
(declare-fun $start_bt_val~0.start_bt_out$0 () Bool)
(declare-fun $launch_bt_val~0.start_bt$0 () Bool)
(declare-fun $launch_bt_val~0.launch_bt$0 () Bool)
(declare-fun $launch_bt_val~0.reset_flag$0 () Bool)
(declare-fun $launch_bt_val~0.launch_bt_out$0 () Bool)
(assert (and (<= 0 $sig$0) (<= $sig$0 2)))
; K = 1
(push 1)
(assert (T true $sig$~1 $ignition$~1 $reset_flag$~1 $p1$~1 $start_bt_val~0.start_bt$~1 $start_bt_val~0.launch_bt$~1 $start_bt_val~0.reset_flag$~1 $start_bt_val~0.start_bt_out$~1 $launch_bt_val~0.start_bt$~1 $launch_bt_val~0.launch_bt$~1 $launch_bt_val~0.reset_flag$~1 $launch_bt_val~0.launch_bt_out$~1 $sig$0 $ignition$0 $reset_flag$0 $p1$0 $start_bt_val~0.start_bt$0 $start_bt_val~0.launch_bt$0 $start_bt_val~0.reset_flag$0 $start_bt_val~0.start_bt_out$0 $launch_bt_val~0.start_bt$0 $launch_bt_val~0.launch_bt$0 $launch_bt_val~0.reset_flag$0 $launch_bt_val~0.launch_bt_out$0))
(declare-fun act1 () Bool)
(assert (=> act1 (not (and false $start_bt_val~0.start_bt$0 (not $start_bt_val~0.start_bt$0) (= $sig$0 0) (= $sig$0 1) (= $sig$0 2) $p1$0 (not $p1$0) $reset_flag$0 (not $reset_flag$0) $launch_bt_val~0.reset_flag$0 (not $launch_bt_val~0.reset_flag$0) $start_bt_val~0.launch_bt$0 (not $start_bt_val~0.launch_bt$0) $start_bt_val~0.start_bt_out$0 (not $start_bt_val~0.start_bt_out$0) $launch_bt_val~0.launch_bt$0 (not $launch_bt_val~0.launch_bt$0) $launch_bt_val~0.launch_bt_out$0 (not $launch_bt_val~0.launch_bt_out$0) $start_bt_val~0.reset_flag$0 (not $start_bt_val~0.reset_flag$0) $launch_bt_val~0.start_bt$0 (not $launch_bt_val~0.start_bt$0) $ignition$0 (not $ignition$0)))))
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
; Z3:     true)
; Z3:   (define-fun $sig$0 () Int
; Z3:     0)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$~1 () Int
; Z3:     0)
; Z3:   (define-fun $ignition$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.start_bt$0 () Bool
; Z3:     false)
; Z3: )
; Z3: @DONE
; Finished single base step refinement
(declare-fun act2 () Bool)
(assert (=> act2 (not (and (not $start_bt_val~0.start_bt$0) (not (= $sig$0 1)) (not (= $sig$0 2)) $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $start_bt_val~0.start_bt_out$0) (not $launch_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt_out$0) (not $start_bt_val~0.reset_flag$0) (not $launch_bt_val~0.start_bt$0) (not $ignition$0) (not $start_bt_val~0.start_bt$0) (= $sig$0 0) $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $start_bt_val~0.start_bt_out$0) (not $launch_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt_out$0) (not $start_bt_val~0.reset_flag$0) (not $launch_bt_val~0.start_bt$0) (not $ignition$0) (=> false true)))))
(check-sat act2)
(echo "@DONE")
; Z3: sat
; Z3: @DONE
(get-model)
(echo "@DONE")
; Z3: (model 
; Z3:   (define-fun $sig$0 () Int
; Z3:     1)
; Z3:   (define-fun $p1$0 () Bool
; Z3:     true)
; Z3:   (define-fun act2 () Bool
; Z3:     true)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$~1 () Int
; Z3:     0)
; Z3:   (define-fun $ignition$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.start_bt$0 () Bool
; Z3:     false)
; Z3: )
; Z3: @DONE
; Finished single base step refinement
(declare-fun act3 () Bool)
(assert (=> act3 (not (and (not $start_bt_val~0.start_bt$0) (not (= $sig$0 2)) $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $start_bt_val~0.start_bt_out$0) (not $launch_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt_out$0) (not $start_bt_val~0.reset_flag$0) (not $launch_bt_val~0.start_bt$0) (not $ignition$0) (not $start_bt_val~0.start_bt$0) $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $start_bt_val~0.start_bt_out$0) (not $launch_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt_out$0) (not $start_bt_val~0.reset_flag$0) (not $launch_bt_val~0.start_bt$0) (not $ignition$0) (=> false (= $sig$0 1)) (=> (= $sig$0 0) true) (=> (= $sig$0 1) true) (=> false (= $sig$0 0))))))
(check-sat act3)
(echo "@DONE")
; Z3: sat
; Z3: @DONE
(get-model)
(echo "@DONE")
; Z3: (model 
; Z3:   (define-fun $sig$0 () Int
; Z3:     2)
; Z3:   (define-fun $p1$0 () Bool
; Z3:     true)
; Z3:   (define-fun act3 () Bool
; Z3:     true)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$~1 () Int
; Z3:     0)
; Z3:   (define-fun $ignition$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.start_bt$0 () Bool
; Z3:     false)
; Z3: )
; Z3: @DONE
; Finished single base step refinement
(declare-fun act4 () Bool)
(assert (=> act4 (not (and (not $start_bt_val~0.start_bt$0) $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $start_bt_val~0.start_bt_out$0) (not $launch_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt_out$0) (not $start_bt_val~0.reset_flag$0) (not $launch_bt_val~0.start_bt$0) (not $ignition$0) (not $start_bt_val~0.start_bt$0) $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $start_bt_val~0.start_bt_out$0) (not $launch_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt_out$0) (not $start_bt_val~0.reset_flag$0) (not $launch_bt_val~0.start_bt$0) (not $ignition$0) (=> false (= $sig$0 1)) (=> (= $sig$0 0) true) (=> false (= $sig$0 2)) (=> (= $sig$0 2) true) (=> (= $sig$0 1) true) (=> false (= $sig$0 0))))))
(check-sat act4)
(echo "@DONE")
; Z3: unsat
; Z3: @DONE
(pop 1)
(declare-fun $sig$1 () Int)
(declare-fun $ignition$1 () Bool)
(declare-fun $reset_flag$1 () Bool)
(declare-fun $p1$1 () Bool)
(declare-fun $start_bt_val~0.start_bt$1 () Bool)
(declare-fun $start_bt_val~0.launch_bt$1 () Bool)
(declare-fun $start_bt_val~0.reset_flag$1 () Bool)
(declare-fun $start_bt_val~0.start_bt_out$1 () Bool)
(declare-fun $launch_bt_val~0.start_bt$1 () Bool)
(declare-fun $launch_bt_val~0.launch_bt$1 () Bool)
(declare-fun $launch_bt_val~0.reset_flag$1 () Bool)
(declare-fun $launch_bt_val~0.launch_bt_out$1 () Bool)
(assert (and (<= 0 $sig$1) (<= $sig$1 2)))
(push 1)
(assert true)
(assert (T %init $sig$~1 $ignition$~1 $reset_flag$~1 $p1$~1 $start_bt_val~0.start_bt$~1 $start_bt_val~0.launch_bt$~1 $start_bt_val~0.reset_flag$~1 $start_bt_val~0.start_bt_out$~1 $launch_bt_val~0.start_bt$~1 $launch_bt_val~0.launch_bt$~1 $launch_bt_val~0.reset_flag$~1 $launch_bt_val~0.launch_bt_out$~1 $sig$0 $ignition$0 $reset_flag$0 $p1$0 $start_bt_val~0.start_bt$0 $start_bt_val~0.launch_bt$0 $start_bt_val~0.reset_flag$0 $start_bt_val~0.start_bt_out$0 $launch_bt_val~0.start_bt$0 $launch_bt_val~0.launch_bt$0 $launch_bt_val~0.reset_flag$0 $launch_bt_val~0.launch_bt_out$0))
(assert true)
(assert (T false $sig$0 $ignition$0 $reset_flag$0 $p1$0 $start_bt_val~0.start_bt$0 $start_bt_val~0.launch_bt$0 $start_bt_val~0.reset_flag$0 $start_bt_val~0.start_bt_out$0 $launch_bt_val~0.start_bt$0 $launch_bt_val~0.launch_bt$0 $launch_bt_val~0.reset_flag$0 $launch_bt_val~0.launch_bt_out$0 $sig$1 $ignition$1 $reset_flag$1 $p1$1 $start_bt_val~0.start_bt$1 $start_bt_val~0.launch_bt$1 $start_bt_val~0.reset_flag$1 $start_bt_val~0.start_bt_out$1 $launch_bt_val~0.start_bt$1 $launch_bt_val~0.launch_bt$1 $launch_bt_val~0.reset_flag$1 $launch_bt_val~0.launch_bt_out$1))
(declare-fun act5 () Bool)
(assert (=> act5 (not (=> (and (not $start_bt_val~0.start_bt$0) $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $start_bt_val~0.start_bt_out$0) (not $launch_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt_out$0) (not $start_bt_val~0.reset_flag$0) (not $launch_bt_val~0.start_bt$0) (not $ignition$0) (not $start_bt_val~0.start_bt$0) $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $start_bt_val~0.start_bt_out$0) (not $launch_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt_out$0) (not $start_bt_val~0.reset_flag$0) (not $launch_bt_val~0.start_bt$0) (not $ignition$0) (=> (= $sig$0 0) true) (=> false (= $sig$0 0)) (=> (= $sig$0 1) true) (=> false (= $sig$0 2)) (=> (= $sig$0 2) true) (=> false (= $sig$0 1))) (and (not $start_bt_val~0.start_bt$1) $p1$1 (not $reset_flag$1) (not $launch_bt_val~0.reset_flag$1) (not $start_bt_val~0.launch_bt$1) (not $start_bt_val~0.start_bt_out$1) (not $launch_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt_out$1) (not $start_bt_val~0.reset_flag$1) (not $launch_bt_val~0.start_bt$1) (not $ignition$1) (not $start_bt_val~0.start_bt$1) $p1$1 (not $reset_flag$1) (not $launch_bt_val~0.reset_flag$1) (not $start_bt_val~0.launch_bt$1) (not $start_bt_val~0.start_bt_out$1) (not $launch_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt_out$1) (not $start_bt_val~0.reset_flag$1) (not $launch_bt_val~0.start_bt$1) (not $ignition$1) (=> (= $sig$1 0) true) (=> false (= $sig$1 0)) (=> (= $sig$1 1) true) (=> false (= $sig$1 2)) (=> (= $sig$1 2) true) (=> false (= $sig$1 1)))))))
(check-sat act5)
(echo "@DONE")
; Z3: sat
; Z3: @DONE
(get-model)
(echo "@DONE")
; Z3: (model 
; Z3:   (define-fun $sig$~1 () Int
; Z3:     0)
; Z3:   (define-fun $ignition$1 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$1 () Bool
; Z3:     false)
; Z3:   (define-fun act5 () Bool
; Z3:     true)
; Z3:   (define-fun $sig$1 () Int
; Z3:     0)
; Z3:   (define-fun $ignition$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $p1$1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.launch_bt$1 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $ignition$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.start_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$1 () Bool
; Z3:     false)
; Z3:   (define-fun $p1$0 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$1 () Bool
; Z3:     true)
; Z3:   (define-fun $launch_bt_val~0.start_bt$1 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$0 () Int
; Z3:     0)
; Z3:   (define-fun $start_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.launch_bt$~1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt$1 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.reset_flag$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$1 () Bool
; Z3:     false)
; Z3: )
; Z3: @DONE
; Finished single inductive step refinement
(declare-fun act6 () Bool)
(assert (=> act6 (not (=> (and (not $start_bt_val~0.start_bt$0) $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt_out$0) (not $start_bt_val~0.reset_flag$0) (not $launch_bt_val~0.start_bt$0) (not $ignition$0) (not $start_bt_val~0.start_bt$0) $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt_out$0) (not $start_bt_val~0.reset_flag$0) (not $launch_bt_val~0.start_bt$0) (not $ignition$0) (=> false $start_bt_val~0.start_bt_out$0) (=> false (= $sig$0 2)) (=> $start_bt_val~0.start_bt_out$0 true) (=> false (not $start_bt_val~0.start_bt_out$0)) (=> (= $sig$0 1) (not $start_bt_val~0.start_bt_out$0)) (=> (not $start_bt_val~0.start_bt_out$0) true) (=> (= $sig$0 2) (not $start_bt_val~0.start_bt_out$0)) (=> false (= $sig$0 1)) (=> $start_bt_val~0.start_bt_out$0 (= $sig$0 0)) (=> (= $sig$0 0) true)) (and (not $start_bt_val~0.start_bt$1) $p1$1 (not $reset_flag$1) (not $launch_bt_val~0.reset_flag$1) (not $start_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt_out$1) (not $start_bt_val~0.reset_flag$1) (not $launch_bt_val~0.start_bt$1) (not $ignition$1) (not $start_bt_val~0.start_bt$1) $p1$1 (not $reset_flag$1) (not $launch_bt_val~0.reset_flag$1) (not $start_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt_out$1) (not $start_bt_val~0.reset_flag$1) (not $launch_bt_val~0.start_bt$1) (not $ignition$1) (=> false $start_bt_val~0.start_bt_out$1) (=> false (= $sig$1 2)) (=> $start_bt_val~0.start_bt_out$1 true) (=> false (not $start_bt_val~0.start_bt_out$1)) (=> (= $sig$1 1) (not $start_bt_val~0.start_bt_out$1)) (=> (not $start_bt_val~0.start_bt_out$1) true) (=> (= $sig$1 2) (not $start_bt_val~0.start_bt_out$1)) (=> false (= $sig$1 1)) (=> $start_bt_val~0.start_bt_out$1 (= $sig$1 0)) (=> (= $sig$1 0) true))))))
(check-sat act6)
(echo "@DONE")
; Z3: sat
; Z3: @DONE
(get-model)
(echo "@DONE")
; Z3: (model 
; Z3:   (define-fun $ignition$1 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$1 () Bool
; Z3:     false)
; Z3:   (define-fun act5 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$1 () Int
; Z3:     1)
; Z3:   (define-fun $ignition$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $p1$1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt$~1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.launch_bt$1 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $ignition$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.start_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$1 () Bool
; Z3:     false)
; Z3:   (define-fun $p1$0 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.start_bt$1 () Bool
; Z3:     true)
; Z3:   (define-fun %init () Bool
; Z3:     false)
; Z3:   (define-fun $sig$0 () Int
; Z3:     0)
; Z3:   (define-fun $start_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$0 () Bool
; Z3:     true)
; Z3:   (define-fun act6 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$~1 () Int
; Z3:     0)
; Z3:   (define-fun $start_bt_val~0.start_bt$1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.reset_flag$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$1 () Bool
; Z3:     false)
; Z3: )
; Z3: @DONE
; Finished single inductive step refinement
(declare-fun act7 () Bool)
(assert (=> act7 (not (=> (and $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt_out$0) (not $start_bt_val~0.reset_flag$0) (not $ignition$0) (= $start_bt_val~0.start_bt$0 $launch_bt_val~0.start_bt$0) (= (not $start_bt_val~0.start_bt$0) (not $launch_bt_val~0.start_bt$0)) $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt_out$0) (not $start_bt_val~0.reset_flag$0) (not $ignition$0) (=> (= $sig$0 1) (not $start_bt_val~0.start_bt_out$0)) (=> false (not $start_bt_val~0.start_bt$0)) (=> false $start_bt_val~0.start_bt_out$0) (=> $start_bt_val~0.start_bt$0 true) (=> $start_bt_val~0.start_bt_out$0 (not $start_bt_val~0.start_bt$0)) (=> false (= $sig$0 2)) (=> (= $sig$0 0) (not $start_bt_val~0.start_bt$0)) (=> $start_bt_val~0.start_bt$0 (not $start_bt_val~0.start_bt_out$0)) (=> (not $start_bt_val~0.start_bt$0) true) (=> (not $start_bt_val~0.start_bt_out$0) true) (=> $start_bt_val~0.start_bt$0 (= $sig$0 1)) (=> (= $sig$0 2) (not $start_bt_val~0.start_bt$0)) (=> $start_bt_val~0.start_bt_out$0 (= $sig$0 0)) (=> false $start_bt_val~0.start_bt$0) (=> (= $sig$0 2) (not $start_bt_val~0.start_bt_out$0))) (and $p1$1 (not $reset_flag$1) (not $launch_bt_val~0.reset_flag$1) (not $start_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt_out$1) (not $start_bt_val~0.reset_flag$1) (not $ignition$1) (= $start_bt_val~0.start_bt$1 $launch_bt_val~0.start_bt$1) (= (not $start_bt_val~0.start_bt$1) (not $launch_bt_val~0.start_bt$1)) $p1$1 (not $reset_flag$1) (not $launch_bt_val~0.reset_flag$1) (not $start_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt_out$1) (not $start_bt_val~0.reset_flag$1) (not $ignition$1) (=> (= $sig$1 1) (not $start_bt_val~0.start_bt_out$1)) (=> false (not $start_bt_val~0.start_bt$1)) (=> false $start_bt_val~0.start_bt_out$1) (=> $start_bt_val~0.start_bt$1 true) (=> $start_bt_val~0.start_bt_out$1 (not $start_bt_val~0.start_bt$1)) (=> false (= $sig$1 2)) (=> (= $sig$1 0) (not $start_bt_val~0.start_bt$1)) (=> $start_bt_val~0.start_bt$1 (not $start_bt_val~0.start_bt_out$1)) (=> (not $start_bt_val~0.start_bt$1) true) (=> (not $start_bt_val~0.start_bt_out$1) true) (=> $start_bt_val~0.start_bt$1 (= $sig$1 1)) (=> (= $sig$1 2) (not $start_bt_val~0.start_bt$1)) (=> $start_bt_val~0.start_bt_out$1 (= $sig$1 0)) (=> false $start_bt_val~0.start_bt$1) (=> (= $sig$1 2) (not $start_bt_val~0.start_bt_out$1)))))))
(check-sat act7)
(echo "@DONE")
; Z3: sat
; Z3: @DONE
(get-model)
(echo "@DONE")
; Z3: (model 
; Z3:   (define-fun $ignition$1 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$1 () Bool
; Z3:     false)
; Z3:   (define-fun act5 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$1 () Int
; Z3:     2)
; Z3:   (define-fun $ignition$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $p1$1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt$~1 () Bool
; Z3:     true)
; Z3:   (define-fun act7 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.launch_bt$1 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $ignition$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.start_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$1 () Bool
; Z3:     false)
; Z3:   (define-fun $p1$0 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.start_bt$1 () Bool
; Z3:     true)
; Z3:   (define-fun %init () Bool
; Z3:     false)
; Z3:   (define-fun $sig$0 () Int
; Z3:     0)
; Z3:   (define-fun $start_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$0 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$~1 () Int
; Z3:     0)
; Z3:   (define-fun $start_bt_val~0.start_bt$1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.reset_flag$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$1 () Bool
; Z3:     false)
; Z3: )
; Z3: @DONE
; Finished single inductive step refinement
(declare-fun act8 () Bool)
(assert (=> act8 (not (=> (and $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt_out$0) (not $start_bt_val~0.reset_flag$0) (not $ignition$0) (= $start_bt_val~0.start_bt$0 $launch_bt_val~0.start_bt$0) (= (not $start_bt_val~0.start_bt$0) (not $launch_bt_val~0.start_bt$0)) $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt_out$0) (not $start_bt_val~0.reset_flag$0) (not $ignition$0) (=> false (not $start_bt_val~0.start_bt$0)) (=> false $start_bt_val~0.start_bt_out$0) (=> $start_bt_val~0.start_bt$0 true) (=> false (= $sig$0 2)) (=> (not $start_bt_val~0.start_bt_out$0) true) (=> false $start_bt_val~0.start_bt$0) (=> $start_bt_val~0.start_bt$0 (not $start_bt_val~0.start_bt_out$0)) (=> $start_bt_val~0.start_bt_out$0 (= $sig$0 0)) (=> (not $start_bt_val~0.start_bt$0) true) (=> false (= $sig$0 1)) (=> $start_bt_val~0.start_bt_out$0 (not $start_bt_val~0.start_bt$0)) (=> (= $sig$0 2) (not $start_bt_val~0.start_bt_out$0)) (=> (= $sig$0 1) (not $start_bt_val~0.start_bt_out$0)) (=> (= $sig$0 0) (not $start_bt_val~0.start_bt$0)) (=> (= $sig$0 2) true)) (and $p1$1 (not $reset_flag$1) (not $launch_bt_val~0.reset_flag$1) (not $start_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt_out$1) (not $start_bt_val~0.reset_flag$1) (not $ignition$1) (= $start_bt_val~0.start_bt$1 $launch_bt_val~0.start_bt$1) (= (not $start_bt_val~0.start_bt$1) (not $launch_bt_val~0.start_bt$1)) $p1$1 (not $reset_flag$1) (not $launch_bt_val~0.reset_flag$1) (not $start_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt_out$1) (not $start_bt_val~0.reset_flag$1) (not $ignition$1) (=> false (not $start_bt_val~0.start_bt$1)) (=> false $start_bt_val~0.start_bt_out$1) (=> $start_bt_val~0.start_bt$1 true) (=> false (= $sig$1 2)) (=> (not $start_bt_val~0.start_bt_out$1) true) (=> false $start_bt_val~0.start_bt$1) (=> $start_bt_val~0.start_bt$1 (not $start_bt_val~0.start_bt_out$1)) (=> $start_bt_val~0.start_bt_out$1 (= $sig$1 0)) (=> (not $start_bt_val~0.start_bt$1) true) (=> false (= $sig$1 1)) (=> $start_bt_val~0.start_bt_out$1 (not $start_bt_val~0.start_bt$1)) (=> (= $sig$1 2) (not $start_bt_val~0.start_bt_out$1)) (=> (= $sig$1 1) (not $start_bt_val~0.start_bt_out$1)) (=> (= $sig$1 0) (not $start_bt_val~0.start_bt$1)) (=> (= $sig$1 2) true))))))
(check-sat act8)
(echo "@DONE")
; Z3: sat
; Z3: @DONE
(get-model)
(echo "@DONE")
; Z3: (model 
; Z3:   (define-fun $ignition$1 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$1 () Bool
; Z3:     false)
; Z3:   (define-fun act5 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$1 () Int
; Z3:     0)
; Z3:   (define-fun $ignition$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $p1$1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt$~1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.launch_bt$1 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $ignition$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.start_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$1 () Bool
; Z3:     false)
; Z3:   (define-fun $p1$0 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$1 () Bool
; Z3:     true)
; Z3:   (define-fun $launch_bt_val~0.start_bt$1 () Bool
; Z3:     true)
; Z3:   (define-fun %init () Bool
; Z3:     false)
; Z3:   (define-fun $sig$0 () Int
; Z3:     0)
; Z3:   (define-fun $start_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$0 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun act8 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$~1 () Int
; Z3:     0)
; Z3:   (define-fun $start_bt_val~0.start_bt$1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.reset_flag$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$1 () Bool
; Z3:     false)
; Z3: )
; Z3: @DONE
; Finished single inductive step refinement
(declare-fun act9 () Bool)
(assert (=> act9 (not (=> (and $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt_out$0) (not $start_bt_val~0.reset_flag$0) (not $ignition$0) (= $start_bt_val~0.start_bt$0 $launch_bt_val~0.start_bt$0) (= (not $start_bt_val~0.start_bt$0) (not $launch_bt_val~0.start_bt$0)) $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt_out$0) (not $start_bt_val~0.reset_flag$0) (not $ignition$0) (=> false (= $sig$0 1)) (=> (not $start_bt_val~0.start_bt_out$0) true) (=> (not $start_bt_val~0.start_bt$0) true) (=> false (not $start_bt_val~0.start_bt_out$0)) (=> $start_bt_val~0.start_bt_out$0 (= $sig$0 0)) (=> (= $sig$0 2) true) (=> false (= $sig$0 2)) (=> false $start_bt_val~0.start_bt$0) (=> false $start_bt_val~0.start_bt_out$0) (=> $start_bt_val~0.start_bt_out$0 true) (=> false (not $start_bt_val~0.start_bt$0)) (=> (= $sig$0 2) (not $start_bt_val~0.start_bt_out$0)) (=> $start_bt_val~0.start_bt$0 true) (=> (= $sig$0 1) (not $start_bt_val~0.start_bt_out$0)) (=> (= $sig$0 0) true)) (and $p1$1 (not $reset_flag$1) (not $launch_bt_val~0.reset_flag$1) (not $start_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt_out$1) (not $start_bt_val~0.reset_flag$1) (not $ignition$1) (= $start_bt_val~0.start_bt$1 $launch_bt_val~0.start_bt$1) (= (not $start_bt_val~0.start_bt$1) (not $launch_bt_val~0.start_bt$1)) $p1$1 (not $reset_flag$1) (not $launch_bt_val~0.reset_flag$1) (not $start_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt_out$1) (not $start_bt_val~0.reset_flag$1) (not $ignition$1) (=> false (= $sig$1 1)) (=> (not $start_bt_val~0.start_bt_out$1) true) (=> (not $start_bt_val~0.start_bt$1) true) (=> false (not $start_bt_val~0.start_bt_out$1)) (=> $start_bt_val~0.start_bt_out$1 (= $sig$1 0)) (=> (= $sig$1 2) true) (=> false (= $sig$1 2)) (=> false $start_bt_val~0.start_bt$1) (=> false $start_bt_val~0.start_bt_out$1) (=> $start_bt_val~0.start_bt_out$1 true) (=> false (not $start_bt_val~0.start_bt$1)) (=> (= $sig$1 2) (not $start_bt_val~0.start_bt_out$1)) (=> $start_bt_val~0.start_bt$1 true) (=> (= $sig$1 1) (not $start_bt_val~0.start_bt_out$1)) (=> (= $sig$1 0) true))))))
(check-sat act9)
(echo "@DONE")
; Z3: sat
; Z3: @DONE
(get-model)
(echo "@DONE")
; Z3: (model 
; Z3:   (define-fun $ignition$1 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$1 () Bool
; Z3:     false)
; Z3:   (define-fun act5 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$1 () Int
; Z3:     2)
; Z3:   (define-fun $ignition$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $p1$1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt$~1 () Bool
; Z3:     true)
; Z3:   (define-fun act7 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.launch_bt$1 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $ignition$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.start_bt$0 () Bool
; Z3:     true)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$1 () Bool
; Z3:     false)
; Z3:   (define-fun $p1$0 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$1 () Bool
; Z3:     true)
; Z3:   (define-fun $launch_bt_val~0.start_bt$1 () Bool
; Z3:     true)
; Z3:   (define-fun %init () Bool
; Z3:     false)
; Z3:   (define-fun $sig$0 () Int
; Z3:     0)
; Z3:   (define-fun $start_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$0 () Bool
; Z3:     true)
; Z3:   (define-fun act9 () Bool
; Z3:     true)
; Z3:   (define-fun act6 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$~1 () Bool
; Z3:     true)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun act8 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt$0 () Bool
; Z3:     true)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$~1 () Int
; Z3:     0)
; Z3:   (define-fun $start_bt_val~0.start_bt$1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.reset_flag$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$1 () Bool
; Z3:     false)
; Z3: )
; Z3: @DONE
; Finished single inductive step refinement
(declare-fun act10 () Bool)
(assert (=> act10 (not (=> (and $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt_out$0) (not $start_bt_val~0.reset_flag$0) (not $ignition$0) (= $start_bt_val~0.start_bt$0 $launch_bt_val~0.start_bt$0) (= (not $start_bt_val~0.start_bt$0) (not $launch_bt_val~0.start_bt$0)) $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt_out$0) (not $start_bt_val~0.reset_flag$0) (not $ignition$0) (=> $start_bt_val~0.start_bt_out$0 true) (=> false (= $sig$0 0)) (=> (= $sig$0 0) true) (=> false (not $start_bt_val~0.start_bt_out$0)) (=> false $start_bt_val~0.start_bt$0) (=> (= $sig$0 2) true) (=> (= $sig$0 1) (not $start_bt_val~0.start_bt_out$0)) (=> false (not $start_bt_val~0.start_bt$0)) (=> (not $start_bt_val~0.start_bt$0) true) (=> $start_bt_val~0.start_bt$0 true) (=> false (= $sig$0 1)) (=> (not $start_bt_val~0.start_bt_out$0) true) (=> false (= $sig$0 2)) (=> false $start_bt_val~0.start_bt_out$0)) (and $p1$1 (not $reset_flag$1) (not $launch_bt_val~0.reset_flag$1) (not $start_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt_out$1) (not $start_bt_val~0.reset_flag$1) (not $ignition$1) (= $start_bt_val~0.start_bt$1 $launch_bt_val~0.start_bt$1) (= (not $start_bt_val~0.start_bt$1) (not $launch_bt_val~0.start_bt$1)) $p1$1 (not $reset_flag$1) (not $launch_bt_val~0.reset_flag$1) (not $start_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt_out$1) (not $start_bt_val~0.reset_flag$1) (not $ignition$1) (=> $start_bt_val~0.start_bt_out$1 true) (=> false (= $sig$1 0)) (=> (= $sig$1 0) true) (=> false (not $start_bt_val~0.start_bt_out$1)) (=> false $start_bt_val~0.start_bt$1) (=> (= $sig$1 2) true) (=> (= $sig$1 1) (not $start_bt_val~0.start_bt_out$1)) (=> false (not $start_bt_val~0.start_bt$1)) (=> (not $start_bt_val~0.start_bt$1) true) (=> $start_bt_val~0.start_bt$1 true) (=> false (= $sig$1 1)) (=> (not $start_bt_val~0.start_bt_out$1) true) (=> false (= $sig$1 2)) (=> false $start_bt_val~0.start_bt_out$1))))))
(check-sat act10)
(echo "@DONE")
; Z3: sat
; Z3: @DONE
(get-model)
(echo "@DONE")
; Z3: (model 
; Z3:   (define-fun act10 () Bool
; Z3:     true)
; Z3:   (define-fun $ignition$1 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$1 () Bool
; Z3:     true)
; Z3:   (define-fun act5 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$1 () Int
; Z3:     1)
; Z3:   (define-fun $ignition$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $p1$1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt$~1 () Bool
; Z3:     true)
; Z3:   (define-fun act7 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.launch_bt$1 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $ignition$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.start_bt$0 () Bool
; Z3:     true)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$1 () Bool
; Z3:     false)
; Z3:   (define-fun $p1$0 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$1 () Bool
; Z3:     true)
; Z3:   (define-fun $launch_bt_val~0.start_bt$1 () Bool
; Z3:     true)
; Z3:   (define-fun %init () Bool
; Z3:     false)
; Z3:   (define-fun $sig$0 () Int
; Z3:     0)
; Z3:   (define-fun $start_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$0 () Bool
; Z3:     true)
; Z3:   (define-fun act6 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$~1 () Bool
; Z3:     true)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun act8 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt$0 () Bool
; Z3:     true)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$~1 () Int
; Z3:     0)
; Z3:   (define-fun $start_bt_val~0.start_bt$1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.reset_flag$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$1 () Bool
; Z3:     false)
; Z3: )
; Z3: @DONE
; Finished single inductive step refinement
(declare-fun act11 () Bool)
(assert (=> act11 (not (=> (and $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt$0) (not $start_bt_val~0.reset_flag$0) (not $ignition$0) (= $start_bt_val~0.start_bt$0 $launch_bt_val~0.start_bt$0) (= (not $start_bt_val~0.start_bt$0) (not $launch_bt_val~0.start_bt$0)) $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt$0) (not $start_bt_val~0.reset_flag$0) (not $ignition$0) (=> false (not $launch_bt_val~0.launch_bt_out$0)) (=> (= $sig$0 2) (not $launch_bt_val~0.launch_bt_out$0)) (=> (= $sig$0 0) (not $launch_bt_val~0.launch_bt_out$0)) (=> false $launch_bt_val~0.launch_bt_out$0) (=> $launch_bt_val~0.launch_bt_out$0 $start_bt_val~0.start_bt$0) (=> $launch_bt_val~0.launch_bt_out$0 (= $sig$0 1)) (=> false (not $start_bt_val~0.start_bt$0)) (=> $launch_bt_val~0.launch_bt_out$0 true) (=> false (= $sig$0 2)) (=> false (= $sig$0 0)) (=> $start_bt_val~0.start_bt_out$0 true) (=> (not $start_bt_val~0.start_bt_out$0) (not $launch_bt_val~0.launch_bt_out$0)) (=> (not $launch_bt_val~0.launch_bt_out$0) true) (=> $start_bt_val~0.start_bt$0 true) (=> $launch_bt_val~0.launch_bt_out$0 $start_bt_val~0.start_bt_out$0) (=> (not $start_bt_val~0.start_bt$0) (not $launch_bt_val~0.launch_bt_out$0)) (=> false (not $start_bt_val~0.start_bt_out$0)) (=> (= $sig$0 1) true)) (and $p1$1 (not $reset_flag$1) (not $launch_bt_val~0.reset_flag$1) (not $start_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt$1) (not $start_bt_val~0.reset_flag$1) (not $ignition$1) (= $start_bt_val~0.start_bt$1 $launch_bt_val~0.start_bt$1) (= (not $start_bt_val~0.start_bt$1) (not $launch_bt_val~0.start_bt$1)) $p1$1 (not $reset_flag$1) (not $launch_bt_val~0.reset_flag$1) (not $start_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt$1) (not $start_bt_val~0.reset_flag$1) (not $ignition$1) (=> false (not $launch_bt_val~0.launch_bt_out$1)) (=> (= $sig$1 2) (not $launch_bt_val~0.launch_bt_out$1)) (=> (= $sig$1 0) (not $launch_bt_val~0.launch_bt_out$1)) (=> false $launch_bt_val~0.launch_bt_out$1) (=> $launch_bt_val~0.launch_bt_out$1 $start_bt_val~0.start_bt$1) (=> $launch_bt_val~0.launch_bt_out$1 (= $sig$1 1)) (=> false (not $start_bt_val~0.start_bt$1)) (=> $launch_bt_val~0.launch_bt_out$1 true) (=> false (= $sig$1 2)) (=> false (= $sig$1 0)) (=> $start_bt_val~0.start_bt_out$1 true) (=> (not $start_bt_val~0.start_bt_out$1) (not $launch_bt_val~0.launch_bt_out$1)) (=> (not $launch_bt_val~0.launch_bt_out$1) true) (=> $start_bt_val~0.start_bt$1 true) (=> $launch_bt_val~0.launch_bt_out$1 $start_bt_val~0.start_bt_out$1) (=> (not $start_bt_val~0.start_bt$1) (not $launch_bt_val~0.launch_bt_out$1)) (=> false (not $start_bt_val~0.start_bt_out$1)) (=> (= $sig$1 1) true))))))
(check-sat act11)
(echo "@DONE")
; Z3: sat
; Z3: @DONE
(get-model)
(echo "@DONE")
; Z3: (model 
; Z3:   (define-fun $sig$~1 () Int
; Z3:     0)
; Z3:   (define-fun $ignition$1 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$1 () Bool
; Z3:     true)
; Z3:   (define-fun act5 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$1 () Int
; Z3:     1)
; Z3:   (define-fun $ignition$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $p1$1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt$~1 () Bool
; Z3:     false)
; Z3:   (define-fun act7 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.launch_bt$1 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $ignition$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.start_bt$0 () Bool
; Z3:     true)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$1 () Bool
; Z3:     false)
; Z3:   (define-fun $p1$0 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$1 () Bool
; Z3:     true)
; Z3:   (define-fun $launch_bt_val~0.start_bt$1 () Bool
; Z3:     false)
; Z3:   (define-fun %init () Bool
; Z3:     false)
; Z3:   (define-fun $sig$0 () Int
; Z3:     0)
; Z3:   (define-fun $start_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$0 () Bool
; Z3:     false)
; Z3:   (define-fun act6 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$~1 () Bool
; Z3:     true)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$0 () Bool
; Z3:     false)
; Z3:   (define-fun act11 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun act8 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt$0 () Bool
; Z3:     true)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.launch_bt$~1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt$1 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.reset_flag$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$1 () Bool
; Z3:     false)
; Z3: )
; Z3: @DONE
; Finished single inductive step refinement
(declare-fun act12 () Bool)
(assert (=> act12 (not (=> (and $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt$0) (not $start_bt_val~0.reset_flag$0) (not $ignition$0) (= $start_bt_val~0.start_bt$0 $launch_bt_val~0.start_bt$0) (= (not $start_bt_val~0.start_bt$0) (not $launch_bt_val~0.start_bt$0)) $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt$0) (not $start_bt_val~0.reset_flag$0) (not $ignition$0) (=> (not $launch_bt_val~0.launch_bt_out$0) true) (=> $launch_bt_val~0.launch_bt_out$0 $start_bt_val~0.start_bt_out$0) (=> (not $start_bt_val~0.start_bt$0) true) (=> false (not $start_bt_val~0.start_bt$0)) (=> false $start_bt_val~0.start_bt$0) (=> false (not $launch_bt_val~0.launch_bt_out$0)) (=> (= $sig$0 0) (not $launch_bt_val~0.launch_bt_out$0)) (=> false $launch_bt_val~0.launch_bt_out$0) (=> $launch_bt_val~0.launch_bt_out$0 true) (=> false (= $sig$0 0)) (=> (= $sig$0 1) true) (=> (not $start_bt_val~0.start_bt_out$0) (not $launch_bt_val~0.launch_bt_out$0)) (=> $start_bt_val~0.start_bt$0 true) (=> false (= $sig$0 2)) (=> $start_bt_val~0.start_bt_out$0 true) (=> $launch_bt_val~0.launch_bt_out$0 (= $sig$0 1)) (=> (= $sig$0 2) (not $launch_bt_val~0.launch_bt_out$0)) (=> false (not $start_bt_val~0.start_bt_out$0))) (and $p1$1 (not $reset_flag$1) (not $launch_bt_val~0.reset_flag$1) (not $start_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt$1) (not $start_bt_val~0.reset_flag$1) (not $ignition$1) (= $start_bt_val~0.start_bt$1 $launch_bt_val~0.start_bt$1) (= (not $start_bt_val~0.start_bt$1) (not $launch_bt_val~0.start_bt$1)) $p1$1 (not $reset_flag$1) (not $launch_bt_val~0.reset_flag$1) (not $start_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt$1) (not $start_bt_val~0.reset_flag$1) (not $ignition$1) (=> (not $launch_bt_val~0.launch_bt_out$1) true) (=> $launch_bt_val~0.launch_bt_out$1 $start_bt_val~0.start_bt_out$1) (=> (not $start_bt_val~0.start_bt$1) true) (=> false (not $start_bt_val~0.start_bt$1)) (=> false $start_bt_val~0.start_bt$1) (=> false (not $launch_bt_val~0.launch_bt_out$1)) (=> (= $sig$1 0) (not $launch_bt_val~0.launch_bt_out$1)) (=> false $launch_bt_val~0.launch_bt_out$1) (=> $launch_bt_val~0.launch_bt_out$1 true) (=> false (= $sig$1 0)) (=> (= $sig$1 1) true) (=> (not $start_bt_val~0.start_bt_out$1) (not $launch_bt_val~0.launch_bt_out$1)) (=> $start_bt_val~0.start_bt$1 true) (=> false (= $sig$1 2)) (=> $start_bt_val~0.start_bt_out$1 true) (=> $launch_bt_val~0.launch_bt_out$1 (= $sig$1 1)) (=> (= $sig$1 2) (not $launch_bt_val~0.launch_bt_out$1)) (=> false (not $start_bt_val~0.start_bt_out$1)))))))
(check-sat act12)
(echo "@DONE")
; Z3: sat
; Z3: @DONE
(get-model)
(echo "@DONE")
; Z3: (model 
; Z3:   (define-fun act10 () Bool
; Z3:     false)
; Z3:   (define-fun act12 () Bool
; Z3:     true)
; Z3:   (define-fun $ignition$1 () Bool
; Z3:     true)
; Z3:   (define-fun $reset_flag$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$1 () Bool
; Z3:     false)
; Z3:   (define-fun act5 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$1 () Int
; Z3:     2)
; Z3:   (define-fun $ignition$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $p1$1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt$~1 () Bool
; Z3:     true)
; Z3:   (define-fun act7 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.launch_bt$1 () Bool
; Z3:     true)
; Z3:   (define-fun $reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$~1 () Bool
; Z3:     true)
; Z3:   (define-fun $ignition$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.start_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$1 () Bool
; Z3:     true)
; Z3:   (define-fun $p1$0 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.start_bt$1 () Bool
; Z3:     true)
; Z3:   (define-fun %init () Bool
; Z3:     false)
; Z3:   (define-fun $sig$0 () Int
; Z3:     1)
; Z3:   (define-fun $start_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$0 () Bool
; Z3:     true)
; Z3:   (define-fun act9 () Bool
; Z3:     false)
; Z3:   (define-fun act6 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$0 () Bool
; Z3:     true)
; Z3:   (define-fun act11 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun act8 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$~1 () Int
; Z3:     0)
; Z3:   (define-fun $start_bt_val~0.start_bt$1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.reset_flag$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$1 () Bool
; Z3:     false)
; Z3: )
; Z3: @DONE
; Finished single inductive step refinement
(declare-fun act13 () Bool)
(assert (=> act13 (not (=> (and $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.reset_flag$0) (= $start_bt_val~0.launch_bt$0 $launch_bt_val~0.launch_bt$0) (= $start_bt_val~0.launch_bt$0 $ignition$0) (= $start_bt_val~0.start_bt$0 $launch_bt_val~0.start_bt$0) (= (not $start_bt_val~0.start_bt$0) (not $launch_bt_val~0.start_bt$0)) (= (not $start_bt_val~0.launch_bt$0) (not $launch_bt_val~0.launch_bt$0)) (= (not $start_bt_val~0.launch_bt$0) (not $ignition$0)) $p1$0 (not $reset_flag$0) (not $launch_bt_val~0.reset_flag$0) (not $start_bt_val~0.reset_flag$0) (=> $start_bt_val~0.launch_bt$0 true) (=> $launch_bt_val~0.launch_bt_out$0 (= $sig$0 1)) (=> (= $sig$0 2) (not $launch_bt_val~0.launch_bt_out$0)) (=> $start_bt_val~0.start_bt_out$0 (not $start_bt_val~0.launch_bt$0)) (=> $start_bt_val~0.launch_bt$0 (= $sig$0 2)) (=> $start_bt_val~0.launch_bt$0 (not $launch_bt_val~0.launch_bt_out$0)) (=> (= $sig$0 0) (not $launch_bt_val~0.launch_bt_out$0)) (=> $start_bt_val~0.start_bt$0 true) (=> false (= $sig$0 0)) (=> (not $start_bt_val~0.start_bt$0) (not $start_bt_val~0.launch_bt$0)) (=> (not $start_bt_val~0.start_bt_out$0) (not $launch_bt_val~0.launch_bt_out$0)) (=> false (not $start_bt_val~0.launch_bt$0)) (=> (= $sig$0 0) (not $start_bt_val~0.launch_bt$0)) (=> false $launch_bt_val~0.launch_bt_out$0) (=> $launch_bt_val~0.launch_bt_out$0 (not $start_bt_val~0.launch_bt$0)) (=> $launch_bt_val~0.launch_bt_out$0 $start_bt_val~0.start_bt_out$0) (=> $start_bt_val~0.launch_bt$0 $start_bt_val~0.start_bt$0) (=> (= $sig$0 1) (not $start_bt_val~0.launch_bt$0)) (=> (not $launch_bt_val~0.launch_bt_out$0) true) (=> false (not $start_bt_val~0.start_bt$0)) (=> (not $start_bt_val~0.launch_bt$0) true) (=> false $start_bt_val~0.launch_bt$0) (=> $start_bt_val~0.launch_bt$0 (not $start_bt_val~0.start_bt_out$0))) (and $p1$1 (not $reset_flag$1) (not $launch_bt_val~0.reset_flag$1) (not $start_bt_val~0.reset_flag$1) (= $start_bt_val~0.launch_bt$1 $launch_bt_val~0.launch_bt$1) (= $start_bt_val~0.launch_bt$1 $ignition$1) (= $start_bt_val~0.start_bt$1 $launch_bt_val~0.start_bt$1) (= (not $start_bt_val~0.start_bt$1) (not $launch_bt_val~0.start_bt$1)) (= (not $start_bt_val~0.launch_bt$1) (not $launch_bt_val~0.launch_bt$1)) (= (not $start_bt_val~0.launch_bt$1) (not $ignition$1)) $p1$1 (not $reset_flag$1) (not $launch_bt_val~0.reset_flag$1) (not $start_bt_val~0.reset_flag$1) (=> $start_bt_val~0.launch_bt$1 true) (=> $launch_bt_val~0.launch_bt_out$1 (= $sig$1 1)) (=> (= $sig$1 2) (not $launch_bt_val~0.launch_bt_out$1)) (=> $start_bt_val~0.start_bt_out$1 (not $start_bt_val~0.launch_bt$1)) (=> $start_bt_val~0.launch_bt$1 (= $sig$1 2)) (=> $start_bt_val~0.launch_bt$1 (not $launch_bt_val~0.launch_bt_out$1)) (=> (= $sig$1 0) (not $launch_bt_val~0.launch_bt_out$1)) (=> $start_bt_val~0.start_bt$1 true) (=> false (= $sig$1 0)) (=> (not $start_bt_val~0.start_bt$1) (not $start_bt_val~0.launch_bt$1)) (=> (not $start_bt_val~0.start_bt_out$1) (not $launch_bt_val~0.launch_bt_out$1)) (=> false (not $start_bt_val~0.launch_bt$1)) (=> (= $sig$1 0) (not $start_bt_val~0.launch_bt$1)) (=> false $launch_bt_val~0.launch_bt_out$1) (=> $launch_bt_val~0.launch_bt_out$1 (not $start_bt_val~0.launch_bt$1)) (=> $launch_bt_val~0.launch_bt_out$1 $start_bt_val~0.start_bt_out$1) (=> $start_bt_val~0.launch_bt$1 $start_bt_val~0.start_bt$1) (=> (= $sig$1 1) (not $start_bt_val~0.launch_bt$1)) (=> (not $launch_bt_val~0.launch_bt_out$1) true) (=> false (not $start_bt_val~0.start_bt$1)) (=> (not $start_bt_val~0.launch_bt$1) true) (=> false $start_bt_val~0.launch_bt$1) (=> $start_bt_val~0.launch_bt$1 (not $start_bt_val~0.start_bt_out$1)))))))
(check-sat act13)
(echo "@DONE")
; Z3: sat
; Z3: @DONE
(get-model)
(echo "@DONE")
; Z3: (model 
; Z3:   (define-fun act10 () Bool
; Z3:     false)
; Z3:   (define-fun $ignition$1 () Bool
; Z3:     true)
; Z3:   (define-fun $reset_flag$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$1 () Bool
; Z3:     false)
; Z3:   (define-fun act5 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$1 () Int
; Z3:     1)
; Z3:   (define-fun $ignition$~1 () Bool
; Z3:     false)
; Z3:   (define-fun act13 () Bool
; Z3:     true)
; Z3:   (define-fun $p1$1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt$~1 () Bool
; Z3:     true)
; Z3:   (define-fun act7 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.launch_bt$1 () Bool
; Z3:     true)
; Z3:   (define-fun $reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$~1 () Bool
; Z3:     true)
; Z3:   (define-fun $ignition$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.start_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt$1 () Bool
; Z3:     true)
; Z3:   (define-fun $p1$0 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.start_bt$1 () Bool
; Z3:     true)
; Z3:   (define-fun %init () Bool
; Z3:     false)
; Z3:   (define-fun $sig$0 () Int
; Z3:     1)
; Z3:   (define-fun $start_bt_val~0.launch_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$0 () Bool
; Z3:     true)
; Z3:   (define-fun act9 () Bool
; Z3:     false)
; Z3:   (define-fun act6 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt_out$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.launch_bt_out$0 () Bool
; Z3:     true)
; Z3:   (define-fun act11 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun act8 () Bool
; Z3:     false)
; Z3:   (define-fun $start_bt_val~0.start_bt$0 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$0 () Bool
; Z3:     false)
; Z3:   (define-fun $reset_flag$~1 () Bool
; Z3:     false)
; Z3:   (define-fun $sig$~1 () Int
; Z3:     0)
; Z3:   (define-fun $start_bt_val~0.start_bt$1 () Bool
; Z3:     true)
; Z3:   (define-fun $start_bt_val~0.reset_flag$1 () Bool
; Z3:     false)
; Z3:   (define-fun $launch_bt_val~0.reset_flag$1 () Bool
; Z3:     false)
; Z3: )
; Z3: @DONE
; Finished single inductive step refinement
