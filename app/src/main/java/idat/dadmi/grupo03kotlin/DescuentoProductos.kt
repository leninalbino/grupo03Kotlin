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
        var articulo = binding.txtarticulo.toString().toInt()
        var monto = binding.txtmontototal.toString().toDouble()
        //var totalpagar : Double=0.0
        //var totalpagar2 : Double=0.0
        //var montotal : String="";

        //Toast.makeText(applicationContext, "Calcular", Toast.LENGTH_LONG).show()
        binding.tvresultado.text = "$articulo "
    }
}