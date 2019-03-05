package com.leena.spring.wirecollection.utilnamespace;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Set;

/*
Using util-namespace For Wiring Collection in Spring
Spring provides util-namespace that helps in dealing with common utility configuration issues,
such as configuring collections, referencing constants
Using util:list (and util:set) you can create a separate bean for the list or set and then wire it as a reference in the required bean.
You can also explicitly control the exact type of List that will be instantiated and populated via the use of the list-class attribute
on the <util:list/> element. For set the same attribute is called set-class
 */

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
