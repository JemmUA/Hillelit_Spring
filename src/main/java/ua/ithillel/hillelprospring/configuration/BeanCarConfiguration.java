package ua.ithillel.hillelprospring.configuration;

import org.springframework.context.annotation.*;
import ua.ithillel.hillelprospring.controller.CarController;
import ua.ithillel.hillelprospring.repository.CarRepository;
import ua.ithillel.hillelprospring.service.CarService;
@Configuration
@ComponentScan("ua.ithillel.hillelprospring.configuration")
@PropertySource("classpath:application.properties")
public class BeanCarConfiguration {
    @Bean
    @Scope("prototype")
    public CarController carControllerBean() {
        return new CarController(new CarService(new CarRepository()));
    }

    @Bean
    @Scope("prototype")
    public CarService carServiceBean() {
        return new CarService(new CarRepository());
    }
}
