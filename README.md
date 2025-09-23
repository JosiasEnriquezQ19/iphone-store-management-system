# iPhone Store Management System

Sistema de gestión para tienda de iPhones desarrollado con Spring Boot.

## 🚀 Características

- **Gestión de Productos**: Administración completa de productos iPhone
- **Gestión de Clientes**: Sistema de registro y administración de clientes
- **Gestión de Proveedores**: Control de proveedores y sus productos
- **Sistema de Pedidos**: Procesamiento y seguimiento de pedidos
- **Comprobantes**: Generación de comprobantes y tickets
- **Gestión de Usuarios**: Sistema de autenticación y autorización
- **Seguridad**: Implementado con Spring Security
- **Interfaz Web**: Frontend con Thymeleaf

## 🛠️ Tecnologías Utilizadas

- **Java 21**
- **Spring Boot 3.5.4**
- **Spring Data JPA**
- **Spring Security**
- **Thymeleaf**
- **MySQL 8.0**
- **Maven**
- **HikariCP** (Pool de conexiones)

## 📋 Requisitos Previos

- Java 21 o superior
- MySQL 8.0
- Maven 3.6+

## 🔧 Configuración e Instalación

### 1. Clonar el repositorio
```bash
git clone <URL_DEL_REPOSITORIO>
cd Continua2
```

### 2. Configurar la base de datos
- Crear una base de datos MySQL llamada `IPHONE_STORE`
- Actualizar las credenciales en `src/main/resources/application.properties`

### 3. Ejecutar el proyecto
```bash
mvn spring-boot:run
```

El proyecto estará disponible en: `http://localhost:8091/iphone-store/`

## 📊 Base de Datos

El proyecto utiliza las siguientes entidades principales:
- **Productos**: Gestión del catálogo de iPhones
- **Clientes**: Información de clientes
- **Proveedores**: Datos de proveedores
- **Pedidos**: Órdenes de compra
- **Usuarios**: Sistema de autenticación
- **Comprobantes**: Documentos de venta

## 🔐 Seguridad

- Autenticación basada en Spring Security
- Gestión de roles y permisos
- Sesiones seguras con cookies HTTP-only

## 📧 Configuración de Email

El sistema incluye funcionalidad de envío de emails configurada para Gmail SMTP.

## 🚀 Despliegue

### Railway
1. Conectar el repositorio de GitHub con Railway
2. Configurar las variables de entorno necesarias
3. El despliegue se realizará automáticamente

### Variables de Entorno para Producción
```
SPRING_DATASOURCE_URL=jdbc:mysql://[HOST]:[PORT]/[DATABASE]
SPRING_DATASOURCE_USERNAME=[USERNAME]
SPRING_DATASOURCE_PASSWORD=[PASSWORD]
SPRING_PROFILES_ACTIVE=prod
```

## 📝 Estructura del Proyecto

```
src/
├── main/
│   ├── java/
│   │   └── com/idat/continua2/demo/
│   │       ├── Controller/     # Controladores REST
│   │       ├── Service/        # Lógica de negocio
│   │       ├── Repository/     # Acceso a datos
│   │       ├── model/          # Entidades JPA
│   │       ├── config/         # Configuraciones
│   │       └── util/           # Utilidades
│   └── resources/
│       ├── static/             # Recursos estáticos
│       ├── templates/          # Plantillas Thymeleaf
│       └── application.properties
```

## 🤝 Contribuir

1. Fork el proyecto
2. Crear una rama para tu feature (`git checkout -b feature/AmazingFeature`)
3. Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abrir un Pull Request

## 📄 Licencia

Este proyecto está bajo la Licencia MIT - ver el archivo [LICENSE.md](LICENSE.md) para detalles.

## 👨‍💻 Autor

**Tu Nombre** - [GitHub](https://github.com/tu-usuario)

## 🙏 Agradecimientos

- Spring Boot Community
- IDAT - Instituto