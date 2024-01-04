/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.widget.Filter
 *  android.widget.Filter$FilterResults
 */
package android.support.v4.f;

import android.database.Cursor;
import android.widget.Filter;

final class c
extends Filter {
    a a;

    c(a a2) {
        this.a = a2;
    }

    public final CharSequence convertResultToString(Object object) {
        return this.a.b((Cursor)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursor = this.a.a(charSequence);
        charSequence = new Filter.FilterResults();
        if (cursor != null) {
            ((Filter.FilterResults)charSequence).count = cursor.getCount();
            ((Filter.FilterResults)charSequence).values = cursor;
            return charSequence;
        }
        ((Filter.FilterResults)charSequence).count = 0;
        ((Filter.FilterResults)charSequence).values = null;
        return charSequence;
    }

    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        charSequence = this.a.a();
        if (filterResults.values != null && filterResults.values != charSequence) {
            this.a.a((Cursor)filterResults.values);
        }
    }

    static interface a {
        public Cursor a();

        public Cursor a(CharSequence var1);

        public void a(Cursor var1);

        public CharSequence b(Cursor var1);
    }
}

