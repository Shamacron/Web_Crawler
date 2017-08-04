import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FoundWord
{
    public FoundWord()
    {

    }

    /*
	 * uses regex to retun the text inside of the <p> tag into an array of strings for diffrent p tags
	 */
    public String getPText(String hml)
    {
        String html = hml;
        Pattern p = Pattern.compile("<p (.*?)>(.*?)<//p>");
        Matcher m = p.matcher(html);
        if(m.find()) {
            return m.group(2);
        }
        return null;
    }
    /*
	 * get for li tag
	 */
    public String getLiText(String htl)
    {
        String html = htl;
        Pattern p = Pattern.compile("<li (.*?)>(.*?)<\\/li>");
        Matcher m = p.matcher(html);
        if(m.find()) {
            return m.group(2);
        }
        return null;
    }

    /*
     * get for label tag
     */
    public String getLabelText(String htl)
    {
        String html = htl;
        Pattern p = Pattern.compile("<label (.*?)>(.*?)<\\/label>");
        Matcher m = p.matcher(html);
        if(m.find()) {
            return m.group(2);
        }
        return null;
    }

    /*
     * get for opion tag
     */
    public String getOptionText(String html)
    {
        return null;
    }
    /*
     *
     */
    public String getAtext(String htl)
    {
        String html = htl;
        Pattern p = Pattern.compile("<a href ?=\"(.*?)\" ?(.*?)?>(.*?)<\\/a>");
        Matcher m = p.matcher(html);
        if(m.find()){
            return m.group(3);
        }
        return null;
    }
    /*
     *returns the link inside of the a tag href
     */
    public String getALink(String htl)
    {
        String html = htl;
        Pattern p = Pattern.compile("<a href ?=\"(.*?)\" ?(.*?)?>(.*?)<\\/a>");
        Matcher m = p.matcher(html);
        if(m.find()) {
            return m.group(1);
        }
        return null;
    }
    /*
     *
     */
    public String getTdText(String html)
    {
        return null;
    }
    /*
     *
     */
    public String getThText(String htl)
    {
        String html = htl;
        Pattern p = Pattern.compile("<th (.*?)>(.*?)<\\/th>");
        Matcher m = p.matcher(html);
        if(m.find()){
            return m.group(2);
        }
        return null;
    }
    /*
     *
     */
    public String getFontTag(String htl)
    {
        String html = htl;
        Pattern p = Pattern.compile("<font (.*?)>(.*?)<\\/font>");
        Matcher m = p.matcher(html);
        if(m.find()){
            return m.group(2);
        }
        return null;
    }
    /*
     * uses regex to get the text inside the body of the html
     */
    public String getBodyText(String html)
    {
        return null;

    }
}
