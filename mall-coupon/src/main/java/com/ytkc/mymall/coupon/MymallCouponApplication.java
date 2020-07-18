package com.ytkc.mymall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MymallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(MymallCouponApplication.class, args);
    }
}
