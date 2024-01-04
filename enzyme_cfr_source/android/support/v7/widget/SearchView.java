/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.SearchableInfo
 *  android.content.Context
 *  android.content.Intent
 *  android.database.Cursor
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.ResultReceiver
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 *  android.text.style.ImageSpan
 *  android.util.AttributeSet
 *  android.view.KeyEvent
 *  android.view.KeyEvent$DispatcherState
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.AutoCompleteTextView
 *  android.widget.ImageView
 *  android.widget.ListAdapter
 */
package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v7.b.a;
import android.support.v7.internal.widget.o;
import android.support.v7.internal.widget.q;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class SearchView
extends LinearLayoutCompat
implements android.support.v7.c.a {
    static final a a;
    private static final boolean b;
    private boolean A;
    private int B;
    private boolean C;
    private CharSequence D;
    private boolean E;
    private int F;
    private SearchableInfo G;
    private Bundle H;
    private final o I;
    private Runnable J;
    private final Runnable K;
    private Runnable L;
    private final WeakHashMap<String, Drawable.ConstantState> M;
    private final SearchAutoComplete c;
    private final View d;
    private final View e;
    private final ImageView f;
    private final ImageView g;
    private final ImageView h;
    private final ImageView i;
    private final ImageView j;
    private final int k;
    private final int l;
    private final int m;
    private final Intent n;
    private final Intent o;
    private c p;
    private b q;
    private View.OnFocusChangeListener r;
    private d s;
    private View.OnClickListener t;
    private boolean u;
    private boolean v;
    private android.support.v4.f.b w;
    private boolean x;
    private CharSequence y;
    private boolean z;

    /*
     * Enabled aggressive block sorting
     */
    static {
        boolean bl = Build.VERSION.SDK_INT >= 8;
        b = bl;
        a = new a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private CharSequence a(CharSequence charSequence) {
        if (!this.u) {
            return charSequence;
        }
        Drawable drawable = this.I.a(this.k);
        int n2 = (int)((double)this.c.getTextSize() * 1.25);
        drawable.setBounds(0, 0, n2, n2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)"   ");
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.setSpan((Object)new ImageSpan(drawable), 1, 2, 33);
        return spannableStringBuilder;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void a(boolean bl) {
        int n2;
        block7: {
            block8: {
                void var6_10;
                int n3 = 1;
                int n4 = 8;
                this.v = bl;
                int n5 = bl ? 0 : 8;
                n2 = !TextUtils.isEmpty((CharSequence)this.c.getText()) ? 1 : 0;
                this.f.setVisibility(n5);
                n5 = this.x && this.d() && this.hasFocus() && (n2 != 0 || !this.C) ? 0 : 8;
                this.g.setVisibility(n5);
                View view = this.d;
                n5 = bl ? 8 : 0;
                view.setVisibility(n5);
                ImageView imageView = this.j;
                n5 = this.u ? 8 : 0;
                imageView.setVisibility(n5);
                n5 = !TextUtils.isEmpty((CharSequence)this.c.getText()) ? 1 : 0;
                int n6 = n5 != 0 || this.u && !this.E ? 1 : 0;
                ImageView imageView2 = this.h;
                n6 = n6 != 0 ? 0 : 8;
                imageView2.setVisibility(n6);
                Drawable drawable = this.h.getDrawable();
                if (n5 != 0) {
                    int[] arrn = ENABLED_STATE_SET;
                } else {
                    int[] arrn = EMPTY_STATE_SET;
                }
                drawable.setState((int[])var6_10);
                n2 = n2 == 0 ? n3 : 0;
                if (this.C && !this.v && n2 != 0) {
                    this.g.setVisibility(8);
                    n2 = 0;
                } else {
                    n2 = 8;
                }
                this.i.setVisibility(n2);
                n2 = n4;
                if (!this.d()) break block7;
                if (this.g.getVisibility() == 0) break block8;
                n2 = n4;
                if (this.i.getVisibility() != 0) break block7;
            }
            n2 = 0;
        }
        this.e.setVisibility(n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean a(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean d() {
        if (!this.x) {
            if (!this.C) return false;
        }
        if (this.v) return false;
        return true;
    }

    private void e() {
        this.post(this.K);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void f() {
        if (this.y != null) {
            this.c.setHint(this.a(this.y));
            return;
        }
        if (b && this.G != null) {
            String string = null;
            int n2 = this.G.getHintId();
            if (n2 != 0) {
                string = this.getContext().getString(n2);
            }
            if (string == null) return;
            this.c.setHint(this.a(string));
            return;
        }
        this.c.setHint(this.a(""));
    }

    private int getPreferredWidth() {
        return this.getContext().getResources().getDimensionPixelSize(a.c.abc_search_view_preferred_width);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void setImeVisibility(boolean bl) {
        if (bl) {
            this.post(this.J);
            return;
        }
        this.removeCallbacks(this.J);
        InputMethodManager inputMethodManager = (InputMethodManager)this.getContext().getSystemService("input_method");
        if (inputMethodManager == null) return;
        inputMethodManager.hideSoftInputFromWindow(this.getWindowToken(), 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void a() {
        if (this.E) {
            return;
        }
        this.E = true;
        this.F = this.c.getImeOptions();
        this.c.setImeOptions(this.F | 0x2000000);
        this.c.setText("");
        this.setIconified(false);
    }

    @Override
    public final void a_() {
        this.c.setText("");
        this.c.setSelection(this.c.length());
        this.D = "";
        this.clearFocus();
        this.a(true);
        this.c.setImeOptions(this.F);
        this.E = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void c() {
        this.a(this.v);
        this.e();
        if (!this.c.hasFocus()) return;
        a a2 = a;
        SearchAutoComplete searchAutoComplete = this.c;
        if (a2.a != null) {
            try {
                a2.a.invoke((Object)searchAutoComplete, new Object[0]);
            }
            catch (Exception exception) {}
        }
        a2 = a;
        searchAutoComplete = this.c;
        if (a2.b == null) return;
        try {
            a2.b.invoke((Object)searchAutoComplete, new Object[0]);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void clearFocus() {
        this.A = true;
        this.setImeVisibility(false);
        super.clearFocus();
        this.c.clearFocus();
        this.A = false;
    }

    public final int getImeOptions() {
        return this.c.getImeOptions();
    }

    public final int getInputType() {
        return this.c.getInputType();
    }

    public final int getMaxWidth() {
        return this.B;
    }

    public final CharSequence getQuery() {
        return this.c.getText();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final CharSequence getQueryHint() {
        CharSequence charSequence = null;
        if (this.y != null) {
            return this.y;
        }
        CharSequence charSequence2 = charSequence;
        if (!b) return charSequence2;
        charSequence2 = charSequence;
        if (this.G == null) return charSequence2;
        int n2 = this.G.getHintId();
        charSequence2 = charSequence;
        if (n2 == 0) return charSequence2;
        return this.getContext().getString(n2);
    }

    final int getSuggestionCommitIconResId() {
        return this.m;
    }

    final int getSuggestionRowLayout() {
        return this.l;
    }

    public final android.support.v4.f.b getSuggestionsAdapter() {
        return this.w;
    }

    protected final void onDetachedFromWindow() {
        this.removeCallbacks(this.K);
        this.post(this.L);
        super.onDetachedFromWindow();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected final void onMeasure(int n2, int n3) {
        if (this.v) {
            super.onMeasure(n2, n3);
            return;
        }
        int n4 = View.MeasureSpec.getMode((int)n2);
        int n5 = View.MeasureSpec.getSize((int)n2);
        switch (n4) {
            default: {
                n2 = n5;
                break;
            }
            case -2147483648: {
                if (this.B > 0) {
                    n2 = Math.min(this.B, n5);
                    break;
                }
                n2 = Math.min(this.getPreferredWidth(), n5);
                break;
            }
            case 0x40000000: {
                n2 = n5;
                if (this.B <= 0) break;
                n2 = Math.min(this.B, n5);
                break;
            }
            case 0: {
                n2 = this.B > 0 ? this.B : this.getPreferredWidth();
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)n2, (int)0x40000000), n3);
    }

    public final void onWindowFocusChanged(boolean bl) {
        super.onWindowFocusChanged(bl);
        this.e();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean requestFocus(int n2, Rect rect) {
        boolean bl = false;
        if (this.A) {
            return bl;
        }
        if (!this.isFocusable()) return bl;
        if (this.v) return super.requestFocus(n2, rect);
        bl = this.c.requestFocus(n2, rect);
        if (!bl) return bl;
        this.a(false);
        return bl;
    }

    public final void setAppSearchData(Bundle bundle) {
        this.H = bundle;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setIconified(boolean bl) {
        if (!bl) {
            this.a(false);
            this.c.requestFocus();
            this.setImeVisibility(true);
            if (this.t == null) return;
            this.t.onClick((View)this);
            return;
        }
        if (!TextUtils.isEmpty((CharSequence)this.c.getText())) {
            this.c.setText("");
            this.c.requestFocus();
            this.setImeVisibility(true);
            return;
        }
        if (!this.u) return;
        if (this.q != null) {
            if (this.q.a()) return;
        }
        this.clearFocus();
        this.a(true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void setIconifiedByDefault(boolean bl) {
        if (this.u == bl) {
            return;
        }
        this.u = bl;
        this.a(bl);
        this.f();
    }

    public final void setImeOptions(int n2) {
        this.c.setImeOptions(n2);
    }

    public final void setInputType(int n2) {
        this.c.setInputType(n2);
    }

    public final void setMaxWidth(int n2) {
        this.B = n2;
        this.requestLayout();
    }

    public final void setOnCloseListener(b b2) {
        this.q = b2;
    }

    public final void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.r = onFocusChangeListener;
    }

    public final void setOnQueryTextListener(c c2) {
        this.p = c2;
    }

    public final void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.t = onClickListener;
    }

    public final void setOnSuggestionListener(d d2) {
        this.s = d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void setQuery(CharSequence charSequence) {
        this.c.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.c;
        int n2 = TextUtils.isEmpty((CharSequence)charSequence) ? 0 : charSequence.length();
        searchAutoComplete.setSelection(n2);
    }

    public final void setQueryHint(CharSequence charSequence) {
        this.y = charSequence;
        this.f();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setQueryRefinementEnabled(boolean bl) {
        this.z = bl;
        if (this.w instanceof android.support.v7.widget.c) {
            android.support.v7.widget.c c2 = (android.support.v7.widget.c)this.w;
            int n2 = bl ? 2 : 1;
            c2.j = n2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void setSearchableInfo(SearchableInfo var1_1) {
        block17: {
            block16: {
                var2_8 = true;
                this.G = var1_1 /* !! */ ;
                if (this.G != null) {
                    if (SearchView.b) {
                        this.c.setThreshold(this.G.getSuggestThreshold());
                        this.c.setImeOptions(this.G.getImeOptions());
                        var4_10 = var3_9 = this.G.getInputType();
                        if ((var3_9 & 15) == 1) {
                            var4_10 = var3_9 &= -65537;
                            if (this.G.getSuggestAuthority() != null) {
                                var4_10 = var3_9 | 65536 | 524288;
                            }
                        }
                        this.c.setInputType(var4_10);
                        if (this.w != null) {
                            this.w.a((Cursor)null);
                        }
                        if (this.G.getSuggestAuthority() != null) {
                            this.w = new android.support.v7.widget.c(this.getContext(), this, this.G, this.M);
                            this.c.setAdapter((ListAdapter)this.w);
                            var1_2 = (android.support.v7.widget.c)this.w;
                            var4_10 = this.z != false ? 2 : 1;
                            var1_2.j = var4_10;
                        }
                    }
                    this.f();
                }
                if (!SearchView.b) break block16;
                if (this.G == null || !this.G.getVoiceSearchEnabled()) ** GOTO lbl-1000
                if (this.G.getVoiceSearchLaunchWebSearch()) {
                    var1_4 = this.n;
                } else if (this.G.getVoiceSearchLaunchRecognizer()) {
                    var1_6 = this.o;
                } else {
                    var1_7 = null;
                }
                if (var1_5 != null) {
                    var4_10 = this.getContext().getPackageManager().resolveActivity((Intent)var1_5, 65536) != null ? 1 : 0;
                } else lbl-1000:
                // 2 sources

                {
                    var4_10 = 0;
                }
                if (var4_10 != 0) break block17;
            }
            var2_8 = false;
        }
        this.C = var2_8;
        if (this.C) {
            this.c.setPrivateImeOptions("nm");
        }
        this.a(this.v);
    }

    public final void setSubmitButtonEnabled(boolean bl) {
        this.x = bl;
        this.a(this.v);
    }

    public final void setSuggestionsAdapter(android.support.v4.f.b b2) {
        this.w = b2;
        this.c.setAdapter((ListAdapter)this.w);
    }

    public static class SearchAutoComplete
    extends AutoCompleteTextView {
        private final int[] a = new int[]{16843126};
        private int b = this.getThreshold();
        private SearchView c;
        private final o d;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 16842859);
        }

        public SearchAutoComplete(Context object, AttributeSet attributeSet, int n2) {
            super((Context)object, attributeSet, n2);
            object = android.support.v7.internal.widget.q.a((Context)object, attributeSet, this.a, n2);
            if (((q)object).c(0)) {
                this.setDropDownBackgroundDrawable(((q)object).a(0));
            }
            ((q)object).a.recycle();
            this.d = ((q)object).a();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public boolean enoughToFilter() {
            if (this.b <= 0) return true;
            if (!super.enoughToFilter()) return false;
            return true;
        }

        protected void onFocusChanged(boolean bl, int n2, Rect rect) {
            super.onFocusChanged(bl, n2, rect);
            this.c.c();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public boolean onKeyPreIme(int n2, KeyEvent keyEvent) {
            boolean bl = true;
            if (n2 != 4) return super.onKeyPreIme(n2, keyEvent);
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState dispatcherState = this.getKeyDispatcherState();
                boolean bl2 = bl;
                if (dispatcherState == null) return bl2;
                dispatcherState.startTracking(keyEvent, (Object)this);
                return bl;
            }
            if (keyEvent.getAction() != 1) return super.onKeyPreIme(n2, keyEvent);
            KeyEvent.DispatcherState dispatcherState = this.getKeyDispatcherState();
            if (dispatcherState != null) {
                dispatcherState.handleUpEvent(keyEvent);
            }
            if (!keyEvent.isTracking()) return super.onKeyPreIme(n2, keyEvent);
            if (keyEvent.isCanceled()) return super.onKeyPreIme(n2, keyEvent);
            this.c.clearFocus();
            this.c.setImeVisibility(false);
            return bl;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onWindowFocusChanged(boolean bl) {
            super.onWindowFocusChanged(bl);
            if (!bl) return;
            if (!this.c.hasFocus()) return;
            if (this.getVisibility() != 0) return;
            ((InputMethodManager)this.getContext().getSystemService("input_method")).showSoftInput((View)this, 0);
            if (!SearchView.a(this.getContext())) return;
            a a2 = a;
            if (a2.c == null) return;
            try {
                a2.c.invoke((Object)this, true);
                return;
            }
            catch (Exception exception) {
                return;
            }
        }

        public void performCompletion() {
        }

        protected void replaceText(CharSequence charSequence) {
        }

        public void setDropDownBackgroundResource(int n2) {
            this.setDropDownBackgroundDrawable(this.d.a(n2));
        }

        void setSearchView(SearchView searchView) {
            this.c = searchView;
        }

        public void setThreshold(int n2) {
            super.setThreshold(n2);
            this.b = n2;
        }
    }

    private static final class a {
        Method a;
        Method b;
        Method c;
        private Method d;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        a() {
            try {
                this.a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a.setAccessible(true);
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            try {
                this.b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b.setAccessible(true);
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            try {
                this.c = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.c.setAccessible(true);
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            try {
                this.d = InputMethodManager.class.getMethod("showSoftInputUnchecked", Integer.TYPE, ResultReceiver.class);
                this.d.setAccessible(true);
                return;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                return;
            }
        }
    }

    public static interface b {
        public boolean a();
    }

    public static interface c {
    }

    public static interface d {
    }
}

