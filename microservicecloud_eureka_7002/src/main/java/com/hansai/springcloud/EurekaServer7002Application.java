package com.hansai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>Description: </p>
 * <p> </p>
 *
 * @author: hansai
 * @date: 2019/4/20 0020
 * @time: 17:34
 */
@SpringBootApplication
@EnableEurekaServer
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class EurekaServer7002Application {
    public static void main(String[] args) {

        SpringApplication.run(EurekaServer7002Application.class);
    }
}
