# 📊 Analizador de Notas – Proyecto DAW  
**Java · Maven · Git · Línea de comandos**

## 🎯 Objetivo del proyecto

En este proyecto desarrollarás una **aplicación Java de consola** que analiza un fichero CSV con las notas de alumnos y muestra estadísticas.

Además, este proyecto tiene un segundo objetivo **igual de importante**:

> Aprender a trabajar con **Git y Maven** como se hace en proyectos reales.

No se trata solo de que el programa funcione, sino de **cómo se desarrolla**.

---

## 🧠 ¿Qué vas a aprender con este proyecto?

- Crear y ejecutar proyectos Java con **Maven**
- Entender la estructura estándar de un proyecto Maven
- Usar **Git y GitHub** para trabajar sobre un repositorio existente
- Implementar interfaces y clases abstractas
- Leer y procesar ficheros desde Java

---

## 📂 Formato del fichero CSV

El programa trabajará con ficheros CSV con el siguiente formato:

```
NombreAlumno,Nota1,Nota2,Nota3,...
```

Ejemplo:

```
Ana,7.5,8,6
Luis,4,5,6,7
Marta,9,8.5,9
```

---

## 🔧 ¿Qué es Maven y por qué se usa?
Maven es una herramienta que sirve para:

- Gestionar proyectos Java

- Compilar el código

- Ejecutar el programa

- Gestionar dependencias (librerías)

- Mantener una estructura estándar

En lugar de compilar “a mano”, Maven se encarga de todo siguiendo un archivo llamado pom.xml.

### 📁 Estructura típica de un proyecto Maven

proyecto
 ├─ src
 │  ├─ main
 │  │  └─ java
 │  └─ test
 │     └─ java
 ├─ pom.xml
 └─ README.md

- src/main/java → código de la aplicación

- src/test/java → tests (si los hay)

- pom.xml → configuración del proyecto

Más información:

- https://maven.apache.org/what-is-maven.html
- https://maven.apache.org/guides/getting-started/

---

## 🔀 Git y GitHub

Git es un sistema de control de versiones. Permite:

- Guardar el historial de cambios

- Trabajar de forma ordenada

- Volver atrás si algo se rompe

- Colaborar con otras personas

En este proyecto NO crearás el repositorio desde cero, sino que trabajarás sobre uno existente usando **fork**, **clone**, **commit** y **push**.

Guía oficial:
- https://docs.github.com/es/get-started/quickstart/fork-a-repo

### 1. Haz un fork del repositorio

Un fork es simplemente una copia de un repositorio de github a tu cuenta. Es el primer paso antes de contribuir en 
cualquier proyecto opensource de github.

[Más información.](https://docs.github.com/es/get-started/quickstart/fork-a-repo)

### 2. Clona tu repositorio

Deberás clonar tu fork en tu ordenador para poder empezar a trabajar en él:

    git clone git@github.com:<Tu Usuario>/notas-java

### 3. A trabajar

Tras clonar el repositorio podrás empezar a trabajar en tu proyecto

### 4. Acuerdate de ir guardando los cambios

Cada vez que implementes algo o simplemente para ir trackeando tu progreso debes guardar los cambios con git

    git add .
    git commit -m "<Mensaje del commit>"

Si quieres subir tus cambios a github puedes correr el siguiente comando:

    git push origin main

---

## 📌 Entrega

Se entregará el enlace al repositorio del fork en GitHub.
