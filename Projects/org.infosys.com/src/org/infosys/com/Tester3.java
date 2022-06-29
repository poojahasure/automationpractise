package org.infosys.com;

class Costomer{
    private String name;
    private int id;
    private int age;
    public int doorNO=131;
    
    public Costomer(String name, int id, int age,int doorNO) {//step4 //step10 //step17
        this.name=name; //step5 //step11 //step18
        this.id=id;
        this.age=age;
        this.doorNO=doorNO;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge() {
    	this.age=age;
    }
    public void display() {
    	System.out.println(this.name+ ":"+this.age);
    }
    public void displayName() {
    	System.out.println(this.name);
    }
}
class PremiumCustomer extends Costomer{
	private int discount;
	private String address;
	public int doorNO=132;
	public PremiumCustomer(String name, int id, int age,int doorNO,int discount,String address) {
		super(name,id,age,doorNO);
        this.discount =discount;
        this.address=address;
    }
	 
public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


public void displayAddress() {
    System.out.println(this.address);
}
public void display() { //step8 //step21
    System.out.println(this.discount+":"+this.address);
}
}

public class Tester3 {

public static void main(String args[]){
    PremiumCustomer obj=new PremiumCustomer("John",1001,21,131,5,"New York");//step1
    obj.display();// child method //step7
    Costomer obj1=new Costomer("Mary",1002,24,132);//step9
    obj1.display();//parent method //step12
    Costomer obj2=new PremiumCustomer("Sherlock",1003,24,132,6,"Baker Street");//step 14
    obj2.display(); //child method //step20
    obj2.displayName(); //step22
    System.out.println(obj2.doorNO); //131 // data hiding //parent
    //base class referencing // child method
    //i can have access to evrything apart from display which is present in customer
    // but i can access only the overriden method of child
    //method overriding // dynamic polymorphism // present in different class
     
}
}


