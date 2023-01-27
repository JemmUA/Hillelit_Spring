package ua.ithillel.hillelprospring.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class Car {
    private String model;
    private String color;
    @Value("${car.type}")
    private String type;
}