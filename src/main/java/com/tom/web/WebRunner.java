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

public class WebRunner {
    public static void main(String[] args) {

        try {
            URL connection = new URL("https://www.coolpc.com.tw/evaluate.php");
            InputStream is = connection.openStream();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(is, "big5"));
            String line = br.readLine();
            StringBuffer sp = new StringBuffer();
            while (line != null) {
                sp.append(line);
                sp.append("\n");
                line = br.readLine();
            }
            br.close();
            is.close();
            System.out.println(sp.toString());  // 列出所有 html 元素
            //<OPTGROUP LABEL='NVIDIA RTX3090'>  // 追蹤目標
            Document doc = Jsoup.parse(sp.toString());
            Elements elements = doc.select("OPTGROUP[LABEL=NVIDIA RTX3090]");
            System.out.println(elements.size());
            for (Element element : elements) {
//                System.out.println(element.text());
                Elements opeions = element.select("OPTION");
                for (Element option : opeions) {
                    boolean disabled = option.hasAttr("disabled");
                    if (!disabled) System.out.println(option.text());
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
