(ns clojure-chat-client.core
  (:require [clj-sockets.core])
  (:gen-class))

(defn -main
  "The hello world of chat clients"
  [& args]

  (def socket (clj-sockets.core/create-socket "localhost" 1234))

  (clj-sockets.core/write-line socket "USER Marius")
  (clj-sockets.core/write-line socket "MSG Hello world!")

  (clj-sockets.core/close-socket socket))
