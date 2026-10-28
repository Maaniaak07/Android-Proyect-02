package com.demo.android.proyect02

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

object Rutas {
    const val SCREEN1 = "screen1"
    const val SCREEN2 = "screen2"
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    val employeeViewModel: EmployeeViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = Rutas.SCREEN1
    ) {
        composable(Rutas.SCREEN1) {
            Screen1(
                viewModel = employeeViewModel,
                onContinuar = { navController.navigate(Rutas.SCREEN2) }
            )
        }
        composable(Rutas.SCREEN2) {
            Screen2(
                viewModel = employeeViewModel,
                onVolver = { navController.popBackStack() }
            )
        }
    }
}