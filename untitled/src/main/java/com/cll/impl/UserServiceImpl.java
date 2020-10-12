package com.cll.impl;

import com.cll.dao.UserDao;
import com.cll.entity.User;
import com.cll.mapper.Usermapper;
import com.cll.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2020/10/12.
 */
@Service
public class UserServiceImpl implements userservice{

    @Autowired
    private UserDao userDao;

    @Autowired
    private Usermapper usermapper;

    @Override
    public List<User> findallUser() {
       List<User> listuser=this.userDao.findAll();
        return listuser;
    }

    @Override
    public List<User> queryUserByName(String name) {
        List<User> listmapper=this.usermapper.QueryUserByName(name);
        return  listmapper;
    }
}
