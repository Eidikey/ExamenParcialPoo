# Sistema de Inventario - Tienda Digital

Sistema de gestión de productos desarrollado en **Java**, enfocado en la implementación técnica de los pilares de la Programación Orientada a Objetos (POO).

## 🎯 Objetivo
Diseñar una solución escalable que permita administrar un catálogo mixto de productos (físicos y digitales), aplicando conceptos avanzados como clases abstractas, polimorfismo y encapsulamiento estricto.

## 🏗️ Arquitectura del Proyecto
El código está organizado en paquetes para asegurar una separación de responsabilidades clara:

- **`modelo`**: Contiene la definición de la clase abstracta `Producto` y sus especializaciones.
- **`inventario`**: Gestiona la lógica de almacenamiento y manipulación de datos mediante colecciones.
- **`app`**: Punto de entrada del sistema y demostración de funcionalidades.

### Estructura de Directorios
```text
src/
 ├── modelo/
 │    ├── Producto.java
 │    ├── ProductoFisico.java
 │    └── ProductoDigital.java
 ├── inventario/
 │    └── Inventario.java
 └── app/
      └── Main.java


