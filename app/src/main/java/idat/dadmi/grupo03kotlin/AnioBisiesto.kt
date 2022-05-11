package idat.dadmi.grupo03kotlin

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import idat.dadmi.grupo03kotlin.databinding.ActivityAnioBisiestoBinding

class AnioBisiesto : AppCompatActivity(), View.OnClickListener {

    //Variable privada para definir el objeto binding
    private lateinit var binding:ActivityAnioBisiestoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnioBisiestoBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_anio_bisiesto)
        setContentView(binding.root)
        binding.btnConsultar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var anio = binding.txtAnio.text.toString().toInt();
        var respuesta:String="";
        var respuesta2:String="";
        if(anio != null) {
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 100 == 0)) {
                respuesta = "Si Año Bisiesto"
            } else {
                respuesta = "No es Año Bisiesto"
            }
        } else{
            respuesta2="Es Obligatorio Ingresar un Año"
        }
        binding.tvResultado.text="La respuesta es: $respuesta"
        binding.tvRespuestaFalse.text="=> $respuesta2"
        //Toast.makeText(applicationContext, "Si es $respuesta ", Toast.LENGTH_LONG).show()
    }
}