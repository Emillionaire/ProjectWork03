package com.example.projectwork03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlin.collections.Map

class History : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

    }

    fun clickBtn(v: View) {
        when (v.id) {
            R.id.btnMain -> {
                intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}