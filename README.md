# Registraduria de Personas Simple

Version basica de una registraduria para registrar y consultar personas.

## Detalle

| | |
|---|---|
| Tipo | Consola (MVC) |
| Archivos Java | 5 |
| Version de Java | 25 |
| Patron | Arquitectura MVC simplificada |

## Funcionalidades

- Registro de personas
- Consulta de personas registradas
- Menu de consola
- Modelo simple de dominio

## Estructura del proyecto

```
rapDeFernanfloo/
|-- pom.xml       configuracion de Maven, importable desde cualquier IDE
|-- src/          codigo fuente
`-- README.md
```

## Como ejecutarlo

### Con Maven

```bash
mvn clean compile
mvn exec:java
```

### Con javac directamente

```bash
# Linux / macOS
javac -d bin $(find src -name "*.java")

# Windows (PowerShell)
javac -d bin (Get-ChildItem -Recurse -Filter *.java src).FullName
```

```bash
java -cp bin co.edu.unbosque.controller.AplMain
```

### Desde un IDE

Cualquier IDE con soporte de Java (Eclipse, IntelliJ IDEA, VS Code o NetBeans)
puede importar el proyecto directamente como **proyecto Maven**. Basta con abrir
o importar la carpeta: el IDE detecta el `pom.xml`, resuelve las dependencias y
compila sin configuracion adicional.

## Autor

Desarrollado por [Sergio Parra](https://github.com/P2X4A) como parte de su
formacion en Java.

## Licencia

Ver el archivo [LICENSE](LICENSE).