package com.example.dpl.dinnerdecider1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val foodList= arrayListOf("土豆丝","鱼香肉丝","风味茄子","糖醋里脊","炖羊肉")   //定义数组集合
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        decideBtn.setOnClickListener {  //获取id对其进行监听
            val random= Random()
            val randomFood=random.nextInt(foodList.count())
            //该方法的作用是生成一个随机的int值，该值介于[0,count)的区间，也就是0到count之间的随机int值，包含0而不包含count。
            selectedFood.text=foodList[randomFood]    //根据值来获取对应的内容
        }
        addFoodBtn.setOnClickListener(){
            val newFood=addFoodTxt.text.toString()   //获取输入的内容
            foodList.add(newFood)     //数组集合中添加内容
            Toast.makeText(applicationContext,"添加成功！",Toast.LENGTH_SHORT).show()
            addFoodTxt.text.clear()   //内容清除
        }
    }
}
