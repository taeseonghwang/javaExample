package homework222;

public class CarExample {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		myCar1.company = "현대자동차";
		myCar1.model = "그랜져";

		Car myCar2 = new Car("기아");
		System.out.println(myCar1);
		System.out.println(myCar2);
		
		Car myCar3 = new Car("삼성", "모델");
		System.out.println(myCar3);
	}

}
