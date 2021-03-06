(defproject ai.finity/clj-cron-parse "0.1.5-SNAPSHOT"
  :description "A Clojure library for using cron expressions"
  :url "https://github.com/finity-ai/clj-cron-parse"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clj-time "0.9.0"]
                 [org.clojure/core.match "0.3.0-alpha4"]]
  :pedantic? :abort
  :profiles {:dev {:dependencies [[midje "1.6.3"]]
                   :plugins [[lein-cljfmt "0.1.10"]
                             [lein-midje "3.1.3"]]}})
