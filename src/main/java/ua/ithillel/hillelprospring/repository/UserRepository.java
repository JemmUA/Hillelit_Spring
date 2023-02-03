package ua.ithillel.hillelprospring.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import ua.ithillel.hillelprospring.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> getUsersByEmailAndPhone(String email, Long phone);

    List<User> getUsersByNameOrPhoneOrAge(String name, Long phone, Integer age);

    @Transactional
    @Modifying
    @Query("update User u set u.phone = ?2 where u.id = ?1")
    Integer updatePhoneById(Integer id, Long phone);
}
