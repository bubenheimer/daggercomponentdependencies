/*
 * Copyright (c) 2015-2016 Uli Bubenheimer. All rights reserved.
 */

package org.bubenheimer.dagger.thirdcomp;

import dagger.Component;

@Component(modules = ThirdModule.class)
public interface ThirdComponent {
    @ScopeBeforeUse long longValue();
}
