/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  org.apache.http.Header
 *  org.apache.http.HttpEntity
 *  org.apache.http.HttpEntityEnclosingRequest
 *  org.apache.http.HttpHost
 *  org.apache.http.HttpRequest
 *  org.apache.http.client.ClientProtocolException
 *  org.apache.http.client.HttpClient
 *  org.apache.http.entity.ByteArrayEntity
 *  org.apache.http.entity.StringEntity
 *  org.apache.http.message.BasicHttpEntityEnclosingRequest
 */
package com.google.android.gms.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.b.ae;
import com.google.android.gms.b.ah;
import com.google.android.gms.b.ak;
import com.google.android.gms.b.an;
import com.google.android.gms.b.k;
import com.google.android.gms.b.l;
import com.google.android.gms.b.n;
import com.google.android.gms.b.o;
import com.google.android.gms.b.w;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

public final class ad
implements an {
    private final String a;
    private final HttpClient b;
    private final Context c;
    private URL d;
    private int e;
    private int f;
    private int g;
    private String h;
    private String i;
    private ae j;
    private ah k;
    private Set<Integer> l = new HashSet<Integer>();
    private boolean m = false;
    private long n;
    private long o;
    private ak p;
    private volatile boolean q = false;

    ad(HttpClient httpClient, Context context, ak ak2) {
        this.c = context.getApplicationContext();
        this.p = ak2;
        this.a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", "4.0", Build.VERSION.RELEASE, w.a(Locale.getDefault()), Build.MODEL, Build.ID);
        this.b = httpClient;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int a(List<k> list, int n2) {
        if (list.isEmpty()) {
            return 0;
        }
        int n3 = n2;
        if (n2 > list.size()) {
            n3 = list.size();
        }
        int n4 = n3 - 1;
        long l2 = 0L;
        n2 = n3;
        n3 = n4;
        while (true) {
            n4 = n2;
            if (n3 <= 0) return n4;
            k k2 = list.get(n3 - 1);
            k k3 = list.get(n3);
            long l3 = k2.c;
            long l4 = k3.c;
            if (l3 != 0L && l4 != 0L && l4 - l3 > l2) {
                l2 = l4 - l3;
                n2 = n3;
            }
            --n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String a(k object, List<String> object2, ae object3) {
        if (object3 == ae.a) {
            object2 = ((k)object).a == null || ((k)object).a.length() == 0 ? "" : ((k)object).a;
            long l2 = System.currentTimeMillis();
            if (!TextUtils.isEmpty((CharSequence)object2)) return com.google.android.gms.b.l.a((k)object, l2);
            return "";
        }
        object = "";
        object3 = object2.iterator();
        while (object3.hasNext()) {
            String string = (String)object3.next();
            if (string.length() == 0) continue;
            object2 = object;
            if (((String)object).length() != 0) {
                object2 = (String)object + "\n";
            }
            object = (String)object2 + string;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private URL a(k object) {
        if (this.d != null) {
            return this.d;
        }
        object = ((k)object).e;
        try {
            object = "http:".equals(object) ? "http://www.google-analytics.com/collect" : "https://ssl.google-analytics.com/collect";
            URL uRL = new URL((String)object);
            return uRL;
        }
        catch (MalformedURLException malformedURLException) {
            com.google.android.gms.b.n.a("Error trying to parse the hardcoded host url. This really shouldn't happen.");
            return null;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void a(o o2, HttpHost httpHost, ae object, ah object2) {
        o2.a("_bs", ((Enum)object).toString());
        o2.a("_cs", ((Enum)object2).toString());
        if (!o2.c) {
            object = "";
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append(o2.d);
            for (String string : o2.a.keySet()) {
                ((StringBuilder)object).append("&").append(string).append("=").append(o2.a.get(string));
            }
            for (String string : o2.b.keySet()) {
                ((StringBuilder)object).append("&").append(string).append("=").append(o2.b.get(string));
            }
            object = ((StringBuilder)object).toString();
        }
        if (TextUtils.isEmpty((CharSequence)object)) {
            return;
        }
        if (httpHost == null) {
            object2 = new URL("https://ssl.google-analytics.com");
            httpHost = new HttpHost(((URL)object2).getHost(), ((URL)object2).getPort(), ((URL)object2).getProtocol());
        }
        this.a((String)object, httpHost, 1, o2, ah.a);
        return;
        catch (MalformedURLException malformedURLException) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a(HttpEntityEnclosingRequest object) {
        int n2;
        StringBuffer stringBuffer = new StringBuffer();
        Object object2 = object.getAllHeaders();
        int n3 = ((Header[])object2).length;
        for (n2 = 0; n2 < n3; ++n2) {
            stringBuffer.append(object2[n2].toString()).append("\n");
        }
        stringBuffer.append(object.getRequestLine().toString()).append("\n");
        if (object.getEntity() != null) {
            try {
                object2 = object.getEntity().getContent();
                if (object2 != null && (n2 = ((InputStream)object2).available()) > 0) {
                    byte[] arrby = new byte[n2];
                    ((InputStream)object2).read(arrby);
                    stringBuffer.append("POST:\n");
                    object2 = new String(arrby);
                    stringBuffer.append((String)object2).append("\n");
                }
            }
            catch (IOException iOException) {
                com.google.android.gms.b.n.d("Error Writing hit to log...");
            }
        }
        com.google.android.gms.b.n.b(stringBuffer.toString());
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private boolean a(String string, HttpHost object, int n2, o o2, ah object2) {
        boolean bl;
        block19: {
            int n3;
            String string2;
            bl = true;
            boolean bl2 = n2 > 1;
            if (string.getBytes().length > this.g || string.getBytes().length > this.f) {
                com.google.android.gms.b.n.d("Request too long (> " + Math.min(this.f, this.g) + " bytes)--not sent");
                return bl;
            }
            if (this.q) {
                com.google.android.gms.b.n.b("Dry run enabled. Hit not actually sent.");
                return bl;
            }
            if (TextUtils.isEmpty((CharSequence)string)) {
                System.out.println("Empty hit, discarding.");
                string2 = null;
            } else {
                string2 = this.h + "?" + string;
                string2 = string2.length() < this.e && !bl2 ? new BasicHttpEntityEnclosingRequest("GET", string2) : (bl2 ? new BasicHttpEntityEnclosingRequest("POST", this.i) : new BasicHttpEntityEnclosingRequest("POST", this.h));
                string2.addHeader("User-Agent", this.a);
            }
            boolean bl3 = bl;
            if (string2 == null) return bl3;
            if (string2.getRequestLine().getMethod().equals("GET")) {
                n2 = string.getBytes().length;
                n3 = string.getBytes().length;
            } else {
                switch (1.a[((Enum)object2).ordinal()]) {
                    default: {
                        n2 = string.getBytes().length;
                        object2 = new StringEntity(string);
                        string2.setEntity((HttpEntity)object2);
                        break;
                    }
                    case 1: {
                        object2 = new ByteArrayOutputStream();
                        Object object3 = new GZIPOutputStream((OutputStream)object2);
                        ((FilterOutputStream)object3).write(string.getBytes());
                        ((DeflaterOutputStream)object3).close();
                        object3 = ((ByteArrayOutputStream)object2).toByteArray();
                        n2 = ((Object)object3).length + 0;
                        object2 = new ByteArrayEntity((byte[])object3);
                        string2.setEntity((HttpEntity)object2);
                        string2.addHeader("Content-Encoding", "gzip");
                    }
                }
                int n4 = string.getBytes().length;
                n3 = n2;
                n2 = n4;
            }
            string2.addHeader("Host", object.toHostString());
            if (com.google.android.gms.b.n.a()) {
                ad.a((HttpEntityEnclosingRequest)string2);
            }
            string = this.b.execute((HttpHost)object, (HttpRequest)string2);
            o2.a("_td", n2);
            o2.a("_cd", n3);
            n2 = string.getStatusLine().getStatusCode();
            object = string.getEntity();
            if (object != null) {
                object.consumeContent();
            }
            bl3 = bl;
            if (n2 == 200) return bl3;
            if (bl2 && this.l.contains(n2)) {
                com.google.android.gms.b.n.b("Falling back to single hit per request mode.");
                this.m = true;
                this.n = System.currentTimeMillis();
                return false;
            }
            break block19;
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                com.google.android.gms.b.n.a("Encoding error, hit will be discarded");
                return bl;
            }
            catch (IOException iOException) {
                com.google.android.gms.b.n.a("Unexpected IOException: " + iOException.getMessage());
                com.google.android.gms.b.n.a("Request will be discarded");
                return bl;
            }
        }
        try {
            object = new StringBuilder("Bad response: ");
            com.google.android.gms.b.n.d(((StringBuilder)object).append(string.getStatusLine().getStatusCode()).toString());
            return bl;
        }
        catch (ClientProtocolException clientProtocolException) {
            com.google.android.gms.b.n.d("ClientProtocolException sending hit; discarding hit...");
            return bl;
        }
        catch (IOException iOException) {
            com.google.android.gms.b.n.d("Exception sending hit: " + iOException.getClass().getSimpleName());
            com.google.android.gms.b.n.d(iOException.getMessage());
            return false;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int b(List<k> list, int n2) {
        if (list.isEmpty()) {
            return 0;
        }
        int n3 = n2 - 1;
        while (true) {
            int n4 = n2;
            if (n3 <= 0) return n4;
            String string = list.get((int)n3).a;
            if (!TextUtils.isEmpty((CharSequence)string)) {
                if (string.contains("sc=start")) {
                    return n3;
                }
                if (string.contains("sc=end")) {
                    return n3 + 1;
                }
            }
            --n3;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final int a(List<k> var1_1, o var2_2, boolean var3_3) {
        block26: {
            this.e = 2036;
            this.f = 8192;
            this.g = 8192;
            this.h = this.p.a();
            this.i = this.p.b();
            this.j = this.p.c();
            this.k = this.p.d();
            this.l.clear();
            this.l.addAll(this.p.e());
            this.o = 3600L;
            if (!this.m && this.l.isEmpty()) {
                this.m = true;
                this.n = System.currentTimeMillis();
            }
            if (this.m && System.currentTimeMillis() - this.n > 1000L * this.o) {
                this.m = false;
            }
            if (this.m) {
                var4_4 = ae.a;
                var5_5 = ah.a;
            } else {
                var4_4 = this.j;
                var5_5 = this.k;
            }
            var6_6 = 0;
            var7_7 = Math.min(var1_1.size(), 20);
            var2_2.a("_hr", var1_1.size());
            var8_8 = System.currentTimeMillis();
            var10_9 = new ArrayList<HttpHost>();
            var11_10 = new ArrayList<Long>();
            var12_11 = 0L;
            if (var4_4 == ae.a) {
                var15_13 = 0;
            } else {
                var14_12 = var1_1.iterator();
                var15_13 = 0;
                while (var14_12.hasNext()) {
                    var16_14 /* !! */  = var14_12.next();
                    var16_14 /* !! */  = TextUtils.isEmpty((CharSequence)var16_14 /* !! */ .a) != false ? "" : com.google.android.gms.b.l.a((k)var16_14 /* !! */ , var8_8);
                    var17_15 = var16_14 /* !! */ ;
                    if (var16_14 /* !! */ .getBytes().length > this.f) {
                        var17_15 = "";
                    }
                    var10_9.add(var17_15);
                    var18_16 = var12_11;
                    if (!TextUtils.isEmpty(var17_15)) {
                        var20_17 = var17_15.getBytes().length;
                        var21_18 = var15_13 == 0 ? 0 : 1;
                        var18_16 = var12_11 + (long)(var21_18 + var20_17);
                    }
                    var11_10.add(var18_16);
                    var21_18 = var18_16 <= (long)this.g ? var15_13 + 1 : var15_13;
                    if (var21_18 == var7_7) {
                        var7_7 = 1;
                        var12_11 = var18_16;
                        var15_13 = var21_18;
                        break block26;
                    }
                    var15_13 = var21_18;
                    var12_11 = var18_16;
                }
                var7_7 = 1;
            }
        }
        while (var15_13 > 1 && (Long)var11_10.get(var15_13 - 1) > (long)this.g) {
            --var15_13;
        }
        if (var12_11 <= (long)this.g) ** GOTO lbl-1000
        switch (1.b[var4_4.ordinal()]) {
            default: {
                com.google.android.gms.b.n.d("Unexpected batching strategy encountered; sending a single hit.");
                var16_14 /* !! */  = (String)var10_9.get(0);
                var10_9.clear();
                var10_9.add(var16_14 /* !! */ );
                var21_18 = 1;
                break;
            }
            case 1: {
                var21_18 = var20_17 = var10_9.size() / 2;
                if (var15_13 > var20_17) break;
                var21_18 = var15_13;
                break;
            }
            case 2: {
                var21_18 = ad.a(var1_1, var15_13);
                break;
            }
            case 3: {
                var21_18 = ad.b(var1_1, var15_13);
                break;
            }
            case 4: {
                if (var12_11 < (long)(this.g * 2)) {
                    for (var21_18 = var11_10.size() - 1; var21_18 > 0 && (Long)var11_10.get(var21_18) > var12_11 / 2L; --var21_18) {
                    }
                    break;
                }
                var21_18 = var15_13;
                break;
            }
            case 5: {
                var21_18 = var15_13;
            }
        }
        if (var21_18 < var10_9.size()) {
            var16_14 /* !! */  = var10_9.subList(0, var21_18);
        } else lbl-1000:
        // 2 sources

        {
            var16_14 /* !! */  = var10_9;
        }
        var21_18 = 0;
        var17_15 = null;
        var15_13 = var6_6;
        for (var20_17 = 0; var20_17 < var7_7; ++var20_17) {
            var10_9 = var1_1.get(var20_17);
            var14_12 = this.a((k)var10_9);
            var6_6 = Math.max(1, var16_14 /* !! */ .size());
            if (var14_12 == null) {
                com.google.android.gms.b.n.d("No destination: discarding hit.");
                var21_18 += var6_6;
                var15_13 += var6_6;
                continue;
            }
            var17_15 = new HttpHost(var14_12.getHost(), var14_12.getPort(), var14_12.getProtocol());
            if (!this.a(ad.a((k)var10_9, (List<String>)var16_14 /* !! */ , var4_4), var17_15, var6_6, var2_2, var5_5)) {
                var2_2.a("_de", 1);
                var2_2.a("_hd", var21_18);
                var2_2.a("_hs", var15_13);
                this.a(var2_2, var17_15, var4_4, var5_5);
                return var15_13;
            }
            var10_9 = var16_14 /* !! */ .iterator();
            while (var10_9.hasNext()) {
                if (!TextUtils.isEmpty((CharSequence)((String)var10_9.next()))) continue;
                ++var21_18;
            }
            var2_2.a("_rs", 1);
            var15_13 += var6_6;
        }
        var2_2.a("_hd", var21_18);
        var2_2.a("_hs", var15_13);
        if (var3_3 == false) return var15_13;
        this.a(var2_2, var17_15, var4_4, var5_5);
        return var15_13;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void a(String string) {
        try {
            URL uRL;
            this.d = uRL = new URL(string);
            return;
        }
        catch (MalformedURLException malformedURLException) {
            this.d = null;
            return;
        }
    }

    @Override
    public final void a(boolean bl) {
        this.q = bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a() {
        NetworkInfo networkInfo = ((ConnectivityManager)this.c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkInfo != null) {
            if (networkInfo.isConnected()) return true;
        }
        com.google.android.gms.b.n.c("...no network connectivity");
        return false;
    }
}

