package com.cll.control;

import com.cll.entity.User;
import com.cll.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2020/10/12.
 */
@RestController  //@RestController注解:其实就是@Controller和@ResponseBody注解加在一起
@RequestMapping("user")
public class UserControlelr {

    @Autowired
    private userservice userservice;


    @RequestMapping("list")
    public List<User> queryUserAll(){
        List<User> list=userservice.findallUser();
        return list;
    }


    @RequestMapping("list/{name}")
    public List<User> Querylistuser(@PathVariable String name){

        List<User> listuser=userservice.queryUserByName(name);
        return  listuser;
    }


}
