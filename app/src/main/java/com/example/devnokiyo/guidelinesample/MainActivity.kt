package com.example.devnokiyo.guidelinesample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vertical_button.setOnClickListener {
            startActivity(Intent(this, VerticalGuidelineActivity::class.java))
        }

        horizontal_button.setOnClickListener {
            startActivity(Intent(this, HorizontalGuidelineActivity::class.java))
        }

        cross_button.setOnClickListener {
            startActivity(Intent(this, CrossGuidelineActivity::class.java))
        }
    }
}
