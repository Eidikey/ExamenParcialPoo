Sistema de Inventario para una Tienda Digital

🎯 Objetivo
Desarrollar en Java un sistema de inventario para una tienda digital que permita gestionar distintos tipos de productos, aplicando correctamente los principios de la programación orientada a objetos: abstracción, encapsulamiento, herencia, polimorfismo y clases abstractas.

Además, el equipo deberá diseñar un diagrama UML coherente con la implementación y elaborar una documentación técnica detallada del sistema.

🧩 Contexto
Una tienda digital requiere un sistema base para administrar su catálogo de productos. Maneja productos físicos y digitales, los cuales comparten características generales, pero difieren en su comportamiento para calcular precios finales.

El sistema debe permitir registrar productos, almacenarlos, consultarlos y calcular su precio final, considerando sus particularidades.

📌 Requerimientos funcionales
1. Clase abstracta Producto
Debe representar la base del sistema.

Atributos mínimos:


• id
• nombre
• precioBase
• cantidadDisponible

Métodos mínimos:


• calcularPrecioFinal()
• mostrarInformacion()

Esta clase no debe ser instanciable directamente.

2. Subclases obligatorias

ProductoFisico
Debe incluir:


• peso
• costoEnvio

Debe sobrescribir calcularPrecioFinal() considerando el costo de envío.

ProductoDigital
Debe incluir:


• tamanoMB
• porcentajeLicencia

Debe sobrescribir calcularPrecioFinal() considerando el costo por licencia.

3. Gestión del inventario
Se deberá implementar una clase Inventario o equivalente que permita:


• agregar productos
• buscar productos (por id o nombre)
• mostrar todos los productos
• actualizar existencias
• calcular el valor total del inventario

El almacenamiento debe realizarse con una colección, por ejemplo: ArrayList<Producto>

4. Uso de polimorfismo
El sistema debe manejar objetos de diferentes tipos (ProductoFisico, ProductoDigital) mediante referencias del tipo Producto.

Se deberá demostrar esto mediante:


• almacenamiento en una misma colección
• ejecución de métodos sin distinguir el tipo concreto

5. Encapsulamiento
Todos los atributos deben:


• ser privados o protegidos
• tener métodos de acceso cuando sea necesario
• incluir validaciones (por ejemplo: evitar valores negativos)

6. Clase principal (Main)
Debe incluir pruebas que demuestren:


• creación de productos
• inserción en el inventario
• consulta de información
• cálculo de precios finales
• uso de polimorfismo

La ejecución puede realizarse en consola.

🧱 Requerimientos de diseño

1. Organización del proyecto (obligatoria)
El proyecto deberá estructurarse exactamente de la siguiente manera:

src/
 ├── modelo/
 │    ├── Producto.java
 │    ├── ProductoFisico.java
 │    ├── ProductoDigital.java
 │
 ├── inventario/
 │    ├── Inventario.java
 │
 ├── app/
 │    ├── Main.java

Reglas:
Todas las clases deben declarar su paquete correspondiente:


• package modelo;
• package inventario;
• package app;

La clase Main debe importar las clases necesarias:


• import modelo.*;
• import inventario.*;

No se aceptarán proyectos sin organización en paquetes.

2. Diagrama UML
Se deberá entregar un diagrama UML que incluya:


• clases
• atributos
• métodos
• relaciones de herencia
• visibilidad (+, -, #)

El diagrama debe coincidir con el código implementado.

📄 Requerimientos de documentación
El equipo deberá entregar un documento en PDF con los siguientes apartados:

1. Portada


• institución
• asignatura
• nombre del proyecto
• integrantes
• fecha

2. Introducción


• Descripción breve del sistema.

3. Objetivo


• Propósito del proyecto.

4. Diseño orientado a objetos
Explicación de:


• abstracción
• encapsulamiento
• herencia
• polimorfismo

5. Diagrama UML


• Incluido y explicado.

6. Descripción de clases
Explicación de cada clase:


• función
• atributos
• métodos

7. Funcionamiento del sistema


• Descripción de la ejecución del programa.

8. Evidencias


• Capturas o salidas del programa.

9. Conclusiones


• Reflexión del equipo.

📦 Entregables
Código fuente completo


• Archivo .zip
• Proyecto organizado en paquetes
• Código funcional

Documento en PDF


• Integrantes del Equipo
• Nombre del Equipo
• Documentación completa del sistema
• Evidencias de Funcionamiento
• Diagrama UML
