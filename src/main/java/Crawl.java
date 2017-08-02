import java.util.List;

public class Crawl {
	
	public static final int MAX_DEPTH =2;
	
	
	public void crawl(String url, int currentDepth, List<String> vistedLinks) {
			//go get the raw html as string
			String rawHtml = getRawHtmlFromSite(url);
			//parse Html pull out links into a collection
			List<String> links = getLinksFromRawHtml(rawHtml);
			// parse words add to index (Random Acess file)
			List<String> words = getWordsFromPage(rawHtml);
			indexWordsFromPage(words,url);
			// for each link{
						//		follow the link if its internal
						//if external and not at max depth follow the link
						//}
			vistedLinks.add(url.toLowerCase());
			
			for(String link: links) {
				if(!isExternal(link) || currentDepth < MAX_DEPTH) {
					if(!vistedLinks.contains(link.toLowerCase())) {
					crawl(link,isExternal(link) ? currentDepth +1 : currentDepth, vistedLinks);
					}
				}
			}
		}

		private boolean isExternal(String link) {
			// TODO Auto-generated method stub
			return false;
		}

		private void indexWordsFromPage(List<String> words, String url) {
			// TODO Auto-generated method stub
			
		}

		private String getRawHtmlFromSite(String url) {
			// TODO Auto-generated method stub
			return null;
		}
		private List<String> getLinksFromRawHtml(String url){
			return null;
		}
		private List<String> getWordsFromPage(String html){
			return null;
		}
}
