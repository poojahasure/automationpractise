package org.infosys.com;


	class Customer{
	    public int customerId;
	    public String customerName;
	    
	    
	    public Customer(int customerId,String customerName ) {
	        this.customerId=customerId;
	        this.customerName=customerName;
	        System.out.println("Parameterized constructor in class Customer");
	        
	    }
	    
	    public void buy_products() {        
	        System.out.println("Customer purchased products");
	    }
	    
	    public int changeNum(int num) {
	        num+=5;
	        return num;
	        
	    }
	    
	    public void updateNum(int num) {
	        num+=10;
	        System.out.println(num);
	                
	    }
	    
	    public void updateName(Customer obj) {
	        obj.customerName="John Nathan";
	        System.out.println(obj.customerName);
	        
	    }
	    

	public class Program {
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        
	        Customer c1=new Customer(101,"Jack");
	        Customer c2=new Customer(102,"John");
	        
	        //Customer c3=c2;
	        
	        
	    
	        
	        System.out.println(c1.customerId);
	        System.out.println(c1.customerName);
	        
	        c1.buy_products();
	        
	        
	        
	        System.out.println(c2.customerId);
	        System.out.println(c2.customerName);
	        
	        c2.buy_products();
	        
//	        System.out.println(c1);
//	        System.out.println(c2);
//	        System.out.println(c3);
	        
	        int n=c1.changeNum(6);
	        System.out.println(n);
	        System.out.println(c2.changeNum(8));
	        
	        int count = 8;
	        System.out.println(count);
	        c1.updateNum(count);
	        System.out.println(count);
	        
	        System.out.println(c2.customerName);
	        c2.updateName(c2);
	        System.out.println(c2.customerName);
	        
	    }
	}

}
