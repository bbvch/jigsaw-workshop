#!/usr/bin/env bash
echo Packaging/copying modules...
$J9/jar -c -f out/app.jar --module-version=1.0 -e ch.bbv.java9.todo.app.api.TodoApplication -C mods/ch.bbv.java9.todo.app .
$J9/jar -c -f out/model.jar --module-version=1.0 -C mods/ch.bbv.java9.todo.model .

echo ... done!