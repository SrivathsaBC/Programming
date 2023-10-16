package For1;

public class OddnumFactorial {
public static void main(String[] args) {
	int fact=1;
	for (int i=1;i<=10; i++){
		if(i%2==1){
			fact=fact*i;
			System.out.println(i+" "+fact);
		}
		else{
			fact=fact*i;
		}
	}
}

}
