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
public class TvSet {
    @Value("${tvSet.name}")
    String name;
    @Value("${tvSet.chanel}")
    int chanel;
    @Value("${tvSet.volume}")
    int volume;
}
