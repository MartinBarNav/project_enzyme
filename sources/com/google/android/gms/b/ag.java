package com.google.android.gms.b;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

final class ag implements am {
    private static ag a;
    private static final Object b = new Object();
    private final Context c;
    /* access modifiers changed from: private */
    public String d;
    /* access modifiers changed from: private */
    public boolean e = false;
    /* access modifiers changed from: private */
    public final Object f = new Object();

    public static ag a() {
        ag agVar;
        synchronized (b) {
            agVar = a;
        }
        return agVar;
    }

    public static void a(Context context) {
        synchronized (b) {
            if (a == null) {
                a = new ag(context);
            }
        }
    }

    private boolean b(String str) {
        try {
            n.c("Storing clientId.");
            FileOutputStream openFileOutput = this.c.openFileOutput("gaClientId", 0);
            openFileOutput.write(str.getBytes());
            openFileOutput.close();
            return true;
        } catch (FileNotFoundException e2) {
            n.a("Error creating clientId file.");
            return false;
        } catch (IOException e3) {
            n.a("Error writing to clientId file.");
            return false;
        }
    }

    private String d() {
        if (!this.e) {
            synchronized (this.f) {
                if (!this.e) {
                    n.c("Waiting for clientId to load");
                    do {
                        try {
                            this.f.wait();
                        } catch (InterruptedException e2) {
                            n.a("Exception while waiting for clientId: " + e2);
                        }
                    } while (!this.e);
                }
            }
        }
        n.c("Loaded clientId");
        return this.d;
    }

    private String e() {
        String lowerCase = UUID.randomUUID().toString().toLowerCase();
        try {
            return !b(lowerCase) ? "0" : lowerCase;
        } catch (Exception e2) {
            return null;
        }
    }

    public final String a(String str) {
        if ("&cid".equals(str)) {
            return d();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final String b() {
        String str;
        synchronized (this.f) {
            this.d = e();
            str = this.d;
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public final String c() {
        String str = null;
        try {
            FileInputStream openFileInput = this.c.openFileInput("gaClientId");
            byte[] bArr = new byte[128];
            int read = openFileInput.read(bArr, 0, 128);
            if (openFileInput.available() > 0) {
                n.a("clientId file seems corrupted, deleting it.");
                openFileInput.close();
                this.c.deleteFile("gaClientId");
            } else if (read <= 0) {
                n.a("clientId file seems empty, deleting it.");
                openFileInput.close();
                this.c.deleteFile("gaClientId");
            } else {
                String str2 = new String(bArr, 0, read);
                try {
                    openFileInput.close();
                    n.c("Loaded client id from disk.");
                    str = str2;
                } catch (FileNotFoundException e2) {
                    str = str2;
                } catch (IOException e3) {
                    str = str2;
                    n.a("Error reading clientId file, deleting it.");
                    this.c.deleteFile("gaClientId");
                }
            }
        } catch (FileNotFoundException e4) {
        } catch (IOException e5) {
            n.a("Error reading clientId file, deleting it.");
            this.c.deleteFile("gaClientId");
        }
        return str == null ? e() : str;
    }

    private ag(Context context) {
        this.c = context;
        new Thread("client_id_fetcher") {
            public final void run() {
                synchronized (ag.this.f) {
                    String unused = ag.this.d = ag.this.c();
                    boolean unused2 = ag.this.e = true;
                    ag.this.f.notifyAll();
                }
            }
        }.start();
    }
}
