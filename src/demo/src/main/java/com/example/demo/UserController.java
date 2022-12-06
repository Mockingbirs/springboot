package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping(value = "/user")
    public void test(){
        System.out.println("test() 실행...");

        UserDto userDto = new UserDto();
        userDto.setAge(20);
        userDto.setName("hong");

        System.out.printf("name : %s, age : %d\n", userDto.getName(), userDto.getAge());
    }
}
