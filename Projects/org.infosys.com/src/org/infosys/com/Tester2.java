package org.infosys.com;

class CabServiceProvider{
    //Implement your code here
}

class Driver {
	
	private String driverName;
	private float averageRating;
	
	public Driver(String driverName, float averageRating){
		this.driverName=driverName;
		this.averageRating=averageRating;
	}
	
	public String getDriverName(){
		return this.driverName;
	}
	
	public void setDriverName(String driverName){
		this.driverName=driverName;
	}
	
	public float getAverageRating(){
		return this.averageRating;
	}
	
	public void setAverageRating(float averageRating){
		this.averageRating=averageRating;
	}

public double calculateRewardPrice(Driver driver){//Line1 //accessible only inside method
    float rating = driver.getAverageRating();
    double reward=0;
    if(this.cabServiceName.equals("Halo")) {
        if(rating>=4.5 &&rating<=5) {
            reward=rating*10;
        }else if(rating>=4 && rating<4.5) {
            reward=rating*5;
        }
    }else if(this.cabServiceName.equals("Aber")) {
        if(rating>=4.5 &&rating<=5) {
            reward=rating*8;
        }else if(rating>=4 && rating<4.5) {
            reward=rating*3;
        }
    }
    return Math.round(reward*100)/100.0; 
    
}
    //DO NOT MODIFY THE METHOD
    //Your exercise might not be verified if the below method is modified
    public String toString(){
        return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;
    }
}

class Tester2 {
	
	public static void main(String args[]){
	    CabServiceProvider cabServiceProvider1 = new CabServiceProvider("Halo", 50);

		Driver driver1 = new Driver("Luke", 4.8f);
		Driver driver2 = new Driver("Mark", 4.2f);
		Driver driver3 = new Driver("David", 3.9f);
		
		Driver[] driversList = { driver1, driver2, driver3 };
		for (Driver driver : driversList) {
			System.out.println("Driver Name: "+driver.getDriverName());
			double bonus = cabServiceProvider1.calculateRewardPrice(driver);
			if (bonus>0)
				System.out.println("Bonus: $"+bonus+"\n");
			else
				System.out.println("Sorry, bonus is not available!");
		}
		
		//Create more objects of CabServiceProvider and Driver classes for testing your code
	}
}

