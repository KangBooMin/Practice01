package com.javapr.pr01;

import java.util.Scanner;

public class Pr07 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("=================");
		System.out.println("[숫자 맞추기 게임 시작]");
		System.out.println("=================");
		int num = (int)(Math.random()*100)+1;

		while (true) {
		System.out.print(">> ");
		int x = sc.nextInt();				
			if(x>num) {
				System.out.println("더 낮게!");
				continue;
			} else if(x<num) {
				System.out.println("더 높게!");
				continue;
			} else if(x==num) {
				System.out.println("정답입니다!");
				System.out.println("게임을 종료하시겠습니까? (y/n)");
					String retry = sc.next();
				    if("y".equals(retry)) {
						System.out.println("종료하였습니다.");
				    	break;
				    }else {
				    	continue;
				    }

			}
			
			
		sc.close();		
		}		


		
	}
	
}
