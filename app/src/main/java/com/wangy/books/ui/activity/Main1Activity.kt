package com.wangy.books.ui.activity

import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wangy.books.R
import com.wangy.books.dialog.CustomDialog


class Main1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        val builder = CustomDialog.Builder(this@Main1Activity)
        builder.setMessage("当前WIFI功能出现故障，请检查您的WIFI功能再进行使用！")
        builder.setTitle("提示")
        builder.setPositiveButton(
            "确定"
        ) { dialog: DialogInterface, which: Int -> dialog.dismiss() }
        builder.setNegativeButton(
            "取消"
        ) { dialog: DialogInterface, which: Int -> dialog.dismiss() }
        builder.create().show();


    }
}