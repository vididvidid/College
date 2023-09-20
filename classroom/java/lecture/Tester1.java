package com.section.c;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {
	public static boolean isPrime(int num) {
		if (num == 1)
			return false;
		boolean b = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				b = false;
				break;
			}

		}

		return b;
	}

	public static int sumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}

		return sum;
	}

	public static void primeBt(int n, int m) {
		for (int i = n; i <= m; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}

		}
	}

	public static int reverseDigits(int num) {
		int r = 0;
		while (num > 0) {
			r = r * 10 + num % 10;
			num = num / 10;
		}

		return r;
	}

	public static int placeValue(int num) {
		int r = 1;

		while (num >= 10) {
			r = r * 10;

			num = num / 10;
		}

		return r;
	}

	public static int fect(int num) {
		int f = 1;
		while (num > 0) {
			f = f * num;
			num = num - 1;
		}
		return f;
	}

	public static int comb(int n, int r) {
		return fect(n) / (fect(r) * fect(n - r));
	}

	public static void main(String[] args) {

		// primeBt(1, 100);
		// System.out.println(sumOfDigits(1234));
		// System.out.println(reverseDigits(1));

//		double d = 10.1234;
//		int x = (int)d;
//		String s = d+"";
//		String[] arr = s.split("\\.");
//		System.out.println(arr[1]);

		System.out.println(placeValue(101));

//	int x = 	54343478 / placeValue(54343478);
//	System.out.println(x);

		int x = 12345;

		int a = x / 10000;
		int b = (x % 10000) / 1000;

	}
}
