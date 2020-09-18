package br.com.pitagoras.opennewactivity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_asware.*

class AnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asware)

        val name = intent.getStringExtra("meu_nome")
        textView2.text = name

        Log.e("FGV", "$name")
    }
}