package com.google.android.gms.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

public final class ad implements an {
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
    private Set<Integer> l = new HashSet();
    private boolean m = false;
    private long n;
    private long o;
    private ak p;
    private volatile boolean q = false;

    private static void a(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        int available;
        StringBuffer stringBuffer = new StringBuffer();
        for (Header obj : httpEntityEnclosingRequest.getAllHeaders()) {
            stringBuffer.append(obj.toString()).append("\n");
        }
        stringBuffer.append(httpEntityEnclosingRequest.getRequestLine().toString()).append("\n");
        if (httpEntityEnclosingRequest.getEntity() != null) {
            try {
                InputStream content = httpEntityEnclosingRequest.getEntity().getContent();
                if (content != null && (available = content.available()) > 0) {
                    byte[] bArr = new byte[available];
                    content.read(bArr);
                    stringBuffer.append("POST:\n");
                    stringBuffer.append(new String(bArr)).append("\n");
                }
            } catch (IOException e2) {
                n.d("Error Writing hit to log...");
            }
        }
        n.b(stringBuffer.toString());
    }

    public final void a(String str) {
        try {
            this.d = new URL(str);
        } catch (MalformedURLException e2) {
            this.d = null;
        }
    }

    public final void a(boolean z) {
        this.q = z;
    }

    public final boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        n.c("...no network connectivity");
        return false;
    }

    ad(HttpClient httpClient, Context context, ak akVar) {
        this.c = context.getApplicationContext();
        this.p = akVar;
        this.a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleAnalytics", "4.0", Build.VERSION.RELEASE, w.a(Locale.getDefault()), Build.MODEL, Build.ID});
        this.b = httpClient;
    }

    private static int a(List<k> list, int i2) {
        long j2;
        int i3;
        if (list.isEmpty()) {
            return 0;
        }
        if (i2 > list.size()) {
            i2 = list.size();
        }
        int i4 = i2 - 1;
        long j3 = 0;
        int i5 = i2;
        while (i4 > 0) {
            long j4 = list.get(i4 - 1).c;
            long j5 = list.get(i4).c;
            if (j4 == 0 || j5 == 0 || j5 - j4 <= j3) {
                j2 = j3;
                i3 = i5;
            } else {
                j2 = j5 - j4;
                i3 = i4;
            }
            i4--;
            i5 = i3;
            j3 = j2;
        }
        return i5;
    }

    private static int b(List<k> list, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        for (int i3 = i2 - 1; i3 > 0; i3--) {
            String str = list.get(i3).a;
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("sc=start")) {
                    return i3;
                }
                if (str.contains("sc=end")) {
                    return i3 + 1;
                }
            }
        }
        return i2;
    }

    private boolean a(String str, HttpHost httpHost, int i2, o oVar, ah ahVar) {
        HttpEntityEnclosingRequest httpEntityEnclosingRequest;
        int length;
        int length2;
        boolean z = i2 > 1;
        if (str.getBytes().length > this.g || str.getBytes().length > this.f) {
            n.d("Request too long (> " + Math.min(this.f, this.g) + " bytes)--not sent");
            return true;
        } else if (this.q) {
            n.b("Dry run enabled. Hit not actually sent.");
            return true;
        } else {
            if (TextUtils.isEmpty(str)) {
                System.out.println("Empty hit, discarding.");
                httpEntityEnclosingRequest = null;
            } else {
                String str2 = this.h + "?" + str;
                HttpEntityEnclosingRequest basicHttpEntityEnclosingRequest = (str2.length() >= this.e || z) ? z ? new BasicHttpEntityEnclosingRequest("POST", this.i) : new BasicHttpEntityEnclosingRequest("POST", this.h) : new BasicHttpEntityEnclosingRequest("GET", str2);
                basicHttpEntityEnclosingRequest.addHeader("User-Agent", this.a);
                httpEntityEnclosingRequest = basicHttpEntityEnclosingRequest;
            }
            if (httpEntityEnclosingRequest == null) {
                return true;
            }
            if (httpEntityEnclosingRequest.getRequestLine().getMethod().equals("GET")) {
                length2 = str.getBytes().length;
                length = str.getBytes().length;
            } else {
                try {
                    switch (ahVar) {
                        case GZIP:
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            gZIPOutputStream.write(str.getBytes());
                            gZIPOutputStream.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            length = byteArray.length + 0;
                            httpEntityEnclosingRequest.setEntity(new ByteArrayEntity(byteArray));
                            httpEntityEnclosingRequest.addHeader("Content-Encoding", "gzip");
                            break;
                        default:
                            length = str.getBytes().length;
                            httpEntityEnclosingRequest.setEntity(new StringEntity(str));
                            break;
                    }
                    length2 = str.getBytes().length;
                } catch (UnsupportedEncodingException e2) {
                    n.a("Encoding error, hit will be discarded");
                    return true;
                } catch (IOException e3) {
                    n.a("Unexpected IOException: " + e3.getMessage());
                    n.a("Request will be discarded");
                    return true;
                }
            }
            httpEntityEnclosingRequest.addHeader("Host", httpHost.toHostString());
            if (n.a()) {
                a(httpEntityEnclosingRequest);
            }
            try {
                HttpResponse execute = this.b.execute(httpHost, httpEntityEnclosingRequest);
                oVar.a("_td", length2);
                oVar.a("_cd", length);
                int statusCode = execute.getStatusLine().getStatusCode();
                HttpEntity entity = execute.getEntity();
                if (entity != null) {
                    entity.consumeContent();
                }
                if (statusCode == 200) {
                    return true;
                }
                if (!z || !this.l.contains(Integer.valueOf(statusCode))) {
                    n.d("Bad response: " + execute.getStatusLine().getStatusCode());
                    return true;
                }
                n.b("Falling back to single hit per request mode.");
                this.m = true;
                this.n = System.currentTimeMillis();
                return false;
            } catch (ClientProtocolException e4) {
                n.d("ClientProtocolException sending hit; discarding hit...");
                return true;
            } catch (IOException e5) {
                n.d("Exception sending hit: " + e5.getClass().getSimpleName());
                n.d(e5.getMessage());
                return false;
            }
        }
    }

    private static String a(k kVar, List<String> list, ae aeVar) {
        if (aeVar == ae.NONE) {
            return TextUtils.isEmpty((kVar.a == null || kVar.a.length() == 0) ? "" : kVar.a) ? "" : l.a(kVar, System.currentTimeMillis());
        }
        String str = "";
        for (String next : list) {
            if (next.length() != 0) {
                if (str.length() != 0) {
                    str = str + "\n";
                }
                str = str + next;
            }
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0288  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.util.List<com.google.android.gms.b.k> r21, com.google.android.gms.b.o r22, boolean r23) {
        /*
            r20 = this;
            r2 = 2036(0x7f4, float:2.853E-42)
            r0 = r20
            r0.e = r2
            r2 = 8192(0x2000, float:1.14794E-41)
            r0 = r20
            r0.f = r2
            r2 = 8192(0x2000, float:1.14794E-41)
            r0 = r20
            r0.g = r2
            r0 = r20
            com.google.android.gms.b.ak r2 = r0.p
            java.lang.String r2 = r2.a()
            r0 = r20
            r0.h = r2
            r0 = r20
            com.google.android.gms.b.ak r2 = r0.p
            java.lang.String r2 = r2.b()
            r0 = r20
            r0.i = r2
            r0 = r20
            com.google.android.gms.b.ak r2 = r0.p
            com.google.android.gms.b.ae r2 = r2.c()
            r0 = r20
            r0.j = r2
            r0 = r20
            com.google.android.gms.b.ak r2 = r0.p
            com.google.android.gms.b.ah r2 = r2.d()
            r0 = r20
            r0.k = r2
            r0 = r20
            java.util.Set<java.lang.Integer> r2 = r0.l
            r2.clear()
            r0 = r20
            java.util.Set<java.lang.Integer> r2 = r0.l
            r0 = r20
            com.google.android.gms.b.ak r3 = r0.p
            java.util.Set r3 = r3.e()
            r2.addAll(r3)
            r2 = 3600(0xe10, double:1.7786E-320)
            r0 = r20
            r0.o = r2
            r0 = r20
            boolean r2 = r0.m
            if (r2 != 0) goto L_0x007b
            r0 = r20
            java.util.Set<java.lang.Integer> r2 = r0.l
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x007b
            r2 = 1
            r0 = r20
            r0.m = r2
            long r2 = java.lang.System.currentTimeMillis()
            r0 = r20
            r0.n = r2
        L_0x007b:
            r0 = r20
            boolean r2 = r0.m
            if (r2 == 0) goto L_0x009a
            long r2 = java.lang.System.currentTimeMillis()
            r0 = r20
            long r4 = r0.n
            long r2 = r2 - r4
            r4 = 1000(0x3e8, double:4.94E-321)
            r0 = r20
            long r6 = r0.o
            long r4 = r4 * r6
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x009a
            r2 = 0
            r0 = r20
            r0.m = r2
        L_0x009a:
            r0 = r20
            boolean r2 = r0.m
            if (r2 == 0) goto L_0x0154
            com.google.android.gms.b.ae r2 = com.google.android.gms.b.ae.NONE
            com.google.android.gms.b.ah r7 = com.google.android.gms.b.ah.NONE
            r8 = r2
        L_0x00a5:
            r11 = 0
            int r2 = r21.size()
            r3 = 20
            int r10 = java.lang.Math.min(r2, r3)
            java.lang.String r2 = "_hr"
            int r3 = r21.size()
            r0 = r22
            r0.a((java.lang.String) r2, (int) r3)
            long r12 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r4 = 0
            r2 = 0
            com.google.android.gms.b.ae r3 = com.google.android.gms.b.ae.NONE
            if (r8 == r3) goto L_0x029f
            r9 = 1
            java.util.Iterator r15 = r21.iterator()
            r3 = r2
        L_0x00d6:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x029c
            java.lang.Object r2 = r15.next()
            com.google.android.gms.b.k r2 = (com.google.android.gms.b.k) r2
            java.lang.String r0 = r2.a
            r16 = r0
            boolean r16 = android.text.TextUtils.isEmpty(r16)
            if (r16 == 0) goto L_0x015f
            java.lang.String r2 = ""
        L_0x00ee:
            byte[] r16 = r2.getBytes()
            r0 = r16
            int r0 = r0.length
            r16 = r0
            r0 = r20
            int r0 = r0.f
            r17 = r0
            r0 = r16
            r1 = r17
            if (r0 <= r1) goto L_0x0105
            java.lang.String r2 = ""
        L_0x0105:
            r6.add(r2)
            boolean r16 = android.text.TextUtils.isEmpty(r2)
            if (r16 != 0) goto L_0x011f
            byte[] r2 = r2.getBytes()
            int r0 = r2.length
            r16 = r0
            if (r3 != 0) goto L_0x0164
            r2 = 0
        L_0x0118:
            int r2 = r2 + r16
            long r0 = (long) r2
            r16 = r0
            long r4 = r4 + r16
        L_0x011f:
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r14.add(r2)
            r0 = r20
            int r2 = r0.g
            long r0 = (long) r2
            r16 = r0
            int r2 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r2 > 0) goto L_0x0299
            int r2 = r3 + 1
        L_0x0133:
            if (r2 != r10) goto L_0x0296
            r3 = r2
            r13 = r9
        L_0x0137:
            r2 = 1
            if (r3 <= r2) goto L_0x0166
            int r2 = r3 + -1
            java.lang.Object r2 = r14.get(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r16 = r2.longValue()
            r0 = r20
            int r2 = r0.g
            long r0 = (long) r2
            r18 = r0
            int r2 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r2 <= 0) goto L_0x0166
            int r3 = r3 + -1
            goto L_0x0137
        L_0x0154:
            r0 = r20
            com.google.android.gms.b.ae r2 = r0.j
            r0 = r20
            com.google.android.gms.b.ah r7 = r0.k
            r8 = r2
            goto L_0x00a5
        L_0x015f:
            java.lang.String r2 = com.google.android.gms.b.l.a(r2, r12)
            goto L_0x00ee
        L_0x0164:
            r2 = 1
            goto L_0x0118
        L_0x0166:
            r0 = r20
            int r2 = r0.g
            long r0 = (long) r2
            r16 = r0
            int r2 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x0293
            int[] r2 = com.google.android.gms.b.ad.AnonymousClass1.b
            int r9 = r8.ordinal()
            r2 = r2[r9]
            switch(r2) {
                case 1: goto L_0x01ca;
                case 2: goto L_0x01d4;
                case 3: goto L_0x01db;
                case 4: goto L_0x01e2;
                case 5: goto L_0x0210;
                default: goto L_0x017c;
            }
        L_0x017c:
            java.lang.String r2 = "Unexpected batching strategy encountered; sending a single hit."
            com.google.android.gms.b.n.d(r2)
            r3 = 1
            r2 = 0
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r6.clear()
            r6.add(r2)
            r2 = r3
        L_0x0190:
            int r3 = r6.size()
            if (r2 >= r3) goto L_0x0293
            r3 = 0
            java.util.List r2 = r6.subList(r3, r2)
            r9 = r2
        L_0x019c:
            r10 = 0
            r4 = 0
            r2 = 0
            r12 = r2
        L_0x01a0:
            if (r12 >= r13) goto L_0x0278
            r0 = r21
            java.lang.Object r2 = r0.get(r12)
            com.google.android.gms.b.k r2 = (com.google.android.gms.b.k) r2
            r0 = r20
            java.net.URL r3 = r0.a((com.google.android.gms.b.k) r2)
            r5 = 1
            int r6 = r9.size()
            int r5 = java.lang.Math.max(r5, r6)
            if (r3 != 0) goto L_0x0213
            java.lang.String r2 = "No destination: discarding hit."
            com.google.android.gms.b.n.d(r2)
            int r3 = r10 + r5
            int r2 = r11 + r5
        L_0x01c4:
            int r5 = r12 + 1
            r12 = r5
            r10 = r3
            r11 = r2
            goto L_0x01a0
        L_0x01ca:
            int r2 = r6.size()
            int r2 = r2 / 2
            if (r3 > r2) goto L_0x0190
            r2 = r3
            goto L_0x0190
        L_0x01d4:
            r0 = r21
            int r2 = a(r0, r3)
            goto L_0x0190
        L_0x01db:
            r0 = r21
            int r2 = b(r0, r3)
            goto L_0x0190
        L_0x01e2:
            r0 = r20
            int r2 = r0.g
            int r2 = r2 * 2
            long r0 = (long) r2
            r16 = r0
            int r2 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x020e
            int r2 = r14.size()
            int r3 = r2 + -1
        L_0x01f5:
            if (r3 <= 0) goto L_0x020c
            java.lang.Object r2 = r14.get(r3)
            java.lang.Long r2 = (java.lang.Long) r2
            long r16 = r2.longValue()
            r18 = 2
            long r18 = r4 / r18
            int r2 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r2 <= 0) goto L_0x020c
            int r3 = r3 + -1
            goto L_0x01f5
        L_0x020c:
            r2 = r3
            goto L_0x0190
        L_0x020e:
            r2 = r3
            goto L_0x0190
        L_0x0210:
            r2 = r3
            goto L_0x0190
        L_0x0213:
            org.apache.http.HttpHost r4 = new org.apache.http.HttpHost
            java.lang.String r6 = r3.getHost()
            int r14 = r3.getPort()
            java.lang.String r3 = r3.getProtocol()
            r4.<init>(r6, r14, r3)
            java.lang.String r3 = a((com.google.android.gms.b.k) r2, (java.util.List<java.lang.String>) r9, (com.google.android.gms.b.ae) r8)
            r2 = r20
            r6 = r22
            boolean r2 = r2.a(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L_0x0251
            java.lang.String r2 = "_de"
            r3 = 1
            r0 = r22
            r0.a((java.lang.String) r2, (int) r3)
            java.lang.String r2 = "_hd"
            r0 = r22
            r0.a((java.lang.String) r2, (int) r10)
            java.lang.String r2 = "_hs"
            r0 = r22
            r0.a((java.lang.String) r2, (int) r11)
            r0 = r20
            r1 = r22
            r0.a(r1, r4, r8, r7)
            r2 = r11
        L_0x0250:
            return r2
        L_0x0251:
            java.util.Iterator r6 = r9.iterator()
            r3 = r10
        L_0x0256:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x026c
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0291
            int r2 = r3 + 1
        L_0x026a:
            r3 = r2
            goto L_0x0256
        L_0x026c:
            java.lang.String r2 = "_rs"
            r6 = 1
            r0 = r22
            r0.a((java.lang.String) r2, (int) r6)
            int r2 = r11 + r5
            goto L_0x01c4
        L_0x0278:
            java.lang.String r2 = "_hd"
            r0 = r22
            r0.a((java.lang.String) r2, (int) r10)
            java.lang.String r2 = "_hs"
            r0 = r22
            r0.a((java.lang.String) r2, (int) r11)
            if (r23 == 0) goto L_0x028f
            r0 = r20
            r1 = r22
            r0.a(r1, r4, r8, r7)
        L_0x028f:
            r2 = r11
            goto L_0x0250
        L_0x0291:
            r2 = r3
            goto L_0x026a
        L_0x0293:
            r9 = r6
            goto L_0x019c
        L_0x0296:
            r3 = r2
            goto L_0x00d6
        L_0x0299:
            r2 = r3
            goto L_0x0133
        L_0x029c:
            r13 = r9
            goto L_0x0137
        L_0x029f:
            r3 = r2
            r13 = r10
            goto L_0x0137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.ad.a(java.util.List, com.google.android.gms.b.o, boolean):int");
    }

    private void a(o oVar, HttpHost httpHost, ae aeVar, ah ahVar) {
        String sb;
        HttpHost httpHost2;
        oVar.a("_bs", aeVar.toString());
        oVar.a("_cs", ahVar.toString());
        if (!oVar.c) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(oVar.d);
            for (String next : oVar.a.keySet()) {
                sb2.append("&").append(next).append("=").append(oVar.a.get(next));
            }
            for (String next2 : oVar.b.keySet()) {
                sb2.append("&").append(next2).append("=").append(oVar.b.get(next2));
            }
            sb = sb2.toString();
        }
        if (!TextUtils.isEmpty(sb)) {
            if (httpHost == null) {
                try {
                    URL url = new URL("https://ssl.google-analytics.com");
                    httpHost2 = new HttpHost(url.getHost(), url.getPort(), url.getProtocol());
                } catch (MalformedURLException e2) {
                    return;
                }
            } else {
                httpHost2 = httpHost;
            }
            a(sb, httpHost2, 1, oVar, ah.NONE);
        }
    }

    private URL a(k kVar) {
        if (this.d != null) {
            return this.d;
        }
        try {
            return new URL("http:".equals(kVar.e) ? "http://www.google-analytics.com/collect" : "https://ssl.google-analytics.com/collect");
        } catch (MalformedURLException e2) {
            n.a("Error trying to parse the hardcoded host url. This really shouldn't happen.");
            return null;
        }
    }
}
