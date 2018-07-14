/*
 * Copyright (c) 2015-2018 Uli Bubenheimer. All rights reserved.
 */

package org.bubenheimer.dagger.othercomp;

import dagger.Component;

@OtherScope
@Component(modules = {
        OtherModule.class
})
public interface OtherComponent {
    int intValue();
}
