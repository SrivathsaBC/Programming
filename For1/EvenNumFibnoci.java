package For1;

public class EvenNumFibnoci {
public static void main(String[] args) {
	int fib1=0;
	int fib2=2;
	int fib3=0;
	for(int i=1; i<=20; i++)
	{
		if (i%2==0)
		{
		fib3=fib1+fib2;
		System.out.println(fib3);
		fib1=fib2;
		fib2=fib3;}
	}
}
}
