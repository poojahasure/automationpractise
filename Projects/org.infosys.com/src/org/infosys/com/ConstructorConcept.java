package org.infosys.com;


	class Customer{
	    public int customerId;
	    public String customerName;
	    
	    
	    
	    public Customer(int id,String name ) {
	        customerId=id;
	        customerName=name;
	        System.out.println("Parameterized constructor in class Customer");
	        
	    }
	    
	    public void buy_products() {        
	        System.out.println("Customer purchased products");
	    }
	    
	    
	}


	    	public class ConstructorConcept {
	    	    public static void main(String[] args) {
	    	        // TODO Auto-generated method stub
	    	        
	    	        Customer c1=new Customer(101, "Jack");
	    	        Customer c2=new Customer(102, "John");
	    	        
	    	    
	    	        
	    	        System.out.println(c1.customerId);
	    	        System.out.println(c1.customerName);
	    	        
	    	        c1.buy_products();
	    	        
	    	        
	    	        
	    	        System.out.println(c2.customerId);
	    	        System.out.println(c2.customerName);
	    	        
	    	        c2.buy_products();
	    	        
	    	    }
	    	}
	    


