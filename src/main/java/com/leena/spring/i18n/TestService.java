package com.leena.spring.i18n;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

import java.util.Locale;

public class TestService implements MessageSourceAware {

    private MessageSource messageSource;
    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;

    }
    public void displayMessage(){

        System.out.println("Name error msg " + messageSource.getMessage("argument.required", new Object[]{"Name ...."}, Locale.US));
                System.out.println("Name error msg " + messageSource.getMessage("argument.required", new Object[]{"Name...."}, Locale.GERMANY));
    }
}