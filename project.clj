(defproject ataraxy "0.4.0"
  :description "A data-driven Ring routing and destructuring library"
  :url "https://github.com/weavejester/ataraxy"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [ring/ring-core "1.6.1"]]
  :profiles
  {:dev {:dependencies [[criterium "0.4.3"]]}})
