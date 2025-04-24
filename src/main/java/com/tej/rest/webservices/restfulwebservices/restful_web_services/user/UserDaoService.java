package com.tej.rest.webservices.restfulwebservices.restful_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int usrcout = 0;

    static{
        users.add(new User(++usrcout, "teja", LocalDate.now().minusYears(25)));
        users.add(new User(++usrcout, "siri", LocalDate.now().minusYears(23)));
        users.add(new User(++usrcout, "dini", LocalDate.now().minusYears(24)));
    }
    
    public List<User> findAll(){
        return users;
    }
    
    public User findOne(int id){
        Predicate<? super User> predicate = user -> user.getId() == id; 
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User save(User user){
        user.setId(++usrcout);
        users.add(user);
        return user;
    }
}
