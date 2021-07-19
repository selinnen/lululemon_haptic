package com.lululemon;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            // Here we create a document object and use JSoup to fetch the website
            Document doc = Jsoup.connect("https://shop.lululemon.com/p/women-pants/Align-Pant-2/_/prod2020012?color=0001").get();
     
            // With the document fetched, we use JSoup's title() method to fetch the title
            System.out.printf("Product: %s\n", doc.title());

            Elements repositories = doc.getElementsByClass("price-1jnQj");
            for (Element repo : repositories) {
                System.out.println(repo.text());
            }
            
     
          // In case of any IO errors, we want the messages written to the console
          } catch (IOException e) {
            e.printStackTrace();
          }
    }
}
