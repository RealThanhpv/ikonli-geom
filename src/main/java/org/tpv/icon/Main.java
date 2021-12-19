package org.tpv.icon;

import java.io.InputStream;

public class Main {

    public static void main(String[] args){
        GeomIkonliHandler geomIkonliHandler = new GeomIkonliHandler();
        System.out.println(geomIkonliHandler.getFontResource());
        InputStream url = geomIkonliHandler.getFontResourceAsStream();
        System.out.println(url);
    }
}
