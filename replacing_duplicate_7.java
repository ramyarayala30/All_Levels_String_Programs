package string_chapter2;

public class replacing_duplicate_7 {
	
	public static char[] toCharArray(String s)
	{
		char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
		}
		return ch;
	}
	
	public static char[] duplicate_replace(String s)
	{
		char[] ch=toCharArray(s);
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='*')
			{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]='*';
				}
			}
			}
		}
		return ch;
	}	
	public static void main(String[] args) {
		
		String s="ramyarayalaaaaaaaa";
		System.out.println(duplicate_replace(s));
	}
}
		