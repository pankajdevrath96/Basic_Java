package assignment2;
import java.lang.String;
import java.util.Scanner;

public class Q1 {
	
	
	 static void logic(String s1,String s2){
		 
		 if(s1.length() != s2.length()) {
			 System.out.println("Not Snippet");
		 }
		 else {
			 if((s1+s1).contains(s2)) {
				 System.out.println("Snippet");
			 }
			 else {
				 System.out.println("Not Snippet");
			 }
			 
			 
		 }
		 
		 

		 
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		logic(str1,str2);

	}

}
