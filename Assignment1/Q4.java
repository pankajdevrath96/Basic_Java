package Assignment1;
import java.lang.*;
import java.util.*;
class Test3{
	int arr[]=new int[1000],n,x;
	void input(int x)
	{
		n=x;
		System.out.print("Enter the elements of array \n");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
	}
	void logic(int m)
	{
		for(int i=0;i<n;i++)
		{
			x=arr[i];
			while(x>0)
			{
				if(x%10==m)
				{
					System.out.println(arr[i]);
					break;
				}
				x/=10;
			}
		}
	}
	
}



public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 p=new Test3();
		int n,x;
		System.out.print("Enter the size of array and number you want to search resp.");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		x=sc.nextInt();
		p.input(n);
		p.logic(x);

	}

}
