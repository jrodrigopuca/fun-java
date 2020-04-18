tasks.register("hello"){
    doLast{
        println("hello ")
    }
}

tasks.register("world"){
    dependsOn("hello") //depende de tarea hello

    doLast{
        println("world")
    }
}