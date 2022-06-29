package org.infosys.com;

class Customer
{
    //instance variables or attributes
    private String customerName;
    private String customerId;
    private String customerAddress;
    private long customerContact;
    
    //Initialize object using default constructor
    public Customer()
    {
        customerName = "Jagdish";
        customerId = "C101";
        customerAddress ="Door No76 Kingston Street,Melbourne";
        customerContact = 9876543210L;
    }
    
    //getter methods
    public String getCustomerName()
    {
        return customerName;
    }
    public String getCustomerAddress()
    {
        return customerAddress;
    }
    public String getCustomerId()
    {
        return customerId;
    }
    public long getCustomerContact()
    {
        return customerContact;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    public void setCustomerId(String customerId)
    {
        this.customerId = customerId;
    }
  
    
    public void setCustomerAddress(String customerAddress)
    {
        this.customerAddress = customerAddress;
    }
    public void setCustomerContact(long customerContact)
    {
        this.customerContact = customerContact;
    }
}
public class Test
{
    public static void main(String[] args)
    {
        Customer customer1 = new Customer();
        System.out.println("Customer 1 Details:");
        System.out.println(customer1.getCustomerName());
        System.out.println(customer1.getCustomerId());
        System.out.println(customer1.getCustomerAddress());
        System.out.println(customer1.getCustomerContact());
        
        Customer customer2 = new Customer();
        customer2.setCustomerName("Anand Kumar");
        customer2.setCustomerId("C102");
        customer2.setCustomerAddress("Door No45 HillSton St.");
        customer2.setCustomerContact(988776521L);
        System.out.println("Customer 2 Details:");
        System.out.println(customer2.getCustomerName());
        System.out.println(customer2.getCustomerId());
        System.out.println(customer2.getCustomerAddress());
        System.out.println(customer2.getCustomerContact());
    }
}