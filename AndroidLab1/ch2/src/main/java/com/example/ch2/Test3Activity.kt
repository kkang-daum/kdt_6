package com.example.ch2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Test3Activity : AppCompatActivity() {

    lateinit var visibleBtn: Button
    lateinit var targetView: TextView
    lateinit var invisibleBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //inflate + 출력 ==>view 객체 생성 완료..
        setContentView(R.layout.activity_test3)
        //필요한 뷰 객체 획득..
        visibleBtn = findViewById(R.id.visibleBtn)
        targetView = findViewById(R.id.targetView)
        invisibleBtn = findViewById(R.id.invisibleBtn)
        //획득한 뷰 객체에 이벤트 등록..
        visibleBtn.setOnClickListener {
            targetView.visibility = View.VISIBLE
        }
        invisibleBtn.setOnClickListener {
            targetView.visibility = View.INVISIBLE
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}