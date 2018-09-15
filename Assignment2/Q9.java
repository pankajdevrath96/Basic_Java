package assignment2;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringBuilder str1 = new StringBuilder("");
		StringBuilder str2 = new StringBuilder("");
		StringBuilder str3 = new StringBuilder("");
		for(int i = 0; i < str.length(); i++ ) {
			
			if( Character.isLetter(str.charAt(i))) {
				str1.append(str.charAt(i));
			}
			else if(Character.isDigit(str.charAt(i))) {
				str2.append(str.charAt(i));
			}
			else if(!Character.isWhitespace(str.charAt(i))) {
				str3.append(str.charAt(i));
			}
			
		}
		
		System.out.println(str1 + "\n" + str2 + "\n" + str3);

	}

}
