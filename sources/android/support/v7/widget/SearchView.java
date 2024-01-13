package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v7.b.a;
import android.support.v7.internal.widget.o;
import android.support.v7.internal.widget.q;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class SearchView extends LinearLayoutCompat implements android.support.v7.c.a {
    static final a a = new a();
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

    public interface b {
        boolean a();
    }

    public interface c {
    }

    public interface d {
    }

    static {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        b = z2;
    }

    /* access modifiers changed from: package-private */
    public final int getSuggestionRowLayout() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public final int getSuggestionCommitIconResId() {
        return this.m;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a4, code lost:
        if (r0 == false) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setSearchableInfo(android.app.SearchableInfo r9) {
        /*
            r8 = this;
            r4 = 0
            r7 = 65536(0x10000, float:9.18355E-41)
            r3 = 0
            r2 = 1
            r8.G = r9
            android.app.SearchableInfo r0 = r8.G
            if (r0 == 0) goto L_0x0079
            boolean r0 = b
            if (r0 == 0) goto L_0x0076
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r8.c
            android.app.SearchableInfo r1 = r8.G
            int r1 = r1.getSuggestThreshold()
            r0.setThreshold(r1)
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r8.c
            android.app.SearchableInfo r1 = r8.G
            int r1 = r1.getImeOptions()
            r0.setImeOptions(r1)
            android.app.SearchableInfo r0 = r8.G
            int r0 = r0.getInputType()
            r1 = r0 & 15
            if (r1 != r2) goto L_0x003f
            r1 = -65537(0xfffffffffffeffff, float:NaN)
            r0 = r0 & r1
            android.app.SearchableInfo r1 = r8.G
            java.lang.String r1 = r1.getSuggestAuthority()
            if (r1 == 0) goto L_0x003f
            r0 = r0 | r7
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 | r1
        L_0x003f:
            android.support.v7.widget.SearchView$SearchAutoComplete r1 = r8.c
            r1.setInputType(r0)
            android.support.v4.f.b r0 = r8.w
            if (r0 == 0) goto L_0x004d
            android.support.v4.f.b r0 = r8.w
            r0.a((android.database.Cursor) r4)
        L_0x004d:
            android.app.SearchableInfo r0 = r8.G
            java.lang.String r0 = r0.getSuggestAuthority()
            if (r0 == 0) goto L_0x0076
            android.support.v7.widget.c r0 = new android.support.v7.widget.c
            android.content.Context r1 = r8.getContext()
            android.app.SearchableInfo r5 = r8.G
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r6 = r8.M
            r0.<init>(r1, r8, r5, r6)
            r8.w = r0
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r8.c
            android.support.v4.f.b r1 = r8.w
            r0.setAdapter(r1)
            android.support.v4.f.b r0 = r8.w
            android.support.v7.widget.c r0 = (android.support.v7.widget.c) r0
            boolean r1 = r8.z
            if (r1 == 0) goto L_0x00b9
            r1 = 2
        L_0x0074:
            r0.j = r1
        L_0x0076:
            r8.f()
        L_0x0079:
            boolean r0 = b
            if (r0 == 0) goto L_0x00ca
            android.app.SearchableInfo r0 = r8.G
            if (r0 == 0) goto L_0x00c8
            android.app.SearchableInfo r0 = r8.G
            boolean r0 = r0.getVoiceSearchEnabled()
            if (r0 == 0) goto L_0x00c8
            android.app.SearchableInfo r0 = r8.G
            boolean r0 = r0.getVoiceSearchLaunchWebSearch()
            if (r0 == 0) goto L_0x00bb
            android.content.Intent r0 = r8.n
        L_0x0093:
            if (r0 == 0) goto L_0x00c8
            android.content.Context r1 = r8.getContext()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r0, r7)
            if (r0 == 0) goto L_0x00c6
            r0 = r2
        L_0x00a4:
            if (r0 == 0) goto L_0x00ca
        L_0x00a6:
            r8.C = r2
            boolean r0 = r8.C
            if (r0 == 0) goto L_0x00b3
            android.support.v7.widget.SearchView$SearchAutoComplete r0 = r8.c
            java.lang.String r1 = "nm"
            r0.setPrivateImeOptions(r1)
        L_0x00b3:
            boolean r0 = r8.v
            r8.a((boolean) r0)
            return
        L_0x00b9:
            r1 = r2
            goto L_0x0074
        L_0x00bb:
            android.app.SearchableInfo r0 = r8.G
            boolean r0 = r0.getVoiceSearchLaunchRecognizer()
            if (r0 == 0) goto L_0x00cc
            android.content.Intent r0 = r8.o
            goto L_0x0093
        L_0x00c6:
            r0 = r3
            goto L_0x00a4
        L_0x00c8:
            r0 = r3
            goto L_0x00a4
        L_0x00ca:
            r2 = r3
            goto L_0x00a6
        L_0x00cc:
            r0 = r4
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public final void setAppSearchData(Bundle bundle) {
        this.H = bundle;
    }

    public final void setImeOptions(int i2) {
        this.c.setImeOptions(i2);
    }

    public final int getImeOptions() {
        return this.c.getImeOptions();
    }

    public final void setInputType(int i2) {
        this.c.setInputType(i2);
    }

    public final int getInputType() {
        return this.c.getInputType();
    }

    public final boolean requestFocus(int i2, Rect rect) {
        if (this.A || !isFocusable()) {
            return false;
        }
        if (this.v) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.c.requestFocus(i2, rect);
        if (requestFocus) {
            a(false);
        }
        return requestFocus;
    }

    public final void clearFocus() {
        this.A = true;
        setImeVisibility(false);
        super.clearFocus();
        this.c.clearFocus();
        this.A = false;
    }

    public final void setOnQueryTextListener(c cVar) {
        this.p = cVar;
    }

    public final void setOnCloseListener(b bVar) {
        this.q = bVar;
    }

    public final void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.r = onFocusChangeListener;
    }

    public final void setOnSuggestionListener(d dVar) {
        this.s = dVar;
    }

    public final void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.t = onClickListener;
    }

    public final CharSequence getQuery() {
        return this.c.getText();
    }

    public final void setQueryHint(CharSequence charSequence) {
        this.y = charSequence;
        f();
    }

    public final CharSequence getQueryHint() {
        int hintId;
        if (this.y != null) {
            return this.y;
        }
        if (!b || this.G == null || (hintId = this.G.getHintId()) == 0) {
            return null;
        }
        return getContext().getString(hintId);
    }

    public final void setIconifiedByDefault(boolean z2) {
        if (this.u != z2) {
            this.u = z2;
            a(z2);
            f();
        }
    }

    public final void setIconified(boolean z2) {
        if (!z2) {
            a(false);
            this.c.requestFocus();
            setImeVisibility(true);
            if (this.t != null) {
                this.t.onClick(this);
            }
        } else if (!TextUtils.isEmpty(this.c.getText())) {
            this.c.setText("");
            this.c.requestFocus();
            setImeVisibility(true);
        } else if (!this.u) {
        } else {
            if (this.q == null || !this.q.a()) {
                clearFocus();
                a(true);
            }
        }
    }

    public final void setSubmitButtonEnabled(boolean z2) {
        this.x = z2;
        a(this.v);
    }

    public final void setQueryRefinementEnabled(boolean z2) {
        int i2;
        this.z = z2;
        if (this.w instanceof c) {
            c cVar = (c) this.w;
            if (z2) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            cVar.j = i2;
        }
    }

    public final void setSuggestionsAdapter(android.support.v4.f.b bVar) {
        this.w = bVar;
        this.c.setAdapter(this.w);
    }

    public final android.support.v4.f.b getSuggestionsAdapter() {
        return this.w;
    }

    public final void setMaxWidth(int i2) {
        this.B = i2;
        requestLayout();
    }

    public final int getMaxWidth() {
        return this.B;
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(a.c.abc_search_view_preferred_width);
    }

    private void a(boolean z2) {
        boolean z3;
        int i2;
        int i3;
        int i4;
        boolean z4;
        int i5;
        int[] iArr;
        int i6;
        boolean z5 = true;
        int i7 = 8;
        this.v = z2;
        int i8 = z2 ? 0 : 8;
        if (!TextUtils.isEmpty(this.c.getText())) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f.setVisibility(i8);
        if (!this.x || !d() || !hasFocus() || (!z3 && this.C)) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        this.g.setVisibility(i2);
        View view = this.d;
        if (z2) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        view.setVisibility(i3);
        ImageView imageView = this.j;
        if (this.u) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        imageView.setVisibility(i4);
        boolean z6 = !TextUtils.isEmpty(this.c.getText());
        if (z6 || (this.u && !this.E)) {
            z4 = true;
        } else {
            z4 = false;
        }
        ImageView imageView2 = this.h;
        if (z4) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        imageView2.setVisibility(i5);
        Drawable drawable = this.h.getDrawable();
        if (z6) {
            iArr = ENABLED_STATE_SET;
        } else {
            iArr = EMPTY_STATE_SET;
        }
        drawable.setState(iArr);
        if (z3) {
            z5 = false;
        }
        if (!this.C || this.v || !z5) {
            i6 = 8;
        } else {
            this.g.setVisibility(8);
            i6 = 0;
        }
        this.i.setVisibility(i6);
        if (d() && (this.g.getVisibility() == 0 || this.i.getVisibility() == 0)) {
            i7 = 0;
        }
        this.e.setVisibility(i7);
    }

    private boolean d() {
        return (this.x || this.C) && !this.v;
    }

    private void e() {
        post(this.K);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        removeCallbacks(this.K);
        post(this.L);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: private */
    public void setImeVisibility(boolean z2) {
        if (z2) {
            post(this.J);
            return;
        }
        removeCallbacks(this.J);
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    private CharSequence a(CharSequence charSequence) {
        if (!this.u) {
            return charSequence;
        }
        Drawable a2 = this.I.a(this.k);
        int textSize = (int) (((double) this.c.getTextSize()) * 1.25d);
        a2.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.setSpan(new ImageSpan(a2), 1, 2, 33);
        return spannableStringBuilder;
    }

    private void f() {
        if (this.y != null) {
            this.c.setHint(a(this.y));
        } else if (!b || this.G == null) {
            this.c.setHint(a((CharSequence) ""));
        } else {
            String str = null;
            int hintId = this.G.getHintId();
            if (hintId != 0) {
                str = getContext().getString(hintId);
            }
            if (str != null) {
                this.c.setHint(a((CharSequence) str));
            }
        }
    }

    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        e();
    }

    public final void a_() {
        this.c.setText("");
        this.c.setSelection(this.c.length());
        this.D = "";
        clearFocus();
        a(true);
        this.c.setImeOptions(this.F);
        this.E = false;
    }

    public final void a() {
        if (!this.E) {
            this.E = true;
            this.F = this.c.getImeOptions();
            this.c.setImeOptions(this.F | 33554432);
            this.c.setText("");
            setIconified(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void setQuery(CharSequence charSequence) {
        this.c.setText(charSequence);
        this.c.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static class SearchAutoComplete extends AutoCompleteTextView {
        private final int[] a;
        private int b;
        private SearchView c;
        private final o d;

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 16842859);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.a = new int[]{16843126};
            this.b = getThreshold();
            q a2 = q.a(context, attributeSet, this.a, i);
            if (a2.c(0)) {
                setDropDownBackgroundDrawable(a2.a(0));
            }
            a2.a.recycle();
            this.d = a2.a();
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.c = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.b = i;
        }

        public void setDropDownBackgroundResource(int i) {
            setDropDownBackgroundDrawable(this.d.a(i));
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        public void performCompletion() {
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.c.hasFocus() && getVisibility() == 0) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                if (SearchView.a(getContext())) {
                    a aVar = SearchView.a;
                    if (aVar.c != null) {
                        try {
                            aVar.c.invoke(this, new Object[]{true});
                        } catch (Exception e) {
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.c.c();
        }

        public boolean enoughToFilter() {
            return this.b <= 0 || super.enoughToFilter();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState == null) {
                        return true;
                    }
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.c.clearFocus();
                        this.c.setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }
    }

    private static class a {
        Method a;
        Method b;
        Method c;
        private Method d;

        a() {
            try {
                this.a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            try {
                this.b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b.setAccessible(true);
            } catch (NoSuchMethodException e2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                this.c = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.c.setAccessible(true);
            } catch (NoSuchMethodException e3) {
            }
            Class<InputMethodManager> cls2 = InputMethodManager.class;
            try {
                this.d = cls2.getMethod("showSoftInputUnchecked", new Class[]{Integer.TYPE, ResultReceiver.class});
                this.d.setAccessible(true);
            } catch (NoSuchMethodException e4) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        if (this.v) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        switch (mode) {
            case Integer.MIN_VALUE:
                if (this.B <= 0) {
                    size = Math.min(getPreferredWidth(), size);
                    break;
                } else {
                    size = Math.min(this.B, size);
                    break;
                }
            case 0:
                if (this.B <= 0) {
                    size = getPreferredWidth();
                    break;
                } else {
                    size = this.B;
                    break;
                }
            case 1073741824:
                if (this.B > 0) {
                    size = Math.min(this.B, size);
                    break;
                }
                break;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i3);
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        a(this.v);
        e();
        if (this.c.hasFocus()) {
            a aVar = a;
            SearchAutoComplete searchAutoComplete = this.c;
            if (aVar.a != null) {
                try {
                    aVar.a.invoke(searchAutoComplete, new Object[0]);
                } catch (Exception e2) {
                }
            }
            a aVar2 = a;
            SearchAutoComplete searchAutoComplete2 = this.c;
            if (aVar2.b != null) {
                try {
                    aVar2.b.invoke(searchAutoComplete2, new Object[0]);
                } catch (Exception e3) {
                }
            }
        }
    }
}
