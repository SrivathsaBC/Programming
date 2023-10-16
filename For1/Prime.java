package For1;
import java.util.Scanner;


public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int no=sc.nextInt();
		int count=0;
		
			boolean flag=true;
			for (int j=2; j<no/2; j++){
				if (no%j==0){
					flag=false;
					break;
				}
			}
			if (flag==true){
				count++;
			System.out.println(no+" is a prime number");
			}
			else {
				System.out.println(no+" is not a prime number");
			}
//		System.out.println(count);
		}
}
