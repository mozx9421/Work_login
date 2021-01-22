package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast_fail=Toast.makeText(applicationContext,"Don't use same user and password. ",Toast.LENGTH_LONG)
        val toast_fail_1=Toast.makeText(applicationContext,"Please enter the same password in both password fields.",Toast.LENGTH_LONG)
        val toast_pass=Toast.makeText(applicationContext,"Register successful",Toast.LENGTH_LONG)
        val toast_first=Toast.makeText(applicationContext,"Please enter username and password",Toast.LENGTH_LONG)

        ToastButton.setOnClickListener(){
            if(Username.text.toString() == ""){
                toast_first.show()
            }
            else{
            if (Username.text.toString() == Password.text.toString()){
                toast_fail.show()
            }
            else{
                if (Password.text.toString() == ""){
                    toast_first.show()
                }
                else {
                    if (Password.text.toString() == Confirm.text.toString()) {
                        toast_pass.show()
                    } else {
                        toast_fail_1.show()
                    }
                }
            }
          }
        }

        ResetButton.setOnClickListener(){
            Username.setText(null)
            Password.setText(null)
            Confirm.setText(null)
        }
    }


}
