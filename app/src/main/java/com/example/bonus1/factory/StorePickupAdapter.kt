package com.example.bonus1.factory

class StorePickupAdapter: IOrderAdapter {
    override fun makeOrderDelivery() {
        print("The order will be delivered in store")
    }
}