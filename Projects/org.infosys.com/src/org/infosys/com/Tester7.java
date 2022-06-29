package org.infosys.com;

public class Tester7 {

}

public void calculateAverageMarks() { //96+65+76 /3
    int sum=0;
    int totalSubjects=marks.length;
    try {
        try {
            for (int i = 0; i <marks.length;i++) { 
                sum+=marks[i];
                if(marks[i]<0) {//the number is negative or not
                    throw new Exception("new error found!!");
                }
                
            }
            this.averageMarks=sum/totalSubjects;
            System.out.println("Average Marks: "+ this.averageMarks);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("array index out of bounds occured!!");
        }
        System.out.println("inner try executed!");
    }catch(ArithmeticException e) {
        System.out.println("divide by zero error occurred!!");
    }catch(Exception e) {
        //System.out.println("some error occured!!");
        System.out.println(e.getMessage());
    }finally {
        System.out.println("Program completed!!");
    }
    System.out.println("exception completed!!");
    
}
}
class Tester{
public static void main(String[] args

class Student {
    private String name;
    private int[] marks;
    private float averageMarks;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int[] getMarks() {
        return marks;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public float getAverageMarks() {
        return averageMarks;
    }
    public void setAverageMarks(float averageMarks) {
        this.averageMarks = averageMarks;
    }
    

