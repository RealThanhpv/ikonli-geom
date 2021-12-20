package org.tpv.icon;

import org.kordamp.ikonli.IkonProvider;

@org.kordamp.jipsy.ServiceProviderFor(IkonProvider.class)
public class GeomIkonProvider implements IkonProvider<GeomIkon> {
    @Override
    public Class<GeomIkon> getIkon() {
        return GeomIkon.class;
    }
}