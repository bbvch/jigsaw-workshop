#!/usr/bin/env bash
echo Running modular jar...
$J9/java -p out -m ch.bbv.java9.todo.app "Write Birthday Card" "Check Email" "Pay Taxes"
echo ...done!