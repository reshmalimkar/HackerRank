package com.jspider.practice.HackerRank;

import java.util.Scanner;

public class StringEx1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();// hello
		String B = sc.next();// java
		/* Enter your code here. Print output to STDOUT. */

		int sum = A.length() + B.length();
		System.out.println(sum);
		// Determine if A is lexicographically larger than B
		if (A.compareTo(B) > 0) {
			System.out.println("yes");
		}else {

	System.out.println("no");
		}
		
		String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

	}

}
