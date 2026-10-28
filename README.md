# Android-Proyect-02 · Registro de Empleados

App Android de registro de empleados con dos pantallas, desarrollada con **Kotlin** y **Jetpack Compose**. El usuario completa un formulario, elige un área y pasa a una pantalla de resumen donde puede revisar los datos, volver para editarlos o guardarlos.

## Funcionalidades

- Formulario con campos de **Nombre**, **Apellido** y **Correo**
- Selección de **Área** (Sistemas, Marketing, RRHH) con `RadioButton`
- Navegación entre pantallas con **Navigation Compose**
- Datos compartidos entre pantallas mediante un **ViewModel**
- Pantalla de resumen con opciones para **Volver** (editar) y **Guardar** (confirmación con `Toast`)
- Splash screen e ícono personalizado

## Tecnologías

- Kotlin
- Jetpack Compose + Material 3
- Navigation Compose
- ViewModel (Android Architecture Components)
- Gradle Kotlin DSL + Version Catalog (`libs.versions.toml`)

## Estructura

```
app/src/main/java/com/demo/android/proyect02/
├── MainActivity.kt        # Punto de entrada y tema
├── AppNavigation.kt       # Rutas y NavHost
├── EmployeeViewModel.kt   # Estado compartido del formulario
├── EmployeeImage.kt       # Componente de imagen reutilizable
├── Screen1.kt             # Formulario de registro
├── Screen2.kt             # Resumen de datos
└── ui/theme/              # Colores, tipografía y tema
```

## Cómo ejecutarlo

1. Clona el repositorio:
   ```bash
   git clone https://github.com/Maaniaak07/Android-Proyect-02.git
   ```
2. Ábrelo en **Android Studio** y espera a que termine el Gradle Sync.
3. Ejecuta la app en un emulador o dispositivo (▶ Run).

## Autor

**Maaniaak07** · [GitHub](https://github.com/Maaniaak07)
