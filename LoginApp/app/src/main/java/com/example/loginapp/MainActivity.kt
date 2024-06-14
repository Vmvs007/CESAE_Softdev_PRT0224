package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.loginapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener{

            var usernameInserido = binding.editTextUsername.text.toString()
            var passwordInserida = binding.editTextPassword.text.toString()

            if(passwordInserida == "pass"){ // Login válido

                // Redirecionar para LoginOk
                val intent = Intent(this,LoginOkActivity::class.java)

                intent.putExtra("nomeUser",usernameInserido)

                startActivity(intent)

            }else{ // Login inválido

                // Redirecionar para LoginErrado
                val intent = Intent(this,LoginErradoActivity::class.java)
                startActivity(intent)

            }

        }

    }
}