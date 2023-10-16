package For1;

public class EvenNumFactorial {
	public static void main(String[] args) {
		for (int i=1;i<=10; i++){
			if(i%2==0){
				int fact=1;
				for (int j=i; j>=1; j--){
				fact=fact*j;
				}
				System.out.println(i+" "+fact);
			}
		}
	}
}
