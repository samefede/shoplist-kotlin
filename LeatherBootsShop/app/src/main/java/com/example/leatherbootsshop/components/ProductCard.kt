package com.example.leatherbootsshop.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.leatherbootsshop.R
import com.example.leatherbootsshop.models.Boot
import com.example.leatherbootsshop.models.FavoritesViewModel

@Composable
fun ProductCard(boot: Boot, favoritesViewModel: FavoritesViewModel = viewModel()) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(480.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(6.dp),
        colors = CardDefaults.cardColors(containerColor =  Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // Imagen
            Image(
                painter = painterResource(id = R.drawable.bota),
                contentDescription = "Product Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(260.dp)
                    .clip(RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp))
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(16.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                // Título
                Column {
                    Text(
                        text = boot.name,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                    )

                    // Precio
                    Text(
                        text = boot.price.toString() + " $",
                        fontWeight = FontWeight(400),
                        fontSize = 14.sp,
                        color = Color.Gray,
                    )
                }

                // Descripción
                Text(
                    text = boot.description,
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF52433E),
                    modifier = Modifier.padding(vertical = 16.dp)
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Botones
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = { favoritesViewModel.addToFavorites(boot) },
                        shape = RoundedCornerShape(50),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = Color(0xFF9A4521)
                        ),
                        border = BorderStroke(1.dp, Color(0xFF9A4521)),
                        modifier = Modifier.padding(4.dp)
                    ) {
                        Text(text = "Add to Favourite")
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Button(
                        onClick = { /* Acción para comprar */ },
                        shape = RoundedCornerShape(50),
                        border = BorderStroke(1.dp, Color(0xFF9A4521)),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF9A4521),
                            contentColor = Color.White
                        ),
                        modifier = Modifier.height(40.dp)
                    ) {
                        Text(text = "Buy")
                    }
                }
            }
        }
    }
}