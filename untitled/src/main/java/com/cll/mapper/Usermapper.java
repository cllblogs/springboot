package com.cll.mapper;

import com.cll.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2020/10/12.
 */
@Mapper
public interface Usermapper {

    @Select("select * from user where name like '%${value}%'")
    public List<User> QueryUserByName(String name);
}
