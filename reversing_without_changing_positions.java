package string_chapter2;

public class reversing_without_changing_positions {
	
	public static String rev(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{
				rev=rev+s.charAt(i);
			}
		}
		return rev;
	}
	
	public static String reversing_without_changing_space(String s)
	{
		String st="";
		int index=0;
		String rev=rev(s);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				st=st+' ';
			}
			else
			{
				st=st+rev.charAt(index++);
			}
		}
		return st;
	}
	public static void main(String[] args) {
		String s="ramya chowdary rayala";
		System.out.println(reversing_without_changing_space(s));
		
	}
	

}
