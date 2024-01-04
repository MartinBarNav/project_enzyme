// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.math.BigInteger;
import java.util.Locale;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import android.text.TextUtils;
import java.io.IOException;
import com.google.android.gms.common.b;
import android.content.Context;
import com.google.android.gms.a.a.a;

final class i implements am
{
    private static Object a;
    private static i b;
    private a.a c;
    private long d;
    private Context e;
    private String f;
    private boolean g;
    private Object h;
    
    static {
        i.a = new Object();
    }
    
    private i(final Context context) {
        this.g = false;
        this.h = new Object();
        this.e = context.getApplicationContext();
    }
    
    private a.a a() {
        Object a = null;
        try {
            a = com.google.android.gms.a.a.a.a(this.e);
            return (a.a)a;
        }
        catch (IllegalStateException ex) {
            n.d("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
            return (a.a)a;
        }
        catch (b b) {
            n.d("GooglePlayServicesRepairableException getting Ad Id Info");
            return (a.a)a;
        }
        catch (IOException ex2) {
            n.d("IOException getting Ad Id Info");
            return (a.a)a;
        }
        catch (com.google.android.gms.common.a a2) {
            n.d("GooglePlayServicesNotAvailableException getting Ad Id Info");
            return (a.a)a;
        }
        catch (Throwable t) {
            n.d("Unknown exception. Could not get the ad Id.");
            return (a.a)a;
        }
    }
    
    public static am a(final Context context) {
        Label_0033: {
            if (i.b != null) {
                break Label_0033;
            }
            synchronized (i.a) {
                if (i.b == null) {
                    i.b = new i(context);
                }
                return i.b;
            }
        }
    }
    
    private boolean a(final a.a a, a.a a2) {
        StringBuilder sb = null;
        if (a2 == null) {
            a2 = null;
        }
        else {
            a2 = ((a.a)a2).a;
        }
        boolean b;
        if (TextUtils.isEmpty((CharSequence)a2)) {
            b = true;
        }
        else {
            // monitorexit(o)
            ag a3 = null;
            String a4 = null;
            final a.a a5;
            Label_0221: {
                while (true) {
                    ag.a(this.e);
                    a3 = ag.a();
                    a4 = a3.a("&cid");
                    while (true) {
                        synchronized (this.h) {
                            if (!this.g) {
                                this.f = b(this.e);
                                this.g = true;
                                if (TextUtils.isEmpty((CharSequence)b((String)a2 + a4))) {
                                    b = false;
                                    return b;
                                }
                                break Label_0221;
                            }
                        }
                        if (!TextUtils.isEmpty((CharSequence)this.f)) {
                            continue;
                        }
                        Serializable a6;
                        if (a5 == null) {
                            a6 = sb;
                        }
                        else {
                            a6 = a5.a;
                        }
                        if (a6 == null) {
                            break;
                        }
                        sb = new StringBuilder();
                        this.f = b(sb.append((String)a6).append(a4).toString());
                        continue;
                    }
                }
                b = this.c((String)a2 + a4);
                return b;
            }
            if (((String)a5).equals(this.f)) {
                // monitorexit(o)
                b = true;
            }
            else {
                String b2;
                if (!TextUtils.isEmpty((CharSequence)this.f)) {
                    n.c("Resetting the client id because Advertising Id changed.");
                    b2 = a3.b();
                    n.c("New client Id: " + b2);
                }
                else {
                    b2 = a4;
                }
                b = this.c((String)a2 + b2);
            }
            // monitorexit(o)
        }
        return b;
    }
    
    private static String b(Context o) {
        final IOException ex = null;
        final IOException ex2 = null;
        FileInputStream openFileInput = null;
        try {
            openFileInput = ((Context)o).openFileInput("gaClientIdData");
            final int read = openFileInput.read(new byte[128], 0, 128);
            if (openFileInput.available() > 0) {
                n.d("Hash file seems corrupted, deleting it.");
                openFileInput.close();
                ((Context)o).deleteFile("gaClientIdData");
                o = ex2;
            }
            else {
                if (read > 0) {
                    goto Label_0082;
                }
                n.b("Hash file is empty.");
                openFileInput.close();
                o = ex2;
            }
            return (String)o;
        }
        catch (FileNotFoundException ex4) {
            o = ex2;
            return (String)o;
        }
        catch (IOException ex3) {
            ex3 = ex;
        }
        while (true) {
            try {
                openFileInput.close();
                final IOException ex3;
                o = ex3;
                return (String)o;
                n.d("Error reading Hash file, deleting it.");
                ((Context)o).deleteFile("gaClientIdData");
                o = ex3;
                return (String)o;
            }
            catch (IOException ex2) {
                continue;
            }
            catch (FileNotFoundException ex5) {
                final IOException ex3;
                o = ex3;
                return (String)o;
            }
            break;
        }
    }
    
    private static String b(String format) {
        final MessageDigest e = w.e("MD5");
        if (e == null) {
            format = null;
        }
        else {
            format = String.format(Locale.US, "%032X", new BigInteger(1, e.digest(format.getBytes())));
        }
        return format;
    }
    
    private boolean c(String b) {
        boolean b2 = false;
        try {
            b = b(b);
            n.c("Storing hashed adid.");
            final FileOutputStream openFileOutput = this.e.openFileOutput("gaClientIdData", 0);
            openFileOutput.write(b.getBytes());
            openFileOutput.close();
            this.f = b;
            b2 = true;
            return b2;
        }
        catch (FileNotFoundException ex) {
            n.a("Error creating hash file.");
            return b2;
        }
        catch (IOException ex2) {
            n.a("Error writing to hash file.");
            return b2;
        }
    }
    
    @Override
    public final String a(String a) {
        final long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.d > 1000L) {
            final a.a a2 = this.a();
            if (this.a(this.c, a2)) {
                this.c = a2;
            }
            else {
                this.c = new a.a("", false);
            }
            this.d = currentTimeMillis;
        }
        if (this.c == null) {
            return null;
        }
        if ("&adid".equals(a)) {
            a = this.c.a;
        }
        else {
            if (!"&ate".equals(a)) {
                return null;
            }
            if (this.c.b) {
                a = "0";
            }
            else {
                a = "1";
            }
        }
        return a;
        a = null;
        return a;
    }
}
