package com.leena.spring.wirecollection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("wireCollection/appcontext.xml");

        Order orderBean = (Order) context.getBean("orderBean");

        List<String> itemList = orderBean.getItemList();

        System.out.println();

        for(String item:itemList) {

            System.out.println("Items from itemList : " + item);
        }

        System.out.println();

        Set<String> itemSet = orderBean.getItemSet();

        for(String set:itemSet) {

            System.out.println("Items from itemSet : " + set);
        }

    }
}
