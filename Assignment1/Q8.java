package Assignment1;

import java.util.Scanner;

abstract class Demo8{
	abstract void input();
	abstract void logic(int []arr);
	
}


class Test8 extends Demo8
{
int n;

	@Override
	void input() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array in sorted");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		logic(arr);
		
	}

	@Override
	void logic(int []arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]%2==0)
			{
				int index=i;
			for(int j=i+1;j<n;j++)
				if (arr[j]<arr[index] && arr[j]%2==0)
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

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test8 p=new Test8();
		p.input();

	}

}
