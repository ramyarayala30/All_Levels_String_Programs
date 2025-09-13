package string_chapter2;

public class Frequency_Of_Each_Character_3 {
	
	public static char[] toCharArray(String s)
	{
		char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
		}
		return ch;
	}
	
	public static void main(String[] args) {
		
		String s="ramyarayala";
		char[] ch=toCharArray(s);
		char visited=' ';
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=visited;
					count++;
				}
			}
			if(ch[i]!=visited)
			{
			System.out.println(ch[i]+"---->"+count);
			}
		}
	}

}
