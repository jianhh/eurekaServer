package cn.sinobest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by zhouyi1 on 2017/2/5 0005.
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {
    public static void main(String[] strs){
        new SpringApplicationBuilder(Application.class).web(true).run(strs);
    }
}
