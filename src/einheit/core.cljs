(ns einheit.core
  (:require
    [elmalkike.signal :as e-sig]
    [recurrent.core :as recurrent]))

(enable-console-print!)

(defonce app-state (atom {:text "Hello world!"}))

(defn on-js-reload [])



