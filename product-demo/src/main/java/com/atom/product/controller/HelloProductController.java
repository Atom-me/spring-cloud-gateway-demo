package com.atom.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Atom
 */
@RestController
@RequestMapping("product")
public class HelloProductController {

    @GetMapping("/echo")
    public String echoHello() {
        return "hello ,my name is product";
    }


    @GetMapping("/list")
    public List<String> list() {
        return List.of("iphone","xiaomi","sony");
    }
}
