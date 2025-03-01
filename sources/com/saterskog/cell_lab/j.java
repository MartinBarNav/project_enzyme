package com.saterskog.cell_lab;

import android.content.Context;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public final class j {
    static ArrayList<a> a = null;
    static boolean[] b = null;
    static String[] c = null;

    static synchronized boolean b(String str, Context context) {
        return true;
    }

    public static int a(int i, Context context) {
        int i2;
        a(context);
        int i3 = 0;
        int i4 = 0;
        while (i4 < a.size()) {
            if (i4 == i) {
                return i3;
            }
            if (a.get(i4).i == -1) {
                i2 = i3 + 1;
            } else {
                i2 = i3;
            }
            i4++;
            i3 = i2;
        }
        return -1;
    }

    public static int a(String str, Context context) {
        ArrayList<a> a2 = a(context);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= a2.size()) {
                return -1;
            }
            if (a2.get(i2).b.equals(str)) {
                return i2;
            }
            i = i2 + 1;
        }
    }

    static class a {
        int A;
        double B;
        double C;
        String a;
        String b;
        String c;
        String d;
        String e;
        String f;
        String[] g;
        boolean[] h = new boolean[5];
        int i;
        int j;
        int[] k = new int[h.B.length];
        int l;
        int m;
        int n;
        int o;
        int p;
        int q;
        int r;
        int s;
        int t;
        int u;
        int v;
        int w;
        int x;
        int y;
        int z;

        a() {
        }
    }

    static class b {
        b() {
        }

        public static Document a(String str) {
            try {
                DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                InputSource inputSource = new InputSource();
                inputSource.setCharacterStream(new StringReader(str));
                return newDocumentBuilder.parse(inputSource);
            } catch (ParserConfigurationException e) {
                com.saterskog.b.a.a("Error: " + e.getMessage());
                return null;
            } catch (SAXException e2) {
                com.saterskog.b.a.a("Error: " + e2.getMessage());
                return null;
            } catch (IOException e3) {
                com.saterskog.b.a.a("Error: " + e3.getMessage());
                return null;
            }
        }

        public static String a(Element element, String str) {
            Node item = element.getElementsByTagName(str).item(0);
            if (item != null && item.hasChildNodes()) {
                for (Node firstChild = item.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                    if (firstChild.getNodeType() == 3) {
                        return firstChild.getNodeValue();
                    }
                }
            }
            return "";
        }
    }

    static ArrayList<a> a(Context context) {
        String str;
        if (a == null) {
            a = new ArrayList<>();
            new b();
            try {
                str = new Scanner(context.getAssets().open("levels.xml")).useDelimiter("\\A").next();
            } catch (IOException e) {
                e.printStackTrace();
                str = null;
            }
            NodeList elementsByTagName = b.a(str).getElementsByTagName("level");
            String[] stringArray = context.getResources().getStringArray(C0028R.array.level_strings);
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                a aVar = new a();
                Element element = (Element) elementsByTagName.item(i);
                aVar.b = b.a(element, "id");
                if (aVar.b.startsWith("tuto")) {
                    aVar.i = Integer.parseInt(aVar.b.substring(4));
                } else {
                    aVar.i = -1;
                }
                for (int i2 = 0; i2 < h.B.length; i2++) {
                    String a2 = b.a(element, "max-" + h.values()[i2].toString().toLowerCase(Locale.ENGLISH));
                    if (a2 == null || a2.length() == 0) {
                        aVar.k[i2] = -1;
                    } else {
                        aVar.k[i2] = Integer.parseInt(a2);
                    }
                }
                aVar.a = stringArray[(i * 4) + 0];
                aVar.c = stringArray[(i * 4) + 1];
                aVar.d = stringArray[(i * 4) + 2];
                if (aVar.d.length() == 0) {
                    aVar.d = null;
                }
                aVar.e = stringArray[(i * 4) + 3];
                if (aVar.e.length() == 0) {
                    aVar.e = null;
                }
                aVar.f = b.a(element, "file");
                aVar.g = b.a(element, "unlocks").split(",");
                if (aVar.g != null && aVar.g[0].length() == 0) {
                    aVar.g = null;
                }
                String a3 = b.a(element, "feature");
                if (a3 == null || a3.length() == 0) {
                    aVar.j = -1;
                } else {
                    aVar.j = Integer.parseInt(a3);
                }
                String[] split = b.a(element, "tools").split(",");
                if (split == null || split.length <= 0 || split[0].length() == 0) {
                    aVar.h[0] = true;
                    aVar.h[4] = true;
                } else {
                    for (int i3 = 0; i3 < split.length; i3++) {
                        if (split[i3].equals("cell")) {
                            aVar.h[0] = true;
                        }
                        if (split[i3].equals("move")) {
                            aVar.h[1] = true;
                        }
                        if (split[i3].equals("remove")) {
                            aVar.h[3] = true;
                        }
                        if (split[i3].equals("add")) {
                            aVar.h[2] = true;
                        }
                        if (split[i3].equals("info")) {
                            aVar.h[4] = true;
                        }
                    }
                }
                String a4 = b.a(element, "difficulty");
                if (a4 == null || a4.length() == 0) {
                    aVar.u = 0;
                } else {
                    aVar.u = Integer.parseInt(a4);
                }
                String a5 = b.a(element, "user-cells");
                if (a5 == null || a5.length() == 0) {
                    aVar.m = -1;
                } else {
                    aVar.m = Integer.parseInt(a5);
                }
                String a6 = b.a(element, "black-level-cells");
                if (a6 == null || a6.length() == 0) {
                    aVar.z = -1;
                } else {
                    aVar.z = Integer.parseInt(a6);
                }
                String a7 = b.a(element, "red-level-cells");
                if (a7 == null || a7.length() == 0) {
                    aVar.v = -1;
                } else {
                    aVar.v = Integer.parseInt(a7);
                }
                String a8 = b.a(element, "red-level-cells-min");
                if (a8 == null || a8.length() == 0) {
                    aVar.w = -1;
                } else {
                    aVar.w = Integer.parseInt(a8);
                }
                String a9 = b.a(element, "yellow-level-cells");
                if (a9 == null || a9.length() == 0) {
                    aVar.x = -1;
                } else {
                    aVar.x = Integer.parseInt(a9);
                }
                String a10 = b.a(element, "yellow-level-cells-min");
                if (a10 == null || a10.length() == 0) {
                    aVar.y = -1;
                } else {
                    aVar.y = Integer.parseInt(a10);
                }
                String a11 = b.a(element, "total-cells-min");
                if (a11 == null || a11.length() == 0) {
                    aVar.n = -1;
                } else {
                    aVar.n = Integer.parseInt(a11);
                }
                String a12 = b.a(element, "level-cells");
                if (a12 == null || a12.length() == 0) {
                    aVar.o = -1;
                } else {
                    aVar.o = Integer.parseInt(a12);
                }
                String a13 = b.a(element, "level-cells-min");
                if (a13 == null || a13.length() == 0) {
                    aVar.p = -1;
                } else {
                    aVar.p = Integer.parseInt(a13);
                }
                String a14 = b.a(element, "hybrid-cells-min");
                if (a14 == null || a14.length() == 0) {
                    aVar.l = -1;
                } else {
                    aVar.l = Integer.parseInt(a14);
                }
                String a15 = b.a(element, "infected-level-cells");
                if (a15 == null || a15.length() == 0) {
                    aVar.s = -1;
                } else {
                    aVar.s = Integer.parseInt(a15);
                }
                String a16 = b.a(element, "infected-level-cells-max");
                if (a16 == null || a16.length() == 0) {
                    aVar.t = -1;
                } else {
                    aVar.t = Integer.parseInt(a16);
                }
                String a17 = b.a(element, "place-cells");
                if (a17 == null || a17.length() == 0) {
                    aVar.q = 1;
                } else {
                    aVar.q = Integer.parseInt(a17);
                }
                String a18 = b.a(element, "remove-max");
                if (a18 == null || a18.length() == 0) {
                    aVar.A = -1;
                } else {
                    aVar.A = Integer.parseInt(a18);
                }
                String a19 = b.a(element, "user-cells-max");
                if (a19 == null || a19.length() == 0) {
                    aVar.r = -1;
                } else {
                    aVar.r = Integer.parseInt(a19);
                }
                String a20 = b.a(element, "max-time");
                if (a20 == null || a20.length() == 0) {
                    aVar.C = -1.0d;
                } else {
                    aVar.C = Double.parseDouble(a20);
                }
                String a21 = b.a(element, "win-time");
                if (a21 == null || a21.length() == 0) {
                    aVar.B = -1.0d;
                } else {
                    aVar.B = Double.parseDouble(a21);
                }
                a.add(aVar);
            }
        }
        return a;
    }

    static synchronized boolean a(int i, CellWorld cellWorld) {
        boolean z;
        synchronized (j.class) {
            double d = cellWorld.N;
            cellWorld.N = cellWorld.M;
            a aVar = a.get(i);
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            if (!(aVar.m == -1 && aVar.r == -1)) {
                i4 = cellWorld.b(1);
            }
            if (!(aVar.o == -1 && aVar.p == -1)) {
                i2 = cellWorld.b(0);
            }
            if (aVar.l != -1) {
                i5 = cellWorld.b(6);
            }
            if (!(aVar.s == -1 && aVar.o == -1 && aVar.p == -1)) {
                i3 = cellWorld.b(3);
            }
            if (aVar.n != -1 && cellWorld.z < aVar.n) {
                z = false;
            } else if (aVar.m != -1 && i4 < aVar.m) {
                z = false;
            } else if (aVar.r != -1 && i4 > aVar.r) {
                z = false;
            } else if (aVar.o != -1 && i2 + i3 > aVar.o) {
                z = false;
            } else if (aVar.p != -1 && i2 + i3 < aVar.p) {
                z = false;
            } else if (aVar.s != -1 && i3 < aVar.s) {
                z = false;
            } else if (aVar.t != -1 && i3 > aVar.t) {
                z = false;
            } else if (aVar.l != -1 && i5 < aVar.l) {
                z = false;
            } else if (aVar.C != -1.0d && cellWorld.M > aVar.C) {
                z = false;
            } else if (aVar.z != -1 && cellWorld.c() > aVar.z) {
                z = false;
            } else if (aVar.v != -1 && cellWorld.d() > aVar.v) {
                z = false;
            } else if (aVar.w != -1 && cellWorld.d() < aVar.w) {
                z = false;
            } else if (aVar.x != -1 && cellWorld.e() > aVar.x) {
                z = false;
            } else if (aVar.y == -1 || cellWorld.e() >= aVar.y) {
                cellWorld.N = d;
                if (aVar.B == -1.0d || cellWorld.M - cellWorld.N >= aVar.B) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        return z;
    }

    private static synchronized String[] d(Context context) {
        String[] strArr;
        synchronized (j.class) {
            if (c == null) {
                c = context.fileList();
            }
            strArr = c;
        }
        return strArr;
    }

    private static void e(Context context) {
        b = new boolean[3];
        Iterator<a> it = a(context).iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (b(next.b, context) && next.j != -1) {
                b[next.j] = true;
            }
        }
    }

    static boolean a(Context context, int i) {
        if (i == -1) {
            return true;
        }
        if (b == null) {
            e(context);
        }
        return b[i];
    }

    static synchronized void a() {
        synchronized (j.class) {
            c = null;
        }
    }

    static synchronized boolean b(int i, Context context) {
        boolean b2;
        synchronized (j.class) {
            b2 = b(a(context).get(i).b, context);
        }
        return b2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049 A[SYNTHETIC, Splitter:B:25:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0058 A[SYNTHETIC, Splitter:B:34:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0064 A[SYNTHETIC, Splitter:B:41:0x0064] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:10:0x0032=Splitter:B:10:0x0032, B:43:0x0067=Splitter:B:43:0x0067} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void c(int r5, android.content.Context r6) {
        /*
            java.lang.Class<com.saterskog.cell_lab.j> r3 = com.saterskog.cell_lab.j.class
            monitor-enter(r3)
            r2 = 0
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x0052 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x0052 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x0052 }
            java.util.ArrayList<com.saterskog.cell_lab.j$a> r0 = a     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x0052 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x0052 }
            com.saterskog.cell_lab.j$a r0 = (com.saterskog.cell_lab.j.a) r0     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x0052 }
            java.lang.String r0 = r0.b     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x0052 }
            java.lang.StringBuilder r0 = r4.append(r0)     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x0052 }
            java.lang.String r4 = ".win"
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x0052 }
            java.lang.String r0 = r0.toString()     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x0052 }
            r4 = 0
            java.io.FileOutputStream r0 = r6.openFileOutput(r0, r4)     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x0052 }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x0052 }
            r0 = 0
            r1.writeInt(r0)     // Catch:{ FileNotFoundException -> 0x0073, IOException -> 0x0070 }
            r1.close()     // Catch:{ IOException -> 0x003a }
        L_0x0032:
            a()     // Catch:{ all -> 0x003f }
            e(r6)     // Catch:{ all -> 0x003f }
            monitor-exit(r3)
            return
        L_0x003a:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x003f }
            goto L_0x0032
        L_0x003f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0042:
            r0 = move-exception
            r1 = r2
        L_0x0044:
            r0.printStackTrace()     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x0032
            r1.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x0032
        L_0x004d:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x003f }
            goto L_0x0032
        L_0x0052:
            r0 = move-exception
        L_0x0053:
            r0.printStackTrace()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0032
            r2.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0032
        L_0x005c:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x003f }
            goto L_0x0032
        L_0x0061:
            r0 = move-exception
        L_0x0062:
            if (r2 == 0) goto L_0x0067
            r2.close()     // Catch:{ IOException -> 0x0068 }
        L_0x0067:
            throw r0     // Catch:{ all -> 0x003f }
        L_0x0068:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x003f }
            goto L_0x0067
        L_0x006d:
            r0 = move-exception
            r2 = r1
            goto L_0x0062
        L_0x0070:
            r0 = move-exception
            r2 = r1
            goto L_0x0053
        L_0x0073:
            r0 = move-exception
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saterskog.cell_lab.j.c(int, android.content.Context):void");
    }

    static synchronized String d(int i, Context context) {
        String str;
        synchronized (j.class) {
            str = a(context).get(i).c;
        }
        return str;
    }

    static synchronized String e(int i, Context context) {
        String str;
        synchronized (j.class) {
            str = a(context).get(i).d;
        }
        return str;
    }

    static synchronized int f(int i, Context context) {
        int i2;
        synchronized (j.class) {
            i2 = a(context).get(i).u;
        }
        return i2;
    }

    static synchronized boolean a(int i, Gene[] geneArr, Context context) {
        boolean z;
        int i2;
        synchronized (j.class) {
            h[] hVarArr = h.B;
            int length = hVarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z = true;
                    break;
                }
                h hVar = hVarArr[i3];
                int i4 = 0;
                int i5 = 0;
                while (i4 < 80) {
                    if (geneArr[i4].s == hVar) {
                        i2 = i5 + 1;
                    } else {
                        i2 = i5;
                    }
                    i4++;
                    i5 = i2;
                }
                int i6 = a(context).get(i).k[hVar.ordinal()];
                if (i6 != -1 && i5 > i6) {
                    z = false;
                    break;
                }
                i3++;
            }
        }
        return z;
    }

    static synchronized String g(int i, Context context) {
        String str;
        synchronized (j.class) {
            str = a(context).get(i).e;
        }
        return str;
    }

    static synchronized String[] b(Context context) {
        String[] strArr;
        synchronized (j.class) {
            strArr = new String[a(context).size()];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < strArr.length) {
                    strArr[i2] = a.get(i2).a;
                    i = i2 + 1;
                }
            }
        }
        return strArr;
    }

    public static synchronized String h(int i, Context context) {
        String str;
        synchronized (j.class) {
            str = a(context).get(i).f;
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a1, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00b8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00b9, code lost:
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c A[SYNTHETIC, Splitter:B:31:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a7 A[SYNTHETIC, Splitter:B:55:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00b0 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:21:0x0065] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x0080=Splitter:B:34:0x0080, B:57:0x00aa=Splitter:B:57:0x00aa} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean[] i(int r8, android.content.Context r9) {
        /*
            r1 = 0
            java.lang.Class<com.saterskog.cell_lab.j> r4 = com.saterskog.cell_lab.j.class
            monitor-enter(r4)
            r0 = -1
            if (r8 != r0) goto L_0x0054
            com.saterskog.cell_lab.h[] r0 = com.saterskog.cell_lab.h.B     // Catch:{ all -> 0x009a }
            int r0 = r0.length     // Catch:{ all -> 0x009a }
            boolean[] r1 = new boolean[r0]     // Catch:{ all -> 0x009a }
            java.util.ArrayList r0 = a((android.content.Context) r9)     // Catch:{ all -> 0x009a }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x009a }
        L_0x0014:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x009a }
            com.saterskog.cell_lab.j$a r0 = (com.saterskog.cell_lab.j.a) r0     // Catch:{ all -> 0x009a }
            java.lang.String r3 = r0.b     // Catch:{ all -> 0x009a }
            boolean r3 = b((java.lang.String) r3, (android.content.Context) r9)     // Catch:{ all -> 0x009a }
            if (r3 == 0) goto L_0x0014
            java.lang.String[] r3 = r0.g     // Catch:{ all -> 0x009a }
            if (r3 == 0) goto L_0x0014
            java.lang.String[] r3 = r0.g     // Catch:{ all -> 0x009a }
            int r5 = r3.length     // Catch:{ all -> 0x009a }
            r0 = 0
        L_0x0030:
            if (r0 >= r5) goto L_0x0014
            r6 = r3[r0]     // Catch:{ all -> 0x009a }
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x009a }
            java.lang.String r6 = r6.toUpperCase(r7)     // Catch:{ all -> 0x009a }
            com.saterskog.cell_lab.h r6 = com.saterskog.cell_lab.h.valueOf(r6)     // Catch:{ all -> 0x009a }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x009a }
            r7 = 1
            r1[r6] = r7     // Catch:{ all -> 0x009a }
            int r0 = r0 + 1
            goto L_0x0030
        L_0x0048:
            com.saterskog.cell_lab.h r0 = com.saterskog.cell_lab.h.PHOTOCYTE     // Catch:{ all -> 0x009a }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x009a }
            r2 = 1
            r1[r0] = r2     // Catch:{ all -> 0x009a }
            r0 = r1
        L_0x0052:
            monitor-exit(r4)
            return r0
        L_0x0054:
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x00b5, all -> 0x00a3 }
            android.content.res.AssetManager r0 = r9.getAssets()     // Catch:{ IOException -> 0x00b5, all -> 0x00a3 }
            java.lang.String r2 = h(r8, r9)     // Catch:{ IOException -> 0x00b5, all -> 0x00a3 }
            java.io.InputStream r0 = r0.open(r2)     // Catch:{ IOException -> 0x00b5, all -> 0x00a3 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x00b5, all -> 0x00a3 }
            int r0 = r3.readInt()     // Catch:{ IOException -> 0x0075, all -> 0x00b0 }
            r2 = 3054(0xbee, float:4.28E-42)
            if (r0 <= r2) goto L_0x0083
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x0075, all -> 0x00b0 }
            java.lang.String r2 = "Opening file from different version"
            r0.<init>(r2)     // Catch:{ IOException -> 0x0075, all -> 0x00b0 }
            throw r0     // Catch:{ IOException -> 0x0075, all -> 0x00b0 }
        L_0x0075:
            r0 = move-exception
            r2 = r3
        L_0x0077:
            r0.printStackTrace()     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x007f
            r2.close()     // Catch:{ IOException -> 0x009d }
        L_0x007f:
            r2 = r1
        L_0x0080:
            boolean[] r0 = r2.t     // Catch:{ all -> 0x009a }
            goto L_0x0052
        L_0x0083:
            r3.readDouble()     // Catch:{ IOException -> 0x0075, all -> 0x00b0 }
            r3.readInt()     // Catch:{ IOException -> 0x0075, all -> 0x00b0 }
            com.saterskog.cell_lab.Environment r2 = new com.saterskog.cell_lab.Environment     // Catch:{ IOException -> 0x0075, all -> 0x00b0 }
            r2.<init>()     // Catch:{ IOException -> 0x0075, all -> 0x00b0 }
            r2.a((java.io.ObjectInputStream) r3)     // Catch:{ IOException -> 0x00b8, all -> 0x00b0 }
            r3.close()     // Catch:{ IOException -> 0x0095 }
            goto L_0x0080
        L_0x0095:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x009a }
            goto L_0x0080
        L_0x009a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x009d:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x009a }
            r2 = r1
            goto L_0x0080
        L_0x00a3:
            r0 = move-exception
            r3 = r1
        L_0x00a5:
            if (r3 == 0) goto L_0x00aa
            r3.close()     // Catch:{ IOException -> 0x00ab }
        L_0x00aa:
            throw r0     // Catch:{ all -> 0x009a }
        L_0x00ab:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x009a }
            goto L_0x00aa
        L_0x00b0:
            r0 = move-exception
            goto L_0x00a5
        L_0x00b2:
            r0 = move-exception
            r3 = r2
            goto L_0x00a5
        L_0x00b5:
            r0 = move-exception
            r2 = r1
            goto L_0x0077
        L_0x00b8:
            r0 = move-exception
            r1 = r2
            r2 = r3
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saterskog.cell_lab.j.i(int, android.content.Context):boolean[]");
    }

    public static synchronized boolean[] a(int i) {
        boolean[] zArr;
        synchronized (j.class) {
            if (i != -1) {
                if (a.get(i).h != null) {
                    zArr = a.get(i).h;
                }
            }
            zArr = new boolean[5];
            for (int i2 = 0; i2 < 5; i2++) {
                zArr[i2] = true;
            }
        }
        return zArr;
    }

    public static synchronized int c(Context context) {
        int i;
        synchronized (j.class) {
            a(context);
            int i2 = 0;
            while (true) {
                if (i2 < a.size()) {
                    if (a.get(i2).g != null && !b(i2, context)) {
                        i = i2;
                        break;
                    }
                    i2++;
                } else {
                    i = -1;
                    break;
                }
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4 = new java.io.ObjectInputStream(r10.openFileInput(a.get(r11).b + ".time"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005f, code lost:
        if (r4.readInt() == 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        com.saterskog.b.a.a("LevelManager time version mismatch.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        r0 = r4.readLong();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        if (r1 == null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0082, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0086, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0089, code lost:
        if (r1 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0090, code lost:
        r1.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0094, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009b, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009e, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        r1 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007d A[SYNTHETIC, Splitter:B:30:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008b A[SYNTHETIC, Splitter:B:39:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized long b(android.content.Context r10, int r11) {
        /*
            java.lang.Class<com.saterskog.cell_lab.j> r5 = com.saterskog.cell_lab.j.class
            monitor-enter(r5)
            r2 = 0
            java.util.ArrayList r0 = a((android.content.Context) r10)     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x0074 }
            com.saterskog.cell_lab.j$a r0 = (com.saterskog.cell_lab.j.a) r0     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = r0.b     // Catch:{ all -> 0x0074 }
            java.lang.String[] r4 = d(r10)     // Catch:{ all -> 0x0074 }
            int r6 = r4.length     // Catch:{ all -> 0x0074 }
            r0 = 0
        L_0x0017:
            if (r0 >= r6) goto L_0x00a0
            r7 = r4[r0]     // Catch:{ all -> 0x0074 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
            r8.<init>()     // Catch:{ all -> 0x0074 }
            java.lang.StringBuilder r8 = r8.append(r1)     // Catch:{ all -> 0x0074 }
            java.lang.String r9 = ".time"
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch:{ all -> 0x0074 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0074 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0096
            r1 = 0
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0077 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0077 }
            r6.<init>()     // Catch:{ IOException -> 0x0077 }
            java.util.ArrayList<com.saterskog.cell_lab.j$a> r0 = a     // Catch:{ IOException -> 0x0077 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ IOException -> 0x0077 }
            com.saterskog.cell_lab.j$a r0 = (com.saterskog.cell_lab.j.a) r0     // Catch:{ IOException -> 0x0077 }
            java.lang.String r0 = r0.b     // Catch:{ IOException -> 0x0077 }
            java.lang.StringBuilder r0 = r6.append(r0)     // Catch:{ IOException -> 0x0077 }
            java.lang.String r6 = ".time"
            java.lang.StringBuilder r0 = r0.append(r6)     // Catch:{ IOException -> 0x0077 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0077 }
            java.io.FileInputStream r0 = r10.openFileInput(r0)     // Catch:{ IOException -> 0x0077 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0077 }
            int r0 = r4.readInt()     // Catch:{ IOException -> 0x009d, all -> 0x009a }
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = "LevelManager time version mismatch."
            com.saterskog.b.a.a((java.lang.String) r0)     // Catch:{ IOException -> 0x009d, all -> 0x009a }
        L_0x0066:
            long r0 = r4.readLong()     // Catch:{ IOException -> 0x009d, all -> 0x009a }
            r4.close()     // Catch:{ IOException -> 0x006f }
        L_0x006d:
            monitor-exit(r5)
            return r0
        L_0x006f:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x0074 }
            goto L_0x006d
        L_0x0074:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0077:
            r0 = move-exception
        L_0x0078:
            r0.printStackTrace()     // Catch:{ all -> 0x0088 }
            if (r1 == 0) goto L_0x0094
            r1.close()     // Catch:{ IOException -> 0x0082 }
            r0 = r2
            goto L_0x006d
        L_0x0082:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0074 }
            r0 = r2
            goto L_0x006d
        L_0x0088:
            r0 = move-exception
        L_0x0089:
            if (r1 == 0) goto L_0x008e
            r1.close()     // Catch:{ IOException -> 0x008f }
        L_0x008e:
            throw r0     // Catch:{ all -> 0x0074 }
        L_0x008f:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x0074 }
            goto L_0x008e
        L_0x0094:
            r0 = r2
            goto L_0x006d
        L_0x0096:
            int r0 = r0 + 1
            goto L_0x0017
        L_0x009a:
            r0 = move-exception
            r1 = r4
            goto L_0x0089
        L_0x009d:
            r0 = move-exception
            r1 = r4
            goto L_0x0078
        L_0x00a0:
            r0 = r2
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saterskog.cell_lab.j.b(android.content.Context, int):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071 A[SYNTHETIC, Splitter:B:31:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0080 A[SYNTHETIC, Splitter:B:40:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c A[SYNTHETIC, Splitter:B:47:0x008c] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x005e=Splitter:B:18:0x005e, B:49:0x008f=Splitter:B:49:0x008f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r10, int r11, long r12) {
        /*
            java.lang.Class<com.saterskog.cell_lab.j> r3 = com.saterskog.cell_lab.j.class
            monitor-enter(r3)
            if (r11 < 0) goto L_0x000d
            java.util.ArrayList<com.saterskog.cell_lab.j$a> r0 = a     // Catch:{ all -> 0x0062 }
            int r0 = r0.size()     // Catch:{ all -> 0x0062 }
            if (r11 < r0) goto L_0x0021
        L_0x000d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = "Tried to clock out challenge: "
            r0.<init>(r1)     // Catch:{ all -> 0x0062 }
            java.lang.StringBuilder r0 = r0.append(r11)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0062 }
            com.saterskog.b.a.a((java.lang.String) r0)     // Catch:{ all -> 0x0062 }
        L_0x001f:
            monitor-exit(r3)
            return
        L_0x0021:
            long r0 = com.saterskog.b.a.c()     // Catch:{ all -> 0x0062 }
            long r4 = r0 - r12
            long r6 = b((android.content.Context) r10, (int) r11)     // Catch:{ all -> 0x0062 }
            r2 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r1.<init>()     // Catch:{ all -> 0x0062 }
            java.util.ArrayList<com.saterskog.cell_lab.j$a> r0 = a     // Catch:{ all -> 0x0062 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x0062 }
            com.saterskog.cell_lab.j$a r0 = (com.saterskog.cell_lab.j.a) r0     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r0.b     // Catch:{ all -> 0x0062 }
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = ".time"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0062 }
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ FileNotFoundException -> 0x006a, IOException -> 0x007a }
            r8 = 0
            java.io.FileOutputStream r0 = r10.openFileOutput(r0, r8)     // Catch:{ FileNotFoundException -> 0x006a, IOException -> 0x007a }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x006a, IOException -> 0x007a }
            r0 = 0
            r1.writeInt(r0)     // Catch:{ FileNotFoundException -> 0x009b, IOException -> 0x0098 }
            long r4 = r4 + r6
            r1.writeLong(r4)     // Catch:{ FileNotFoundException -> 0x009b, IOException -> 0x0098 }
            r1.close()     // Catch:{ IOException -> 0x0065 }
        L_0x005e:
            a()     // Catch:{ all -> 0x0062 }
            goto L_0x001f
        L_0x0062:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0065:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0062 }
            goto L_0x005e
        L_0x006a:
            r0 = move-exception
            r1 = r2
        L_0x006c:
            r0.printStackTrace()     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x005e
            r1.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x005e
        L_0x0075:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0062 }
            goto L_0x005e
        L_0x007a:
            r0 = move-exception
        L_0x007b:
            r0.printStackTrace()     // Catch:{ all -> 0x0089 }
            if (r2 == 0) goto L_0x005e
            r2.close()     // Catch:{ IOException -> 0x0084 }
            goto L_0x005e
        L_0x0084:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0062 }
            goto L_0x005e
        L_0x0089:
            r0 = move-exception
        L_0x008a:
            if (r2 == 0) goto L_0x008f
            r2.close()     // Catch:{ IOException -> 0x0090 }
        L_0x008f:
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x0090:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x0062 }
            goto L_0x008f
        L_0x0095:
            r0 = move-exception
            r2 = r1
            goto L_0x008a
        L_0x0098:
            r0 = move-exception
            r2 = r1
            goto L_0x007b
        L_0x009b:
            r0 = move-exception
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saterskog.cell_lab.j.a(android.content.Context, int, long):void");
    }
}
