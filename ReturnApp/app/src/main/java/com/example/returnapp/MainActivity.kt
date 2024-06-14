package com.example.returnapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.returnapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    private lateinit var result: ActivityResultLauncher<Intent>

    private var nome=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonTrocarNome.setOnClickListener{
            val i = Intent(this,ChangeNameActivity::class.java)
            i.putExtra("nome",nome)
            result.launch(i)
        }

        result=registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            if(it.data != null && it.resultCode==1){
                nome = it.data?.getStringExtra("nome").toString()
                binding.textCumprimentar.text="Olá ${nome}"
            }
        }

    }
}