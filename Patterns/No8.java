package Patterns;

import java.util.Scanner;

public class No8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any ODD Number");
		int n=sc.nextInt();
		int space=n/2;
		int star=1;
		int x;
		for (int i=1; i<=n; i++){
			x=1;
			for (int j=1; j<=space; j++){
				System.out.print("  ");
			}
			for (int k=1; k<=star; k++){
				if(k%2==0){
				System.out.print(" * ");
				}
				else{
					System.out.print(x);
					x++;
				}
				
			}
			System.out.println();
			if(i<=n/2){
				star=star+2;
				space--;
				}
			else{
				star=star-2;
				space++;
				
			}
			
		}
	}
}
