package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class SystemController {

    @GetMapping("/name/id/{id}")
    public String getName(@PathVariable("id") String userId){
        if(userId.equals("1")){
            return "Welcome to the website, 1";
        } else if (userId.equals("2")) {
            return "Welcome to the website, 2";
        }
        else{
            return "Welcome!";
        }
    }


    @PostMapping("/user")
    public Person createUser(@RequestBody Person person){
        person.age = person.age + 1;
        return person;
    }

}
