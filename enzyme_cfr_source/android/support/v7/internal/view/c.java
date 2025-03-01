/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.animation.Interpolator
 */
package android.support.v7.internal.view;

import android.support.v4.view.ae;
import android.support.v4.view.ah;
import android.support.v4.view.ai;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public final class c {
    public final ArrayList<ae> a;
    ah b;
    public boolean c;
    private long d = -1L;
    private Interpolator e;
    private final ai f = new ai(){
        private boolean b = false;
        private int c = 0;

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public final void a(View view) {
            if (this.b) {
                return;
            }
            this.b = true;
            if (c.this.b == null) return;
            c.this.b.a(null);
        }

        @Override
        public final void b(View view) {
            int n2;
            this.c = n2 = this.c + 1;
            if (n2 == c.this.a.size()) {
                if (c.this.b != null) {
                    c.this.b.b(null);
                }
                this.c = 0;
                this.b = false;
                c.this.c = false;
            }
        }
    };

    public c() {
        this.a = new ArrayList();
    }

    public final c a(ae ae2) {
        if (!this.c) {
            this.a.add(ae2);
        }
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a() {
        if (this.c) {
            return;
        }
        for (ae ae2 : this.a) {
            View view;
            if (this.d >= 0L) {
                ae2.a(this.d);
            }
            if (this.e != null) {
                ae2.a(this.e);
            }
            if (this.b != null) {
                ae2.a(this.f);
            }
            if ((view = (View)ae2.a.get()) == null) continue;
            ae.b.d(ae2, view);
        }
        this.c = true;
    }
}

