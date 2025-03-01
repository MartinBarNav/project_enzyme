// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import java.util.Map;
import java.util.Collection;
import java.util.ArrayList;
import android.content.Context;

public final class b implements UncaughtExceptionHandler
{
    final UncaughtExceptionHandler a;
    private final g b;
    private final Context c;
    private a d;
    private c e;
    
    public b(final g b, final UncaughtExceptionHandler a, final Context context) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.a = a;
        this.b = b;
        this.d = new f(context, new ArrayList<String>());
        this.c = context.getApplicationContext();
        final StringBuilder sb = new StringBuilder("ExceptionReporter created, original handler is ");
        String name;
        if (a == null) {
            name = "null";
        }
        else {
            name = a.getClass().getName();
        }
        n.c(sb.append(name).toString());
    }
    
    @Override
    public final void uncaughtException(final Thread thread, final Throwable t) {
        String a = "UncaughtException";
        if (this.d != null) {
            String name;
            if (thread != null) {
                name = thread.getName();
            }
            else {
                name = null;
            }
            a = this.d.a(name, t);
        }
        n.c("Tracking Exception: " + a);
        final g b = this.b;
        final d.c c = new d.c();
        ((d.d<d.c>)c).a("&exd", a);
        ((d.d<d.c>)c).a("&exf", w.a());
        b.a(c.a());
        if (this.e == null) {
            this.e = com.google.android.gms.b.c.a(this.c);
        }
        final c e = this.e;
        e.c.a();
        e.b.e();
        if (this.a != null) {
            n.c("Passing exception to original handler.");
            this.a.uncaughtException(thread, t);
        }
    }
}
