/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.b.am;
import com.google.android.gms.b.n;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

final class ag
implements am {
    private static ag a;
    private static final Object b;
    private final Context c;
    private String d;
    private boolean e = false;
    private final Object f = new Object();

    static {
        b = new Object();
    }

    private ag(Context context) {
        this.c = context;
        new Thread("client_id_fetcher"){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public final void run() {
                Object object = ag.this.f;
                synchronized (object) {
                    ag.a(ag.this, ag.this.c());
                    ag.b(ag.this);
                    ag.this.f.notifyAll();
                    return;
                }
            }
        }.start();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ag a() {
        Object object = b;
        synchronized (object) {
            return a;
        }
    }

    static /* synthetic */ String a(ag ag2, String string) {
        ag2.d = string;
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context) {
        Object object = b;
        synchronized (object) {
            if (a == null) {
                ag ag2;
                a = ag2 = new ag(context);
            }
            return;
        }
    }

    static /* synthetic */ boolean b(ag ag2) {
        ag2.e = true;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(String string) {
        boolean bl = false;
        try {
            n.c("Storing clientId.");
            FileOutputStream fileOutputStream = this.c.openFileOutput("gaClientId", 0);
            fileOutputStream.write(string.getBytes());
            fileOutputStream.close();
            return true;
        }
        catch (FileNotFoundException fileNotFoundException) {
            n.a("Error creating clientId file.");
            return bl;
        }
        catch (IOException iOException) {
            n.a("Error writing to clientId file.");
            return bl;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String d() {
        if (!this.e) {
            Object object = this.f;
            synchronized (object) {
                if (!this.e) {
                    n.c("Waiting for clientId to load");
                    do {
                        try {
                            this.f.wait();
                        }
                        catch (InterruptedException interruptedException) {
                            StringBuilder stringBuilder = new StringBuilder("Exception while waiting for clientId: ");
                            n.a(stringBuilder.append(interruptedException).toString());
                        }
                    } while (!this.e);
                }
            }
        }
        n.c("Loaded clientId");
        return this.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String e() {
        String string;
        String string2 = string = UUID.randomUUID().toString().toLowerCase();
        try {
            if (this.b(string)) return string2;
            return "0";
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final String a(String string) {
        if (!"&cid".equals(string)) return null;
        return this.d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final String b() {
        Object object = this.f;
        synchronized (object) {
            this.d = this.e();
            return this.d;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    final String c() {
        Object object;
        Object object2;
        block9: {
            int n2;
            FileInputStream fileInputStream;
            byte[] arrby = null;
            object2 = null;
            try {
                fileInputStream = this.c.openFileInput("gaClientId");
                object = new byte[128];
                n2 = fileInputStream.read((byte[])object, 0, 128);
                if (fileInputStream.available() > 0) {
                    n.a("clientId file seems corrupted, deleting it.");
                    fileInputStream.close();
                    this.c.deleteFile("gaClientId");
                    object = object2;
                    break block9;
                }
                if (n2 <= 0) {
                    n.a("clientId file seems empty, deleting it.");
                    fileInputStream.close();
                    this.c.deleteFile("gaClientId");
                    object = object2;
                }
            }
            catch (FileNotFoundException fileNotFoundException) {
                object = object2;
            }
            object = new String((byte[])object, 0, n2);
            fileInputStream.close();
            n.c("Loaded client id from disk.");
            break block9;
            catch (IOException iOException) {
                block10: {
                    object = arrby;
                    break block10;
                    catch (IOException iOException2) {}
                }
                n.a("Error reading clientId file, deleting it.");
                this.c.deleteFile("gaClientId");
            }
            break block9;
            catch (FileNotFoundException fileNotFoundException) {}
        }
        object2 = object;
        if (object != null) return object2;
        return this.e();
    }
}

