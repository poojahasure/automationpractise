package method;

public class SimpleInterest {
	public static void main(String args[]) {
		SimpleInterest	obj = new SimpleInterest();
		int a=200,b,c;
		int ans=obj.calculate(100,1,2);
		System.out.println(ans);
	}
	public int calculate(int p,int r, int t) {
		
	int si=(p*r*t)/100;
	return si;
		
		
	}

}
