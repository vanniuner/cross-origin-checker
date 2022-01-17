DEBUG_PORT=$1
MAVEN_RELOAD=$2
mvn pre-clean -T 1C package -f pom.xml $MAVEN_RELOAD -DskipTests
if [ -n $JREBEL_HOME ]; then
    export JAVA_OPTS="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=$DEBUG_PORT"
    export JAVA_OPTS="$JAVA_OPTS -noverify -agentpath:$JREBEL_HOME/lib/libjrebel64.dylib"
    echo "SETTING JREBEL=$JREBEL_HOME/lib/libjrebel64.dylib"
fi
java $JAVA_OPTS \
-jar target/cors-checker-0.0.1-SNAPSHOT.jar
