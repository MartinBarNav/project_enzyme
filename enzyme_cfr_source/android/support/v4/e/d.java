/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package android.support.v4.e;

import android.util.Log;
import java.io.Writer;

public final class d
extends Writer {
    private final String a;
    private StringBuilder b = new StringBuilder(128);

    public d(String string) {
        this.a = string;
    }

    private void a() {
        if (this.b.length() > 0) {
            Log.d((String)this.a, (String)this.b.toString());
            this.b.delete(0, this.b.length());
        }
    }

    @Override
    public final void close() {
        this.a();
    }

    @Override
    public final void flush() {
        this.a();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void write(char[] arrc, int n2, int n3) {
        int n4 = 0;
        while (n4 < n3) {
            char c2 = arrc[n2 + n4];
            if (c2 == '\n') {
                this.a();
            } else {
                this.b.append(c2);
            }
            ++n4;
        }
        return;
    }
}

