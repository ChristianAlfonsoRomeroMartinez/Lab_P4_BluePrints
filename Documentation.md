# Laboratorio ARSW

## CRUD
Para el crud desde el laboratoio anterior ya se habia implementado create, update y varias consultas, sin embargo no se habia implementado el delete

Para el desarrollo del delete 
- En `BlueprintsAPIController.java` agregamos el end point 
- En `BlueprintsServices.java` agregamos el metodo de servicio que delega la peticion
- En `PostgresBlueprintPersistence.java` es donde implementamos el metodo, con el scrip SQL para poder eliminarlo
- En `BlueprintPersistence.java` confirmamos la aliminacion

![swagger](img/delete/1.png)
![swager1](img/delete/2.png)
