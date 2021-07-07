package com.wangy.books

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.wangy.books.ui.activity.Main1Activity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    private fun initView() {
        findViewById<TextView>(R.id.tv_main_text).setOnClickListener {
            startActivity(Intent(this@MainActivity,Main1Activity::class.java))
        }
    }

}