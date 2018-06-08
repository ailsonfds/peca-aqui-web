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
public class Location {
    
    private Establishment establishment;
    
    private List<Item> stock;
    
    private List<Tabble> tabbles;
    
    private Address address;

    public Location() {

    }

    public Location(Establishment establishment) {
        this.establishment = establishment;
    }
    
    public Location(Establishment establishment, Address address) {
        this.establishment = establishment;
        this.address = address;
    }

    public Location(Establishment establishment, List<Item> stock, List<Tabble> tabbles, Address address) {
        this.establishment = establishment;
        this.stock = stock;
        this.tabbles = tabbles;
        this.address = address;
    }

    public Establishment getEstablishment() {
        return establishment;
    }

    public void setEstablishment(Establishment establishment) {
        this.establishment = establishment;
    }

    public List<Item> getStock() {
        return stock;
    }

    public void setStock(List<Item> stock) {
        this.stock = stock;
    }

    public List<Tabble> getTabbles() {
        return tabbles;
    }

    public void setTabbles(List<Tabble> tabbles) {
        this.tabbles = tabbles;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean addItem(Item item){
        return this.stock.add(item);
    }
    
    public boolean removeItem(Item item){
        return this.stock.remove(item);
    }
    
    public boolean replaceItem(Item item){
        if(this.stock.contains(item)){
            if(!this.stock.remove(item)){
                return false;
            } else
                return this.stock.add(item);
        }
        return this.stock.add(item);
    }
    
    public boolean addTabble(Tabble tabble){
        return this.tabbles.add(tabble);
    }
    
    public boolean removeTabble(Tabble tabble){
        return this.tabbles.remove(tabble);
    }
    
    public boolean replaceTabble(Tabble tabble){
        if(this.tabbles.contains(tabble)){
            if(!this.tabbles.remove(tabble)){
                return false;
            } else
                return this.tabbles.add(tabble);
        }
        return this.tabbles.add(tabble);
    }
    
}
