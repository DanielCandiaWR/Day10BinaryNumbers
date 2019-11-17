package com.day10binarynumbers.app;
import java.util.Scanner;
/*
 * Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
 * Input Format:
 * - A single integer, n.
 * Output Format: 
 * - Print a single base-10 integer denoting the maximum number of consecutive 1's in the binary representation of n.
 */
public class BinaryNumbers {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Input a number: ");
		int number = scanner.nextInt();
		String binaryNumber = "";
		int counter = 0;
		int maxOfOnes = 0;
		binaryNumber = Integer.toBinaryString(number);
		System.out.println("Your binary number is: "+binaryNumber);
		for(int i=0;i<binaryNumber.length();i++) {
			if(binaryNumber.charAt(i)=='1') {
				counter++;
			}else if(binaryNumber.charAt(i)=='0'){
				counter = 0;
			}
			if(maxOfOnes<counter) {
				maxOfOnes = counter;
			}
		}
		System.out.format("Your number has %d consecutive 1's",maxOfOnes);
		scanner.close();
	}
}
