package com.company.observer;

//Read news in the News Paper

public class NewsReader implements Customer {
    @Override
    public void notifyCustomer(String NewNews) {

        System.out.println("News Reader is Reading the news : " + NewNews);

    }
}
