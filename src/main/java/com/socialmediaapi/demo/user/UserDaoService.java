package com.socialmediaapi.demo.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    private static int userCount = 0;

    static {
        users.add(new User(++userCount, "Tony Stark", LocalDate.now().minusYears(30)));
        users.add(new User(++userCount, "Bruce Banner", LocalDate.now().minusYears(28)));
        users.add(new User(++userCount, "Steven Strange", LocalDate.now().minusYears(27)));
    }

    public List<User> findAll() {
        return users;
    }

    public User saveUser(User user) {
        user.setId(++userCount);
        users.add(user);
        return user;
    }

    public User findUser(Integer id) {
         return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public void deleteUserById(Integer id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
