package adv;

import java.util.regex.Pattern;

public class REDemo {

	public static void main(String[] args) {
		 
		System.out.println(Pattern.matches(".*\\d.*", "Ab5cd"));
		System.out.println(Pattern.matches("^\\d{5}$", "12345"));
		
		Pattern p = Pattern.compile("[;.,]");
		
		var parts = p.split("abc,xyz;pqr.def");
		
		for (var v : parts)
			System.out.println(v);
		
		var st = "how  do   you do";
		
//		var wordPattern = Pattern.compile("\\w+");
//		Matcher m = wordPattern.matcher(st);
//		
//		while(m.find()) {
//			System.out.println(m.group());
//		}
		
		// using split
		var splitPattern = Pattern.compile("\\W+");
		var words = splitPattern.split(st);
		for(var w : words)
			System.out.println(w);
		

		var spacePattern  = Pattern.compile("\\s+");
		var m2 = spacePattern.matcher(st);
		
		System.out.println(m2.replaceAll("."));
		
	}

}
