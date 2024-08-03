package com.exam;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.userRole;
import com.exam.repo.userRepository;
import com.exam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class QuizApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(QuizApplication.class, args);
    }

    @Autowired
    private UserService userService;
    @Override
    public void run(String... args) throws Exception {

        System.out.println("Project Running");
//        User user=new User();
//        user.setfName("Arjun");
//        user.setLname("Dhangar");
//        user.setEmail("adhangar18@gmail.com");
//        user.setPassword("Arjun@123");
//        user.setUserName("adhangar18");
//        user.setPhone("7049420408");
//        user.setProfile("default.png");
//
//        Role role = new Role();
//        role.setRoleId(1L);
//        role.setRoleName("ADMIN");
//        Set<userRole> userRoleSet=new HashSet<>();
//        userRole userRole=new userRole();
//        userRole.setRole(role);
//        userRole.setUser(user);
//        userRoleSet.add(userRole);
//        User user1 = this.userService.createUser(user,userRoleSet);
//        System.out.println(user1);
    }
}
