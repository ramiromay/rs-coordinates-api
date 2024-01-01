# API DE COORDENADAS V1

## Descripción

API Rest de coordenadas desarrollada con Spring Boot 3, Java 17 y PostgreSQL 16.

## Requisitos Previos
* Tener [PostgreSQL 15](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads) o posteriores.
* Esta API utiliza [Spring Boot 3](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/) por 
  lo que requiere [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) o posteriores.

> NOTA: En caso de tener una version de Java posterior a la 17 
> es necesario ir al archivo [pom.xml](./pom.xml) 
> y dentro del archivo en la sección `<properties><properties/>` 
> especificar su versión en la etiqueta `<java.version>TU_VERSION</java.version>`.

## Empezando
Para probar la API de coordenadas de manera local es necesario
seguir las siguientes instrucciones:

1. Abra la terminal en el directorio donde desea tener el proyecto
y ejecute el siguiente comando para clonar el repositorio (proyecto) a su equipo.
    ```shell 
    git clone https://github.com/ramiromay/rs-pointer-api.git
    ```

2. Utiliza el comando cd para cambiar de directorio y ubicarte en la raíz del proyecto.
    ```shell
    cd rs-pointers-api
    ```
3. Introduzca el siguiente comando para crear la base de datos.
Es necesario cambiar `tu_usuario` por tu usuario de postgres.  
    ```shell
    psql -U tu_usuario -f pointers_db.sql
    ```
   > NOTA: Es muy posible que después de ejecutar el comando se 
   > requiera la contraseña de postgres.
   > En caso de tener problemas al momento de ejecutar el comando anterior, 
   > vaya al archivo [DATABASE_GUIDE](./DATABASE_GUIDE.md).
   
4. Para terminar, en el [application.properties](./src/main/resources/application.properties) debera sustituir los siguientes valores
por sus credenciales de PostgreSQL y la URL de la base de datos.
    ```properties
    spring.datasource.username=${POSTGRESQL_USERNAME}
    spring.datasource.password=${POSTGRESQL_PASSWORD}
    spring.datasource.url=${POSTGRESQL_URL}/pointers_db
    ```
   
5. Ya tiene todo listo para empezar a probar la API. 👨🏻‍💻

## Endpoints Disponibles

### Coordenadas [[/api/v1/coordinates](http://localhost:8080/api/v1/coordinates)]

#### Atributos (Objeto)
```java
public class Coordinate {
    private Double lat;
    private Double lng;
    private Date date;
}
```

#### Obtener todas las coordenadas [GET]
* Respuesta 200 (application/json;charset=UTF-8)
    ```json
    [
      {
          "lat": 0.0,
          "lng": 0.0,
          "date": "0000-00-00"
       }  
    ]
    ```

## Consumir la API con JavaScript

A continuación, se muestra un ejemplo para consumir la API en tu aplicación usando
JavaScript. Puedes utilizar la API Fetch para realizar peticiones HTTP de manera sencilla.
```javascript
const API_URL = 'http://localhost:8080/api/v1';

fetch(`${API_URL}/coordinates`)
        .then(response => response.json())
        .then(data => console.log(data))
        .catch(error => console.error('Error en la solicitud:', error));
```




