#!/usr/bin/env bash
echo Finding dependencies of ./lib/commmonscsv.jar
$J9/jdeps -s ./lib/commonscsv.jar
echo ...done!