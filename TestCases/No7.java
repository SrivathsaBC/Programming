package TestCases;

public class No7 {
	static boolean test(int a, int b)
	{
		if (a==10||b==10||a+b==10){
			return true;
		}
		else {
			return false;
		}
	}
public static void main(String[] args) {
	
	boolean x=test(9, 10);
	System.out.println(x);
}
}
