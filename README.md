# java-test

To compile the project:
```
cd main-module
mvn compile
```

To run the tests for the project:
```
cd main-module
mvn install:install-file -Dfile=../libs/diffblue-testcase-1.jar -DpomFile=../libs/pom.xml 
mvn cobertura:cobertura
```
NOTE: You will only need to install the jar file once.
