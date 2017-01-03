#!/usr/bin/env bash
echo "Compiling modules..."
$J9/javac -d mods --module-source-path . $(find . -name "*.java")

echo "...done!"