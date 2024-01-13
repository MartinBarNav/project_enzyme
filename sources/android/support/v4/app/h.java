package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.e.c;
import android.support.v4.e.d;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

final class h extends g implements LayoutInflater.Factory {
    static final Interpolator A = new DecelerateInterpolator(1.5f);
    static final Interpolator B = new AccelerateInterpolator(2.5f);
    static final Interpolator C = new AccelerateInterpolator(1.5f);
    static boolean a = false;
    static final boolean b;
    static final Interpolator z = new DecelerateInterpolator(2.5f);
    ArrayList<Runnable> c;
    Runnable[] d;
    boolean e;
    ArrayList<d> f;
    ArrayList<d> g;
    ArrayList<Integer> h;
    ArrayList<c> i;
    ArrayList<d> j;
    ArrayList<c> k;
    ArrayList<Integer> l;
    ArrayList<Object> m;
    int n = 0;
    e o;
    f p;
    d q;
    boolean r;
    boolean s;
    boolean t;
    String u;
    boolean v;
    Bundle w = null;
    SparseArray<Parcelable> x = null;
    Runnable y = new Runnable() {
        public final void run() {
            h.this.a();
        }
    };

    static class a {
        public static final int[] a = {16842755, 16842960, 16842961};
    }

    h() {
    }

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 11) {
            z2 = true;
        }
        b = z2;
    }

    private void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new d("FragmentManager"));
        if (this.o != null) {
            try {
                this.o.dump("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            try {
                a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
            }
        }
        throw runtimeException;
    }

    private d a(Bundle bundle, String str) {
        int i2 = bundle.getInt(str, -1);
        if (i2 == -1) {
            return null;
        }
        if (i2 >= this.f.size()) {
            a((RuntimeException) new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i2));
        }
        d dVar = this.f.get(i2);
        if (dVar != null) {
            return dVar;
        }
        a((RuntimeException) new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i2));
        return dVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.q != null) {
            c.a(this.q, sb);
        } else {
            c.a(this.o, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        int size6;
        String str2 = str + "    ";
        if (this.f != null && (size6 = this.f.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i2 = 0; i2 < size6; i2++) {
                d dVar = this.f.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(dVar);
                if (dVar != null) {
                    printWriter.print(str2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(dVar.x));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(dVar.y));
                    printWriter.print(" mTag=");
                    printWriter.println(dVar.z);
                    printWriter.print(str2);
                    printWriter.print("mState=");
                    printWriter.print(dVar.b);
                    printWriter.print(" mIndex=");
                    printWriter.print(dVar.g);
                    printWriter.print(" mWho=");
                    printWriter.print(dVar.h);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(dVar.s);
                    printWriter.print(str2);
                    printWriter.print("mAdded=");
                    printWriter.print(dVar.m);
                    printWriter.print(" mRemoving=");
                    printWriter.print(dVar.n);
                    printWriter.print(" mResumed=");
                    printWriter.print(dVar.o);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(dVar.p);
                    printWriter.print(" mInLayout=");
                    printWriter.println(dVar.q);
                    printWriter.print(str2);
                    printWriter.print("mHidden=");
                    printWriter.print(dVar.A);
                    printWriter.print(" mDetached=");
                    printWriter.print(dVar.B);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(dVar.F);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(dVar.E);
                    printWriter.print(str2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(dVar.C);
                    printWriter.print(" mRetaining=");
                    printWriter.print(dVar.D);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(dVar.M);
                    if (dVar.t != null) {
                        printWriter.print(str2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(dVar.t);
                    }
                    if (dVar.u != null) {
                        printWriter.print(str2);
                        printWriter.print("mActivity=");
                        printWriter.println(dVar.u);
                    }
                    if (dVar.w != null) {
                        printWriter.print(str2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(dVar.w);
                    }
                    if (dVar.i != null) {
                        printWriter.print(str2);
                        printWriter.print("mArguments=");
                        printWriter.println(dVar.i);
                    }
                    if (dVar.e != null) {
                        printWriter.print(str2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(dVar.e);
                    }
                    if (dVar.f != null) {
                        printWriter.print(str2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(dVar.f);
                    }
                    if (dVar.j != null) {
                        printWriter.print(str2);
                        printWriter.print("mTarget=");
                        printWriter.print(dVar.j);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(dVar.l);
                    }
                    if (dVar.H != 0) {
                        printWriter.print(str2);
                        printWriter.print("mNextAnim=");
                        printWriter.println(dVar.H);
                    }
                    if (dVar.I != null) {
                        printWriter.print(str2);
                        printWriter.print("mContainer=");
                        printWriter.println(dVar.I);
                    }
                    if (dVar.J != null) {
                        printWriter.print(str2);
                        printWriter.print("mView=");
                        printWriter.println(dVar.J);
                    }
                    if (dVar.K != null) {
                        printWriter.print(str2);
                        printWriter.print("mInnerView=");
                        printWriter.println(dVar.J);
                    }
                    if (dVar.c != null) {
                        printWriter.print(str2);
                        printWriter.print("mAnimatingAway=");
                        printWriter.println(dVar.c);
                        printWriter.print(str2);
                        printWriter.print("mStateAfterAnimating=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.N != null) {
                        printWriter.print(str2);
                        printWriter.println("Loader Manager:");
                        dVar.N.a(str2 + "  ", printWriter);
                    }
                    if (dVar.v != null) {
                        printWriter.print(str2);
                        printWriter.println("Child " + dVar.v + ":");
                        dVar.v.a(str2 + "  ", fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        if (this.g != null && (size5 = this.g.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size5; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.g.get(i3).toString());
            }
        }
        if (this.j != null && (size4 = this.j.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size4; i4++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(this.j.get(i4).toString());
            }
        }
        if (this.i != null && (size3 = this.i.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size3; i5++) {
                c cVar = this.i.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(cVar.toString());
                cVar.a(str2, printWriter);
            }
        }
        synchronized (this) {
            if (this.k != null && (size2 = this.k.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i6 = 0; i6 < size2; i6++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(this.k.get(i6));
                }
            }
            if (this.l != null && this.l.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.l.toArray()));
            }
        }
        if (this.c != null && (size = this.c.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i7 = 0; i7 < size; i7++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(this.c.get(i7));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mActivity=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.p);
        if (this.q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.t);
        if (this.r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.r);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.u);
        }
        if (this.h != null && this.h.size() > 0) {
            printWriter.print(str);
            printWriter.print("  mAvailIndices: ");
            printWriter.println(Arrays.toString(this.h.toArray()));
        }
    }

    private static Animation a(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(z);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(A);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    private static Animation a(float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(A);
        alphaAnimation.setDuration(220);
        return alphaAnimation;
    }

    private Animation a(d dVar, int i2, boolean z2, int i3) {
        Animation loadAnimation;
        int i4 = dVar.H;
        d.d();
        if (dVar.H != 0 && (loadAnimation = AnimationUtils.loadAnimation(this.o, dVar.H)) != null) {
            return loadAnimation;
        }
        if (i2 == 0) {
            return null;
        }
        char c2 = 65535;
        switch (i2) {
            case 4097:
                if (!z2) {
                    c2 = 2;
                    break;
                } else {
                    c2 = 1;
                    break;
                }
            case 4099:
                if (!z2) {
                    c2 = 6;
                    break;
                } else {
                    c2 = 5;
                    break;
                }
            case 8194:
                if (!z2) {
                    c2 = 4;
                    break;
                } else {
                    c2 = 3;
                    break;
                }
        }
        if (c2 < 0) {
            return null;
        }
        switch (c2) {
            case 1:
                return a(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return a(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return a(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return a(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return a(0.0f, 1.0f);
            case 6:
                return a(1.0f, 0.0f);
            default:
                if (i3 == 0 && this.o.getWindow() != null) {
                    i3 = this.o.getWindow().getAttributes().windowAnimations;
                }
                if (i3 == 0) {
                    return null;
                }
                return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0225, code lost:
        if (r11.A == false) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0227, code lost:
        r11.J.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x022e, code lost:
        r0 = r11.J;
        r0 = r11.e;
        android.support.v4.app.d.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0235, code lost:
        r0 = r11.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0239, code lost:
        if (r11.v == null) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x023b, code lost:
        r11.v.s = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x023f, code lost:
        r11.G = false;
        r11.G = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0245, code lost:
        if (r11.G != false) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0261, code lost:
        throw new android.support.v4.app.o("Fragment " + r11 + " did not call through to super.onActivityCreated()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0262, code lost:
        r11.K = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0267, code lost:
        if (r11.v == null) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0269, code lost:
        r11.v.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0270, code lost:
        if (r11.J == null) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0272, code lost:
        r0 = r11.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0276, code lost:
        if (r11.f == null) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0278, code lost:
        r11.K.restoreHierarchyState(r11.f);
        r11.f = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0281, code lost:
        r11.G = false;
        r11.G = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0287, code lost:
        if (r11.G != false) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02a3, code lost:
        throw new android.support.v4.app.o("Fragment " + r11 + " did not call through to super.onViewStateRestored()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02a4, code lost:
        r11.e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02a6, code lost:
        if (r12 <= 3) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02aa, code lost:
        if (a == false) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02ac, code lost:
        android.util.Log.v("FragmentManager", "moveto STARTED: " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02c0, code lost:
        r11.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02c3, code lost:
        if (r12 <= 4) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02c7, code lost:
        if (a == false) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02c9, code lost:
        android.util.Log.v("FragmentManager", "moveto RESUMED: " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02dd, code lost:
        r11.o = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02e1, code lost:
        if (r11.v == null) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02e3, code lost:
        r11.v.s = false;
        r11.v.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02ec, code lost:
        r11.G = false;
        r11.G = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02f2, code lost:
        if (r11.G != false) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x030e, code lost:
        throw new android.support.v4.app.o("Fragment " + r11 + " did not call through to super.onResume()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0311, code lost:
        if (r11.v == null) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0313, code lost:
        r11.v.g();
        r11.v.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x031d, code lost:
        r11.e = null;
        r11.f = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x032e, code lost:
        if (r12 > 0) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0332, code lost:
        if (r10.t == false) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0336, code lost:
        if (r11.c == null) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0338, code lost:
        r0 = r11.c;
        r11.c = null;
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0341, code lost:
        if (r11.c == null) goto L_0x048f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0343, code lost:
        r11.d = r12;
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0391, code lost:
        if (r12 >= 4) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0395, code lost:
        if (a == false) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0397, code lost:
        android.util.Log.v("FragmentManager", "movefrom STARTED: " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03ad, code lost:
        if (r11.v == null) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03af, code lost:
        r11.v.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03b4, code lost:
        r11.G = false;
        r11.G = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03ba, code lost:
        if (r11.G != false) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03d6, code lost:
        throw new android.support.v4.app.o("Fragment " + r11 + " did not call through to super.onStop()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03d7, code lost:
        if (r12 >= 3) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03db, code lost:
        if (a == false) goto L_0x03f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03dd, code lost:
        android.util.Log.v("FragmentManager", "movefrom STOPPED: " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03f1, code lost:
        r11.j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03f5, code lost:
        if (r12 >= 2) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03f9, code lost:
        if (a == false) goto L_0x040f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03fb, code lost:
        android.util.Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0411, code lost:
        if (r11.J == null) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0419, code lost:
        if (r10.o.isFinishing() != false) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x041d, code lost:
        if (r11.f != null) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x041f, code lost:
        b(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0424, code lost:
        if (r11.v == null) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0426, code lost:
        r11.v.a(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x042b, code lost:
        r11.G = false;
        r11.G = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0431, code lost:
        if (r11.G != false) goto L_0x044e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x044d, code lost:
        throw new android.support.v4.app.o("Fragment " + r11 + " did not call through to super.onDestroyView()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0450, code lost:
        if (r11.N == null) goto L_0x0457;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0452, code lost:
        r11.N.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0459, code lost:
        if (r11.J == null) goto L_0x0487;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x045d, code lost:
        if (r11.I == null) goto L_0x0487;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0461, code lost:
        if (r10.n <= 0) goto L_0x054e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0465, code lost:
        if (r10.t != false) goto L_0x054e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0467, code lost:
        r0 = a(r11, r13, false, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x046b, code lost:
        if (r0 == null) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x046d, code lost:
        r11.c = r11.J;
        r11.d = r12;
        r0.setAnimationListener(new android.support.v4.app.h.AnonymousClass2(r10));
        r11.J.startAnimation(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0480, code lost:
        r11.I.removeView(r11.J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0487, code lost:
        r11.I = null;
        r11.J = null;
        r11.K = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0491, code lost:
        if (a == false) goto L_0x04a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0493, code lost:
        android.util.Log.v("FragmentManager", "movefrom CREATED: " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04a9, code lost:
        if (r11.D != false) goto L_0x04ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04ab, code lost:
        r11.k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04ae, code lost:
        r11.G = false;
        r11.G = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04b4, code lost:
        if (r11.G != false) goto L_0x04d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04d0, code lost:
        throw new android.support.v4.app.o("Fragment " + r11 + " did not call through to super.onDetach()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04d1, code lost:
        if (r15 != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04d5, code lost:
        if (r11.D != false) goto L_0x0544;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04d9, code lost:
        if (r11.g < 0) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04dd, code lost:
        if (a == false) goto L_0x04f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04df, code lost:
        android.util.Log.v("FragmentManager", "Freeing fragment index " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04f3, code lost:
        r10.f.set(r11.g, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04fc, code lost:
        if (r10.h != null) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04fe, code lost:
        r10.h = new java.util.ArrayList<>();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0505, code lost:
        r10.h.add(java.lang.Integer.valueOf(r11.g));
        r10.o.a(r11.h);
        r11.g = -1;
        r11.h = null;
        r11.m = false;
        r11.n = false;
        r11.o = false;
        r11.p = false;
        r11.q = false;
        r11.r = false;
        r11.s = 0;
        r11.t = null;
        r11.v = null;
        r11.u = null;
        r11.x = 0;
        r11.y = 0;
        r11.z = null;
        r11.A = false;
        r11.B = false;
        r11.D = false;
        r11.N = null;
        r11.O = false;
        r11.P = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0544, code lost:
        r11.u = null;
        r11.w = null;
        r11.t = null;
        r11.v = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x054e, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0551, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0161, code lost:
        if (r12 <= 1) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0165, code lost:
        if (a == false) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0167, code lost:
        android.util.Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x017d, code lost:
        if (r11.p != false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0181, code lost:
        if (r11.y == 0) goto L_0x0551;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0183, code lost:
        r0 = (android.view.ViewGroup) r10.p.a(r11.y);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x018d, code lost:
        if (r0 != null) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0191, code lost:
        if (r11.r != false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0193, code lost:
        r2 = new java.lang.StringBuilder("No view found for id 0x").append(java.lang.Integer.toHexString(r11.y)).append(" (");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ae, code lost:
        if (r11.u != null) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ca, code lost:
        throw new java.lang.IllegalStateException("Fragment " + r11 + " not attached to Activity");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ce, code lost:
        a((java.lang.RuntimeException) new java.lang.IllegalArgumentException(r2.append(r11.u.getResources().getResourceName(r11.y)).append(") for fragment ").append(r11).toString()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f2, code lost:
        r11.I = r0;
        r1 = r11.e;
        r11.c();
        r1 = r11.e;
        r11.J = r11.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0203, code lost:
        if (r11.J == null) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0205, code lost:
        r11.K = r11.J;
        r11.J = android.support.v4.app.m.a(r11.J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0211, code lost:
        if (r0 == null) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0213, code lost:
        r1 = a(r11, r13, true, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0217, code lost:
        if (r1 == null) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0219, code lost:
        r11.J.startAnimation(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x021e, code lost:
        r0.addView(r11.J);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(final android.support.v4.app.d r11, int r12, int r13, int r14, boolean r15) {
        /*
            r10 = this;
            r9 = 4
            r6 = 3
            r5 = 1
            r7 = 0
            r3 = 0
            boolean r0 = r11.m
            if (r0 == 0) goto L_0x000d
            boolean r0 = r11.B
            if (r0 == 0) goto L_0x0010
        L_0x000d:
            if (r12 <= r5) goto L_0x0010
            r12 = r5
        L_0x0010:
            boolean r0 = r11.n
            if (r0 == 0) goto L_0x001a
            int r0 = r11.b
            if (r12 <= r0) goto L_0x001a
            int r12 = r11.b
        L_0x001a:
            boolean r0 = r11.L
            if (r0 == 0) goto L_0x0025
            int r0 = r11.b
            if (r0 >= r9) goto L_0x0025
            if (r12 <= r6) goto L_0x0025
            r12 = r6
        L_0x0025:
            int r0 = r11.b
            if (r0 >= r12) goto L_0x0323
            boolean r0 = r11.p
            if (r0 == 0) goto L_0x0032
            boolean r0 = r11.q
            if (r0 != 0) goto L_0x0032
        L_0x0031:
            return
        L_0x0032:
            android.view.View r0 = r11.c
            if (r0 == 0) goto L_0x0040
            r11.c = r7
            int r2 = r11.d
            r0 = r10
            r1 = r11
            r4 = r3
            r0.a(r1, r2, r3, r4, r5)
        L_0x0040:
            int r0 = r11.b
            switch(r0) {
                case 0: goto L_0x0048;
                case 1: goto L_0x0161;
                case 2: goto L_0x02a6;
                case 3: goto L_0x02a6;
                case 4: goto L_0x02c3;
                default: goto L_0x0045;
            }
        L_0x0045:
            r11.b = r12
            goto L_0x0031
        L_0x0048:
            boolean r0 = a
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto CREATED: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0060:
            android.os.Bundle r0 = r11.e
            if (r0 == 0) goto L_0x00a4
            android.os.Bundle r0 = r11.e
            android.support.v4.app.e r1 = r10.o
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r11.e
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r11.f = r0
            android.os.Bundle r0 = r11.e
            java.lang.String r1 = "android:target_state"
            android.support.v4.app.d r0 = r10.a((android.os.Bundle) r0, (java.lang.String) r1)
            r11.j = r0
            android.support.v4.app.d r0 = r11.j
            if (r0 == 0) goto L_0x0091
            android.os.Bundle r0 = r11.e
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r3)
            r11.l = r0
        L_0x0091:
            android.os.Bundle r0 = r11.e
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r5)
            r11.M = r0
            boolean r0 = r11.M
            if (r0 != 0) goto L_0x00a4
            r11.L = r5
            if (r12 <= r6) goto L_0x00a4
            r12 = r6
        L_0x00a4:
            android.support.v4.app.e r0 = r10.o
            r11.u = r0
            android.support.v4.app.d r0 = r10.q
            r11.w = r0
            android.support.v4.app.d r0 = r10.q
            if (r0 == 0) goto L_0x00d9
            android.support.v4.app.d r0 = r10.q
            android.support.v4.app.h r0 = r0.v
        L_0x00b4:
            r11.t = r0
            r11.G = r3
            r11.G = r5
            boolean r0 = r11.G
            if (r0 != 0) goto L_0x00de
            android.support.v4.app.o r0 = new android.support.v4.app.o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onAttach()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00d9:
            android.support.v4.app.e r0 = r10.o
            android.support.v4.app.h r0 = r0.b
            goto L_0x00b4
        L_0x00de:
            android.support.v4.app.d r0 = r11.w
            boolean r0 = r11.D
            if (r0 != 0) goto L_0x012c
            android.os.Bundle r0 = r11.e
            android.support.v4.app.h r1 = r11.v
            if (r1 == 0) goto L_0x00ee
            android.support.v4.app.h r1 = r11.v
            r1.s = r3
        L_0x00ee:
            r11.G = r3
            r11.G = r5
            boolean r1 = r11.G
            if (r1 != 0) goto L_0x0111
            android.support.v4.app.o r0 = new android.support.v4.app.o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onCreate()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0111:
            if (r0 == 0) goto L_0x012c
            java.lang.String r1 = "android:support:fragments"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            if (r0 == 0) goto L_0x012c
            android.support.v4.app.h r1 = r11.v
            if (r1 != 0) goto L_0x0122
            r11.g()
        L_0x0122:
            android.support.v4.app.h r1 = r11.v
            r1.a((android.os.Parcelable) r0, (java.util.ArrayList<android.support.v4.app.d>) r7)
            android.support.v4.app.h r0 = r11.v
            r0.d()
        L_0x012c:
            r11.D = r3
            boolean r0 = r11.p
            if (r0 == 0) goto L_0x0161
            android.os.Bundle r0 = r11.e
            r11.c()
            android.os.Bundle r0 = r11.e
            android.view.View r0 = r11.h()
            r11.J = r0
            android.view.View r0 = r11.J
            if (r0 == 0) goto L_0x01cb
            android.view.View r0 = r11.J
            r11.K = r0
            android.view.View r0 = r11.J
            android.view.ViewGroup r0 = android.support.v4.app.m.a(r0)
            r11.J = r0
            boolean r0 = r11.A
            if (r0 == 0) goto L_0x015a
            android.view.View r0 = r11.J
            r1 = 8
            r0.setVisibility(r1)
        L_0x015a:
            android.view.View r0 = r11.J
            android.os.Bundle r0 = r11.e
            android.support.v4.app.d.e()
        L_0x0161:
            if (r12 <= r5) goto L_0x02a6
            boolean r0 = a
            if (r0 == 0) goto L_0x017b
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto ACTIVITY_CREATED: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x017b:
            boolean r0 = r11.p
            if (r0 != 0) goto L_0x0235
            int r0 = r11.y
            if (r0 == 0) goto L_0x0551
            android.support.v4.app.f r0 = r10.p
            int r1 = r11.y
            android.view.View r0 = r0.a(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x01f2
            boolean r1 = r11.r
            if (r1 != 0) goto L_0x01f2
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "No view found for id 0x"
            r2.<init>(r4)
            int r4 = r11.y
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = " ("
            java.lang.StringBuilder r2 = r2.append(r4)
            android.support.v4.app.e r4 = r11.u
            if (r4 != 0) goto L_0x01ce
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " not attached to Activity"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01cb:
            r11.K = r7
            goto L_0x0161
        L_0x01ce:
            android.support.v4.app.e r4 = r11.u
            android.content.res.Resources r4 = r4.getResources()
            int r8 = r11.y
            java.lang.String r4 = r4.getResourceName(r8)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = ") for fragment "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r10.a((java.lang.RuntimeException) r1)
        L_0x01f2:
            r11.I = r0
            android.os.Bundle r1 = r11.e
            r11.c()
            android.os.Bundle r1 = r11.e
            android.view.View r1 = r11.h()
            r11.J = r1
            android.view.View r1 = r11.J
            if (r1 == 0) goto L_0x0262
            android.view.View r1 = r11.J
            r11.K = r1
            android.view.View r1 = r11.J
            android.view.ViewGroup r1 = android.support.v4.app.m.a(r1)
            r11.J = r1
            if (r0 == 0) goto L_0x0223
            android.view.animation.Animation r1 = r10.a((android.support.v4.app.d) r11, (int) r13, (boolean) r5, (int) r14)
            if (r1 == 0) goto L_0x021e
            android.view.View r2 = r11.J
            r2.startAnimation(r1)
        L_0x021e:
            android.view.View r1 = r11.J
            r0.addView(r1)
        L_0x0223:
            boolean r0 = r11.A
            if (r0 == 0) goto L_0x022e
            android.view.View r0 = r11.J
            r1 = 8
            r0.setVisibility(r1)
        L_0x022e:
            android.view.View r0 = r11.J
            android.os.Bundle r0 = r11.e
            android.support.v4.app.d.e()
        L_0x0235:
            android.os.Bundle r0 = r11.e
            android.support.v4.app.h r0 = r11.v
            if (r0 == 0) goto L_0x023f
            android.support.v4.app.h r0 = r11.v
            r0.s = r3
        L_0x023f:
            r11.G = r3
            r11.G = r5
            boolean r0 = r11.G
            if (r0 != 0) goto L_0x0265
            android.support.v4.app.o r0 = new android.support.v4.app.o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onActivityCreated()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0262:
            r11.K = r7
            goto L_0x0235
        L_0x0265:
            android.support.v4.app.h r0 = r11.v
            if (r0 == 0) goto L_0x026e
            android.support.v4.app.h r0 = r11.v
            r0.e()
        L_0x026e:
            android.view.View r0 = r11.J
            if (r0 == 0) goto L_0x02a4
            android.os.Bundle r0 = r11.e
            android.util.SparseArray<android.os.Parcelable> r0 = r11.f
            if (r0 == 0) goto L_0x0281
            android.view.View r0 = r11.K
            android.util.SparseArray<android.os.Parcelable> r1 = r11.f
            r0.restoreHierarchyState(r1)
            r11.f = r7
        L_0x0281:
            r11.G = r3
            r11.G = r5
            boolean r0 = r11.G
            if (r0 != 0) goto L_0x02a4
            android.support.v4.app.o r0 = new android.support.v4.app.o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onViewStateRestored()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02a4:
            r11.e = r7
        L_0x02a6:
            if (r12 <= r6) goto L_0x02c3
            boolean r0 = a
            if (r0 == 0) goto L_0x02c0
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto STARTED: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x02c0:
            r11.i()
        L_0x02c3:
            if (r12 <= r9) goto L_0x0045
            boolean r0 = a
            if (r0 == 0) goto L_0x02dd
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto RESUMED: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x02dd:
            r11.o = r5
            android.support.v4.app.h r0 = r11.v
            if (r0 == 0) goto L_0x02ec
            android.support.v4.app.h r0 = r11.v
            r0.s = r3
            android.support.v4.app.h r0 = r11.v
            r0.a()
        L_0x02ec:
            r11.G = r3
            r11.G = r5
            boolean r0 = r11.G
            if (r0 != 0) goto L_0x030f
            android.support.v4.app.o r0 = new android.support.v4.app.o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onResume()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x030f:
            android.support.v4.app.h r0 = r11.v
            if (r0 == 0) goto L_0x031d
            android.support.v4.app.h r0 = r11.v
            r0.g()
            android.support.v4.app.h r0 = r11.v
            r0.a()
        L_0x031d:
            r11.e = r7
            r11.f = r7
            goto L_0x0045
        L_0x0323:
            int r0 = r11.b
            if (r0 <= r12) goto L_0x0045
            int r0 = r11.b
            switch(r0) {
                case 1: goto L_0x032e;
                case 2: goto L_0x03f4;
                case 3: goto L_0x03d7;
                case 4: goto L_0x0391;
                case 5: goto L_0x0348;
                default: goto L_0x032c;
            }
        L_0x032c:
            goto L_0x0045
        L_0x032e:
            if (r12 > 0) goto L_0x0045
            boolean r0 = r10.t
            if (r0 == 0) goto L_0x033f
            android.view.View r0 = r11.c
            if (r0 == 0) goto L_0x033f
            android.view.View r0 = r11.c
            r11.c = r7
            r0.clearAnimation()
        L_0x033f:
            android.view.View r0 = r11.c
            if (r0 == 0) goto L_0x048f
            r11.d = r12
            r12 = r5
            goto L_0x0045
        L_0x0348:
            r0 = 5
            if (r12 >= r0) goto L_0x0391
            boolean r0 = a
            if (r0 == 0) goto L_0x0363
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom RESUMED: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0363:
            android.support.v4.app.h r0 = r11.v
            if (r0 == 0) goto L_0x036c
            android.support.v4.app.h r0 = r11.v
            r0.a((int) r9)
        L_0x036c:
            r11.G = r3
            r11.G = r5
            boolean r0 = r11.G
            if (r0 != 0) goto L_0x038f
            android.support.v4.app.o r0 = new android.support.v4.app.o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onPause()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x038f:
            r11.o = r3
        L_0x0391:
            if (r12 >= r9) goto L_0x03d7
            boolean r0 = a
            if (r0 == 0) goto L_0x03ab
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom STARTED: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x03ab:
            android.support.v4.app.h r0 = r11.v
            if (r0 == 0) goto L_0x03b4
            android.support.v4.app.h r0 = r11.v
            r0.h()
        L_0x03b4:
            r11.G = r3
            r11.G = r5
            boolean r0 = r11.G
            if (r0 != 0) goto L_0x03d7
            android.support.v4.app.o r0 = new android.support.v4.app.o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onStop()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x03d7:
            if (r12 >= r6) goto L_0x03f4
            boolean r0 = a
            if (r0 == 0) goto L_0x03f1
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom STOPPED: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x03f1:
            r11.j()
        L_0x03f4:
            r0 = 2
            if (r12 >= r0) goto L_0x032e
            boolean r0 = a
            if (r0 == 0) goto L_0x040f
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom ACTIVITY_CREATED: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x040f:
            android.view.View r0 = r11.J
            if (r0 == 0) goto L_0x0422
            android.support.v4.app.e r0 = r10.o
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0422
            android.util.SparseArray<android.os.Parcelable> r0 = r11.f
            if (r0 != 0) goto L_0x0422
            r10.b((android.support.v4.app.d) r11)
        L_0x0422:
            android.support.v4.app.h r0 = r11.v
            if (r0 == 0) goto L_0x042b
            android.support.v4.app.h r0 = r11.v
            r0.a((int) r5)
        L_0x042b:
            r11.G = r3
            r11.G = r5
            boolean r0 = r11.G
            if (r0 != 0) goto L_0x044e
            android.support.v4.app.o r0 = new android.support.v4.app.o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onDestroyView()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x044e:
            android.support.v4.app.l r0 = r11.N
            if (r0 == 0) goto L_0x0457
            android.support.v4.app.l r0 = r11.N
            r0.e()
        L_0x0457:
            android.view.View r0 = r11.J
            if (r0 == 0) goto L_0x0487
            android.view.ViewGroup r0 = r11.I
            if (r0 == 0) goto L_0x0487
            int r0 = r10.n
            if (r0 <= 0) goto L_0x054e
            boolean r0 = r10.t
            if (r0 != 0) goto L_0x054e
            android.view.animation.Animation r0 = r10.a((android.support.v4.app.d) r11, (int) r13, (boolean) r3, (int) r14)
        L_0x046b:
            if (r0 == 0) goto L_0x0480
            android.view.View r1 = r11.J
            r11.c = r1
            r11.d = r12
            android.support.v4.app.h$2 r1 = new android.support.v4.app.h$2
            r1.<init>(r11)
            r0.setAnimationListener(r1)
            android.view.View r1 = r11.J
            r1.startAnimation(r0)
        L_0x0480:
            android.view.ViewGroup r0 = r11.I
            android.view.View r1 = r11.J
            r0.removeView(r1)
        L_0x0487:
            r11.I = r7
            r11.J = r7
            r11.K = r7
            goto L_0x032e
        L_0x048f:
            boolean r0 = a
            if (r0 == 0) goto L_0x04a7
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom CREATED: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x04a7:
            boolean r0 = r11.D
            if (r0 != 0) goto L_0x04ae
            r11.k()
        L_0x04ae:
            r11.G = r3
            r11.G = r5
            boolean r0 = r11.G
            if (r0 != 0) goto L_0x04d1
            android.support.v4.app.o r0 = new android.support.v4.app.o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onDetach()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x04d1:
            if (r15 != 0) goto L_0x0045
            boolean r0 = r11.D
            if (r0 != 0) goto L_0x0544
            int r0 = r11.g
            if (r0 < 0) goto L_0x0045
            boolean r0 = a
            if (r0 == 0) goto L_0x04f3
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Freeing fragment index "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x04f3:
            java.util.ArrayList<android.support.v4.app.d> r0 = r10.f
            int r1 = r11.g
            r0.set(r1, r7)
            java.util.ArrayList<java.lang.Integer> r0 = r10.h
            if (r0 != 0) goto L_0x0505
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.h = r0
        L_0x0505:
            java.util.ArrayList<java.lang.Integer> r0 = r10.h
            int r1 = r11.g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            android.support.v4.app.e r0 = r10.o
            java.lang.String r1 = r11.h
            r0.a((java.lang.String) r1)
            r0 = -1
            r11.g = r0
            r11.h = r7
            r11.m = r3
            r11.n = r3
            r11.o = r3
            r11.p = r3
            r11.q = r3
            r11.r = r3
            r11.s = r3
            r11.t = r7
            r11.v = r7
            r11.u = r7
            r11.x = r3
            r11.y = r3
            r11.z = r7
            r11.A = r3
            r11.B = r3
            r11.D = r3
            r11.N = r7
            r11.O = r3
            r11.P = r3
            goto L_0x0045
        L_0x0544:
            r11.u = r7
            r11.w = r7
            r11.t = r7
            r11.v = r7
            goto L_0x0045
        L_0x054e:
            r0 = r7
            goto L_0x046b
        L_0x0551:
            r0 = r7
            goto L_0x01f2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.h.a(android.support.v4.app.d, int, int, int, boolean):void");
    }

    private void a(d dVar) {
        a(dVar, this.n, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        a(i2, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, int i4, boolean z2) {
        if (this.o == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        } else if (z2 || this.n != i2) {
            this.n = i2;
            if (this.f != null) {
                int i5 = 0;
                boolean z3 = false;
                while (i5 < this.f.size()) {
                    d dVar = this.f.get(i5);
                    if (dVar != null) {
                        a(dVar, i2, i3, i4, false);
                        if (dVar.N != null) {
                            z3 |= dVar.N.a();
                        }
                    }
                    i5++;
                    z3 = z3;
                }
                if (!z3) {
                    k();
                }
                if (this.r && this.o != null && this.n == 5) {
                    e eVar = this.o;
                    if (Build.VERSION.SDK_INT >= 11) {
                        b.a(eVar);
                    } else {
                        eVar.i = true;
                    }
                    this.r = false;
                }
            }
        }
    }

    private void k() {
        if (this.f != null) {
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                d dVar = this.f.get(i2);
                if (dVar != null && dVar.L) {
                    if (this.e) {
                        this.v = true;
                    } else {
                        dVar.L = false;
                        a(dVar, this.n, 0, 0, false);
                    }
                }
            }
        }
    }

    public final void a(d dVar, boolean z2) {
        if (this.g == null) {
            this.g = new ArrayList<>();
        }
        if (a) {
            Log.v("FragmentManager", "add: " + dVar);
        }
        if (dVar.g < 0) {
            if (this.h == null || this.h.size() <= 0) {
                if (this.f == null) {
                    this.f = new ArrayList<>();
                }
                dVar.a(this.f.size(), this.q);
                this.f.add(dVar);
            } else {
                dVar.a(this.h.remove(this.h.size() - 1).intValue(), this.q);
                this.f.set(dVar.g, dVar);
            }
            if (a) {
                Log.v("FragmentManager", "Allocated fragment index " + dVar);
            }
        }
        if (dVar.B) {
            return;
        }
        if (this.g.contains(dVar)) {
            throw new IllegalStateException("Fragment already added: " + dVar);
        }
        this.g.add(dVar);
        dVar.m = true;
        dVar.n = false;
        if (dVar.E && dVar.F) {
            this.r = true;
        }
        if (z2) {
            a(dVar);
        }
    }

    public final void a(d dVar, int i2, int i3) {
        boolean z2;
        int i4;
        if (a) {
            Log.v("FragmentManager", "remove: " + dVar + " nesting=" + dVar.s);
        }
        if (dVar.s > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = !z2;
        if (!dVar.B || z3) {
            if (this.g != null) {
                this.g.remove(dVar);
            }
            if (dVar.E && dVar.F) {
                this.r = true;
            }
            dVar.m = false;
            dVar.n = true;
            if (z3) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            a(dVar, i4, i2, i3, false);
        }
    }

    public final void b(d dVar, int i2, int i3) {
        if (a) {
            Log.v("FragmentManager", "hide: " + dVar);
        }
        if (!dVar.A) {
            dVar.A = true;
            if (dVar.J != null) {
                Animation a2 = a(dVar, i2, false, i3);
                if (a2 != null) {
                    dVar.J.startAnimation(a2);
                }
                dVar.J.setVisibility(8);
            }
            if (dVar.m && dVar.E && dVar.F) {
                this.r = true;
            }
            d.a();
        }
    }

    public final void c(d dVar, int i2, int i3) {
        if (a) {
            Log.v("FragmentManager", "show: " + dVar);
        }
        if (dVar.A) {
            dVar.A = false;
            if (dVar.J != null) {
                Animation a2 = a(dVar, i2, true, i3);
                if (a2 != null) {
                    dVar.J.startAnimation(a2);
                }
                dVar.J.setVisibility(0);
            }
            if (dVar.m && dVar.E && dVar.F) {
                this.r = true;
            }
            d.a();
        }
    }

    public final void d(d dVar, int i2, int i3) {
        if (a) {
            Log.v("FragmentManager", "detach: " + dVar);
        }
        if (!dVar.B) {
            dVar.B = true;
            if (dVar.m) {
                if (this.g != null) {
                    if (a) {
                        Log.v("FragmentManager", "remove from detach: " + dVar);
                    }
                    this.g.remove(dVar);
                }
                if (dVar.E && dVar.F) {
                    this.r = true;
                }
                dVar.m = false;
                a(dVar, 1, i2, i3, false);
            }
        }
    }

    public final void e(d dVar, int i2, int i3) {
        if (a) {
            Log.v("FragmentManager", "attach: " + dVar);
        }
        if (dVar.B) {
            dVar.B = false;
            if (!dVar.m) {
                if (this.g == null) {
                    this.g = new ArrayList<>();
                }
                if (this.g.contains(dVar)) {
                    throw new IllegalStateException("Fragment already added: " + dVar);
                }
                if (a) {
                    Log.v("FragmentManager", "add from attach: " + dVar);
                }
                this.g.add(dVar);
                dVar.m = true;
                if (dVar.E && dVar.F) {
                    this.r = true;
                }
                a(dVar, this.n, i2, i3, false);
            }
        }
    }

    private d c(int i2) {
        if (this.g != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                d dVar = this.g.get(size);
                if (dVar != null && dVar.x == i2) {
                    return dVar;
                }
            }
        }
        if (this.f != null) {
            for (int size2 = this.f.size() - 1; size2 >= 0; size2--) {
                d dVar2 = this.f.get(size2);
                if (dVar2 != null && dVar2.x == i2) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    private void a(int i2, c cVar) {
        synchronized (this) {
            if (this.k == null) {
                this.k = new ArrayList<>();
            }
            int size = this.k.size();
            if (i2 < size) {
                if (a) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + cVar);
                }
                this.k.set(i2, cVar);
            } else {
                while (size < i2) {
                    this.k.add((Object) null);
                    if (this.l == null) {
                        this.l = new ArrayList<>();
                    }
                    if (a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.l.add(Integer.valueOf(size));
                    size++;
                }
                if (a) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + cVar);
                }
                this.k.add(cVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0083, code lost:
        r6.e = true;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r1 >= r3) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        r6.d[r1].run();
        r6.d[r1] = null;
        r1 = r1 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r6 = this;
            r0 = 1
            r2 = 0
            boolean r1 = r6.e
            if (r1 == 0) goto L_0x000e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Recursive entry to executePendingTransactions"
            r0.<init>(r1)
            throw r0
        L_0x000e:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.support.v4.app.e r3 = r6.o
            android.os.Handler r3 = r3.a
            android.os.Looper r3 = r3.getLooper()
            if (r1 == r3) goto L_0x0024
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must be called from main thread of process"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            r1 = r2
        L_0x0025:
            monitor-enter(r6)
            java.util.ArrayList<java.lang.Runnable> r3 = r6.c     // Catch:{ all -> 0x0097 }
            if (r3 == 0) goto L_0x0032
            java.util.ArrayList<java.lang.Runnable> r3 = r6.c     // Catch:{ all -> 0x0097 }
            int r3 = r3.size()     // Catch:{ all -> 0x0097 }
            if (r3 != 0) goto L_0x005a
        L_0x0032:
            monitor-exit(r6)     // Catch:{ all -> 0x0097 }
            boolean r0 = r6.v
            if (r0 == 0) goto L_0x00a5
            r3 = r2
            r4 = r2
        L_0x0039:
            java.util.ArrayList<android.support.v4.app.d> r0 = r6.f
            int r0 = r0.size()
            if (r3 >= r0) goto L_0x009e
            java.util.ArrayList<android.support.v4.app.d> r0 = r6.f
            java.lang.Object r0 = r0.get(r3)
            android.support.v4.app.d r0 = (android.support.v4.app.d) r0
            if (r0 == 0) goto L_0x0056
            android.support.v4.app.l r5 = r0.N
            if (r5 == 0) goto L_0x0056
            android.support.v4.app.l r0 = r0.N
            boolean r0 = r0.a()
            r4 = r4 | r0
        L_0x0056:
            int r0 = r3 + 1
            r3 = r0
            goto L_0x0039
        L_0x005a:
            java.util.ArrayList<java.lang.Runnable> r1 = r6.c     // Catch:{ all -> 0x0097 }
            int r3 = r1.size()     // Catch:{ all -> 0x0097 }
            java.lang.Runnable[] r1 = r6.d     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0069
            java.lang.Runnable[] r1 = r6.d     // Catch:{ all -> 0x0097 }
            int r1 = r1.length     // Catch:{ all -> 0x0097 }
            if (r1 >= r3) goto L_0x006d
        L_0x0069:
            java.lang.Runnable[] r1 = new java.lang.Runnable[r3]     // Catch:{ all -> 0x0097 }
            r6.d = r1     // Catch:{ all -> 0x0097 }
        L_0x006d:
            java.util.ArrayList<java.lang.Runnable> r1 = r6.c     // Catch:{ all -> 0x0097 }
            java.lang.Runnable[] r4 = r6.d     // Catch:{ all -> 0x0097 }
            r1.toArray(r4)     // Catch:{ all -> 0x0097 }
            java.util.ArrayList<java.lang.Runnable> r1 = r6.c     // Catch:{ all -> 0x0097 }
            r1.clear()     // Catch:{ all -> 0x0097 }
            android.support.v4.app.e r1 = r6.o     // Catch:{ all -> 0x0097 }
            android.os.Handler r1 = r1.a     // Catch:{ all -> 0x0097 }
            java.lang.Runnable r4 = r6.y     // Catch:{ all -> 0x0097 }
            r1.removeCallbacks(r4)     // Catch:{ all -> 0x0097 }
            monitor-exit(r6)     // Catch:{ all -> 0x0097 }
            r6.e = r0
            r1 = r2
        L_0x0086:
            if (r1 >= r3) goto L_0x009a
            java.lang.Runnable[] r4 = r6.d
            r4 = r4[r1]
            r4.run()
            java.lang.Runnable[] r4 = r6.d
            r5 = 0
            r4[r1] = r5
            int r1 = r1 + 1
            goto L_0x0086
        L_0x0097:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0097 }
            throw r0
        L_0x009a:
            r6.e = r2
            r1 = r0
            goto L_0x0025
        L_0x009e:
            if (r4 != 0) goto L_0x00a5
            r6.v = r2
            r6.k()
        L_0x00a5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.h.a():boolean");
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.m != null) {
            for (int i2 = 0; i2 < this.m.size(); i2++) {
                this.m.get(i2);
            }
        }
    }

    private void b(d dVar) {
        if (dVar.K != null) {
            if (this.x == null) {
                this.x = new SparseArray<>();
            } else {
                this.x.clear();
            }
            dVar.K.saveHierarchyState(this.x);
            if (this.x.size() > 0) {
                dVar.f = this.x;
                this.x = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Parcelable c() {
        int[] iArr;
        int size;
        int size2;
        boolean z2;
        Bundle bundle;
        BackStackState[] backStackStateArr = null;
        a();
        if (b) {
            this.s = true;
        }
        if (this.f == null || this.f.size() <= 0) {
            return null;
        }
        int size3 = this.f.size();
        FragmentState[] fragmentStateArr = new FragmentState[size3];
        int i2 = 0;
        boolean z3 = false;
        while (i2 < size3) {
            d dVar = this.f.get(i2);
            if (dVar != null) {
                if (dVar.g < 0) {
                    a((RuntimeException) new IllegalStateException("Failure saving state: active " + dVar + " has cleared index: " + dVar.g));
                }
                FragmentState fragmentState = new FragmentState(dVar);
                fragmentStateArr[i2] = fragmentState;
                if (dVar.b <= 0 || fragmentState.j != null) {
                    fragmentState.j = dVar.e;
                } else {
                    if (this.w == null) {
                        this.w = new Bundle();
                    }
                    dVar.a(this.w);
                    if (!this.w.isEmpty()) {
                        bundle = this.w;
                        this.w = null;
                    } else {
                        bundle = null;
                    }
                    if (dVar.J != null) {
                        b(dVar);
                    }
                    if (dVar.f != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", dVar.f);
                    }
                    if (!dVar.M) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBoolean("android:user_visible_hint", dVar.M);
                    }
                    fragmentState.j = bundle;
                    if (dVar.j != null) {
                        if (dVar.j.g < 0) {
                            a((RuntimeException) new IllegalStateException("Failure saving state: " + dVar + " has target not in fragment manager: " + dVar.j));
                        }
                        if (fragmentState.j == null) {
                            fragmentState.j = new Bundle();
                        }
                        Bundle bundle2 = fragmentState.j;
                        d dVar2 = dVar.j;
                        if (dVar2.g < 0) {
                            a((RuntimeException) new IllegalStateException("Fragment " + dVar2 + " is not currently in the FragmentManager"));
                        }
                        bundle2.putInt("android:target_state", dVar2.g);
                        if (dVar.l != 0) {
                            fragmentState.j.putInt("android:target_req_state", dVar.l);
                        }
                    }
                }
                if (a) {
                    Log.v("FragmentManager", "Saved state of " + dVar + ": " + fragmentState.j);
                }
                z2 = true;
            } else {
                z2 = z3;
            }
            i2++;
            z3 = z2;
        }
        if (z3) {
            if (this.g == null || (size2 = this.g.size()) <= 0) {
                iArr = null;
            } else {
                iArr = new int[size2];
                for (int i3 = 0; i3 < size2; i3++) {
                    iArr[i3] = this.g.get(i3).g;
                    if (iArr[i3] < 0) {
                        a((RuntimeException) new IllegalStateException("Failure saving state: active " + this.g.get(i3) + " has cleared index: " + iArr[i3]));
                    }
                    if (a) {
                        Log.v("FragmentManager", "saveAllState: adding fragment #" + i3 + ": " + this.g.get(i3));
                    }
                }
            }
            if (this.i != null && (size = this.i.size()) > 0) {
                backStackStateArr = new BackStackState[size];
                for (int i4 = 0; i4 < size; i4++) {
                    backStackStateArr[i4] = new BackStackState(this.i.get(i4));
                    if (a) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.i.get(i4));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.a = fragmentStateArr;
            fragmentManagerState.b = iArr;
            fragmentManagerState.c = backStackStateArr;
            return fragmentManagerState;
        } else if (!a) {
            return null;
        } else {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Parcelable parcelable, ArrayList<d> arrayList) {
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.a != null) {
                if (arrayList != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        d dVar = arrayList.get(i2);
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + dVar);
                        }
                        FragmentState fragmentState = fragmentManagerState.a[dVar.g];
                        fragmentState.k = dVar;
                        dVar.f = null;
                        dVar.s = 0;
                        dVar.q = false;
                        dVar.m = false;
                        dVar.j = null;
                        if (fragmentState.j != null) {
                            fragmentState.j.setClassLoader(this.o.getClassLoader());
                            dVar.f = fragmentState.j.getSparseParcelableArray("android:view_state");
                            dVar.e = fragmentState.j;
                        }
                    }
                }
                this.f = new ArrayList<>(fragmentManagerState.a.length);
                if (this.h != null) {
                    this.h.clear();
                }
                for (int i3 = 0; i3 < fragmentManagerState.a.length; i3++) {
                    FragmentState fragmentState2 = fragmentManagerState.a[i3];
                    if (fragmentState2 != null) {
                        e eVar = this.o;
                        d dVar2 = this.q;
                        if (fragmentState2.k == null) {
                            if (fragmentState2.i != null) {
                                fragmentState2.i.setClassLoader(eVar.getClassLoader());
                            }
                            fragmentState2.k = d.a(eVar, fragmentState2.a, fragmentState2.i);
                            if (fragmentState2.j != null) {
                                fragmentState2.j.setClassLoader(eVar.getClassLoader());
                                fragmentState2.k.e = fragmentState2.j;
                            }
                            fragmentState2.k.a(fragmentState2.b, dVar2);
                            fragmentState2.k.p = fragmentState2.c;
                            fragmentState2.k.r = true;
                            fragmentState2.k.x = fragmentState2.d;
                            fragmentState2.k.y = fragmentState2.e;
                            fragmentState2.k.z = fragmentState2.f;
                            fragmentState2.k.C = fragmentState2.g;
                            fragmentState2.k.B = fragmentState2.h;
                            fragmentState2.k.t = eVar.b;
                            if (a) {
                                Log.v("FragmentManager", "Instantiated fragment " + fragmentState2.k);
                            }
                        }
                        d dVar3 = fragmentState2.k;
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i3 + ": " + dVar3);
                        }
                        this.f.add(dVar3);
                        fragmentState2.k = null;
                    } else {
                        this.f.add((Object) null);
                        if (this.h == null) {
                            this.h = new ArrayList<>();
                        }
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: avail #" + i3);
                        }
                        this.h.add(Integer.valueOf(i3));
                    }
                }
                if (arrayList != null) {
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        d dVar4 = arrayList.get(i4);
                        if (dVar4.k >= 0) {
                            if (dVar4.k < this.f.size()) {
                                dVar4.j = this.f.get(dVar4.k);
                            } else {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + dVar4 + " target no longer exists: " + dVar4.k);
                                dVar4.j = null;
                            }
                        }
                    }
                }
                if (fragmentManagerState.b != null) {
                    this.g = new ArrayList<>(fragmentManagerState.b.length);
                    for (int i5 = 0; i5 < fragmentManagerState.b.length; i5++) {
                        d dVar5 = this.f.get(fragmentManagerState.b[i5]);
                        if (dVar5 == null) {
                            a((RuntimeException) new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.b[i5]));
                        }
                        dVar5.m = true;
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: added #" + i5 + ": " + dVar5);
                        }
                        if (this.g.contains(dVar5)) {
                            throw new IllegalStateException("Already added!");
                        }
                        this.g.add(dVar5);
                    }
                } else {
                    this.g = null;
                }
                if (fragmentManagerState.c != null) {
                    this.i = new ArrayList<>(fragmentManagerState.c.length);
                    for (int i6 = 0; i6 < fragmentManagerState.c.length; i6++) {
                        c a2 = fragmentManagerState.c[i6].a(this);
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i6 + " (index " + a2.o + "): " + a2);
                            a2.a("  ", new PrintWriter(new d("FragmentManager")), false);
                        }
                        this.i.add(a2);
                        if (a2.o >= 0) {
                            a(a2.o, a2);
                        }
                    }
                    return;
                }
                this.i = null;
            }
        }
    }

    public final void a(e eVar, f fVar, d dVar) {
        if (this.o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.o = eVar;
        this.p = fVar;
        this.q = dVar;
    }

    public final void d() {
        this.s = false;
        a(1);
    }

    public final void e() {
        this.s = false;
        a(2);
    }

    public final void f() {
        this.s = false;
        a(4);
    }

    public final void g() {
        this.s = false;
        a(5);
    }

    public final void h() {
        this.s = true;
        a(3);
    }

    public final void i() {
        this.t = true;
        a();
        a(0);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public final void a(Configuration configuration) {
        if (this.g != null) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < this.g.size()) {
                    d dVar = this.g.get(i3);
                    if (dVar != null) {
                        dVar.onConfigurationChanged(configuration);
                        if (dVar.v != null) {
                            dVar.v.a(configuration);
                        }
                    }
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void j() {
        if (this.g != null) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < this.g.size()) {
                    d dVar = this.g.get(i3);
                    if (dVar != null) {
                        dVar.onLowMemory();
                        if (dVar.v != null) {
                            dVar.v.j();
                        }
                    }
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean a(Menu menu, MenuInflater menuInflater) {
        boolean z2;
        boolean z3;
        boolean z4;
        ArrayList<d> arrayList = null;
        if (this.g != null) {
            int i2 = 0;
            z2 = false;
            while (i2 < this.g.size()) {
                d dVar = this.g.get(i2);
                if (dVar != null) {
                    if (!dVar.A) {
                        if (!dVar.E || !dVar.F) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (dVar.v != null) {
                            z4 |= dVar.v.a(menu, menuInflater);
                        }
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(dVar);
                        z3 = true;
                        i2++;
                        z2 = z3;
                    }
                }
                z3 = z2;
                i2++;
                z2 = z3;
            }
        } else {
            z2 = false;
        }
        if (this.j != null) {
            for (int i3 = 0; i3 < this.j.size(); i3++) {
                d dVar2 = this.j.get(i3);
                if (arrayList == null || !arrayList.contains(dVar2)) {
                    d.f();
                }
            }
        }
        this.j = arrayList;
        return z2;
    }

    public final boolean a(Menu menu) {
        boolean z2;
        if (this.g == null) {
            return false;
        }
        boolean z3 = false;
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            d dVar = this.g.get(i2);
            if (dVar != null) {
                if (!dVar.A) {
                    if (!dVar.E || !dVar.F) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (dVar.v != null) {
                        z2 |= dVar.v.a(menu);
                    }
                } else {
                    z2 = false;
                }
                if (z2) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    public final boolean a(MenuItem menuItem) {
        boolean z2;
        if (this.g == null) {
            return false;
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            d dVar = this.g.get(i2);
            if (dVar != null) {
                if (dVar.A || dVar.v == null || !dVar.v.a(menuItem)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(MenuItem menuItem) {
        boolean z2;
        if (this.g == null) {
            return false;
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            d dVar = this.g.get(i2);
            if (dVar != null) {
                if (dVar.A || dVar.v == null || !dVar.v.b(menuItem)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(Menu menu) {
        if (this.g != null) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < this.g.size()) {
                    d dVar = this.g.get(i3);
                    if (!(dVar == null || dVar.A || dVar.v == null)) {
                        dVar.v.b(menu);
                    }
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public static int b(int i2) {
        switch (i2) {
            case 4097:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return 4097;
            default:
                return 0;
        }
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        String str2;
        d dVar;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a);
        if (attributeValue == null) {
            str2 = obtainStyledAttributes.getString(0);
        } else {
            str2 = attributeValue;
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!d.b(this.o, str2)) {
            return null;
        }
        d c2 = resourceId != -1 ? c(resourceId) : null;
        if (c2 == null && string != null) {
            if (this.g != null && string != null) {
                int size = this.g.size() - 1;
                while (true) {
                    if (size >= 0) {
                        c2 = this.g.get(size);
                        if (c2 != null && string.equals(c2.z)) {
                            break;
                        }
                        size--;
                    } else {
                        break;
                    }
                }
            }
            if (this.f != null && string != null) {
                int size2 = this.f.size() - 1;
                while (true) {
                    if (size2 >= 0) {
                        c2 = this.f.get(size2);
                        if (c2 != null && string.equals(c2.z)) {
                            break;
                        }
                        size2--;
                    } else {
                        break;
                    }
                }
            }
            c2 = null;
        }
        if (c2 == null) {
            c2 = c(0);
        }
        if (a) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + c2);
        }
        if (c2 == null) {
            dVar = d.a(context, str2);
            dVar.p = true;
            dVar.x = resourceId != 0 ? resourceId : 0;
            dVar.y = 0;
            dVar.z = string;
            dVar.q = true;
            dVar.t = this;
            Bundle bundle = dVar.e;
            dVar.G = true;
            a(dVar, true);
        } else if (c2.q) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(0) + " with another fragment for " + str2);
        } else {
            c2.q = true;
            if (!c2.D) {
                Bundle bundle2 = c2.e;
                c2.G = true;
            }
            dVar = c2;
        }
        if (this.n > 0 || !dVar.p) {
            a(dVar);
        } else {
            a(dVar, 1, 0, 0, false);
        }
        if (dVar.J == null) {
            throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
        }
        if (resourceId != 0) {
            dVar.J.setId(resourceId);
        }
        if (dVar.J.getTag() == null) {
            dVar.J.setTag(string);
        }
        return dVar.J;
    }
}
