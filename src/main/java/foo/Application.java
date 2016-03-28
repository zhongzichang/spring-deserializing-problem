package foo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zzc on 3/28/16.
 */
@EnableAutoConfiguration
@Configuration
@SpringBootApplication
@ComponentScan(basePackages = {"foo"})
public class Application extends SpringBootServletInitializer {


  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(Application.class);
  }
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
