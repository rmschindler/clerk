(defproject pez/clerk "1.0.0"
  :description "In-page navigation for Single-Page Applications (mimicing Multi-Page Site scrolling)"
  :url "https://github.com/PEZ/clerk"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.170"]
                 [org.clojure/core.async "0.4.474"]]
  :deploy-repositories [["clojars" {:sign-releases false
                                    :url           "https://clojars.org/repo"}]])
