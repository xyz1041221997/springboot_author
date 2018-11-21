package cn.xyz.springboot_author;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringbootAuthorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAuthorApplication.class, args);
    }
}
