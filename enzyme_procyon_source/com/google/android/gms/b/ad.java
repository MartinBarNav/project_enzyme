// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import java.io.UnsupportedEncodingException;
import org.apache.http.entity.ByteArrayEntity;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.ByteArrayOutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.HttpRequest;
import java.io.InputStream;
import org.apache.http.Header;
import java.io.IOException;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import java.net.MalformedURLException;
import java.util.Iterator;
import android.text.TextUtils;
import java.util.List;
import android.os.Build;
import java.util.Locale;
import android.os.Build$VERSION;
import java.util.HashSet;
import java.util.Set;
import java.net.URL;
import android.content.Context;
import org.apache.http.client.HttpClient;

public final class ad implements an
{
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
    private Set<Integer> l;
    private boolean m;
    private long n;
    private long o;
    private ak p;
    private volatile boolean q;
    
    ad(final HttpClient b, final Context context, final ak p3) {
        this.l = new HashSet<Integer>();
        this.m = false;
        this.q = false;
        this.c = context.getApplicationContext();
        this.p = p3;
        this.a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", "4.0", Build$VERSION.RELEASE, w.a(Locale.getDefault()), Build.MODEL, Build.ID);
        this.b = b;
    }
    
    private static int a(final List<k> list, int n) {
        int n2;
        if (list.isEmpty()) {
            n2 = 0;
        }
        else {
            int size;
            if ((size = n) > list.size()) {
                size = list.size();
            }
            final int n3 = size - 1;
            long n4 = 0L;
            n = size;
            int n5 = n3;
            while (true) {
                n2 = n;
                if (n5 <= 0) {
                    break;
                }
                final k k = list.get(n5 - 1);
                final k i = list.get(n5);
                final long c = k.c;
                final long c2 = i.c;
                if (c != 0L && c2 != 0L && c2 - c > n4) {
                    n4 = c2 - c;
                    n = n5;
                }
                --n5;
            }
        }
        return n2;
    }
    
    private static String a(final k k, final List<String> list, final ae ae) {
        String str;
        if (ae == ae.a) {
            String a;
            if (k.a == null || k.a.length() == 0) {
                a = "";
            }
            else {
                a = k.a;
            }
            final long currentTimeMillis = System.currentTimeMillis();
            if (TextUtils.isEmpty((CharSequence)a)) {
                str = "";
            }
            else {
                str = l.a(k, currentTimeMillis);
            }
        }
        else {
            str = "";
            for (final String str2 : list) {
                if (str2.length() != 0) {
                    String string = str;
                    if (str.length() != 0) {
                        string = str + "\n";
                    }
                    str = string + str2;
                }
            }
        }
        return str;
    }
    
    private URL a(final k k) {
        URL d;
        if (this.d != null) {
            d = this.d;
        }
        else {
            while (true) {
                final String e = k.e;
                while (true) {
                    Label_0056: {
                        try {
                            if (!"http:".equals(e)) {
                                break Label_0056;
                            }
                            final String spec = "http://www.google-analytics.com/collect";
                            d = new URL(spec);
                        }
                        catch (MalformedURLException ex) {
                            com.google.android.gms.b.n.a("Error trying to parse the hardcoded host url. This really shouldn't happen.");
                            d = null;
                        }
                        break;
                    }
                    final String spec = "https://ssl.google-analytics.com/collect";
                    continue;
                }
            }
        }
        return d;
    }
    
    private void a(final o o, HttpHost httpHost, final ae ae, final ah ah) {
        o.a("_bs", ae.toString());
        o.a("_cs", ah.toString());
        String string;
        if (!o.c) {
            string = "";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append(o.d);
            for (final String str : o.a.keySet()) {
                sb.append("&").append(str).append("=").append(o.a.get(str));
            }
            for (final String str2 : o.b.keySet()) {
                sb.append("&").append(str2).append("=").append(o.b.get(str2));
            }
            string = sb.toString();
        }
        if (!TextUtils.isEmpty((CharSequence)string)) {
            Label_0250: {
                if (httpHost != null) {
                    break Label_0250;
                }
                try {
                    final URL url = new URL("https://ssl.google-analytics.com");
                    httpHost = new HttpHost(url.getHost(), url.getPort(), url.getProtocol());
                    this.a(string, httpHost, 1, o, ah.a);
                }
                catch (MalformedURLException ex) {}
            }
        }
    }
    
    private static void a(final HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        final StringBuffer sb = new StringBuffer();
        final Header[] allHeaders = httpEntityEnclosingRequest.getAllHeaders();
        for (int length = allHeaders.length, i = 0; i < length; ++i) {
            sb.append(allHeaders[i].toString()).append("\n");
        }
        sb.append(httpEntityEnclosingRequest.getRequestLine().toString()).append("\n");
        while (true) {
            if (httpEntityEnclosingRequest.getEntity() == null) {
                break Label_0144;
            }
            try {
                final InputStream content = httpEntityEnclosingRequest.getEntity().getContent();
                if (content != null) {
                    final int available = content.available();
                    if (available > 0) {
                        final byte[] array = new byte[available];
                        content.read(array);
                        sb.append("POST:\n");
                        sb.append(new String(array)).append("\n");
                    }
                }
                n.b(sb.toString());
            }
            catch (IOException ex) {
                n.d("Error Writing hit to log...");
                continue;
            }
            break;
        }
    }
    
    private boolean a(final String str, final HttpHost httpHost, int i, final o o, final ah ah) {
        final boolean b = true;
        final boolean b2 = i > 1;
        boolean b3 = false;
        if (str.getBytes().length > this.g || str.getBytes().length > this.f) {
            com.google.android.gms.b.n.d("Request too long (> " + Math.min(this.f, this.g) + " bytes)--not sent");
            b3 = b;
        }
        else if (this.q) {
            com.google.android.gms.b.n.b("Dry run enabled. Hit not actually sent.");
            b3 = b;
        }
        else {
            Label_0308: {
                if (!TextUtils.isEmpty((CharSequence)str)) {
                    break Label_0308;
                }
                System.out.println("Empty hit, discarding.");
                Object o2 = null;
            Label_0166_Outer:
                while (true) {
                    b3 = b;
                    if (o2 == null) {
                        return b3;
                    }
                    Label_0428: {
                        if (!((HttpEntityEnclosingRequest)o2).getRequestLine().getMethod().equals("GET")) {
                            break Label_0428;
                        }
                        i = str.getBytes().length;
                        int length = str.getBytes().length;
                        HttpResponse execute;
                        HttpEntity entity;
                        ByteArrayOutputStream out;
                        GZIPOutputStream gzipOutputStream;
                        byte[] byteArray;
                        int length2;
                        String string;
                        Label_0635_Outer:Label_0368_Outer:Block_14_Outer:
                        while (true) {
                            ((HttpEntityEnclosingRequest)o2).addHeader("Host", httpHost.toHostString());
                            if (com.google.android.gms.b.n.a()) {
                                a((HttpEntityEnclosingRequest)o2);
                            }
                            try {
                                execute = this.b.execute(httpHost, (HttpRequest)o2);
                                o.a("_td", i);
                                o.a("_cd", length);
                                i = execute.getStatusLine().getStatusCode();
                                entity = execute.getEntity();
                                if (entity != null) {
                                    entity.consumeContent();
                                }
                                b3 = b;
                                // iftrue(Label_0409:, !b2)
                                while (true) {
                                Block_15_Outer:
                                    while (true) {
                                        while (true) {
                                            if (i != 200) {
                                                if (b2 && this.l.contains(i)) {
                                                    com.google.android.gms.b.n.b("Falling back to single hit per request mode.");
                                                    this.m = true;
                                                    this.n = System.currentTimeMillis();
                                                    b3 = false;
                                                    return b3;
                                                }
                                                com.google.android.gms.b.n.d("Bad response: " + execute.getStatusLine().getStatusCode());
                                                b3 = b;
                                                return b3;
                                            }
                                            return b3;
                                            ((HttpEntityEnclosingRequest)o2).addHeader("User-Agent", this.a);
                                            continue Label_0166_Outer;
                                            try {
                                                switch (ad$1.a[ah.ordinal()]) {
                                                    default: {
                                                        i = str.getBytes().length;
                                                        ((HttpEntityEnclosingRequest)o2).setEntity((HttpEntity)new StringEntity(str));
                                                        break;
                                                    }
                                                    case 1: {
                                                        out = new ByteArrayOutputStream();
                                                        gzipOutputStream = new GZIPOutputStream(out);
                                                        gzipOutputStream.write(str.getBytes());
                                                        gzipOutputStream.close();
                                                        byteArray = out.toByteArray();
                                                        i = byteArray.length + 0;
                                                        ((HttpEntityEnclosingRequest)o2).setEntity((HttpEntity)new ByteArrayEntity(byteArray));
                                                        ((HttpEntityEnclosingRequest)o2).addHeader("Content-Encoding", "gzip");
                                                        break;
                                                    }
                                                }
                                                length2 = str.getBytes().length;
                                                length = i;
                                                i = length2;
                                                continue Label_0635_Outer;
                                            }
                                            catch (UnsupportedEncodingException ex3) {
                                                com.google.android.gms.b.n.a("Encoding error, hit will be discarded");
                                                b3 = b;
                                                return b3;
                                            }
                                            catch (IOException ex) {
                                                com.google.android.gms.b.n.a("Unexpected IOException: " + ex.getMessage());
                                                com.google.android.gms.b.n.a("Request will be discarded");
                                                b3 = b;
                                                return b3;
                                            }
                                            continue Label_0368_Outer;
                                        }
                                        while (true) {
                                            o2 = new BasicHttpEntityEnclosingRequest("POST", this.i);
                                            continue Block_15_Outer;
                                            Label_0385: {
                                                continue Block_14_Outer;
                                            }
                                        }
                                        o2 = new BasicHttpEntityEnclosingRequest("GET", string);
                                        continue Block_15_Outer;
                                        Label_0409: {
                                            o2 = new BasicHttpEntityEnclosingRequest("POST", this.h);
                                        }
                                        continue Block_15_Outer;
                                    }
                                    string = this.h + "?" + str;
                                    continue;
                                }
                            }
                            // iftrue(Label_0385:, string.length() >= this.e || b2)
                            catch (ClientProtocolException ex4) {
                                com.google.android.gms.b.n.d("ClientProtocolException sending hit; discarding hit...");
                                b3 = b;
                            }
                            catch (IOException ex2) {
                                com.google.android.gms.b.n.d("Exception sending hit: " + ex2.getClass().getSimpleName());
                                com.google.android.gms.b.n.d(ex2.getMessage());
                                b3 = false;
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return b3;
    }
    
    private static int b(final List<k> list, final int n) {
        int n2;
        if (list.isEmpty()) {
            n2 = 0;
        }
        else {
            int n3 = n - 1;
            Block_5: {
                while (true) {
                    n2 = n;
                    if (n3 <= 0) {
                        return n2;
                    }
                    final String a = list.get(n3).a;
                    if (!TextUtils.isEmpty((CharSequence)a)) {
                        if (a.contains("sc=start")) {
                            break;
                        }
                        if (a.contains("sc=end")) {
                            break Block_5;
                        }
                    }
                    --n3;
                }
                n2 = n3;
                return n2;
            }
            n2 = n3 + 1;
        }
        return n2;
    }
    
    @Override
    public final int a(final List<k> list, final o o, final boolean b) {
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
        ae ae;
        ah ah;
        if (this.m) {
            ae = com.google.android.gms.b.ae.a;
            ah = com.google.android.gms.b.ah.a;
        }
        else {
            ae = this.j;
            ah = this.k;
        }
        final int n = 0;
        int min = Math.min(list.size(), 20);
        o.a("_hr", list.size());
        final long currentTimeMillis = System.currentTimeMillis();
        final ArrayList<String> list2 = new ArrayList<String>();
        final ArrayList<Long> list3 = new ArrayList<Long>();
        long n2 = 0L;
        int n3 = 0;
        Label_0417: {
            if (ae != com.google.android.gms.b.ae.a) {
                final Iterator<k> iterator = list.iterator();
                n3 = 0;
                while (iterator.hasNext()) {
                    final k k = iterator.next();
                    String a;
                    if (TextUtils.isEmpty((CharSequence)k.a)) {
                        a = "";
                    }
                    else {
                        a = com.google.android.gms.b.l.a(k, currentTimeMillis);
                    }
                    String s = a;
                    if (a.getBytes().length > this.f) {
                        s = "";
                    }
                    list2.add(s);
                    long l = n2;
                    if (!TextUtils.isEmpty((CharSequence)s)) {
                        final int length = s.getBytes().length;
                        int n4;
                        if (n3 == 0) {
                            n4 = 0;
                        }
                        else {
                            n4 = 1;
                        }
                        l = n2 + (n4 + length);
                    }
                    list3.add(l);
                    int n5;
                    if (l <= this.g) {
                        n5 = n3 + 1;
                    }
                    else {
                        n5 = n3;
                    }
                    if (n5 == min) {
                        min = 1;
                        n2 = l;
                        n3 = n5;
                        break Label_0417;
                    }
                    n3 = n5;
                    n2 = l;
                }
                min = 1;
            }
            else {
                n3 = 0;
            }
        }
        while (n3 > 1 && (long)list3.get(n3 - 1) > this.g) {
            --n3;
        }
        while (true) {
            Label_1005: {
                if (n2 <= this.g) {
                    break Label_1005;
                }
                int n6 = 0;
                switch (ad$1.b[ae.ordinal()]) {
                    default: {
                        com.google.android.gms.b.n.d("Unexpected batching strategy encountered; sending a single hit.");
                        final String s2 = list2.get(0);
                        list2.clear();
                        list2.add(s2);
                        n6 = 1;
                        break;
                    }
                    case 1: {
                        if (n3 <= (n6 = list2.size() / 2)) {
                            n6 = n3;
                            break;
                        }
                        break;
                    }
                    case 2: {
                        n6 = a(list, n3);
                        break;
                    }
                    case 3: {
                        n6 = b(list, n3);
                        break;
                    }
                    case 4: {
                        if (n2 < this.g * 2) {
                            for (n6 = list3.size() - 1; n6 > 0 && (long)list3.get(n6) > n2 / 2L; --n6) {}
                            break;
                        }
                        n6 = n3;
                        break;
                    }
                    case 5: {
                        n6 = n3;
                        break;
                    }
                }
                if (n6 >= list2.size()) {
                    break Label_1005;
                }
                final Object subList = list2.subList(0, n6);
                int n7 = 0;
                HttpHost httpHost = null;
                int i = 0;
                int n8 = n;
                while (i < min) {
                    final k j = list.get(i);
                    final URL a2 = this.a(j);
                    final int max = Math.max(1, ((List)subList).size());
                    if (a2 == null) {
                        com.google.android.gms.b.n.d("No destination: discarding hit.");
                        n7 += max;
                        n8 += max;
                    }
                    else {
                        httpHost = new HttpHost(a2.getHost(), a2.getPort(), a2.getProtocol());
                        if (!this.a(a(j, (List<String>)subList, ae), httpHost, max, o, ah)) {
                            o.a("_de", 1);
                            o.a("_hd", n7);
                            o.a("_hs", n8);
                            this.a(o, httpHost, ae, ah);
                            return n8;
                        }
                        final Iterator<String> iterator2 = ((List<String>)subList).iterator();
                        while (iterator2.hasNext()) {
                            if (TextUtils.isEmpty((CharSequence)iterator2.next())) {
                                ++n7;
                            }
                        }
                        o.a("_rs", 1);
                        n8 += max;
                    }
                    ++i;
                }
                o.a("_hd", n7);
                o.a("_hs", n8);
                if (b) {
                    this.a(o, httpHost, ae, ah);
                }
                return n8;
            }
            final Object subList = list2;
            continue;
        }
    }
    
    @Override
    public final void a(final String spec) {
        try {
            this.d = new URL(spec);
        }
        catch (MalformedURLException ex) {
            this.d = null;
        }
    }
    
    @Override
    public final void a(final boolean q) {
        this.q = q;
    }
    
    @Override
    public final boolean a() {
        final NetworkInfo activeNetworkInfo = ((ConnectivityManager)this.c.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean b;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            com.google.android.gms.b.n.c("...no network connectivity");
            b = false;
        }
        else {
            b = true;
        }
        return b;
    }
}
