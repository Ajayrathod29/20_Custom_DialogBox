package com.example.customisedalertbox

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit  var dialog : Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myButton = findViewById<Button>(R.id.button)

        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialogue)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))

      //  custom dialog xml
        var buttonGood = dialog.findViewById<Button>(R.id.btn)
        var sendFeedback = dialog.findViewById<Button>(R.id.btn1)



        buttonGood.setOnClickListener {
            dialog.dismiss()
        }
        sendFeedback.setOnClickListener {
            //intent or toast
        }
        myButton.setOnClickListener {
            dialog.show()
        }
    }
}