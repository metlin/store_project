package com.metlin.store_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/welcome")
    public String firstPage() {
        return "welcome";
    }

    public String string1() {
        return "123";
    }

    public String testBranch() {
        return "123";
    }

    public String testBranch2() {
        return "rewrw";
    }
}
