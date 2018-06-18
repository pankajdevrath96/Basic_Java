package Assignment1;

import java.util.Scanner;

class Test5{

	int n,mean;
	int arr[]=new int[100];
	Test5(int  x)
	{
		n=x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n-1 elements of the array");
		for(int i=0;i<n-1;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter the mean of the array");
		mean=sc.nextInt();
			
	}
	void logic()
	{
		int sum=0;
		for(int i=0;i<n-1;i++)
			sum+=arr[i];
		System.out.println((n*mean)-sum);
		

	}
}

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Size of the array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Test5 p=new Test5(n);
		p.logic();

	}

}
