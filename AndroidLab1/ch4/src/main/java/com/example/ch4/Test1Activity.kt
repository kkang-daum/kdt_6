package com.example.ch4

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CompoundButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ch4.databinding.ActivityTest1Binding

//액티비티가 이벤트 핸들러가 되고자 한다면..
class Test1Activity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {

    lateinit var binding: ActivityTest1Binding

    fun showToast(message: String){
        //토스트 출력하는 개발자 함수..
        //화면에 잠깐 나오다가 자동으로 사라지는 문자열.. 토스트..
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    //두번째 매개변수가.. 체크 상태값..
    override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean) {
        showToast("check1 is $isChecked")
    }

    //이벤트 내용이 많다면.. 별도의 이벤트 처리 핸들러 클래스 선언..
    inner class EventHandler: View.OnClickListener {
        //매개변수.. 현재 이벤트가 발생한 객체..
        override fun onClick(v: View?) {
            when(v){
                binding.button1 -> showToast("button1 click")
                binding.button2 -> showToast("button2 click")
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.button1.setOnClickListener(EventHandler())
//        binding.button2.setOnClickListener(EventHandler())
        binding.button2.setOnClickListener {
            showToast("button2 click..")
        }

        binding.check1.setOnCheckedChangeListener(this)

        //이벤트 핸들러가 준비되어야 한다.. 이 이벤트에서만 사용하는 핸들러다.. ==> 익명 클래스..
        //인터페이스 구현해야한다..
//        binding.check2.setOnCheckedChangeListener(object: CompoundButton.OnCheckedChangeListener {
//            override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean) {
//                Log.d("kkang", "check2 is $isChecked")
//            }
//        })

        //인터페이스를 구현한 익명 클래스를 만든다면.. 위처럼 object: Interface { 추상함수 } 형태가 기본이지만..
        //줄여서 추상함수 안쪽 내용만 { } 로 작성이 가능하다..
        //Single Abstract Method 기법이라고 부른다. SAM 기법..
        //추상함수 하나만 가지는 인퍼페이스만 가능하다..
//        binding.check2.setOnCheckedChangeListener({buttonView, isChecked ->
//            Log.d("kkang", "check2 is $isChecked")
//        })
        
        //hof.. 마지막 매개변수 람다함수.. () 밖에..
        binding.check2.setOnCheckedChangeListener {buttonView, isChecked ->
            Log.d("kkang", "check2 is $isChecked")
        }
    }
}