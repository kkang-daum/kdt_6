package com.example.androidlab1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge

import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //액티비티의 화면이 시스템 영역까지 차지하라...
        enableEdgeToEdge()

        //화면 출력 명령..
        setContentView(R.layout.activity_main)

        //액티비티의 컨텐츠를 시스템, 디바이스의 특징에서 최대한
        //보호해서 출력하기 위해서..
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
}