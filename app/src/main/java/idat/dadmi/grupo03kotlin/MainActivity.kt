package idat.dadmi.grupo03kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn02 = findViewById<Button>(R.id.btn02)
        btn02.setOnClickListener {
            val intento2 = Intent(this, AnioBisiesto::class.java)
            startActivity(intento2)
        }
        val btn04 = findViewById<Button>(R.id.btn04)
        btn04.setOnClickListener {
            val intento4 = Intent(this, NumeroPerfecto::class.java)
            startActivity(intento4)

            val btn03 = findViewById<Button>(R.id.btn03)
            btn03.setOnClickListener {
                val intent3 = Intent(this, PromedioAlumno::class.java)
                startActivity(intent3)
            }
        }
    }
}