package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.loginapp.databinding.ActivityLoginErradoBinding

class LoginErradoActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginErradoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Toast.makeText(applicationContext, "LOGIN ERRADO", Toast.LENGTH_LONG).show()


        binding.buttonVoltar.setOnClickListener{
            // Voltar para a Main Activity

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }

    }
}