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
public class Owner {
    
    private String cpf;
    
    private List<Establishment> establishments;
    
    public Owner(){
        super();
    }

    public Owner(String cpf) {
        this.cpf = cpf;
    }
    
    public Owner(String cpf, List<Establishment> establishments) {
        this.cpf = cpf;
        this.establishments = establishments;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Establishment> getEstablishments() {
        return establishments;
    }

    public void setEstablishments(List<Establishment> establishments) {
        this.establishments = establishments;
    }

    public boolean addEstablishment(Establishment establishment){
        return this.establishments.add(establishment);
    }
    
    public boolean removeEstablishment(Establishment establishment){
        return this.establishments.remove(establishment);
    }
    
    /*!
     * Replace if exist. Add otherwise.
     */
    public boolean replaceEstablishment(Establishment establishment){
        if(this.establishments.contains(establishment)){
            if(!removeEstablishment(establishment))
                return false;
            else
                return addEstablishment(establishment);
        }
        return addEstablishment(establishment);
    }

}
