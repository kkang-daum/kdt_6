package com.example.ch2

import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Test1_1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //화면 구성을 위한 뷰 준비..
        //문자열 출력 뷰...
        val name = TextView(this).apply {
            typeface = Typeface.DEFAULT_BOLD//굵게..
            text = "Lake Louise"
        }
        //이미지 출력 뷰
        val image = ImageView(this).also {
            //객체를 람다함수에 매개변수로.. ==> it
            //리소스 이미지를 획득해서.. ImageView 에 지정..
            it.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.lake_1))
        }
        val address = TextView(this).apply {
            typeface = Typeface.DEFAULT_BOLD
            text = "Lake Louise, AB, 캐나다"
        }

        //여러 뷰를 화면에 출력하고 싶다..
        //계층으로 묶여야 한다.. 단일 계층으로 묶어서 출력해야 한다..
        val layout = LinearLayout(this).apply { //폴더 역할자..
            orientation = LinearLayout.VERTICAL//나열 방향..
            gravity = Gravity.CENTER//정렬 위치..
            //import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
            addView(name, WRAP_CONTENT, WRAP_CONTENT)//사이즈 지정..
            addView(image, WRAP_CONTENT, WRAP_CONTENT)
            addView(address, WRAP_CONTENT, WRAP_CONTENT)
        }
        //화면 출력.. 뷰 계층의 루트 객체를 출력.. 하위에 달라 붙은 뷰가 같이 화면에 출력..
        //화면 구성을 코드에서 직접 했다.. 이렇게 하면.. layout xml 을 만들지 않아도 된다..
        setContentView(layout)


        ViewCompat.setOnApplyWindowInsetsListener(layout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}