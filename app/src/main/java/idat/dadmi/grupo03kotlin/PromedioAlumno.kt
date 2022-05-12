package idat.dadmi.grupo03kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import idat.dadmi.grupo03kotlin.databinding.ActivityPromedioAlumnoBinding

class PromedioAlumno : AppCompatActivity(), View.OnClickListener {

    // definimo el objeto binding
    private lateinit var binding : ActivityPromedioAlumnoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPromedioAlumnoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btncalcularpromedio.setOnClickListener (this )
    }
    override fun onClick(p0: View?) {
        var calificacion1 =binding.edtnota1.text.toString().toDouble()
        var calificacion2 = binding.edtnota2.text.toString().toDouble()
        var calificacion3= binding.edtnota3.text.toString().toDouble()

        var promedio = (calificacion1+ calificacion2+ calificacion3)/3


        var resultadoPromedio: String
        if(promedio >=70){
            resultadoPromedio = "Alumno aprueba el curso"
        }else{
            resultadoPromedio = "Alumno reprueba el curso"
        }
        binding.txtresultado.setText( "PROMEDIO = "+Math.round(promedio) +" => " +resultadoPromedio)

        //Toast.makeText(applicationContext, "Calcular Promedio", Toast.LENGTH_LONG).show()


    }
}