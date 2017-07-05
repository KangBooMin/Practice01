package com.javapr.pr01;

import java.util.Scanner;

public class Pr08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0;
		while (true) {
			System.out.println("-----------------------------");
			System.out.println(" 1.예금 : 2.출금 : 3.잔고 : 4.종료");
			System.out.println("-----------------------------");
			System.out.println("");
			System.out.print("선택>> ");

			int x = sc.nextInt();

			/* 1 */ if (x == 1) {
				System.out.print("예금액>> ");
				int y = sc.nextInt();
				a = a + y;
				System.out.print("잔고>> " + a + "\n");

				/* 2 */ } else if (x == 2) {
				System.out.print("출금액>> ");
				int y = sc.nextInt();
				a = a - y;
				System.out.print("잔고>> " + a + "\n");

				/* 3 */ } else if (x == 3) {
				System.out.print("잔고>> " + a + "\n");

				/* 4 */ } else if (x == 4) {
				System.out.print("프로그램 종료");
				break;

				/* other */ } else {
				System.out.println("1, 2, 3, 4 이외의 숫자이니 다시 입력해 주세요.");
			}

		}
		sc.close();
	}

}
