package net.ezra.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SERVICES


@Composable
fun HomeScreen(navController: NavHostController) {
    LazyColumn (modifier = Modifier .fillMaxSize()){

        item {





            Icon(imageVector = Icons.Default.Menu, contentDescription = "" )
            Column(
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .padding(10.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally

                
                
                
            ){

                    Icon(imageVector = Icons.Default.Home, contentDescription = "")
                    Column (
                        modifier = Modifier
                            .background(Color.Cyan)

                            .fillMaxSize(),

                        horizontalAlignment = Alignment.CenterHorizontally
                    ){

                        Text(
                            modifier = Modifier


                                .clickable {
                                    navController.navigate(ROUTE_HOME) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                },

                            text = "",
                            textAlign = TextAlign.Right,
                            color = MaterialTheme.colorScheme.onSurface
                        )


                        Row{
                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Text(text = "", fontWeight = FontWeight.Light, color = Color.LightGray)
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(text = "SUPERNAL STUDIOS")




                            }


                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .wrapContentHeight()
                                    .padding(10.dp)
                                    .padding(top = 10.dp)

                            ){

                                Text(
                                    modifier = Modifier

                                        .clickable {
                                            navController.navigate(ROUTE_ABOUT) {
                                                popUpTo(ROUTE_HOME) { inclusive = true }
                                            }
                                        },
                                    text = "About",
                                    textAlign = TextAlign.Center,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                                Text(
                                    modifier = Modifier

                                        .clickable {
                                            navController.navigate(ROUTE_SERVICES) {
                                                popUpTo(ROUTE_HOME) { inclusive = true }
                                            }
                                        },
                                    text = "Services",
                                    textAlign = TextAlign.Center,
                                    color = MaterialTheme.colorScheme.onSurface
                                )




                            }

                        }

                    }}}







    }

            }















@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

