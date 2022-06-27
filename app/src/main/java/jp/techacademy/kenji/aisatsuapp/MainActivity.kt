package jp.techacademy.kenji.aisatsuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

import android.app.TimePickerDialog


class MainActivity : AppCompatActivity() ,View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

    }

    override fun onClick(v: View) {

        when(v.id) {
            R.id.button1 -> showTimePickerDialog()
        }
    }

    public fun showTimePickerDialog(){
        var timesum : Int

        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener{ view, hour, minute ->
                    timesum = hour * 60 + minute
                    when (timesum){
                        in 120..599 -> {
                            textView.text = "おはよう"
                        }
                        in 600..1079 -> {
                            textView.text = "こんにちわ"
                            }
                        in 1080..1439 -> {
                            textView.text = "こんばんわ"
                            }
                        in 0..199 -> {
                            textView.text = "こんばんわ"
                            }

                    }
                },
                0,0,true)

        timePickerDialog.show()

    }

}