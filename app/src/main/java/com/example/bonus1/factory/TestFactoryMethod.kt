package com.example.bonus1.factory

fun main(){
    var methodDelivery = OrderFactory.getOrderAdapter(DeliverMethod.STORE_PICKUP).also {
        it.makeOrderDelivery()
    }
}