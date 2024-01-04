/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Fragment
 *  android.app.FragmentManager
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.media.MediaPlayer
 *  android.media.SoundPool
 *  android.media.SoundPool$Builder
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.RemoteException
 *  android.preference.PreferenceManager
 *  android.widget.Toast
 */
package com.saterskog.cell_lab;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.widget.Toast;
import com.a.a.a.a;
import com.saterskog.a.b;
import com.saterskog.a.c;
import com.saterskog.a.d;
import com.saterskog.a.e;
import com.saterskog.cell_lab.CellLabApplication;
import com.saterskog.cell_lab.b;
import com.saterskog.cell_lab.s;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class l
extends Activity
implements b.b,
b.d,
b.f,
s.a {
    a a;
    com.saterskog.a.b b;
    ViewPager c;
    MediaPlayer d;
    boolean e;
    SoundPool f;
    int[] g = new int[5];
    protected com.saterskog.cell_lab.a h;
    String[] i = new String[]{"donate_small", "donation_medium", "donation_large"};
    public boolean[] j;
    public String[] k;
    private int l;

    /*
     * Enabled aggressive block sorting
     */
    private void b() {
        this.f = Build.VERSION.SDK_INT >= 21 ? new SoundPool.Builder().setMaxStreams(3).build() : new SoundPool(3, 3, 0);
        if (this.e) {
            this.g[1] = this.f.load((Context)this, 2131558446, 1);
            this.g[0] = this.f.load((Context)this, 2131558408, 1);
            this.g[2] = this.f.load((Context)this, 2131558445, 1);
            this.g[4] = this.f.load((Context)this, 2131558409, 1);
            this.g[3] = this.f.load((Context)this, 2131558424, 1);
        }
    }

    abstract Fragment a(int var1);

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a() {
        ArrayList<String> arrayList = new ArrayList<String>();
        Handler handler = this.i;
        int n2 = ((String[])handler).length;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add(handler[i2]);
        }
        try {
            com.saterskog.a.b b2 = this.b;
            handler = new Handler();
            b2.b();
            b2.a("queryInventory");
            b2.b("refresh inventory");
            Runnable runnable = new Runnable(arrayList, this, handler){
                final /* synthetic */ boolean a;
                final /* synthetic */ List b;
                final /* synthetic */ List c;
                final /* synthetic */ b.f d;
                final /* synthetic */ Handler e;
                {
                    this.a = true;
                    this.b = list;
                    this.c = null;
                    this.d = f2;
                    this.e = handler;
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                @Override
                public final void run() {
                    final c c2 = new c(0, "Inventory refresh successful.");
                    final d d2 = null;
                    try {
                        d d3;
                        d2 = d3 = b.this.a(this.a, this.b, (List<String>)this.c);
                    }
                    catch (com.saterskog.a.a a2) {
                        c2 = a2.a;
                    }
                    b.this.c();
                    if (!b.this.d && this.d != null) {
                        this.e.post(new Runnable(){

                            @Override
                            public final void run() {
                                d.a(c2, d2);
                            }
                        });
                    }
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
            return;
        }
        catch (b.a a2) {
            com.saterskog.b.a.a("Couldn't query IAB", a2);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            com.saterskog.b.a.a("Couldn't query IAB, Illegal state", illegalStateException);
            return;
        }
        catch (NullPointerException nullPointerException) {
            com.saterskog.b.a.a("Nullpointer", nullPointerException);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(c object, d d2) {
        if (((c)object).b()) {
            com.saterskog.b.a.b("IAP failed, 271.");
            return;
        }
        this.j = new boolean[this.i.length];
        this.k = new String[this.i.length];
        int n2 = 0;
        while (true) {
            if (n2 >= this.i.length) {
                com.saterskog.b.a.b("calling af.updateDonation(0);...");
                if (this.h == null) return;
                this.h.a();
                return;
            }
            this.j[n2] = d2.b(this.i[n2]);
            if (d2.b(this.i[n2])) {
                try {
                    object = this.b;
                    String string = this.i[n2];
                    ((com.saterskog.a.b)object).a(d2.b.get(string), this);
                }
                catch (b.a a2) {
                    com.saterskog.b.a.a("couldn't consume donation 2", a2);
                }
            }
            this.k[n2] = d2.a(this.i[n2]) == null ? "no connection" : d2.a((String)this.i[n2]).b;
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(c arrstring, e e2) {
        com.saterskog.b.a.b("onIabPurchaseFinished called");
        if (arrstring.b()) {
            com.saterskog.b.a.b("IAP failed, 271.");
            return;
        }
        arrstring = this.i;
        int n2 = arrstring.length;
        int n3 = 0;
        while (n3 < n2) {
            String string = arrstring[n3];
            if (e2.d.equals(string)) {
                try {
                    com.saterskog.b.a.b("launching consume");
                    this.b.a(e2, this);
                }
                catch (b.a a2) {
                    com.saterskog.b.a.a("couldn't consume donation", a2);
                }
            }
            ++n3;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(e e2, c object) {
        com.saterskog.b.a.b("onConsumeFinished called");
        if (((c)object).a()) {
            Object object2;
            com.saterskog.b.a.b("cosnume is success");
            object = null;
            try {
                object = object2 = this.openFileOutput("consumptions", 32768);
            }
            catch (FileNotFoundException fileNotFoundException) {
                com.saterskog.b.a.a("onConsumeFinished", fileNotFoundException);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter((OutputStream)object));
            try {
                bufferedWriter.newLine();
                bufferedWriter.write(e2.g);
                object2 = new StringBuilder("wrote payload: ");
                com.saterskog.b.a.b(((StringBuilder)object2).append(e2.g).toString());
                bufferedWriter.close();
                ((FileOutputStream)object).close();
            }
            catch (IOException iOException) {
                com.saterskog.b.a.a("onConsumeFinished2", iOException);
            }
        } else {
            com.saterskog.b.a.b("received erroneous consumption");
        }
        this.a();
    }

    public final void a(short s2) {
        if (this.e) {
            if (this.f == null) {
                this.b();
            }
            this.f.play(this.g[s2], 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(boolean bl) {
        if (!bl) {
            if (this.d == null) return;
            this.d.pause();
            this.l = this.d.getCurrentPosition();
            return;
        }
        if (this.d != null) {
            this.d.seekTo(this.l);
            this.d.start();
            return;
        }
        this.d = MediaPlayer.create((Context)this, (int)2131558435);
        this.d.setLooping(true);
        this.d.setVolume(0.5f, 0.5f);
        this.d.start();
    }

    abstract String b(int var1);

    @Override
    public final void b(boolean bl) {
        this.e = bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void onActivityResult(int n2, int n3, Intent intent) {
        com.saterskog.b.a.b("onActivityResult(" + n2 + "," + n3 + "," + (Object)intent);
        if (!this.b.a(n2, n3, intent)) {
            super.onActivityResult(n2, n3, intent);
            switch (n2) {
                default: {
                    return;
                }
                case 1: 
            }
            if (n3 != -1 || intent.getIntExtra("go_to_donate", 0) != 1) return;
            this.c.setCurrentItem(4);
            return;
        }
        com.saterskog.b.a.b("onActivityResult handled by IABUtil.");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    protected void onCreate(Bundle var1_1) {
        var2_2 = 0;
        super.onCreate(var1_1);
        CellLabApplication.a(this);
        this.getWindow().addFlags(1024);
        this.setContentView(2131361819);
        var3_3 = PreferenceManager.getDefaultSharedPreferences((Context)this);
        this.e = var3_3.getBoolean("sound_effects", true);
        this.b = new com.saterskog.a.b((Context)this, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhQlFw2sfDBGp4kmVU3x8xZOD3xp9wKzCsChUMUZUjr9HLgEmBZl8yXJ8K8NDL3WH+B657+1ABfHm4+J6OcwZU/a0h38Sb6GCsO8Fr4ToWMpbhoQAr8GKJZkWtygOwzACIk5QHAiAiCXnbb90ufK4wmpXlQfP2DQCCihRhIuU2Z1vcqeMTRd+oyC76ltRnCntW4WI8YH09SZYJfOwfTYHR01C9TeSoM2TWBAfn+mdMcRHVkssGrPaZjtmW7x86u3v/bAqbIE4ZP72/IG7VL4isFP0jlFqnkXV3zd/zJuOngZELR9/lgPPgR580daGWctbLcDBEao4cld/4MCly4utfwIDAQAB");
        var4_4 = this.b;
        var5_5 = new b.e(){

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public final void a(c c2) {
                if (!c2.a()) {
                    com.saterskog.b.a.b("Problem setting up In-app Billing: " + c2);
                    return;
                }
                l.this.a();
            }
        };
        var4_4.b();
        if (var4_4.c) {
            throw new IllegalStateException("IAB helper is already set up.");
        }
        var4_4.c("Starting in-app billing setup.");
        var4_4.l = new ServiceConnection((b.e)var5_5){
            final /* synthetic */ b.e a;
            {
                this.a = e2;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public final void onServiceConnected(ComponentName object, IBinder object2) {
                int n2;
                if (b.this.d) {
                    return;
                }
                b.this.c("Billing service connected.");
                b.this.k = a.a.a((IBinder)object2);
                object2 = b.this.j.getPackageName();
                try {
                    b.this.c("Checking for in-app billing 3 support.");
                    n2 = b.this.k.a(3, (String)object2, "inapp");
                    if (n2 != 0) {
                        if (this.a != null) {
                            object2 = this.a;
                            object = new c(n2, "Error checking for billing v3 support.");
                            object2.a((c)object);
                        }
                        b.this.f = false;
                        b.this.g = false;
                        return;
                    }
                    com.saterskog.a.b b2 = b.this;
                    object = new StringBuilder("In-app billing version 3 supported for ");
                    b2.c(((StringBuilder)object).append((String)object2).toString());
                    if (b.this.k.a(5, (String)object2, "subs") == 0) {
                        b.this.c("Subscription re-signup AVAILABLE.");
                        b.this.g = true;
                    } else {
                        b.this.c("Subscription re-signup not available.");
                        b.this.g = false;
                    }
                }
                catch (RemoteException remoteException) {
                    if (this.a != null) {
                        this.a.a(new c(-1001, "RemoteException while setting up in-app billing."));
                    }
                    remoteException.printStackTrace();
                    return;
                }
                if (b.this.g) {
                    b.this.f = true;
                } else {
                    n2 = b.this.k.a(3, (String)object2, "subs");
                    if (n2 == 0) {
                        b.this.c("Subscriptions AVAILABLE.");
                        b.this.f = true;
                    } else {
                        object = b.this;
                        object2 = new StringBuilder("Subscriptions NOT AVAILABLE. Response: ");
                        ((com.saterskog.a.b)object).c(((StringBuilder)object2).append(n2).toString());
                        b.this.f = false;
                        b.this.g = false;
                    }
                }
                b.this.c = true;
                if (this.a == null) return;
                this.a.a(new c(0, "Setup successful."));
            }

            public final void onServiceDisconnected(ComponentName componentName) {
                b.this.c("Billing service disconnected.");
                b.this.k = null;
            }
        };
        var6_6 = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        var6_6.setPackage("com.android.vending");
        var7_8 = var4_4.j.getPackageManager().queryIntentServices((Intent)var6_6, 0);
        if (var7_8 != null && !var7_8.isEmpty()) {
            var4_4.j.bindService((Intent)var6_6, var4_4.l, 1);
        } else {
            var5_5.a(new c(3, "Billing service unavailable on device."));
        }
        if (this.e) {
            this.b();
        }
        if (var3_3.getBoolean("music", true)) {
            this.d = MediaPlayer.create((Context)this, (int)2131558435);
            this.d.setLooping(true);
            this.d.setVolume(0.5f, 0.5f);
            if (var1_1 != null && (var8_9 = var1_1.getInt("song_pos", -1)) != -1) {
                this.l = var8_9;
                this.d.seekTo(this.l);
            }
            this.d.start();
        }
        if ((var6_6 = this.getIntent().getData()) == null) ** GOTO lbl62
        com.saterskog.b.a.b("uri received");
        var3_3 = this.fileList();
        var8_9 = ((String[])var3_3).length;
        while (var2_2 < var8_9) {
            if (var3_3[var2_2].equals(var6_6.getLastPathSegment())) {
                Toast.makeText((Context)this, (CharSequence)this.getString(2131624345), (int)1).show();
                this.finish();
            }
            ++var2_2;
        }
        var5_5 = new byte[1024];
        try {
            var3_3 = this.getContentResolver().openInputStream((Uri)var6_6);
            var4_4 = this.openFileOutput(var6_6.getLastPathSegment(), 0);
            while ((var2_2 = var3_3.read((byte[])var5_5)) > 0) {
                var4_4.write(Arrays.copyOfRange((byte[])var5_5, 0, Math.max(0, var2_2)));
            }
            var3_3.close();
            var4_4.close();
            var3_3 = new StringBuilder("uri written to ");
            com.saterskog.b.a.b(var3_3.append(var6_6.getLastPathSegment()).toString());
            var2_2 = 1;
            ** GOTO lbl63
        }
        catch (Exception var6_7) {
            block20: {
                block19: {
                    var6_7.printStackTrace();
                    var2_2 = 1;
                    break block19;
lbl62:
                    // 1 sources

                    var2_2 = 0;
                }
                this.a = new a(this.getFragmentManager());
                this.c = (ViewPager)this.findViewById(2131230813);
                this.c.setAdapter(this.a);
                this.c.setOnPageChangeListener(new ViewPager.i(){

                    /*
                     * Enabled aggressive block sorting
                     */
                    @Override
                    public final void a(int n2) {
                        switch (n2) {
                            case 0: {
                                com.saterskog.b.a.a("main/challenge_tab", l.this);
                                break;
                            }
                            case 1: {
                                com.saterskog.b.a.a("main/experiment_tab", l.this);
                                break;
                            }
                            case 2: {
                                com.saterskog.b.a.a("main/gene_bank_tab", l.this);
                                break;
                            }
                            case 3: {
                                com.saterskog.b.a.a("main/about_tab", l.this);
                                break;
                            }
                        }
                        l.this.a((short)0);
                    }
                });
                var6_6 = (PagerTabStrip)this.findViewById(2131230814);
                var6_6.setDrawFullUnderline(true);
                var6_6.setTabIndicatorColor(this.getResources().getColor(2131034160));
                if (var2_2 != 0) {
                    this.c.setCurrentItem(2);
                }
                switch (this.c.getCurrentItem()) {
                    case 0: {
                        com.saterskog.b.a.a("main/challenge_tab", this);
                        ** break;
                    }
                    case 1: {
                        com.saterskog.b.a.a("main/experiment_tab", this);
                        ** break;
                    }
                    case 2: {
                        com.saterskog.b.a.a("main/gene_bank_tab", this);
                    }
lbl82:
                    // 4 sources

                    default: {
                        break block20;
                    }
                    case 3: 
                }
                com.saterskog.b.a.a("main/about_tab", this);
            }
            if (var1_1 != null) return;
            new Thread(new Runnable(this){
                final /* synthetic */ Activity a;
                {
                    this.a = activity;
                }

                /*
                 * Unable to fully structure code
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 * Lifted jumps to return sites
                 */
                public final void run() {
                    block10: {
                        block12: {
                            block11: {
                                var1_1 = true;
                                var2_2 = "";
                                try {
                                    var3_3 = new URL("http://www.cell-lab.net/announcement.txt");
                                    var3_3 = var3_3.openConnection();
                                    var3_3.setReadTimeout(5000);
                                    var3_3.setConnectTimeout(10000);
                                    var4_4 = var3_3.getInputStream();
                                    var5_5 = new BufferedInputStream((InputStream)var4_4, 5120);
                                    var3_3 = new InputStreamReader((InputStream)var4_4);
                                    var6_6 = new BufferedReader((Reader)var3_3);
                                    var3_3 = var6_6.readLine();
                                    var7_11 = var3_3.equals("welcomeToCL94");
                                    if (var7_11) {
                                        var1_1 = true;
                                        break block10;
                                    }
                                    if (!var3_3.equals("CellLabAnnouncement")) break block11;
                                    break block12;
                                }
                                catch (Exception var6_9) {
                                    var3_3 = "";
                                    var2_2 = "";
                                    var4_4 = "";
                                    ** GOTO lbl59
                                }
                            }
                            var1_1 = false;
                        }
                        var3_3 = var6_6.readLine();
                    }
                    if (!var1_1) ** GOTO lbl53
                    try {
                        var2_2 = var4_4 = var6_6.readLine();
                        var2_2 = var4_4;
                        var8_12 = new StringBuilder();
                        while (true) {
                            var2_2 = var4_4;
                            var9_13 = var6_6.readLine();
                            if (var9_13 == null) break;
                            var2_2 = var4_4;
                            var2_2 = var4_4;
                            var10_14 = new StringBuilder();
                            var2_2 = var4_4;
                            var8_12.append(var10_14.append(var9_13).append("\n").toString());
                        }
                        var2_2 = var4_4;
                        var6_6 = var8_12.toString();
                        var2_2 = var4_4;
                        var4_4 = var6_6;
                        ** GOTO lbl55
                    }
                    catch (Exception var6_7) {
                        block13: {
                            block14: {
                                var4_4 = "";
                                break block14;
lbl53:
                                // 1 sources

                                var2_2 = "";
                                var4_4 = "";
lbl55:
                                // 2 sources

                                try {
                                    var5_5.close();
                                    break block13;
                                }
                                catch (Exception var6_10) {}
                            }
                            var6_8.printStackTrace();
                        }
                        if (var4_4.length() == 0) return;
                        if (var3_3.length() == 0) return;
                        if (var2_2.length() == 0) return;
                        com.saterskog.cell_lab.b.a(this.a, (String)var2_2, (String)var4_4, "announcement_" + (String)var3_3, null, null);
                        return;
                    }
                }
            }).start();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onDestroy() {
        if (this.f != null) {
            this.f.release();
            this.f = null;
        }
        if (this.d != null) {
            this.d.release();
            this.d = null;
        }
        if (this.b != null) {
            try {
                this.b.a();
            }
            catch (b.a a2) {
                com.saterskog.b.a.a("couldn't dispose IAP Helper..", a2);
            }
        }
        this.b = null;
        super.onDestroy();
    }

    public void onPause() {
        if (this.d != null) {
            this.d.pause();
            this.l = this.d.getCurrentPosition();
        }
        super.onPause();
    }

    public void onResume() {
        if (this.d != null && PreferenceManager.getDefaultSharedPreferences((Context)this).getBoolean("music", true)) {
            this.d.seekTo(this.l);
            this.d.start();
        }
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        if (this.d != null) {
            bundle.putInt("song_pos", this.d.getCurrentPosition());
            this.d.pause();
        }
        super.onSaveInstanceState(bundle);
    }

    public final class a
    extends android.support.a.a.d {
        public a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public final Fragment a(int n2) {
            return l.this.a(n2);
        }

        @Override
        public final int b() {
            return 5;
        }

        @Override
        public final CharSequence b(int n2) {
            return l.this.b(n2);
        }
    }
}

