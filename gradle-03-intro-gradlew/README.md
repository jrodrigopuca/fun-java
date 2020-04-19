## usando gradlew
Este proceso es similar pero se crean los archivos de gradle usando un wrapper
- creo un archivo 'build.gradle' agregando como plugin a Java
- creo un archivo en java en ```src/main/java/App.java```
- En consola ```gradle wrapper``` generará las carpetas (.gradle/gradle) y archivos (gradlew, gradlew.bat)
- En consola ```./gradlew build```  descargará la versión de gradle correspondiente a mi maquina para ejecutar el código.
- en consola: ```gradle build``` para generar la carpeta build. Notar que hace el build con la versión local del gradle que fue descargada
- en consola: ```java -cp build/classes/java/main App ``` para probar el archivo realizado. Debería mostrar "hola mundo" en consola.



## Detalles
si se prefiere otra versión de gradle es mejor especificarlo de esta forma:
```gradle wrapper --gradle-version 6.2 --distribution-type all```

## Razones para usar wrapper
- El IDE lo necesita cuando esta cargando un proyecto
- cuando sea necesario para crear un build

## Motivos para usar un Build Server
- Integración Continua: cuando hay un cambio en el código, nosotros necesitamos revisar que se despliegue continuamente.
- Si no es CI al menos las versiones más recientes de prueba o nightly builds
- Si no es en nightly entonces un lugar 'limpio' para evitar el "esto trabaja en mi máquina"

Se recomiendaa TeamCity para administrar los proyectos y builds.
