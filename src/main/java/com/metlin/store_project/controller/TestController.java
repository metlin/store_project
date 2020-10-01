package com.metlin.store_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/welcome")
    public String firstPage() {
        return "welcome";
    }

    public void asd() {
        String string = "asd122111";
        String s = "sdf";
        int a = 5;
    }
}
