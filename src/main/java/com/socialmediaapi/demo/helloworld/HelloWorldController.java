package com.socialmediaapi.demo.helloworld;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController public class HelloWorldController {

    private MessageSource messageSource;

    public HelloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/internationalisation/good-morning")
    public String getMorningMessage() {
        Locale locale =  LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message",null, locale);
    }
}
