# Practica 6: Testing de una aplicacion de Spring Boot

## Objetivo de la práctica

Dado un desarrollo de Spring Boot, es necesario anhadir tests a las siguientes clases:

- DNI & Telefono (Unit Tests) (Cada clase tiene un metodo y varias casuisticas para probar)
- ProcessController (E2E Tests) (2 endpoints)

## Desarrollo

### Telefono: 

Para testear las restricciones del campo Telefono, se han comprobado dos entradas correctas (9 numeros y 9 numeros con prefijo internacional delante) y dos incorrectas (>9 numeros y caracteres no validos en la cadena).

### DNI: 

Para testear las restricciones del campo DNI, se han comprobado una entrada correctas (8 numeros y 1 letra que cumpla la condicion) y tres incorrectas (letras en la cadena, letras no validas al final de la cadena y combinaciones restringidas).

### E2E: 

Para el end-to-end, se han hecho 4 tests: 2 para la version normal del POST y 2 para la version legacy. En estos se introduce el nombre, telefono y DNI de un usuario, se genera el request, se recoge la respuesta y se confirma si el Body de la misma contiene resultado **OK** (para el test con datos correctos) o si contiene **KO** (para el test con algun dato incorrectos). Para la version legacy, el body devuelve el mensaje en html que nos muestra al hacer submit, por tanto la comprobacion se hace mediante un **contains**, donde se comprueba el mensaje devuelto, que es distinto si el proceso ha sido exitoso o no.
