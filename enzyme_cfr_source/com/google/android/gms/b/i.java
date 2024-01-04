/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.google.android.gms.b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.a.a.a;
import com.google.android.gms.b.ag;
import com.google.android.gms.b.am;
import com.google.android.gms.b.n;
import com.google.android.gms.b.w;
import com.google.android.gms.common.b;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

final class i
implements am {
    private static Object a = new Object();
    private static i b;
    private a.a c;
    private long d;
    private Context e;
    private String f;
    private boolean g = false;
    private Object h = new Object();

    private i(Context context) {
        this.e = context.getApplicationContext();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private a.a a() {
        a.a a2 = null;
        try {
            a.a a3 = com.google.android.gms.a.a.a.a(this.e);
            return a3;
        }
        catch (IllegalStateException illegalStateException) {
            n.d("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
            return a2;
        }
        catch (b b2) {
            n.d("GooglePlayServicesRepairableException getting Ad Id Info");
            return a2;
        }
        catch (IOException iOException) {
            n.d("IOException getting Ad Id Info");
            return a2;
        }
        catch (com.google.android.gms.common.a a4) {
            n.d("GooglePlayServicesNotAvailableException getting Ad Id Info");
            return a2;
        }
        catch (Throwable throwable) {
            n.d("Unknown exception. Could not get the ad Id.");
            return a2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static am a(Context context) {
        if (b == null) {
            Object object = a;
            synchronized (object) {
                if (b == null) {
                    i i2;
                    b = i2 = new i(context);
                }
            }
        }
        return b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean a(a.a object, a.a object2) {
        StringBuilder stringBuilder = null;
        if (TextUtils.isEmpty((CharSequence)(object2 = object2 == null ? null : ((a.a)object2).a))) {
            return true;
        }
        ag.a(this.e);
        ag ag2 = ag.a();
        CharSequence charSequence = ag2.a("&cid");
        Object object3 = this.h;
        synchronized (object3) {
            if (!this.g) {
                this.f = i.b(this.e);
                this.g = true;
            } else if (TextUtils.isEmpty((CharSequence)this.f)) {
                if ((object = object == null ? stringBuilder : ((a.a)object).a) == null) {
                    object = new StringBuilder();
                    return this.c(((StringBuilder)object).append((String)object2).append((String)charSequence).toString());
                }
                stringBuilder = new StringBuilder();
                this.f = i.b(stringBuilder.append((String)object).append((String)charSequence).toString());
            }
            object = new StringBuilder();
            if (TextUtils.isEmpty((CharSequence)(object = i.b(((StringBuilder)object).append((String)object2).append((String)charSequence).toString())))) {
                return false;
            }
            if (((String)object).equals(this.f)) {
                return true;
            }
            if (!TextUtils.isEmpty((CharSequence)this.f)) {
                n.c("Resetting the client id because Advertising Id changed.");
                object = ag2.b();
                charSequence = new StringBuilder("New client Id: ");
                n.c(((StringBuilder)charSequence).append((String)object).toString());
            } else {
                object = charSequence;
            }
            charSequence = new StringBuilder();
            return this.c(((StringBuilder)charSequence).append((String)object2).append((String)object).toString());
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static String b(Context object) {
        int n2;
        Object object2;
        FileInputStream fileInputStream;
        byte[] arrby = null;
        Object var2_4 = null;
        try {
            fileInputStream = object.openFileInput("gaClientIdData");
            object2 = new byte[128];
            n2 = fileInputStream.read((byte[])object2, 0, 128);
            if (fileInputStream.available() > 0) {
                n.d("Hash file seems corrupted, deleting it.");
                fileInputStream.close();
                object.deleteFile("gaClientIdData");
                return var2_4;
            }
            if (n2 <= 0) {
                n.b("Hash file is empty.");
                fileInputStream.close();
                return var2_4;
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            return var2_4;
        }
        object2 = new String((byte[])object2, 0, n2);
        try {
            fileInputStream.close();
        }
        catch (FileNotFoundException fileNotFoundException) {
            return object2;
        }
        return object2;
        catch (IOException iOException) {
            block8: {
                object2 = arrby;
                break block8;
                catch (IOException iOException2) {}
            }
            n.d("Error reading Hash file, deleting it.");
            object.deleteFile("gaClientIdData");
            return object2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String b(String string) {
        MessageDigest messageDigest = w.e("MD5");
        if (messageDigest != null) return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest(string.getBytes())));
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean c(String string) {
        boolean bl = false;
        try {
            string = i.b(string);
            n.c("Storing hashed adid.");
            FileOutputStream fileOutputStream = this.e.openFileOutput("gaClientIdData", 0);
            fileOutputStream.write(string.getBytes());
            fileOutputStream.close();
            this.f = string;
            return true;
        }
        catch (FileNotFoundException fileNotFoundException) {
            n.a("Error creating hash file.");
            return bl;
        }
        catch (IOException iOException) {
            n.a("Error writing to hash file.");
            return bl;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final String a(String string) {
        long l2 = System.currentTimeMillis();
        if (l2 - this.d > 1000L) {
            a.a a2 = this.a();
            this.c = this.a(this.c, a2) ? a2 : new a.a("", false);
            this.d = l2;
        }
        if (this.c == null) return null;
        if ("&adid".equals(string)) {
            return this.c.a;
        }
        if (!"&ate".equals(string)) return null;
        if (!this.c.b) return "1";
        return "0";
    }
}

