package com.google.android.gms.common;

import android.content.Intent;

public class d extends Exception {
    private final Intent a;

    public d(String str, Intent intent) {
        super(str);
        this.a = intent;
    }
}
