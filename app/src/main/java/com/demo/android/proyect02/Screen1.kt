package com.demo.android.proyect02

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun Screen1(
    viewModel: EmployeeViewModel,
    onContinuar: () -> Unit
) {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ImagenEmpleado()

        Spacer(Modifier.height(8.dp))
        Text(
            text = "Registro empleado",
            color = Color(0xFFE53935),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(16.dp))

        TextField(
            value = viewModel.nombre,
            onValueChange = viewModel::onNombreChange,
            label = { Text("Nombre") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(8.dp))
        TextField(
            value = viewModel.apellido,
            onValueChange = viewModel::onApellidoChange,
            label = { Text("Apellido") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(8.dp))
        TextField(
            value = viewModel.correo,
            onValueChange = viewModel::onCorreoChange,
            label = { Text("Correo") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(Modifier.height(16.dp))
        Text("Área:", fontSize = 16.sp)

        Column {
            viewModel.areas.forEach { opcion ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.selectable(
                        selected = viewModel.area == opcion,
                        onClick = { viewModel.onAreaChange(opcion) }
                    )
                ) {
                    RadioButton(
                        selected = viewModel.area == opcion,
                        onClick = { viewModel.onAreaChange(opcion) }
                    )
                    Text(opcion)
                }
            }
        }

        Spacer(Modifier.height(16.dp))
        Button(onClick = {
            if (viewModel.formularioValido()) {
                onContinuar()
            } else {
                Toast.makeText(context, "Complete todos los campos", Toast.LENGTH_SHORT).show()
            }
        }) {
            Text("Continuar")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Screen1Preview() {
    val vm: EmployeeViewModel = viewModel()
    vm.onNombreChange("Juan")
    vm.onApellidoChange("Perez")
    vm.onCorreoChange("jperez@company.com")
    vm.onAreaChange("Marketing")
    Screen1(viewModel = vm, onContinuar = {})
}