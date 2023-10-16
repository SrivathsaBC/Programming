package TestCases;

import java.util.Scanner;

public class No6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Box");
		int no=sc.nextInt();
		int box1=0;
		int box2=1;
		int box3=0;
		for (int i=1; i<=no-2; i++)
		{
			box3= box1+box2;
			System.out.println(box3);
			box1=box2;
			box2=box3;
		}
		System.out.println(box2);
	}

}
