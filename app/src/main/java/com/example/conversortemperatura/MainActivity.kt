package com.example.conversortemperatura

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.conversortemperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    // variavel que vinvula main activit com o layout activit main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        //infla o layout .xml
        var view =binding.root

        //variavel para alocar o binding padrao

        setContentView(view)
        // adiciona o layout inflado no conteudo da visualizacao/ tela

        binding.buttonConv.setOnClickListener {
            //Ativa o click do botao
            converterTemp()
            //chamada de funcao
        }



    }
    fun converterTemp(){
    val  temperatura = binding.textEntrada.text.toString().toDouble()
        //variavel / captura informacao do ID / pega string e converte double que é casa decimal

    val gFahrenheit = (temperatura * 1.8) + 32
    val gKelvin  = temperatura + 273
    val cC = temperatura
    val fahrenheitG = (temperatura - 32) / 1.8
    val kelvinG = (temperatura + 459.67) * 5 / 9
    val fF = temperatura
    val kelvinC = temperatura - 273
    val kelvinF = ((temperatura - 273) * 9 / 5 ) + 32
    val kelvinK = temperatura

        when {
            binding.butonC1.isChecked && binding.buttonF2.isChecked ->
                binding.textResultado.setText(".2f".format(gFahrenheit))
            binding.butonC1.isChecked && binding.buttonK2.isChecked ->
                binding.textResultado.setText(".%2".format(gKelvin))
            binding.butonC1.isChecked && binding.buttonC2.isChecked ->
                binding.textResultado.setText(".2f".format(cC))
            binding.buttonF1.isChecked && binding.buttonC2.isChecked ->
                binding.textResultado.setText(".%2".format(fahrenheitG))
            binding.buttonF1.isChecked && binding.buttonK2.isChecked ->
                binding.textResultado.setText(".%2".format(kelvinG))
            binding.buttonF1.isChecked && binding.buttonF2.isChecked ->
                binding.textResultado.setText(".%2".format(fF))
            binding.buttonK1.isChecked && binding.buttonC2.isChecked ->
                binding.textResultado.setText(".%2".format(kelvinC))
            binding.buttonK1.isChecked && binding.buttonF2.isChecked ->
                binding.textResultado.setText(".%2".format(kelvinF))
            binding.buttonK1.isChecked && binding.buttonK2.isChecked ->
                binding.textResultado.setText(".%2".format(kelvinK))
        }
    }
}

