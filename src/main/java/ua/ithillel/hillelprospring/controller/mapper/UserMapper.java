package ua.ithillel.hillelprospring.controller.mapper;

import org.springframework.stereotype.Component;
import ua.ithillel.hillelprospring.controller.dto.UserDto;
import ua.ithillel.hillelprospring.model.User;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {
    public static User mapToModel(UserDto userDto) {
        return new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getSurname(),
                userDto.getAge(),
                userDto.getEmail(),
                userDto.getPhone());
    }

    public static UserDto mapToDto(User user) {
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getSurname(),
                user.getAge(),
                user.getEmail(),
                user.getPhone());
    }

    public UserDto toDto(User user) {
        return UserMapper.mapToDto(user);
    }

    public User toModel(UserDto userDto) {
        return UserMapper.mapToModel(userDto);
    }

    public List<UserDto> toUserDtoList(List<User> users) {
        return users.stream()
                .map(UserMapper::mapToDto)
                .collect(Collectors.toList());
    }

    public List<User> toUserList(List<UserDto> usersDto) {
        return usersDto.stream()
                .map(UserMapper::mapToModel)
                .collect(Collectors.toList());
    }
}