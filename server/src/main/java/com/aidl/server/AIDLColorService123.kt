package com.aidl.server

import android.app.Service
import android.content.Intent
import android.graphics.Color
import android.os.IBinder
import android.util.Log
import java.util.Random

private const val TAG ="SERVER-AIDLColorService"

// TODO : STEP- 4
class AIDLColorService123 : Service() {

    override fun onBind(intent: Intent): IBinder {
        return binder
    }

    private val  binder = object : IAIDLColorInterface.Stub() {

        override fun getColor(): Int {
            val rnd = Random()
            val color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
            Log.d(TAG, "getColor: "+ color)
            return color
        }
    }
}