package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){
        double shippingValue = 0.0;
        if(order.getBasic() < 100.0){
            shippingValue = 20.0;
        } else if (order.getBasic() < 200.0) {
            shippingValue = 12.0;
        } else {
            shippingValue = 0.0;
        }
        return shippingValue;
    }
}
