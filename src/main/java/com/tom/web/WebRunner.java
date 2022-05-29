package com.tom.web;

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
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
            is.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
