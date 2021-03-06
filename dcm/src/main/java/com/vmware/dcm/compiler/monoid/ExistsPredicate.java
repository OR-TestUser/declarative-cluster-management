/*
 * Copyright 2018-2020 VMware, Inc. All Rights Reserved.
 *
 * SPDX-License-Identifier: BSD-2
 */

package com.vmware.dcm.compiler.monoid;

public class ExistsPredicate extends Expr {
    private final Expr argument;

    public ExistsPredicate(final Expr argument) {
        this.argument = argument;
    }

    public Expr getArgument() {
        return argument;
    }

    @Override
    public String toString() {
        return "Exists{" +
                "argument=" + argument +
                '}';
    }

    @Override
    <T, C> T acceptVisitor(final MonoidVisitor<T, C> visitor, final C context) {
        return visitor.visitExistsPredicate(this, context);
    }
}
