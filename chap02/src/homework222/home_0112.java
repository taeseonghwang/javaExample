package homework222;

import java.util.Scanner;

public class home_0112 {
	public static void main(String[] args) {
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//	출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		
		Item[] itArr = null;
		int itnum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("=======================================================");
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("=======================================================");
			System.out.println("번호을 입력하세요>");
			int num = Integer.parseInt(sc.nextLine());
			if(num==1) {
				System.out.println("상품 수 입력>");
				itnum = Integer.parseInt(sc.nextLine());	
			} else if (num==2) {
				itArr = new Item[itnum]; 
				for(int i=0; i<itArr.length; i++) {
					itArr[i] = new Item();
					System.out.println((i+1) +"번째 상품 명 입력>");
					itArr[i].itemName = sc.nextLine();
					System.out.println((i+1) + "번째 가격 입력>");
					itArr[i].price = Integer.parseInt(sc.nextLine());
				}
				
			}else if(num==3) {
				for(Item temp : itArr) {
					temp.getInfo();
				}
			} else if(num==4) {
				int max = itArr[0].price;
				String maxItem = "";
				int total = 0;
				for(Item temp: itArr) {
					total += temp.price;
					
					if(max<temp.price) {
						max = temp.price;
					maxItem = temp.itemName;
					}
				}
				System.out.println("최고 가격 상품 : " + maxItem + " 가격: " + max);
				System.out.println("나머지 제품 총 가격 : " + (total- max));
				
				
				
			} else if(num==5) {
				System.out.println("종료합니다");
				break;
			}
		}

	}

}
