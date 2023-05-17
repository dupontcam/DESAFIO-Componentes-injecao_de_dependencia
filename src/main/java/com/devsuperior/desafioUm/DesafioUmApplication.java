package com.devsuperior.desafioUm;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class DesafioUmApplication implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioUmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.00, 20.0);
		System.out.println();
		System.out.println("Pedido codigo: " + order.getCode());
		System.out.println(String.format("Valor total: R$ %.2f%n", orderService.total(order)));

		Order order1 = new Order(2282, 800.00, 10.0);
		System.out.println();
		System.out.println("Pedido codigo: " + order1.getCode());
		System.out.println(String.format("Valor total: R$ %.2f%n", orderService.total(order1)));

		Order order2 = new Order(1309, 95.00, 0.0);
		System.out.println();
		System.out.println("Pedido codigo: " + order2.getCode());
		System.out.println(String.format("Valor total: R$ %.2f%n", orderService.total(order2)));
	}
}
