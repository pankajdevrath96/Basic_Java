package Assignment1;

import java.util.Scanner;

abstract class Demo9{
	abstract void input();
	abstract void logic();
	
}


class Test9 extends Demo9
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
		for(int i=0;i<n-1;i++)
		{
			if(i<n/2)
			{
				int index=i;
			for(int j=i+1;j<n/2;j++)
				if (arr[j]<arr[index])
		            index = j;
			
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
			
			}
			else
			{
				int index=i;
				for(int j=i+1;j<n;j++)
					if (arr[j]>arr[index])
			            index = j;
				
				int temp=arr[index];
				arr[index]=arr[i];
				arr[i]=temp;
				
			}
				
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
	}
	
}

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test9 p=new Test9();
		p.input();
		p.logic();
		

	}

}
