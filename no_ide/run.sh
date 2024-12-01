script_directory="$(realpath "$(dirname "$0")")"
export file=HelloWorld.java
cd $script_directory
export JAVA_HOME=/Users/keqianli/Library/Java/JavaVirtualMachines/corretto-17.0.13/Contents/Home
$JAVA_HOME/bin/javac $script_directory/$file
$JAVA_HOME/bin/java ${file%.*}
$JAVA_HOME/bin/javadoc -d jdoc $script_directory/$file
