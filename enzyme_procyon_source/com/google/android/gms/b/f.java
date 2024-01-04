// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import java.util.Iterator;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.HashSet;
import java.util.Collection;
import android.content.Context;
import java.util.TreeSet;

public final class f implements a
{
    private final TreeSet<String> a;
    
    public f(final Context context, final Collection<String> collection) {
        this.a = new TreeSet<String>();
        this.a(context, collection);
    }
    
    private static Throwable a(Throwable cause) {
        while (cause.getCause() != null) {
            cause = cause.getCause();
        }
        return cause;
    }
    
    private void a(final Context context, final Collection<String> collection) {
        this.a.clear();
        final HashSet<String> set = new HashSet<String>();
        if (collection != null) {
            set.addAll((Collection<?>)collection);
        }
        if (context != null) {
            try {
                final String packageName = context.getApplicationContext().getPackageName();
                this.a.add(packageName);
                final ActivityInfo[] activities = context.getApplicationContext().getPackageManager().getPackageInfo(packageName, 15).activities;
                if (activities != null) {
                    for (int length = activities.length, i = 0; i < length; ++i) {
                        set.add(activities[i].packageName);
                    }
                }
            }
            catch (PackageManager$NameNotFoundException ex) {
                n.b("No package found");
            }
        }
        for (final String s : set) {
            final Iterator<String> iterator2 = this.a.iterator();
            int n = 1;
            while (iterator2.hasNext()) {
                final String s2 = iterator2.next();
                if (!s.startsWith(s2)) {
                    if (s2.startsWith(s)) {
                        this.a.remove(s2);
                        break;
                    }
                    break;
                }
                else {
                    n = 0;
                }
            }
            if (n != 0) {
                this.a.add(s);
            }
        }
    }
    
    @Override
    public final String a(final String s, final Throwable t) {
        final Throwable a = a(t);
        final StackTraceElement[] stackTrace = a(t).getStackTrace();
        StackTraceElement stackTraceElement = null;
        Label_0027: {
            if (stackTrace == null || stackTrace.length == 0) {
                stackTraceElement = null;
            }
            else {
                for (int length = stackTrace.length, i = 0; i < length; ++i) {
                    stackTraceElement = stackTrace[i];
                    final String className = stackTraceElement.getClassName();
                    final Iterator<String> iterator = this.a.iterator();
                    while (iterator.hasNext()) {
                        if (className.startsWith(iterator.next())) {
                            break Label_0027;
                        }
                    }
                }
                stackTraceElement = stackTrace[0];
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(a.getClass().getSimpleName());
        if (stackTraceElement != null) {
            final String[] split = stackTraceElement.getClassName().split("\\.");
            String s2 = "unknown";
            if (split != null) {
                s2 = s2;
                if (split.length > 0) {
                    s2 = split[split.length - 1];
                }
            }
            sb.append(String.format(" (@%s:%s:%s)", s2, stackTraceElement.getMethodName(), stackTraceElement.getLineNumber()));
        }
        if (s != null) {
            sb.append(String.format(" {%s}", s));
        }
        return sb.toString();
    }
}
