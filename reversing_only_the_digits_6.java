package string_chapter2;

public class reversing_only_the_digits_6 {
	
	    // collect reversed digits
	    public static String rev(String s) {
	        String rev = "";
	        for (int i = s.length() - 1; i >= 0; i--) {
	            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
	                rev = rev + s.charAt(i);
	            }
	        }
	        return rev;
	    }

	    // place reversed digits back in original string
	    public static String reversing_only_numbers(String s) {
	        String n = "";
	        String rev = rev(s);  // reversed digits string
	        int index = 0;

	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
	                // instead of original digit, put reversed digit
	                n = n + rev.charAt(index++);
	            } else {
	                n = n + s.charAt(i);
	            }
	        }
	        return n;
	    }

	    public static void main(String[] args) {
	        String s = "ramya9sri543";
	        System.out.println("Digits reversed only: " + reversing_only_numbers(s));
	        // Output: ramya3sri459
	    }
	}
