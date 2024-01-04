// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import java.util.HashSet;
import android.os.Build$VERSION;
import java.io.File;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.database.Cursor;
import java.util.Collections;
import com.google.android.gms.internal.ha;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteDatabase;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import com.google.android.gms.internal.g;
import com.google.android.gms.internal.f;
import android.content.Context;

final class p implements z
{
    private static final String a;
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
    private volatile boolean l;
    
    static {
        a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");
    }
    
    p(final aa aa, final Context context, final ak ak) {
        this(aa, context, "google_analytics_v4.db", ak);
    }
    
    private p(final aa d, final Context context, final String f, final ak k) {
        this.l = true;
        this.e = context.getApplicationContext();
        this.k = k;
        this.f = f;
        this.d = d;
        this.j = com.google.android.gms.internal.g.c();
        this.b = new a(this.e, this.f);
        this.c = new ad((HttpClient)new DefaultHttpClient(), this.e, this.k);
        this.h = 0L;
        this.i = 2000;
    }
    
    private SQLiteDatabase a(String writableDatabase) {
        try {
            writableDatabase = (String)this.b.getWritableDatabase();
            return (SQLiteDatabase)writableDatabase;
        }
        catch (SQLiteException ex) {
            n.d(writableDatabase);
            writableDatabase = null;
            return (SQLiteDatabase)writableDatabase;
        }
    }
    
    private static String a(final Map<String, String> map) {
        final ArrayList<String> list = new ArrayList<String>(map.size());
        for (final Map.Entry<String, String> entry : map.entrySet()) {
            list.add(l.a(entry.getKey()) + "=" + l.a(entry.getValue()));
        }
        return TextUtils.join((CharSequence)"&", (Iterable)list);
    }
    
    private List<String> a(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore_2       
        //     8: iload_1        
        //     9: ifgt            19
        //    12: ldc             "Invalid maxHits specified. Skipping"
        //    14: invokestatic    com/google/android/gms/b/n.d:(Ljava/lang/String;)V
        //    17: aload_2        
        //    18: areturn        
        //    19: aload_0        
        //    20: ldc             "Error opening database for peekHitIds."
        //    22: invokespecial   com/google/android/gms/b/p.a:(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
        //    25: astore_3       
        //    26: aload_3        
        //    27: ifnonnull       33
        //    30: goto            17
        //    33: ldc             "%s ASC"
        //    35: iconst_1       
        //    36: anewarray       Ljava/lang/Object;
        //    39: dup            
        //    40: iconst_0       
        //    41: ldc             "hit_id"
        //    43: aastore        
        //    44: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    47: astore          4
        //    49: iload_1        
        //    50: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //    53: astore          5
        //    55: aload_3        
        //    56: ldc             "hits2"
        //    58: iconst_1       
        //    59: anewarray       Ljava/lang/String;
        //    62: dup            
        //    63: iconst_0       
        //    64: ldc             "hit_id"
        //    66: aastore        
        //    67: aconst_null    
        //    68: aconst_null    
        //    69: aconst_null    
        //    70: aconst_null    
        //    71: aload           4
        //    73: aload           5
        //    75: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    78: astore          4
        //    80: aload           4
        //    82: astore_3       
        //    83: aload           4
        //    85: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    90: ifeq            131
        //    93: aload           4
        //    95: astore_3       
        //    96: aload_2        
        //    97: aload           4
        //    99: iconst_0       
        //   100: invokeinterface android/database/Cursor.getLong:(I)J
        //   105: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   108: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   113: pop            
        //   114: aload           4
        //   116: astore_3       
        //   117: aload           4
        //   119: invokeinterface android/database/Cursor.moveToNext:()Z
        //   124: istore          6
        //   126: iload           6
        //   128: ifne            93
        //   131: aload           4
        //   133: ifnull          143
        //   136: aload           4
        //   138: invokeinterface android/database/Cursor.close:()V
        //   143: goto            17
        //   146: astore          5
        //   148: aconst_null    
        //   149: astore          4
        //   151: aload           4
        //   153: astore_3       
        //   154: new             Ljava/lang/StringBuilder;
        //   157: astore          7
        //   159: aload           4
        //   161: astore_3       
        //   162: aload           7
        //   164: ldc             "Error in peekHits fetching hitIds: "
        //   166: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   169: aload           4
        //   171: astore_3       
        //   172: aload           7
        //   174: aload           5
        //   176: invokevirtual   android/database/sqlite/SQLiteException.getMessage:()Ljava/lang/String;
        //   179: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   182: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   185: invokestatic    com/google/android/gms/b/n.d:(Ljava/lang/String;)V
        //   188: aload           4
        //   190: ifnull          143
        //   193: aload           4
        //   195: invokeinterface android/database/Cursor.close:()V
        //   200: goto            143
        //   203: astore          4
        //   205: aconst_null    
        //   206: astore_3       
        //   207: aload_3        
        //   208: ifnull          217
        //   211: aload_3        
        //   212: invokeinterface android/database/Cursor.close:()V
        //   217: aload           4
        //   219: athrow         
        //   220: astore          4
        //   222: goto            207
        //   225: astore          5
        //   227: goto            151
        //    Signature:
        //  (I)Ljava/util/List<Ljava/lang/String;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  33     80     146    151    Landroid/database/sqlite/SQLiteException;
        //  33     80     203    207    Any
        //  83     93     225    230    Landroid/database/sqlite/SQLiteException;
        //  83     93     220    225    Any
        //  96     114    225    230    Landroid/database/sqlite/SQLiteException;
        //  96     114    220    225    Any
        //  117    126    225    230    Landroid/database/sqlite/SQLiteException;
        //  117    126    220    225    Any
        //  154    159    220    225    Any
        //  162    169    220    225    Any
        //  172    188    220    225    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0093:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Deprecated
    private void a(final Collection<k> collection) {
        if (collection == null || collection.isEmpty()) {
            n.d("Empty/Null collection passed to deleteHits.");
        }
        else {
            final String[] array = new String[collection.size()];
            final Iterator<k> iterator = collection.iterator();
            int n = 0;
            while (iterator.hasNext()) {
                array[n] = String.valueOf(iterator.next().b);
                ++n;
            }
            this.a(array);
        }
    }
    
    private static void a(final Map<String, String> map, final Collection<ha> collection) {
        final String substring = "&_v".substring(1);
        if (collection != null) {
            for (final ha ha : collection) {
                if ("appendVersion".equals(ha.a)) {
                    map.put(substring, ha.b);
                    break;
                }
            }
        }
    }
    
    private void a(final String[] array) {
        boolean b = true;
        if (array == null || array.length == 0) {
            n.d("Empty hitIds passed to deleteHits.");
        }
        else {
            final SQLiteDatabase a = this.a("Error opening database for deleteHits.");
            if (a != null) {
                while (true) {
                    final String format = String.format("HIT_ID in (%s)", TextUtils.join((CharSequence)",", (Iterable)Collections.nCopies(array.length, "?")));
                    while (true) {
                        Label_0124: {
                            try {
                                a.delete("hits2", format, array);
                                final aa d = this.d;
                                if (this.f() != 0) {
                                    break Label_0124;
                                }
                                d.a(b);
                            }
                            catch (SQLiteException ex) {
                                n.d("Error deleting hits " + TextUtils.join((CharSequence)",", (Object[])array));
                            }
                            break;
                        }
                        b = false;
                        continue;
                    }
                }
            }
        }
    }
    
    private List<k> e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_1       
        //     2: new             Ljava/util/ArrayList;
        //     5: dup            
        //     6: invokespecial   java/util/ArrayList.<init>:()V
        //     9: astore_2       
        //    10: aload_0        
        //    11: ldc_w           "Error opening database for peekHits"
        //    14: invokespecial   com/google/android/gms/b/p.a:(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
        //    17: astore_3       
        //    18: aload_3        
        //    19: ifnonnull       26
        //    22: aload_2        
        //    23: astore_1       
        //    24: aload_1        
        //    25: areturn        
        //    26: ldc             "%s ASC"
        //    28: iconst_1       
        //    29: anewarray       Ljava/lang/Object;
        //    32: dup            
        //    33: iconst_0       
        //    34: ldc             "hit_id"
        //    36: aastore        
        //    37: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    40: astore          4
        //    42: bipush          20
        //    44: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //    47: astore          5
        //    49: aload_3        
        //    50: ldc             "hits2"
        //    52: iconst_2       
        //    53: anewarray       Ljava/lang/String;
        //    56: dup            
        //    57: iconst_0       
        //    58: ldc             "hit_id"
        //    60: aastore        
        //    61: dup            
        //    62: iconst_1       
        //    63: ldc             "hit_time"
        //    65: aastore        
        //    66: aconst_null    
        //    67: aconst_null    
        //    68: aconst_null    
        //    69: aconst_null    
        //    70: aload           4
        //    72: aload           5
        //    74: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    77: astore          5
        //    79: new             Ljava/util/ArrayList;
        //    82: astore_1       
        //    83: aload_1        
        //    84: invokespecial   java/util/ArrayList.<init>:()V
        //    87: aload           5
        //    89: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    94: ifeq            146
        //    97: new             Lcom/google/android/gms/b/k;
        //   100: astore_2       
        //   101: aload_2        
        //   102: aload           5
        //   104: iconst_0       
        //   105: invokeinterface android/database/Cursor.getLong:(I)J
        //   110: aload           5
        //   112: iconst_1       
        //   113: invokeinterface android/database/Cursor.getLong:(I)J
        //   118: ldc_w           ""
        //   121: invokespecial   com/google/android/gms/b/k.<init>:(JJLjava/lang/String;)V
        //   124: aload_1        
        //   125: aload_2        
        //   126: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   131: pop            
        //   132: aload           5
        //   134: invokeinterface android/database/Cursor.moveToNext:()Z
        //   139: istore          6
        //   141: iload           6
        //   143: ifne            97
        //   146: aload           5
        //   148: ifnull          158
        //   151: aload           5
        //   153: invokeinterface android/database/Cursor.close:()V
        //   158: aload           5
        //   160: astore_2       
        //   161: ldc             "%s ASC"
        //   163: iconst_1       
        //   164: anewarray       Ljava/lang/Object;
        //   167: dup            
        //   168: iconst_0       
        //   169: ldc             "hit_id"
        //   171: aastore        
        //   172: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   175: astore          4
        //   177: aload           5
        //   179: astore_2       
        //   180: bipush          20
        //   182: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   185: astore          7
        //   187: aload           5
        //   189: astore_2       
        //   190: aload_3        
        //   191: ldc             "hits2"
        //   193: iconst_3       
        //   194: anewarray       Ljava/lang/String;
        //   197: dup            
        //   198: iconst_0       
        //   199: ldc             "hit_id"
        //   201: aastore        
        //   202: dup            
        //   203: iconst_1       
        //   204: ldc             "hit_string"
        //   206: aastore        
        //   207: dup            
        //   208: iconst_2       
        //   209: ldc             "hit_url"
        //   211: aastore        
        //   212: aconst_null    
        //   213: aconst_null    
        //   214: aconst_null    
        //   215: aconst_null    
        //   216: aload           4
        //   218: aload           7
        //   220: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   223: astore_3       
        //   224: aload_3        
        //   225: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   230: ifeq            320
        //   233: iconst_0       
        //   234: istore          8
        //   236: aload_3        
        //   237: checkcast       Landroid/database/sqlite/SQLiteCursor;
        //   240: invokevirtual   android/database/sqlite/SQLiteCursor.getWindow:()Landroid/database/CursorWindow;
        //   243: invokevirtual   android/database/CursorWindow.getNumRows:()I
        //   246: ifle            587
        //   249: aload_1        
        //   250: iload           8
        //   252: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   257: checkcast       Lcom/google/android/gms/b/k;
        //   260: aload_3        
        //   261: iconst_1       
        //   262: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   267: putfield        com/google/android/gms/b/k.a:Ljava/lang/String;
        //   270: aload_1        
        //   271: iload           8
        //   273: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   278: checkcast       Lcom/google/android/gms/b/k;
        //   281: astore_2       
        //   282: aload_3        
        //   283: iconst_2       
        //   284: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   289: astore          5
        //   291: aload           5
        //   293: ifnull          307
        //   296: aload           5
        //   298: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   301: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   304: ifeq            401
        //   307: aload_3        
        //   308: invokeinterface android/database/Cursor.moveToNext:()Z
        //   313: istore          6
        //   315: iload           6
        //   317: ifne            692
        //   320: aload_3        
        //   321: ifnull          330
        //   324: aload_3        
        //   325: invokeinterface android/database/Cursor.close:()V
        //   330: goto            24
        //   333: astore_1       
        //   334: aconst_null    
        //   335: astore_3       
        //   336: aload_2        
        //   337: astore          5
        //   339: aload_3        
        //   340: astore_2       
        //   341: new             Ljava/lang/StringBuilder;
        //   344: astore_3       
        //   345: aload_3        
        //   346: ldc             "Error in peekHits fetching hitIds: "
        //   348: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   351: aload_3        
        //   352: aload_1        
        //   353: invokevirtual   android/database/sqlite/SQLiteException.getMessage:()Ljava/lang/String;
        //   356: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   359: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   362: invokestatic    com/google/android/gms/b/n.d:(Ljava/lang/String;)V
        //   365: aload           5
        //   367: astore_1       
        //   368: aload_2        
        //   369: ifnull          24
        //   372: aload_2        
        //   373: invokeinterface android/database/Cursor.close:()V
        //   378: aload           5
        //   380: astore_1       
        //   381: goto            24
        //   384: astore          5
        //   386: aload_1        
        //   387: astore_2       
        //   388: aload_2        
        //   389: ifnull          398
        //   392: aload_2        
        //   393: invokeinterface android/database/Cursor.close:()V
        //   398: aload           5
        //   400: athrow         
        //   401: aload_2        
        //   402: aload           5
        //   404: putfield        com/google/android/gms/b/k.d:Ljava/lang/String;
        //   407: aload           5
        //   409: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   412: ldc_w           "http:"
        //   415: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   418: ifeq            307
        //   421: aload_2        
        //   422: ldc_w           "http:"
        //   425: putfield        com/google/android/gms/b/k.e:Ljava/lang/String;
        //   428: goto            307
        //   431: astore_2       
        //   432: aload_3        
        //   433: astore          5
        //   435: aload_2        
        //   436: astore_3       
        //   437: aload           5
        //   439: astore_2       
        //   440: new             Ljava/lang/StringBuilder;
        //   443: astore          4
        //   445: aload           5
        //   447: astore_2       
        //   448: aload           4
        //   450: ldc_w           "Error in peekHits fetching hitString: "
        //   453: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   456: aload           5
        //   458: astore_2       
        //   459: aload           4
        //   461: aload_3        
        //   462: invokevirtual   android/database/sqlite/SQLiteException.getMessage:()Ljava/lang/String;
        //   465: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   468: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   471: invokestatic    com/google/android/gms/b/n.d:(Ljava/lang/String;)V
        //   474: aload           5
        //   476: astore_2       
        //   477: new             Ljava/util/ArrayList;
        //   480: astore_3       
        //   481: aload           5
        //   483: astore_2       
        //   484: aload_3        
        //   485: invokespecial   java/util/ArrayList.<init>:()V
        //   488: aload           5
        //   490: astore_2       
        //   491: aload_1        
        //   492: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   497: astore_1       
        //   498: iconst_0       
        //   499: istore          9
        //   501: aload           5
        //   503: astore_2       
        //   504: aload_1        
        //   505: invokeinterface java/util/Iterator.hasNext:()Z
        //   510: ifeq            630
        //   513: aload           5
        //   515: astore_2       
        //   516: aload_1        
        //   517: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   522: checkcast       Lcom/google/android/gms/b/k;
        //   525: astore          4
        //   527: iload           9
        //   529: istore          8
        //   531: aload           5
        //   533: astore_2       
        //   534: aload           4
        //   536: getfield        com/google/android/gms/b/k.a:Ljava/lang/String;
        //   539: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   542: ifeq            553
        //   545: iload           9
        //   547: ifne            630
        //   550: iconst_1       
        //   551: istore          8
        //   553: aload           5
        //   555: astore_2       
        //   556: aload_3        
        //   557: aload           4
        //   559: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   564: pop            
        //   565: iload           8
        //   567: istore          9
        //   569: goto            501
        //   572: astore          5
        //   574: aload_2        
        //   575: ifnull          584
        //   578: aload_2        
        //   579: invokeinterface android/database/Cursor.close:()V
        //   584: aload           5
        //   586: athrow         
        //   587: ldc_w           "HitString for hitId %d too large.  Hit will be deleted."
        //   590: iconst_1       
        //   591: anewarray       Ljava/lang/Object;
        //   594: dup            
        //   595: iconst_0       
        //   596: aload_1        
        //   597: iload           8
        //   599: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   604: checkcast       Lcom/google/android/gms/b/k;
        //   607: getfield        com/google/android/gms/b/k.b:J
        //   610: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   613: aastore        
        //   614: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   617: invokestatic    com/google/android/gms/b/n.d:(Ljava/lang/String;)V
        //   620: goto            307
        //   623: astore          5
        //   625: aload_3        
        //   626: astore_2       
        //   627: goto            574
        //   630: aload           5
        //   632: ifnull          642
        //   635: aload           5
        //   637: invokeinterface android/database/Cursor.close:()V
        //   642: aload_3        
        //   643: astore_1       
        //   644: goto            24
        //   647: astore_3       
        //   648: goto            437
        //   651: astore_1       
        //   652: aload           5
        //   654: astore_2       
        //   655: aload_1        
        //   656: astore          5
        //   658: goto            388
        //   661: astore          5
        //   663: goto            388
        //   666: astore_1       
        //   667: aload           5
        //   669: astore_3       
        //   670: aload_2        
        //   671: astore          5
        //   673: aload_3        
        //   674: astore_2       
        //   675: goto            341
        //   678: astore_2       
        //   679: aload           5
        //   681: astore_3       
        //   682: aload_1        
        //   683: astore          5
        //   685: aload_2        
        //   686: astore_1       
        //   687: aload_3        
        //   688: astore_2       
        //   689: goto            341
        //   692: iinc            8, 1
        //   695: goto            236
        //    Signature:
        //  ()Ljava/util/List<Lcom/google/android/gms/b/k;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  26     79     333    341    Landroid/database/sqlite/SQLiteException;
        //  26     79     384    388    Any
        //  79     87     666    678    Landroid/database/sqlite/SQLiteException;
        //  79     87     651    661    Any
        //  87     97     678    692    Landroid/database/sqlite/SQLiteException;
        //  87     97     651    661    Any
        //  97     141    678    692    Landroid/database/sqlite/SQLiteException;
        //  97     141    651    661    Any
        //  161    177    647    651    Landroid/database/sqlite/SQLiteException;
        //  161    177    572    574    Any
        //  180    187    647    651    Landroid/database/sqlite/SQLiteException;
        //  180    187    572    574    Any
        //  190    224    647    651    Landroid/database/sqlite/SQLiteException;
        //  190    224    572    574    Any
        //  224    233    431    437    Landroid/database/sqlite/SQLiteException;
        //  224    233    623    630    Any
        //  236    291    431    437    Landroid/database/sqlite/SQLiteException;
        //  236    291    623    630    Any
        //  296    307    431    437    Landroid/database/sqlite/SQLiteException;
        //  296    307    623    630    Any
        //  307    315    431    437    Landroid/database/sqlite/SQLiteException;
        //  307    315    623    630    Any
        //  341    365    661    666    Any
        //  401    428    431    437    Landroid/database/sqlite/SQLiteException;
        //  401    428    623    630    Any
        //  440    445    572    574    Any
        //  448    456    572    574    Any
        //  459    474    572    574    Any
        //  477    481    572    574    Any
        //  484    488    572    574    Any
        //  491    498    572    574    Any
        //  504    513    572    574    Any
        //  516    527    572    574    Any
        //  534    545    572    574    Any
        //  556    565    572    574    Any
        //  587    620    431    437    Landroid/database/sqlite/SQLiteException;
        //  587    620    623    630    Any
        // 
        // The error that occurred was:
        // 
        // java.util.ConcurrentModificationException
        //     at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1042)
        //     at java.base/java.util.ArrayList$Itr.next(ArrayList.java:996)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2863)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private int f() {
        Cursor cursor = null;
        Cursor rawQuery = null;
        int n = 0;
        final boolean b = false;
        final SQLiteDatabase a = this.a("Error opening database for getNumStoredHits.");
        int n2;
        if (a == null) {
            n2 = (b ? 1 : 0);
        }
        else {
            try {
                final Cursor cursor2 = cursor = (rawQuery = a.rawQuery("SELECT COUNT(*) from hits2", (String[])null));
                if (cursor2.moveToFirst()) {
                    rawQuery = cursor2;
                    cursor = cursor2;
                    n = (int)cursor2.getLong(0);
                }
                n2 = n;
                if (cursor2 != null) {
                    cursor2.close();
                    n2 = n;
                }
            }
            catch (SQLiteException cursor) {
                cursor = rawQuery;
                com.google.android.gms.b.n.d("Error getting numStoredHits");
                n2 = (b ? 1 : 0);
                if (rawQuery != null) {
                    rawQuery.close();
                    n2 = (b ? 1 : 0);
                }
            }
            finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return n2;
    }
    
    @Override
    public final void a() {
        boolean b = true;
        final SQLiteDatabase a = this.a("Error opening database for clearHits");
        if (a != null) {
            if (0L == 0L) {
                a.delete("hits2", (String)null, (String[])null);
            }
            else {
                a.delete("hits2", "hit_app_id = ?", new String[] { Long.valueOf(0L).toString() });
            }
            final aa d = this.d;
            if (this.f() != 0) {
                b = false;
            }
            d.a(b);
        }
    }
    
    @Override
    public final void a(final Map<String, String> map, long long1, final String s, Collection<ha> contentValues) {
        boolean b = true;
        final long a = this.j.a();
        while (true) {
        Label_0303:
            while (true) {
                Label_0104: {
                    if (a <= this.h + 86400000L) {
                        break Label_0104;
                    }
                    this.h = a;
                    final SQLiteDatabase a2 = this.a("Error opening database for deleteStaleHits.");
                    if (a2 == null) {
                        break Label_0104;
                    }
                    a2.delete("hits2", "HIT_TIME < ?", new String[] { Long.toString(this.j.a() - 2592000000L) });
                    final Object o = this.d;
                    Label_0095: {
                        if (this.f() == 0) {
                            break Label_0095;
                        }
                        Label_0296: {
                            break Label_0296;
                            while (true) {
                                String s2 = null;
                                Label_0308: {
                                    try {
                                        long1 = Long.parseLong(map.get("AppUID"));
                                        contentValues.put("hit_app_id", Long.valueOf(long1));
                                        s2 = s;
                                        if (s == null) {
                                            s2 = "http://www.google-analytics.com/collect";
                                        }
                                        if (s2.length() == 0) {
                                            n.d("Empty path: not sending hit");
                                            return;
                                        }
                                        break Label_0308;
                                        b = false;
                                        break;
                                    }
                                    catch (NumberFormatException ex) {}
                                    break Label_0303;
                                }
                                contentValues.put("hit_url", s2);
                                try {
                                    ((SQLiteDatabase)o).insert("hits2", (String)null, contentValues);
                                    this.d.a(false);
                                }
                                catch (SQLiteException ex2) {
                                    n.d("Error storing hit");
                                }
                                return;
                            }
                        }
                    }
                    ((aa)o).a(b);
                }
                final int n = this.f() - this.i + 1;
                if (n > 0) {
                    final List<String> a3 = this.a(n);
                    com.google.android.gms.b.n.c("Store full, deleting " + a3.size() + " hits to make room.");
                    this.a(a3.toArray(new String[0]));
                }
                a(map, (Collection<ha>)contentValues);
                final Object o = this.a("Error opening database for putHit");
                if (o == null) {
                    return;
                }
                contentValues = new ContentValues();
                contentValues.put("hit_string", a(map));
                contentValues.put("hit_time", Long.valueOf(long1));
                if (map.containsKey("AppUID")) {
                    continue;
                }
                break;
            }
            long1 = 0L;
            continue;
        }
    }
    
    @Override
    public final void a(final boolean l) {
        this.l = l;
        if (this.c != null) {
            this.c.a(l);
        }
    }
    
    @Override
    public final void b() {
        boolean b = true;
        n.c("Dispatch running...");
        if (this.c.a()) {
            final List<k> e = this.e();
            if (e.isEmpty()) {
                n.c("...nothing to dispatch");
                this.d.a(true);
            }
            else {
                if (this.g == null) {
                    this.g = new o("_t=dispatch&_v=ma4.0.4");
                }
                if (this.f() > e.size()) {
                    b = false;
                }
                final int a = this.c.a(e, this.g, b);
                n.c("sent " + a + " of " + e.size() + " hits");
                this.a(e.subList(0, Math.min(a, e.size())));
                if (a == e.size() && this.f() > 0) {
                    com.google.android.gms.b.c.a(this.e).c.a();
                }
                else {
                    this.g = null;
                }
            }
        }
    }
    
    @Override
    public final an c() {
        return this.c;
    }
    
    final class a extends SQLiteOpenHelper
    {
        private boolean b;
        private long c;
        
        a(final Context context, final String s) {
            super(context, s, (SQLiteDatabase$CursorFactory)null, 1);
            this.c = 0L;
        }
        
        private static boolean a(final String p0, final SQLiteDatabase p1) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: astore_2       
            //     2: aload_1        
            //     3: ldc             "SQLITE_MASTER"
            //     5: iconst_1       
            //     6: anewarray       Ljava/lang/String;
            //     9: dup            
            //    10: iconst_0       
            //    11: ldc             "name"
            //    13: aastore        
            //    14: ldc             "name=?"
            //    16: iconst_1       
            //    17: anewarray       Ljava/lang/String;
            //    20: dup            
            //    21: iconst_0       
            //    22: aload_0        
            //    23: aastore        
            //    24: aconst_null    
            //    25: aconst_null    
            //    26: aconst_null    
            //    27: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
            //    30: astore_1       
            //    31: aload_1        
            //    32: invokeinterface android/database/Cursor.moveToFirst:()Z
            //    37: istore_3       
            //    38: iload_3        
            //    39: istore          4
            //    41: aload_1        
            //    42: ifnull          54
            //    45: aload_1        
            //    46: invokeinterface android/database/Cursor.close:()V
            //    51: iload_3        
            //    52: istore          4
            //    54: iload           4
            //    56: ireturn        
            //    57: astore_1       
            //    58: aconst_null    
            //    59: astore_1       
            //    60: new             Ljava/lang/StringBuilder;
            //    63: astore_2       
            //    64: aload_2        
            //    65: ldc             "Error querying for table "
            //    67: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
            //    70: aload_2        
            //    71: aload_0        
            //    72: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //    75: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //    78: invokestatic    com/google/android/gms/b/n.d:(Ljava/lang/String;)V
            //    81: aload_1        
            //    82: ifnull          91
            //    85: aload_1        
            //    86: invokeinterface android/database/Cursor.close:()V
            //    91: iconst_0       
            //    92: istore          4
            //    94: goto            54
            //    97: astore_0       
            //    98: aload_2        
            //    99: astore_1       
            //   100: aload_1        
            //   101: ifnull          110
            //   104: aload_1        
            //   105: invokeinterface android/database/Cursor.close:()V
            //   110: aload_0        
            //   111: athrow         
            //   112: astore_0       
            //   113: goto            100
            //   116: astore_0       
            //   117: goto            100
            //   120: astore_2       
            //   121: goto            60
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                     
            //  -----  -----  -----  -----  -----------------------------------------
            //  2      31     57     60     Landroid/database/sqlite/SQLiteException;
            //  2      31     97     100    Any
            //  31     38     120    124    Landroid/database/sqlite/SQLiteException;
            //  31     38     112    116    Any
            //  60     81     116    120    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IndexOutOfBoundsException: Index 70 out of bounds for length 70
            //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
            //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
            //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public final SQLiteDatabase getWritableDatabase() {
            if (this.b && this.c + 3600000L > p.this.j.a()) {
                throw new SQLiteException("Database creation failed");
            }
            SQLiteDatabase writableDatabase = null;
            this.b = true;
            this.c = p.this.j.a();
            while (true) {
                try {
                    writableDatabase = super.getWritableDatabase();
                    SQLiteDatabase writableDatabase2 = writableDatabase;
                    if (writableDatabase == null) {
                        writableDatabase2 = super.getWritableDatabase();
                    }
                    this.b = false;
                    return writableDatabase2;
                }
                catch (SQLiteException ex) {
                    p.this.e.getDatabasePath(p.this.f).delete();
                    continue;
                }
                break;
            }
        }
        
        public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
            final String path = sqLiteDatabase.getPath();
            if (ap.a() >= 9) {
                final File file = new File(path);
                file.setReadable(false, false);
                file.setWritable(false, false);
                file.setReadable(true, true);
                file.setWritable(true, true);
            }
        }
        
        public final void onOpen(final SQLiteDatabase sqLiteDatabase) {
            final int n = 0;
            while (true) {
                if (Build$VERSION.SDK_INT < 15) {
                    while (true) {
                        Cursor cursor = sqLiteDatabase.rawQuery("PRAGMA journal_mode=memory", (String[])null);
                        try {
                            cursor.moveToFirst();
                            cursor.close();
                            if (!a("hits2", sqLiteDatabase)) {
                                sqLiteDatabase.execSQL(p.a);
                                return;
                            }
                        }
                        finally {
                            cursor.close();
                        }
                        final SQLiteDatabase sqLiteDatabase2;
                        cursor = sqLiteDatabase2.rawQuery("SELECT * FROM hits2 WHERE 0", (String[])null);
                        final HashSet<String> set = new HashSet<String>();
                        try {
                            final String[] columnNames = cursor.getColumnNames();
                            for (int i = 0; i < columnNames.length; ++i) {
                                set.add(columnNames[i]);
                            }
                            cursor.close();
                            if (!set.remove("hit_id") || !set.remove("hit_url") || !set.remove("hit_string") || !set.remove("hit_time")) {
                                throw new SQLiteException("Database column missing");
                            }
                        }
                        finally {
                            cursor.close();
                        }
                        int n2 = n;
                        if (!set.remove("hit_app_id")) {
                            n2 = 1;
                        }
                        if (!set.isEmpty()) {
                            break;
                        }
                        if (n2 != 0) {
                            final SQLiteDatabase sqLiteDatabase3;
                            sqLiteDatabase3.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id");
                        }
                        return;
                    }
                    throw new SQLiteException("Database has extra columns");
                }
                continue;
            }
        }
        
        public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        }
    }
}
