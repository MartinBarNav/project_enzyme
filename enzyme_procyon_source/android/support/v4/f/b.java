// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.f;

import android.os.Handler;
import android.widget.Filter;
import android.database.ContentObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FilterQueryProvider;
import android.database.DataSetObserver;
import android.content.Context;
import android.database.Cursor;
import android.widget.Filterable;
import android.widget.BaseAdapter;

public abstract class b extends BaseAdapter implements c.a, Filterable
{
    protected boolean a;
    protected boolean b;
    protected Cursor c;
    protected Context d;
    protected int e;
    protected a f;
    protected DataSetObserver g;
    protected c h;
    protected FilterQueryProvider i;
    
    public b(final Context d) {
        this.b = true;
        this.c = null;
        this.a = false;
        this.d = d;
        this.e = -1;
        this.f = new a();
        this.g = new b((byte)0);
    }
    
    public final Cursor a() {
        return this.c;
    }
    
    public Cursor a(final CharSequence charSequence) {
        Cursor cursor;
        if (this.i != null) {
            cursor = this.i.runQuery(charSequence);
        }
        else {
            cursor = this.c;
        }
        return cursor;
    }
    
    public abstract View a(final Context p0, final Cursor p1, final ViewGroup p2);
    
    public void a(Cursor c) {
        if (c == this.c) {
            c = null;
        }
        else {
            final Cursor c2 = this.c;
            if (c2 != null) {
                if (this.f != null) {
                    c2.unregisterContentObserver((ContentObserver)this.f);
                }
                if (this.g != null) {
                    c2.unregisterDataSetObserver(this.g);
                }
            }
            if ((this.c = c) != null) {
                if (this.f != null) {
                    c.registerContentObserver((ContentObserver)this.f);
                }
                if (this.g != null) {
                    c.registerDataSetObserver(this.g);
                }
                this.e = c.getColumnIndexOrThrow("_id");
                this.a = true;
                this.notifyDataSetChanged();
                c = c2;
            }
            else {
                this.e = -1;
                this.a = false;
                this.notifyDataSetInvalidated();
                c = c2;
            }
        }
        if (c != null) {
            c.close();
        }
    }
    
    public abstract void a(final View p0, final Cursor p1);
    
    public View b(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return this.a(context, cursor, viewGroup);
    }
    
    public CharSequence b(final Cursor cursor) {
        String string;
        if (cursor == null) {
            string = "";
        }
        else {
            string = cursor.toString();
        }
        return string;
    }
    
    protected final void b() {
        if (this.b && this.c != null && !this.c.isClosed()) {
            this.a = this.c.requery();
        }
    }
    
    public int getCount() {
        int count;
        if (this.a && this.c != null) {
            count = this.c.getCount();
        }
        else {
            count = 0;
        }
        return count;
    }
    
    public View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        View b;
        if (this.a) {
            this.c.moveToPosition(n);
            if ((b = view) == null) {
                b = this.b(this.d, this.c, viewGroup);
            }
            this.a(b, this.c);
        }
        else {
            b = null;
        }
        return b;
    }
    
    public Filter getFilter() {
        if (this.h == null) {
            this.h = new c((c.a)this);
        }
        return this.h;
    }
    
    public Object getItem(final int n) {
        Cursor c;
        if (this.a && this.c != null) {
            this.c.moveToPosition(n);
            c = this.c;
        }
        else {
            c = null;
        }
        return c;
    }
    
    public long getItemId(final int n) {
        long long1;
        final long n2 = long1 = 0L;
        if (this.a) {
            long1 = n2;
            if (this.c != null) {
                long1 = n2;
                if (this.c.moveToPosition(n)) {
                    long1 = this.c.getLong(this.e);
                }
            }
        }
        return long1;
    }
    
    public View getView(final int i, final View view, final ViewGroup viewGroup) {
        if (!this.a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.c.moveToPosition(i)) {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        View a;
        if ((a = view) == null) {
            a = this.a(this.d, this.c, viewGroup);
        }
        this.a(a, this.c);
        return a;
    }
    
    public boolean hasStableIds() {
        return true;
    }
    
    private final class a extends ContentObserver
    {
        public a() {
            super(new Handler());
        }
        
        public final boolean deliverSelfNotifications() {
            return true;
        }
        
        public final void onChange(final boolean b) {
            b.this.b();
        }
    }
    
    private final class b extends DataSetObserver
    {
        public final void onChanged() {
            android.support.v4.f.b.this.a = true;
            android.support.v4.f.b.this.notifyDataSetChanged();
        }
        
        public final void onInvalidated() {
            android.support.v4.f.b.this.a = false;
            android.support.v4.f.b.this.notifyDataSetInvalidated();
        }
    }
}
