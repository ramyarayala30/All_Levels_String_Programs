package string_chapter2;

import java.util.Arrays;

public class reverse_a_string_without_changing_spaces_1 {
	
	public static String reverse(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			rev=rev+s.charAt(i);
		}
		return rev;
	}
	public static String reversingAStringWithoutChangingSpaces(String s)
	{
		String n="";
		String rev=reverse(s);
		int index=0;
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)==' ')
		{
			n=n+' ';
		}
		else
		{
			n=n+rev.charAt(index++);
		}
		}
	return n;
	}
	public static void main(String[] args) {
		String s="hi this is java";
	System.out.println(reversingAStringWithoutChangingSpaces(s));
	}
}
