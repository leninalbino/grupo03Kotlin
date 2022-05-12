package idat.dadmi.grupo03kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import idat.dadmi.grupo03kotlin.databinding.ActivityNumeroPerfectoBinding

class NumeroPerfecto : AppCompatActivity(), View.OnClickListener {
    //Variable privada para definir el objeto binding
    private lateinit var binding: ActivityNumeroPerfectoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNumeroPerfectoBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_numero_perfecto)
        setContentView(binding.root)
        binding.btnPerfecto.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var arrayADapter:ArrayAdapter<*>
        val  tvLista = findViewById<ListView>(R.id.tvLista)
        var numero=binding.txtNumero.text.toString();
        var resultado:Int;
        var suma=0;
        var resultado1:MutableList<String> = ArrayList()
        if(numero==""){
            resultado1.add("Eror, Debes ingresar un numero");
            arrayADapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,resultado1)
            tvLista.adapter = arrayADapter;
        }
        else{
            for (i in 1..numero.toInt()-1){
                resultado=numero.toInt()%i
                if(resultado==0) {
                    suma = suma + i
                    resultado1.add("$i => No es un numero Perfecto");
                    arrayADapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,resultado1)
                    tvLista.adapter = arrayADapter;

                }
            }
            if(suma==numero.toInt()){
                resultado1.add("numero perfecto => $numero");
            }
            else{
                resultado1.add("no es perfecto => $numero");
            }
        }


    }
}


