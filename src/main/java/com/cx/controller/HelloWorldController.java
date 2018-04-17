package com.cx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *  添加@RestController使默认类中的方法都会以json的格式返回
 *  如果我们需要使用页面开发只要使用 @Controller
 */
//@RestController
@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index(Model model){
        model.addAttribute("msg","helloWorld");
        return "index";
    }
}
