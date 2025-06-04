(ns defnk!.core
  #?(:cljs (:require-macros [defnk!.core :refer [defnk!]])))

(defmacro defnk! [name params & body]
  `(clojure.core/defn ~name
     {:malli/schema [:=> [:cat ~(vec (concat [:map] (mapv (fn [key] [(keyword key) :any]) (second (first (first params))))))] :any]}
     ~params
     ~@body))
