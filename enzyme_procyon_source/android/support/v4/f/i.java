// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.f;

import android.view.View;
import android.view.ViewGroup;
import android.database.Cursor;
import android.content.Context;
import android.view.LayoutInflater;

public abstract class i extends b
{
    private int j;
    private int k;
    private LayoutInflater l;
    
    public i(final Context context, final int n) {
        super(context);
        this.k = n;
        this.j = n;
        this.l = (LayoutInflater)context.getSystemService("layout_inflater");
    }
    
    @Override
    public View a(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return this.l.inflate(this.j, viewGroup, false);
    }
    
    @Override
    public final View b(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return this.l.inflate(this.k, viewGroup, false);
    }
}
