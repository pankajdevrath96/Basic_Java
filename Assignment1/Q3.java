package Assignment1;

import java.util.Scanner;
import java.lang.*;

interface Int_Sec
{
	void input();
	void logic();
	void display();
}
class test1 implements Int_Sec
{
	int n1,n2, arr1[]=new int[100], arr2[]=new int[100],arr3[]=new int[10000];

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.print("enter the size of first array ");
		Scanner sc= new Scanner(System.in);
		n1=sc.nextInt();
		System.out.println("enter the elements of first array in sorted order");
		for(int i=0;i<n1;i++)
			arr1[i]=sc.nextInt();
		System.out.print("enter the size of second array ");
		n2=sc.nextInt();
		System.out.println("enter the elements of second array in sorted order");
		for(int i=0;i<n2;i++)
			arr2[i]=sc.nextInt();
		
		
	}

	@Override
	public void logic() {
		// TODO Auto-generated method stub
		for(int i=0;i<n1;i++)
			arr3[arr1[i]]++;
		for(int i=0;i<n2;i++)
			arr3[arr2[i]]++;
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for(int i=0;i<n1;i++)
			if(arr3[arr1[i]]==1)
				System.out.print(arr1[i]+" ");
		
	}
	
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 p=new test1();
		p.input();
		p.logic();
		p.display();

	}

}
