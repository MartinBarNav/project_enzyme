/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.b.a;
import com.google.android.gms.b.c;
import com.google.android.gms.b.d;
import com.google.android.gms.b.f;
import com.google.android.gms.b.g;
import com.google.android.gms.b.n;
import com.google.android.gms.b.w;
import java.util.ArrayList;

public final class b
implements Thread.UncaughtExceptionHandler {
    final Thread.UncaughtExceptionHandler a;
    private final g b;
    private final Context c;
    private a d;
    private c e;

    /*
     * Enabled aggressive block sorting
     */
    public b(g object, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Context object2) {
        if (object2 == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.a = uncaughtExceptionHandler;
        this.b = object;
        this.d = new f((Context)object2, new ArrayList<String>());
        this.c = object2.getApplicationContext();
        object2 = new StringBuilder("ExceptionReporter created, original handler is ");
        object = uncaughtExceptionHandler == null ? "null" : uncaughtExceptionHandler.getClass().getName();
        n.c(((StringBuilder)object2).append((String)object).toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void uncaughtException(Thread thread, Throwable throwable) {
        Object object = "UncaughtException";
        if (this.d != null) {
            object = thread != null ? thread.getName() : null;
            object = this.d.a((String)object, throwable);
        }
        n.c("Tracking Exception: " + (String)object);
        g g2 = this.b;
        d.c c2 = new d.c();
        c2.a("&exd", (String)object);
        c2.a("&exf", w.a());
        g2.a(c2.a());
        if (this.e == null) {
            this.e = com.google.android.gms.b.c.a(this.c);
        }
        object = this.e;
        ((c)object).c.a();
        ((c)object).b.e();
        if (this.a != null) {
            n.c("Passing exception to original handler.");
            this.a.uncaughtException(thread, throwable);
        }
    }
}

