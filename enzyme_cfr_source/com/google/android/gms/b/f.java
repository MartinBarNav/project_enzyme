/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.b.a;
import com.google.android.gms.b.n;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public final class f
implements a {
    private final TreeSet<String> a = new TreeSet();

    public f(Context context, Collection<String> collection) {
        this.a(context, collection);
    }

    private static Throwable a(Throwable throwable) {
        while (throwable.getCause() != null) {
            throwable = throwable.getCause();
        }
        return throwable;
    }

    private void a(Context object, Collection<String> object2) {
        int n2;
        Object object3;
        block14: {
            this.a.clear();
            object3 = new HashSet<String>();
            if (object2 != null) {
                object3.addAll(object2);
            }
            if (object != null) {
                object2 = object.getApplicationContext().getPackageName();
                this.a.add((String)object2);
                object = object.getApplicationContext().getPackageManager().getPackageInfo((String)object2, (int)15).activities;
                if (object == null) break block14;
                int n3 = ((Object)object).length;
                for (n2 = 0; n2 < n3; ++n2) {
                    try {
                        object3.add(((ActivityInfo)object[n2]).packageName);
                        continue;
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        n.b("No package found");
                        break;
                    }
                }
            }
        }
        object = object3.iterator();
        block5: while (object.hasNext()) {
            object3 = (String)object.next();
            Iterator<String> iterator = this.a.iterator();
            n2 = 1;
            while (true) {
                block16: {
                    block15: {
                        if (!iterator.hasNext()) break block15;
                        object2 = iterator.next();
                        if (((String)object3).startsWith((String)object2)) break block16;
                        if (((String)object2).startsWith((String)object3)) {
                            this.a.remove(object2);
                        }
                    }
                    if (n2 == 0) continue block5;
                    this.a.add((String)object3);
                    continue block5;
                }
                n2 = 0;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final String a(String var1_1, Throwable var2_2) {
        var3_3 = f.a((Throwable)var2_2);
        var4_4 = f.a((Throwable)var2_2).getStackTrace();
        if (var4_4 != null && var4_4.length != 0) {
            var7_7 = var4_4.length;
        } else {
            var2_2 = null;
lbl7:
            // 3 sources

            while (true) {
                var5_5 = new StringBuilder();
                var5_5.append(var3_3.getClass().getSimpleName());
                if (var2_2 != null) {
                    var4_4 = var2_2.getClassName().split("\\.");
                    var6_6 = "unknown";
                    var3_3 = var6_6;
                    if (var4_4 != null) {
                        var3_3 = var6_6;
                        if (var4_4.length > 0) {
                            var3_3 = var4_4[var4_4.length - 1];
                        }
                    }
                    var5_5.append(String.format(" (@%s:%s:%s)", new Object[]{var3_3, var2_2.getMethodName(), var2_2.getLineNumber()}));
                }
                if (var1_1 == null) return var5_5.toString();
                var5_5.append(String.format(" {%s}", new Object[]{var1_1}));
                return var5_5.toString();
            }
        }
        for (var8_8 = 0; var8_8 < var7_7; ++var8_8) {
            var2_2 = var4_4[var8_8];
            var6_6 = var2_2.getClassName();
            var5_5 = this.a.iterator();
            while (var5_5.hasNext()) {
                if (!var6_6.startsWith((String)var5_5.next())) continue;
                ** GOTO lbl7
            }
        }
        var2_2 = var4_4[0];
        ** while (true)
    }
}

