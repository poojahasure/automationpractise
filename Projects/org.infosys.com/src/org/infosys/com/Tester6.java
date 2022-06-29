package org.infosys.com;
abstract class Trainee{
    public abstract void display();
}
abstract class ABC extends Trainee{
    public void display1() {
        System.out.println("Hi");
    }
}
class XYZ extends Trainee{
    public void display() {
        
    }
}
public class Tester6{
    public static void main(String[] args) {
        XYZ obj=new XYZ();        
    }
}

