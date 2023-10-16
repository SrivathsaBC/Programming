package TestCases;

public class No4 {
	public static void main(String[] args) {
		int [] arr={5,8,14,44,81,89,99,102};
		 int fact=1;
		 int sum=0;
		 int abc=0;
		 int efg=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<20)
			{
				fact=fact*arr[i];
			}
			else 
			{
				for (int j=0; j<=arr.length; j++){
			    while(arr[j]!=0){
				int rem=arr[j]%10;
				sum=sum+rem;
				arr[j]=arr[j]/10;
			    }
			    if(arr[j]<9){
			    	abc=abc+sum;
			    	
			    }
			    else{
			    	while(arr[j]!=0){
			    		int rem=arr[j]%10;
			    		efg=efg+arr[j];
			    		arr[j]=arr[j]/10;
			    	}
			    }
				}
			}
			}
			
			

		System.out.println(fact);
		System.out.println(abc);

		}
}
