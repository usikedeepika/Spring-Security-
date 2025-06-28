package com.deepika.security.service;

import com.deepika.security.model.UserPrincipal;
import com.deepika.security.model.Users;
import com.deepika.security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {


    @Autowired
    UserRepo userRepo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users  user=userRepo.findByUsername(username);

        if(user==null){
            throw  new UsernameNotFoundException("User not found Exception");
        }

        return new UserPrincipal(user);

    }
}
