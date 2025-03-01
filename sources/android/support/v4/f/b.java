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

public abstract class b extends BaseAdapter implements c.a, Filterable {
    protected boolean a = false;
    protected boolean b = true;
    protected Cursor c = null;
    protected Context d;
    protected int e;
    protected a f;
    protected DataSetObserver g;
    protected c h;
    protected FilterQueryProvider i;

    public abstract View a(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract void a(View view, Cursor cursor);

    public b(Context context) {
        this.d = context;
        this.e = -1;
        this.f = new a();
        this.g = new C0005b(this, (byte) 0);
    }

    public final Cursor a() {
        return this.c;
    }

    public int getCount() {
        if (!this.a || this.c == null) {
            return 0;
        }
        return this.c.getCount();
    }

    public Object getItem(int i2) {
        if (!this.a || this.c == null) {
            return null;
        }
        this.c.moveToPosition(i2);
        return this.c;
    }

    public long getItemId(int i2) {
        if (!this.a || this.c == null || !this.c.moveToPosition(i2)) {
            return 0;
        }
        return this.c.getLong(this.e);
    }

    public boolean hasStableIds() {
        return true;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (!this.c.moveToPosition(i2)) {
            throw new IllegalStateException("couldn't move cursor to position " + i2);
        } else {
            if (view == null) {
                view = a(this.d, this.c, viewGroup);
            }
            a(view, this.c);
            return view;
        }
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.c.moveToPosition(i2);
        if (view == null) {
            view = b(this.d, this.c, viewGroup);
        }
        a(view, this.c);
        return view;
    }

    public View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return a(context, cursor, viewGroup);
    }

    public CharSequence b(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public Cursor a(CharSequence charSequence) {
        if (this.i != null) {
            return this.i.runQuery(charSequence);
        }
        return this.c;
    }

    public Filter getFilter() {
        if (this.h == null) {
            this.h = new c(this);
        }
        return this.h;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (this.b && this.c != null && !this.c.isClosed()) {
            this.a = this.c.requery();
        }
    }

    private class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z) {
            b.this.b();
        }
    }

    /* renamed from: android.support.v4.f.b$b  reason: collision with other inner class name */
    private class C0005b extends DataSetObserver {
        private C0005b() {
        }

        /* synthetic */ C0005b(b bVar, byte b) {
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

    public void a(Cursor cursor) {
        Cursor cursor2;
        if (cursor == this.c) {
            cursor2 = null;
        } else {
            cursor2 = this.c;
            if (cursor2 != null) {
                if (this.f != null) {
                    cursor2.unregisterContentObserver(this.f);
                }
                if (this.g != null) {
                    cursor2.unregisterDataSetObserver(this.g);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                if (this.f != null) {
                    cursor.registerContentObserver(this.f);
                }
                if (this.g != null) {
                    cursor.registerDataSetObserver(this.g);
                }
                this.e = cursor.getColumnIndexOrThrow("_id");
                this.a = true;
                notifyDataSetChanged();
            } else {
                this.e = -1;
                this.a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }
}
