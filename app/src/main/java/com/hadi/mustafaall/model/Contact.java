package com.hadi.mustafaall.model;

/**
 * this is the object to inflate in the recycler view adapter
 * contact consist of name and number for now
 *
 * @author Hadi Ahmed
 * @version 1.0
 * @since 25th, Oct 2019
 */
public class Contact {
    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
