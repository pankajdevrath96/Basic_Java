package assignment2;
import java.util.Scanner;
import java.lang.String;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String res = "";
		for(int i= 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			res += Integer.toHexString((int)ch);
			
		}
		System.out.println(res);
		

	}

}
