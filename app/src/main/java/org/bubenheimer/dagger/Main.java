/*
 * Copyright (c) 2015-2018 Uli Bubenheimer. All rights reserved.
 */

package org.bubenheimer.dagger;

import org.bubenheimer.dagger.maincomp.DaggerMainComponent;
import org.bubenheimer.dagger.maincomp.MainComponent;
import org.bubenheimer.dagger.othercomp.DaggerOtherComponent;
import org.bubenheimer.dagger.othercomp.OtherComponent;
import org.bubenheimer.dagger.thirdcomp.DaggerThirdBaseComponent;
import org.bubenheimer.dagger.thirdcomp.DaggerThirdComponent;
import org.bubenheimer.dagger.thirdcomp.ThirdComponent;
import org.bubenheimer.dagger.thirdcomp.ThirdFacadeModule;

final class Main {
    public static void main(final String[] args) {
        final OtherComponent otherComp = DaggerOtherComponent.create();
        final ThirdComponent thirdComp = DaggerThirdComponent.builder()
                .thirdFacadeModule(new ThirdFacadeModule(DaggerThirdBaseComponent.create()))
                .build();
        final MainComponent mainComp = DaggerMainComponent.builder()
                .otherComponent(otherComp)
                .thirdComponent(thirdComp)
                .build();
        System.out.println(mainComp.valueOne());
        System.out.println(mainComp.valueTwo());
        System.out.println(mainComp.valueThree());
        System.out.println(mainComp.valueFour());
    }
}
