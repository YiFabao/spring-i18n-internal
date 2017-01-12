package com.example.config;/**
 * Created by ptmind on 2017/1/13.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

/**
 * @author <a href="mailto:huanhuan_com@yeah.net">zhanhh</a>
 * @since 2017/1/13 - 1:47
 */
@Configuration
public class InternelConfiguration {

    /**
     * 配置国际化资源文件路径
     * */
    @Bean
    public ResourceBundleMessageSource messageSource(){
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages/message");
        messageSource.setCacheSeconds(0);
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    @Bean
    public CookieLocaleResolver cookieLocaleResolver() {
        CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
        cookieLocaleResolver.setCookieMaxAge(604800);
        cookieLocaleResolver.setDefaultLocale(Locale.CHINA);
        cookieLocaleResolver.setCookieName("Language");
        return cookieLocaleResolver;
    }

    /*@Bean
    public SessionLocaleResolver sessionLocaleResolver() {
        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        sessionLocaleResolver.setDefaultLocale(Locale.CHINA);
        return sessionLocaleResolver;
    }*/

}
