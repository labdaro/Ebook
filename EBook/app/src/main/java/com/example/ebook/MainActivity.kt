package com.example.ebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun demo(view:View){
        var btn = view as Button
        when(btn.id){
            R.id.pre ->{
                if (num>=1){
                    num--
                    if (num == 1){
                        p1.visibility = View.VISIBLE
                        p2.visibility = View.GONE
                        p3.visibility = View.GONE
                    }
                    if (num == 2){
                        p1.visibility = View.GONE
                        p2.visibility = View.VISIBLE
                        p3.visibility = View.GONE
                    }
                    if (num == 3){
                        p1.visibility = View.GONE
                        p2.visibility = View.GONE
                        p3.visibility = View.VISIBLE
                    }
                }
            }
            R.id.next -> {
                if (num<=3){
                    num++
                    if (num == 1){
                        p1.visibility = View.VISIBLE
                        p2.visibility = View.GONE
                        p3.visibility = View.GONE
                    }
                    if (num == 2){
                        p1.visibility = View.GONE
                        p2.visibility = View.VISIBLE
                        p3.visibility = View.GONE
                    }
                    if (num == 3){
                        p1.visibility = View.GONE
                        p2.visibility = View.GONE
                        p3.visibility = View.VISIBLE
                    }
                }
            }
            R.id.search -> {
                var pageNumString = pageNum.text.toString()
                var pageNumInt = pageNumString.toInt()
                if (pageNumInt == 1){
                    p1.visibility = View.VISIBLE
                    p2.visibility = View.GONE
                    p3.visibility = View.GONE
                }
                if (pageNumInt == 2){
                    p1.visibility = View.GONE
                    p2.visibility = View.VISIBLE
                    p3.visibility = View.GONE
                }
                if (pageNumInt == 3){
                    p1.visibility = View.GONE
                    p2.visibility = View.GONE
                    p3.visibility = View.VISIBLE
                }
            }
        }
    }
}
