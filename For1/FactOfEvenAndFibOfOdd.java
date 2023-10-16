package Mock;

public class FactOfEvenAndFibOfOdd {
public static void main(String[] args) {
	int[] arr={22, 35, 61, 48, 51, 74};
	int fact=1;
	int fib1=0;
	int fib2=0;
	int fib3=0;
	for (int i=0; i<arr.length; i++){
	if (arr[i]%2==0){
		fact=fact*arr[i];
	}
	else{
		fib2=arr[i];
		fib3=fib1+fib2;
		fib1=fib3;
	}
	}
	System.out.println("Factorial of even Number "+fact);
	System.out.println("Fibnoci of odd Numbers "+fib3);
}
}
