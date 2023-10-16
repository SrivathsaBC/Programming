package TestCases;

public class No5 {
public static void main(String[] args) {
	int sum=0;
	int sum1=0;
	int fact=1;
	int[] arr={5, 8, 14, 44, 81, 89, 99, 102};
	for (int i=0; i<arr.length; i++){
		if(arr[i]<20){
			int no=arr[i];
			for (int j=no; j>1; j--){
				fact=fact*j;
			}
			System.out.println(fact);}
			else{
				int nu=arr[i];
				while (nu!=10){
					int rem=nu%10;
					sum=sum+rem;
					nu=nu/10;
				}
				while(sum!=10){
					int rem1=sum%10;
					sum1=sum1+rem1;
					sum=sum/10;
			}
		}
	}
	System.out.println(sum1);
}
}
