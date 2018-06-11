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
class Menu {

    private String category;
    
    private Establishment establishment;
    
    private List<Dish> dishes;

    public Menu() {
        
    }

    public Menu(String category, Establishment establishment) {
        this.category = category;
        this.establishment = establishment;
    }

    public Menu(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Establishment getEstablishment() {
        return establishment;
    }

    public void setEstablishment(Establishment establishment) {
        this.establishment = establishment;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    
    public boolean addDish(Dish dish){
        return this.dishes.add(dish);
    }
    
    public boolean removeDish(Dish dish){
        return this.dishes.remove(dish);
    }
    
    public boolean replaceDish(Dish dish){
        if(this.dishes.contains(dish)){
            if(!this.dishes.remove(dish)){
                return false;
            } else
                return this.dishes.add(dish);
        }
        return this.dishes.add(dish);
    }    
}
