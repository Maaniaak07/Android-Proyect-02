package com.demo.android.proyect02

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ImagenEmpleado(
    modifier: Modifier = Modifier,
    tamano: Dp = 160.dp
) {
    Image(
        painter = painterResource(id = R.drawable.empleado),
        contentDescription = "Imagen del empleado",
        contentScale = ContentScale.Crop,
        modifier = modifier.size(tamano)
    )
}

@Preview(showBackground = true)
@Composable
fun ImagenEmpleadoPreview() {
    ImagenEmpleado()
}