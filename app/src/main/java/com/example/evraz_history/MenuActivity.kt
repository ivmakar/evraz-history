package com.example.evraz_history

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        menu1.setOnClickListener {
            startActivity(Intent(this, HistoryActivity::class.java))
        }

        menu2.setOnClickListener {
            startActivity(Intent(this, HistoryActivity::class.java))
        }

        menu3.setOnClickListener {
            startActivity(Intent(this, HistoryActivity::class.java))
        }
    }
}
