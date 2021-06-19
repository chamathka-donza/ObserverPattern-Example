package com.company.observer;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        //NewsPaperCompany -> Subject
        //Subscribers/Customers -> Observer
        //Types of Observers -> NewsReaders, FoodWrappers, DecoCreators, NewsPaperSellers


        Customer customer1 = new NewsReader();
        Customer customer2 = new DecoCreator();
        Customer customer3 = new FoodWrapper();
        Customer customer4 = new NewsReader();
        Customer customer5 = new NewsPaperSeller();


        NewsPaperCompany newsPaperCompany = new NewsPaperCompany();
        newsPaperCompany.subscribe(customer1);
        newsPaperCompany.subscribe(customer2);
        newsPaperCompany.subscribe(customer3);
        newsPaperCompany.subscribe(customer4);

        newsPaperCompany.notifyCustomer("Assignment deadline is at 23.59 today");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        Thread.sleep(5000); // wait for 5 seconds

        newsPaperCompany.unsubscribe(customer1);

        newsPaperCompany.notifyCustomer("Students are over stressed with the work");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        Thread.sleep(5000); // wait for 5 seconds

        newsPaperCompany.subscribe(customer5);

        newsPaperCompany.notifyCustomer("News paper is the only example i got in my mind");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        Thread.sleep(5000); // wait for 5 seconds

        newsPaperCompany.unsubscribe(customer4);
        newsPaperCompany.subscribe(customer1);

        newsPaperCompany.notifyCustomer("Finally news paper readers ara gone except customer1");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        Thread.sleep(5000); // wait for 5 seconds





    }
}
