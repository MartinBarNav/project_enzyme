package com.google.android.gms.b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.a.a.a;
import com.google.android.gms.common.b;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

final class i implements am {
    private static Object a = new Object();
    private static i b;
    private a.C0021a c;
    private long d;
    private Context e;
    private String f;
    private boolean g = false;
    private Object h = new Object();

    private i(Context context) {
        this.e = context.getApplicationContext();
    }

    private a.C0021a a() {
        try {
            return a.a(this.e);
        } catch (IllegalStateException e2) {
            n.d("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
            return null;
        } catch (b e3) {
            n.d("GooglePlayServicesRepairableException getting Ad Id Info");
            return null;
        } catch (IOException e4) {
            n.d("IOException getting Ad Id Info");
            return null;
        } catch (com.google.android.gms.common.a e5) {
            n.d("GooglePlayServicesNotAvailableException getting Ad Id Info");
            return null;
        } catch (Throwable th) {
            n.d("Unknown exception. Could not get the ad Id.");
            return null;
        }
    }

    public static am a(Context context) {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new i(context);
                }
            }
        }
        return b;
    }

    private static String b(Context context) {
        String str = null;
        try {
            FileInputStream openFileInput = context.openFileInput("gaClientIdData");
            byte[] bArr = new byte[128];
            int read = openFileInput.read(bArr, 0, 128);
            if (openFileInput.available() > 0) {
                n.d("Hash file seems corrupted, deleting it.");
                openFileInput.close();
                context.deleteFile("gaClientIdData");
                return null;
            } else if (read <= 0) {
                n.b("Hash file is empty.");
                openFileInput.close();
                return null;
            } else {
                String str2 = new String(bArr, 0, read);
                try {
                    openFileInput.close();
                    return str2;
                } catch (FileNotFoundException e2) {
                    return str2;
                } catch (IOException e3) {
                    str = str2;
                    n.d("Error reading Hash file, deleting it.");
                    context.deleteFile("gaClientIdData");
                    return str;
                }
            }
        } catch (FileNotFoundException e4) {
            return null;
        } catch (IOException e5) {
            n.d("Error reading Hash file, deleting it.");
            context.deleteFile("gaClientIdData");
            return str;
        }
    }

    private static String b(String str) {
        MessageDigest e2 = w.e("MD5");
        if (e2 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, e2.digest(str.getBytes()))});
    }

    private boolean c(String str) {
        try {
            String b2 = b(str);
            n.c("Storing hashed adid.");
            FileOutputStream openFileOutput = this.e.openFileOutput("gaClientIdData", 0);
            openFileOutput.write(b2.getBytes());
            openFileOutput.close();
            this.f = b2;
            return true;
        } catch (FileNotFoundException e2) {
            n.a("Error creating hash file.");
            return false;
        } catch (IOException e3) {
            n.a("Error writing to hash file.");
            return false;
        }
    }

    public final String a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.d > 1000) {
            a.C0021a a2 = a();
            if (a(this.c, a2)) {
                this.c = a2;
            } else {
                this.c = new a.C0021a("", false);
            }
            this.d = currentTimeMillis;
        }
        if (this.c != null) {
            if ("&adid".equals(str)) {
                return this.c.a;
            }
            if ("&ate".equals(str)) {
                return this.c.b ? "0" : "1";
            }
        }
        return null;
    }

    private boolean a(a.C0021a aVar, a.C0021a aVar2) {
        String str;
        String str2 = null;
        String str3 = aVar2 == null ? null : aVar2.a;
        if (TextUtils.isEmpty(str3)) {
            return true;
        }
        ag.a(this.e);
        ag a2 = ag.a();
        String a3 = a2.a("&cid");
        synchronized (this.h) {
            if (!this.g) {
                this.f = b(this.e);
                this.g = true;
            } else if (TextUtils.isEmpty(this.f)) {
                if (aVar != null) {
                    str2 = aVar.a;
                }
                if (str2 == null) {
                    boolean c2 = c(str3 + a3);
                    return c2;
                }
                this.f = b(str2 + a3);
            }
            String b2 = b(str3 + a3);
            if (TextUtils.isEmpty(b2)) {
                return false;
            }
            if (b2.equals(this.f)) {
                return true;
            }
            if (!TextUtils.isEmpty(this.f)) {
                n.c("Resetting the client id because Advertising Id changed.");
                str = a2.b();
                n.c("New client Id: " + str);
            } else {
                str = a3;
            }
            boolean c3 = c(str3 + str);
            return c3;
        }
    }
}
