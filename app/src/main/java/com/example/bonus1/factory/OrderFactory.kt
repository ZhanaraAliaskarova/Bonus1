package com.example.bonus1.factory

object OrderFactory {
    fun getOrderAdapter(method: DeliverMethod): IOrderAdapter{
        return when(method){
            DeliverMethod.HOME_DELIVERY -> HomeDeliveryAdapter()
            DeliverMethod.STORE_PICKUP -> StorePickupAdapter()
        }
    }
}