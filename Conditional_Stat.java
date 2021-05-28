package day2;

public class Conditional_Stat {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		int max;
		if(a>b)
			max=a;
		else
			max=b;
		//System.out.println("Max="+max);
		
		a=100;b=30;
		
		int m=(a>b)?a:b;
		System.out.println("Maximum="+m);

	}

}
