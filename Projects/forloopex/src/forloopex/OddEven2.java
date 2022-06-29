package forloopex;

public class OddEven2 {
	
	public static void main(String args[]) {
		
		for(int i=1;i<=100;i=i+1) {
		// i++ , i=i+1
			// i+=3 ,i=i+3
			//i+=90 ,i=i+90
			//i*=7,i=i*7
			if(i%2==0) {
				
				System.out.println(i+" is a even no");
			}else {
				
				System.out.println(i+" is a odd no");
			}
		}
	}

}
