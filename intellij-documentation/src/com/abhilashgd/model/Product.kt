package com.abhilashgd.model

import java.time.ZonedDateTime
import java.util.Objects

/**
 * @version 1.0
 * @author: abhilashgd
 * @since: 1/22/22
 */
class Product(var message: String, var timestamp: ZonedDateTime) {

    override fun toString(): String {
        return "Product{" +
                "message='" + message + '\'' +
                ", timestamp=" + timestamp +
                '}'
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val product = o as Product
        return message == product.message && timestamp == product.timestamp
    }

    override fun hashCode(): Int {
        return Objects.hash(message, timestamp)
    }
}