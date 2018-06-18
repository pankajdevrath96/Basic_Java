package Assignment1;

import java.util.Scanner;

interface Int_Third{
	void input();
	void logic();
	
}

class Test10 implements Int_Third{
	int n;

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.print("Enter the value of n: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	}

	@Override
	public void logic() {
		// TODO Auto-generated method stub
		input();
		int  a=0,b=0,c=1;
		for(int i=1;i<=n;i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.print(a+" ");
        }
		
	}
	
}
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test10 p=new Test10();
		p.logic();

	}

}
