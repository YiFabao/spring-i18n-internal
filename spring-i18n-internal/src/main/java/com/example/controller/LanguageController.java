package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

/**
 * 国际化控制器
 *
 * @author Goofy
 */
@Controller
@RequestMapping("/")
public class LanguageController {

    @Autowired
    CookieLocaleResolver resolver;

    //@Autowired SessionLocaleResolver resolver;

    /**
     * 语言切换
     */
    @RequestMapping("/updateLanguage")
    public String language(String language) {
        return "welcome";
    }

    /**
     * 演示一些消息
     */
    @RequestMapping("something")
    public String something() {
        return "something";
    }

    /**
     * index
     */
    @RequestMapping(value = {"/", "welcome"})
    public String index() {
        return "welcome";
    }

}
