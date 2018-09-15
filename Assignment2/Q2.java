package assignment2;
import java.lang.String; 
import java.util.Scanner;

public class Q2 {
	
	static void logic(String s1){
		String str[] = s1.split("\\W+");
		
		for(String v : str) {
			System.out.println(v);
		}

		
     }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in); 
		String str1 = sc.nextLine();      
		logic(str1);

	}

}
