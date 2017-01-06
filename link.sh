#!/usr/bin/env bash
echo Generating module-info.java for lib folder...
rm -rf tmp
$J9/jdeps --gen-module-info tmp lib
echo tmp/commonscsv/module-info.java:
cat tmp/commonscsv/module-info.java
echo ...done!
echo
echo Compiling tmp/commonscsv/module-info.java:
# TODO: Find out how to compile the generated module-info.java
$J9/javac --module-source-path lib -d mods tmp/commonscsv/module-info.java
echo ...done!
echo
echo Linking modules...
rm -rf image
$J9/jlink -p "C:\jdk-9\jmods;mods;lib" --add-modules ch.bbv.java9.todo.app --output ./image
echo ...done!