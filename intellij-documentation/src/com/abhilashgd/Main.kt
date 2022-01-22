package com.abhilashgd

import com.abhilashgd.model.NotificationEvent

fun main(args: Array<String>) {

    val event = NotificationEvent("Notification event received")
    print(event.event)
}
