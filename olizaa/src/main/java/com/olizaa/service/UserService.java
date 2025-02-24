package com.olizaa.service;

import com.olizaa.model.User;

public interface UserService {

    User findById(Long id);


    User create(User usercreate);


}
