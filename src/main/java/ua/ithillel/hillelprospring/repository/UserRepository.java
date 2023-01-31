package ua.ithillel.hillelprospring.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import ua.ithillel.hillelprospring.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();

    @PostConstruct
    public void init() {
        users.add(new User(users.size(), "Robin", "Good", 33, "woodrail@gmail.com", 1000000001L));
        users.add(new User(users.size(), "Bob", "Beanoff", 32, "bob@gmail.com", 9999999999L));
        users.add(new User(users.size(), "Alex", "Alexoff", 11, "alex@mail.ua", 1111111111L));
    }

    public List<User> getAll() {
        return users;
    }


    public User getById(Integer id) {
        return users.get(id);
    }

    public List<User> getByMailAndPhone(String email, Long phone) {
        return users.stream()
                .filter(user -> email.equals(user.getEmail()) && phone.equals(user.getPhone()))
                .collect(Collectors.toList());
    }

    public List<User> getByNameAndPhoneAndAge(String name, Long phone, Integer age) {
        return users.stream()
                .filter(user -> user.getName().equals(name) || user.getPhone().equals(phone) || user.getAge().equals(age))
                .collect(Collectors.toList());
    }

    public User save(User user) {
        user.setId(users.size());
        users.add(user);
        return user;
    }

    public User update(Integer id, User user) {
        users.get(id).setName(user.getName());
        users.get(id).setSurname(user.getSurname());
        users.get(id).setAge(user.getAge());
        users.get(id).setEmail(user.getEmail());
        users.get(id).setPhone(user.getPhone());
        return users.get(id);
    }

    public int delete(int id) {
        users.remove(id);
        return id;
    }
}
