#!/usr/bin/env bash
APP_HOME=$(dirname "$0")
java -jar "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" "$@"
