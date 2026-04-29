package com.fic.mobile_app_base_compose.ui.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource 
import androidx.compose.ui.res.stringResource   
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fic.mobile_app_base_compose.R @Composable
fun HomeScreen() {
    val lukeGreen = Color(0xFF00E676)
    val obiWanBlue = Color(0xFF00B0FF)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(dimensionResource(id = R.dimen.padding_main)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = stringResource(id = R.string.hello_there),
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacer_medium)))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = stringResource(id = R.string.jedi_icon_desc),
                tint = obiWanBlue,
                modifier = Modifier.size(dimensionResource(id = R.dimen.jedi_icon_display))
            )

            Spacer(modifier = Modifier.width(dimensionResource(id = R.dimen.spacer_small)))

            Text(
                text = stringResource(id = R.string.general_kenobi),
                color = Color.Magenta,
                fontSize = dimensionResource(id = R.dimen.font_kenobi).value.sp,
                style = MaterialTheme.typography.headlineMedium
            )
        }

        Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacer_large)))

        Button(
            onClick = { println("I have the High Ground") },
            modifier = Modifier.fillMaxWidth(0.8f),
            colors = ButtonDefaults.buttonColors(
                containerColor = lukeGreen,
                contentColor = Color.Black
            )
        ) {
            Text(text = stringResource(id = R.string.high_ground))
        }
    }
}