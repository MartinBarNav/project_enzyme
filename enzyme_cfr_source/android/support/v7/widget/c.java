/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.SearchManager
 *  android.app.SearchableInfo
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.database.Cursor
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.TextAppearanceSpan
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.f.i;
import android.support.v7.b.a;
import android.support.v7.widget.SearchView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

final class c
extends i
implements View.OnClickListener {
    int j = 1;
    private final SearchManager k = (SearchManager)this.d.getSystemService("search");
    private final SearchView l;
    private final SearchableInfo m;
    private final Context n;
    private final WeakHashMap<String, Drawable.ConstantState> o;
    private final int p;
    private boolean q = false;
    private ColorStateList r;
    private int s = -1;
    private int t = -1;
    private int u = -1;
    private int v = -1;
    private int w = -1;
    private int x = -1;

    public c(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.l = searchView;
        this.m = searchableInfo;
        this.p = searchView.getSuggestionCommitIconResId();
        this.n = context;
        this.o = weakHashMap;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Drawable a(ComponentName componentName) {
        ActivityInfo activityInfo;
        Object var2_3 = null;
        PackageManager packageManager = this.d.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            Log.w((String)"SuggestionsAdapter", (String)nameNotFoundException.toString());
            return var2_3;
        }
        int n2 = activityInfo.getIconResource();
        if (n2 == 0) {
            return var2_3;
        }
        if ((packageManager = packageManager.getDrawable(componentName.getPackageName(), n2, activityInfo.applicationInfo)) != null) return packageManager;
        Log.w((String)"SuggestionsAdapter", (String)("Invalid icon resource " + n2 + " for " + componentName.flattenToShortString()));
        return var2_3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private Drawable a(Uri uri) {
        block13: {
            try {
                bl = "android.resource".equals(uri.getScheme());
                if (bl) {
                    try {
                        drawable = this.b(uri);
                        return drawable;
                    }
                    catch (Resources.NotFoundException notFoundException) {
                        stringBuilder = new StringBuilder("Resource does not exist: ");
                        fileNotFoundException = new FileNotFoundException(stringBuilder.append((Object)uri).toString());
                        throw fileNotFoundException;
                    }
                }
                object = this.n.getContentResolver().openInputStream(uri);
                if (object != null) break block13;
                object = new StringBuilder("Failed to open ");
                fileNotFoundException = new FileNotFoundException(object.append((Object)uri).toString());
                throw fileNotFoundException;
            }
            catch (FileNotFoundException fileNotFoundException) {
                Log.w((String)"SuggestionsAdapter", (String)("Icon not found: " + (Object)uri + ", " + fileNotFoundException.getMessage()));
                return null;
            }
        }
        try {
            drawable = Drawable.createFromStream((InputStream)object, null);
        }
        catch (Throwable throwable) {
            try {
                object.close();
            }
            catch (IOException iOException) {
                object = new StringBuilder("Error closing icon stream for ");
                Log.e((String)"SuggestionsAdapter", (String)object.append((Object)uri).toString(), (Throwable)iOException);
                throw throwable;
            }
            throw throwable;
        }
        ** try [egrp 5[TRYBLOCK] [7 : 152->157)] { 
lbl-1000:
        // 1 sources

        {
            object.close();
            return drawable;
        }
lbl37:
        // 1 sources

        catch (IOException iOException) {
            object = new StringBuilder("Error closing icon stream for ");
            Log.e((String)"SuggestionsAdapter", (String)object.append((Object)uri).toString(), (Throwable)iOException);
            return drawable;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Drawable a(String string) {
        if (string == null) return null;
        if (string.length() == 0) return null;
        if ("0".equals(string)) {
            return null;
        }
        int n2 = Integer.parseInt(string);
        StringBuilder stringBuilder = new StringBuilder("android.resource://");
        String string2 = stringBuilder.append(this.n.getPackageName()).append("/").append(n2).toString();
        Drawable drawable = this.b(string2);
        stringBuilder = drawable;
        if (drawable != null) return stringBuilder;
        try {
            stringBuilder = android.support.v4.content.a.a(this.n, n2);
            this.a(string2, (Drawable)stringBuilder);
            return stringBuilder;
        }
        catch (NumberFormatException numberFormatException) {
            drawable = this.b(string);
            stringBuilder = drawable;
            if (drawable != null) return stringBuilder;
            stringBuilder = this.a(Uri.parse((String)string));
            this.a(string, (Drawable)stringBuilder);
            return stringBuilder;
        }
        catch (Resources.NotFoundException notFoundException) {
            Log.w((String)"SuggestionsAdapter", (String)("Icon resource not found: " + string));
            return null;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String a(Cursor object, int n2) {
        void var0_2;
        void var1_6;
        Object var2_7 = null;
        if (var1_6 == -1) {
            Object var0_1 = var2_7;
            return var0_2;
        }
        try {
            String string = object.getString((int)var1_6);
            return var0_2;
        }
        catch (Exception exception) {
            Log.e((String)"SuggestionsAdapter", (String)"unexpected error retrieving valid column from cursor, did the remote process die?", (Throwable)exception);
            Object var0_5 = var2_7;
            return var0_2;
        }
    }

    private static String a(Cursor cursor, String string) {
        return android.support.v7.widget.c.a(cursor, cursor.getColumnIndex(string));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void a(ImageView imageView, Drawable drawable, int n2) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(n2);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty((CharSequence)charSequence)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
    }

    private void a(String string, Drawable drawable) {
        if (drawable != null) {
            this.o.put(string, drawable.getConstantState());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Drawable b(Uri uri) {
        Resources resources;
        String string = uri.getAuthority();
        if (TextUtils.isEmpty((CharSequence)string)) {
            throw new FileNotFoundException("No authority: " + (Object)uri);
        }
        try {
            resources = this.d.getPackageManager().getResourcesForApplication(string);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            throw new FileNotFoundException("No package found for authority: " + (Object)uri);
        }
        List list = uri.getPathSegments();
        if (list == null) {
            throw new FileNotFoundException("No path: " + (Object)uri);
        }
        int n2 = list.size();
        if (n2 == 1) {
            try {
                n2 = Integer.parseInt((String)list.get(0));
            }
            catch (NumberFormatException numberFormatException) {
                throw new FileNotFoundException("Single path segment is not a resource ID: " + (Object)uri);
            }
        } else {
            if (n2 != 2) {
                throw new FileNotFoundException("More than two path segments: " + (Object)uri);
            }
            n2 = resources.getIdentifier((String)list.get(1), (String)list.get(0), string);
        }
        if (n2 == 0) {
            throw new FileNotFoundException("No resource found for: " + (Object)uri);
        }
        return resources.getDrawable(n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Drawable b(String string) {
        if ((string = this.o.get(string)) != null) return string.newDrawable();
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void c(Cursor cursor) {
        if (cursor == null) return;
        cursor = cursor.getExtras();
        if (cursor == null) return;
        if (!cursor.getBoolean("in_progress")) return;
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Cursor a(CharSequence object) {
        object = object == null ? "" : object.toString();
        if (this.l.getVisibility() != 0) return null;
        if (this.l.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Uri uri = this.m;
            if (uri == null) {
                return null;
            }
            String string = uri.getSuggestAuthority();
            if (string == null) {
                return null;
            }
            Object object2 = new Uri.Builder();
            string = object2.scheme("content").authority(string).query("").fragment("");
            object2 = uri.getSuggestPath();
            if (object2 != null) {
                string.appendEncodedPath((String)object2);
            }
            string.appendPath("search_suggest_query");
            object2 = uri.getSuggestSelection();
            if (object2 != null) {
                uri = new Uri[]{object};
                object = uri;
            } else {
                string.appendPath((String)object);
                object = null;
            }
            string.appendQueryParameter("limit", "50");
            uri = string.build();
            object = this.d.getContentResolver().query(uri, null, (String)object2, (String[])object, null);
            if (object == null) return null;
            object.getCount();
            return object;
        }
        catch (RuntimeException runtimeException) {
            Log.w((String)"SuggestionsAdapter", (String)"Search suggestions query threw an exception.", (Throwable)runtimeException);
        }
        return null;
    }

    @Override
    public final View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        context = super.a(context, cursor, viewGroup);
        context.setTag((Object)new a((View)context));
        ((ImageView)context.findViewById(a.e.edit_query)).setImageResource(this.p);
        return context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(Cursor cursor) {
        if (this.q) {
            Log.w((String)"SuggestionsAdapter", (String)"Tried to change cursor after adapter was closed.");
            if (cursor == null) return;
            cursor.close();
            return;
        }
        try {
            super.a(cursor);
            if (cursor == null) return;
            this.s = cursor.getColumnIndex("suggest_text_1");
            this.t = cursor.getColumnIndex("suggest_text_2");
            this.u = cursor.getColumnIndex("suggest_text_2_url");
            this.v = cursor.getColumnIndex("suggest_icon_1");
            this.w = cursor.getColumnIndex("suggest_icon_2");
            this.x = cursor.getColumnIndex("suggest_flags");
            return;
        }
        catch (Exception exception) {
            Log.e((String)"SuggestionsAdapter", (String)"error changing cursor and caching columns", (Throwable)exception);
            return;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(View object, Cursor cursor) {
        String string;
        void var2_25;
        Object var3_26 = null;
        a a2 = (a)object.getTag();
        int n2 = this.x != -1 ? var2_25.getInt(this.x) : 0;
        if (a2.a != null) {
            String string2 = android.support.v7.widget.c.a((Cursor)var2_25, this.s);
            android.support.v7.widget.c.a(a2.a, (CharSequence)string2);
        }
        if (a2.b != null) {
            void var1_7;
            string = android.support.v7.widget.c.a((Cursor)var2_25, this.u);
            if (string != null) {
                if (this.r == null) {
                    TypedValue typedValue = new TypedValue();
                    this.d.getTheme().resolveAttribute(a.a.textColorSearchUrl, typedValue, true);
                    this.r = this.d.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString((CharSequence)string);
                spannableString.setSpan((Object)new TextAppearanceSpan(null, 0, 0, this.r, null), 0, string.length(), 33);
            } else {
                String string3 = android.support.v7.widget.c.a((Cursor)var2_25, this.t);
            }
            if (TextUtils.isEmpty((CharSequence)var1_7)) {
                if (a2.a != null) {
                    a2.a.setSingleLine(false);
                    a2.a.setMaxLines(2);
                }
            } else if (a2.a != null) {
                a2.a.setSingleLine(true);
                a2.a.setMaxLines(1);
            }
            android.support.v7.widget.c.a(a2.b, (CharSequence)var1_7);
        }
        if (a2.c != null) {
            void var1_10;
            ImageView imageView = a2.c;
            if (this.v == -1) {
                Object var1_9 = null;
            } else {
                String string4 = string = this.a(var2_25.getString(this.v));
                if (string == null) {
                    ComponentName componentName = this.m.getSearchActivity();
                    String string5 = componentName.flattenToShortString();
                    if (this.o.containsKey(string5)) {
                        Drawable.ConstantState constantState = this.o.get(string5);
                        string = constantState == null ? null : constantState.newDrawable(this.n.getResources());
                    } else {
                        void var1_22;
                        string = this.a(componentName);
                        if (string == null) {
                            Object var1_21 = null;
                        } else {
                            Drawable.ConstantState constantState = string.getConstantState();
                        }
                        this.o.put(string5, (Drawable.ConstantState)var1_22);
                    }
                    String string6 = string;
                    if (string == null) {
                        Drawable drawable = this.d.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            android.support.v7.widget.c.a(imageView, (Drawable)var1_10, 4);
        }
        if (a2.d != null) {
            void var1_13;
            string = a2.d;
            if (this.w == -1) {
                Object var1_12 = var3_26;
            } else {
                Drawable drawable = this.a(var2_25.getString(this.w));
            }
            android.support.v7.widget.c.a((ImageView)string, (Drawable)var1_13, 8);
        }
        if (this.j == 2 || this.j == 1 && (n2 & 1) != 0) {
            a2.e.setVisibility(0);
            a2.e.setTag((Object)a2.a.getText());
            a2.e.setOnClickListener((View.OnClickListener)this);
            return;
        }
        a2.e.setVisibility(8);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final CharSequence b(Cursor object) {
        String string = null;
        if (object == null) {
            return string;
        }
        String string2 = android.support.v7.widget.c.a(object, "suggest_intent_query");
        if (string2 != null) {
            return string2;
        }
        if (this.m.shouldRewriteQueryFromData() && (string2 = android.support.v7.widget.c.a(object, "suggest_intent_data")) != null) {
            return string2;
        }
        string2 = string;
        if (!this.m.shouldRewriteQueryFromText()) return string2;
        String string3 = android.support.v7.widget.c.a(object, "suggest_text_1");
        string2 = string;
        if (string3 == null) return string2;
        return string3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final View getView(int n2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(n2, view, viewGroup);
        }
        catch (RuntimeException runtimeException) {
            Log.w((String)"SuggestionsAdapter", (String)"Search suggestions cursor threw exception.", (Throwable)runtimeException);
            view = this.a(this.d, this.c, viewGroup);
            if (view == null) return view;
            ((a)view.getTag()).a.setText((CharSequence)runtimeException.toString());
            return view;
        }
    }

    @Override
    public final boolean hasStableIds() {
        return false;
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        android.support.v7.widget.c.c(this.a());
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        android.support.v7.widget.c.c(this.a());
    }

    public final void onClick(View object) {
        if ((object = object.getTag()) instanceof CharSequence) {
            this.l.setQuery((CharSequence)object);
        }
    }

    private static final class a {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            this.a = (TextView)view.findViewById(16908308);
            this.b = (TextView)view.findViewById(16908309);
            this.c = (ImageView)view.findViewById(16908295);
            this.d = (ImageView)view.findViewById(16908296);
            this.e = (ImageView)view.findViewById(a.e.edit_query);
        }
    }
}

