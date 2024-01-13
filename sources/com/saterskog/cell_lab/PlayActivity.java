package com.saterskog.cell_lab;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.a.a.d;
import android.support.v4.app.e;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.saterskog.cell_lab.i;
import com.saterskog.cell_lab.o;
import com.saterskog.cell_lab.p;
import com.saterskog.cell_lab.t;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.StreamCorruptedException;

public class PlayActivity extends e implements ActionBar.TabListener, View.OnClickListener, i.b, o.a, p.a, t.a {
    int A;
    int[] B = new int[12];
    int[] C = new int[27];
    File D;
    boolean E = false;
    private int[] F = new int[h.values().length];
    /* access modifiers changed from: private */
    public Environment G = new Environment();
    private int H;
    /* access modifiers changed from: private */
    public int I;
    private ImageButton J = null;
    private long K = -1;
    private Uri L;
    private ImageButton M;
    /* access modifiers changed from: private */
    public ImageButton N;
    /* access modifiers changed from: private */
    public String O;
    a n;
    boolean o;
    boolean p;
    int q;
    int r;
    int s;
    String t;
    CustomViewPager u = null;
    CellWorld v;
    boolean w;
    boolean x;
    SoundPool y;
    MediaPlayer z;

    static /* synthetic */ void g(PlayActivity playActivity) {
        if (playActivity.q == -1) {
            playActivity.a(playActivity.b());
            o oVar = (o) playActivity.b(0);
            if (oVar != null) {
                oVar.a.a(playActivity.G);
                oVar.a();
            }
        }
        final InputStream b = playActivity.b();
        final p pVar = (p) playActivity.b(1);
        playActivity.a(0);
        pVar.a.queueEvent(new Runnable() {
            public final void run() {
                pVar.a.a.a(b, -1);
            }
        });
    }

    public void onPause() {
        if (!(this.q == -1 || this.K == -1)) {
            j.a((Context) this, this.q, this.K);
        }
        if (this.z != null) {
            this.z.pause();
            this.A = this.z.getCurrentPosition();
        }
        super.onPause();
    }

    public void onResume() {
        if (this.q != -1) {
            this.K = com.saterskog.b.a.c();
        }
        if (this.z != null && PreferenceManager.getDefaultSharedPreferences(this).getBoolean("music", true)) {
            this.z.seekTo(this.A);
            this.z.start();
        }
        super.onResume();
    }

    public void onDestroy() {
        if (this.y != null) {
            this.y.release();
            this.y = null;
        }
        if (this.z != null) {
            this.z.release();
            this.z = null;
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x04e3  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x051b  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0549  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0597  */
    /* JADX WARNING: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02ad A[LOOP:4: B:63:0x02ab->B:64:0x02ad, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0320  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r12 = 0
            r8 = 3
            r10 = -1
            r2 = 1
            r1 = 0
            super.onCreate(r15)
            com.saterskog.cell_lab.CellLabApplication.a(r14)
            android.content.SharedPreferences r6 = android.preference.PreferenceManager.getDefaultSharedPreferences(r14)
            java.lang.String r0 = "keep_on"
            boolean r0 = r6.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x0021
            android.view.Window r0 = r14.getWindow()
            r3 = 128(0x80, float:1.794E-43)
            r0.addFlags(r3)
        L_0x0021:
            android.view.Window r0 = r14.getWindow()
            r3 = 1024(0x400, float:1.435E-42)
            r0.addFlags(r3)
            java.lang.String r0 = "sound_effects"
            boolean r0 = r6.getBoolean(r0, r2)
            r14.w = r0
            boolean r0 = r14.w
            if (r0 == 0) goto L_0x00f8
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r0 < r3) goto L_0x019b
            android.media.SoundPool$Builder r0 = new android.media.SoundPool$Builder
            r0.<init>()
            android.media.SoundPool$Builder r0 = r0.setMaxStreams(r8)
            android.media.SoundPool r0 = r0.build()
            r14.y = r0
        L_0x004b:
            boolean r0 = r14.w
            if (r0 == 0) goto L_0x00f8
            int[] r0 = r14.B
            r3 = 8
            android.media.SoundPool r4 = r14.y
            r5 = 2131558446(0x7f0d002e, float:1.8742208E38)
            int r4 = r4.load(r14, r5, r2)
            r0[r3] = r4
            int[] r0 = r14.B
            r3 = 2
            android.media.SoundPool r4 = r14.y
            r5 = 2131558415(0x7f0d000f, float:1.8742145E38)
            int r4 = r4.load(r14, r5, r2)
            r0[r3] = r4
            int[] r0 = r14.B
            android.media.SoundPool r3 = r14.y
            r4 = 2131558424(0x7f0d0018, float:1.8742163E38)
            int r3 = r3.load(r14, r4, r2)
            r0[r2] = r3
            int[] r0 = r14.B
            android.media.SoundPool r3 = r14.y
            r4 = 2131558453(0x7f0d0035, float:1.8742222E38)
            int r3 = r3.load(r14, r4, r2)
            r0[r1] = r3
            int[] r0 = r14.B
            android.media.SoundPool r3 = r14.y
            r4 = 2131558444(0x7f0d002c, float:1.8742204E38)
            int r3 = r3.load(r14, r4, r2)
            r0[r8] = r3
            int[] r0 = r14.B
            r3 = 4
            android.media.SoundPool r4 = r14.y
            r5 = 2131558463(0x7f0d003f, float:1.8742243E38)
            int r4 = r4.load(r14, r5, r2)
            r0[r3] = r4
            int[] r0 = r14.B
            r3 = 5
            android.media.SoundPool r4 = r14.y
            r5 = 2131558458(0x7f0d003a, float:1.8742232E38)
            int r4 = r4.load(r14, r5, r2)
            r0[r3] = r4
            int[] r0 = r14.B
            r3 = 6
            android.media.SoundPool r4 = r14.y
            r5 = 2131558408(0x7f0d0008, float:1.874213E38)
            int r4 = r4.load(r14, r5, r2)
            r0[r3] = r4
            int[] r0 = r14.B
            r3 = 7
            android.media.SoundPool r4 = r14.y
            r5 = 2131558445(0x7f0d002d, float:1.8742206E38)
            int r4 = r4.load(r14, r5, r2)
            r0[r3] = r4
            int[] r0 = r14.B
            r3 = 9
            android.media.SoundPool r4 = r14.y
            r5 = 2131558408(0x7f0d0008, float:1.874213E38)
            int r4 = r4.load(r14, r5, r2)
            r0[r3] = r4
            int[] r0 = r14.B
            r3 = 10
            android.media.SoundPool r4 = r14.y
            r5 = 2131558448(0x7f0d0030, float:1.8742212E38)
            int r4 = r4.load(r14, r5, r2)
            r0[r3] = r4
            int[] r0 = r14.B
            r3 = 11
            android.media.SoundPool r4 = r14.y
            r5 = 2131558409(0x7f0d0009, float:1.8742133E38)
            int r4 = r4.load(r14, r5, r2)
            r0[r3] = r4
        L_0x00f8:
            java.lang.String r0 = "log_stats"
            java.lang.String r3 = "none"
            java.lang.String r0 = r6.getString(r0, r3)
            java.lang.String r3 = "none"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x01af
            if (r15 == 0) goto L_0x0114
            java.lang.String r0 = "logFile"
            java.io.Serializable r0 = r15.getSerializable(r0)
            java.io.File r0 = (java.io.File) r0
            r14.D = r0
        L_0x0114:
            java.io.File r0 = r14.D
            if (r0 != 0) goto L_0x01af
            r0 = 0
            java.io.File r3 = r14.getExternalFilesDir(r0)
            if (r3 == 0) goto L_0x0125
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x012b
        L_0x0125:
            boolean r0 = r3.mkdirs()
            if (r0 == 0) goto L_0x02c1
        L_0x012b:
            r0 = r1
        L_0x012c:
            int r0 = r0 + 1
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.String r7 = java.io.File.separator
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r7 = "stats"
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r7 = ".csv"
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            r14.D = r4
            java.io.File r4 = r14.D
            boolean r4 = r4.exists()
            if (r4 != 0) goto L_0x012c
            java.lang.String r0 = "time, food mass, number of cell splits, number of cell deaths, "
            r3 = r0
            r0 = r1
        L_0x0164:
            if (r0 >= r8) goto L_0x01ac
            r4 = r1
        L_0x0167:
            if (r4 >= r8) goto L_0x01a9
            r5 = r3
            r3 = r1
        L_0x016b:
            if (r3 >= r8) goto L_0x01a4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r7 = ", r"
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r7 = "g"
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.String r7 = "b"
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.String r5 = r5.toString()
            int r3 = r3 + 1
            goto L_0x016b
        L_0x019b:
            android.media.SoundPool r0 = new android.media.SoundPool
            r0.<init>(r8, r8, r1)
            r14.y = r0
            goto L_0x004b
        L_0x01a4:
            int r3 = r4 + 1
            r4 = r3
            r3 = r5
            goto L_0x0167
        L_0x01a9:
            int r0 = r0 + 1
            goto L_0x0164
        L_0x01ac:
            r14.c((java.lang.String) r3)
        L_0x01af:
            r0 = 2131361820(0x7f0a001c, float:1.8343403E38)
            r14.setContentView(r0)
            if (r15 == 0) goto L_0x02d1
            java.lang.String r0 = "ienv"
            android.os.Parcelable r0 = r15.getParcelable(r0)
            com.saterskog.cell_lab.Environment r0 = (com.saterskog.cell_lab.Environment) r0
            r14.G = r0
            java.lang.String r0 = "mUri"
            android.os.Parcelable r0 = r15.getParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            r14.L = r0
            java.lang.String r0 = "challenge"
            int r0 = r15.getInt(r0)
            r14.q = r0
            java.lang.String r0 = "tutorial"
            int r0 = r15.getInt(r0)
            r14.r = r0
            java.lang.String r0 = "plateName"
            java.lang.String r0 = r15.getString(r0)
            r14.O = r0
            java.lang.String r0 = "name"
            java.lang.String r0 = r15.getString(r0)
            r14.t = r0
            java.lang.String r0 = "loadChallenge"
            int r0 = r15.getInt(r0)
            r14.s = r0
            java.lang.String r0 = "old"
            boolean r0 = r15.getBoolean(r0)
            r14.o = r0
            java.lang.String r0 = "external"
            boolean r0 = r15.getBoolean(r0)
            r14.p = r0
        L_0x0203:
            android.app.ActionBar r3 = r14.getActionBar()
            java.lang.String r0 = r14.O
            if (r0 != 0) goto L_0x04d4
            r0 = 2131624075(0x7f0e008b, float:1.887532E38)
            java.lang.String r0 = r14.getString(r0)
        L_0x0212:
            r3.setTitle(r0)
            android.app.ActionBar r0 = r14.getActionBar()
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            android.content.res.Resources r5 = r14.getResources()
            r7 = 17170445(0x106000d, float:2.461195E-38)
            int r5 = r5.getColor(r7)
            r4.<init>(r5)
            r0.setIcon(r4)
            java.lang.String r0 = "music"
            boolean r0 = r6.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x0267
            int r0 = r14.q
            if (r0 != r10) goto L_0x04d8
            r0 = 2131558416(0x7f0d0010, float:1.8742147E38)
            android.media.MediaPlayer r0 = android.media.MediaPlayer.create(r14, r0)
            r14.z = r0
        L_0x0241:
            android.media.MediaPlayer r0 = r14.z
            r0.setLooping(r2)
            android.media.MediaPlayer r0 = r14.z
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1056964608(0x3f000000, float:0.5)
            r0.setVolume(r4, r5)
            if (r15 == 0) goto L_0x0262
            java.lang.String r0 = "song_pos"
            int r0 = r15.getInt(r0, r10)
            if (r0 == r10) goto L_0x0262
            r14.A = r0
            android.media.MediaPlayer r0 = r14.z
            int r4 = r14.A
            r0.seekTo(r4)
        L_0x0262:
            android.media.MediaPlayer r0 = r14.z
            r0.start()
        L_0x0267:
            java.lang.String r0 = "slow_motion"
            boolean r0 = r6.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x04e3
            int r0 = r14.q
            if (r0 != r10) goto L_0x04e3
            r0 = r2
        L_0x0274:
            r14.x = r0
            com.saterskog.cell_lab.PlayActivity$a r0 = new com.saterskog.cell_lab.PlayActivity$a
            android.app.FragmentManager r4 = r14.getFragmentManager()
            r0.<init>(r4)
            r14.n = r0
            r0 = 2131230813(0x7f08005d, float:1.807769E38)
            android.view.View r0 = r14.findViewById(r0)
            com.saterskog.cell_lab.CustomViewPager r0 = (com.saterskog.cell_lab.CustomViewPager) r0
            r14.u = r0
            com.saterskog.cell_lab.CustomViewPager r0 = r14.u
            com.saterskog.cell_lab.PlayActivity$a r4 = r14.n
            r0.setAdapter(r4)
            r0 = 2
            r3.setNavigationMode(r0)
            r3.setDisplayShowTitleEnabled(r2)
            android.content.res.Resources r2 = r14.getResources()
            int r0 = r14.q
            if (r0 != r10) goto L_0x04e6
            r0 = 2130837516(0x7f02000c, float:1.7279988E38)
        L_0x02a5:
            java.lang.String[] r2 = r2.getStringArray(r0)
            int r4 = r2.length
            r0 = r1
        L_0x02ab:
            if (r0 >= r4) goto L_0x04eb
            r5 = r2[r0]
            android.app.ActionBar$Tab r6 = r3.newTab()
            android.app.ActionBar$Tab r5 = r6.setText(r5)
            android.app.ActionBar$Tab r5 = r5.setTabListener(r14)
            r3.addTab(r5)
            int r0 = r0 + 1
            goto L_0x02ab
        L_0x02c1:
            java.lang.String r0 = "couldn't create cell_lab folder"
            com.saterskog.b.a.a((java.lang.String) r0)
            java.lang.String r0 = "Couldn't create log file"
            android.widget.Toast r0 = android.widget.Toast.makeText(r14, r0, r2)
            r0.show()
            goto L_0x01af
        L_0x02d1:
            android.content.Intent r4 = r14.getIntent()
            android.net.Uri r5 = r4.getData()
            if (r5 != 0) goto L_0x03ef
            java.lang.String r0 = "name"
            java.lang.String r0 = r4.getStringExtra(r0)
            r14.t = r0
            java.lang.String r0 = "old"
            int r0 = r4.getIntExtra(r0, r1)
            if (r0 == 0) goto L_0x03da
            r0 = r2
        L_0x02ec:
            r14.o = r0
            java.lang.String r0 = "experimentOnChallenge"
            int r0 = r4.getIntExtra(r0, r1)
            if (r0 == 0) goto L_0x03dd
            r0 = r2
        L_0x02f7:
            java.lang.String r3 = "challenge"
            int r3 = r4.getIntExtra(r3, r10)
            r14.q = r3
            int r3 = r14.q
            if (r3 == r10) goto L_0x03e0
            java.lang.String[] r3 = com.saterskog.cell_lab.j.b(r14)
            int r5 = r14.q
            r3 = r3[r5]
            r14.O = r3
            r14.o = r2
            r3 = 0
            r14.t = r3
        L_0x0312:
            r14.p = r1
        L_0x0314:
            int r3 = r14.q
            r14.s = r3
            if (r0 == 0) goto L_0x031c
            r14.q = r10
        L_0x031c:
            boolean r0 = r14.o
            if (r0 != 0) goto L_0x04cb
            java.lang.String r0 = "aha"
            com.saterskog.b.a.b((java.lang.String) r0)
            java.lang.String r0 = "preloadedCW"
            android.os.Parcelable r0 = r4.getParcelableExtra(r0)
            com.saterskog.cell_lab.CellWorld r0 = (com.saterskog.cell_lab.CellWorld) r0
            r14.v = r0
            com.saterskog.cell_lab.Environment r0 = r14.G
            r8 = 4633641066610819072(0x404e000000000000, double:60.0)
            r0.g = r8
            com.saterskog.cell_lab.Environment r0 = r14.G
            r8 = 4622100592565682175(0x4024ffffffffffff, double:10.499999999999998)
            r0.a = r8
            com.saterskog.cell_lab.Environment r0 = r14.G
            r8 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            r0.b = r8
            com.saterskog.cell_lab.Environment r0 = r14.G
            r0.p = r12
            com.saterskog.cell_lab.Environment r0 = r14.G
            r8 = 4584304132692975288(0x3f9eb851eb851eb8, double:0.03)
            r0.q = r8
            com.saterskog.cell_lab.Environment r0 = r14.G
            r0.f = r12
            com.saterskog.cell_lab.Environment r0 = r14.G
            r0.c = r12
            com.saterskog.cell_lab.Environment r0 = r14.G
            r3 = 1050253722(0x3e99999a, float:0.3)
            r0.n = r3
            com.saterskog.cell_lab.Environment r0 = r14.G
            r0.h = r12
            com.saterskog.cell_lab.Environment r0 = r14.G
            r0.i = r12
            com.saterskog.cell_lab.Environment r0 = r14.G
            r0.j = r12
            com.saterskog.cell_lab.Environment r0 = r14.G
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0.z = r8
            com.saterskog.cell_lab.Environment r0 = r14.G
            r0.w = r1
            com.saterskog.cell_lab.Environment r0 = r14.G
            r0.x = r1
            com.saterskog.cell_lab.Environment r0 = r14.G
            r0.u = r1
            com.saterskog.cell_lab.Environment r0 = r14.G
            r0.v = r2
            com.saterskog.cell_lab.Environment r0 = r14.G
            java.lang.String r3 = "maxCells"
            r5 = 1000(0x3e8, float:1.401E-42)
            int r3 = r4.getIntExtra(r3, r5)
            r0.r = r3
            com.saterskog.cell_lab.Environment r0 = r14.G
            java.lang.String r3 = "maxFoods"
            r5 = 3500(0xdac, float:4.905E-42)
            int r3 = r4.getIntExtra(r3, r5)
            r0.s = r3
            com.saterskog.cell_lab.Environment r0 = r14.G
            java.lang.String r3 = "radius"
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4.getDoubleExtra(r3, r8)
            r0.k = r4
            int r0 = r14.q
            boolean[] r5 = com.saterskog.cell_lab.j.i(r0, r14)
            r0 = r1
            r3 = r1
        L_0x03ae:
            com.saterskog.cell_lab.h[] r4 = com.saterskog.cell_lab.h.B
            int r4 = r4.length
            if (r3 >= r4) goto L_0x04bb
            com.saterskog.cell_lab.Environment r4 = r14.G
            boolean[] r7 = r4.t
            boolean r4 = r5[r3]
            if (r4 == 0) goto L_0x04b8
            com.saterskog.cell_lab.h r4 = com.saterskog.cell_lab.h.PHAGOCYTE
            int r4 = r4.ordinal()
            if (r3 == r4) goto L_0x03cb
            com.saterskog.cell_lab.h r4 = com.saterskog.cell_lab.h.FLAGELLOCYTE
            int r4 = r4.ordinal()
            if (r3 != r4) goto L_0x04b8
        L_0x03cb:
            r4 = r2
        L_0x03cc:
            r7[r3] = r4
            com.saterskog.cell_lab.Environment r4 = r14.G
            boolean[] r4 = r4.t
            boolean r4 = r4[r3]
            if (r4 == 0) goto L_0x03d7
            r0 = r2
        L_0x03d7:
            int r3 = r3 + 1
            goto L_0x03ae
        L_0x03da:
            r0 = r1
            goto L_0x02ec
        L_0x03dd:
            r0 = r1
            goto L_0x02f7
        L_0x03e0:
            boolean r3 = r14.o
            if (r3 == 0) goto L_0x03ea
            java.lang.String r3 = r14.t
            r14.O = r3
            goto L_0x0312
        L_0x03ea:
            r3 = 0
            r14.O = r3
            goto L_0x0312
        L_0x03ef:
            r14.q = r10
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "scheme: "
            r0.<init>(r3)
            java.lang.String r3 = r4.getScheme()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.saterskog.b.a.b((java.lang.String) r0)
            java.lang.String r0 = r5.getPath()
            r14.t = r0
            android.content.ContentResolver r0 = r14.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0494, IOException -> 0x049b }
            java.io.InputStream r0 = r0.openInputStream(r5)     // Catch:{ FileNotFoundException -> 0x0494, IOException -> 0x049b }
            if (r0 == 0) goto L_0x0607
            r3 = r2
        L_0x0418:
            r0.close()     // Catch:{ FileNotFoundException -> 0x0604, IOException -> 0x0601 }
            r0 = r3
        L_0x041c:
            if (r0 == 0) goto L_0x046d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "exists: "
            r3.<init>(r7)
            java.lang.String r7 = r14.t
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.saterskog.b.a.b((java.lang.String) r3)
            r14.L = r5
            java.lang.String r3 = r14.t
            java.lang.String r5 = r14.t
            java.lang.String r7 = "/"
            int r5 = r5.lastIndexOf(r7)
            int r5 = r5 + 1
            java.lang.String r3 = r3.substring(r5)
            r14.O = r3
            java.lang.String r3 = r14.O
            int r3 = r3.length()
            r5 = 10
            if (r3 <= r5) goto L_0x04a3
            java.lang.String r3 = r14.O
            java.lang.String r5 = r14.O
            int r5 = r5.length()
            int r5 = r5 + -10
            java.lang.String r7 = r14.O
            int r7 = r7.length()
            java.lang.String r3 = r3.substring(r5, r7)
            java.lang.String r5 = ".substrate"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x04a3
            r0 = r1
        L_0x046d:
            if (r0 != 0) goto L_0x0491
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "doesn't exists: "
            r0.<init>(r3)
            java.lang.String r3 = r14.t
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.saterskog.b.a.b((java.lang.String) r0)
            r0 = 0
            r14.L = r0
            r0 = 0
            r14.O = r0
            java.lang.String r0 = ""
            r14.t = r0
            r14.o = r1
            r14.p = r1
        L_0x0491:
            r0 = r1
            goto L_0x0314
        L_0x0494:
            r0 = move-exception
            r3 = r1
        L_0x0496:
            r0.printStackTrace()
            r0 = r3
            goto L_0x041c
        L_0x049b:
            r0 = move-exception
            r3 = r1
        L_0x049d:
            r0.printStackTrace()
            r0 = r3
            goto L_0x041c
        L_0x04a3:
            java.lang.String r3 = r14.O
            java.lang.String r5 = r14.O
            int r5 = r5.length()
            int r5 = r5 + -10
            java.lang.String r3 = r3.substring(r1, r5)
            r14.O = r3
            r14.o = r2
            r14.p = r2
            goto L_0x046d
        L_0x04b8:
            r4 = r1
            goto L_0x03cc
        L_0x04bb:
            if (r0 != 0) goto L_0x0203
            com.saterskog.cell_lab.Environment r0 = r14.G
            boolean[] r0 = r0.t
            com.saterskog.cell_lab.h r3 = com.saterskog.cell_lab.h.PHOTOCYTE
            int r3 = r3.ordinal()
            r0[r3] = r2
            goto L_0x0203
        L_0x04cb:
            java.io.InputStream r0 = r14.b()
            r14.a((java.io.InputStream) r0)
            goto L_0x0203
        L_0x04d4:
            java.lang.String r0 = r14.O
            goto L_0x0212
        L_0x04d8:
            r0 = 2131558412(0x7f0d000c, float:1.874214E38)
            android.media.MediaPlayer r0 = android.media.MediaPlayer.create(r14, r0)
            r14.z = r0
            goto L_0x0241
        L_0x04e3:
            r0 = r1
            goto L_0x0274
        L_0x04e6:
            r0 = 2130837509(0x7f020005, float:1.7279974E38)
            goto L_0x02a5
        L_0x04eb:
            com.saterskog.cell_lab.CustomViewPager r0 = r14.u
            com.saterskog.cell_lab.PlayActivity$1 r2 = new com.saterskog.cell_lab.PlayActivity$1
            r2.<init>()
            r0.setOnPageChangeListener(r2)
            if (r15 == 0) goto L_0x0549
            java.lang.String r0 = "tab"
            int r0 = r15.getInt(r0, r1)
            r3.setSelectedNavigationItem(r0)
            java.lang.String r0 = "modeSpinner"
            int r0 = r15.getInt(r0, r1)
            r14.H = r0
            java.lang.String r0 = "toolSpinner"
            int r0 = r15.getInt(r0, r1)
            r14.I = r0
            com.saterskog.cell_lab.t.a((com.saterskog.cell_lab.PlayActivity) r14, (com.saterskog.cell_lab.t.a) r14, (android.os.Bundle) r15)
        L_0x0513:
            int r1 = r3.getSelectedNavigationIndex()
            int r0 = r14.q
            if (r0 != r10) goto L_0x0597
            switch(r1) {
                case 0: goto L_0x0585;
                case 1: goto L_0x058b;
                case 2: goto L_0x0591;
                default: goto L_0x051e;
            }
        L_0x051e:
            int r0 = r14.q
            if (r0 == r10) goto L_0x0548
            int r0 = r14.q
            long r0 = com.saterskog.cell_lab.j.b((android.content.Context) r14, (int) r0)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0548
            long r4 = com.saterskog.b.a.b((android.content.Context) r14)
            java.lang.String r1 = "start:installTime"
            java.util.ArrayList<com.saterskog.cell_lab.j$a> r0 = com.saterskog.cell_lab.j.a
            int r2 = r14.q
            java.lang.Object r0 = r0.get(r2)
            com.saterskog.cell_lab.j$a r0 = (com.saterskog.cell_lab.j.a) r0
            java.lang.String r2 = r0.b
            java.lang.String r3 = com.saterskog.b.a.a((long) r4)
            r6 = r14
            com.saterskog.b.a.a(r1, r2, r3, r4, r6)
        L_0x0548:
            return
        L_0x0549:
            r14.H = r1
            int r0 = r14.q
            if (r0 == r10) goto L_0x057b
            java.util.ArrayList r0 = com.saterskog.cell_lab.j.a((android.content.Context) r14)
            int r2 = r14.q
            java.lang.Object r0 = r0.get(r2)
            com.saterskog.cell_lab.j$a r0 = (com.saterskog.cell_lab.j.a) r0
            int r0 = r0.i
            r14.r = r0
        L_0x055f:
            int r0 = r14.r
            if (r0 == r10) goto L_0x057e
            int r0 = r14.r
            com.saterskog.cell_lab.t.a((com.saterskog.cell_lab.PlayActivity) r14, (int) r0, (com.saterskog.cell_lab.t.a) r14)
            com.saterskog.cell_lab.t.a((android.app.Activity) r14)
        L_0x056b:
            int r0 = r14.q
            boolean[] r0 = com.saterskog.cell_lab.j.a((int) r0)
        L_0x0571:
            r2 = 5
            if (r1 >= r2) goto L_0x0513
            boolean r2 = r0[r1]
            if (r2 == 0) goto L_0x0582
            r14.I = r1
            goto L_0x0513
        L_0x057b:
            r14.r = r10
            goto L_0x055f
        L_0x057e:
            com.saterskog.cell_lab.t.a()
            goto L_0x056b
        L_0x0582:
            int r1 = r1 + 1
            goto L_0x0571
        L_0x0585:
            java.lang.String r0 = "experiment/sample_info"
            com.saterskog.b.a.a((java.lang.String) r0, (android.app.Activity) r14)
            goto L_0x051e
        L_0x058b:
            java.lang.String r0 = "experiment/microscope"
            com.saterskog.b.a.a((java.lang.String) r0, (android.app.Activity) r14)
            goto L_0x051e
        L_0x0591:
            java.lang.String r0 = "experiment/genome_editor"
            com.saterskog.b.a.a((java.lang.String) r0, (android.app.Activity) r14)
            goto L_0x051e
        L_0x0597:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "level:"
            r2.<init>(r0)
            java.util.ArrayList r0 = com.saterskog.cell_lab.j.a((android.content.Context) r14)
            int r3 = r14.q
            java.lang.Object r0 = r0.get(r3)
            com.saterskog.cell_lab.j$a r0 = (com.saterskog.cell_lab.j.a) r0
            java.lang.String r0 = r0.b
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            switch(r1) {
                case 0: goto L_0x05b9;
                case 1: goto L_0x05d1;
                case 2: goto L_0x05e9;
                default: goto L_0x05b7;
            }
        L_0x05b7:
            goto L_0x051e
        L_0x05b9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "/objective"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.saterskog.b.a.a((java.lang.String) r0, (android.app.Activity) r14)
            goto L_0x051e
        L_0x05d1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "/microscope"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.saterskog.b.a.a((java.lang.String) r0, (android.app.Activity) r14)
            goto L_0x051e
        L_0x05e9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "/genome_editor"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.saterskog.b.a.a((java.lang.String) r0, (android.app.Activity) r14)
            goto L_0x051e
        L_0x0601:
            r0 = move-exception
            goto L_0x049d
        L_0x0604:
            r0 = move-exception
            goto L_0x0496
        L_0x0607:
            r3 = r1
            goto L_0x0418
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saterskog.cell_lab.PlayActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: package-private */
    public final InputStream b() {
        BufferedInputStream bufferedInputStream;
        com.saterskog.b.a.b("old: " + this.o);
        com.saterskog.b.a.b("external: " + this.p);
        com.saterskog.b.a.b("mUri: " + this.L);
        com.saterskog.b.a.b("loadChallenge: " + this.s);
        com.saterskog.b.a.b("name: " + this.t);
        if (!this.o) {
            return null;
        }
        if (this.p) {
            try {
                bufferedInputStream = new BufferedInputStream(getContentResolver().openInputStream(this.L));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                bufferedInputStream = null;
            }
        } else if (this.s == -1) {
            try {
                bufferedInputStream = new BufferedInputStream(openFileInput(f.a(this.t)));
            } catch (FileNotFoundException e2) {
                throw new RuntimeException("file not found");
            }
        } else {
            try {
                bufferedInputStream = new BufferedInputStream(getAssets().open(j.h(this.s, this)));
            } catch (StreamCorruptedException e3) {
                e3.printStackTrace();
                bufferedInputStream = null;
            } catch (IOException e4) {
                throw new RuntimeException("io41");
            }
        }
        return bufferedInputStream;
    }

    private void a(InputStream inputStream) {
        boolean z2;
        boolean z3;
        if (inputStream != null) {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                try {
                    if (objectInputStream.readInt() > 3054) {
                        Toast.makeText(this, getString(C0028R.string.toast_file_is_newer_version), 1).show();
                        try {
                            objectInputStream.close();
                            com.saterskog.b.a.a("tried Opening file from newer version");
                            setResult(-1);
                            finish();
                        } catch (IOException e) {
                            throw new RuntimeException("io38");
                        }
                    } else {
                        try {
                            objectInputStream.readDouble();
                            try {
                                objectInputStream.readInt();
                                try {
                                    this.G.a(objectInputStream);
                                    boolean[] i = j.i(-1, this);
                                    int i2 = 0;
                                    boolean z4 = false;
                                    while (i2 < h.B.length) {
                                        boolean[] zArr = this.G.t;
                                        if (!this.G.t[i2] || !i[i2]) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        zArr[i2] = z2;
                                        if (z4 || this.G.t[i2]) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        i2++;
                                        z4 = z3;
                                    }
                                    if (!z4) {
                                        this.G.t[h.PHOTOCYTE.ordinal()] = true;
                                    }
                                    try {
                                        objectInputStream.close();
                                    } catch (IOException e2) {
                                        throw new RuntimeException("io34");
                                    }
                                } catch (IOException e3) {
                                    throw new RuntimeException("io35");
                                }
                            } catch (IOException e4) {
                                throw new RuntimeException("io36");
                            }
                        } catch (IOException e5) {
                            throw new RuntimeException("io37");
                        }
                    }
                } catch (IOException e6) {
                    throw new RuntimeException("io40");
                }
            } catch (IOException e7) {
                throw new RuntimeException("can't load env 1");
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("tab", getActionBar().getSelectedNavigationIndex());
        bundle.putInt("modeSpinner", this.H);
        bundle.putInt("toolSpinner", this.I);
        bundle.putInt("challenge", this.q);
        bundle.putInt("tutorial", this.r);
        bundle.putInt("loadChallenge", this.s);
        bundle.putBoolean("old", this.o);
        bundle.putBoolean("external", this.p);
        bundle.putString("plateName", this.O);
        bundle.putString("name", this.t);
        bundle.putParcelable("ienv", this.G);
        bundle.putParcelable("mUri", this.L);
        if (this.z != null) {
            bundle.putInt("song_pos", this.z.getCurrentPosition());
        }
        if (this.D != null) {
            bundle.putSerializable("logFile", this.D);
        }
        t.a(bundle);
    }

    public final Environment c() {
        return this.G;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        if (this.q == -1) {
            menuInflater.inflate(C0028R.menu.mode_chooser, menu);
        } else if (this.r == -1) {
            menuInflater.inflate(C0028R.menu.play_mode_chooser, menu);
        } else {
            menuInflater.inflate(C0028R.menu.tut_mode_chooser, menu);
            ((Button) menu.findItem(C0028R.id.lab_top_buttons_item).getActionView().findViewById(C0028R.id.show_help_button_id)).setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    t.a((Activity) PlayActivity.this);
                }
            });
        }
        this.M = (ImageButton) menu.findItem(C0028R.id.lab_top_buttons_item).getActionView().findViewById(C0028R.id.temp_button_id);
        this.N = (ImageButton) menu.findItem(C0028R.id.lab_top_buttons_item).getActionView().findViewById(C0028R.id.tool_button_id);
        this.M.setOnClickListener(this);
        if (this.H == 0) {
            this.M.setImageResource(C0028R.drawable.temp_low);
        }
        if (this.H == 1) {
            this.M.setImageResource(C0028R.drawable.temp_medium);
        }
        if (this.H == 2) {
            this.M.setImageResource(C0028R.drawable.temp_high);
        }
        if (this.H == 3) {
            this.M.setImageResource(C0028R.drawable.temp_slow);
        }
        if (this.N != null) {
            this.N.setOnClickListener(this);
            if (this.I == 0) {
                this.N.setImageResource(C0028R.drawable.tool_cell);
            }
            if (this.I == 1) {
                this.N.setImageResource(C0028R.drawable.tool_move);
            }
            if (this.I == 2) {
                this.N.setImageResource(C0028R.drawable.tool_add);
            }
            if (this.I == 3) {
                this.N.setImageResource(C0028R.drawable.tool_remove);
            }
            if (this.I == 4) {
                this.N.setImageResource(C0028R.drawable.tool_info);
            }
        }
        View findViewById = menu.findItem(C0028R.id.lab_top_buttons_item).getActionView().findViewById(C0028R.id.reset_button_id);
        if (findViewById == null) {
            com.saterskog.b.a.a("wefwef222");
        }
        this.J = (ImageButton) findViewById;
        this.J.setOnClickListener(this);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                i();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    public void onBackPressed() {
        i();
    }

    private void i() {
        a(11);
        if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean("ask_discard_sample", true)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(getString(C0028R.string.dialog_discard_title));
            builder.setMessage(getString(C0028R.string.dialog_discard_text));
            builder.setPositiveButton(getString(C0028R.string.dialog_button_discard), new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PlayActivity.this.j();
                }
            });
            builder.setNegativeButton(getString(C0028R.string.dialog_button_cancel), new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            AlertDialog create = builder.create();
            create.show();
            View findViewById = create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", (String) null, (String) null));
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(C0028R.color.border));
                return;
            }
            return;
        }
        j();
    }

    /* access modifiers changed from: private */
    public void j() {
        if (this.q == -1 || j.b(this.q, (Context) this)) {
            if (!this.E || this.q < j.a("26.6", (Context) this)) {
                finish();
                return;
            }
            b.a(this, getString(C0028R.string.donate_reminder_title), getString(C0028R.string.donate_reminder), "donation_appeal", new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent();
                    intent.putExtra("go_to_donate", 1);
                    PlayActivity.this.setResult(-1, intent);
                }
            }, new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PlayActivity.this.finish();
                }
            });
        } else if (j.b((Context) this, this.q) + (com.saterskog.b.a.c() - this.K) > 600000) {
            b.a(this, getString(C0028R.string.popup_title_need_help), getString(C0028R.string.popup_text_need_help) + getString(C0028R.string.forum_link) + "<br><br>" + getString(C0028R.string.videos_link), "need_help", (DialogInterface.OnClickListener) null, new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PlayActivity.this.finish();
                }
            });
        } else {
            finish();
        }
    }

    public final void d() {
        a(5);
    }

    public final boolean a(int i) {
        switch (i) {
            case 0:
                this.M.setImageResource(C0028R.drawable.temp_low);
                this.H = 0;
                a(11);
                break;
            case 1:
                this.M.setImageResource(C0028R.drawable.temp_medium);
                this.H = 1;
                a(11);
                break;
            case 2:
                this.M.setImageResource(C0028R.drawable.temp_high);
                this.H = 2;
                a(11);
                break;
            case 3:
                this.M.setImageResource(C0028R.drawable.temp_slow);
                this.H = 3;
                a(11);
                break;
        }
        final int i2 = this.H;
        final p pVar = (p) b(1);
        if (i2 == 1) {
            t.a(this, 0, 4, 3000);
        }
        if (i2 == 2) {
            t.a(this, 0, 5, 2000);
        }
        if (pVar != null) {
            pVar.a.queueEvent(new Runnable() {
                public final void run() {
                    pVar.a.a.O = i2;
                }
            });
        }
        return true;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (Build.VERSION.SDK_INT < 18 && menuItem.getTitleCondensed() != null) {
            menuItem.setTitleCondensed(menuItem.getTitleCondensed().toString());
        }
        return super.onMenuItemSelected(i, menuItem);
    }

    public class a extends d {
        public a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: boolean} */
        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v1, types: [int] */
        /* JADX WARNING: type inference failed for: r0v14 */
        /* JADX WARNING: type inference failed for: r0v20 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.app.Fragment a(int r6) {
            /*
                r5 = this;
                r0 = 0
                r3 = -1
                switch(r6) {
                    case 0: goto L_0x000c;
                    case 1: goto L_0x0024;
                    case 2: goto L_0x006c;
                    default: goto L_0x0005;
                }
            L_0x0005:
                java.lang.String r0 = "skit:navigated past end"
                com.saterskog.b.a.a((java.lang.String) r0)
                r0 = 0
            L_0x000b:
                return r0
            L_0x000c:
                com.saterskog.cell_lab.PlayActivity r0 = com.saterskog.cell_lab.PlayActivity.this
                int r0 = r0.q
                if (r0 != r3) goto L_0x0018
                com.saterskog.cell_lab.o r0 = new com.saterskog.cell_lab.o
                r0.<init>()
                goto L_0x000b
            L_0x0018:
                com.saterskog.cell_lab.m r0 = new com.saterskog.cell_lab.m
                r0.<init>()
                com.saterskog.cell_lab.PlayActivity r1 = com.saterskog.cell_lab.PlayActivity.this
                int r1 = r1.q
                r0.b = r1
                goto L_0x000b
            L_0x0024:
                com.saterskog.cell_lab.p r1 = new com.saterskog.cell_lab.p
                r1.<init>()
                com.saterskog.cell_lab.PlayActivity r2 = com.saterskog.cell_lab.PlayActivity.this
                java.io.InputStream r2 = r2.b()
                r1.j = r2
                com.saterskog.cell_lab.PlayActivity r2 = com.saterskog.cell_lab.PlayActivity.this
                boolean r2 = r2.o
                r1.h = r2
                com.saterskog.cell_lab.PlayActivity r2 = com.saterskog.cell_lab.PlayActivity.this
                java.lang.String r2 = r2.t
                r1.i = r2
                com.saterskog.cell_lab.PlayActivity r2 = com.saterskog.cell_lab.PlayActivity.this
                boolean r2 = r2.p
                r1.k = r2
                com.saterskog.cell_lab.PlayActivity r2 = com.saterskog.cell_lab.PlayActivity.this
                int r2 = r2.q
                if (r2 == r3) goto L_0x004a
                r0 = 1
            L_0x004a:
                r1.l = r0
                com.saterskog.cell_lab.PlayActivity r0 = com.saterskog.cell_lab.PlayActivity.this
                int r0 = r0.q
                r1.c = r0
                com.saterskog.cell_lab.PlayActivity r0 = com.saterskog.cell_lab.PlayActivity.this
                int r0 = r0.s
                r1.d = r0
                com.saterskog.cell_lab.PlayActivity r0 = com.saterskog.cell_lab.PlayActivity.this
                com.saterskog.cell_lab.Environment r0 = r0.G
                double r2 = r0.k
                r1.f = r2
                com.saterskog.cell_lab.PlayActivity r0 = com.saterskog.cell_lab.PlayActivity.this
                int r0 = r0.I
                r1.e = r0
                r0 = r1
                goto L_0x000b
            L_0x006c:
                com.saterskog.cell_lab.i r1 = new com.saterskog.cell_lab.i
                r1.<init>()
                com.saterskog.cell_lab.PlayActivity r2 = com.saterskog.cell_lab.PlayActivity.this
                int r2 = r2.q
                com.saterskog.cell_lab.PlayActivity r3 = com.saterskog.cell_lab.PlayActivity.this
                boolean[] r2 = com.saterskog.cell_lab.j.i(r2, r3)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.e = r3
            L_0x0082:
                com.saterskog.cell_lab.h[] r3 = com.saterskog.cell_lab.h.B
                int r3 = r3.length
                if (r0 >= r3) goto L_0x0097
                boolean r3 = r2[r0]
                if (r3 == 0) goto L_0x0094
                java.util.ArrayList<com.saterskog.cell_lab.h> r3 = r1.e
                com.saterskog.cell_lab.h[] r4 = com.saterskog.cell_lab.h.B
                r4 = r4[r0]
                r3.add(r4)
            L_0x0094:
                int r0 = r0 + 1
                goto L_0x0082
            L_0x0097:
                r0 = r1
                goto L_0x000b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.saterskog.cell_lab.PlayActivity.a.a(int):android.app.Fragment");
        }

        public final int b() {
            return 3;
        }
    }

    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        c(tab.getPosition());
    }

    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        c(tab.getPosition());
    }

    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        a(6);
    }

    private void c(int i) {
        ((ViewPager) findViewById(C0028R.id.pager)).a(i, false);
        if (i == 1) {
            t.b(this, 0, 0);
        }
        if (i == 2) {
            t.b(this, 1, 0);
        }
    }

    public final Fragment b(int i) {
        return getFragmentManager().findFragmentByTag("android:switcher:" + this.u.getId() + ":" + ((long) i));
    }

    public final void e() {
        final p pVar = (p) b(1);
        if (this.q != -1) {
            a(0);
            final int i = this.q;
            pVar.a.queueEvent(new Runnable() {
                public final void run() {
                    try {
                        pVar.a.a.a(PlayActivity.this.getAssets().open(j.h(i, PlayActivity.this)), 0);
                    } catch (StreamCorruptedException e) {
                        e.printStackTrace();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            });
        } else if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean("ask_sterilize_sample", true)) {
            a(11);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(getString(C0028R.string.dialog_sterilize_title));
            builder.setMessage(getString(C0028R.string.dialog_sterilize_text));
            builder.setPositiveButton(getString(C0028R.string.dialog_button_discard), new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    pVar.a.queueEvent(new Runnable() {
                        public final void run() {
                            pVar.a.a.P = true;
                        }
                    });
                }
            });
            builder.setNegativeButton(getString(C0028R.string.dialog_button_cancel), new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            AlertDialog create = builder.create();
            create.show();
            View findViewById = create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", (String) null, (String) null));
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(C0028R.color.border));
            }
        } else {
            pVar.a.queueEvent(new Runnable() {
                public final void run() {
                    pVar.a.a.P = true;
                }
            });
        }
        t.b(this, 0, 9);
    }

    public final Gene[] f() {
        return ((i) b(2)).a;
    }

    public final void a(final Environment environment) {
        final p pVar = (p) b(1);
        if (pVar != null && pVar.a != null) {
            pVar.a.queueEvent(new Runnable() {
                public final void run() {
                    q qVar = pVar.a.a;
                    Environment environment = environment;
                    qVar.t = true;
                    qVar.s.a(environment);
                }
            });
        }
    }

    public final void a(CellWorld cellWorld, boolean z2) {
        m mVar;
        o oVar;
        if (this.q == -1) {
            int i = cellWorld.z;
            double f = cellWorld.f();
            double d = cellWorld.M;
            if (this.u.getCurrentItem() == 0 && (oVar = (o) b(0)) != null && oVar.b != null) {
                oVar.b.post(new Runnable(i, f, d) {
                    final /* synthetic */ int a;
                    final /* synthetic */ double b;
                    final /* synthetic */ double c;

                    public final void run(
/*
Method generation error in method: com.saterskog.cell_lab.o.3.run():void, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.saterskog.cell_lab.o.3.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                });
                return;
            }
            return;
        }
        int i2 = cellWorld.z;
        int b = cellWorld.b(0);
        int b2 = cellWorld.b(3);
        int b3 = cellWorld.b(6);
        int b4 = cellWorld.b(1);
        int d2 = cellWorld.d();
        int e = cellWorld.e();
        int c = cellWorld.c();
        int i3 = cellWorld.V;
        int i4 = cellWorld.W;
        double d3 = cellWorld.N;
        double d4 = cellWorld.M;
        double d5 = 0.0d;
        for (int i5 = 0; i5 < cellWorld.B; i5++) {
            d5 += (double) cellWorld.A[i5].c;
        }
        double d6 = cellWorld.M;
        if (this.u.getCurrentItem() == 0 && (mVar = (m) b(0)) != null) {
            i iVar = (i) b(2);
            if (iVar != null) {
                int[] iArr = this.F;
                for (int i6 = 0; i6 < h.B.length; i6++) {
                    iArr[i6] = 0;
                }
                if (iVar.a != null) {
                    for (int i7 = 0; i7 < 80; i7++) {
                        int ordinal = iVar.a[i7].s.ordinal();
                        iArr[ordinal] = iArr[ordinal] + 1;
                    }
                }
            }
            int[] iArr2 = this.F;
            if (mVar.b != 0 && mVar.b != 1) {
                int i8 = mVar.b;
                mVar.d = mVar.d || z2;
                boolean z3 = mVar.d;
                boolean z4 = mVar.e;
                if (mVar.a != null) {
                    mVar.a.post(new Runnable(z3, z4, b, b2, b3, d2, e, c, b4, i2, d5, d6, i8, i3, i4, d3, d4, iArr2) {
                        final /* synthetic */ boolean a;
                        final /* synthetic */ boolean b;
                        final /* synthetic */ int c;
                        final /* synthetic */ int d;
                        final /* synthetic */ int e;
                        final /* synthetic */ int f;
                        final /* synthetic */ int g;
                        final /* synthetic */ int h;
                        final /* synthetic */ int i;
                        final /* synthetic */ int j;
                        final /* synthetic */ double k;
                        final /* synthetic */ double l;
                        final /* synthetic */ int m;
                        final /* synthetic */ int n;
                        final /* synthetic */ int o;
                        final /* synthetic */ double p;
                        final /* synthetic */ double q;
                        final /* synthetic */ int[] r;

                        public final void run(
/*
Method generation error in method: com.saterskog.cell_lab.m.3.run():void, dex: classes.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.saterskog.cell_lab.m.3.run():void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    });
                }
            }
        }
    }

    public final void a(CellWorld cellWorld) {
        if (this.D != null) {
            String str = "\n" + cellWorld.M + ", " + cellWorld.f() + ", " + cellWorld.S + ", " + cellWorld.R;
            cellWorld.S = 0;
            cellWorld.R = 0;
            for (int i = 0; i < 27; i++) {
                this.C[i] = 0;
            }
            for (int i2 = 0; i2 < cellWorld.z; i2++) {
                int i3 = (int) (cellWorld.x[i2].J[0] * 3.0f);
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= 3) {
                    i3 = 2;
                }
                int i4 = (int) (cellWorld.x[i2].J[1] * 3.0f);
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i4 >= 3) {
                    i4 = 2;
                }
                int i5 = (int) (cellWorld.x[i2].J[2] * 3.0f);
                if (i5 < 0) {
                    i5 = 0;
                }
                if (i5 >= 3) {
                    i5 = 2;
                }
                int[] iArr = this.C;
                int i6 = (i3 * 3 * 3) + (i4 * 3) + i5;
                iArr[i6] = iArr[i6] + 1;
            }
            String str2 = str;
            for (int i7 = 0; i7 < 27; i7++) {
                str2 = str2 + ", " + this.C[i7];
            }
            c(str2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026 A[SYNTHETIC, Splitter:B:15:0x0026] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0036 A[SYNTHETIC, Splitter:B:24:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0043 A[SYNTHETIC, Splitter:B:31:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:12:0x0021=Splitter:B:12:0x0021, B:21:0x0031=Splitter:B:21:0x0031} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(java.lang.String r5) {
        /*
            r4 = this;
            r2 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x001f, IOException -> 0x002f, all -> 0x003f }
            java.io.File r0 = r4.D     // Catch:{ FileNotFoundException -> 0x001f, IOException -> 0x002f, all -> 0x003f }
            r3 = 1
            r1.<init>(r0, r3)     // Catch:{ FileNotFoundException -> 0x001f, IOException -> 0x002f, all -> 0x003f }
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch:{ FileNotFoundException -> 0x0050, IOException -> 0x004e }
            byte[] r0 = r5.getBytes(r0)     // Catch:{ FileNotFoundException -> 0x0050, IOException -> 0x004e }
            r1.write(r0)     // Catch:{ FileNotFoundException -> 0x0050, IOException -> 0x004e }
            r1.close()     // Catch:{ IOException -> 0x001a }
        L_0x0019:
            return
        L_0x001a:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0019
        L_0x001f:
            r0 = move-exception
            r1 = r2
        L_0x0021:
            r0.printStackTrace()     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x0019
            r1.close()     // Catch:{ IOException -> 0x002a }
            goto L_0x0019
        L_0x002a:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0019
        L_0x002f:
            r0 = move-exception
            r1 = r2
        L_0x0031:
            r0.printStackTrace()     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x0019
            r1.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x0019
        L_0x003a:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0019
        L_0x003f:
            r0 = move-exception
            r1 = r2
        L_0x0041:
            if (r1 == 0) goto L_0x0046
            r1.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0046:
            throw r0
        L_0x0047:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0046
        L_0x004c:
            r0 = move-exception
            goto L_0x0041
        L_0x004e:
            r0 = move-exception
            goto L_0x0031
        L_0x0050:
            r0 = move-exception
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saterskog.cell_lab.PlayActivity.c(java.lang.String):void");
    }

    public void onClick(View view) {
        int i;
        final Integer[] numArr;
        if (view.getId() == C0028R.id.reset_button_id) {
            if (this.q == -1) {
                if (this.O == null) {
                    numArr = new Integer[2];
                } else {
                    numArr = new Integer[3];
                }
                for (int i2 = 0; i2 < numArr.length; i2++) {
                    numArr[i2] = new Integer(i2);
                }
                AlertDialog show = new AlertDialog.Builder(this).setAdapter(new ArrayAdapter<Integer>(this, numArr) {
                    public final View getView(int i, View view, ViewGroup viewGroup) {
                        int i2;
                        View view2 = super.getView(i, view, viewGroup);
                        TextView textView = (TextView) view2.findViewById(16908308);
                        if (i == 0) {
                            i2 = C0028R.drawable.plate_save;
                            textView.setText(PlayActivity.this.getString(C0028R.string.save_plate) + "...");
                        } else {
                            i2 = 0;
                        }
                        if (i == numArr.length - 2 && PlayActivity.this.O != null) {
                            i2 = C0028R.drawable.plate_load;
                            textView.setText(C0028R.string.substrate_action_reload);
                        }
                        if (i == numArr.length - 1) {
                            i2 = C0028R.drawable.plate_clear;
                            textView.setText(C0028R.string.substrate_action_sterilize);
                        }
                        textView.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
                        return view2;
                    }
                }, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (i == 0) {
                            PlayActivity.f(PlayActivity.this);
                        }
                        if (i == numArr.length - 2 && PlayActivity.this.O != null) {
                            if (PreferenceManager.getDefaultSharedPreferences(PlayActivity.this).getBoolean("ask_sterilize_sample", true)) {
                                PlayActivity.this.a(11);
                                AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                                builder.setTitle(C0028R.string.dialog_reload_title);
                                builder.setMessage(PlayActivity.this.getString(C0028R.string.dialog_sterilize_text));
                                builder.setPositiveButton(PlayActivity.this.getString(C0028R.string.dialog_button_discard), new DialogInterface.OnClickListener() {
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        PlayActivity.g(PlayActivity.this);
                                    }
                                });
                                builder.setNegativeButton(PlayActivity.this.getString(C0028R.string.dialog_button_cancel), new DialogInterface.OnClickListener() {
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        dialogInterface.cancel();
                                    }
                                });
                                AlertDialog create = builder.create();
                                create.show();
                                View findViewById = create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", (String) null, (String) null));
                                if (findViewById != null) {
                                    findViewById.setBackgroundColor(PlayActivity.this.getResources().getColor(C0028R.color.border));
                                }
                            } else {
                                PlayActivity.g(PlayActivity.this);
                            }
                        }
                        if (i == numArr.length - 1) {
                            PlayActivity.this.e();
                        }
                        PlayActivity.this.a(11);
                    }
                }).setTitle(C0028R.string.select_plate_action).show();
                View findViewById = show.findViewById(show.getContext().getResources().getIdentifier("android:id/titleDivider", (String) null, (String) null));
                if (findViewById != null) {
                    findViewById.setBackgroundColor(getResources().getColor(C0028R.color.border));
                }
            } else if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean("ask_sterilize_sample", true)) {
                a(11);
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle(C0028R.string.dialog_reload_title);
                builder.setMessage(getString(C0028R.string.dialog_sterilize_text));
                builder.setPositiveButton(C0028R.string.dialog_button_reload, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        PlayActivity.this.e();
                    }
                });
                builder.setNegativeButton(getString(C0028R.string.dialog_button_cancel), new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog create = builder.create();
                create.show();
                View findViewById2 = create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", (String) null, (String) null));
                if (findViewById2 != null) {
                    findViewById2.setBackgroundColor(getResources().getColor(C0028R.color.border));
                }
            } else {
                e();
            }
        }
        if (view.getId() == C0028R.id.temp_button_id) {
            a(9);
            String[] stringArray = getResources().getStringArray(C0028R.array.modes);
            CharSequence[] charSequenceArr = new CharSequence[(this.x ? 4 : 3)];
            getResources().getColor(C0028R.color.highlight);
            charSequenceArr[0] = stringArray[0];
            if (this.x) {
                charSequenceArr[1] = stringArray[3];
                i = 2;
            } else {
                i = 1;
            }
            charSequenceArr[i] = stringArray[1];
            charSequenceArr[i + 1] = stringArray[2];
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setTitle(C0028R.string.temp_menu_title);
            if (this.H == 0) {
                builder2.setIcon(C0028R.drawable.temp_low);
            }
            if (this.H == 1) {
                builder2.setIcon(C0028R.drawable.temp_medium);
            }
            if (this.H == 2) {
                builder2.setIcon(C0028R.drawable.temp_high);
            }
            if (this.H == 3) {
                builder2.setIcon(C0028R.drawable.temp_slow);
            }
            builder2.setItems(charSequenceArr, new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PlayActivity.this.x) {
                        if (i == 0) {
                            PlayActivity.this.a(0);
                        }
                        if (i == 1) {
                            PlayActivity.this.a(3);
                        }
                        if (i == 2) {
                            PlayActivity.this.a(1);
                        }
                        if (i == 3) {
                            PlayActivity.this.a(2);
                            return;
                        }
                        return;
                    }
                    if (i == 0) {
                        PlayActivity.this.a(0);
                    }
                    if (i == 1) {
                        PlayActivity.this.a(1);
                    }
                    if (i == 2) {
                        PlayActivity.this.a(2);
                    }
                }
            });
            AlertDialog create2 = builder2.create();
            create2.setCanceledOnTouchOutside(true);
            create2.show();
            View findViewById3 = create2.findViewById(create2.getContext().getResources().getIdentifier("android:id/titleDivider", (String) null, (String) null));
            if (findViewById3 != null) {
                findViewById3.setBackgroundColor(getResources().getColor(C0028R.color.border));
            }
        }
        if (view.getId() == C0028R.id.tool_button_id) {
            a(9);
            k();
        }
    }

    private void k() {
        getResources().getStringArray(C0028R.array.modes);
        new AlertDialog.Builder(this);
        boolean[] a2 = j.a(this.q);
        int i = 0;
        for (boolean z2 : a2) {
            if (z2) {
                i++;
            }
        }
        final Integer[] numArr = new Integer[i];
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            if (a2[i3]) {
                numArr[i2] = new Integer(i3);
                i2++;
            }
        }
        AlertDialog show = new AlertDialog.Builder(this).setAdapter(new ArrayAdapter<Integer>(this, numArr) {
            public final View getView(int i, View view, ViewGroup viewGroup) {
                int i2;
                View view2 = super.getView(i, view, viewGroup);
                TextView textView = (TextView) view2.findViewById(16908308);
                if (numArr[i].intValue() == 0) {
                    i2 = C0028R.drawable.tool_cell;
                    textView.setText(" " + PlayActivity.this.getString(C0028R.string.tool_cell));
                } else {
                    i2 = 0;
                }
                if (numArr[i].intValue() == 1) {
                    i2 = C0028R.drawable.tool_move;
                    textView.setText(" " + PlayActivity.this.getString(C0028R.string.tool_move));
                }
                if (numArr[i].intValue() == 2) {
                    i2 = C0028R.drawable.tool_add;
                    textView.setText(" " + PlayActivity.this.getString(C0028R.string.tool_add));
                }
                if (numArr[i].intValue() == 3) {
                    i2 = C0028R.drawable.tool_remove;
                    textView.setText(" " + PlayActivity.this.getString(C0028R.string.tool_remove));
                }
                if (numArr[i].intValue() == 4) {
                    i2 = C0028R.drawable.tool_info;
                    textView.setText(" " + PlayActivity.this.getString(C0028R.string.tool_info));
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
                return view2;
            }
        }, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = 0;
                if (numArr[i].intValue() == 0) {
                    i2 = C0028R.drawable.tool_cell;
                }
                if (numArr[i].intValue() == 1) {
                    i2 = C0028R.drawable.tool_move;
                }
                if (numArr[i].intValue() == 2) {
                    i2 = C0028R.drawable.tool_add;
                }
                if (numArr[i].intValue() == 3) {
                    i2 = C0028R.drawable.tool_remove;
                }
                if (numArr[i].intValue() == 4) {
                    i2 = C0028R.drawable.tool_info;
                }
                PlayActivity.this.N.setImageResource(i2);
                int unused = PlayActivity.this.I = numArr[i].intValue();
                final int c = PlayActivity.this.I;
                final p pVar = (p) PlayActivity.this.b(1);
                if (pVar != null) {
                    pVar.a.queueEvent(new Runnable() {
                        public final void run() {
                            pVar.a.a.A = c;
                        }
                    });
                    pVar.a(PlayActivity.this.I);
                }
                PlayActivity.this.a(11);
            }
        }).setTitle(C0028R.string.popup_title_select_tool).show();
        View findViewById = show.findViewById(show.getContext().getResources().getIdentifier("android:id/titleDivider", (String) null, (String) null));
        if (findViewById != null) {
            findViewById.setBackgroundColor(getResources().getColor(C0028R.color.border));
        }
    }

    public final Gene[] a() {
        p pVar = (p) b(1);
        if (pVar == null || pVar.a == null) {
            return null;
        }
        return pVar.a.a.c();
    }

    public final void a(short s2) {
        if (this.w) {
            this.y.play(this.B[s2], 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }

    public final void a(float f) {
        if (this.w) {
            this.y.play(this.B[10], f, f, 0, 0, 1.0f);
        }
    }

    public final boolean g() {
        return this.w;
    }

    public final void h() {
        long b = j.b((Context) this, this.q) + (com.saterskog.b.a.c() - this.K);
        com.saterskog.b.a.a("win:playTime", j.a.get(this.q).b, com.saterskog.b.a.a(b), b, this);
        long b2 = com.saterskog.b.a.b((Context) this);
        com.saterskog.b.a.a("win:installTime", j.a.get(this.q).b, com.saterskog.b.a.a(b2), b2, this);
        com.saterskog.b.a.a("win:id_play_now_install", j.a.get(this.q).b + "," + b + "," + com.saterskog.b.a.c() + "," + com.saterskog.b.a.a((Context) this), "", b2, this);
    }

    static /* synthetic */ void f(PlayActivity playActivity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(playActivity);
        builder.setTitle(playActivity.getString(C0028R.string.sample_info_save_title));
        final EditText editText = new EditText(playActivity);
        editText.setInputType(1);
        if (!playActivity.p) {
            editText.setText(playActivity.t);
        }
        builder.setView(editText);
        builder.setPositiveButton(playActivity.getString(C0028R.string.dialog_button_ok), new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = 0;
                String obj = editText.getText().toString();
                String a2 = f.a(obj);
                String[] fileList = PlayActivity.this.fileList();
                int length = fileList.length;
                while (i2 < length) {
                    if (!fileList[i2].equals(a2) || editText.getText().toString().equals(PlayActivity.this.t)) {
                        i2++;
                    } else {
                        Toast makeText = Toast.makeText(PlayActivity.this, PlayActivity.this.getString(C0028R.string.sample_info_save_used_name), 1);
                        PlayActivity.this.a(1);
                        ((TextView) makeText.getView().findViewById(16908299)).setTextColor(-65536);
                        makeText.show();
                        return;
                    }
                }
                try {
                    FileOutputStream openFileOutput = PlayActivity.this.openFileOutput(a2, 0);
                    PlayActivity playActivity = PlayActivity.this;
                    p pVar = (p) playActivity.b(1);
                    if (!(pVar == null || pVar.a == null)) {
                        pVar.a.queueEvent(new Runnable(pVar, openFileOutput) {
                            final /* synthetic */ p a;
                            final /* synthetic */ OutputStream b;

                            {
                                this.a = r2;
                                this.b = r3;
                            }

                            public final void run() {
                                this.a.a.a.N = this.b;
                            }
                        });
                    }
                    String unused = PlayActivity.this.O = obj;
                    PlayActivity.this.s = -1;
                    PlayActivity.this.t = obj;
                    PlayActivity.this.o = true;
                    PlayActivity.this.getActionBar().setTitle(PlayActivity.this.O);
                    Toast.makeText(PlayActivity.this, PlayActivity.this.getString(C0028R.string.toast_saved), 1).show();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IllegalArgumentException e2) {
                    PlayActivity.this.a(1);
                    Toast makeText2 = Toast.makeText(PlayActivity.this, PlayActivity.this.getString(C0028R.string.toast_bad_name), 1);
                    ((TextView) makeText2.getView().findViewById(16908299)).setTextColor(-65536);
                    makeText2.show();
                }
            }
        });
        builder.setNegativeButton(playActivity.getString(C0028R.string.dialog_cancel), new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.show();
    }
}
