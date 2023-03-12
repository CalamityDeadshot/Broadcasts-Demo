package ru.itschool.broadcastsdemo.broadcast_receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class LocaleChangedReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.v("Receiver", intent?.extras.toString())

        Toast.makeText(context, "Locale changed", Toast.LENGTH_LONG).show()
    }
}