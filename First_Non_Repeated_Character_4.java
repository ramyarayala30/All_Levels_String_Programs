package string_chapter2;

import java.util.Arrays;

public class First_Non_Repeated_Character_4 {
	
	public static char[] toCharArray(String s)
	{
		char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
		}
		return ch;
	}
	public static int count(String s)
	{
		char[]ch=toCharArray(s);

		int count=0;
		char visited='\0';
		for(int i=0;i<ch.length;i++)
		{
			
			boolean isFound=true;
			if(ch[i]!=visited)
			{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=visited;
					isFound=false;
				}			
			}
			if(isFound)
			{
				count++;
			}
		}
		}
		return count;
	}

	public static char[] non_duplicate_characters(String s)
	{
		int ct=count(s);
		char[] ch=toCharArray(s);
		char[] newArray=new char[ct];
		int index=0;
		char visited=' ';
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=visited;
					count++;
				}
			}
			if(count==0 && ch[i]!=visited)
			{
				newArray[index++]=ch[i];
			}
		}
		return newArray;
	}
	public static void main(String[] args) {
		String s="ramyarayala";
		System.out.println(count(s));
		char[] ch=non_duplicate_characters(s);
		System.out.println(Arrays.toString(ch));
		System.out.println("first non repeated is "+ch[0]);
	}
}
