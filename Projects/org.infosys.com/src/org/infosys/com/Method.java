package org.infosys.com;

class Order{
	
	public int orderId;
	public String orderedFoods;
	public double totalPrice;
	public String status;
	
	public double calculateTotalPrice(int unitPrice) {
		
		totalPrice +=0.05*unitPrice;
		return totalPrice;
	}
	
}

public class Method {
	
	public static void main(String [] args) {
		
		Order order1 =new Order();
		order1.orderId=121;
		 order1.orderedFoods="pizza";
		
		order1.status="ordered";
		order1.calculateTotalPrice(120);
		System.out.println(order1.orderId);
		System.out.println( order1.orderedFoods);
		System.out.println(order1.status);
		System.out.println(order1.calculateTotalPrice(120));
	}

}
