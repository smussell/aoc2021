(ns day1.day1)
(require '[clojure.string :as str])


(defn comp [[ac prev] c]
  [(if (> c prev) (inc ac) ac) c])

(defn part1 [input]
  (reduce comp [0 Integer/MAX_VALUE] input))

(defn parse-int [val]
  (Integer/parseInt val))

(defn read-input [file]
  (->> file
       clojure.java.io/resource
       slurp
       str/split-lines
       (map #(Integer/parseInt %))))

(def input1 (read-input "day1/input1.txt"))

(part1 input1)

;; part 2

(def sample2 ["199"
              "200"
              "208"
              "210"
              "200"
              "207"
              "240"
              "269"
              "260"
              "263"])

(def input2 (read-input "day1/input2.txt"))

(->> input2 
     (partition 3 1)
     (map #(apply + %))
     part1)


