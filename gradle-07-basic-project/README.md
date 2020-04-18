## Java Plugins
- Esperan encontrar el código fuente en las ubicaciones predefinidas
- Pueden cambiarse usando SourceSets

## Estructura
```
sourceSets{
    main{
        java{
            srcDir 'src/java'
        }
        resources{
            srcDir 'src/resources'
        }
    }
}
```

## Practicando
- Creo un archivo app.java con un hola mundo 
- en 'build.gradle' especifico el plugin java, una versión de mi proyecto
- ```gradle build```: creo la carpeta build
- ```gradle clean```: borra toda la carpeta build
- ```gradle clean build```: borra la carpeta build y la vuelve a crear
- notar que en 'build/libs' cambia de acuerdo a la versión especificada
- hacer ```$ java -cp build/classes/java/main App``` para ver el resultado