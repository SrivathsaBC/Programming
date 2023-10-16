package TestCases;

public class No2 {
	static void main(int[] arr){
		int fact=1;
		int sum=0;
		for (int i=0; i<arr.length;i++){
			if (arr[i]>10){
				if (arr[i]<20){
					fact=fact*i;	
				}	
				}
			
			else{
				sum=sum+i;
			}
		}
		System.out.println(fact);

		System.out.println(sum);}
	public static void main(String[] args) {
		int[] arr={0, 1, 5, 8, 14, 18, 44, 81, 89, 99, 102};
		
		main(arr);
	}
}
