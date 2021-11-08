package com.example.menuhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.menuhelper.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}