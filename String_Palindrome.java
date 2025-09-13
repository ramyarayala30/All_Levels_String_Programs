package string_chapter2;

public class String_Palindrome {
	
	public static String rev(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}
	public  static void isPalindrome(String s)
	{
		if(rev(s).equals(s))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

	public static void main(String[] args) {
		String s="malayalam";
		System.out.println(rev(s));
		isPalindrome(s);
	}
}