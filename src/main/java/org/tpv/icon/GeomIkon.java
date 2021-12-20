package org.tpv.icon;

import org.kordamp.ikonli.Ikon;

public enum  GeomIkon  implements Ikon {


    CIRCLE_LINE( '\uE800'),
    ELLIPSE_LINE( '\uE801');

    private String description;
    private char code;

    GeomIkon( char code) {
        this.description = "icon-" + name().toLowerCase().replace("_", "-");
        this.code = code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getCode() {
        return code;
    }

    public static GeomIkon findByDescription(String description) {
        for (GeomIkon icon : values()) {
            if (icon.description.equals(description)) {
                return icon;
            }
        }
        throw new IllegalArgumentException("Icon not supported: " + description);
    }

}
