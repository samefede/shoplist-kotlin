package com.example.leatherbootsshop.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.leatherbootsshop.R
import com.example.leatherbootsshop.models.Boot

@Composable
fun Favourite(boot: Boot) {
    Box(
        modifier = Modifier
            .background(Color(0xFFFCFCFC), shape = RoundedCornerShape(12.dp))
            .fillMaxWidth()
            .height(80.dp)
    ) {
        Row (
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Row (
                modifier = Modifier
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .background(Color(0xFF9A4521), shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = boot.id.toString(),
                        color = Color(0xFFFCFCFC),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.W500,
                        fontFamily = FontFamily(Font(R.font.roboto_regular))
                    )
                }

                Column() {
                    Box(
                        modifier = Modifier.height(24.dp), // Altura del contenedor
                        contentAlignment = Alignment.Center // Centrar el texto
                    ) {
                        Text(
                            text = boot.name,
                            color = Color(0xFF201A18),
                            fontWeight = FontWeight.W500,
                            style = TextStyle(
                                fontSize = 16.sp,
                                lineHeight = 24.sp,
                                letterSpacing = 0.1.sp
                            ),
                            fontFamily = FontFamily(Font(R.font.roboto_regular))
                        )
                    }

                    Box(
                        modifier = Modifier.height(24.dp), // Altura del contenedor
                        contentAlignment = Alignment.Center // Centrar el texto
                    ) {
                        Text(
                            text = boot.price.toString() + " $",
                            color = Color(0xFF52433E),
                            fontWeight = FontWeight.W400,
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                letterSpacing = 0.25.sp
                            ),
                            fontFamily = FontFamily(Font(R.font.roboto_regular))
                        )
                    }
                }
            }

        }

        Image(
            painter = painterResource(R.drawable.bota),
            contentDescription = "Bota",
            modifier = Modifier
                .fillMaxHeight()
                .width(80.dp)
                .align(Alignment.CenterEnd)
                .clip(RoundedCornerShape(topEnd = 12.dp, bottomEnd = 12.dp)),
            contentScale = ContentScale.Crop
        )
    }
    Spacer(modifier = Modifier.height(16.dp))
}