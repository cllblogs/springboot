package com.cll.service;

import com.cll.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2020/10/12.
 */

public interface userservice {
    List<User> findallUser();
    List<User> queryUserByName(String name);

}
