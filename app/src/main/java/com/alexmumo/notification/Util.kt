package com.alexmumo.notification

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Context.NOTIFICATION_SERVICE
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat

const val CHANNEL_ID = "test_channel"

fun createNotification(context: Context): Notification {
    val builder = NotificationCompat.Builder(context, CHANNEL_ID)
        .setSmallIcon(R.drawable.ic_launcher_foreground)
        .setContentTitle("Test")
        .setContentText("Notification component")
        .setPriority(NotificationCompat.PRIORITY_HIGH)
        .setStyle(NotificationCompat.BigTextStyle())
    return builder.build()
}

@RequiresApi(Build.VERSION_CODES.O)
fun createNotificationChannel(context: Context) {
    val name = "Test channel"
    val descriptionText = "Test description"
    val importance = NotificationManager.IMPORTANCE_HIGH
    val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
        description = descriptionText
    }
    val notificationManager: NotificationManager = context.getSystemService(NOTIFICATION_SERVICE) as NotificationManager
    notificationManager.createNotificationChannel(channel)
}