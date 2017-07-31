
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.regex.Pattern;
import java.net.URL;
import java.util.HashMap;

public class WebCrawler
{
    /*
    What classes do we need
     */

    public void connect(String httpTarget) throws IOException
    {
        // http:// (protocol)
        // google.com (host name)

        URL url = new URL(httpTarget);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        try
        {
            try (InputStream in = con.getInputStream())
            {
                try (BufferedReader inReader = new BufferedReader(new InputStreamReader(in)))
                {
                    while (inReader.ready())
                    {
                        // leave the \r\n out in project
                        String line = inReader.readLine() + "\r\n";
                        System.out.println(line);
                    }
                }
            }
        } finally
        {
            con.disconnect();
        }
    }


    /*
     * Main Method Uses args to check if the strings are urls if not it thorws a illegal
     * argument excetion stating that it the arguments are not vaild urls.
     */
    public static void main(String[] args)
    {
        if (checkString(args))
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
        for (int i = 0; i < urls.length; i++)
        {
            if (Pattern.matches(regex, urls[i]))
            {
                return true;
            } else
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
        return null;

    }

    /*
     * uses regex to retun the text inside of the <p> tag into an array of strings for diffrent p tags
     */
    public static String getPText()
    {
        return null;
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
    public static String getLiText()
    {
        return null;

    }

    /*
     * get for label tag
     */
    public static String get;
}
