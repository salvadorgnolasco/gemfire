# Ejercicio 1 Gemfire

## Prerequisitos

- Descargar la versión [Windows Zip 8.2.9 de Gemfire](https://network.pivotal.io/products/pivotal-gemfire#/releases/52612/file_groups/875) y colocar en la carpeta: ***C:\opt\Pivotal_GemFire_829_b16_Windows***
- Descargar [Git for Windows](https://git-scm.com/download/win) e instalar en la carpeta ***C:\opt\git***
- Java JDK versión 8 instalado en la carpeta: ***C:\opt\java\jdk1.8.0_XXX*** (Donde XXX es la versión del build)
- Archivo Zip con el contenido base del ejercicio (gemfire-ejemplo01.zip)

## Configuración del ambiente

- Ejecute git-bash.exe y ejecute los siguientes comandos para configurar el ambiente

>```sh
>> cd
>> touch .bashrc
>```

- Edite el archivo .bashrc

>```sh
>JAVA_HOME=/c/opt/java/jdk1.8.0_144
>GEMFIRE_HOME=/c/opt/Pivotal_GemFire_829_b16_Windows
>
>PATH=$PATH:$JAVA_HOME/bin:$JAVA_HOME/jre/bin:$GEMFIRE_HOME/bin;
>
>export JAVA_HOME GEMFIRE_HOME PATH
>
>PS1='[$PWD]: '
>cd /c/opt/
>```

- Cierre la ventana de git-bash

## Creación de regiones

- Cree las siguientes carpetas
  - C:\dev
  - C:\dev\gemfire
  - C:\dev\gemfire\ejemplo01 ***Con el contenido del zip de este ejercicio***
- Abrir una consola de git-bash
- Y ejecutar los siguiente comandos:

>```sh
>> cd /c/dev/gemfire/ejemplo01
>> start gfsh
>```

Se ejecutará una nueva consola de windows con las variables de ambientes necesarias para la ejecución de la consola de gemfire (gfsh). En esta consola se deberá ejecutar las siguientes instrucciones para la configuración de una región de cache llamada Customers.

>```bash
>gfsh> start locator --name=local-locator
>
>gfsh> start server --name=server1 --cache-xml-file=xml/Server.xml --classpath="C:\dev\gemfire\ejemplo01\classes"
>
>gfsh> start pulse
>```

El usuario y password por default es: admin/admin. A través de esta herramienta se podrá ejecutar queries directos a las regiones creadas.
