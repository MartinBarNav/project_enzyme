/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.ContentObserver
 *  android.database.Cursor
 *  android.database.DataSetObserver
 *  android.os.Handler
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.Filter
 *  android.widget.FilterQueryProvider
 *  android.widget.Filterable
 */
package android.support.v4.f;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.v4.f.c;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

public abstract class b
extends BaseAdapter
implements c.a,
Filterable {
    protected boolean a = false;
    protected boolean b = true;
    protected Cursor c = null;
    protected Context d;
    protected int e;
    protected a f;
    protected DataSetObserver g;
    protected c h;
    protected FilterQueryProvider i;

    public b(Context context) {
        this.d = context;
        this.e = -1;
        this.f = new a();
        this.g = new b(0);
    }

    @Override
    public final Cursor a() {
        return this.c;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Cursor a(CharSequence charSequence) {
        if (this.i == null) return this.c;
        return this.i.runQuery(charSequence);
    }

    public abstract View a(Context var1, Cursor var2, ViewGroup var3);

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(Cursor cursor) {
        if (cursor == this.c) {
            return;
        }
        Cursor cursor2 = this.c;
        if (cursor2 != null) {
            if (this.f != null) {
                cursor2.unregisterContentObserver((ContentObserver)this.f);
            }
            if (this.g != null) {
                cursor2.unregisterDataSetObserver(this.g);
            }
        }
        this.c = cursor;
        if (cursor != null) {
            if (this.f != null) {
                cursor.registerContentObserver((ContentObserver)this.f);
            }
            if (this.g != null) {
                cursor.registerDataSetObserver(this.g);
            }
            this.e = cursor.getColumnIndexOrThrow("_id");
            this.a = true;
            this.notifyDataSetChanged();
            cursor = cursor2;
        } else {
            this.e = -1;
            this.a = false;
            this.notifyDataSetInvalidated();
            cursor = cursor2;
        }
        if (cursor == null) return;
        cursor.close();
    }

    public abstract void a(View var1, Cursor var2);

    public View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.a(context, cursor, viewGroup);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public CharSequence b(Cursor object) {
        void var1_3;
        if (object == null) {
            return var1_3;
        }
        String string = object.toString();
        return var1_3;
    }

    protected final void b() {
        if (this.b && this.c != null && !this.c.isClosed()) {
            this.a = this.c.requery();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int getCount() {
        if (!this.a) return 0;
        if (this.c == null) return 0;
        return this.c.getCount();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public View getDropDownView(int n2, View view, ViewGroup viewGroup) {
        if (!this.a) return null;
        this.c.moveToPosition(n2);
        View view2 = view;
        if (view == null) {
            view2 = this.b(this.d, this.c, viewGroup);
        }
        this.a(view2, this.c);
        return view2;
    }

    public Filter getFilter() {
        if (this.h == null) {
            this.h = new c(this);
        }
        return this.h;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Object getItem(int n2) {
        if (!this.a) return null;
        if (this.c == null) return null;
        this.c.moveToPosition(n2);
        return this.c;
    }

    public long getItemId(int n2) {
        long l2;
        long l3 = l2 = 0L;
        if (this.a) {
            l3 = l2;
            if (this.c != null) {
                l3 = l2;
                if (this.c.moveToPosition(n2)) {
                    l3 = this.c.getLong(this.e);
                }
            }
        }
        return l3;
    }

    public View getView(int n2, View view, ViewGroup viewGroup) {
        if (!this.a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.c.moveToPosition(n2)) {
            throw new IllegalStateException("couldn't move cursor to position " + n2);
        }
        View view2 = view;
        if (view == null) {
            view2 = this.a(this.d, this.c, viewGroup);
        }
        this.a(view2, this.c);
        return view2;
    }

    public boolean hasStableIds() {
        return true;
    }

    private final class a
    extends ContentObserver {
        public a() {
            super(new Handler());
        }

        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean bl) {
            b.this.b();
        }
    }

    private final class b
    extends DataSetObserver {
        private b() {
        }

        /* synthetic */ b(byte by) {
            this();
        }

        public final void onChanged() {
            b.this.a = true;
            b.this.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            b.this.a = false;
            b.this.notifyDataSetInvalidated();
        }
    }
}

