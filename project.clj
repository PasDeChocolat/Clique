(defproject videotest "0.1.0-SNAPSHOT"
  :description "An interactive art installation and experiment, at the Chain of Fire prologue exhibition for the Honolulu Biennial Foundation. http://www.honolulubiennial.org/chain-of-fire"
  :url "http://example.com/FIXME"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [quil "2.2.2"]
                 [opencv/opencv "2.4.10"]
                 [opencv/opencv-native "2.4.10"]

                 ;; required by native-vector
                 [org.clojure/math.numeric-tower "0.0.4"]

                 ;; required for Overtone
                 [overtone "0.9.1"]
                 ]
  :jvm-opts ["-Xmx2G" "-Xms2G"]
  :profiles {:dev {:source-paths ["dev"]}}
  :injections [(clojure.lang.RT/loadLibrary org.opencv.core.Core/NATIVE_LIBRARY_NAME)])
