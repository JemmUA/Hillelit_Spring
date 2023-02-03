package ua.ithillel.hillelprospring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.ithillel.hillelprospring.model.User;
import ua.ithillel.hillelprospring.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    //    private final FakeUserRepository userRepository;
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll() {

        return userRepository.findAll();
    }

    public User getById(Integer id) {
        return userRepository.findById(id).orElseThrow();
    }

//    public Optional<User> getOptionalById(Integer id) {
//        return userRepository.findById(id);
//        return userRepository.getById(id);
//}

    public List<User> getByEmailAndPhone(String email, Long phone) {
        return userRepository.getUsersByEmailAndPhone(email, phone);
    }

    public List<User> getByNameOrPhoneOrAge(String name, Long phone, Integer age) {
        return userRepository.getUsersByNameOrPhoneOrAge(name, phone, age);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User update(User user) {
        return userRepository.save(user);
    }

    public Integer delete(Integer id) {
        userRepository.deleteById(id);
        return id;
    }

    public Integer updatePhoneById(Integer id, Long phone) {
        return userRepository.updatePhoneById(id, phone);
    }
}
