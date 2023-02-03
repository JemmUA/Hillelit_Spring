package ua.ithillel.hillelprospring.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private String email;
    private Long phone;
}
