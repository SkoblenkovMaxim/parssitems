package com.smartidea.parssitems.services;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
public class MkServiceImpl {
    static String url;

    @ConfigurationProperties(prefix = "pars.site")
    public static Document getDocument() {
        try {
            Document document = Jsoup.connect(url).get();
            return document;
        } catch(Exception e) {
            e.getMessage();
        }
        return null;
    }
}
