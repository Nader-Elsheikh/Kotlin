package com.example.unitconverter

import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unitconverter.ui.theme.UnitConverterTheme
import kotlin.math.roundToInt

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Converter()
                }
            }
        }
    }
}

@Composable
fun Converter(){

    var iValue by remember { mutableStateOf("") }
    var oValue by remember { mutableStateOf("") }
    var iUnit by remember { mutableStateOf("Meter") }
    var oUnit by remember { mutableStateOf("Meter") }
    var iExpanded by remember { mutableStateOf(false) }
    var oExpanded by remember { mutableStateOf(false) }
    val ConversionFactor = remember { mutableStateOf(1.0) }
    val oConversionFactor = remember { mutableStateOf(1.0) }

    val cTextStyle = TextStyle(
        fontFamily = FontFamily.Serif, // Replace with your desired font family
        fontSize = 20.sp, // Replace with your desired font size
        color = Color.Red, // Replace with your desired text color
        fontWeight = FontWeight.Bold
    )

    // ?: elvis operator
    fun con (){
        val finalV = iValue.toDoubleOrNull() ?: 0.0
        val result = ( finalV * ConversionFactor.value * 100 / oConversionFactor.value).roundToInt() /100
        oValue = result.toString()
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = "Unit Converter",
            style = cTextStyle
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = iValue,
            onValueChange ={
                iValue=it
                con()
                           },
            label = { Text(text = "Enter Value")}

        )
        Spacer(modifier = Modifier.height(16.dp))

        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.Center
        ) {
        Box{
            // Input button
            Button(onClick = { iExpanded=true }) {
                Text(text = iUnit)
                Icon(Icons.Default.ArrowDropDown,
                    contentDescription = "")
            }
            DropdownMenu(expanded =iExpanded, onDismissRequest = { iExpanded=false }) {
                DropdownMenuItem(text = {
                    Text(text = "Milimeter")
                }, onClick = {
                    iExpanded=false
                    iUnit="Milimeter"
                    ConversionFactor.value=0.001
                    con()
                })

                DropdownMenuItem(text = {
                    Text(text = "Centimeter")
                }, onClick = {
                    iExpanded=false
                    iUnit="Centimeter"
                    ConversionFactor.value=0.01
                    con()
                })

                DropdownMenuItem(text = {
                    Text(text = "Meter")
                }, onClick = {
                    iExpanded=false
                    iUnit="Meter"
                    ConversionFactor.value=1.0
                    con()
                })

                DropdownMenuItem(text = {
                    Text(text = "Feet")
                }, onClick = {
                    iExpanded=false
                    iUnit="Feet"
                    ConversionFactor.value=0.3048
                    con()
                })

                DropdownMenuItem(text = {
                    Text(text = "Kilo Meter")
                }, onClick = {
                    iExpanded=false
                    iUnit="Kilo Meter"
                    ConversionFactor.value=1000.0
                    con()
                })

            }
        }



        Spacer(modifier = Modifier.width(16.dp))
        Box {
            // Output button
            Button(onClick = { oExpanded=true }) {
                Text(text = oUnit)
                Icon(Icons.Default.ArrowDropDown,
                    contentDescription = "")
            }
            DropdownMenu(expanded =oExpanded, onDismissRequest = { oExpanded=false }) {
                DropdownMenuItem(text = {
                    Text(text = "Milimeter")
                }, onClick = {
                    oExpanded=false
                    oUnit="Milimeter"
                    oConversionFactor.value=0.001
                    con()
                })

                DropdownMenuItem(text = {
                    Text(text = "Centimeter")
                }, onClick = {
                    oExpanded=false
                    oUnit="Centimeter"
                    oConversionFactor.value=0.01
                    con()
                })

                DropdownMenuItem(text = {
                    Text(text = "Meter")
                }, onClick = {
                    oExpanded=false
                    oUnit="Milimeter"
                    oConversionFactor.value=1.0
                    con()
                })

                DropdownMenuItem(text = {
                    Text(text = "Feet")
                }, onClick = {
                    oExpanded=false
                    oUnit="Feet"
                    oConversionFactor.value=0.3048
                    con()
                })

                DropdownMenuItem(text = {
                    Text(text = "Kilo Meter")
                }, onClick = {
                    oExpanded=false
                    oUnit="Kilo Meter"
                    oConversionFactor.value=1000.0
                    con()
                })

            }
        }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Result: $oValue  $oUnit" ,
            style = cTextStyle)
    }
}

@Preview(showBackground = true)
@Composable
fun ConverterPreview(){
    Converter()
}