# Reto_Automatizacion_PaulTineo


1. Descargar las dependencias en el POM.XML
2. El proyecto se uso MAVEN y JAVA 17
3. Para la ejecucion del proyecto se debera hacer por consola: 

API:
mvn clean test -Dtest=RunnerApiTest "-Dkarate.env=dev" "-Dkarate.options=--tags @regresion"

Observacion: -Dkarate.env es el ambiente donde se ejecutara (dev,qa), -Dkarate.options= es el tag del caso de prueba que se desea ejecutar

WEB:
mvn clean verify -Dtest=RunnerWebTest -Denvironment=dev -Dtags="@regresion" -DnumberCard="1234 5678 9012 3456"

Observacion: -Denvironment es el ambiente donde se ejecutara (dev,qa), -Dtags= es el tag del caso de prueba que se desea ejecutar, -DnumberCard= es el numero de tarjeta para la prueba de compra

Para web se debe descargar la version del driver de chrome que se tenga instalado y agregarlo a las variables de entorno, para esto se debe descargar el driver de la version de chrome que se tenga instalada, y luego ponerlo en la carpeta driver (ejemplo: C:\drivers\chromedriver.exe)




