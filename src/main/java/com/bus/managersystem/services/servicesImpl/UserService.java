package com.bus.managersystem.services.servicesImpl;

import com.bus.managersystem.mappers.UserMapper;
import com.bus.managersystem.models.UserModel;
import com.bus.managersystem.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService implements IUserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public UserModel getOneUser(Long id) {
        return null;
    }

    public UserModel getOneUser(UserModel user) {
        Long id = userMapper.getUser(user);
        user.setId(id);
        if(id == null) {
            user = null;
        }
        return user;
    }
}
