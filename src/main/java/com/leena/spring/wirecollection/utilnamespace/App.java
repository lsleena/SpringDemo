package com.leena.spring.wirecollection.utilnamespace;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("wireCollection/util/appcontext.xml");

        Order orderBean = (Order) context.getBean("orderBean");

       List<String> itemList = orderBean.getItemList();

        System.out.println("\n" + orderBean.getItemList());

        System.out.println("\nInside Util NameSpace: \n");

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
