// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import android.os.Build$VERSION;

public final class ap
{
    public static int a() {
        try {
            return Integer.parseInt(Build$VERSION.SDK);
        }
        catch (NumberFormatException ex) {
            n.a("Invalid version number: " + Build$VERSION.SDK);
            return 0;
        }
    }
}
