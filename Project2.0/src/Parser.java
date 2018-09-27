import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Parser {


    Map<String, Node> wordDictionary;
    ArrayList<String> linkList;
    Elements links;
    int position;
    URL website;


    public static void main(String[] args) throws IOException {





        Parser parse= new Parser("string");
        parse.getDocument("http://gutenberg.net.au/ebooks/fr100027.html");
        parse.printLinks(0,15);
        //parse.parseURL();

    }
    Parser(String url) throws MalformedURLException {
        wordDictionary = new HashMap<>();
        linkList = new ArrayList<>();
        position=0;
        website = new URL("http://gutenberg.net.au/ebooks/fr100027.html");

    }


    public String getDocument(String URL) throws IOException {

        Document doc= Jsoup.connect(URL).get();

        links = doc.select("a[href]");
        String textBody= doc.body().text();
            return textBody;

    }

    public void parseURL(String information){







    }
public void printLinks(int low, int high){
Element link;

        for (int i=low; i<high; i++){

            link=links.get(i);
            System.out.printf(" * a: <%s>  (%s)\n", link.attr("abs:href"), link.text());
            //System.out.println(" * a:" + link.tagName()+"link.attr("abs:href"));
        }
          //  System.out.println(links.get(i).text());






}











}
