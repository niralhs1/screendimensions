package com.ns.util.screendimensions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView : TextView = findViewById(R.id.text_view_id)//in onCreate()


        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        val width = displayMetrics.widthPixels.toString()
        val height = displayMetrics.heightPixels.toString()
        textView.setText("Screen Pixel Dimensions:\n $width(Width) x $height(Height)");
    }
}