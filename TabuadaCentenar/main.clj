(defn tabuada [numero sinal]
  (doseq [i (range 0 100)]
    (println
      (cond
        (= sinal +) (str numero " + " i " = " (+ numero i))
        (= sinal -) (str numero " - " i " = " (- numero i))
        (= sinal *) (str numero " * " i " = " (* numero i))
        (= sinal /) (str numero " / " i " = " (/ numero i))
      ))))
