#!/usr/bin/env bash
echo "Running TodoApplication..."
$J9/java -p mods -m ch.bbv.java9.todo.app/ch.bbv.java9.todo.app.api.TodoApplication "Do the laundry" "Go shopping" "Call Mum"

echo "... done!"