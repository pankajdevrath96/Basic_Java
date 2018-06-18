package Assignment1;

import java.util.Scanner;

abstract class Demo{
	abstract void input(int n);
	abstract void logic();
	abstract void display();
	
}
class Demo2 extends Demo{
	int n,m;
	int arr[]=new int[1000];

	public Demo2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	void input(int n) {
		// TODO Auto-generated method stub
		this.n=n;

		System.out.println("Enter the elements of array");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
	}

	@Override
	void logic() {
		// TODO Auto-generated method stub
//		TIME complexity O(n^2)
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				if(i!=j&&arr[i]==arr[j])
				{
					m=arr[i];
					break;
				}
		
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.print(m);
		
	}
	
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array");
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		Demo2 p=new Demo2();
		p.input(x);
		p.logic();
		p.display();
		
		

	}

}
