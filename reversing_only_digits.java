package string_chapter2;

public class reversing_only_digits {
	
	public static String rev(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				rev=rev+s.charAt(i);
			}
		}
		return rev;
	}
	public static String reversiong_only_digits(String s)
	{
		String st="";
		int index=0;
		String rev=rev(s);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
				st=st+rev.charAt(index++);
			}
			else
			{
				st=st+s.charAt(i);
			}
		}
		return st;
	}
	public static void main(String[] args) {
		String s="Rayala12ramya567";
		System.out.println(reversiong_only_digits(s));
	}

}
