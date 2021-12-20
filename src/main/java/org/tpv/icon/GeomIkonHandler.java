package org.tpv.icon;

import org.kordamp.ikonli.AbstractIkonHandler;
import org.kordamp.ikonli.Ikon;

import java.io.InputStream;
import java.net.URL;

public class GeomIkonHandler extends AbstractIkonHandler {
    private static String fileName = "geom.ttf";

    @Override
    public boolean supports(String description) {
        return description != null && description.startsWith("icon-");
    }

    @Override
    public Ikon resolve(String description) {
        return GeomIkon.findByDescription(description);
    }

    @Override
    public URL getFontResource() {
        return getClass().getClassLoader().getResource(fileName);
    }

    @Override
    public InputStream getFontResourceAsStream() {
        return getClass().getClassLoader().getResourceAsStream(fileName);
    }

    @Override
    public String getFontFamily() {
        return "geom-icon";
    }


}