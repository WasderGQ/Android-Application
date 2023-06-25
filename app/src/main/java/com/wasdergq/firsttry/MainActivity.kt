package com.wasdergq.firsttry

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.wasdergq.firsttry.Pages.MainPage




class MainActivity : ComponentActivity() {

private val _mainPage : MainPage = MainPage()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}



