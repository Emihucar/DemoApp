# Proyecto de Automatización de Pruebas - My Demo App

Este proyecto tiene como objetivo la automatización de pruebas para la aplicación móvil **My Demo App**, utilizando **Cucumber**, **Serenity BDD** y **Appium**. Se implementan pruebas funcionales para validar el flujo de compra y las interacciones del usuario con la aplicación.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación utilizado para desarrollar las pruebas.
- **Appium**: Herramienta para la automatización de aplicaciones móviles.
- **Cucumber**: Framework para la escritura de pruebas en lenguaje natural (Gherkin).
- **Serenity BDD**: Biblioteca para la gestión de pruebas y generación de reportes.
- **JUnit**: Framework de pruebas unitarias para Java.

## Prácticas Implementadas

- **Automatización de Pruebas**: Se han creado pruebas automatizadas para verificar la correcta funcionalidad de la aplicación móvil.
- **Validación de Elementos**: Se valida la visibilidad y clicabilidad de los botones y otros elementos de la interfaz antes de interactuar con ellos, asegurando una mejor experiencia del usuario.
- **Experiencia del Usuario**: Se realizan pruebas para verificar que la carga de la aplicación es correcta y que los elementos de la interfaz se comportan como se espera.
- **Uso de Gherkin**: Los escenarios de prueba se escriben en lenguaje natural para facilitar la comprensión del comportamiento del sistema.
- **Pruebas de Regresión**: Se implementan pruebas para garantizar que nuevas funcionalidades no rompan el funcionamiento existente.
- **Control de Versiones con Git**: Todo el código está versionado utilizando Git y hospedado en GitHub.

## Procedimientos

1. **Instalación**:
   - Asegúrate de tener instalado Java JDK y Maven en tu máquina.
   - Clona el repositorio:
     ```bash
     git clone https://github.com/Emihucar/DemoApp
     ```
   - Navega al directorio del proyecto:
     ```bash
     cd Mobile
     ```

2. **Ejecución de Pruebas**:
   - Para ejecutar las pruebas, utiliza el siguiente comando:
     ```bash
     mvn clean verify
     ```
   - Esto compilará el proyecto y ejecutará las pruebas definidas.

3. **Generación de Reportes**:
   - Los reportes generados por Serenity se pueden encontrar en el directorio `target/site/serenity`para ver los resultados de las pruebas.

4. **Contribuciones**:
   - Si deseas contribuir al proyecto, siéntete libre de abrir un `issue` o enviar un `pull request`. Asegúrate de seguir las mejores prácticas de codificación.
## Capturas de Pantalla

![DEMO APP](6ada6a6912570cdf848cb17a15d134def79f2977154fedd4010f09fb79d188d3.png)