package ua.edu.ucu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public String getData() {
        return "Hello, world!";
    }
}
