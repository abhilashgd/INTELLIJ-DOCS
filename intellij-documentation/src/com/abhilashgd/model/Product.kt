package com.abhilashgd.model;

import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * @version 1.0
 * @author: abhilashgd
 * @since: 1/22/22
 */
public class Product {

    private String message;
    private ZonedDateTime timestamp;

    public Product(String message, ZonedDateTime timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Product{" +
                "message='" + message + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return message.equals(product.message) && timestamp.equals(product.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, timestamp);
    }


}
