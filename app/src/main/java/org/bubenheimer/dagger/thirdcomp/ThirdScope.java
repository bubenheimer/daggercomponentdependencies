/*
 * Copyright (c) 2015-2018 Uli Bubenheimer. All rights reserved.
 */

package org.bubenheimer.dagger.thirdcomp;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

@Scope
@Retention(RetentionPolicy.RUNTIME)
@interface ThirdScope {
}
