## usando gradle con java
- creo un archivo 'build.gradle' agregando como plugin a Java
- creo un archivo en java en ```src/main/java/App.java```
- en consola: ```gradle tasks``` para ver lo que puedo hacer con el plugin. Ver "Tasks runnable from root project"
- en consola: ```gradle build``` para generar la carpeta build
- si quiero ver como se producen los cambios es mejor hacer ```gradle build -i``` para obtener más información.
- en consola: ```java -cp build/classes/java/main App ``` para probar el archivo realizado. Debería mostrar "hola mundo" en consola.


### Lo que puedo hacer con Java + gradle: 
```
Tasks runnable from root project
------------------------------------------------------------

Build tasks
-----------
assemble - Assembles the outputs of this project.
build - Assembles and tests this project.
buildDependents - Assembles and tests this project and all projects that depend on it.
buildNeeded - Assembles and tests this project and all projects it depends on.
classes - Assembles main classes.
clean - Deletes the build directory.
jar - Assembles a jar archive containing the main classes.
testClasses - Assembles test classes.

Build Setup tasks
-----------------
init - Initializes a new Gradle build.
wrapper - Generates Gradle wrapper files.

Documentation tasks
-------------------
javadoc - Generates Javadoc API documentation for the main source code.

Help tasks
----------
buildEnvironment - Displays all buildscript dependencies declared in root project 'gradle-intro-w-plugins'.
components - Displays the components produced by root project 'gradle-intro-w-plugins'. [incubating]
dependencies - Displays all dependencies declared in root project 'gradle-intro-w-plugins'.
dependencyInsight - Displays the insight into a specific dependency in root project 'gradle-intro-w-plugins'.
dependentComponents - Displays the dependent components of components in root project 'gradle-intro-w-plugins'. [incubating]
help - Displays a help message.
model - Displays the configuration model of root project 'gradle-intro-w-plugins'. [incubating]
outgoingVariants - Displays the outgoing variants of root project 'gradle-intro-w-plugins'.
projects - Displays the sub-projects of root project 'gradle-intro-w-plugins'.
properties - Displays the properties of root project 'gradle-intro-w-plugins'.
tasks - Displays the tasks runnable from root project 'gradle-intro-w-plugins'.

Verification tasks
------------------
check - Runs all checks.
test - Runs the unit tests.


```