package org.inheritance;


class Camera {
	private String brand;
	private double cost;

	public Camera() {
		this.brand = "Canon";
		this.cost=100;
	}
    
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}

class DigitalCamera extends Camera {
	private int memory;

	public DigitalCamera(String brand, double cost) {
		super();
		this.memory = 16;
	}
    
    public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
}

class Tester {
	public static void main(String[] args) {
        DigitalCamera camera = new DigitalCamera("Canon",100);
        System.out.println(camera.getBrand()+" "+camera.getCost()+" "+camera.getMemory());
    }
}