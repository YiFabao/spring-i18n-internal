package com.example.controller;

import com.example.bean.Writer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Locale;

@Controller
public class BlogController {
    @Autowired
    private Writer writer;

    @RequestMapping(value = "/")
    public ModelAndView getBlog(ModelAndView mv) {
        mv.addObject("currentDate", new Date());
        mv.addObject("writers", writer.getWriters());
        mv.setViewName("myblog");
        return mv;
    }

    /**
     * 修改国际化语言
     * http://localhost:8080/updateLanguage?locale=en
     * 或http://localhost:8080/updateLanguage?locale=zh_CN
     */
    @RequestMapping(value = "/updateLanguage")
    public ModelAndView getBlogCN(Locale locale, ModelAndView mv) {
        mv.addObject("currentDate", new Date());
        mv.addObject("writers", writer.getWriters());
        mv.setViewName("myblog");
        return mv;
    }

    /**
     * 每次都访问英文
     */
    @RequestMapping(value = "/en")
    public String selectEN() {
        return "redirect:updateLanguage?locale=en";
    }

    /**
     * 每次都访问中文
     */
    @RequestMapping(value = "/cn")
    public String selectCN() {
        return "redirect:updateLanguage?locale=zh_CN";
    }
}