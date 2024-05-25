package com.example.mathgame

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FirstPage(navController: NavController) {

    val systemUIController = rememberSystemUiController()
    systemUIController.setStatusBarColor(color = colorResource(id = R.color.dark_blue))

    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text(text = "CountingCraze Kids", fontSize = 24.sp, fontWeight = FontWeight.Bold) },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = colorResource(id = R.color.dark_blue),
                    titleContentColor = Color.White,
                )
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
                    .paint(painterResource(id = R.drawable.fourth), contentScale = ContentScale.FillBounds),
//                    .background(color = colorResource(id = R.color.pink)),

                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,

            ) {
                // First Button
                Button(
                    onClick = {
                              navController.navigate("Secondpage/add")
                    },
                    colors=ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.light_green)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier.size(200.dp, 90.dp )
                ) {
                    Text(
                        text = "Addition",
                        color = Color.Black,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold
                        )
                }
                // Second Button
                Button(
                    onClick = {
                        navController.navigate("Secondpage/sub")
                    },
                    colors=ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.light_green)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier.size(200.dp, 90.dp)
                ) {
                    Text(
                        text = "Subtraction",
                        color = Color.Black,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                // Third Button
                Button(
                    onClick = {
                        navController.navigate("Secondpage/multi")
                    },
                    colors=ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.light_green)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier.size(200.dp, 90.dp)
                ) {
                    Text(
                        text = "Multiplication",
                        color = Color.Black,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                // Forth Button
                Button(
                    onClick = {
                        navController.navigate("Secondpage/div")
                    },
                    colors=ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.light_green)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier.size(200.dp, 90.dp)
                ) {
                    Text(
                        text = "Division",
                        color = Color.Black,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    )
}

