package ua.ithillel.hillelprospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.ithillel.hillelprospring.controller.dto.IntegerDto;
import ua.ithillel.hillelprospring.controller.dto.UserDto;
import ua.ithillel.hillelprospring.controller.mapper.UserMapper;
import ua.ithillel.hillelprospring.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    @Autowired
    private UserMapper userMapper;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //    @RequestMapping(path = "/all", method = RequestMethod.GET) // Example deprecated
    @GetMapping
    public ResponseEntity<List<UserDto>> getAll() {
        return new ResponseEntity<>(
                userMapper.toUserDtoList(
                        userService.getAll()),
                HttpStatus.OK
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getBiId(@PathVariable Integer id) {
        return new ResponseEntity<>(
                userMapper.toDto(
                        userService.getById(id)),
                HttpStatus.OK);
    }

    @GetMapping("/filter1")
    public ResponseEntity<List<UserDto>> getByEmailAndPhone(@RequestParam String email,
                                                            @RequestParam Long phone) {
        return new ResponseEntity<>(
                userMapper.toUserDtoList(
                        userService.getByEmailAndPhone(email, phone)),
                HttpStatus.OK);
    }

    @GetMapping("/filter2")
    public ResponseEntity<List<UserDto>> getByNameOrPhoneOrAge(@RequestParam String name,
                                                               @RequestParam(required = false) Long phone,
                                                               @RequestParam(required = false) Integer age) {
        return new ResponseEntity<>(
                userMapper.toUserDtoList(
                        userService.getByNameOrPhoneOrAge(name, phone, age)),
                HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserDto> save(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(
                userMapper.toDto(
                        userService.save(userMapper.toModel(userDto))),
                HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<UserDto> update(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(
                userMapper.toDto(
                        userService.update(userMapper.toModel(userDto))),
                HttpStatus.ACCEPTED);
    }

    //    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping()
    public Integer delete(@RequestParam Integer id) {
        return userService.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<IntegerDto> updatePhoneById(@PathVariable Integer id,
                                      @RequestParam Long phone) {
        return new ResponseEntity<>(
                new IntegerDto(userService.updatePhoneById(id, phone)),
                HttpStatus.OK);
    }
}
