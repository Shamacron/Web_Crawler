
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.net.URL;
import java.util.HashMap;



//edited 7-26-17
public class WebCrawler{

	/*
	 * Main Method Uses args to check if the strings are urls if not it thorws a illegal
		}
	}

	/*
	 * Checks if the array of strings are vaild urls
	 */

	public ArrayList<String> visitedSites = new ArrayList<>();

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
	 * Finds webpages that are not extions of the local page
	 */
	public static String[] getExternalWebPages()
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
	 * get for li tag
	 */
	public static String getLiText()
	{
		return null;

	}

	/*
	 * get for label tag
	 */
	public static String getLabelText()
	{
		return null;
	}

	/*
	 * get for opion tag
	 */
	public static String getOptionText()
	{
		return null;
	}

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
     * finds webpages that are exteinos of the local page
     */
    public static String[] getInternalWebPages()
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

	public static String get;

	private RandomAccessFile file;
	private int nextOffset = 8;
	private static Map<String, Map<String, Integer>> wordCount = new HashMap<>();
	private String currentSite = "";

	public String getCurrentSite()
	{
		return currentSite;
	}

	public void setCurrentSite(String currentSite)
	{
		this.currentSite = currentSite;
	}

	public void addWord(String word, String site)
	{

		if (wordCount.containsKey(word))
		{
			Map<String, Integer> sites = wordCount.get(word);

			if(sites.containsKey(currentSite))
			{
				int number = sites.get(currentSite);
				sites.put(currentSite, number++);
			}
			else
			{
				sites.put(currentSite, 1);
			}
		}
		else
		{
			HashMap<String, Integer> newMap = new HashMap<>();
			newMap.put(currentSite, 1);
			wordCount.put(word, newMap);
		}
	}

	public HashMap<String, Integer> getWordList(String word)
	{

		for (String key : wordCount.keySet())
		{
			if (word == key)
			{
				return (HashMap)wordCount.get(key);
			}
		}
		return null;
	}


	private void updateNextOffset() throws IOException
	{
		file.seek(0);
		file.writeInt(nextOffset);
		file.seek(nextOffset);
	}


	public static boolean checkIfVisited(String[] sites, String newSite)
	{
		for (String website : sites)
		{
			if (newSite == website)
			{
				return true;
			}
		}
		return false;
	}


    /*
     * uses regex to return the text inside of the <div tag>
     */
    public static String getDivText()
    {
        return null;

    }

}
