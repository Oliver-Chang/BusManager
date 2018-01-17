package com.bus.managersystem.services;


import com.bus.managersystem.models.UserModel;



public interface IUserService {
    UserModel getOneUser(Long id);
}
