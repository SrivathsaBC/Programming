package Patterns;

public class No1 {
public static void main(String[] args) {
	int n=7;
	for (int i=1; i<=n; i++){
		for (int j=1; j<=n*2; j++){
			if ((i+j==n/2+2 && i<=n/2+1)||(i-j==n/2 && i>=n/2+1)
			||(i+j==n+n/2+1 && i>=n/2+1)||(j-i==n/2 && i<=n/2+1))
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
