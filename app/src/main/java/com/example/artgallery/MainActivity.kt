package com.example.artgallery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
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
fun AppArtGallery(){

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White)
     {
        var tela by remember { mutableStateOf(1) }

        when (tela) {

            1 -> AppContent(
                idTextPrincipal = R.string.title_principal,
                idTextTitle = R.string.title_noite,
                idTextDesc = R.string.desc_noite,
                painter = painterResource(id = R.drawable.obraanoiteestrelada),
                onClickProximo = {
                    if (tela < 8)
                        tela++
                },
                onClickAnterior = {
                    if (tela > 1)
                        tela--
                }

            )

            2 -> AppContent(
                idTextPrincipal = R.string.title_principal,
                idTextTitle = R.string.title_retrato,
                idTextDesc = R.string.desc_retrato,
                painter = painterResource(id = R.drawable.obraautoretrato),
                onClickProximo = {
                    if (tela < 8)
                        tela++
                },
                onClickAnterior = {
                    if (tela > 1)
                        tela--
                }
            )

            3 -> AppContent(
                idTextPrincipal = R.string.title_principal,
                idTextTitle = R.string.title_girassois,
                idTextDesc = R.string.desc_girassois,
                painter = painterResource(id = R.drawable.obraosgirassois),
                onClickProximo = {
                    if (tela < 8)
                        tela++
                },
                onClickAnterior = {
                    if (tela > 1)
                        tela--
                }
            )

            4 -> AppContent(
                idTextPrincipal = R.string.title_principal,
                idTextTitle = R.string.title_cortados,
                idTextDesc = R.string.desc_cortados,
                painter = painterResource(id = R.drawable.obradoisgirassoiscortados),
                onClickProximo = {
                    if (tela < 8)
                        tela++
                },
                onClickAnterior = {
                    if (tela > 1)
                        tela--
                }
            )

            5 -> AppContent(
                idTextPrincipal = R.string.title_principal,
                idTextTitle = R.string.title_caveira,
                idTextDesc = R.string.desc_caveira,
                painter = painterResource(id = R.drawable.obracaveiracomcigarroaceso),
                onClickProximo = {
                    if (tela < 8)
                        tela++
                },
                onClickAnterior = {
                    if (tela > 1)
                        tela--
                }
            )

            6 -> AppContent(
                idTextPrincipal = R.string.title_principal,
                idTextTitle = R.string.title_amendoeira,
                idTextDesc = R.string.desc_amendoeira,
                painter = painterResource(id = R.drawable.obraamendoeira),
                onClickProximo = {
                    if (tela < 8)
                        tela++
                },
                onClickAnterior = {
                    if (tela > 1)
                        tela--
                }
            )

            7 -> AppContent(
                idTextPrincipal = R.string.title_principal,
                idTextTitle = R.string.title_lirios,
                idTextDesc = R.string.desc_lirios,
                painter = painterResource(id = R.drawable.obralirios),
                onClickProximo = {
                    if (tela < 8)
                        tela++
                },
                onClickAnterior = {
                    if (tela > 1)
                        tela--
                }
            )

            8 -> AppContent(
                idTextPrincipal = R.string.title_principal,
                idTextTitle = R.string.title_terraco,
                idTextDesc = R.string.desc_terraco,
                painter = painterResource(id = R.drawable.obraterraco),
                onClickProximo = {
                    if (tela < 8)
                        tela++
                },
                onClickAnterior = {
                    if (tela > 1)
                        tela--
                }
            )
        }
    }
}
@Composable
fun AppContent (
    idTextPrincipal: Int,
    idTextTitle: Int,
    idTextDesc: Int,
    painter: Painter,
    onClickProximo:()->Unit,
    onClickAnterior:()->Unit
) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(60.dp)
    ) {
            Card(
                shape = RoundedCornerShape(4.dp),
                colors = CardDefaults.cardColors(Color(255,255,255)),
                elevation = CardDefaults.cardElevation(4.dp),
                border = BorderStroke(2.dp, Color(255,255,255)),
                modifier = Modifier.padding(top = 20.dp))

            {

                Text(
                    text = stringResource(id = idTextPrincipal),
                    textAlign = TextAlign.Center,
                    lineHeight = 1.em,
                    fontSize = 40.sp,
                    color = Color(0, 0, 0),
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Normal,

                    )
            }

            Card(
                shape = RoundedCornerShape(4.dp),
                colors = CardDefaults.cardColors(Color(255,255,255)),
                elevation = CardDefaults.cardElevation(4.dp),
                border = BorderStroke(2.dp, Color(255,255,255)),
                modifier = Modifier.padding(top = 20.dp)
                ) {

                Image(
                    painter = painter,
                    contentDescription = null,
                    modifier = Modifier
                        .size(300.dp)
                        .padding(10.dp)

                )
        }

        Card(
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(Color(255,255,255)),
            elevation = CardDefaults.cardElevation(4.dp),
            border = BorderStroke(2.dp, Color(255,255,255)),
            modifier = Modifier.padding(top = 20.dp))

        {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(30.dp)) {
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
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            
            Button(
                onClick = onClickAnterior,
                shape = RoundedCornerShape(4.dp),
                colors = ButtonDefaults.buttonColors(Color(255,255,255)),
                elevation = ButtonDefaults.buttonElevation(4.dp),
                border = BorderStroke(2.dp, Color(255,255,255))
            ) {
                Text(
                    text = stringResource(id = R.string.botao_retroceder),
                    color = Color(0, 0, 0),
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Normal
                )
            }
            
            Button(
                onClick = onClickProximo,
                shape = RoundedCornerShape(4.dp),
                colors = ButtonDefaults.buttonColors(Color(255,255,255)),
                elevation = ButtonDefaults.buttonElevation(4.dp),
                border = BorderStroke(2.dp, Color(255,255,255))
            
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