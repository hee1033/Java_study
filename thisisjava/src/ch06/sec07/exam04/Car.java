package ch06.sec07.exam04;

public class Car {
	
	String company ="현대 자동차";
	String model; 
	String color;
	int maxSpeed;
	
	Car(){
		System.out.println("1");
	}
	
	Car(String model){
		System.out.println("2");
		this.model = model;
	}
	Car(String model,String color){
		System.out.println("3");
		this.model = model;
		this.color = color;
	}
	Car(String model, String color,int maxSpeed){
		System.out.println("4");
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
