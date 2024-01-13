package com.google.android.gms.b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.internal.f;
import com.google.android.gms.internal.g;
import com.google.android.gms.internal.ha;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.http.impl.client.DefaultHttpClient;

final class p implements z {
    /* access modifiers changed from: private */
    public static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[]{"hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"});
    private final a b;
    private volatile an c;
    private final aa d;
    /* access modifiers changed from: private */
    public final Context e;
    /* access modifiers changed from: private */
    public final String f;
    private o g;
    private long h;
    private final int i;
    /* access modifiers changed from: private */
    public f j;
    private ak k;
    private volatile boolean l;

    p(aa aaVar, Context context, ak akVar) {
        this(aaVar, context, "google_analytics_v4.db", akVar);
    }

    private p(aa aaVar, Context context, String str, ak akVar) {
        this.l = true;
        this.e = context.getApplicationContext();
        this.k = akVar;
        this.f = str;
        this.d = aaVar;
        this.j = g.c();
        this.b = new a(this.e, this.f);
        this.c = new ad(new DefaultHttpClient(), this.e, this.k);
        this.h = 0;
        this.i = 2000;
    }

    private SQLiteDatabase a(String str) {
        try {
            return this.b.getWritableDatabase();
        } catch (SQLiteException e2) {
            n.d(str);
            return null;
        }
    }

    private static String a(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(l.a((String) next.getKey()) + "=" + l.a((String) next.getValue()));
        }
        return TextUtils.join("&", arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<java.lang.String> a(int r14) {
        /*
            r13 = this;
            r10 = 0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            if (r14 > 0) goto L_0x000f
            java.lang.String r0 = "Invalid maxHits specified. Skipping"
            com.google.android.gms.b.n.d(r0)
            r0 = r9
        L_0x000e:
            return r0
        L_0x000f:
            java.lang.String r0 = "Error opening database for peekHitIds."
            android.database.sqlite.SQLiteDatabase r0 = r13.a((java.lang.String) r0)
            if (r0 != 0) goto L_0x0019
            r0 = r9
            goto L_0x000e
        L_0x0019:
            java.lang.String r1 = "hits2"
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x005c, all -> 0x007a }
            r3 = 0
            java.lang.String r4 = "hit_id"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x005c, all -> 0x007a }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = "%s ASC"
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ SQLiteException -> 0x005c, all -> 0x007a }
            r11 = 0
            java.lang.String r12 = "hit_id"
            r8[r11] = r12     // Catch:{ SQLiteException -> 0x005c, all -> 0x007a }
            java.lang.String r7 = java.lang.String.format(r7, r8)     // Catch:{ SQLiteException -> 0x005c, all -> 0x007a }
            java.lang.String r8 = java.lang.Integer.toString(r14)     // Catch:{ SQLiteException -> 0x005c, all -> 0x007a }
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x005c, all -> 0x007a }
            boolean r0 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0084 }
            if (r0 == 0) goto L_0x0055
        L_0x0043:
            r0 = 0
            long r2 = r1.getLong(r0)     // Catch:{ SQLiteException -> 0x0084 }
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ SQLiteException -> 0x0084 }
            r9.add(r0)     // Catch:{ SQLiteException -> 0x0084 }
            boolean r0 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0084 }
            if (r0 != 0) goto L_0x0043
        L_0x0055:
            if (r1 == 0) goto L_0x005a
            r1.close()
        L_0x005a:
            r0 = r9
            goto L_0x000e
        L_0x005c:
            r0 = move-exception
            r1 = r10
        L_0x005e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = "Error in peekHits fetching hitIds: "
            r2.<init>(r3)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.b.n.d(r0)     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x005a
            r1.close()
            goto L_0x005a
        L_0x007a:
            r0 = move-exception
            r1 = r10
        L_0x007c:
            if (r1 == 0) goto L_0x0081
            r1.close()
        L_0x0081:
            throw r0
        L_0x0082:
            r0 = move-exception
            goto L_0x007c
        L_0x0084:
            r0 = move-exception
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.p.a(int):java.util.List");
    }

    private void a(String[] strArr) {
        boolean z = true;
        if (strArr == null || strArr.length == 0) {
            n.d("Empty hitIds passed to deleteHits.");
            return;
        }
        SQLiteDatabase a2 = a("Error opening database for deleteHits.");
        if (a2 != null) {
            try {
                a2.delete("hits2", String.format("HIT_ID in (%s)", new Object[]{TextUtils.join(",", Collections.nCopies(strArr.length, "?"))}), strArr);
                aa aaVar = this.d;
                if (f() != 0) {
                    z = false;
                }
                aaVar.a(z);
            } catch (SQLiteException e2) {
                n.d("Error deleting hits " + TextUtils.join(",", strArr));
            }
        }
    }

    private int f() {
        Cursor cursor = null;
        int i2 = 0;
        SQLiteDatabase a2 = a("Error opening database for getNumStoredHits.");
        if (a2 != null) {
            try {
                Cursor rawQuery = a2.rawQuery("SELECT COUNT(*) from hits2", (String[]) null);
                if (rawQuery.moveToFirst()) {
                    i2 = (int) rawQuery.getLong(0);
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (SQLiteException e2) {
                n.d("Error getting numStoredHits");
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        return i2;
    }

    public final void a() {
        boolean z = true;
        SQLiteDatabase a2 = a("Error opening database for clearHits");
        if (a2 != null) {
            if (0 == 0) {
                a2.delete("hits2", (String) null, (String[]) null);
            } else {
                Long l2 = 0L;
                a2.delete("hits2", "hit_app_id = ?", new String[]{l2.toString()});
            }
            aa aaVar = this.d;
            if (f() != 0) {
                z = false;
            }
            aaVar.a(z);
        }
    }

    public final void a(boolean z) {
        this.l = z;
        if (this.c != null) {
            this.c.a(z);
        }
    }

    public final an c() {
        return this.c;
    }

    class a extends SQLiteOpenHelper {
        private boolean b;
        private long c = 0;

        a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean a(java.lang.String r10, android.database.sqlite.SQLiteDatabase r11) {
            /*
                r8 = 0
                r9 = 0
                java.lang.String r1 = "SQLITE_MASTER"
                r0 = 1
                java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0026, all -> 0x0041 }
                r0 = 0
                java.lang.String r3 = "name"
                r2[r0] = r3     // Catch:{ SQLiteException -> 0x0026, all -> 0x0041 }
                java.lang.String r3 = "name=?"
                r0 = 1
                java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0026, all -> 0x0041 }
                r0 = 0
                r4[r0] = r10     // Catch:{ SQLiteException -> 0x0026, all -> 0x0041 }
                r5 = 0
                r6 = 0
                r7 = 0
                r0 = r11
                android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x0026, all -> 0x0041 }
                boolean r0 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x004f, all -> 0x0048 }
                if (r1 == 0) goto L_0x0025
                r1.close()
            L_0x0025:
                return r0
            L_0x0026:
                r0 = move-exception
                r0 = r9
            L_0x0028:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
                java.lang.String r2 = "Error querying for table "
                r1.<init>(r2)     // Catch:{ all -> 0x004b }
                java.lang.StringBuilder r1 = r1.append(r10)     // Catch:{ all -> 0x004b }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x004b }
                com.google.android.gms.b.n.d(r1)     // Catch:{ all -> 0x004b }
                if (r0 == 0) goto L_0x003f
                r0.close()
            L_0x003f:
                r0 = r8
                goto L_0x0025
            L_0x0041:
                r0 = move-exception
            L_0x0042:
                if (r9 == 0) goto L_0x0047
                r9.close()
            L_0x0047:
                throw r0
            L_0x0048:
                r0 = move-exception
                r9 = r1
                goto L_0x0042
            L_0x004b:
                r1 = move-exception
                r9 = r0
                r0 = r1
                goto L_0x0042
            L_0x004f:
                r0 = move-exception
                r0 = r1
                goto L_0x0028
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.p.a.a(java.lang.String, android.database.sqlite.SQLiteDatabase):boolean");
        }

        public final SQLiteDatabase getWritableDatabase() {
            if (!this.b || this.c + 3600000 <= p.this.j.a()) {
                SQLiteDatabase sQLiteDatabase = null;
                this.b = true;
                this.c = p.this.j.a();
                try {
                    sQLiteDatabase = super.getWritableDatabase();
                } catch (SQLiteException e) {
                    p.this.e.getDatabasePath(p.this.f).delete();
                }
                if (sQLiteDatabase == null) {
                    sQLiteDatabase = super.getWritableDatabase();
                }
                this.b = false;
                return sQLiteDatabase;
            }
            throw new SQLiteException("Database creation failed");
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        /* JADX INFO: finally extract failed */
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            boolean z = false;
            if (Build.VERSION.SDK_INT < 15) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", (String[]) null);
                try {
                    rawQuery.moveToFirst();
                } finally {
                    rawQuery.close();
                }
            }
            if (!a("hits2", sQLiteDatabase)) {
                sQLiteDatabase.execSQL(p.a);
                return;
            }
            Cursor rawQuery2 = sQLiteDatabase.rawQuery("SELECT * FROM hits2 WHERE 0", (String[]) null);
            HashSet hashSet = new HashSet();
            try {
                String[] columnNames = rawQuery2.getColumnNames();
                for (String add : columnNames) {
                    hashSet.add(add);
                }
                rawQuery2.close();
                if (!hashSet.remove("hit_id") || !hashSet.remove("hit_url") || !hashSet.remove("hit_string") || !hashSet.remove("hit_time")) {
                    throw new SQLiteException("Database column missing");
                }
                if (!hashSet.remove("hit_app_id")) {
                    z = true;
                }
                if (!hashSet.isEmpty()) {
                    throw new SQLiteException("Database has extra columns");
                } else if (z) {
                    sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id");
                }
            } catch (Throwable th) {
                rawQuery2.close();
                throw th;
            }
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            String path = sQLiteDatabase.getPath();
            if (ap.a() >= 9) {
                File file = new File(path);
                file.setReadable(false, false);
                file.setWritable(false, false);
                file.setReadable(true, true);
                file.setWritable(true, true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Map<java.lang.String, java.lang.String> r9, long r10, java.lang.String r12, java.util.Collection<com.google.android.gms.internal.ha> r13) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            com.google.android.gms.internal.f r2 = r8.j
            long r2 = r2.a()
            long r4 = r8.h
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 + r6
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0042
            r8.h = r2
            java.lang.String r2 = "Error opening database for deleteStaleHits."
            android.database.sqlite.SQLiteDatabase r2 = r8.a((java.lang.String) r2)
            if (r2 == 0) goto L_0x0042
            com.google.android.gms.internal.f r3 = r8.j
            long r4 = r3.a()
            r6 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r4 = r4 - r6
            java.lang.String r3 = "hits2"
            java.lang.String r6 = "HIT_TIME < ?"
            java.lang.String[] r7 = new java.lang.String[r0]
            java.lang.String r4 = java.lang.Long.toString(r4)
            r7[r1] = r4
            r2.delete(r3, r6, r7)
            com.google.android.gms.b.aa r2 = r8.d
            int r3 = r8.f()
            if (r3 != 0) goto L_0x00c9
        L_0x003f:
            r2.a(r0)
        L_0x0042:
            int r0 = r8.f()
            int r2 = r8.i
            int r0 = r0 - r2
            int r0 = r0 + 1
            if (r0 <= 0) goto L_0x0078
            java.util.List r0 = r8.a((int) r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Store full, deleting "
            r2.<init>(r3)
            int r3 = r0.size()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " hits to make room."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.google.android.gms.b.n.c(r2)
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r8.a((java.lang.String[]) r0)
        L_0x0078:
            a(r9, r13)
            java.lang.String r0 = "Error opening database for putHit"
            android.database.sqlite.SQLiteDatabase r4 = r8.a((java.lang.String) r0)
            if (r4 == 0) goto L_0x00c8
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r0 = "hit_string"
            java.lang.String r1 = a((java.util.Map<java.lang.String, java.lang.String>) r9)
            r5.put(r0, r1)
            java.lang.String r0 = "hit_time"
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r5.put(r0, r1)
            r2 = 0
            java.lang.String r0 = "AppUID"
            boolean r0 = r9.containsKey(r0)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "AppUID"
            java.lang.Object r0 = r9.get(r0)     // Catch:{ NumberFormatException -> 0x00cc }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x00cc }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x00cc }
        L_0x00b0:
            java.lang.String r2 = "hit_app_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.put(r2, r0)
            if (r12 != 0) goto L_0x00bd
            java.lang.String r12 = "http://www.google-analytics.com/collect"
        L_0x00bd:
            int r0 = r12.length()
            if (r0 != 0) goto L_0x00cf
            java.lang.String r0 = "Empty path: not sending hit"
            com.google.android.gms.b.n.d(r0)
        L_0x00c8:
            return
        L_0x00c9:
            r0 = r1
            goto L_0x003f
        L_0x00cc:
            r0 = move-exception
        L_0x00cd:
            r0 = r2
            goto L_0x00b0
        L_0x00cf:
            java.lang.String r0 = "hit_url"
            r5.put(r0, r12)
            java.lang.String r0 = "hits2"
            r1 = 0
            r4.insert(r0, r1, r5)     // Catch:{ SQLiteException -> 0x00e1 }
            com.google.android.gms.b.aa r0 = r8.d     // Catch:{ SQLiteException -> 0x00e1 }
            r1 = 0
            r0.a(r1)     // Catch:{ SQLiteException -> 0x00e1 }
            goto L_0x00c8
        L_0x00e1:
            r0 = move-exception
            java.lang.String r0 = "Error storing hit"
            com.google.android.gms.b.n.d(r0)
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.p.a(java.util.Map, long, java.lang.String, java.util.Collection):void");
    }

    private static void a(Map<String, String> map, Collection<ha> collection) {
        String substring = "&_v".substring(1);
        if (collection != null) {
            for (ha next : collection) {
                if ("appendVersion".equals(next.a)) {
                    map.put(substring, next.b);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fe, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018b, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018c, code lost:
        r12 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0193, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0194, code lost:
        r3 = r2;
        r4 = r13;
        r2 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.google.android.gms.b.k> e() {
        /*
            r17 = this;
            r14 = 1
            r15 = 0
            r12 = 0
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.String r2 = "Error opening database for peekHits"
            r0 = r17
            android.database.sqlite.SQLiteDatabase r2 = r0.a((java.lang.String) r2)
            if (r2 != 0) goto L_0x0014
            r2 = r11
        L_0x0013:
            return r2
        L_0x0014:
            java.lang.String r3 = "hits2"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x00e2, all -> 0x0103 }
            r5 = 0
            java.lang.String r6 = "hit_id"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x00e2, all -> 0x0103 }
            r5 = 1
            java.lang.String r6 = "hit_time"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x00e2, all -> 0x0103 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "%s ASC"
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ SQLiteException -> 0x00e2, all -> 0x0103 }
            r13 = 0
            java.lang.String r16 = "hit_id"
            r10[r13] = r16     // Catch:{ SQLiteException -> 0x00e2, all -> 0x0103 }
            java.lang.String r9 = java.lang.String.format(r9, r10)     // Catch:{ SQLiteException -> 0x00e2, all -> 0x0103 }
            r10 = 20
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch:{ SQLiteException -> 0x00e2, all -> 0x0103 }
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00e2, all -> 0x0103 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0193, all -> 0x018b }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0193, all -> 0x018b }
            boolean r3 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x0199, all -> 0x018b }
            if (r3 == 0) goto L_0x0064
        L_0x004a:
            com.google.android.gms.b.k r3 = new com.google.android.gms.b.k     // Catch:{ SQLiteException -> 0x0199, all -> 0x018b }
            r4 = 0
            long r4 = r13.getLong(r4)     // Catch:{ SQLiteException -> 0x0199, all -> 0x018b }
            r6 = 1
            long r6 = r13.getLong(r6)     // Catch:{ SQLiteException -> 0x0199, all -> 0x018b }
            java.lang.String r8 = ""
            r3.<init>(r4, r6, r8)     // Catch:{ SQLiteException -> 0x0199, all -> 0x018b }
            r12.add(r3)     // Catch:{ SQLiteException -> 0x0199, all -> 0x018b }
            boolean r3 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x0199, all -> 0x018b }
            if (r3 != 0) goto L_0x004a
        L_0x0064:
            if (r13 == 0) goto L_0x0069
            r13.close()
        L_0x0069:
            java.lang.String r3 = "hits2"
            r4 = 3
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0189 }
            r5 = 0
            java.lang.String r6 = "hit_id"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0189 }
            r5 = 1
            java.lang.String r6 = "hit_string"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0189 }
            r5 = 2
            java.lang.String r6 = "hit_url"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0189 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "%s ASC"
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ SQLiteException -> 0x0189 }
            r11 = 0
            java.lang.String r16 = "hit_id"
            r10[r11] = r16     // Catch:{ SQLiteException -> 0x0189 }
            java.lang.String r9 = java.lang.String.format(r9, r10)     // Catch:{ SQLiteException -> 0x0189 }
            r10 = 20
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch:{ SQLiteException -> 0x0189 }
            android.database.Cursor r3 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0189 }
            boolean r2 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            if (r2 == 0) goto L_0x00da
            r4 = r15
        L_0x00a0:
            r0 = r3
            android.database.sqlite.SQLiteCursor r0 = (android.database.sqlite.SQLiteCursor) r0     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            r2 = r0
            android.database.CursorWindow r2 = r2.getWindow()     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            int r2 = r2.getNumRows()     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            if (r2 <= 0) goto L_0x0161
            java.lang.Object r2 = r12.get(r4)     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            com.google.android.gms.b.k r2 = (com.google.android.gms.b.k) r2     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            r5 = 1
            java.lang.String r5 = r3.getString(r5)     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            r2.a = r5     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            java.lang.Object r2 = r12.get(r4)     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            com.google.android.gms.b.k r2 = (com.google.android.gms.b.k) r2     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            r5 = 2
            java.lang.String r5 = r3.getString(r5)     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            if (r5 == 0) goto L_0x00d2
            java.lang.String r6 = r5.trim()     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            if (r6 == 0) goto L_0x010a
        L_0x00d2:
            int r2 = r4 + 1
            boolean r4 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            if (r4 != 0) goto L_0x019f
        L_0x00da:
            if (r3 == 0) goto L_0x00df
            r3.close()
        L_0x00df:
            r2 = r12
            goto L_0x0013
        L_0x00e2:
            r2 = move-exception
            r3 = r2
            r4 = r12
            r2 = r11
        L_0x00e6:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x018f }
            java.lang.String r6 = "Error in peekHits fetching hitIds: "
            r5.<init>(r6)     // Catch:{ all -> 0x018f }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x018f }
            java.lang.StringBuilder r3 = r5.append(r3)     // Catch:{ all -> 0x018f }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x018f }
            com.google.android.gms.b.n.d(r3)     // Catch:{ all -> 0x018f }
            if (r4 == 0) goto L_0x0013
            r4.close()
            goto L_0x0013
        L_0x0103:
            r2 = move-exception
        L_0x0104:
            if (r12 == 0) goto L_0x0109
            r12.close()
        L_0x0109:
            throw r2
        L_0x010a:
            r2.d = r5     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            java.lang.String r6 = "http:"
            boolean r5 = r5.startsWith(r6)     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            if (r5 == 0) goto L_0x00d2
            java.lang.String r5 = "http:"
            r2.e = r5     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            goto L_0x00d2
        L_0x011d:
            r2 = move-exception
            r13 = r3
        L_0x011f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x015a }
            java.lang.String r4 = "Error in peekHits fetching hitString: "
            r3.<init>(r4)     // Catch:{ all -> 0x015a }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x015a }
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch:{ all -> 0x015a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x015a }
            com.google.android.gms.b.n.d(r2)     // Catch:{ all -> 0x015a }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x015a }
            r3.<init>()     // Catch:{ all -> 0x015a }
            java.util.Iterator r5 = r12.iterator()     // Catch:{ all -> 0x015a }
            r4 = r15
        L_0x013f:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x015a }
            if (r2 == 0) goto L_0x0181
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x015a }
            com.google.android.gms.b.k r2 = (com.google.android.gms.b.k) r2     // Catch:{ all -> 0x015a }
            java.lang.String r6 = r2.a     // Catch:{ all -> 0x015a }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x015a }
            if (r6 == 0) goto L_0x0156
            if (r4 != 0) goto L_0x0181
            r4 = r14
        L_0x0156:
            r3.add(r2)     // Catch:{ all -> 0x015a }
            goto L_0x013f
        L_0x015a:
            r2 = move-exception
        L_0x015b:
            if (r13 == 0) goto L_0x0160
            r13.close()
        L_0x0160:
            throw r2
        L_0x0161:
            java.lang.String r5 = "HitString for hitId %d too large.  Hit will be deleted."
            r2 = 1
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            r7 = 0
            java.lang.Object r2 = r12.get(r4)     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            com.google.android.gms.b.k r2 = (com.google.android.gms.b.k) r2     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            long r8 = r2.b     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            r6[r7] = r2     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            java.lang.String r2 = java.lang.String.format(r5, r6)     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            com.google.android.gms.b.n.d(r2)     // Catch:{ SQLiteException -> 0x011d, all -> 0x017e }
            goto L_0x00d2
        L_0x017e:
            r2 = move-exception
            r13 = r3
            goto L_0x015b
        L_0x0181:
            if (r13 == 0) goto L_0x0186
            r13.close()
        L_0x0186:
            r2 = r3
            goto L_0x0013
        L_0x0189:
            r2 = move-exception
            goto L_0x011f
        L_0x018b:
            r2 = move-exception
            r12 = r13
            goto L_0x0104
        L_0x018f:
            r2 = move-exception
            r12 = r4
            goto L_0x0104
        L_0x0193:
            r2 = move-exception
            r3 = r2
            r4 = r13
            r2 = r11
            goto L_0x00e6
        L_0x0199:
            r2 = move-exception
            r3 = r2
            r4 = r13
            r2 = r12
            goto L_0x00e6
        L_0x019f:
            r4 = r2
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.p.e():java.util.List");
    }

    @Deprecated
    private void a(Collection<k> collection) {
        if (collection == null || collection.isEmpty()) {
            n.d("Empty/Null collection passed to deleteHits.");
            return;
        }
        String[] strArr = new String[collection.size()];
        int i2 = 0;
        for (k kVar : collection) {
            strArr[i2] = String.valueOf(kVar.b);
            i2++;
        }
        a(strArr);
    }

    public final void b() {
        boolean z = true;
        n.c("Dispatch running...");
        if (this.c.a()) {
            List<k> e2 = e();
            if (e2.isEmpty()) {
                n.c("...nothing to dispatch");
                this.d.a(true);
                return;
            }
            if (this.g == null) {
                this.g = new o("_t=dispatch&_v=ma4.0.4");
            }
            if (f() > e2.size()) {
                z = false;
            }
            int a2 = this.c.a(e2, this.g, z);
            n.c("sent " + a2 + " of " + e2.size() + " hits");
            a((Collection<k>) e2.subList(0, Math.min(a2, e2.size())));
            if (a2 != e2.size() || f() <= 0) {
                this.g = null;
            } else {
                c.a(this.e).c.a();
            }
        }
    }
}
