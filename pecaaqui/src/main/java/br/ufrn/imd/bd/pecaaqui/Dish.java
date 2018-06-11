/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.imd.bd.pecaaqui;

import java.util.List;

/**
 *
 * @author Ailson F. dos Santos
 */
public class Dish {
    
    private double sellPrice;
    
    private List<Item> items;

    private Menu menu;
    
    public Dish() {
    
    }

    public Dish(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Dish(double sellPrice, Menu menu) {
        this.sellPrice = sellPrice;
        this.menu = menu;
    }

    public Dish(double sellPrice, List<Item> items, Menu menu) {
        this.sellPrice = sellPrice;
        this.items = items;
        this.menu = menu;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    
    public boolean addItem(Item item){
        return this.items.add(item);
    }
    
    public boolean removeItem(Item item){
        return this.items.remove(item);
    }
    
    public boolean replaceItem(Item item){
        if(this.items.contains(item)){
            if(!this.items.remove(item)){
                return false;
            } else
                return this.items.add(item);
        }
        return this.items.add(item);
    }
}
