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
		int maxOfOnes = 0;
        String binaryNumber[] = Integer.toBinaryString(number).split("0");
        for(int i=0;i<binaryNumber.length;i++){
            maxOfOnes = (binaryNumber[i].length()>maxOfOnes)?binaryNumber[i].length():maxOfOnes;
            
        }
		System.out.format("Your number has %d consecutive 1's",maxOfOnes);
		scanner.close();
	}
}
