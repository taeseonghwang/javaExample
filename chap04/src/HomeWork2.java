import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x =0;
		int y=10;
		
		if(x>0 && y>0) {
			System.out.println("제 1사분면: ");
		} else if( x<0 && y>0) {
			System.out.println("제 2사분면: ");
		} else if( x<0 && y<0) {
			System.out.println("제 3사분면: ");
		} else {
			System.out.println("제 4사분면: ");
			
		}
		
		
//		
//		System.out.println("가위바위보");
//		String a = scanner.nextLine();
//
//		//"이기기 위해선 바위를 내야합니다." 라고 출력하도록 하세요
//		switch(a) {
//		case "가위":
//		System.out.println("비김");
//		break;
//		case "바위":
//		System.out.println("비김");
//		break;
//		case "보":
//		System.out.println("이김");
//		break;
//		}
//		System.out.println("이기기 위해선 바위를 내야한다");
		
		
		String str = "*";
		System.out.println("문제 별");
		for(int i=0; i<1; i++) {
			for(int j=i; j<0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
	}
	}