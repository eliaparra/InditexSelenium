# InditexSelenium

Este proyecto es una aplicación de prueba técnica que utiliza Java, Selenium, Cucumber y Allure para realizar pruebas automatizadas. Utiliza Maven para la gestión de dependencias y la construcción del proyecto.

#Descripción
El proyecto está configurado para utilizar:

Selenium para la automatización de navegadores.
Cucumber para la escritura de pruebas en un formato legible por humanos utilizando Gherkin.
TestNG para la ejecución de pruebas.
Requisitos

#Antes de comenzar, 
asegúrate de tener instalados los siguientes programas en tu máquina:

Java 20 o superior.
Maven 3.6.0 o superior.

#Configuración del Proyecto
Compila el proyecto con Maven: mvn clean compile
Para ejecutar las pruebas, utiliza el siguiente comando Maven. Las pruebas se ejecutarán con TestNG y Cucumber: mvn test

#Configuración de Pruebas
Las pruebas se encuentran en la carpeta src/test/java y están basadas en las características definidas en los archivos .feature ubicados en src/test/resources. Las características están escritas en Gherkin, un lenguaje que permite definir pruebas en un formato sencillo y legible.

