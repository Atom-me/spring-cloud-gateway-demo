package com.atom.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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


    @GetMapping("/orderList")
    public List<String> list() {
        return List.of("order1", "order2");
    }

}
