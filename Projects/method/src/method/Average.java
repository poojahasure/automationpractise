package method;

public class Average {
	public static void main(String args[]) {
		int a=10,b=20,c=30;
		Average obj= new Average();
		System.out.println(obj.sum(10,20,30));
		System.out.println(obj.sum(1,2,3));
		
		
		
	}
	public int sum (int x,int y, int z) {
		
	int avg=(x+y+z)/3;
	return avg;
		
	}
   public Average() {
	   System.out.println("called constructor  ");
   }

}
