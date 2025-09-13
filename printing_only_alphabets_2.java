package string_chapter1;

public class printing_only_alphabets_2 {
	
	public static void main(String[] args) {
		String s="5Ramya123";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				System.out.println(s.charAt(i));
			}
		}
	}

}
