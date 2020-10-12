package com.cll.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/10/12.
 */
@RestController //@RestController注解:其实就是@Controller和@ResponseBody注解加在一起
public class mytest {

    @RequestMapping("test")
    public String info(){
        return  "hello dd s sssssss";
    }
}
