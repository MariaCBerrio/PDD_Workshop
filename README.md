Se decidió usar el patrón de diseño Adapter para el diseño de la aplicación para monitorear el mercado de acciones, pues este proporciona varias ventajas tales como: 

•	Reutilización del código:  Facilitó la integración de las clases que manejan los datos XML, sin tener que modificarlas. Permitiendo aprovechar funcionalidades ya implementadas sin necesidad de reescribir el código.

•	Organización del código: Al crear una clase específica para la conversión de datos XML a JSON, se puede percibir un código más organizado y esto también, facilita su mantenimiento.

•	Flexibilidad: El patrón de diseño Adapter permite que en un futuro se puedan agregar nuevas funcionalidades o editar la implementación, sin que esto afecte el sistema. Es decir, si por ejemplo se necesita cambiar la forma de conversión de los datos, basta con modificar la clase “AdaptadorFormatoDatos”, sin necesidad de alterar el resto del código.

•	Compatibilidad en el sistema: Aunque los datos que ingresan al sistema manejen un formato incompatible, su utilización es posible gracias al adaptador que los convierte a formato JSON.

•	Integración de librerías externas: Como se requiere utilizar una librería para trabajar con datos en formato JSON, con este patrón de diseño se puede adaptar la salida de aplicación (los datos en formato XML) al formato que espera la librería, sin tener que modificar la lógica interna de la aplicación.

Se concluye entonces que, el uso de la clase adaptadora es el éxito de implementar este patrón de diseño.
