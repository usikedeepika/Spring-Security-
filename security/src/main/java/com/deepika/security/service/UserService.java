package com.deepika.security.service;

import com.deepika.security.model.Users;
import com.deepika.security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

    public Users register(Users users)
    {
          users.setPassword(encoder.encode(users.getPassword()));
         return  userRepo.save(users);
    }
}
