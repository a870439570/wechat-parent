package com.pflm;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAdminServer
public class WechatMonitoringApplication {

    public static void main(String[] args) {
        SpringApplication.run(WechatMonitoringApplication.class, args);
    }
}
