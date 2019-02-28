package com.leena.spring.wirecollection;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Order {

    private String id;
    private List<String> itemList;
    private Set<String> itemSet;


//    private String[] itemList;
//    private Collection<String> itemSet;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getItemList() {
        return itemList;
    }

    public void setItemList(List<String> itemList) {
        this.itemList = itemList;
    }

    public Set<String> getItemSet() {
        return itemSet;
    }

    public void setItemSet(Set<String> itemSet) {
        this.itemSet = itemSet;
    }

}
