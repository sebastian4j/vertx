#!/bin/sh
echo "********************************************************"
echo "lanzando hola-vertx"
echo "********************************************************"

cd /usr/local/app/
java -cp @project.build.finalName@.jar:lib/* com.sebastian.vertx.Main
