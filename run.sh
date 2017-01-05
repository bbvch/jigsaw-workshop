#!/usr/bin/env bash
echo Running TodoApplication with three arguments...
$J9/java -p "mods;lib" -m ch.bbv.java9.todo.app/ch.bbv.java9.todo.app.api.TodoApplication "Write Birthday Card" "Check Email" "Pay Taxes"
echo

echo Running TodoApplication with one argument...
$J9/java -p "mods;lib" -m ch.bbv.java9.todo.app/ch.bbv.java9.todo.app.api.TodoApplication items

echo "... done!"