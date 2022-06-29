package org.infosys.com;

class Trainee{
    public int score=90;  
    public  void changeScore() {
        System.out.println(score);
    }
}
class GenericTrainee extends Trainee{  //inheritance(Is-A)
    public void changeScore() {
        score=95;
        System.out.println(score);
    }
}
public class Tester5{
    public static void main(String[] args) {
        GenericTrainee obj=new GenericTrainee(); //creating an object for GenericTrainee class
        obj.changeScore();        
    }
  } 

/*final class Trainee{
    public int score=90;  
}
class GenericTrainee extends Trainee{  //inheritance(Is-A)
}
public class Tester{
    public static void main(String[] args) {
        GenericTrainee obj=new GenericTrainee(); //creating an object for GenericTrainee class        
    }
}
*/
/*
 class Trainee{
    public final int score; //blank final variable(not declared/not initialized)
    public Trainee() {
        score=95;
    }
}
public class Tester{
    public static void main(String[] args) {
        Trainee obj=new Trainee(); //creating an object for GenericTrainee class        
    }
} */
 