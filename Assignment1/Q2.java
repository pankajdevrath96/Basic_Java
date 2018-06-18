package Assignment1;

import java.util.Scanner;

abstract class Test{
	int x,y;
	void input(int x,int y)
	{
		this.x=x; this.y=y;
	}
	abstract void logic();
	
}
class Test2 extends Test{
	int x1,y1;
	static boolean checkOrigin(int x1,int y1,int x2,int y2)
	{
		return(x1*(y2-y1)==y1*(x2-x1));
	}

	@Override
	void logic() {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of x2 and y2 co-ordinates respectively");
		Scanner s=new Scanner(System.in);
		x1=s.nextInt();
		y1=s.nextInt();
	
		System.out.println(checkOrigin(x,y,x1,y1)==true?"Yes":"No");
	}
	
}
public class Q2 {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter the value of x1 and y1 co-ordinates respectively");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		Test2 p=new Test2();
		p.input(a, b);
		p.logic();
		

	}

}
