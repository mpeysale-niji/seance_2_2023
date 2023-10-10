package com.example.seance2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class ChildActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)

        val receivedData = intent.getStringExtra("key")

        val textView = findViewById<TextView>(R.id.child_text_view)
        textView.text = receivedData

        receivedData?.let {
            Log.i("ChildActivity", "Received some data: $receivedData")
        }
    }
}