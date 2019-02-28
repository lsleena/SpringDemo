package com.leena.spring.dependency.factoryMethod.singletonClass;


public class Admin {

    // private constructor
    private Admin() {

    }

    private static class AdminHolder {

        private static final Admin INSTANCE = new Admin();
    }

    public static Admin getInstance() {

        return AdminHolder.INSTANCE;
    }
}