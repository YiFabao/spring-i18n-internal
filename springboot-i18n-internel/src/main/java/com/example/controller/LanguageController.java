package com.example.controller;/**
 * Created by ptmind on 2017/1/13.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author <a href="mailto:huanhuan_com@yeah.net">zhanhh</a>
 * @since 2017/1/13 - 1:43
 */
@Controller
@RequestMapping("/")
public class LanguageController {

    @Autowired
    CookieLocaleResolver cookieLocaleResolver;

    //@Autowired SessionLocaleResolver resolver;

    /**
     * 语言切换
     */
    @RequestMapping("/internal/language")
    public String language(HttpServletRequest request, HttpServletResponse response, String language) {
        if (!StringUtils.isEmpty(language)) {
            language = language.toLowerCase();
            if (language.equals("zh_CN")) {
                cookieLocaleResolver.setLocale(request, response, Locale.CHINA);
            } else if (language.equals("en")) {
                cookieLocaleResolver.setDefaultLocale(Locale.ENGLISH);
//                cookieLocaleResolver.setLocale(request, response, Locale.ENGLISH);
            } else {
                cookieLocaleResolver.setLocale(request, response, Locale.CHINA);
            }
        }
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
     * 换页面
     */
    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }

}