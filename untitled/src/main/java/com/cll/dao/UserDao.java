package com.cll.dao;

import com.cll.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2020/10/12.
 */
public interface UserDao extends JpaRepository<User,Long> {

}
