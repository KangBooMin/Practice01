package com.javapr.pr01;

import java.util.Scanner;

public class Pr06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int i = sc.nextInt();
		int k = 0;
		int j = 1;
		int sum = 0;

		if (i % 2 == 0) {
			while (k <= i) {
				sum = sum + k;
				k = k + 2;

			}
			System.out.println(sum);
		} else {
			while (j <= i) {
				sum = sum + j;
				j = j + 2;
			}
			System.out.println(sum);
		}

		sc.close();
	}

}
