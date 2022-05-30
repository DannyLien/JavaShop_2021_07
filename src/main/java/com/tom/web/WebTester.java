package com.tom.web;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class WebTester {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.coolpc.com.tw/evaluate.php");
            InputStream is = url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "big5"));
            String line = br.readLine();
            StringBuffer sp = new StringBuffer();
            while (line != null) {
                sp.append(line);
                sp.append("\n");
                line = br.readLine();
            }
            System.out.println(sp.toString());
            Document doc = Jsoup.parse(sp.toString());
            Elements elements = doc.select("OPTGROUP[LABEL=NVIDIA RTX3090]");
            for (Element element : elements) {
                Elements options = element.select("OPTION");
                for (Element option : options) {
                    //過濾技嘉有貨的
                    if ((option.text().indexOf("技嘉") != -1) &&
                            (!option.hasAttr("disabled"))) {
                        System.out.println(option.text());
                    }
                }
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
