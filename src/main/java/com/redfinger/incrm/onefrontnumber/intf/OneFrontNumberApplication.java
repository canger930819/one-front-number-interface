package com.redfinger.incrm.onefrontnumber.intf;

import com.redfinger.incrm.onefrontnumber.app.enent.MessageInputProcessor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.redfinger.phecda.api", "com.redfinger.incrm", "com.redfinger.crm"})   // 注册为服务的注解
@EnableDiscoveryClient //  发现服务的注解
@EnableBinding(value = { MessageInputProcessor.class})
@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.redfinger.incrm.onefrontnumber.inf.mapper")
@ComponentScan(basePackages = {"com.redfinger.crm", "com.redfinger.incrm.onefrontnumber","com.redfinger.phecda.api",
        "com.redfinger.incrm.onefrontnumber.inf", "com.redfinger.incrm.userdacdimerolefunc"})
public class OneFrontNumberApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneFrontNumberApplication.class, args);
    }
}
