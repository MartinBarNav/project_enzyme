// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.widget;

import android.os.ResultReceiver;
import java.lang.reflect.Method;
import android.view.KeyEvent$DispatcherState;
import android.view.KeyEvent;
import android.support.v7.internal.widget.q;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import android.widget.ListAdapter;
import android.database.Cursor;
import android.graphics.Rect;
import android.view.View$MeasureSpec;
import android.view.inputmethod.InputMethodManager;
import android.content.Context;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import android.text.SpannableStringBuilder;
import android.os.Build$VERSION;
import android.support.v4.f.b;
import android.view.View$OnClickListener;
import android.view.View$OnFocusChangeListener;
import android.content.Intent;
import android.widget.ImageView;
import android.view.View;
import android.graphics.drawable.Drawable$ConstantState;
import java.util.WeakHashMap;
import android.support.v7.internal.widget.o;
import android.os.Bundle;
import android.app.SearchableInfo;
import android.support.v7.c.a;

public final class SearchView extends LinearLayoutCompat implements android.support.v7.c.a
{
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
    private final WeakHashMap<String, Drawable$ConstantState> M;
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
    private View$OnFocusChangeListener r;
    private d s;
    private View$OnClickListener t;
    private boolean u;
    private boolean v;
    private android.support.v4.f.b w;
    private boolean x;
    private CharSequence y;
    private boolean z;
    
    static {
        b = (Build$VERSION.SDK_INT >= 8);
        a = new a();
    }
    
    private CharSequence a(CharSequence charSequence) {
        if (this.u) {
            final Drawable a = this.I.a(this.k);
            final int n = (int)(this.c.getTextSize() * 1.25);
            a.setBounds(0, 0, n, n);
            final Object o = new SpannableStringBuilder((CharSequence)"   ");
            ((SpannableStringBuilder)o).append(charSequence);
            ((SpannableStringBuilder)o).setSpan((Object)new ImageSpan(a), 1, 2, 33);
            charSequence = (CharSequence)o;
        }
        return charSequence;
    }
    
    static /* synthetic */ void a(final SearchView searchView) {
        searchView.setImeVisibility(false);
    }
    
    private void a(final boolean v) {
        final int n = 1;
        final int n2 = 8;
        this.v = v;
        int visibility;
        if (v) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        boolean b;
        if (!TextUtils.isEmpty((CharSequence)this.c.getText())) {
            b = true;
        }
        else {
            b = false;
        }
        this.f.setVisibility(visibility);
        int visibility2;
        if (this.x && this.d() && this.hasFocus() && (b || !this.C)) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        this.g.setVisibility(visibility2);
        final View d = this.d;
        int visibility3;
        if (v) {
            visibility3 = 8;
        }
        else {
            visibility3 = 0;
        }
        d.setVisibility(visibility3);
        final ImageView j = this.j;
        int visibility4;
        if (this.u) {
            visibility4 = 8;
        }
        else {
            visibility4 = 0;
        }
        j.setVisibility(visibility4);
        boolean b2;
        if (!TextUtils.isEmpty((CharSequence)this.c.getText())) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        int n3;
        if (b2 || (this.u && !this.E)) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        final ImageView h = this.h;
        int visibility5;
        if (n3 != 0) {
            visibility5 = 0;
        }
        else {
            visibility5 = 8;
        }
        h.setVisibility(visibility5);
        final Drawable drawable = this.h.getDrawable();
        int[] state;
        if (b2) {
            state = SearchView.ENABLED_STATE_SET;
        }
        else {
            state = SearchView.EMPTY_STATE_SET;
        }
        drawable.setState(state);
        int n4;
        if (!b) {
            n4 = n;
        }
        else {
            n4 = 0;
        }
        int visibility6;
        if (this.C && !this.v && n4 != 0) {
            this.g.setVisibility(8);
            visibility6 = 0;
        }
        else {
            visibility6 = 8;
        }
        this.i.setVisibility(visibility6);
        int visibility7 = n2;
        Label_0302: {
            if (this.d()) {
                if (this.g.getVisibility() != 0) {
                    visibility7 = n2;
                    if (this.i.getVisibility() != 0) {
                        break Label_0302;
                    }
                }
                visibility7 = 0;
            }
        }
        this.e.setVisibility(visibility7);
    }
    
    static boolean a(final Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
    
    private boolean d() {
        return (this.x || this.C) && !this.v;
    }
    
    private void e() {
        this.post(this.K);
    }
    
    private void f() {
        if (this.y != null) {
            this.c.setHint(this.a(this.y));
        }
        else if (SearchView.b && this.G != null) {
            CharSequence string = null;
            final int hintId = this.G.getHintId();
            if (hintId != 0) {
                string = this.getContext().getString(hintId);
            }
            if (string != null) {
                this.c.setHint(this.a(string));
            }
        }
        else {
            this.c.setHint(this.a(""));
        }
    }
    
    private int getPreferredWidth() {
        return this.getContext().getResources().getDimensionPixelSize(android.support.v7.b.a.c.abc_search_view_preferred_width);
    }
    
    private void setImeVisibility(final boolean b) {
        if (b) {
            this.post(this.J);
        }
        else {
            this.removeCallbacks(this.J);
            final InputMethodManager inputMethodManager = (InputMethodManager)this.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(this.getWindowToken(), 0);
            }
        }
    }
    
    @Override
    public final void a() {
        if (!this.E) {
            this.E = true;
            this.F = this.c.getImeOptions();
            this.c.setImeOptions(this.F | 0x2000000);
            this.c.setText((CharSequence)"");
            this.setIconified(false);
        }
    }
    
    @Override
    public final void a_() {
        this.c.setText((CharSequence)"");
        this.c.setSelection(this.c.length());
        this.D = "";
        this.clearFocus();
        this.a(true);
        this.c.setImeOptions(this.F);
        this.E = false;
    }
    
    final void c() {
        this.a(this.v);
        this.e();
        if (!this.c.hasFocus()) {
            return;
        }
        final a a = SearchView.a;
        final SearchAutoComplete c = this.c;
        while (true) {
            if (a.a == null) {
                break Label_0051;
            }
            try {
                a.a.invoke(c, new Object[0]);
                final a a2 = SearchView.a;
                final SearchAutoComplete c2 = this.c;
                if (a2.b == null) {
                    return;
                }
                try {
                    a2.b.invoke(c2, new Object[0]);
                }
                catch (Exception ex) {}
            }
            catch (Exception ex2) {
                continue;
            }
            break;
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
        return (CharSequence)this.c.getText();
    }
    
    public final CharSequence getQueryHint() {
        final CharSequence charSequence = null;
        CharSequence charSequence2;
        if (this.y != null) {
            charSequence2 = this.y;
        }
        else {
            charSequence2 = charSequence;
            if (SearchView.b) {
                charSequence2 = charSequence;
                if (this.G != null) {
                    final int hintId = this.G.getHintId();
                    charSequence2 = charSequence;
                    if (hintId != 0) {
                        charSequence2 = this.getContext().getString(hintId);
                    }
                }
            }
        }
        return charSequence2;
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
    
    protected final void onMeasure(int n, final int n2) {
        if (this.v) {
            super.onMeasure(n, n2);
        }
        else {
            final int mode = View$MeasureSpec.getMode(n);
            final int size = View$MeasureSpec.getSize(n);
            switch (mode) {
                default: {
                    n = size;
                    break;
                }
                case Integer.MIN_VALUE: {
                    if (this.B > 0) {
                        n = Math.min(this.B, size);
                        break;
                    }
                    n = Math.min(this.getPreferredWidth(), size);
                    break;
                }
                case 1073741824: {
                    n = size;
                    if (this.B > 0) {
                        n = Math.min(this.B, size);
                        break;
                    }
                    break;
                }
                case 0: {
                    if (this.B > 0) {
                        n = this.B;
                        break;
                    }
                    n = this.getPreferredWidth();
                    break;
                }
            }
            super.onMeasure(View$MeasureSpec.makeMeasureSpec(n, 1073741824), n2);
        }
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        this.e();
    }
    
    public final boolean requestFocus(final int n, final Rect rect) {
        boolean b = false;
        if (!this.A && this.isFocusable()) {
            if (!this.v) {
                b = this.c.requestFocus(n, rect);
                if (b) {
                    this.a(false);
                }
            }
            else {
                b = super.requestFocus(n, rect);
            }
        }
        return b;
    }
    
    public final void setAppSearchData(final Bundle h) {
        this.H = h;
    }
    
    public final void setIconified(final boolean b) {
        if (b) {
            if (TextUtils.isEmpty((CharSequence)this.c.getText())) {
                if (this.u && (this.q == null || !this.q.a())) {
                    this.clearFocus();
                    this.a(true);
                }
            }
            else {
                this.c.setText((CharSequence)"");
                this.c.requestFocus();
                this.setImeVisibility(true);
            }
        }
        else {
            this.a(false);
            this.c.requestFocus();
            this.setImeVisibility(true);
            if (this.t != null) {
                this.t.onClick((View)this);
            }
        }
    }
    
    public final void setIconifiedByDefault(final boolean u) {
        if (this.u != u) {
            this.a(this.u = u);
            this.f();
        }
    }
    
    public final void setImeOptions(final int imeOptions) {
        this.c.setImeOptions(imeOptions);
    }
    
    public final void setInputType(final int inputType) {
        this.c.setInputType(inputType);
    }
    
    public final void setMaxWidth(final int b) {
        this.B = b;
        this.requestLayout();
    }
    
    public final void setOnCloseListener(final b q) {
        this.q = q;
    }
    
    public final void setOnQueryTextFocusChangeListener(final View$OnFocusChangeListener r) {
        this.r = r;
    }
    
    public final void setOnQueryTextListener(final c p) {
        this.p = p;
    }
    
    public final void setOnSearchClickListener(final View$OnClickListener t) {
        this.t = t;
    }
    
    public final void setOnSuggestionListener(final d s) {
        this.s = s;
    }
    
    final void setQuery(final CharSequence text) {
        this.c.setText(text);
        final SearchAutoComplete c = this.c;
        int length;
        if (TextUtils.isEmpty(text)) {
            length = 0;
        }
        else {
            length = text.length();
        }
        c.setSelection(length);
    }
    
    public final void setQueryHint(final CharSequence y) {
        this.y = y;
        this.f();
    }
    
    public final void setQueryRefinementEnabled(final boolean z) {
        this.z = z;
        if (this.w instanceof android.support.v7.widget.c) {
            final android.support.v7.widget.c c = (android.support.v7.widget.c)this.w;
            int j;
            if (z) {
                j = 2;
            }
            else {
                j = 1;
            }
            c.j = j;
        }
    }
    
    public final void setSearchableInfo(final SearchableInfo g) {
        boolean c = true;
        this.G = g;
        if (this.G != null) {
            if (SearchView.b) {
                this.c.setThreshold(this.G.getSuggestThreshold());
                this.c.setImeOptions(this.G.getImeOptions());
                int inputType;
                final int n = inputType = this.G.getInputType();
                if ((n & 0xF) == 0x1) {
                    inputType = (n & 0xFFFEFFFF);
                    if (this.G.getSuggestAuthority() != null) {
                        inputType = (inputType | 0x10000 | 0x80000);
                    }
                }
                this.c.setInputType(inputType);
                if (this.w != null) {
                    this.w.a((Cursor)null);
                }
                if (this.G.getSuggestAuthority() != null) {
                    this.w = new android.support.v7.widget.c(this.getContext(), this, this.G, this.M);
                    this.c.setAdapter((ListAdapter)this.w);
                    final android.support.v7.widget.c c2 = (android.support.v7.widget.c)this.w;
                    int j;
                    if (this.z) {
                        j = 2;
                    }
                    else {
                        j = 1;
                    }
                    c2.j = j;
                }
            }
            this.f();
        }
    Label_0261:
        while (true) {
            Label_0328: {
                if (SearchView.b) {
                    while (true) {
                        Label_0322: {
                            if (this.G == null || !this.G.getVoiceSearchEnabled()) {
                                break Label_0322;
                            }
                            Intent intent;
                            if (this.G.getVoiceSearchLaunchWebSearch()) {
                                intent = this.n;
                            }
                            else if (this.G.getVoiceSearchLaunchRecognizer()) {
                                intent = this.o;
                            }
                            else {
                                intent = null;
                            }
                            if (intent == null) {
                                break Label_0322;
                            }
                            int n2;
                            if (this.getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                                n2 = 1;
                            }
                            else {
                                n2 = 0;
                            }
                            if (n2 != 0) {
                                break Label_0261;
                            }
                            break Label_0328;
                        }
                        int n2 = 0;
                        continue;
                    }
                }
                break Label_0328;
                this.C = c;
                if (this.C) {
                    this.c.setPrivateImeOptions("nm");
                }
                this.a(this.v);
                return;
            }
            c = false;
            continue Label_0261;
        }
    }
    
    public final void setSubmitButtonEnabled(final boolean x) {
        this.x = x;
        this.a(this.v);
    }
    
    public final void setSuggestionsAdapter(final android.support.v4.f.b w) {
        this.w = w;
        this.c.setAdapter((ListAdapter)this.w);
    }
    
    public static class SearchAutoComplete extends AutoCompleteTextView
    {
        private final int[] a;
        private int b;
        private SearchView c;
        private final o d;
        
        public SearchAutoComplete(final Context context) {
            this(context, null);
        }
        
        public SearchAutoComplete(final Context context, final AttributeSet set) {
            this(context, set, 16842859);
        }
        
        public SearchAutoComplete(final Context context, final AttributeSet set, final int n) {
            super(context, set, n);
            this.a = new int[] { 16843126 };
            this.b = this.getThreshold();
            final q a = q.a(context, set, this.a, n);
            if (a.c(0)) {
                this.setDropDownBackgroundDrawable(a.a(0));
            }
            a.a.recycle();
            this.d = a.a();
        }
        
        public boolean enoughToFilter() {
            return this.b <= 0 || super.enoughToFilter();
        }
        
        protected void onFocusChanged(final boolean b, final int n, final Rect rect) {
            super.onFocusChanged(b, n, rect);
            this.c.c();
        }
        
        public boolean onKeyPreIme(final int n, final KeyEvent keyEvent) {
            final boolean b = true;
            if (n != 4) {
                return super.onKeyPreIme(n, keyEvent);
            }
            boolean onKeyPreIme;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                final KeyEvent$DispatcherState keyDispatcherState = this.getKeyDispatcherState();
                onKeyPreIme = b;
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, (Object)this);
                    onKeyPreIme = b;
                }
            }
            else {
                if (keyEvent.getAction() != 1) {
                    return super.onKeyPreIme(n, keyEvent);
                }
                final KeyEvent$DispatcherState keyDispatcherState2 = this.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
                    return super.onKeyPreIme(n, keyEvent);
                }
                this.c.clearFocus();
                SearchView.a(this.c);
                onKeyPreIme = b;
            }
            return onKeyPreIme;
            onKeyPreIme = super.onKeyPreIme(n, keyEvent);
            return onKeyPreIme;
        }
        
        public void onWindowFocusChanged(final boolean b) {
            super.onWindowFocusChanged(b);
            if (!b || !this.c.hasFocus() || this.getVisibility() != 0) {
                return;
            }
            ((InputMethodManager)this.getContext().getSystemService("input_method")).showSoftInput((View)this, 0);
            if (!SearchView.a(this.getContext())) {
                return;
            }
            final a a = SearchView.a;
            if (a.c == null) {
                return;
            }
            try {
                a.c.invoke(this, true);
            }
            catch (Exception ex) {}
        }
        
        public void performCompletion() {
        }
        
        protected void replaceText(final CharSequence charSequence) {
        }
        
        public void setDropDownBackgroundResource(final int n) {
            this.setDropDownBackgroundDrawable(this.d.a(n));
        }
        
        void setSearchView(final SearchView c) {
            this.c = c;
        }
        
        public void setThreshold(final int n) {
            super.setThreshold(n);
            this.b = n;
        }
    }
    
    private static final class a
    {
        Method a;
        Method b;
        Method c;
        private Method d;
        
        a() {
            while (true) {
                try {
                    (this.a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", (Class<?>[])new Class[0])).setAccessible(true);
                    try {
                        (this.b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", (Class<?>[])new Class[0])).setAccessible(true);
                        try {
                            (this.c = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE)).setAccessible(true);
                            try {
                                (this.d = InputMethodManager.class.getMethod("showSoftInputUnchecked", Integer.TYPE, ResultReceiver.class)).setAccessible(true);
                            }
                            catch (NoSuchMethodException ex) {}
                        }
                        catch (NoSuchMethodException ex2) {}
                    }
                    catch (NoSuchMethodException ex3) {}
                }
                catch (NoSuchMethodException ex4) {
                    continue;
                }
                break;
            }
        }
    }
    
    public interface b
    {
        boolean a();
    }
    
    public interface c
    {
    }
    
    public interface d
    {
    }
}
