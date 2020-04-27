package com.codewizard.unittesttutorial.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Item {

    @Id
    int id;
    String name;
    int price;
    int quantity;

    @Transient
    private int value;

    public Item(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }
    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return String.format("Item[%d, %s, %d, %d]", id, name, price, quantity);
    }



}
