package com.educandoweb.course.config;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Neo", "neo@gmail.com", "9999-9999", "neo123");
        User u2 = new User(null, "Trinity", "trinity@gmai.com", "8888-8888", "trinity123");

        Order o1 = new Order(null, Instant.parse("2025-08-10T20:23:10Z"), u1);
        Order o2 = new Order(null, Instant.parse("2025-08-13T10:56:41Z"), u2);
        Order o3 = new Order(null, Instant.parse("2025-08-04T19:21:12Z"), u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
