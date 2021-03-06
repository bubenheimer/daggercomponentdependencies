/*
 * Copyright (c) 2015-2018 Uli Bubenheimer. All rights reserved.
 */

package org.bubenheimer.dagger.thirdcomp;

import dagger.Component;

@ThirdScope
@Component(modules = ThirdModule.class)
public interface ThirdBaseComponent {
    long longValue();
}
