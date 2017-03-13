package com.lee.demo.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 使用Zuul作为微服务的对外网关
 */
@EnableZuulProxy
@SpringCloudApplication
public class ZuulGatewayDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayDemoApplication.class, args);
    }

}
