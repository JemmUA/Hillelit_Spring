package ua.ithillel.hillelprospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.ithillel.hillelprospring.configuration.BeanCarConfiguration;
import ua.ithillel.hillelprospring.configuration.BeanConfiguration;
import ua.ithillel.hillelprospring.controller.CarController;
import ua.ithillel.hillelprospring.model.Car;
import ua.ithillel.hillelprospring.model.TvSet;

@SpringBootApplication
public class HillelProSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(HillelProSpringApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        System.out.println("Singleton");
        String helloBean = context.getBean("helloBean", String.class);
        String helloAgainBean = context.getBean("helloBean", String.class);
        System.out.println(helloBean);
        System.out.println(helloBean + " == " + helloAgainBean + ": " + (helloBean == helloAgainBean));
        System.out.println("Prototype");
        Car ferrari = context.getBean("carBean", Car.class);
        Car audi = context.getBean("carBean", Car.class);
        System.out.println(ferrari);
        System.out.println(audi);

        ferrari.setModel("Ferrari");
        ferrari.setColor("Red");
        audi.setColor("White");
        audi.setModel("Audi");
        System.out.println(ferrari.getModel() + " == " + audi.getModel() + ": " + (ferrari == audi));
        System.out.println(ferrari);
        System.out.println(audi);
        TvSet tvSet = context.getBean("tvBean", TvSet.class);
        System.out.println(tvSet);

        System.out.println("\nGet all cars from repository\n");
        AnnotationConfigApplicationContext contextCar = new AnnotationConfigApplicationContext(BeanCarConfiguration.class);
        CarController carController = contextCar.getBean(CarController.class);
        carController.getAll().forEach(System.out::println);

    }

}
