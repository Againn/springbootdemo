package com.service;

import com.entity.User;
import com.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userDao;

    public User findByName(String name){
        User user =null;
        try {
            user=userDao.findByUserName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
