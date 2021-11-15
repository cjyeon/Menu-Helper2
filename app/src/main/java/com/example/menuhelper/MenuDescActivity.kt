package com.example.menuhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.bumptech.glide.Glide
import com.example.menuhelper.databinding.ActivityMenuDescBinding

class MenuDescActivity : AppCompatActivity() {
    lateinit var binding : ActivityMenuDescBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuDescBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}