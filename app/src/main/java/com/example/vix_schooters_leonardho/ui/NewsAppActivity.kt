package com.example.vix_schooters_leonardho.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vix_schooters_leonardho.R
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_newsapp.*

class NewsAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newsapp)

        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}