package org.tpv.icon;

import java.io.InputStream;

public class Main {

    public static void main(String[] args){
        GeomIkonHandler geomIkonliHandler = new GeomIkonHandler();
        System.out.println(geomIkonliHandler.getFontResource());
        InputStream url = geomIkonliHandler.getFontResourceAsStream();
        System.out.println(url);
    }
}
