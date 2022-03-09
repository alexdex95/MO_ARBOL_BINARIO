# MO_ARBOL_BINARIO
	Proyecto de árboles binarios prueba MO

# PROBAR FUNCIONAMIENTO.
	1. Descargar el repositorio completo.
	2. Importar el proyecto MAVEN en eclipse o intellij idea desde la carpeta "\binarytree" que se encuentra el archivo pom.xml.
	3. Ejecutar la clase binarytreeapplication.java esperar que salga el siguiente mensaje:
  
2022-03-09 09:24:36.160  INFO 17944 --- [           main] mo.binarytree.BinaryTreeApplication      : Started BinaryTreeApplication in 2.168 seconds (JVM running for 2.52)

	4. Cargar la colección archivo mo.postman_collection.json en Postman.
  	5. Buscar en Postman la colección con el nombre MO.
	6. Enviar peticiones desde Postman.

# EJECUTAR SERVICIO 1 (POST) POSTMAN 
	1. El primer servicio getbinarytree se debe llenar la pestaña de body con los datos para construir el árbol binario.

Respuesta Servicio   
	Objeto con la estructura del arbol binario (nodo hijo, nodo padre, ubicación).
Ejemplo.	
	
{
    "treecreate": {
        "rootdata": {
            "parentnumber": 67,
            "location": "RAIZ",
            "sonnumber": 0
        },
        "nodos": [
            {
                "parentnumber": 67,
                "location": "IZQUIERDA",
                "sonnumber": 39
            },
            {
                "parentnumber": 67,
                "location": "DERECHA",
                "sonnumber": 76
            },
	    
# EJECUTAR SERVICIO 2 (GET) POSTMAN
	2. El segundo servicio lookforancestor se debe llenar la pestaña de body con los datos para construir el arbol binario y 
	la pestaña de params con los numeros para realizar la busqueda del ancestro común más cercano.
	
Respuesta Servicio   
	Objeto con la estructura del arbol binario (nodo hijo, nodo padre, ubicación) y mensaje con antecesor más cercano.
Ejemplo respuesta.
	
{
    "treecreate": {
        "rootdata": {
            "parentnumber": 67,
            "location": "RAIZ",
            "sonnumber": 0
        },
        "nodos": [
            {
                "parentnumber": 67,
                "location": "IZQUIERDA",
                "sonnumber": 39
            },
            {
                "parentnumber": 67,
                "location": "DERECHA",
                "sonnumber": 76
            },	
"ancestornode": "Ancestro común más cercano: 39"
