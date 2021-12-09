package com.example.projectwork03

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun clickBtn(v: View) {
        when (v.id) {
            R.id.btnHistory -> {
                    intent = Intent(this, History::class.java)
                    startActivity(intent)
            }
            R.id.btnPhoto -> {
                    intent = Intent(this, Photo::class.java)
                    startActivity(intent)
            }
            R.id.btnMap -> {
                    intent = Intent(this, Mapka::class.java)
                    startActivity(intent)
            }
        }
    }
}

