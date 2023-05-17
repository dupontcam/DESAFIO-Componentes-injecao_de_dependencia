package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public double total(Order order){
        double shippingValue = shippingService.shipment(order);
        double discountValue = order.getBasic() * order.getDiscount() /100.0;
        double totalOrder = order.getBasic() - discountValue + shippingValue;
        return totalOrder;
    }
}
