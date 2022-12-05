package com.example.bonus1.factory

class HomeDeliveryAdapter: IOrderAdapter {
    override fun makeOrderDelivery() {
        print("The order will be delivered at home")
    }
}