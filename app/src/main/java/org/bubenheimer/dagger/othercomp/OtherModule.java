/*
 * Copyright (c) 2015-2018 Uli Bubenheimer. All rights reserved.
 */

package org.bubenheimer.dagger.othercomp;

import dagger.Module;
import dagger.Provides;

@Module
abstract class OtherModule {
    private static int counter = 0;

    @OtherScope
    @Provides
    static int provideValue() {
        return counter++;
    }
}
