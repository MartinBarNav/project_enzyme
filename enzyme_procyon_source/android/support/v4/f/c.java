// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.f;

import android.widget.Filter$FilterResults;
import android.database.Cursor;
import android.widget.Filter;

final class c extends Filter
{
    a a;
    
    c(final a a) {
        this.a = a;
    }
    
    public final CharSequence convertResultToString(final Object o) {
        return this.a.b((Cursor)o);
    }
    
    protected final Filter$FilterResults performFiltering(final CharSequence charSequence) {
        final Cursor a = this.a.a(charSequence);
        final Filter$FilterResults filter$FilterResults = new Filter$FilterResults();
        if (a != null) {
            filter$FilterResults.count = a.getCount();
            filter$FilterResults.values = a;
        }
        else {
            filter$FilterResults.count = 0;
            filter$FilterResults.values = null;
        }
        return filter$FilterResults;
    }
    
    protected final void publishResults(final CharSequence charSequence, final Filter$FilterResults filter$FilterResults) {
        final Cursor a = this.a.a();
        if (filter$FilterResults.values != null && filter$FilterResults.values != a) {
            this.a.a((Cursor)filter$FilterResults.values);
        }
    }
    
    interface a
    {
        Cursor a();
        
        Cursor a(final CharSequence p0);
        
        void a(final Cursor p0);
        
        CharSequence b(final Cursor p0);
    }
}
