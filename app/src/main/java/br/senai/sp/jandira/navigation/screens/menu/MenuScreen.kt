package br.senai.sp.jandira.navigation.screens.menu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun MenuScreen(navController: NavHostController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan)
            .padding(top = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(fontSize = 20.sp,
                text = "Menu",
                color = Color.White
            )

            Spacer(modifier = Modifier.size(30.dp))

            Button(
                modifier = Modifier
                    .width(100.dp)
                    .height(40.dp),
                onClick = { navController.navigate("perfil") }, colors = ButtonDefaults.buttonColors(Color.Gray)
            ) {
                Text(text = "Perfil", textAlign = TextAlign.Center)
            }
            Spacer(modifier = Modifier.size(10.dp))
            Button(
                modifier = Modifier
                    .width(100.dp)
                    .height(40.dp),
                onClick = {navController.navigate("pedido")}, colors = ButtonDefaults.buttonColors(Color.Gray)
            ) {
                Text(text = "Pedidos", textAlign = TextAlign.Center)
            }
            Spacer(modifier = Modifier.size(10.dp))
            Button(
                modifier = Modifier
                    .width(100.dp)
                    .height(40.dp),
                onClick = {navController.navigate("login")}, colors = ButtonDefaults.buttonColors(Color.Gray)
            ) {
                Text(text = "Sair", textAlign = TextAlign.Center)
            }

        }
    }
}