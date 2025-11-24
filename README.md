#Portal de Capacitaciones Interactivo

Este proyecto expone los servicios para la autenticación, crear, editar, listar y marcar el estado de cursos.

#Tecnologias

-Spring Boot
-Java 17
-SQLite
-Maven

#Instalación

1. Clonar el repositorio
2.Abrir proyecto con Intellij IDEA
3. Compilar e instalar dependencias. Maven -> proyecto -> Lifecycle -> clean, compile, install
4. Ejecutar el proyecto en el boton de Run.


#Endpoints

lOGIN
-POST /api/v1/auth/login

CURSOS
-POST /api/v1/cursos --Crear
-GET /api/v1/cursos/ --Listar
-PUT /api/v1/cursos/{id} --Editar
-PATCH /api/v1/cursos/{id}/estado --Actualizar estado 


#Funcionalidad

Una vez este ejecutando el proyecto, el frontend podrá utilizar los servicios expuestos e interactuar entre si para obtener o enviar información.
