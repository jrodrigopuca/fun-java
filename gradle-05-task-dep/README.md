## Dependencias
Para hacer 

- Crear en build.gradle.kts dos tareas, una para mostrar "hello" y otra para "world"
- Hacer depender una tarea de otra usando ```dependsOn("tarea")```
- Ejecutar en consola: ```$ gradle world```
- Resultado:

```
> Task :hello
hello

> Task :world
world
```

## Sintaxis sin Kotlin (usando groovy script)

```
task hello{
    doLast{print 'Hello'}
}

task world{
    dependsOn hello

    doLast{println(" world")}
}
```