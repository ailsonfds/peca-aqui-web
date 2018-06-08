/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.imd.bd.pecaaqui;

/**
 *
 * @author Ailson F. dos Santos
 */
public class Item {
    
    private String name;

    private String description;
    
    private int ammount;
    
    private double costPrice;
    
    private String category;
    
    public Item(){
        
    }

    public Item(String name, double costPrice, String category) {
        this.name = name;
        this.costPrice = costPrice;
        this.category = category;
    }

    public Item(String name, int ammount, double costPrice, String category) {
        this.name = name;
        this.ammount = ammount;
        this.costPrice = costPrice;
        this.category = category;
    }

    public Item(String name, String description, int ammount, double costPrice, String category) {
        this.name = name;
        this.description = description;
        this.ammount = ammount;
        this.costPrice = costPrice;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
}
