package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {
    //Text
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }

    //Json
    //req->object mapper가 object로 바꿔줌(json->object) -> method를 타고 -> object를 리턴 ->object mapper가 json으로 바꿔줌(object->json)
    @PostMapping("/json")
    public User json(@RequestBody User user){
        System.out.println(user.toString());
        return user;
    }

    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){
       return ResponseEntity.status(HttpStatus.CREATED).body(user);// 응답메세지의 상태를 201로 설정해줄수있다.
    }

}
