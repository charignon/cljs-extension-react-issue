(ns clext2.core
  (:require [reagent.core :as r]))

(defn timer-component []
  (let [seconds-elapsed (r/atom 0)]
    (fn []
      (js/setTimeout #(do (println "FOO") (swap! seconds-elapsed inc)) 1000)
      [:div "Seconds Elapsed: " @seconds-elapsed])))

(let [app (js/document.createElement "div")
      _ (js/document.body.appendChild app)]
  (enable-console-print!)
  (println "Starting")
  (r/render [timer-component] app))

(defn on-js-reload []
  ;; (render-react)
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
