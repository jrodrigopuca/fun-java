## Iniciar proyecto con gradle
Para iniciar solo se deberá escribir en consola ```gradle init```
seguir las opciones y listo. Para este caso se usó como lenguaje a Java, para sintaxis del build a Groove, tipo aplicación y como nombre del package a 'gradle08'

Se agregaron dos archivos en source: una clase de producto y su instancia (show.java)
Luego se realizo ```gradle build``` para obtener los archivos compilados.

Para ver los resultados:
```
$ java -cp build/classes/java/main gradle08.App
Hello world.
```

```
$ java -cp build/classes/java/main gradle08.Show
Precio: 100
```

Notar que en ```build/libs``` el package se encuentra en un .jar.

## Generar documentación del proyecto
Para generar la documentación solo se deberá hacer ```gradle javadoc```
con eso obtendremos en ```build/docs/javadoc/index.html``` la documentación.