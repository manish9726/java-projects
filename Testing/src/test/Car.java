package test;

public class Car {

	
	private String model;
	private String[] features;
	public Car(String model, String...features) {
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		
		System.out.println("Features of "+model);
		for(String feature: features) {
			
			System.out.println(feature);
		}
	}
	
	public static void main(String[] args) {
		
		Car alto = new Car("alto","Power Stearing", "power window", "Keyless Entry");
		alto.specs();
		
		
		Car jazz = new Car("Jazz","Pano Roof","ABS" ,"Auto gears", "Keyless Start","Cruise");
		jazz.specs();
		
	}
	
}
