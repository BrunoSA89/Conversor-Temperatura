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
        
    }
}

