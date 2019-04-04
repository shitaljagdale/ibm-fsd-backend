package com.ibm.spring.hibernate.client;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.spring.hibernate.Item;
import com.ibm.spring.hibernate.Order;

public class SpringHibernateMain {
	private static SessionFactory sessionFactory;
	private static Session session;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
		 sessionFactory=(SessionFactory) ctx.getBean("sessionFactoryBean");
		
		Order order1=new Order();
		order1.setCustomer("Shital");
		
		Item item1=new Item();
		item1.setProduct("Spring in action book");
		item1.setPrice(450);
		item1.setQuantity(3);
		
		order1.setItems(Arrays.asList(item1));
		
		Long orderId1=createOrder(order1);
		Long orderId2=createOrder(order1);
		
		session.save(orderId1);
		session.save(orderId2);
		
	
		
		showOrders();
	}
	private static void updateOrder(Order orderId,String customerName) {
		 session=sessionFactory.openSession();
		 Order orederForUpdate=(Order)session.get(Order.class, orderId);
		 orederForUpdate.setCustomer(customerName);
		session.update(orederForUpdate);
		
	}

	private static Long createOrder(Order order) {
		 session=sessionFactory.openSession();
		System.out.println("Session "+sessionFactory);
		Long orderId=(Long) session.save(order);
		System.out.println("Ordr added sussfully. ID -"+orderId);
		return orderId;
		
	}
	private static void showOrders() {
		 session=sessionFactory.openSession();
		 List<Order> orders=session.createQuery("select o from order o ").list();
		 
		
		if(orders.size()>0) {
		System.out.println("\n Order Id \t Customer");
		}
		else {
			System.out.println("No Oredr Found");
		}
		for(Order order:orders) {
			System.out.printf("%d \t %s \n",order.getId(),order.getCustomer());
		}
		
		
	}

}
