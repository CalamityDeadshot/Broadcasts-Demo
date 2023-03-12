package ru.itschool.broadcastsdemo

import android.content.IntentFilter
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import ru.itschool.broadcastsdemo.broadcast_receiver.DemoReceiver
import ru.itschool.broadcastsdemo.ui.theme.BroadcastsDemoTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var data by mutableStateOf("")

        IntentFilter("ru.itschool.broadcastsender.ACTION_BROADCAST_DEMO").also {
            registerReceiver(
                DemoReceiver { data = it },
                it
            )
        }

        setContent {
            BroadcastsDemoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Text(data)
                }
            }
        }
    }

    override fun onStop() {
        super.onStop()
    }
}