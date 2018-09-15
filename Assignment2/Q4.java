package assignment2;

import java.util.Scanner;
import java.lang.*;
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char arr[] = str.toCharArray(); 
        for (int i = 0; i < str.length(); i++) { 
            if ((i == 0 && arr[i] != ' ' )||  (arr[i] != ' ' && arr[i - 1] == ' ')) { 
  
                if (arr[i] >= 'a' && arr[i] <= 'z') { 
  
                    arr[i] = (char)(arr[i] - 'a' + 'A'); 
                } 
            } 
            else if (arr[i] >= 'A' && arr[i] <= 'Z') { 
            	
                arr[i] = (char)(arr[i] + 'a' - 'A');   
            }
        } 
        str = new String(arr); 
		System.out.println(str);

	}

}
