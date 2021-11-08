package com.example.menuhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.menuhelper.databinding.ActivityMenuListBinding

class MenuListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMenuListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}