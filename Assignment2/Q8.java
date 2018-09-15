package assignment2;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String arr[] = str.split(" ");
		str = "";
		for(int i = arr.length-1; i >= 0; i--) {
			if(i == 0 || i == arr.length-1) {
				str += arr[i] + " ";
			}
			else {
				StringBuilder s = new StringBuilder(arr[i]);
				str += s.reverse().toString() + " ";
			}
			
			
		}
		
		System.out.println(str.trim());
		
		
		
		
		
		
		

	}

}
