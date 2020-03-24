package com.velo.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import androidx.databinding.DataBindingUtil
import com.velo.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.nickNameInput.setOnKeyListener(View.OnKeyListener { v: View?, keyCode: Int, event: KeyEvent? ->
            if ((event?.action == KeyEvent.ACTION_DOWN) and (keyCode == KeyEvent.KEYCODE_ENTER)) {
                binding.nickNameInput.visibility = View.GONE
                binding.nickName.text = binding.nickNameInput.text
                binding.nickName.visibility = View.VISIBLE
                return@OnKeyListener true
            }
            return@OnKeyListener false
        })

        binding.nickName.setOnClickListener { v: View ->
            binding.nickName.visibility = View.GONE
            binding.nickNameInput.visibility = View.VISIBLE
        }
    }
}
