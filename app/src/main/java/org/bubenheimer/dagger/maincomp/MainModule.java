/*
 * Copyright (c) 2015-2018 Uli Bubenheimer. All rights reserved.
 */

package org.bubenheimer.dagger.maincomp;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

@Module
abstract class MainModule {
    @Binds
    abstract @Named("valueone") int provideValueOne(int value);

    @Binds
    abstract @Named("valuetwo") int provideValueTwo(int value);

    @Binds
    abstract @Named("valuethree") long provideValueThree(long value);

    @Binds
    abstract @Named("valuefour") long provideValueFour(long value);
}
