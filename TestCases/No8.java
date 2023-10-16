package TestCases;

import java.util.Scanner;

public class No8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentance");
	String str=sc.nextLine();
	String[] str3=str.split(" ");
	String str2="";
	for (int i=0;i<str3.length;i++){
		int count=0;str2=str3[i];
				for(int j=0; j<str2.length();j++){
					count++;
				}
				
				System.out.println(count);	
	}
}
	
	
}

