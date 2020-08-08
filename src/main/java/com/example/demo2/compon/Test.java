package com.example.demo2.compon;

import com.fasterxml.jackson.databind.node.POJONode;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Test {

    @RequestMapping(value = "/test",method =RequestMethod.POST)

    public String test(@RequestBody User user){
        System.out.println(user.toString());
        return "到哪里";
    }


}
