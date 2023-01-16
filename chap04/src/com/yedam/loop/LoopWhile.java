package com.yedam.loop;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		//1~100사이의 2의 배수 
		int i =1;
		while(i<100) {
			if(i%2 ==0) {
				System.out.println(i);
				
			}
			i++;
		}
		//계산기 프로그램
		//무한 루프 조건으로 프로그램 실행
		
		//event(trigger) 프로그램 종료 -> break;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 종료");
			System.out.println("입력>");
			
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1:
				System.out.println("더하고자 하는 두 수를 입력>");
				System.out.println("1>");
				int num1 = Integer.parseInt(sc.nextLine());
				System.out.println("2>");
				int num2 = Integer.parseInt(sc.nextLine());
				int result = num1 + num2;
				System.out.println(num1 + "," +num2+"의 결과" + result);
				break;
			case 2:
				System.out.println("빼고자 하는 두 수를 입력>");
				System.out.println("1>");
				int num3 = Integer.parseInt(sc.nextLine());
				System.out.println("2>");
				int num4 = Integer.parseInt(sc.nextLine());
				int result1 = num3 - num4;
				System.out.println(num3 + "," +num4+"의 결과" + result1);
				break;
			case 3:
				System.out.println("곱고자 하는 두 수를 입력>");
				System.out.println("1>");
				int num5 = Integer.parseInt(sc.nextLine());
				System.out.println("2>");
				int num6 = Integer.parseInt(sc.nextLine());
				int result2 = num5 * num6;
				System.out.println(num5 + "," +num6+"의 결과" + result2);
				break;
			case 4:
				run = false;
				break;
				default:
					System.out.println("1~4사이 수를 입력해주세요");
					break;
				
			}
			//System.out.println("end of prog");

		}
		
		//게임만들기
		//가위, 바위, 보
		//앞, 뒤 맞추기
		//한 판에 500월
		int money;
		System.out.println("======insert coin====");
		money = Integer.parseInt(sc.nextLine());
		//10000 -> 20번
		//1500 -> 3번
		boolean flag = true;
		while(money > 500 && flag) { //money > 500
			System.out.println((money/500)+ "번의 기회가 남았습니다");
			System.out.println("1. 가위바위보 | 2. 앞 뒤 맞추 | 3. 종료");
			System.out.println("입력>");
			int gameNo = Integer.parseInt(sc.nextLine());
			
			switch(gameNo) {
			case 1:
				//컴퓨터와 가위, 바위, 보
				//가위 -> 1
				//바위 -> 2
				//보   ->  3
				//컴퓨터가 내는 가위,바위,보 => 랜덤 값 추출
				//입력 한 값이랑 비교해서 이겼다, 졌다, 비겼다.
				//가위, 바위,보 || String.qeuals(내용)
				System.out.println("가위, 바위, 보 중에서 하나를 입력하세요.");
				
				String RSP = sc.nextLine();
				//가위 ->1, 바위 -> 2, 보-> 3(1~3)
				int randomNo = (int) (Math.random()*3)+1;
				
				if(RSP.equals("가위")) {
					//사용자 : 가위, 컴퓨터:2 (바위)
					if(randomNo ==1) {
						System.out.println("비겼다.");
					} else if(randomNo ==2) {
						System.out.println("졌다");
						//사용자 : 가위, 컴퓨터 :3(보)
					} else if(randomNo==3) {
						 System.out.println("이겼다.");
					}
					
				} else if (RSP.equals("바위")) {
					//사용자 : 바위, 컴퓨터:2 (가위)
					if(randomNo ==1) {
						System.out.println("이겼다.");
					} else if(randomNo ==2) {
						System.out.println("비겼다");
						//사용자 : 가위, 컴퓨터 :3(보)
					} else if(randomNo==3) {
						 System.out.println("졌다.");
					}
					
				} else if (RSP.equals("보")) {
					//사용자 : 보, 컴퓨터:2 (바위)
					if(randomNo ==1) {
						System.out.println("졌다.");
					} else if(randomNo ==2) {
						System.out.println("이겼다");
						//사용자 : 보, 컴퓨터 :3(보)
					} else if(randomNo==3) {
						 System.out.println("비겼다.");
					}
				}
				money -= 500; //money = money - 500
				break;
			case 2:
				//앞, 뒤 맞추기
				System.out.println("동전 앞 뒤를 맞추기>>>>");
				System.out.println("입력>");
				String frontBack = sc.nextLine();
				//앞 =0, 뒤 =1
				int random = (int) (Math.random()*2);
				
//				if(RSP2.equals("앞")) {
//					//사용자 : 가위, 컴퓨터:2 (바위)
//					if(randomNo1 ==1) {
//						System.out.println("다시.");
//					} else if(randomNo1 ==2) {
//						System.out.println("졌다");
//						//사용자 : 가위, 컴퓨터 :3(보)
//					} else  {
//						 System.out.println("이겼다.");
//					}
//				}
				if(frontBack.equals("앞")) {
					System.out.println("맞췄다");
				}else if(frontBack.equals("뒤")) {
					System.out.println("틀렸다");
				}
				money -=500;
				break;
	
			case 3:
				//종료...1) 투입 금액이 소진이 다 되었을때
				// 		2) 강제 종료
				flag = false;
				
				break;
				default:
					System.out.println("없는 메뉴 입니다. 다시 입력하세요");
					break;
			}
			//1500
			if(money <500) {
				System.out.println("금액이 부족해 더이상 게임 진행 불가");
			}
		}
		System.out.println("게임 종료.");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
