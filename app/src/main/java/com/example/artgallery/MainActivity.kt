package com.example.artgallery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artgallery.ui.theme.ArtGalleryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtGalleryTheme {
                // A surface container using the 'background' color from the theme {
                    AppArtGallery()
                }
            }
        }
    }

@Preview
@Composable
fun AppArtGallery(
) {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        var tela by remember { mutableStateOf(1) }

        when (tela) {

            1 -> AppContent(
                idTextTitle = R.string.title_noite,
                idTextDesc = R.string.desc_noite,
                painter = painterResource(id = R.drawable.obraanoiteestrelada),
                onClickProximo = {tela++},
                onClickAnterior = {tela--}

            )

            2 -> AppContent(
                idTextTitle = R.string.title_retrato,
                idTextDesc = R.string.desc_retrato,
                painter = painterResource(id = R.drawable.obraautoretrato),
                onClickProximo = {tela++},
                onClickAnterior = {tela--}
            )

            3 -> AppContent(
                idTextTitle = R.string.title_girassois,
                idTextDesc = R.string.desc_girassois,
                painter = painterResource(id = R.drawable.obraosgirassois),
                onClickProximo = {tela++},
                onClickAnterior = {tela--}
            )

            4 -> AppContent(
                idTextTitle = R.string.desc_cortados,
                idTextDesc = R.string.desc_cortados,
                painter = painterResource(id = R.drawable.obradoisgirassoiscortados),
                onClickProximo = {tela++},
                onClickAnterior = {tela--}
            )

            5 -> AppContent(
                idTextTitle = R.string.title_caveira,
                idTextDesc = R.string.desc_caveira,
                painter = painterResource(id = R.drawable.obracaveiracomcigarroaceso),
                onClickProximo = {tela++},
                onClickAnterior = {tela--}
            )

        }
    }
}
@Composable
fun AppContent (
    idTextTitle: Int,
    idTextDesc: Int,
    painter: Painter,
    modifier: Modifier = Modifier,
    onClickProximo:()->Unit,
    onClickAnterior:()->Unit
) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
                .border(
                    width = (1.dp),
                    color = Color(0, 0, 0),
                    RoundedCornerShape(2.dp)
                )
        )

        Column() {
            Text(
                text = stringResource(id = idTextTitle),
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                color = Color(0, 0, 0),
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Normal
            )
            Text(
                text = stringResource(id = idTextDesc),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                color = Color(0, 0, 0),
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraLight
            )
        }

        Row() {
            
            Button(
                onClick = onClickAnterior
            ) {
                Text(
                    text = stringResource(id = R.string.botao_retroceder),
                    color = Color(0, 0, 0),
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Normal
                )
            }
            
            Button(
                onClick = onClickProximo
            
            ) {
                Text(
                    text = stringResource(id = R.string.botao_avancar),
                    color = Color(0, 0, 0),
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Normal
                )
            }
        }
    }
}