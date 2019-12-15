package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one.setOnClickListener{ appendExpression("1",true)}
        two.setOnClickListener{ appendExpression("2",true)}
        three.setOnClickListener{ appendExpression("3",true)}
        four.setOnClickListener{ appendExpression("4",true)}
        five.setOnClickListener{ appendExpression("5",true)}
        six.setOnClickListener{ appendExpression("6",true)}
        seven.setOnClickListener{ appendExpression("7",true)}
        eight.setOnClickListener{ appendExpression("8",true)}
        nine.setOnClickListener{ appendExpression("9",true)}
        dot.setOnClickListener{ appendExpression(".",true)}


        plus.setOnClickListener{ appendExpression("+",true)}
        minus.setOnClickListener{ appendExpression("-",true)}
        muply.setOnClickListener{ appendExpression("*",true)}
        divide.setOnClickListener{ appendExpression("/",true)}

        open.setOnClickListener{ appendExpression("(",true)}
        close.setOnClickListener{ appendExpression(")",true)}

        clear.setOnClickListener{
            mathExpression.text=""
            result.text=""
        }

        back.setOnClickListener{
            var string = mathExpression.text.toString();
            if(string.isNotEmpty()){
                mathExpression.text=string.substring(0,string.length-1)
            }
        }

    }

    fun appendExpression( string : String , canClear : Boolean){
        if(canClear){
            result.text =""
            mathExpression.append(string)
        }else{
            mathExpression.append(result.text)
            mathExpression.append(string)
            result.text=""
        }
    }
}
