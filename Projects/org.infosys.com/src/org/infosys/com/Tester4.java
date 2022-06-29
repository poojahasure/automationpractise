package org.infosys.com;

class Trainee{
    public final float pi=3.14f;
    public void changeScore() {
     float   pi=3.15f; //updating the value of score
        System.out.println(pi);
    }
}
public class Tester4{
    public static void main(String[] args) {
        Trainee obj=new Trainee(); //creating an object for Trainee class
        obj.changeScore();        
    }
}

