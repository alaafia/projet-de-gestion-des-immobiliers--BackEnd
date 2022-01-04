package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    //Optional<User> findUserByEmailUser(String Email_user);
    @Query("SELECT u FROM User u where u.emailUser= ?1 and u.passwordUser= ?2")
    User findByemilpass(String emailUser, String passwordUser);

}
