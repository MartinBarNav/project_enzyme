package android.support.v7.internal.view;

import android.support.v4.view.ae;
import android.support.v4.view.ah;
import android.support.v4.view.ai;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public final class c {
    public final ArrayList<ae> a = new ArrayList<>();
    ah b;
    public boolean c;
    private long d = -1;
    private Interpolator e;
    private final ai f = new ai() {
        private boolean b = false;
        private int c = 0;

        public final void a(View view) {
            if (!this.b) {
                this.b = true;
                if (c.this.b != null) {
                    c.this.b.a((View) null);
                }
            }
        }

        public final void b(View view) {
            int i = this.c + 1;
            this.c = i;
            if (i == c.this.a.size()) {
                if (c.this.b != null) {
                    c.this.b.b((View) null);
                }
                this.c = 0;
                this.b = false;
                c.this.c = false;
            }
        }
    };

    public final c a(ae aeVar) {
        if (!this.c) {
            this.a.add(aeVar);
        }
        return this;
    }

    public final void a() {
        if (!this.c) {
            Iterator<ae> it = this.a.iterator();
            while (it.hasNext()) {
                ae next = it.next();
                if (this.d >= 0) {
                    next.a(this.d);
                }
                if (this.e != null) {
                    next.a(this.e);
                }
                if (this.b != null) {
                    next.a((ah) this.f);
                }
                View view = (View) next.a.get();
                if (view != null) {
                    ae.b.d(next, view);
                }
            }
            this.c = true;
        }
    }
}
