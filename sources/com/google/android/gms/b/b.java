package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.b.d;
import java.lang.Thread;
import java.util.ArrayList;

public final class b implements Thread.UncaughtExceptionHandler {
    final Thread.UncaughtExceptionHandler a;
    private final g b;
    private final Context c;
    private a d;
    private c e;

    public b(g gVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.a = uncaughtExceptionHandler;
        this.b = gVar;
        this.d = new f(context, new ArrayList());
        this.c = context.getApplicationContext();
        n.c("ExceptionReporter created, original handler is " + (uncaughtExceptionHandler == null ? "null" : uncaughtExceptionHandler.getClass().getName()));
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        String str = "UncaughtException";
        if (this.d != null) {
            str = this.d.a(thread != null ? thread.getName() : null, th);
        }
        n.c("Tracking Exception: " + str);
        g gVar = this.b;
        d.c cVar = new d.c();
        cVar.a("&exd", str);
        cVar.a("&exf", w.a());
        gVar.a(cVar.a());
        if (this.e == null) {
            this.e = c.a(this.c);
        }
        c cVar2 = this.e;
        cVar2.c.a();
        cVar2.b.e();
        if (this.a != null) {
            n.c("Passing exception to original handler.");
            this.a.uncaughtException(thread, th);
        }
    }
}
