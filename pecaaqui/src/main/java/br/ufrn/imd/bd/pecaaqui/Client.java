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
public class Client extends User{
    
    private int level;
    
    private List<Order> orders;
    
    public Client(){
        super();
    }

    public Client(int level) {
        super();
        this.level = level;
    }

    public Client(int level, List<Order> orders) {
        super();
        this.level = level;
        this.orders = orders;
    }
    
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    
    public boolean addOrder(Order order){
        return this.orders.add(order);
    }
    
    public boolean removeOrder(Order order){
        return this.orders.remove(order);
    }
    
    public boolean replaceDish(Order order){
        if(this.orders.contains(order)){
            if(!this.orders.remove(order)){
                return false;
            } else
                return this.orders.add(order);
        }
        return this.orders.add(order);
    }
    
}
