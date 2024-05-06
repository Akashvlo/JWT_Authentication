package com.Jwt.Services;

import com.Jwt.model.user;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

     private List<user> store=new ArrayList<>();

     public UserService() {

          store.add(new user(UUID.randomUUID().toString(),"Akash Srivastava","sunny.akashsrira@@gmail.com"));
          store.add(new user(UUID.randomUUID().toString(),"Akh Srivastava","sunny.akashsasfrira@@gmail.com"));
          store.add(new user(UUID.randomUUID().toString(),"Ash Srivastava","sunny.aksfasshsrira@@gmail.com"));

     }

     public List<user> getUsers(){
          return this.store;
     }
}
