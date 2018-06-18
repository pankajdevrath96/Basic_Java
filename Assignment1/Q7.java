 package Assignment1;

import java.util.Scanner;
abstract class Demo7{
	abstract void input();
	abstract void logic();
	
}
class Test7 extends Demo7
{
int n;
int arr[]=new int[100];
	@Override
	void input() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		n=sc.nextInt();
		System.out.println("Enter the elements of the array in sorted");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
	}

	@Override
	void logic() {
		// TODO Auto-generated method stub
		input();
		int count=0;
		for(int i=0;i<n;i++)
		{
			int x=arr[i];
			while(x>50000)
			{
				if(x%100000==55555)
					count++;
				x/=10;
			}
		}
		System.out.print(count);
		
	}
	
}



public class Q7 {

	public static void main(String[] args) {
		Test7 p=new Test7();
		p.logic();
		

	}

}
