package com.example.getrickandmortyinfo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.getrickandmortyinfo.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.getCharacterById()
    }
}