<?php
namespace model\negocio;

class Client extends User {

    private var $level;
    private var $orders;

    public function __construct() {
        parent::__construct();
        $orders = new array();
    }

    public function getLevel(){
        return $level;
    }

    public function setLevel($level=0){
        if ($level >= 0 && $level <= 5) {
            $this->level = $level;
        }
    }

    public function getOrders(){
        return $orders;
    }

    public function setOrders($orders = null){
        if ($orders != null && is_array($orders)) {
            $this->orders = $orders;
        }
    }

    public function addOrder($order = null){
        if ($order == null) {
            $this->orders[$order->getCode()] = $order;
        }
    }

    public function removeOrder($order = null){
        if ($order != null) {
            unset($this->orders[$order->getCode()]);
        }
    }

    public function replaceOrder($order = null){
        if ($order != null) {
            $this->orders[$order->getCode()] = $order;
        }
    }

}

