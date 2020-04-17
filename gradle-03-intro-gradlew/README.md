## usando gradlew
Este proceso es similar pero se crean los archivos de gradle usando un wrapper
- creo un archivo 'build.gradle' agregando como plugin a Java
- creo un archivo en java en ```src/main/java/App.java```
- En consola ```gradle wrapper``` generará las carpetas (.gradle/gradle) y archivos (gradlew, gradlew.bat)
- En consola ```./gradlew build```  descargará la versión de gradle correspondiente a mi maquina para ejecutar el código.
- en consola: ```gradle build``` para generar la carpeta build. Notar que hace el build con la versión local del gradle que fue descargada
- en consola: ```java -cp build/classes/java/main App ``` para probar el archivo realizado. Debería mostrar "hola mundo" en consola.



