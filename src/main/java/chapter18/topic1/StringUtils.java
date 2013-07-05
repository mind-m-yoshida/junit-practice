package chapter18.topic1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

	public static String toSnakeCase(String input) {

		Pattern pattern = Pattern.compile("[A-Z]");
		
		
		
		String target = input;
		
		Matcher matcher;
		
		while ((matcher = pattern.matcher(target)).find()) {
			target = matcher.replaceFirst(matcher.group()) + "_";
		}
		return target;
	}

}
