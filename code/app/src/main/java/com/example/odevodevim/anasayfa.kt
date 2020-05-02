package com.example.odevodevim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_anasayfa.*
import kotlinx.android.synthetic.main.activity_main.*

class anasayfa : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anasayfa)

        button.setOnClickListener {
            val intent = Intent (this,hakkimizda::class.java)

            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent (this,ucretlendirme::class.java)

            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent (this,hizmet::class.java)

            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent (this,iletisim::class.java)

            startActivity(intent)
        }
    }
}
