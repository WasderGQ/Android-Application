package com.wasdergq.firsttry

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wasdergq.firsttry.ui.theme.FirstTryTheme

private const val TAG = "MainActivity"
class MainActivity : ComponentActivity() {
    private lateinit var  etBaseAmount : EditText
    private lateinit var  seekBarTip : SeekBar
    private lateinit var  tvTipPercent : TextView
    private lateinit var  tvTipAmount : TextView
    private lateinit var  tvTotalAmount : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_3)
        etBaseAmount = findViewById(R.id.etBaseAmount)
        seekBarTip = findViewById(R.id.seekBarTip)
        tvTipPercent = findViewById(R.id.tvTipPercentLabel)
        tvTipAmount = findViewById(R.id.tvTipAmount)
        tvTotalAmount = findViewById(R.id.tvTotalAmount)

        seekBarTip.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener
        {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                Log.i(TAG , "on ProgressCahnged $p1")
            }

            override fun onStartTrackingTouch(p0: SeekBar?){}

            override fun onStopTrackingTouch(p0: SeekBar?) {}


        })

    }



}