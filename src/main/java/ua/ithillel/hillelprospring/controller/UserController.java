package ua.ithillel.hillelprospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.ithillel.hillelprospring.model.User;
import ua.ithillel.hillelprospring.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //    @RequestMapping(path = "/all", method = RequestMethod.GET) // Example deprecated
    @GetMapping()
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getBiId(@PathVariable Integer id) {
        return userService.getById(id);
    }

    @GetMapping("/filter1")
    public List<User> getByEmailAndPhone(@RequestParam String email, @RequestParam Long phone) {
        return userService.getByMailAndPhone(email, phone);
    }

    @GetMapping("/filter2")
    public List<User> getByNameAndPhoneAndAge(@RequestParam String name, @RequestParam(required = false) Long phone, @RequestParam(required = false) Integer age) {
        return userService.getByNameAndPhoneAndAge(name, phone, age);
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Integer id, @RequestBody User user) {
        return userService.update(id, user);
    }

    @DeleteMapping()
    public Integer delete(@RequestParam int id) {
        return userService.delete(id);
    }
}
