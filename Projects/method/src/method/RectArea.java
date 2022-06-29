package method;

public class RectArea {
	public static void main(String args[]) {
		int x=2 ,y=3;
		RectArea obj =new RectArea();
		System.out.println("Area of rectangle is="+obj.area(2,3));
		
	}

	public int area(int l,int b) {
		int area1=l*b;
		return area1;
	}
	
}
