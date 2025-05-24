#!/bin/bash
##############################################################################
## Gradle start-up script for UN*X systems.
##############################################################################

# Attempt to locate Java and execute the wrapper jar
if [ -x "$JAVA_HOME/bin/java" ]; then
  JAVA="$JAVA_HOME/bin/java"
else
  JAVA=java
fi

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
"$JAVA" -Dorg.gradle.appname=gradlew -classpath "$DIR/gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
