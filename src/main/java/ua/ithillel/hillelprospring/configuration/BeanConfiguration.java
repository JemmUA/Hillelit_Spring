package ua.ithillel.hillelprospring.configuration;

import org.springframework.context.annotation.*;
import ua.ithillel.hillelprospring.model.Car;
import ua.ithillel.hillelprospring.model.TvSet;

@Configuration
@ComponentScan("ua.ithillel.hillelprospring.configuration")
@PropertySource("classpath:application.properties")
public class BeanConfiguration {
    @Bean
    @Scope("singleton")
    public String helloBean() {
        return "Hello, Spring! :)";
    }

    @Bean
    @Scope("prototype")
    public Car carBean() {
        return new Car();
    }

    @Bean
    @Scope("prototype")
    public TvSet tvBean() {
        return new TvSet();
    }


}
