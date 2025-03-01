// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.widget;

import android.text.style.TextAppearanceSpan;
import android.text.SpannableString;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.net.Uri$Builder;
import android.os.Bundle;
import java.util.List;
import android.content.res.Resources;
import java.io.FileNotFoundException;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.ImageView;
import android.database.Cursor;
import android.content.res.Resources$NotFoundException;
import android.support.v4.content.a;
import android.net.Uri;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.graphics.drawable.Drawable;
import android.content.ComponentName;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable$ConstantState;
import java.util.WeakHashMap;
import android.content.Context;
import android.app.SearchableInfo;
import android.app.SearchManager;
import android.view.View$OnClickListener;
import android.support.v4.f.i;

final class c extends i implements View$OnClickListener
{
    int j;
    private final SearchManager k;
    private final SearchView l;
    private final SearchableInfo m;
    private final Context n;
    private final WeakHashMap<String, Drawable$ConstantState> o;
    private final int p;
    private boolean q;
    private ColorStateList r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    
    public c(final Context n, final SearchView l, final SearchableInfo m, final WeakHashMap<String, Drawable$ConstantState> o) {
        super(n, l.getSuggestionRowLayout());
        this.q = false;
        this.j = 1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.k = (SearchManager)this.d.getSystemService("search");
        this.l = l;
        this.m = m;
        this.p = l.getSuggestionCommitIconResId();
        this.n = n;
        this.o = o;
    }
    
    private Drawable a(final ComponentName componentName) {
        while (true) {
            final Drawable drawable = null;
            final PackageManager packageManager = this.d.getPackageManager();
            ActivityInfo activityInfo;
            int iconResource;
            try {
                activityInfo = packageManager.getActivityInfo(componentName, 128);
                iconResource = activityInfo.getIconResource();
                if (iconResource == 0) {
                    return drawable;
                }
            }
            catch (PackageManager$NameNotFoundException ex) {
                Log.w("SuggestionsAdapter", ex.toString());
                return drawable;
            }
            final Drawable drawable3 = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable3 == null) {
                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
                return drawable;
            }
            return drawable3;
        }
    }
    
    private Drawable a(final Uri p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: aload_1        
        //     3: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //     6: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //     9: istore_2       
        //    10: iload_2        
        //    11: ifeq            96
        //    14: aload_0        
        //    15: aload_1        
        //    16: invokespecial   android/support/v7/widget/c.b:(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
        //    19: astore_3       
        //    20: aload_3        
        //    21: astore_1       
        //    22: aload_1        
        //    23: areturn        
        //    24: astore_3       
        //    25: new             Ljava/io/FileNotFoundException;
        //    28: astore          4
        //    30: new             Ljava/lang/StringBuilder;
        //    33: astore_3       
        //    34: aload_3        
        //    35: ldc             "Resource does not exist: "
        //    37: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    40: aload           4
        //    42: aload_3        
        //    43: aload_1        
        //    44: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    47: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    50: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //    53: aload           4
        //    55: athrow         
        //    56: astore_3       
        //    57: ldc             "SuggestionsAdapter"
        //    59: new             Ljava/lang/StringBuilder;
        //    62: dup            
        //    63: ldc             "Icon not found: "
        //    65: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    68: aload_1        
        //    69: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    72: ldc             ", "
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    77: aload_3        
        //    78: invokevirtual   java/io/FileNotFoundException.getMessage:()Ljava/lang/String;
        //    81: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    84: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    87: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //    90: pop            
        //    91: aconst_null    
        //    92: astore_1       
        //    93: goto            22
        //    96: aload_0        
        //    97: getfield        android/support/v7/widget/c.n:Landroid/content/Context;
        //   100: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   103: aload_1        
        //   104: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   107: astore          4
        //   109: aload           4
        //   111: ifnonnull       145
        //   114: new             Ljava/io/FileNotFoundException;
        //   117: astore_3       
        //   118: new             Ljava/lang/StringBuilder;
        //   121: astore          4
        //   123: aload           4
        //   125: ldc             "Failed to open "
        //   127: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   130: aload_3        
        //   131: aload           4
        //   133: aload_1        
        //   134: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   137: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   140: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   143: aload_3        
        //   144: athrow         
        //   145: aload           4
        //   147: aconst_null    
        //   148: invokestatic    android/graphics/drawable/Drawable.createFromStream:(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
        //   151: astore_3       
        //   152: aload           4
        //   154: invokevirtual   java/io/InputStream.close:()V
        //   157: aload_3        
        //   158: astore_1       
        //   159: goto            22
        //   162: astore          5
        //   164: new             Ljava/lang/StringBuilder;
        //   167: astore          4
        //   169: aload           4
        //   171: ldc             "Error closing icon stream for "
        //   173: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   176: ldc             "SuggestionsAdapter"
        //   178: aload           4
        //   180: aload_1        
        //   181: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   184: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   187: aload           5
        //   189: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   192: pop            
        //   193: aload_3        
        //   194: astore_1       
        //   195: goto            22
        //   198: astore_3       
        //   199: aload           4
        //   201: invokevirtual   java/io/InputStream.close:()V
        //   204: aload_3        
        //   205: athrow         
        //   206: astore          5
        //   208: new             Ljava/lang/StringBuilder;
        //   211: astore          4
        //   213: aload           4
        //   215: ldc             "Error closing icon stream for "
        //   217: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   220: ldc             "SuggestionsAdapter"
        //   222: aload           4
        //   224: aload_1        
        //   225: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   228: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   231: aload           5
        //   233: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   236: pop            
        //   237: goto            204
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  0      10     56     96     Ljava/io/FileNotFoundException;
        //  14     20     24     56     Landroid/content/res/Resources$NotFoundException;
        //  14     20     56     96     Ljava/io/FileNotFoundException;
        //  25     56     56     96     Ljava/io/FileNotFoundException;
        //  96     109    56     96     Ljava/io/FileNotFoundException;
        //  114    145    56     96     Ljava/io/FileNotFoundException;
        //  145    152    198    240    Any
        //  152    157    162    198    Ljava/io/IOException;
        //  152    157    56     96     Ljava/io/FileNotFoundException;
        //  164    193    56     96     Ljava/io/FileNotFoundException;
        //  199    204    206    240    Ljava/io/IOException;
        //  199    204    56     96     Ljava/io/FileNotFoundException;
        //  204    206    56     96     Ljava/io/FileNotFoundException;
        //  208    237    56     96     Ljava/io/FileNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 119 out of bounds for length 119
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3569)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private Drawable a(final String str) {
        Drawable drawable;
        if (str == null || str.length() == 0 || "0".equals(str)) {
            drawable = null;
        }
        else {
            try {
                final int int1 = Integer.parseInt(str);
                final String string = "android.resource://" + this.n.getPackageName() + "/" + int1;
                if ((drawable = this.b(string)) == null) {
                    drawable = android.support.v4.content.a.a(this.n, int1);
                    this.a(string, drawable);
                }
            }
            catch (NumberFormatException ex) {
                if ((drawable = this.b(str)) == null) {
                    drawable = this.a(Uri.parse(str));
                    this.a(str, drawable);
                }
            }
            catch (Resources$NotFoundException ex2) {
                Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
                drawable = null;
            }
        }
        return drawable;
    }
    
    private static String a(final Cursor cursor, final int n) {
        final String s = null;
        String string;
        if (n == -1) {
            string = s;
        }
        else {
            try {
                string = cursor.getString(n);
            }
            catch (Exception ex) {
                Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", (Throwable)ex);
                string = s;
            }
        }
        return string;
    }
    
    private static String a(final Cursor cursor, final String s) {
        return a(cursor, cursor.getColumnIndex(s));
    }
    
    private static void a(final ImageView imageView, final Drawable imageDrawable, final int visibility) {
        imageView.setImageDrawable(imageDrawable);
        if (imageDrawable == null) {
            imageView.setVisibility(visibility);
        }
        else {
            imageView.setVisibility(0);
            imageDrawable.setVisible(false, false);
            imageDrawable.setVisible(true, false);
        }
    }
    
    private static void a(final TextView textView, final CharSequence text) {
        textView.setText(text);
        if (TextUtils.isEmpty(text)) {
            textView.setVisibility(8);
        }
        else {
            textView.setVisibility(0);
        }
    }
    
    private void a(final String key, final Drawable drawable) {
        if (drawable != null) {
            this.o.put(key, drawable.getConstantState());
        }
    }
    
    private Drawable b(final Uri uri) {
        final String authority = uri.getAuthority();
        if (TextUtils.isEmpty((CharSequence)authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        Resources resourcesForApplication;
        List pathSegments;
        try {
            resourcesForApplication = this.d.getPackageManager().getResourcesForApplication(authority);
            pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
        }
        catch (PackageManager$NameNotFoundException ex) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
        final int size = pathSegments.size();
        while (true) {
            Label_0200: {
                if (size != 1) {
                    break Label_0200;
                }
                try {
                    final int n = Integer.parseInt(pathSegments.get(0));
                    if (n == 0) {
                        throw new FileNotFoundException("No resource found for: " + uri);
                    }
                    return resourcesForApplication.getDrawable(n);
                }
                catch (NumberFormatException ex2) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            }
            if (size == 2) {
                final int n = resourcesForApplication.getIdentifier((String)pathSegments.get(1), (String)pathSegments.get(0), authority);
                continue;
            }
            break;
        }
        throw new FileNotFoundException("More than two path segments: " + uri);
    }
    
    private Drawable b(final String key) {
        final Drawable$ConstantState drawable$ConstantState = this.o.get(key);
        Drawable drawable;
        if (drawable$ConstantState == null) {
            drawable = null;
        }
        else {
            drawable = drawable$ConstantState.newDrawable();
        }
        return drawable;
    }
    
    private static void c(final Cursor cursor) {
        Bundle extras;
        if (cursor != null) {
            extras = cursor.getExtras();
        }
        else {
            extras = null;
        }
        if (extras == null || extras.getBoolean("in_progress")) {}
    }
    
    public final Cursor a(final CharSequence charSequence) {
        String string;
        if (charSequence == null) {
            string = "";
        }
        else {
            string = charSequence.toString();
        }
        Cursor query;
        if (this.l.getVisibility() != 0 || this.l.getWindowVisibility() != 0) {
            query = null;
        }
        else {
            while (true) {
                while (true) {
                    SearchableInfo m = null;
                    Label_0083: {
                        try {
                            m = this.m;
                            if (m != null) {
                                break Label_0083;
                            }
                            query = null;
                            if (query != null) {
                                query.getCount();
                                return query;
                            }
                        }
                        catch (RuntimeException ex) {
                            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", (Throwable)ex);
                        }
                        break;
                    }
                    final String suggestAuthority = m.getSuggestAuthority();
                    if (suggestAuthority == null) {
                        query = null;
                        continue;
                    }
                    final Uri$Builder fragment = new Uri$Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
                    final String suggestPath = m.getSuggestPath();
                    if (suggestPath != null) {
                        fragment.appendEncodedPath(suggestPath);
                    }
                    fragment.appendPath("search_suggest_query");
                    final String suggestSelection = m.getSuggestSelection();
                    String[] array;
                    if (suggestSelection != null) {
                        array = new String[] { string };
                    }
                    else {
                        fragment.appendPath(string);
                        array = null;
                    }
                    fragment.appendQueryParameter("limit", "50");
                    query = this.d.getContentResolver().query(fragment.build(), (String[])null, suggestSelection, array, (String)null);
                    continue;
                }
            }
            query = null;
        }
        return query;
    }
    
    @Override
    public final View a(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final View a = super.a(context, cursor, viewGroup);
        a.setTag((Object)new a(a));
        ((ImageView)a.findViewById(android.support.v7.b.a.e.edit_query)).setImageResource(this.p);
        return a;
    }
    
    public final void a(final Cursor cursor) {
        if (this.q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
            }
        }
        else {
            try {
                super.a(cursor);
                if (cursor != null) {
                    this.s = cursor.getColumnIndex("suggest_text_1");
                    this.t = cursor.getColumnIndex("suggest_text_2");
                    this.u = cursor.getColumnIndex("suggest_text_2_url");
                    this.v = cursor.getColumnIndex("suggest_icon_1");
                    this.w = cursor.getColumnIndex("suggest_icon_2");
                    this.x = cursor.getColumnIndex("suggest_flags");
                }
            }
            catch (Exception ex) {
                Log.e("SuggestionsAdapter", "error changing cursor and caching columns", (Throwable)ex);
            }
        }
    }
    
    public final void a(final View view, final Cursor cursor) {
        final Drawable drawable = null;
        final a a = (a)view.getTag();
        int int1;
        if (this.x != -1) {
            int1 = cursor.getInt(this.x);
        }
        else {
            int1 = 0;
        }
        if (a.a != null) {
            a(a.a, a(cursor, this.s));
        }
        if (a.b != null) {
            final String a2 = a(cursor, this.u);
            Object a3;
            if (a2 != null) {
                if (this.r == null) {
                    final TypedValue typedValue = new TypedValue();
                    this.d.getTheme().resolveAttribute(android.support.v7.b.a.a.textColorSearchUrl, typedValue, true);
                    this.r = this.d.getResources().getColorStateList(typedValue.resourceId);
                }
                a3 = new SpannableString((CharSequence)a2);
                ((SpannableString)a3).setSpan((Object)new TextAppearanceSpan((String)null, 0, 0, this.r, (ColorStateList)null), 0, a2.length(), 33);
            }
            else {
                a3 = a(cursor, this.t);
            }
            if (TextUtils.isEmpty((CharSequence)a3)) {
                if (a.a != null) {
                    a.a.setSingleLine(false);
                    a.a.setMaxLines(2);
                }
            }
            else if (a.a != null) {
                a.a.setSingleLine(true);
                a.a.setMaxLines(1);
            }
            a(a.b, (CharSequence)a3);
        }
        if (a.c != null) {
            final ImageView c = a.c;
            Drawable drawable2;
            if (this.v == -1) {
                drawable2 = null;
            }
            else if ((drawable2 = this.a(cursor.getString(this.v))) == null) {
                final ComponentName searchActivity = this.m.getSearchActivity();
                final String flattenToShortString = searchActivity.flattenToShortString();
                Drawable drawable3;
                if (this.o.containsKey(flattenToShortString)) {
                    final Drawable$ConstantState drawable$ConstantState = this.o.get(flattenToShortString);
                    if (drawable$ConstantState == null) {
                        drawable3 = null;
                    }
                    else {
                        drawable3 = drawable$ConstantState.newDrawable(this.n.getResources());
                    }
                }
                else {
                    drawable3 = this.a(searchActivity);
                    Drawable$ConstantState constantState;
                    if (drawable3 == null) {
                        constantState = null;
                    }
                    else {
                        constantState = drawable3.getConstantState();
                    }
                    this.o.put(flattenToShortString, constantState);
                }
                drawable2 = drawable3;
                if (drawable3 == null) {
                    drawable2 = this.d.getPackageManager().getDefaultActivityIcon();
                }
            }
            a(c, drawable2, 4);
        }
        if (a.d != null) {
            final ImageView d = a.d;
            Drawable a4;
            if (this.w == -1) {
                a4 = drawable;
            }
            else {
                a4 = this.a(cursor.getString(this.w));
            }
            a(d, a4, 8);
        }
        if (this.j == 2 || (this.j == 1 && (int1 & 0x1) != 0x0)) {
            a.e.setVisibility(0);
            a.e.setTag((Object)a.a.getText());
            a.e.setOnClickListener((View$OnClickListener)this);
        }
        else {
            a.e.setVisibility(8);
        }
    }
    
    public final CharSequence b(final Cursor cursor) {
        final CharSequence charSequence = null;
        CharSequence charSequence2;
        if (cursor == null) {
            charSequence2 = charSequence;
        }
        else {
            charSequence2 = a(cursor, "suggest_intent_query");
            if (charSequence2 == null) {
                if (this.m.shouldRewriteQueryFromData()) {
                    charSequence2 = a(cursor, "suggest_intent_data");
                    if (charSequence2 != null) {
                        return charSequence2;
                    }
                }
                charSequence2 = charSequence;
                if (this.m.shouldRewriteQueryFromText()) {
                    final String a = a(cursor, "suggest_text_1");
                    charSequence2 = charSequence;
                    if (a != null) {
                        charSequence2 = a;
                    }
                }
            }
        }
        return charSequence2;
    }
    
    public final View getView(final int n, View view, final ViewGroup viewGroup) {
        try {
            view = super.getView(n, view, viewGroup);
            return view;
        }
        catch (RuntimeException ex) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", (Throwable)ex);
            view = this.a(this.d, this.c, viewGroup);
            if (view != null) {
                ((a)view.getTag()).a.setText((CharSequence)ex.toString());
            }
            return view;
        }
    }
    
    public final boolean hasStableIds() {
        return false;
    }
    
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        c(this.a());
    }
    
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        c(this.a());
    }
    
    public final void onClick(final View view) {
        final Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.l.setQuery((CharSequence)tag);
        }
    }
    
    private static final class a
    {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;
        
        public a(final View view) {
            this.a = (TextView)view.findViewById(16908308);
            this.b = (TextView)view.findViewById(16908309);
            this.c = (ImageView)view.findViewById(16908295);
            this.d = (ImageView)view.findViewById(16908296);
            this.e = (ImageView)view.findViewById(android.support.v7.b.a.e.edit_query);
        }
    }
}
