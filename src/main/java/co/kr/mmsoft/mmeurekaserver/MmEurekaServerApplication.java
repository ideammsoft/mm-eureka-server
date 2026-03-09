package co.kr.mmsoft.mmeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MmEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MmEurekaServerApplication.class, args);
    }

}
