#!/usr/bin/env bash
echo "Compiling modules..."
$J9/javac -d mods/ch.bbv.java9.todo.app $(find . -name "*.java")


echo "...done!"