package com.example.returnapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.returnapp.databinding.ActivityChangeNameBinding

class ChangeNameActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityChangeNameBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent

        binding.editTextNovoNome.setText(i.getStringExtra("nome"))

        binding.buttonTrocarOk.setOnClickListener{
            i.putExtra("nome",binding.editTextNovoNome.text.toString())
            setResult(1,i)
            finish()
        }

    }
}