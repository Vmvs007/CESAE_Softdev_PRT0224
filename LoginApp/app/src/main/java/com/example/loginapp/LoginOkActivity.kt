package com.example.loginapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.loginapp.databinding.ActivityLoginOkBinding

class LoginOkActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginOkBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent

        val  nome = i.extras?.getString("nomeUser")

        binding.textLoginOk.text="Bem-Vind@ $nome"

    }
}