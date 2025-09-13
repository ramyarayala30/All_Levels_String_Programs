package string_chapter1;

public class reverse_a_String_4 {
	
	public static void main(String[] args) {
		String s="ramya";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			System.out.print(ch);
		}
	}

}
