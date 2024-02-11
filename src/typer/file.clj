(ns typer.file)

;; File is another namespace under the same parent typer.

;; Lets work on a common way to store text

;; I'm talking about local files,

;; Let's create one on same project root folder using terminal:

(def current-data (slurp "data.txt"))

(def now (System/currentTimeMillis))

(spit "data.txt" (str current-data now " Added data by program!\n" ) )
