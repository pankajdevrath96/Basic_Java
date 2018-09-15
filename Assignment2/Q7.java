package assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char arr[] = str.toCharArray();
		Arrays.sort(arr);
		str = new String(arr);
		System.out.println(str);
		

	}

}
