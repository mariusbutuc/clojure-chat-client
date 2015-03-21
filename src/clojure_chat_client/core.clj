(ns clojure-chat-client.core
  (:require [clj-sockets.core :as sock])
  (:gen-class))

(defn -main
  "The hello world of chat clients"
  [& args]

  (def socket (sock/create-socket "localhost" 1234))

  (sock/write-line socket "USER Marius")
  (sock/write-line socket "MSG Hello world!")

  (sock/close-socket socket))
