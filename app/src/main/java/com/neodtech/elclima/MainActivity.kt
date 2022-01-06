package com.neodtech.elclima


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.neodtech.elclima.ui.theme.ElclimaTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ElclimaTheme {
                // A surface container using the 'background' color from the theme
                Surface{
//                    WeatherPreview()
                }
            }
        }
    }
}




@Composable
fun Weather(
    viewModel: WeatherViewModel = hiltViewModel()
){
    Button(onClick = {
        viewModel.getWeather()

    }) {

    }
}


@Composable
fun WeatherPreview() {
    Weather()
}



