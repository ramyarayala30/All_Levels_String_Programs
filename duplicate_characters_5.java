package string_chapter1;

public class duplicate_characters_5 {
	
	
	public static char[] tocharArray(String s)
	{
		char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
		}
		return ch;
	}
	
	public static void duplicate(String s)
	{
		char[] ch=tocharArray(s);
		char visited=' ';
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			if(ch[i]!=visited)
			{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=visited;
					count++;
				}
			}
			}
			if(count>1 && ch[i]!=visited)
			{
				System.out.println(ch[i]+" is duplicate");
			}
		}
		
	}
	
	public static void main(String[] args) {
		String s="ramyaaaaaaaaaaaaaaaaaaasri";
		duplicate(s);

	}
}
