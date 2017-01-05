#!/usr/bin/env bash
echo Running modular jar with three arguments...
$J9/java -p "out;lib" -m ch.bbv.java9.todo.app "Write Birthday Card" "Check Email" "Pay Taxes"
echo
echo Running TodoApplication with one argument...
$J9/java -p "out;lib" -m ch.bbv.java9.todo.app items
echo ...done!