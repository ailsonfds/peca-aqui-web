<?php
namespace model\negocio;

abstract class User {

    private var $firstName;
    private var $lastName;
    private var $login;
    private var $password;
    private var $email;
    private var $logged;
    private var $ingressDate;
    private var $location;
    
    public function __construct() {
        $firstName = '';
        $lastName = '';
        $login = '';
        $password = '';
        $email = '';
        $logged = false;
        $ingressDate = date("Y-m-d H:i:s", $phptime);
        $location = new Location();
    }
    
    public function getFirstName() {
        return $this->firstName;
    }
    
    public function setFirstName($firstName = '') {
        if ($firstName != '' && $firstName != null) {
            $this->firstName = $firstName;
        }
    }
    
    public function getLastName() {
        return $this->lastName;
    }
    
    public function setLastName($lastName = '') {
        if ($lastName != '' && $lastName != null) {
            $this->lastName = $lastName;
        }
    }
    
    public function getLogin() {
        return $this->login;
    }
    
    public function setLogin($login = '') {
        if ($login != '' && $login != null) {
            $this->login = $login;
        }
    }
    
    public function getPassword() {
        return $this->password;
    }
    
    public function setPassword($password = '') {
        if ($password != '' && $password != null) {
            $this->password = $password;
        }
    }
    
    public function getEmail() {
        return $this->email;
    }
    
    public function setEmail($email = '') {
        if ($email != '' && $email != null) {
            $this->email = $email;
        }
    }
    
    public function isLogged() {
        return $this->logged;
    }
    
    public function setLogged($logged = false) {
        $this->logged = $logged;
    }
    
    public function getIngressDate() {
        return $this->ingressDate;
    }
    
    public function setIngressDate($ingressDate = date("Y-m-d H:i:s", $phptime)) {
        $this->ingressDate = $ingressDate;
    }

    public function getLocation() {
        return $this->location;
    }
    
    public function setLocation($location = null) {
        if ($location != null) {
            $this->location = $location;
        }
    }
}

