package com.example.qurbanapp.daftarpenerima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.qurbanapp.R..
import com.example.qurbanapp.databinding.ActivityFormTambahPenerimaBinding

class FormTambahPenerimaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFormTambahPenerimaBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormTambahPenerimaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
}