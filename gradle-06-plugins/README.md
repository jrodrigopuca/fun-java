## Plugins
opciones para agregar plugins:

```
plugins {java} //kts
plugins {id 'java'} //groovy
apply plugin: 'java' //groovy
```

## Practicando
- En build.gradle se agrega como plugins a Java y a un plugin de node. [Documentación de plugin de Node](https://github.com/srs/gradle-node-plugin/blob/master/docs/node.md): Permite la utilización de scripts de NodeJS. 
- para ver las tareas disponibles se hace ```$ gradle tasks```, notar que además de aparecer las tareas de java, aparecen las siguientes: 

```
Node tasks
----------
nodeSetup - Download and install a local node/npm version.
npmInstall - Install node packages from package.json.
npmSetup - Setup a specific version of npm to be used by the build.
yarn - Install node packages using Yarn.
yarnSetup - Setup a specific version of Yarn to be used by the build.
```