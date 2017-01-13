package com.example.controller;

import com.example.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
public class UserController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "userform";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("user") User user) {
        return "success";
    }

    /**
     * spring 默认修改国际化语言参数就是locale
     */
    @RequestMapping(value = "/updateLanguage", method = RequestMethod.GET)
    public String updateLanguage(Locale locale) {
        return "redirect:/";
    }
}