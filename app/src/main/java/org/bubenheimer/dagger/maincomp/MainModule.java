/*
 * Copyright (c) 2015-2016 Uli Bubenheimer. All rights reserved.
 */

package org.bubenheimer.dagger.maincomp;

import org.bubenheimer.dagger.thirdcomp.ScopeBeforeUse;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
abstract class MainModule {
    @Provides
    static @Named("valueone") int provideValueOne(final int value) {
        return value;
    }

    @Provides
    static @Named("valuetwo") int provideValueTwo(final int value) {
        return value;
    }

    @MainScope
    @Provides
    static long provideLongValue(final @ScopeBeforeUse long value) {
        return value;
    }

    @Provides
    static @Named("valuethree") long provideValueThree(final long value) {
        return value;
    }

    @Provides
    static @Named("valuefour") long provideValueFour(final long value) {
        return value;
    }
}
