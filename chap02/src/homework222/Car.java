package homework222;

public class Car {
	String company;
	String model;
	int yea;
	public Car(String company, String model) {
		this.company = company;
		this.model = model;
	}
	
	public Car(int yea) {
		if(yea>2000)
			this.yea = yea;
		else
			this.yea = 2000;
	}

	
	public Car(String company, int yea) {
		this(yea);
		this.company = company;
		
	}

	public Car(String company) {
		
		this.company = company;
	}

	public Car() {
	}
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + "]";
	}
	
	
}
