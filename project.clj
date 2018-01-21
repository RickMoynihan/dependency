(defproject weavejester/dependency "0.2.1-SNAPSHOT"
  :description "A data structure for representing dependency graphs"
  :url "https://github.com/weavejester/dependency"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :clj-1.8.0 {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :clj-1.7.0 {:dependencies [[org.clojure/clojure "1.7.0"]]}})
