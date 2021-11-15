package com.example.menuhelper

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.media.ExifInterface
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.bumptech.glide.Glide
import com.example.menuhelper.databinding.ActivityOcrBinding
import java.io.File

class OcrActivity : AppCompatActivity() {
    lateinit var binding: ActivityOcrBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOcrBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.hasExtra("gallery_img")) {
            Glide.with(this)
                .load(intent.getStringExtra("gallery_img"))
                .override(250, 230)
                .into(binding.image)
        } else if (intent.hasExtra("camera_img")) {
            var filePath: String? = intent.getStringExtra("camera_img")

            Glide.with(this)
                .load(filePath)
                .override(250, 230)
                .into(binding.image)
        } else {
            Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show()
        }

        binding.ocrBtn.setOnClickListener {

        }
    }
}