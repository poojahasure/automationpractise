package newpro;

public class Primeno {
	public static void main(String [] args) {
		Primeno obj =new Primeno();
		obj.prime();
	}
	public void prime() {
		int n=3;
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				
				System.out.println("no prime");
//				break;
			
			}else {
				System.out.println(n+"prime");
			}
			
		}
		
		
		
		
	}

}
