package com.demo.android.proyect02

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun Screen2(
    viewModel: EmployeeViewModel,
    onVolver: () -> Unit
) {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ImagenEmpleado()
        Spacer(Modifier.height(16.dp))

        Text("Nombre: ${viewModel.nombre}", fontSize = 18.sp)
        Text("Apellido: ${viewModel.apellido}", fontSize = 18.sp)
        Text("Correo: ${viewModel.correo}", fontSize = 18.sp)
        Text("Área: ${viewModel.area}", fontSize = 18.sp)

        Spacer(Modifier.height(16.dp))
        Button(onClick = onVolver) {
            Text("Volver")
        }
        Spacer(Modifier.height(8.dp))
        Button(onClick = {
            Toast.makeText(
                context,
                "Información guardada correctamente",
                Toast.LENGTH_SHORT
            ).show()
        }) {
            Text("Guardar")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Screen2Preview() {
    val vm: EmployeeViewModel = viewModel()
    vm.onNombreChange("Juan")
    vm.onApellidoChange("Perez")
    vm.onCorreoChange("jperez@company.com")
    vm.onAreaChange("Marketing")
    Screen2(viewModel = vm, onVolver = {})
}