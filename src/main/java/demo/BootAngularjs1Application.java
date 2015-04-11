package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;



@Import(RepositoryRestMvcConfiguration.class)
//@PropertySource("application.properties")
@SpringBootApplication
public class BootAngularjs1Application {

    public static void main(String[] args) {
        SpringApplication.run(BootAngularjs1Application.class, args);
    }
}
