/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.database.sqlite.SQLiteOpenHelper
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  org.apache.http.client.HttpClient
 *  org.apache.http.impl.client.DefaultHttpClient
 */
package com.google.android.gms.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.b.aa;
import com.google.android.gms.b.ad;
import com.google.android.gms.b.ak;
import com.google.android.gms.b.an;
import com.google.android.gms.b.ap;
import com.google.android.gms.b.c;
import com.google.android.gms.b.k;
import com.google.android.gms.b.l;
import com.google.android.gms.b.n;
import com.google.android.gms.b.o;
import com.google.android.gms.b.z;
import com.google.android.gms.internal.f;
import com.google.android.gms.internal.g;
import com.google.android.gms.internal.ha;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

final class p
implements z {
    private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");
    private final a b;
    private volatile an c;
    private final aa d;
    private final Context e;
    private final String f;
    private o g;
    private long h;
    private final int i;
    private f j;
    private ak k;
    private volatile boolean l = true;

    p(aa aa2, Context context, ak ak2) {
        this(aa2, context, "google_analytics_v4.db", ak2);
    }

    private p(aa aa2, Context context, String string, ak ak2) {
        this.e = context.getApplicationContext();
        this.k = ak2;
        this.f = string;
        this.d = aa2;
        this.j = com.google.android.gms.internal.g.c();
        this.b = new a(this.e, this.f);
        this.c = new ad((HttpClient)new DefaultHttpClient(), this.e, this.k);
        this.h = 0L;
        this.i = 2000;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private SQLiteDatabase a(String string) {
        try {
            SQLiteDatabase sQLiteDatabase = this.b.getWritableDatabase();
            return sQLiteDatabase;
        }
        catch (SQLiteException sQLiteException) {
            n.d(string);
            return null;
        }
    }

    private static String a(Map<String, String> object) {
        ArrayList<String> arrayList = new ArrayList<String>(object.size());
        for (Map.Entry entry : object.entrySet()) {
            arrayList.add(com.google.android.gms.b.l.a((String)entry.getKey()) + "=" + com.google.android.gms.b.l.a((String)entry.getValue()));
        }
        return TextUtils.join((CharSequence)"&", arrayList);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    private List<String> a(int var1_1) {
        var2_2 = new ArrayList<String>();
        if (var1_1 <= 0) {
            n.d("Invalid maxHits specified. Skipping");
lbl4:
            // 6 sources

            return var2_2;
        }
        var3_3 = this.a("Error opening database for peekHitIds.");
        if (var3_3 == null) ** GOTO lbl4
        var4_15 = String.format("%s ASC", new Object[]{"hit_id"});
        var5_19 = Integer.toString(var1_1);
        var3_4 = var4_15 = var3_3.query("hits2", new String[]{"hit_id"}, null, null, null, null, var4_15, var5_19);
        try {
            if (var4_15.moveToFirst()) {
                do {
                    var3_6 = var4_15;
                    var2_2.add(String.valueOf(var4_15.getLong(0)));
                    var3_7 = var4_15;
                } while (var6_23 = var4_15.moveToNext());
            }
            if (var4_15 == null) ** GOTO lbl4
        }
        catch (SQLiteException var5_22) {
            ** continue;
        }
        var4_15.close();
        ** GOTO lbl4
        catch (SQLiteException var5_20) {
            var4_15 = null;
lbl25:
            // 2 sources

            while (true) {
                var3_9 = var4_15;
                var3_10 = var4_15;
                var7_24 = new StringBuilder("Error in peekHits fetching hitIds: ");
                var3_11 = var4_15;
                n.d(var7_24.append(var5_21.getMessage()).toString());
                if (var4_15 == null) ** GOTO lbl4
                var4_15.close();
                ** continue;
                break;
            }
        }
        catch (Throwable var4_16) {
            var3_12 = null;
lbl37:
            // 2 sources

            while (true) {
                if (var3_13 != null) {
                    var3_13.close();
                }
                throw var4_17;
            }
        }
        {
            catch (Throwable var4_18) {
                ** continue;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Deprecated
    private void a(Collection<k> iterator) {
        if (iterator == null || iterator.isEmpty()) {
            n.d("Empty/Null collection passed to deleteHits.");
            return;
        }
        String[] arrstring = new String[iterator.size()];
        iterator = iterator.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            arrstring[n2] = String.valueOf(((k)iterator.next()).b);
            ++n2;
        }
        this.a(arrstring);
    }

    private static void a(Map<String, String> map, Collection<ha> object) {
        String string = "&_v".substring(1);
        if (object != null) {
            Iterator<ha> iterator = object.iterator();
            while (iterator.hasNext()) {
                object = iterator.next();
                if (!"appendVersion".equals(((ha)object).a)) continue;
                map.put(string, ((ha)object).b);
                break;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(String[] arrstring) {
        Object object;
        boolean bl;
        block4: {
            block3: {
                bl = true;
                if (arrstring == null || arrstring.length == 0) {
                    n.d("Empty hitIds passed to deleteHits.");
                    return;
                }
                SQLiteDatabase sQLiteDatabase = this.a("Error opening database for deleteHits.");
                if (sQLiteDatabase == null) return;
                object = String.format("HIT_ID in (%s)", TextUtils.join((CharSequence)",", Collections.nCopies(arrstring.length, "?")));
                try {
                    sQLiteDatabase.delete("hits2", (String)object, arrstring);
                    object = this.d;
                    if (this.f() != 0) break block3;
                    break block4;
                }
                catch (SQLiteException sQLiteException) {
                    n.d("Error deleting hits " + TextUtils.join((CharSequence)",", (Object[])arrstring));
                    return;
                }
            }
            bl = false;
        }
        object.a(bl);
    }

    /*
     * Exception decompiling
     */
    private List<k> e() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:406)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:481)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int f() {
        int n2;
        SQLiteDatabase sQLiteDatabase;
        int n3;
        block7: {
            long l2;
            SQLiteDatabase sQLiteDatabase2 = null;
            SQLiteDatabase sQLiteDatabase3 = null;
            n3 = 0;
            int n4 = 0;
            sQLiteDatabase = this.a("Error opening database for getNumStoredHits.");
            if (sQLiteDatabase == null) {
                return n4;
            }
            sQLiteDatabase3 = sQLiteDatabase = sQLiteDatabase.rawQuery("SELECT COUNT(*) from hits2", null);
            sQLiteDatabase2 = sQLiteDatabase;
            if (!sQLiteDatabase.moveToFirst()) break block7;
            sQLiteDatabase3 = sQLiteDatabase;
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                l2 = sQLiteDatabase.getLong(0);
            }
            catch (SQLiteException sQLiteException) {
                sQLiteDatabase2 = sQLiteDatabase3;
                try {
                    n.d("Error getting numStoredHits");
                    n2 = n4;
                    if (sQLiteDatabase3 == null) return n2;
                }
                catch (Throwable throwable) {
                    if (sQLiteDatabase2 == null) throw throwable;
                    sQLiteDatabase2.close();
                    throw throwable;
                }
                sQLiteDatabase3.close();
                return n4;
            }
            n3 = (int)l2;
        }
        n2 = n3;
        if (sQLiteDatabase == null) return n2;
        sQLiteDatabase.close();
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a() {
        boolean bl = true;
        Object object = this.a("Error opening database for clearHits");
        if (object == null) return;
        object.delete("hits2", null, null);
        object = this.d;
        if (this.f() != 0) {
            bl = false;
        }
        object.a(bl);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(Map<String, String> object, long l2, String string, Collection<ha> contentValues) {
        Object object2;
        block11: {
            int n2;
            boolean bl = true;
            long l3 = this.j.a();
            if (l3 > this.h + 86400000L) {
                this.h = l3;
                object2 = this.a("Error opening database for deleteStaleHits.");
                if (object2 != null) {
                    object2.delete("hits2", "HIT_TIME < ?", new String[]{Long.toString(this.j.a() - 2592000000L)});
                    object2 = this.d;
                    if (this.f() != 0) {
                        bl = false;
                    }
                    object2.a(bl);
                }
            }
            if ((n2 = this.f() - this.i + 1) > 0) {
                object2 = this.a(n2);
                n.c("Store full, deleting " + object2.size() + " hits to make room.");
                this.a(object2.toArray(new String[0]));
            }
            p.a((Map<String, String>)object, (Collection<ha>)contentValues);
            object2 = this.a("Error opening database for putHit");
            if (object2 == null) return;
            contentValues = new ContentValues();
            contentValues.put("hit_string", p.a((Map<String, String>)object));
            contentValues.put("hit_time", Long.valueOf(l2));
            if (object.containsKey("AppUID")) {
                try {
                    l2 = Long.parseLong((String)object.get("AppUID"));
                    break block11;
                }
                catch (NumberFormatException numberFormatException) {
                    // empty catch block
                }
            }
            l2 = 0L;
        }
        contentValues.put("hit_app_id", Long.valueOf(l2));
        object = string;
        if (string == null) {
            object = "http://www.google-analytics.com/collect";
        }
        if (((String)object).length() == 0) {
            n.d("Empty path: not sending hit");
            return;
        }
        contentValues.put("hit_url", (String)object);
        try {
            object2.insert("hits2", null, contentValues);
            this.d.a(false);
            return;
        }
        catch (SQLiteException sQLiteException) {
            n.d("Error storing hit");
            return;
        }
    }

    @Override
    public final void a(boolean bl) {
        this.l = bl;
        if (this.c != null) {
            this.c.a(bl);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void b() {
        boolean bl = true;
        n.c("Dispatch running...");
        if (!this.c.a()) {
            return;
        }
        List<k> list = this.e();
        if (list.isEmpty()) {
            n.c("...nothing to dispatch");
            this.d.a(true);
            return;
        }
        if (this.g == null) {
            this.g = new o("_t=dispatch&_v=ma4.0.4");
        }
        if (this.f() > list.size()) {
            bl = false;
        }
        int n2 = this.c.a(list, this.g, bl);
        n.c("sent " + n2 + " of " + list.size() + " hits");
        this.a(list.subList(0, Math.min(n2, list.size())));
        if (n2 == list.size() && this.f() > 0) {
            com.google.android.gms.b.c.a((Context)this.e).c.a();
            return;
        }
        this.g = null;
    }

    @Override
    public final an c() {
        return this.c;
    }

    final class a
    extends SQLiteOpenHelper {
        private boolean b;
        private long c;

        a(Context context, String string) {
            super(context, string, null, 1);
            this.c = 0L;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive exception aggregation
         */
        private static boolean a(String var0, SQLiteDatabase var1_5) {
            block12: {
                var2_7 = null;
                var1_5 = var1_5.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{var0}, null, null, null);
                try {
                    var4_10 = var3_9 = var1_5.moveToFirst();
                    if (var1_5 == null) break block12;
                }
                catch (Throwable var0_3) {
                    ** GOTO lbl25
                }
                var1_5.close();
                var4_10 = var3_9;
            }
lbl10:
            // 2 sources

            return var4_10;
            catch (SQLiteException var1_6) {
                var1_5 = null;
lbl14:
                // 2 sources

                while (true) {
                    block13: {
                        var2_7 = new StringBuilder("Error querying for table ");
                        n.d(var2_7.append(var0).toString());
                        if (var1_5 == null) break block13;
                        var1_5.close();
                    }
                    var4_10 = false;
                    ** continue;
                    break;
                }
            }
            catch (Throwable var0_1) {
                var1_5 = var2_7;
lbl25:
                // 3 sources

                while (true) {
                    if (var1_5 != null) {
                        var1_5.close();
                    }
                    throw var0_2;
                }
            }
            {
                catch (Throwable var0_4) {
                    ** continue;
                }
            }
            catch (SQLiteException var2_8) {
                ** continue;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final SQLiteDatabase getWritableDatabase() {
            SQLiteDatabase sQLiteDatabase;
            if (this.b && this.c + 3600000L > p.this.j.a()) {
                throw new SQLiteException("Database creation failed");
            }
            SQLiteDatabase sQLiteDatabase2 = null;
            this.b = true;
            this.c = p.this.j.a();
            try {
                sQLiteDatabase2 = sQLiteDatabase = super.getWritableDatabase();
            }
            catch (SQLiteException sQLiteException) {
                p.this.e.getDatabasePath(p.this.f).delete();
            }
            sQLiteDatabase = sQLiteDatabase2;
            if (sQLiteDatabase2 == null) {
                sQLiteDatabase = super.getWritableDatabase();
            }
            this.b = false;
            return sQLiteDatabase;
        }

        public final void onCreate(SQLiteDatabase object) {
            object = object.getPath();
            if (ap.a() >= 9) {
                object = new File((String)object);
                ((File)object).setReadable(false, false);
                ((File)object).setWritable(false, false);
                ((File)object).setReadable(true, true);
                ((File)object).setWritable(true, true);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            int n2;
            Cursor cursor;
            int n3;
            block13: {
                n3 = 0;
                if (Build.VERSION.SDK_INT < 15) {
                    cursor = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
                    cursor.moveToFirst();
                }
                if (!com.google.android.gms.b.p$a.a("hits2", sQLiteDatabase)) {
                    sQLiteDatabase.execSQL(a);
                    return;
                }
                break block13;
                finally {
                    cursor.close();
                }
            }
            cursor = sQLiteDatabase.rawQuery("SELECT * FROM hits2 WHERE 0", null);
            HashSet<String> hashSet = new HashSet<String>();
            try {
                String[] arrstring = cursor.getColumnNames();
                for (n2 = 0; n2 < arrstring.length; ++n2) {
                    hashSet.add(arrstring[n2]);
                }
            }
            finally {
                cursor.close();
            }
            if (!hashSet.remove("hit_id")) throw new SQLiteException("Database column missing");
            if (!hashSet.remove("hit_url")) throw new SQLiteException("Database column missing");
            if (!hashSet.remove("hit_string")) throw new SQLiteException("Database column missing");
            if (!hashSet.remove("hit_time")) {
                throw new SQLiteException("Database column missing");
            }
            n2 = n3;
            if (!hashSet.remove("hit_app_id")) {
                n2 = 1;
            }
            if (!hashSet.isEmpty()) {
                throw new SQLiteException("Database has extra columns");
            }
            if (n2 == 0) return;
            sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id");
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
        }
    }
}

