package com.company.observer;

//Make decoration items with News Paper

public class DecoCreator implements Customer {
    @Override
    public void notifyCustomer(String NewNews) {

        System.out.println("Deco Creator will make PAPER TOOL DECORATIONS with news papers");

    }
}
