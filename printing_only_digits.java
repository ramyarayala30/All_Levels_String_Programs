package string_chapter1;

public class printing_only_digits {
	public static void main(String[] args) {
		String s="5Ramya123";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='1' && s.charAt(i)<='9' )
			{
				System.out.println(s.charAt(i));
			}
		}
	}


}
