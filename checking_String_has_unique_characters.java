package string_chapter2;

public class checking_String_has_unique_characters {
	
	public static char[] toCharArray(String s)
	{
		char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
		}
		return ch;
	}
	
	public static boolean checking_unique_or_not(String s)
	{
		char[] ch=toCharArray(s);
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		String s="ramy";
		if(checking_unique_or_not(s))
		{
			System.out.println("unique String");
		}
		else
		{
			System.out.println("not unique");
		}
	}

}
