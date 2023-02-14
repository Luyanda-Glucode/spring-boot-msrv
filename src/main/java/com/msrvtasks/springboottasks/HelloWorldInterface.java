package com.msrvtasks.springboottasks;

import org.springframework.http.ResponseEntity;

import java.util.HashSet;
public interface HelloWorldInterface {
    ResponseEntity getHelloWorld();
    HelloWorldModel addName(HelloWorldModel hello);
}
