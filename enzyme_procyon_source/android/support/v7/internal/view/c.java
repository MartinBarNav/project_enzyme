// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.view;

import java.util.Iterator;
import android.view.View;
import android.support.v4.view.ai;
import android.view.animation.Interpolator;
import android.support.v4.view.ah;
import android.support.v4.view.ae;
import java.util.ArrayList;

public final class c
{
    public final ArrayList<ae> a;
    ah b;
    public boolean c;
    private long d;
    private Interpolator e;
    private final ai f;
    
    public c() {
        this.d = -1L;
        this.f = new ai() {
            private boolean b = false;
            private int c = 0;
            
            @Override
            public final void a(final View view) {
                if (!this.b) {
                    this.b = true;
                    if (android.support.v7.internal.view.c.this.b != null) {
                        android.support.v7.internal.view.c.this.b.a(null);
                    }
                }
            }
            
            @Override
            public final void b(final View view) {
                final int c = this.c + 1;
                this.c = c;
                if (c == android.support.v7.internal.view.c.this.a.size()) {
                    if (android.support.v7.internal.view.c.this.b != null) {
                        android.support.v7.internal.view.c.this.b.b(null);
                    }
                    this.c = 0;
                    this.b = false;
                    android.support.v7.internal.view.c.this.c = false;
                }
            }
        };
        this.a = new ArrayList<ae>();
    }
    
    public final c a(final ae e) {
        if (!this.c) {
            this.a.add(e);
        }
        return this;
    }
    
    public final void a() {
        if (!this.c) {
            for (final ae ae : this.a) {
                if (this.d >= 0L) {
                    ae.a(this.d);
                }
                if (this.e != null) {
                    ae.a(this.e);
                }
                if (this.b != null) {
                    ae.a(this.f);
                }
                final View view = ae.a.get();
                if (view != null) {
                    ae.b.d(ae, view);
                }
            }
            this.c = true;
        }
    }
}
