(ns test.core-test
  (:require [clojure.test :refer :all]
            [test.core :refer :all]))

(deftest average-test
  (testing "Average is wrong"
    (test.core/average [10 20])))

(deftest average-test
  (testing "Average is wrong"
    (test.core/average [20 20])))

