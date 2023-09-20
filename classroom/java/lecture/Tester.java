package com.section.c;

import java.util.Arrays;

public class Tester {
	public static void copyOf(int[] src, int[] dest) {
		for (int i = 0; i < src.length; i++)
			dest[i] = src[i];

	}

	public static void print(int[] arr) {
		System.out.println();
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static int[] evenOddCount(int[] arr) {

		int e = 0, o = 0;
		for (int i : arr) {
			if (i % 2 == 0) {
				e++;
			} else {
				o++;
			}
		}
		int[] a = { e, o };
		return a;
	}

//	public static int[] reverseArray(int[] arr) {
//		int[] arr2 = new int[arr.length];
//		
//		for (int i = 0,j=arr.length-1; i < arr2.length; i++,j--) {
//			arr2[i] = arr[j];
//			
//		}
//		
//		//copyOf(arr2, arr);
//		
//		return arr2;
//		
//	}

	public static void reverseArray(int[] arr) {

		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

		}
	}

//	public static int[] rotateClockWise(int[] input, int n) {
//		int[] arr = new int[input.length];
//		int pos = 0;
//		for (int i = n%arr.length; i < arr.length; i++) {
//			arr[i] = input[pos];
//			pos++;
//		}
//		for (int i = 0; i < n%arr.length; i++) {
//			arr[i] = input[pos];
//			pos++;
//
//		}
//		return arr;
//	}

//	public static void rotateClockWise(int[] input, int n) {
//	int[] arr = new int[input.length];
//	int pos = 0;
//	for (int i = n%arr.length; i < arr.length; i++) {
//		arr[i] = input[pos];
//		pos++;
//	}
//	for (int i = 0; i < n%arr.length; i++) {
//		arr[i] = input[pos];
//		pos++;
//
//	}
//	 
//	copyOf(arr, input);
//}

	public static void rotateClockWise(int[] input, int n) {
		int[] arr = new int[input.length];
		int pos = 0;
		for (int i = n; i < arr.length; i++) {
			arr[i] = input[pos];
			pos++;
		}
		for (int i = 0; i < n; i++) {
			arr[i] = input[pos];
			pos++;

		}

		copyOf(arr, input);
	}

//	public static int[] arrayConcatenation(int[] arr1, int[] arr2) {
//		
//		int[] arr = new int[arr1.length + arr2.length];
//		int pos = 0;
//		for (int i = 0; i < arr1.length; i++) {
//			arr[pos] = arr1[i]; pos++;
//			
//		}
//		
//		for (int i = 0; i < arr2.length; i++) {
//			arr[pos] = arr2[i]; pos++;
//			
//		}
//		
//		return arr;
//	}

	public static int[] arrayConcatenation(int[] arr1, int[] arr2) {

		int[] arr = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr.length; i++) {

			if (i < arr1.length)
				arr[i] = arr1[i];
			else
				arr[i] = arr2[i - arr1.length];

		}

		return arr;
	}

	public static boolean duplicateElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int b = arr[i] ^ arr[j];
				if (b == 0) {
					return true;
				}

			}

		}

		return false;
	}

	public static int[] distinctElements(int[] input) {
		int[] arr = new int[input.length];
		int pos = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean b = true;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == input[i]) {
					b = false;
					break;
				}
			}

			if (b) {
				arr[pos] = input[i];
				pos++;
			}

		}

		int[] a = new int[pos];
		for (int i = 0; i < a.length; i++) {
			a[i] = arr[i];
			
		}
		print(a);
		return a;
	}

	public static void sorted(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int[] arr = new int[arr1.length + arr2.length];
		
		int i = 0,j = 0,pos = 0;
		
		while (i<arr1.length  && j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				arr[pos] = arr1[i];
				i++;
				pos++;
			} else if(arr1[i] > arr2[j]) {
				arr[pos] = arr2[j];
				j++;
				pos++;
			} else {
				arr[pos] = arr2[j];
				j++;
				i++;
				pos++;
			}
		}
		
		while(i<arr1.length) {
			arr[pos] = arr1[i];
			i++;
			pos++;
		}
		
		while (j<arr2.length) {
			arr[pos] = arr2[j];
			j++;
			pos++;
		}
	}
	
	public static void main(String[] args) {

//		int[] a = { 1, 2, 3, 4, 5, 6 };
//
//		print(a);
//
//		rotateClockWise(a, 1);
//		rotateClockWise(a, 1);
//		print(a);

//		for (int i = 0; i <20; i++) {
//			System.out.print(i%5+" ");
//			
//		}

//		System.out.println(duplicateElements(new int[] { 1, 2, 3, 4, 5, 1 }));
//		

		int[] arr = { 1,1,1,1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,5,5,5,5};
		distinctElements(arr);
	}
}
