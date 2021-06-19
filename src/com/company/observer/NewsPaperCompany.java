package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPaperCompany {

    List<Customer> customers = new ArrayList<>();

    //subscribe
    public void subscribe(Customer customer) {
        customers.add(customer);
    }

    //unsubscribe
    public void unsubscribe(Customer customer) {
        customers.remove(customer);
    }

    public void notifyCustomer(String NewNews){

        for (Customer customer : customers) {
            customer.notifyCustomer(NewNews);
        }

    }

}
