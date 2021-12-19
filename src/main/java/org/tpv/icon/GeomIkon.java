package org.tpv.icon;

import org.kordamp.ikonli.Ikon;

public enum  GeomIkon  implements Ikon {


    CIRCLELINE("icon-circle", '\uE800'),
    ELLIPSELINE("icon-ellipse", '\uE801');

    private String description;
    private char icon;

    GeomIkon(String description, char icon) {
        this.description = description;
        this.icon = icon;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getCode() {
        return icon;
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
