package android.support.v4.f;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class i extends b {
    private int j;
    private int k;
    private LayoutInflater l;

    public i(Context context, int i) {
        super(context);
        this.k = i;
        this.j = i;
        this.l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.l.inflate(this.j, viewGroup, false);
    }

    public final View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.l.inflate(this.k, viewGroup, false);
    }
}
