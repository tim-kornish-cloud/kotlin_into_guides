package com.example.buttonstesting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.buttonstesting.ui.theme.ButtonsTestingTheme
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: Button = findViewById(R.id.my_button)

        // Set the click listener using a lambda expression
        myButton.setOnClickListener {
            // Code to execute when the button is clicked
            Toast.makeText(this, "Button was clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}

@Composable
fun MyButtonScreen() {
    // A Button composable function
    Button(onClick = {
        // Code to execute when the button is clicked
        println("Button clicked!")
    }) {
        Text(text = "Click Me (Compose)")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyButton() {
    MyButtonScreen()
}


