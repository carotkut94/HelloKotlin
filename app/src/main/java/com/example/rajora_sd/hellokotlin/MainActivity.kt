package com.example.rajora_sd.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById(R.id.clickCounter) as Button
        button.setOnClickListener{
            Toast.makeText(this,  "I am clicked", Toast.LENGTH_LONG).show();
        }
        val progressBar = findViewById(R.id.progressBar) as ProgressBar
        val seekBar = findViewById(R.id.progressController) as SeekBar
        val spinner = findViewById(R.id.listContainer) as Spinner

        val nameText  =  findViewById(R.id.enterName) as EditText

        nameText.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
               button.text = s
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })


        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                progressBar.progress = progress
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                // Just an empty method
            }
            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Another empty method
            }
        })



    }
}
