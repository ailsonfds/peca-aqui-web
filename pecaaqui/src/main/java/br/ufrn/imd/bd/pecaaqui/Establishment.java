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
public class Establishment {
    
    private String name;
    
    private String site;
    
    private String description;
    
    private String phone;
    
    private Long code;
    
    private Owner owner;
    
    private List<Order> orders;

    private List<Menu> menus;
    
    public Establishment(){
        
    }

    public Establishment(String name, String phone, Long code, Owner owner) {
        this.name = name;
        this.phone = phone;
        this.code = code;
        this.owner = owner;
    }

    public Establishment(String name, String phone, Long code, Owner owner, List<Order> orders) {
        this.name = name;
        this.phone = phone;
        this.code = code;
        this.owner = owner;
        this.orders = orders;
    }

    public Establishment(String name, String site, String description, String phone, Long code, Owner owner, List<Order> orders) {
        this.name = name;
        this.site = site;
        this.description = description;
        this.phone = phone;
        this.code = code;
        this.owner = owner;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
    
    public boolean addOrder(Order order){
        return this.orders.add(order);
    }
    
    public boolean removeOrder(Order order){
        return this.orders.remove(order);
    }
    
    public boolean replaceOrder(Order order){
        if(this.orders.contains(order)){
            if(!this.orders.remove(order)){
                return false;
            } else
                return this.orders.add(order);
        }
        return this.orders.add(order);
    }
    
    public boolean addMenu(Menu menu){
        return this.menus.add(menu);
    }
    
    public boolean removeMenu(Menu menu){
        return this.menus.remove(menu);
    }
    
    public boolean replaceMenu(Menu menu){
        if(this.menus.contains(menu)){
            if(!this.menus.remove(menu)){
                return false;
            } else
                return this.menus.add(menu);
        }
        return this.menus.add(menu);
    }
}
