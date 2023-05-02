package com.atom.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Atom
 */
@RestController
@RequestMapping("/order")
public class HelloOrderController {

    @GetMapping("/echo")
    public String echoHello() {
        return "hello ,my name is order";
    }


}
