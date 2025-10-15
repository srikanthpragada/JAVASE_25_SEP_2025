package assignments;

public class ReplaceDigitWithDot {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Abc12Xyz34");

		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
//				s.setCharAt(i, '.');
			
			char ch = s.charAt(i);
			
			if(Character.isDigit(ch))
				s.setCharAt(i, '.');
		}

		System.out.println(s);
		
		
	}
}
