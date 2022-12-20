package com.example.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.whatsapp.R.drawable
import com.example.whatsapp.R.drawable.*
import com.example.whatsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var imglist = arrayOf(img1,img2,img3,img4,img5,img6,img7,img8,img9,img10)
    var namelist = arrayOf("john","nick","denial","wick","martin","burg","musk","Lucifer","martino","zafer")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}