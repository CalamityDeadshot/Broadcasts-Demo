package ru.itschool.broadcastsdemo.broadcast_receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class DemoReceiver(
    private val onReceive: (String) -> Unit
): BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.v("Receiver", "Received")
        onReceive(intent?.getStringExtra("data") ?: "No data")
    }
}