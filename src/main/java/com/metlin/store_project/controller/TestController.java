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
        String s = "sdf1231234";
        int a = 5121;

        String s1 = "string";
        String s2 = "string2";
        String s3 = "string3";
        String s4 = "string4";
    }

    public void qwe() {
      int a = 5;
      int b = 1;
    }

    public void dfg() {
        int a = 5;
        int b = 1;
    }
}
