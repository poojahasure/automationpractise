package org.infosys.com;

public class xyz {

}
Association(Uses-A)
when an obj of another class is referred as local var in another class
local var-method
Ex: Customer Card
class Customer uses class Card
Aggregation:
//B has A
//A a=new A();
//B b=new B(a); //instance var
//Association:
//A a=new A();
//B b=new B();
//a.method(b); //local var
//    
class Customer{
    public String customerName;
    public Customer(String customerName) {
        this.customerName=customerName;
    }
    public void displayDetails(Card card) {
        System.out.println(this.customerName+" uses the card "+card.cardType);
    }
}
class Card{
    public String cardType;
    public Card(String cardType) {
        this.cardType=cardType;
    }
}
public class Tester{
    public static void main(String[] args) {
        Customer custObj=new Customer("Robert");
        Card cardObj=new Card("Ruby");
        custObj.displayDetails(cardObj);
    }
}