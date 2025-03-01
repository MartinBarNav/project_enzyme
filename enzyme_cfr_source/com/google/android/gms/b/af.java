/*
 * Decompiled with CFR 0.150.
 */
package com.google.android.gms.b;

import com.google.android.gms.b.ae;
import com.google.android.gms.b.ah;
import com.google.android.gms.b.ak;
import java.util.HashSet;
import java.util.Set;

public final class af
implements ak {
    private final Set<Integer> a = new HashSet<Integer>();

    af() {
        this.a.add(302);
        this.a.add(404);
        this.a.add(502);
    }

    @Override
    public final String a() {
        return "/collect";
    }

    @Override
    public final String b() {
        return "/batch";
    }

    @Override
    public final ae c() {
        return ae.b;
    }

    @Override
    public final ah d() {
        return ah.b;
    }

    @Override
    public final Set<Integer> e() {
        return this.a;
    }
}

