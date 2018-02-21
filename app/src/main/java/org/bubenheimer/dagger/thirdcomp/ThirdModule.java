/*
 * Copyright (c) 2015-2016 Uli Bubenheimer. All rights reserved.
 */

package org.bubenheimer.dagger.thirdcomp;

import dagger.Module;
import dagger.Provides;

@Module
abstract class ThirdModule {
    private static long counter = 100L;

    @Provides
    static @ScopeBeforeUse long provideValue() {
        return counter++;
    }
}
