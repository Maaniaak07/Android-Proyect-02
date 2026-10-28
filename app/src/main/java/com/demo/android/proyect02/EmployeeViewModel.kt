package com.demo.android.proyect02

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class EmployeeViewModel : ViewModel() {

    // Variables globales
    var nombre by mutableStateOf("")
        private set
    var apellido by mutableStateOf("")
        private set
    var correo by mutableStateOf("")
        private set
    var area by mutableStateOf("Sistemas")
        private set

    val areas = listOf("Sistemas", "Marketing", "RRHH")

    fun onNombreChange(valor: String) { nombre = valor }
    fun onApellidoChange(valor: String) { apellido = valor }
    fun onCorreoChange(valor: String) { correo = valor }
    fun onAreaChange(valor: String) { area = valor }

    fun formularioValido(): Boolean =
        nombre.isNotBlank() && apellido.isNotBlank() && correo.isNotBlank()
}