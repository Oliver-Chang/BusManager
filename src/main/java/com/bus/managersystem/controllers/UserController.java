package com.bus.managersystem.controllers;


import com.bus.managersystem.dto.Result;
import com.bus.managersystem.mappers.UserMapper;
import com.bus.managersystem.models.MaintenanceModel;
import com.bus.managersystem.models.UserModel;
import com.bus.managersystem.services.servicesImpl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/auth")
    public Result<UserModel> User(@RequestBody UserModel user) {
        UserModel retUser = userService.getOneUser(user);
        Result<UserModel> res = new Result<UserModel>(user, true);
        if(retUser == null) {
            String error = "can not login";
            res.setError(error);
            res.setSuccess(false);
        }
        return res;
    }
}
