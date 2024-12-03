# Inventario de Equipos Computacionales API

## Descripción del Proyecto

Sistema de gestión de inventario de equipos computacionales desarrollado con Spring Boot, diseñado para realizar el seguimiento y control de dispositivos tecnológicos en una organización.

## Características Principales

- Consulta de dispositivos por número de inventario
- Registro y seguimiento de equipos computacionales
- Integración con base de datos MySQL
- API RESTful para gestión de inventario

## Requisitos Previos

- Java 17 o superior
- Maven 3.6+
- MySQL 8.0+

## Tecnologías Utilizadas

- Spring Boot 3.2.1
- Spring Data JPA
- MySQL
- Maven

## Configuración del Proyecto

### 1. Clonar el Repositorio

```bash
git clone https://github.com/tu-usuario/inventario-equipos-api.git
cd inventario-equipos-api
```

### 2. Configurar Base de Datos

Crear base de datos en MySQL:
```sql
CREATE DATABASE inventario_equipos;
```

### 3. Configurar Credenciales

Editar `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/inventario_equipos
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
```

### 4. Compilar y Ejecutar

```bash
# Compilar el proyecto
mvn clean install

# Ejecutar la aplicación
mvn spring-boot:run
```

## Endpoints de la API

### Consultar Dispositivo

- **URL**: `/api/inventario/dispositivo/{numeroInventario}`
- **Método**: GET
- **Ejemplo**: `GET http://localhost:8080/api/inventario/dispositivo/IT2024001`

### Respuesta de Ejemplo

```json
{
    "numeroInventario": "IT2024001",
    "tipoDispositivo": "Laptop",
    "marca": "Dell",
    "modelo": "Latitude 5510",
    "numeroSerie": "DELL55109876543",
    "sistemaOperativo": "Windows 11 Pro",
    "procesador": "Intel Core i7 10510U",
    "ram": "16 GB",
    "estadoActual": "En uso"
}
```

## Estructura del Proyecto

```
src/
├── main/
│   ├── java/
│   │   └── com/empresa/inventarioapi/
│   │       ├── InventarioApiApplication.java
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       └── service/
│   └── resources/
│       └── application.properties
└── test/
    └── java/
        └── com/empresa/inventarioapi/
```

## Próximos Pasos

- Implementar endpoints para creación y actualización de dispositivos
- Agregar autenticación y autorización
- Desarrollar frontend para gestión de inventario

## Contribuciones

Las contribuciones son bienvenidas. Por favor, sigue estos pasos:

1. Haz un fork del proyecto
2. Crea tu rama de características (`git checkout -b feature/AmazingFeature`)
3. Confirma tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Empuja a la rama (`git push origin feature/AmazingFeature`)
5. Abre un Pull Request

## Licencia

Distribuido bajo la Licencia MIT. Consulte `LICENSE` para más información.

## Contacto

Tu Nombre - harflores.cl@gmail.com

Enlace del Proyecto: [https://github.com/harflores/inventarioapi](https://github.com/harflores/inventarioapi)
```

