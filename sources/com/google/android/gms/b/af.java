package com.google.android.gms.b;

import java.util.HashSet;
import java.util.Set;

public final class af implements ak {
    private final Set<Integer> a = new HashSet();

    af() {
        this.a.add(302);
        this.a.add(404);
        this.a.add(502);
    }

    public final String a() {
        return "/collect";
    }

    public final String b() {
        return "/batch";
    }

    public final ae c() {
        return ae.BATCH_BY_SESSION;
    }

    public final ah d() {
        return ah.GZIP;
    }

    public final Set<Integer> e() {
        return this.a;
    }
}
