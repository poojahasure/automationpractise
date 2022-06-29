package org.singleton;

class SingleT{
	private int a=10;
    private static SingleT obj= new SingleT();//step 1  //step4
    
    public static SingleT getObj() { // nonstatic// step2 //step3 static
    	return obj;
    }
	
    private SingleT(){
    	
    }
	public int getA() {
		return a;
	}
	public void display() {
		System.out.println("Display");
	}
	
	
	
}
public class SingleTone {
    public static void main(String []args) {
     SingleT obj =SingleT.getObj();
     obj.display();
     SingleT.getObj().display();
     
//   	System.out.println(obj.getA());
    }
}
