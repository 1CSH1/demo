package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author James-CSH
 * @since 2/9/2017 11:09 PM
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String home() {
        return "redirect:countries";
    }

}
