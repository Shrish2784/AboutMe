package com.velo.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nickNameInput: EditText = findViewById<EditText>(R.id.nickNameInput);
        val nickName: TextView = findViewById<EditText>(R.id.nickName);

        nickNameInput.setOnKeyListener(View.OnKeyListener { v: View?, keyCode: Int, event: KeyEvent? ->
            if ((event?.action == KeyEvent.ACTION_DOWN) and (keyCode == KeyEvent.KEYCODE_ENTER)) {
                nickNameInput.visibility = View.GONE
                nickName.text = nickNameInput.text
                nickName.visibility = View.VISIBLE
                return@OnKeyListener true
            }
            return@OnKeyListener false
        })

        nickName.setOnClickListener { v: View ->
            nickName.visibility = View.GONE
            nickNameInput.visibility = View.VISIBLE
        }
    }
}
