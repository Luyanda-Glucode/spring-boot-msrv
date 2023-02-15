package com.msrvtasks.springboottasks;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    HelloWorldInterface helloWorldInterface;
    @GetMapping(value = "/HelloWorldModel")
    public ResponseEntity getHelloWorld() {
        helloWorldInterface.getHelloWorld();
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(value = "/HelloWorldModel/add")
    public HelloWorldModel saveHelloWorld(@RequestBody HelloWorldModel name) {
        return helloWorldInterface.addName(name);
    }
}
