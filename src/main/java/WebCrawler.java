import java.net.URL;
import java.util.List;
import java.util.regex.Pattern;

//edited 7-26-17
public class WebCrawler{
		
	/*
	 * Main Method Uses args to check if the strings are urls if not it thorws a illegal 
	 * argument excetion stating that it the arguments are not vaild urls.
	 */
	public static void main(String[] args) {
		checkString(args);
	}
	
	
	
	/*
	 * Checks if the array of strings are vaild urls
	 */
	public static boolean checkString(String[] urls) {
		String regex = "";
		for(int i = 0 ;i < urls.length; i++) {
			if(Pattern.matches(regex, urls[i])) {
				return true;
			}
			else 
				throw new IllegalArgumentException("These arent vaild urls");
		}
		return false;
	}
}
