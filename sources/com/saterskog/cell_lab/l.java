package com.saterskog.cell_lab;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.widget.Toast;
import com.saterskog.a.b;
import com.saterskog.a.c;
import com.saterskog.a.d;
import com.saterskog.a.e;
import com.saterskog.cell_lab.s;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class l extends Activity implements b.C0026b, b.d, b.f, s.a {
    a a;
    b b;
    ViewPager c;
    MediaPlayer d;
    boolean e;
    SoundPool f;
    int[] g = new int[5];
    protected a h;
    String[] i = {"donate_small", "donation_medium", "donation_large"};
    public boolean[] j;
    public String[] k;
    private int l;

    /* access modifiers changed from: package-private */
    public abstract Fragment a(int i2);

    /* access modifiers changed from: package-private */
    public abstract String b(int i2);

    public void onPause() {
        if (this.d != null) {
            this.d.pause();
            this.l = this.d.getCurrentPosition();
        }
        super.onPause();
    }

    public void onResume() {
        if (this.d != null && PreferenceManager.getDefaultSharedPreferences(this).getBoolean("music", true)) {
            this.d.seekTo(this.l);
            this.d.start();
        }
        super.onResume();
    }

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
            } catch (b.a e2) {
                com.saterskog.b.a.a("couldn't dispose IAP Helper..", (Throwable) e2);
            }
        }
        this.b = null;
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (this.d != null) {
            bundle.putInt("song_pos", this.d.getCurrentPosition());
            this.d.pause();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        boolean z;
        int i2;
        super.onCreate(bundle);
        CellLabApplication.a(this);
        getWindow().addFlags(1024);
        setContentView(C0028R.layout.activity_main_menu);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        this.e = defaultSharedPreferences.getBoolean("sound_effects", true);
        this.b = new b(this, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhQlFw2sfDBGp4kmVU3x8xZOD3xp9wKzCsChUMUZUjr9HLgEmBZl8yXJ8K8NDL3WH+B657+1ABfHm4+J6OcwZU/a0h38Sb6GCsO8Fr4ToWMpbhoQAr8GKJZkWtygOwzACIk5QHAiAiCXnbb90ufK4wmpXlQfP2DQCCihRhIuU2Z1vcqeMTRd+oyC76ltRnCntW4WI8YH09SZYJfOwfTYHR01C9TeSoM2TWBAfn+mdMcRHVkssGrPaZjtmW7x86u3v/bAqbIE4ZP72/IG7VL4isFP0jlFqnkXV3zd/zJuOngZELR9/lgPPgR580daGWctbLcDBEao4cld/4MCly4utfwIDAQAB");
        b bVar = this.b;
        AnonymousClass2 r4 = new b.e() {
            public final void a(c cVar) {
                if (!cVar.a()) {
                    com.saterskog.b.a.b("Problem setting up In-app Billing: " + cVar);
                } else {
                    l.this.a();
                }
            }
        };
        bVar.b();
        if (bVar.c) {
            throw new IllegalStateException("IAB helper is already set up.");
        }
        bVar.c("Starting in-app billing setup.");
        bVar.l = new ServiceConnection(r4) {
            final /* synthetic */ e a;

            public final void onServiceDisconnected(
/*
Method generation error in method: com.saterskog.a.b.1.onServiceDisconnected(android.content.ComponentName):void, dex: classes.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.saterskog.a.b.1.onServiceDisconnected(android.content.ComponentName):void, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
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

            public final void onServiceConnected(
/*
Method generation error in method: com.saterskog.a.b.1.onServiceConnected(android.content.ComponentName, android.os.IBinder):void, dex: classes.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.saterskog.a.b.1.onServiceConnected(android.content.ComponentName, android.os.IBinder):void, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
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
        };
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> queryIntentServices = bVar.j.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            r4.a(new c(3, "Billing service unavailable on device."));
        } else {
            bVar.j.bindService(intent, bVar.l, 1);
        }
        if (this.e) {
            b();
        }
        if (defaultSharedPreferences.getBoolean("music", true)) {
            this.d = MediaPlayer.create(this, C0028R.raw.menu);
            this.d.setLooping(true);
            this.d.setVolume(0.5f, 0.5f);
            if (!(bundle == null || (i2 = bundle.getInt("song_pos", -1)) == -1)) {
                this.l = i2;
                this.d.seekTo(this.l);
            }
            this.d.start();
        }
        Uri data = getIntent().getData();
        if (data != null) {
            com.saterskog.b.a.b("uri received");
            for (String equals : fileList()) {
                if (equals.equals(data.getLastPathSegment())) {
                    Toast.makeText(this, getString(C0028R.string.toast_name_exists), 1).show();
                    finish();
                }
            }
            byte[] bArr = new byte[1024];
            try {
                InputStream openInputStream = getContentResolver().openInputStream(data);
                FileOutputStream openFileOutput = openFileOutput(data.getLastPathSegment(), 0);
                while (true) {
                    int read = openInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    openFileOutput.write(Arrays.copyOfRange(bArr, 0, Math.max(0, read)));
                }
                openInputStream.close();
                openFileOutput.close();
                com.saterskog.b.a.b("uri written to " + data.getLastPathSegment());
                z = true;
            } catch (Exception e2) {
                e2.printStackTrace();
                z = true;
            }
        } else {
            z = false;
        }
        this.a = new a(getFragmentManager());
        this.c = (ViewPager) findViewById(C0028R.id.pager);
        this.c.setAdapter(this.a);
        this.c.setOnPageChangeListener(new ViewPager.i() {
            public final void a(int i) {
                switch (i) {
                    case 0:
                        com.saterskog.b.a.a("main/challenge_tab", (Activity) l.this);
                        break;
                    case 1:
                        com.saterskog.b.a.a("main/experiment_tab", (Activity) l.this);
                        break;
                    case 2:
                        com.saterskog.b.a.a("main/gene_bank_tab", (Activity) l.this);
                        break;
                    case 3:
                        com.saterskog.b.a.a("main/about_tab", (Activity) l.this);
                        break;
                }
                l.this.a(0);
            }
        });
        PagerTabStrip pagerTabStrip = (PagerTabStrip) findViewById(C0028R.id.pager_title_strip);
        pagerTabStrip.setDrawFullUnderline(true);
        pagerTabStrip.setTabIndicatorColor(getResources().getColor(C0028R.color.highlight));
        if (z) {
            this.c.setCurrentItem(2);
        }
        switch (this.c.getCurrentItem()) {
            case 0:
                com.saterskog.b.a.a("main/challenge_tab", (Activity) this);
                break;
            case 1:
                com.saterskog.b.a.a("main/experiment_tab", (Activity) this);
                break;
            case 2:
                com.saterskog.b.a.a("main/gene_bank_tab", (Activity) this);
                break;
            case 3:
                com.saterskog.b.a.a("main/about_tab", (Activity) this);
                break;
        }
        if (bundle == null) {
            new Thread(new Runnable(this) {
                final /* synthetic */ Activity a;

                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run(
/*
Method generation error in method: com.saterskog.cell_lab.b.1.run():void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.saterskog.cell_lab.b.1.run():void, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
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
            }).start();
        }
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        for (String add : this.i) {
            arrayList.add(add);
        }
        try {
            b bVar = this.b;
            Handler handler = new Handler();
            bVar.b();
            bVar.a("queryInventory");
            bVar.b("refresh inventory");
            new Thread(new Runnable(arrayList, this, handler) {
                final /* synthetic */ boolean a;
                final /* synthetic */ List b;
                final /* synthetic */ List c;
                final /* synthetic */ f d;
                final /* synthetic */ Handler e;

                public final void run(
/*
Method generation error in method: com.saterskog.a.b.2.run():void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.saterskog.a.b.2.run():void, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
            }).start();
        } catch (b.a e2) {
            com.saterskog.b.a.a("Couldn't query IAB", (Throwable) e2);
        } catch (IllegalStateException e3) {
            com.saterskog.b.a.a("Couldn't query IAB, Illegal state", (Throwable) e3);
        } catch (NullPointerException e4) {
            com.saterskog.b.a.a("Nullpointer", (Throwable) e4);
        }
    }

    public final void a(c cVar, d dVar) {
        if (cVar.b()) {
            com.saterskog.b.a.b("IAP failed, 271.");
            return;
        }
        this.j = new boolean[this.i.length];
        this.k = new String[this.i.length];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.i.length) {
                break;
            }
            this.j[i3] = dVar.b(this.i[i3]);
            if (dVar.b(this.i[i3])) {
                try {
                    this.b.a(dVar.b.get(this.i[i3]), (b.C0026b) this);
                } catch (b.a e2) {
                    com.saterskog.b.a.a("couldn't consume donation 2", (Throwable) e2);
                }
            }
            if (dVar.a(this.i[i3]) == null) {
                this.k[i3] = "no connection";
            } else {
                this.k[i3] = dVar.a(this.i[i3]).b;
            }
            i2 = i3 + 1;
        }
        com.saterskog.b.a.b("calling af.updateDonation(0);...");
        if (this.h != null) {
            this.h.a();
        }
    }

    private void b() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f = new SoundPool.Builder().setMaxStreams(3).build();
        } else {
            this.f = new SoundPool(3, 3, 0);
        }
        if (this.e) {
            this.g[1] = this.f.load(this, C0028R.raw.select_cell, 1);
            this.g[0] = this.f.load(this, C0028R.raw.button, 1);
            this.g[2] = this.f.load(this, C0028R.raw.save, 1);
            this.g[4] = this.f.load(this, C0028R.raw.button2, 1);
            this.g[3] = this.f.load(this, C0028R.raw.invalid, 1);
        }
    }

    public final void a(boolean z) {
        if (z) {
            if (this.d != null) {
                this.d.seekTo(this.l);
                this.d.start();
                return;
            }
            this.d = MediaPlayer.create(this, C0028R.raw.menu);
            this.d.setLooping(true);
            this.d.setVolume(0.5f, 0.5f);
            this.d.start();
        } else if (this.d != null) {
            this.d.pause();
            this.l = this.d.getCurrentPosition();
        }
    }

    public final void b(boolean z) {
        this.e = z;
    }

    public final void a(c cVar, e eVar) {
        com.saterskog.b.a.b("onIabPurchaseFinished called");
        if (cVar.b()) {
            com.saterskog.b.a.b("IAP failed, 271.");
            return;
        }
        for (String equals : this.i) {
            if (eVar.d.equals(equals)) {
                try {
                    com.saterskog.b.a.b("launching consume");
                    this.b.a(eVar, (b.C0026b) this);
                } catch (b.a e2) {
                    com.saterskog.b.a.a("couldn't consume donation", (Throwable) e2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        com.saterskog.b.a.b("onActivityResult(" + i2 + "," + i3 + "," + intent);
        if (!this.b.a(i2, i3, intent)) {
            super.onActivityResult(i2, i3, intent);
            switch (i2) {
                case 1:
                    if (i3 == -1 && intent.getIntExtra("go_to_donate", 0) == 1) {
                        this.c.setCurrentItem(4);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            com.saterskog.b.a.b("onActivityResult handled by IABUtil.");
        }
    }

    public final void a(e eVar, c cVar) {
        com.saterskog.b.a.b("onConsumeFinished called");
        if (cVar.a()) {
            com.saterskog.b.a.b("cosnume is success");
            FileOutputStream fileOutputStream = null;
            try {
                fileOutputStream = openFileOutput("consumptions", 32768);
            } catch (FileNotFoundException e2) {
                com.saterskog.b.a.a("onConsumeFinished", (Throwable) e2);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
            try {
                bufferedWriter.newLine();
                bufferedWriter.write(eVar.g);
                com.saterskog.b.a.b("wrote payload: " + eVar.g);
                bufferedWriter.close();
                fileOutputStream.close();
            } catch (IOException e3) {
                com.saterskog.b.a.a("onConsumeFinished2", (Throwable) e3);
            }
        } else {
            com.saterskog.b.a.b("received erroneous consumption");
        }
        a();
    }

    public class a extends android.support.a.a.d {
        public a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        public final Fragment a(int i) {
            return l.this.a(i);
        }

        public final int b() {
            return 5;
        }

        public final CharSequence b(int i) {
            return l.this.b(i);
        }
    }

    public final void a(short s) {
        if (this.e) {
            if (this.f == null) {
                b();
            }
            this.f.play(this.g[s], 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }
}
