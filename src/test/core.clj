(ns test.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn average
  [numbers]
  (println(/ (apply + numbers) (count numbers))))