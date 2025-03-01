/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.google.android.gms.common;

import android.content.Intent;

public class d
extends Exception {
    private final Intent a;

    public d(String string, Intent intent) {
        super(string);
        this.a = intent;
    }
}

