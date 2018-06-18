package Assignment1;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array in sorted");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		boolean flag=false;
		int x=n;
		for(int i=n-1;i>0;i--)
			if(arr[i]==arr[i-1])
			{
				x=i;
				flag=true;
				break;
			}
	
		System.out.print((flag==true)?x:"No");
		

	}

}
