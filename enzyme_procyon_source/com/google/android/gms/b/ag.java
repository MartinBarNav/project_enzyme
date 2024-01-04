// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import java.io.FileInputStream;
import java.util.UUID;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import android.content.Context;

final class ag implements am
{
    private static ag a;
    private static final Object b;
    private final Context c;
    private String d;
    private boolean e;
    private final Object f;
    
    static {
        b = new Object();
    }
    
    private ag(final Context c) {
        this.e = false;
        this.f = new Object();
        this.c = c;
        new Thread("client_id_fetcher") {
            @Override
            public final void run() {
                synchronized (ag.this.f) {
                    ag.this.d = ag.this.c();
                    ag.this.e = true;
                    ag.this.f.notifyAll();
                }
            }
        }.start();
    }
    
    public static ag a() {
        synchronized (ag.b) {
            return ag.a;
        }
    }
    
    public static void a(final Context context) {
        synchronized (ag.b) {
            if (ag.a == null) {
                ag.a = new ag(context);
            }
        }
    }
    
    private boolean b(final String s) {
        boolean b = false;
        try {
            n.c("Storing clientId.");
            final FileOutputStream openFileOutput = this.c.openFileOutput("gaClientId", 0);
            openFileOutput.write(s.getBytes());
            openFileOutput.close();
            b = true;
            return b;
        }
        catch (FileNotFoundException ex) {
            n.a("Error creating clientId file.");
            return b;
        }
        catch (IOException ex2) {
            n.a("Error writing to clientId file.");
            return b;
        }
    }
    
    private String d() {
        Label_0042: {
            if (this.e) {
                break Label_0042;
            }
            synchronized (this.f) {
                Label_0040: {
                    if (this.e) {
                        break Label_0040;
                    }
                    n.c("Waiting for clientId to load");
                    try {
                        do {
                            this.f.wait();
                        } while (!this.e);
                        // monitorexit(this.f)
                        n.c("Loaded clientId");
                        return this.d;
                    }
                    catch (InterruptedException obj) {
                        n.a("Exception while waiting for clientId: " + obj);
                    }
                }
            }
        }
    }
    
    private String e() {
        String lowerCase = UUID.randomUUID().toString().toLowerCase();
        try {
            if (!this.b(lowerCase)) {
                lowerCase = "0";
            }
            return lowerCase;
        }
        catch (Exception ex) {
            lowerCase = null;
            return lowerCase;
        }
    }
    
    @Override
    public final String a(String d) {
        if ("&cid".equals(d)) {
            d = this.d();
        }
        else {
            d = null;
        }
        return d;
    }
    
    final String b() {
        synchronized (this.f) {
            return this.d = this.e();
        }
    }
    
    final String c() {
        final String s = null;
        String e = null;
    Label_0146_Outer:
        while (true) {
            FileInputStream openFileInput = null;
            try {
                openFileInput = this.c.openFileInput("gaClientId");
                final int read = openFileInput.read(new byte[128], 0, 128);
                String s2;
                if (openFileInput.available() > 0) {
                    n.a("clientId file seems corrupted, deleting it.");
                    openFileInput.close();
                    this.c.deleteFile("gaClientId");
                    s2 = e;
                }
                else {
                    if (read > 0) {
                        goto Label_0115;
                    }
                    n.a("clientId file seems empty, deleting it.");
                    openFileInput.close();
                    this.c.deleteFile("gaClientId");
                    s2 = e;
                }
                e = s2;
                if (s2 == null) {
                    e = this.e();
                }
                return e;
            }
            catch (FileNotFoundException ex) {
                final String s2 = e;
                continue;
            }
            catch (IOException s2) {
                s2 = s;
            }
            while (true) {
                try {
                    openFileInput.close();
                    n.c("Loaded client id from disk.");
                    continue Label_0146_Outer;
                    n.a("Error reading clientId file, deleting it.");
                    this.c.deleteFile("gaClientId");
                    continue Label_0146_Outer;
                }
                catch (IOException e) {
                    continue;
                }
                catch (FileNotFoundException e) {
                    continue Label_0146_Outer;
                }
                break;
            }
            break;
        }
    }
}
