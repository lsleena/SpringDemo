package com.leena.spring.wirecollection;

import java.util.Map;
import java.util.Properties;
import com.leena.spring.wirecollection.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderMapApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("wireCollection/appcontext1.xml");

        OrderMap orderMapBean = (OrderMap) context.getBean("orderMapBean");

        Map<String, Item> itemMap = orderMapBean.getItemMap();

        for(Map.Entry<String, Item> item : itemMap.entrySet()){

            System.out.println("item from Map - " + item.getKey() + " " +
                    item.getValue().getItemName() + " " +  item.getValue().getPrice());
        }
        Properties itemProp = orderMapBean.getItemProp();
        System.out.println("items from Properties " + itemProp);
    }
}
