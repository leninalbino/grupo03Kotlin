package idat.dadmi.grupo03kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import idat.dadmi.grupo03kotlin.databinding.ActivityDescuentoProductosBinding

class DescuentoProductos : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding:ActivityDescuentoProductosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDescuentoProductosBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_descuento_productos)
        setContentView(binding.root)
        binding.btncalcular.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var articulo = binding.txtarticulo.text.toString().toInt()
        var monto = binding.txtmontototal.text.toString().toDouble()
        var totalpagar : Double=0.0
        var totalpagar2 : Double=0.0
        var montotal : String="";
        if(articulo > 20){
            totalpagar = monto - (monto * 0.10)
            montotal = "El total a pagar por haber comprado $articulo articulos es de S/. $totalpagar"

        }
        if (articulo <= 20 || articulo >=10){
            totalpagar2 = monto - (monto * 0.05)
            montotal = "El total a pagar por haber comprado $articulo articulos es de S/. $totalpagar2"

        }
        if (articulo < 10){

            montotal = "La compra no tiene descuento por haber comprado $articulo articulos y el monto a pagar es S/. $monto"

        }

        //Toast.makeText(applicationContext, "Calcular", Toast.LENGTH_LONG).show()
        binding.tvresultado.text = "$montotal "
    }
}