## Teoria
### Build Phases
- Un proyecto consiste en tareas, cuando corremos estas tareas pasan por fases:
    - Inicialización
    - Configuración
    - Ejecución
### Fases de Ejecución
- doFirst: al principio de la ejecución
- doLast: al final de la ejecución o en ciertas condiciones

## Practicando 
- Creo un archivo 'build.gradle' con una tarea 'hello' que al principio (doFirst) muestra a 'Hello' y al final (doLast) muestra a ', World".
- Ejecuto en consola  ```$ gradle hello```

Resultado:
```
> Task :hello
Hello, World

BUILD SUCCESSFUL in 2s
1 actionable task: 1 executed
```

### con Kotlin
es posible hacer lo mismo que lo especificado con build.gradle usando kotlin (build.gradle.kts)
```
tasks.register("hello"){
    doFirst{print("Hello")}
    doLast{println(", World")}
}
```