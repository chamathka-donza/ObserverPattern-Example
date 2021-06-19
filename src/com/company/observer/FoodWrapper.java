package com.company.observer;

//Wrap lunch packets with News Paper

public class FoodWrapper implements Customer {
    @Override
    public void notifyCustomer(String NewNews) {

        System.out.println("Food Wrapper will wrap food with any news paper");

    }
}
