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
    @Value("${tv.name}")
    String name;
    @Value("${tv.chanel}")
    int chanel;
    @Value("${tv.volume}")
    int volume;
}
