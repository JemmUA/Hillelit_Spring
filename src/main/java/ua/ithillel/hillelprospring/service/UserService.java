package ua.ithillel.hillelprospring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.ithillel.hillelprospring.model.User;
import ua.ithillel.hillelprospring.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll() {
        return userRepository.getAll();
    }

    public User getById(Integer id) {
        return userRepository.getById(id);
    }

    public List<User> getByMailAndPhone(String email, Long phone) {
        return userRepository.getByMailAndPhone(email, phone);
    }

    public List<User> getByNameAndPhoneAndAge(String name, Long phone, Integer age) {
        return userRepository.getByNameAndPhoneAndAge(name, phone, age);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User update(Integer id, User user) {
        return userRepository.update(id, user);
    }

    public Integer delete(int id) {
        return userRepository.delete(id);
    }
}
