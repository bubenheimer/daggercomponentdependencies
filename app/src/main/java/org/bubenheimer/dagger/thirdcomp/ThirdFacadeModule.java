/*
 * Copyright (c) 2015-2018 Uli Bubenheimer. All rights reserved.
 */

package org.bubenheimer.dagger.thirdcomp;

import dagger.Module;
import dagger.Provides;

@Module
public final class ThirdFacadeModule implements ThirdComponent {
    private final ThirdBaseComponent component;

    public ThirdFacadeModule(
            final ThirdBaseComponent component) {
        this.component = component;
    }

    @Override
    @Provides
    public long longValue() {
        return component.longValue();
    }
}
