# PruebaServicioRestHomCen
Se desarrollo el servicio Rest solicitado en la prueba, usando el Framework de SpringBoot

Se uso JPA y una conexión a PostgreSQL, si es necesario para la prueba por favor cambiar los datos de conexión de la BD 
en el archivo application.properties:

![image](https://user-images.githubusercontent.com/43590815/149152278-2c733c01-c9c5-4889-8047-fd815081f89e.png)

y de ser necesario si se tiene otra BD para probar, tambie se debe cambiar en el anterior archivo el parametro del DataBase y además en el archivo pom.xml seria necesario 
cambiar la dependencia de PostgreSQL:

![image](https://user-images.githubusercontent.com/43590815/149153221-f8fa2222-d6b7-4aa8-a68e-2b147f55b4df.png)

Para probar el servicio me apoye en la herramienta de POSTMAN, a continuación el listar de almacenes(GET):

![image](https://user-images.githubusercontent.com/43590815/149154955-e31c49d8-025f-4610-acb2-55cd693654fe.png)

A continuación el insertar (POST):

![image](https://user-images.githubusercontent.com/43590815/149155279-797f6adb-e570-4901-ad3b-02bbd8a9bc8d.png)

Y se visualiza ya cuando se lista:

![image](https://user-images.githubusercontent.com/43590815/149155478-ad6b1ec4-ca6b-4204-99d1-521ddd49bfb4.png)
