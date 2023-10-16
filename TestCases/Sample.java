package TestCases;

public class Sample {
	static void main(String str)
	{
		
		String str1=" ";
		String str2=" ";
		for( int i=0;i<str.length();i++)
		{
			char[] ch=str.toCharArray();
			if(ch[i]=='#')
			{
				str1=str1+ch[i];
			}
			else
			{
				str2=str2+ch[i];
			}
		}
		System.out.println(str1+str2);
		
	}
	public static void main(String[] args) {
		main("j#a#v#a");
	}

}
