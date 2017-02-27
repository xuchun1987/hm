package hm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by xuchun on 2017/2/27.
 */

@SpringBootApplication
public class AppStart extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(AppStart.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(AppStart.class, args);
    }

}
