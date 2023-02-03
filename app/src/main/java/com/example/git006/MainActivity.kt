package com.example.git006

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main()
    }

    private fun main() {
        val name = "davoud"
        val age = 1500

        Toast.makeText(this, "$name and $age", Toast.LENGTH_SHORT).show()
    }
}