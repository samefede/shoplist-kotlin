package com.example.leatherbootsshop.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.leatherbootsshop.R

@Composable
fun ItemMenu(settingsText: String, ico: String, number: Int?, isSelected: Boolean, onClick: () -> Unit) {

    val icon = when (ico) {
        "circle" -> R.drawable.circle
        "triangle" -> R.drawable.triangle
        "square" -> R.drawable.square
        "pentagon" -> R.drawable.pentagon
        else -> {
            R.drawable.circle  // ico default
        }
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .background(
                color = if (isSelected) Color(0xFFFFDBCD) else Color.Transparent,
                shape = RoundedCornerShape(40.dp)
            )
            .padding(start = 16.dp, top = 16.dp, end = 24.dp, bottom = 16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = "Settings",
                modifier = Modifier
                    .size(width = 14.dp, height = 12.dp)
            )
            Text(
                text = settingsText,
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.W700,
                    lineHeight = 20.sp,
                    letterSpacing = 0.1.sp,
                    color = Color(0xFF52433E),
                    fontSize = 14.sp
                ),
                modifier = Modifier.weight(1f)
            )

            number?.let {
                Text(
                    text = it.toString(),
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontWeight = FontWeight.W500,
                        lineHeight = 20.sp,
                        letterSpacing = 0.1.sp,
                        color = Color(0xFF2C160D),
                        fontSize = 14.sp
                    )
                )
            }
        }
    }
}