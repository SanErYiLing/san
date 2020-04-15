package org.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ServiceApplication {

    public static void main( String[] args )
    {
    	SpringApplication app = new SpringApplication(ServiceApplication.class);
    	app.setWebApplicationType(WebApplicationType.NONE);
    	app.run(args);
    }
}
