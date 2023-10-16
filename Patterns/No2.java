package Patterns;

public class No2 {
public static void main(String[] args) {
	for (char i='A'; i<='D'; i++)
	{
		for(char j='A'; j<='D'; j++)
		{
			if (i>=j){
				System.out.print(j);
			}
			else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
