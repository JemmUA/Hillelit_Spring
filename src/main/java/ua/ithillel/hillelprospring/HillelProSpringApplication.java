package ua.ithillel.hillelprospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HillelProSpringApplication {

    public static void main(String[] args) {
        //Homework 32
//        ConfigurableApplicationContext context = SpringApplication.run(HillelProSpringApplication.class, args);
//
//        System.out.println("Singleton");
//        String helloBean = context.getBean("helloBean", String.class);
//        String helloAgainBean = context.getBean("helloBean", String.class);
//        System.out.println(helloBean);
//        System.out.println(helloBean + " == " + helloAgainBean + ": " + (helloBean == helloAgainBean));
//        System.out.println("Prototype");
//        Car ferrari = context.getBean("carBean", Car.class);
//        Car audi = context.getBean("carBean", Car.class);
//        System.out.println(ferrari);
//        System.out.println(audi);
//
//        ferrari.setModel("Ferrari");
//        ferrari.setColor("Red");
//        audi.setColor("White");
//        audi.setModel("Audi");
//        System.out.println(ferrari.getModel() + " == " + audi.getModel() + ": " + (ferrari == audi));
//        System.out.println(ferrari);
//        System.out.println(audi);
//
//        TvSet tvSet = context.getBean("tvBean", TvSet.class);
//        System.out.println(tvSet);
//
//        System.out.println("\nApplication properties: ");
//        System.out.println("car.type: " + audi.getType());
//        System.out.println("tvSet.name: " + tvSet.getName());
//        System.out.println("tvSet.chanel: " + tvSet.getChanel());
//        System.out.println("tvSet.volume: " + tvSet.getVolume());
//
//        System.out.println("\nGet all cars from repository\n");
//        CarController carController = context.getBean(CarController.class);
//        carController.getAll().forEach(System.out::println);

        //Homework 33
        //Port 8083
        SpringApplication.run(HillelProSpringApplication.class, args);

    }

}
