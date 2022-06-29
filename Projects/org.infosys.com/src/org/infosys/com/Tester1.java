package org.infosys.com;
class Area{
    
    public void display(int breadth,int length) {
        System.out.println(breadth*length);//area of a circle
    }
    public void display(float length,double breadth ) {
        System.out.println(length*breadth);
    }
}
public class Tester1 {
    public static void main(String[] args) {
        
        Area obj=new Area();
        obj.display(4.5f, 5.34f);
}
}
