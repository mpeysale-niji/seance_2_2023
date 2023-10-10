package com.example.seance2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.seance2.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val button = binding.floatingActionButton
        button.setOnClickListener {
            Log.i("ActivityMain", "Button was clicked")
            Snackbar.make(binding.root, "Clicked", Snackbar.LENGTH_LONG).show()
        }

        val openChildActivityButton = binding.buttonOpenChildActivity
        openChildActivityButton.setOnClickListener {
            openChildActivity()
        }
    }

    fun openChildActivity() {
        val intent = Intent(baseContext, ChildActivity::class.java)
        intent.putExtra("key", "This is some data from MainActivity")
        startActivity(intent)
    }

}