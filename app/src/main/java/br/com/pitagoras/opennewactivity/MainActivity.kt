package br.com.pitagoras.opennewactivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Aqui é criada a ação do botton
        btn_enviar.setOnClickListener {
            sentMessage()
        }
    }

    private fun sentMessage() {
        val name =
            editTextTextPersonName2.text.toString() // Aqui estava o erro, faltou o toString :) -> Type inference
        if (name.isNotEmpty()) {
            Log.e("FGV", "$name")
            val intent = Intent(this@MainActivity, AnswerActivity::class.java).apply {
                putExtra("meu_nome", name)
            }
            startActivity(intent)
        } else {
            Toast.makeText(
                this,
                "Favor preencher o campo de nome",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}