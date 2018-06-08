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
public class Order {
    
    private String code;
    
    private double value;
    
    private Establishment establishment;
    
    private Client client;
    
    private List<Dish> dishes;
    
    public Order(){
        
    }

    public Order(String code, Establishment establishment, Client client) {
        this.code = code;
        this.establishment = establishment;
        this.client = client;
    }

    public Order(String code, double value, Establishment establishment, Client client) {
        this.code = code;
        this.value = value;
        this.establishment = establishment;
        this.client = client;
    }

    public Order(String code, double value, Establishment establishment, Client client, List<Dish> dishes) {
        this.code = code;
        this.value = value;
        this.establishment = establishment;
        this.client = client;
        this.dishes = dishes;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Establishment getEstablishment() {
        return establishment;
    }

    public void setEstablishment(Establishment establishment) {
        this.establishment = establishment;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
    
}
