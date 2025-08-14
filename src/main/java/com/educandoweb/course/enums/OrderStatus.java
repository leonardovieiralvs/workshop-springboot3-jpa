package com.educandoweb.course.enums;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public enum OrderStatus {

    WAITING_PAYMENT,
    PAID,
    SHIPPED,
    DELIVERED,
    CANCELED
}
