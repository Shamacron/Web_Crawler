import java.util.regex.Matcher;
import java.util.regex.Pattern;

//edited 7-26-17
public class WebCrawler{
		
	/*
	 * Main Method Uses args to check if the strings are urls if not it thorws a illegal 
	 * argument excetion stating that it the arguments are not vaild urls.
	 */
	public static void main(String[] args) 
	{
		if(checkString(args)) 
		{
		CralWeb(args);
		}
	}
	
	
	
	/*
	 * Checks if the array of strings are vaild urls
	 */
	public static boolean checkString(String[] urls) 
	{
		String regex = "^((http[s]?|ftp):\\/)?\\/?([^:\\/\\s]+)((\\/\\w+)*\\/)([\\w\\-\\.]+[^#?\\s]+)(.*)?(#[\\w\\-]+)?$";
		for(int i = 0 ;i < urls.length; i++) 
		{
			if(Pattern.matches(regex, urls[i])) 
			{
				return true;
			}
			else 
				throw new IllegalArgumentException("These arent vaild urls");
		}
		return false;
	}
	
	/*
	 * Implents all the web craling stuff and does the things that do 
	 * the other things
	 */
	public static void CralWeb(String[] Urls) 
	{
		
	}
	/*
	 * finds webpages that are exteinos of the local page
	 */
	public static String[] getInternalWebPages() 
	{
		return null;
		
	}
	/*
	 * Finds webpages that are not extions of the local page
	 */
	public static String[] getExternalWebPages()
	{
		return null;
		
	}
	/*
	 * uses regex to get the text inside the body of the html
	 */
	public static String getBodyText()
	{
		
		String text = "";
		
		
		return text;
		
	}
	/*
	 * uses regex to retun the text inside of the <p> tag into an array of strings for diffrent p tags
	 */
	public static String getPText(String hml)
	{
		String html = hml;
		Pattern p = Pattern.compile("<p (.*?)>(.*?)<//p>");
		Matcher m = p.matcher(html);
		return m.group(1);
	}
	/*
	 * uses regex to return the text inside of the <div tag>
	 */
	public static String getDivText()
	{
		return null;
		
	}
	/*
	 * get for li tag
	 */
	public static String getLiText(String htl)
	{
		String html = htl;
		Pattern p = Pattern.compile("<li (.*?)>(.*?)<\\/li>");
		Matcher m = p.matcher(html);
		return m.group(1);
		
	}
	/*
	 * get for label tag
	 */
	public static String getLabelText(String htl) 
	{
		String html = htl;
		Pattern p = Pattern.compile("<label (.*?)>(.*?)<\\/label>");
		Matcher m = p.matcher(html);
		return m.group(1);
	}
	/*
	 * get for opion tag
	 */
	public static String getOptionText() 
	{
		return null;
	}
	/*
	 * 
	 */
	public static String getAtext(String htl)
	{
		String html = htl;
		Pattern p = Pattern.compile("<a href ?='(.*?)' (.*?)>(.*?)<\\/a>");
		Matcher m = p.matcher(html);
		return m.group(2);
	}
	/*
	 *returns the link inside of the a tag href 
	 */
	public static String getALink(String htl)
	{
		String html = htl;
		Pattern p = Pattern.compile("<a href ?='(.*?)' (.*?)>(.*?)<\\/a>");
		Matcher m = p.matcher(html);
		return m.group(0);
	}
	/*
	 * 
	 */
	public static String getTdText()
	{
		return null;
	}
	/*
	 * 
	 */
	public static String getThText(String htl)
	{
		String html = htl;
		Pattern p = Pattern.compile("<th (.*?)>(.*?)<\\/th>");
		Matcher m = p.matcher(html);
		return m.group(1);
	}
	/*
	 * 
	 */
	public static String getFontTag(String htl)
	{
		String html = htl;
		Pattern p = Pattern.compile("<font (.*?)>(.*?)<\\/font>");
		Matcher m = p.matcher(html);
		return m.group(1);
	}
}
