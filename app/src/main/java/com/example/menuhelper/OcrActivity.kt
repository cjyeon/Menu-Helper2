package com.example.menuhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.menuhelper.databinding.ActivityOcrBinding

class OcrActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityOcrBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}