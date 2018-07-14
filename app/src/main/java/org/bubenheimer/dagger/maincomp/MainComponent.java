/*
 * Copyright (c) 2015-2018 Uli Bubenheimer. All rights reserved.
 */

package org.bubenheimer.dagger.maincomp;

import org.bubenheimer.dagger.othercomp.OtherComponent;
import org.bubenheimer.dagger.thirdcomp.ThirdComponent;

import javax.inject.Named;

import dagger.Component;

@MainScope
@Component(
        dependencies = {
                OtherComponent.class,
                ThirdComponent.class
        },
        modules = MainModule.class
)
public interface MainComponent {
    @Named("valueone") int valueOne();
    @Named("valuetwo") int valueTwo();
    @Named("valuethree") long valueThree();
    @Named("valuefour") long valueFour();
}
