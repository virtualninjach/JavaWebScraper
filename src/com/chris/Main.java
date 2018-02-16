package com.chris;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

class Scraper{
    static void getElements() throws Exception {
        Document page = Jsoup.connect("http://www.arbiterlive.com/Teams/Schedule/5293767").userAgent("Mozilla/58.0").get();
       // Elements e = page.select("div#tabSchedule");
        Elements e = page.select("tr.gameRow");

        //System.out.println(e);
        //int i = 0;
        for (Element games:e){
          //  i++;
            System.out.println(games.select("td").text());
        }

    }
}

public class Main {


    public static void main(String[] args) {

        try {
            Scraper.getElements();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}


