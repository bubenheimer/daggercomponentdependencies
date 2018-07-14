/*
 * Copyright (c) 2015-2018 Uli Bubenheimer. All rights reserved.
 */

package org.bubenheimer.dagger.thirdcomp;

import dagger.Component;

@Component(modules = ThirdFacadeModule.class)
public interface ThirdComponent extends ThirdBaseComponent {
}
