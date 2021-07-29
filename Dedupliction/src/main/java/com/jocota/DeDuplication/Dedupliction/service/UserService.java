package com.jocota.DeDuplication.Dedupliction.service;
import com.jocota.DeDuplication.Dedupliction.entities.UserDetails;
import com.jocota.DeDuplication.Dedupliction.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String saveUser(UserDetails usercreated){
        try {
            userRepository.save(usercreated);
            return "user saved successfully";
        }catch (Exception e){
            return "error occured";
        }

    }

    public boolean authenticateUser(UserDetails userDetails){
        UserDetails u = userRepository.findByUserName(userDetails.getUserName());
        if(u == null){

            return false;
        }

        if(u.getUserName().equals(userDetails.getUserName()) && u.getPassword().equals(userDetails.getPassword())) {

            return true;
        }else{

            return false;
        }
    }
}
