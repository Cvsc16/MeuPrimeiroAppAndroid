package com.dev.caiovinicius.meuprimeiroappandroid

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dev.caiovinicius.meuprimeiroappandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        val tvMyFirstAndroidApp = findViewById<TextView>(R.id.tvMyFirstAndroidApp2)
//        with(tvMyFirstAndroidApp) {  //ERRO!
//            text = "Meu primeiro App Android!"
//            textAlignment = TextView.TEXT_ALIGNMENT_CENTER
//        }

        with(binding.tvMyFirstAndroidApp) {
            text = "Meu Primeiro App Android!"
            textAlignment = TextView.TEXT_ALIGNMENT_CENTER
        }

    }
}