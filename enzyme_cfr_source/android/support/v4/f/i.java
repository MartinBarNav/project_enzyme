/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package android.support.v4.f;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.f.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class i
extends b {
    private int j;
    private int k;
    private LayoutInflater l;

    public i(Context context, int n2) {
        super(context);
        this.k = n2;
        this.j = n2;
        this.l = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    @Override
    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.l.inflate(this.j, viewGroup, false);
    }

    @Override
    public final View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.l.inflate(this.k, viewGroup, false);
    }
}

