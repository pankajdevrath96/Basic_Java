package assignment2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		HashMap<String, Integer> map = new HashMap<>();
		
		String str1[] = str.split(" ");
		
		for(String v : str1) {
			if(map.containsKey(v)) {
				map.replace(v , map.get(v) + 1);
			}
			else {
				map.put(v , 1);
			}
			
		}
		
		Integer max = 0;
		
		
		for(HashMap.Entry x : map.entrySet()) {
			//Integer y = ;
			//System.out.println(x.getKey() + " "+ x.getValue() );
			
			if( (Integer)x.getValue() > max) {
				max = (Integer)x.getValue();
				
			}
		}
		
		for(HashMap.Entry x : map.entrySet()) {
			if((Integer)x.getValue() == max) {
				System.out.println(x.getKey());
			}
			
			
		}
		
		
		

	}

}
