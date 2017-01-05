#!/usr/bin/env bash
echo Running TodoApplication with three arguments...
$J9/java -p "mods;lib" -m ch.bbv.java9.todo.app/ch.bbv.java9.todo.app.api.TodoApplication "Do the laundry" "Go shopping" "Call Mum"

echo Running TodoApplication with one argument...
$J9/java -p "mods;lib" -m ch.bbv.java9.todo.app/ch.bbv.java9.todo.app.api.TodoApplication items

echo "... done!"