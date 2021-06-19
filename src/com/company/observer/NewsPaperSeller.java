package com.company.observer;

//Sell News Paper

public class NewsPaperSeller implements Customer {
    @Override
    public void notifyCustomer(String NewNews) {

        System.out.println("Hot hot news here get buy a news paper and know what is going on");

    }
}
