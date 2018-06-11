<?php
namespace model\negocio;

abstract class User {
    protected $firstName;
    protected $lastName;
    protected $login;
    protected $password;
    protected $email;
    protected $logged;
    protected $ingressDate;
    protected $location
    
    public function User() {
        $location = new Location();
    }
    
    public function getFirstName() {
        return $this->firstName;
    }
    
    public function setFirstName($firstName) {
        $this->firstName = $firstName;
    }
    
    public function getLastName() {
        return $this->lastName;
    }
    
    public function setLastName($lastName) {
        $this->lastName = $lastName;
    }
    
    public function getLogin() {
        return $this->login;
    }
    
    public function setLogin($login) {
        $this->login = $login;
    }
    
    public function getPassword() {
        return $this->password;
    }
    
    public function setPassword($password) {
        $this->password = $password;
    }
    
    public function getEmail() {
        return $this->email;
    }
    
    public function setEmail($email) {
        $this->email = $email;
    }
    
    public function isLogged() {
        return $this->logged;
    }
    
    public function setLogged($logged) {
        $this->logged = $logged;
    }
    
    public function getIngressDate() {
        return $this->ingressDate;
    }
    
    public function setIngressDate($ingressDate) {
        $this->ingressDate = $ingressDate;
    }
}

