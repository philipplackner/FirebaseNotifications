package com.androiddevs.firebasenotifications

data class PushNotification(
    val data: NotificationData,
    val to: String
)