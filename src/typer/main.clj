(ns typer.main
  (:gen-class))
;;https://clojure.org/reference/compilation#_gen_class_examples

;; So here is a clojure namespace file.

;; See that only a single parenthesis containing two words ns and typer.main.

;; ns is the name of a function that creates the namespace.

;; typer.main it the namespace it self, like a tree of files, the root is typer.

;; and the main is a child.

;; Let's create a single instruction on this file, the famous hello-word!

(println "Hello world")

;; REPL code is easily copied and pasted as pude code:

"So now we have a REPL, is the same as the one we runned on the terminal but more convenient to use"
;; => "So now we have a REPL, is the same as the one we runned on the terminal but more convenient to use"

;; We loaded this file on the repl, means that each line will be executed

;; on the REPL, as if we have typed each one and pressed enter

;; Hello world was printed after running line 15:

;; Lets add another and load again:

(println "The result of 1 + 1 is 2, let's calculate: " (+ 1 1))

;; println is a fn that receives texts or other data and makes a string out of this and sends to the stdout (standard output).

(println "Now I want to run only this println here!")

"this was an individual form execution, or a single instruction for the repl"
;; => "this was an individual form execution, or a single instruction for the repl"

;; Now let's focus on the logic of the program

;; A very basic program is the typical hello world that prints a text

;; TBC.....

(defn -main [& [text :as args]]
  (println "Main function invoked with args: " args)

  (println "This was the text received: " text)
  )

(comment
  (-main "ttteexxt")

  (compile 'typer.main)

  ;; java -cp `clj -Spath` typer.main Fred

  ;; sudo ln -s /Users/victorinacio/4coders/typer/t /usr/local/bin
  )