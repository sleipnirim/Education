package by.htp6.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	
	public static void main(String[] args){
	
	String regEx = "[\\w]+@[\\w]+.[\\w]+";
	
	String text = "bla bla blA example@domain.com bla blabla";
	Pattern pattern = Pattern.compile(regEx);
	Matcher matcher = pattern.matcher(text);
	
	matcher.find();
	System.out.println(matcher.group());

	}
}
