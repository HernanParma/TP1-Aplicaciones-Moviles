# Aplicaciones Móviles - Laboratorios 1 y 2

Proyecto desarrollado en Android Studio utilizando Kotlin, implementando los conceptos fundamentales de desarrollo nativo. Este repositorio contiene la evolución completa del trabajo práctico, habiéndose commiteado los avances del Laboratorio 2 sobre la base del Trabajo Práctico 1.

## 🚀 Logros Obtenidos

### Laboratorio 1: El taller y el primer proyecto (`HolaYo`)
* Configuración inicial del entorno de desarrollo en Android Studio.
* Creación de la estructura base del proyecto bajo el modelo tradicional (*Empty Views Activity*).
* Implementación de un modelo de datos en Kotlin y lógica de presentación con manejo de nulos (`?` y operador `?:`).
* Diseño de interfaz en XML y ejecución exitosa en emulador y dispositivo físico.

### Laboratorio 2: Una pantalla que vive y muere
* **Navegación entre pantallas:** Creación de una segunda Activity (`SegundaActivity`) y comunicación mediante Intents explícitos enviando datos ("equipaje").
* **Ciclo de vida:** Instrumentación de los métodos de ciclo de vida (`onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onDestroy`) con registros personalizados (`Log.d`) visualizados en Logcat.
* **Control de estado y rotación:** Experimentación con la destrucción y recreación de actividades ante cambios de configuración (giro de pantalla), diferenciando la pérdida de variables de instancia frente al auto-guardado de estado en vistas con ID.
* **Muerte por memoria:** Simulación de interrupciones del sistema y gestión del comportamiento en segundo plano.

---
* **Desarrollado por:** Hernán Parma  
* **Compilado y APK disponible:** Incluido en la carpeta APK.
