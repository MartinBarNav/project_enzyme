/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.pm.ProviderInfo
 *  android.database.Cursor
 *  android.database.MatrixCursor
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.ParcelFileDescriptor
 *  android.webkit.MimeTypeMap
 */
package android.support.v4.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileProvider
extends ContentProvider {
    private static final String[] a = new String[]{"_display_name", "_size"};
    private static final File b = new File("/");
    private static HashMap<String, a> c = new HashMap();
    private a d;

    public static Uri a(Context context, String string, File file) {
        return FileProvider.a(context, string).a(file);
    }

    /*
     * Exception decompiling
     */
    private static a a(Context var0, String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 5[TRYBLOCK]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
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

    private static File a(File file, String ... arrstring) {
        for (int i2 = 0; i2 <= 0; ++i2) {
            String string = arrstring[0];
            if (string == null) continue;
            file = new File(file, string);
        }
        return file;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        this.d = FileProvider.a(context, providerInfo.authority);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int delete(Uri uri, String string, String[] arrstring) {
        if (!this.d.a(uri).delete()) return 0;
        return 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String getType(Uri object) {
        int n2 = ((File)(object = this.d.a((Uri)object))).getName().lastIndexOf(46);
        if (n2 < 0) return "application/octet-stream";
        object = ((File)object).getName().substring(n2 + 1);
        object = MimeTypeMap.getSingleton().getMimeTypeFromExtension((String)object);
        if (object == null) return "application/octet-stream";
        return object;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ParcelFileDescriptor openFile(Uri object, String string) {
        int n2;
        void var2_3;
        File file = this.d.a((Uri)object);
        if ("r".equals(var2_3)) {
            n2 = 0x10000000;
            return ParcelFileDescriptor.open((File)file, (int)n2);
        }
        if ("w".equals(var2_3) || "wt".equals(var2_3)) {
            n2 = 0x2C000000;
            return ParcelFileDescriptor.open((File)file, (int)n2);
        }
        if ("wa".equals(var2_3)) {
            n2 = 0x2A000000;
            return ParcelFileDescriptor.open((File)file, (int)n2);
        }
        if ("rw".equals(var2_3)) {
            n2 = 0x38000000;
            return ParcelFileDescriptor.open((File)file, (int)n2);
        }
        if (!"rwt".equals(var2_3)) throw new IllegalArgumentException("Invalid mode: " + (String)var2_3);
        n2 = 0x3C000000;
        return ParcelFileDescriptor.open((File)file, (int)n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Cursor query(Uri arrobject, String[] matrixCursor, String object, String[] arrstring, String string) {
        object = this.d.a((Uri)arrobject);
        arrobject = matrixCursor;
        if (matrixCursor == null) {
            arrobject = a;
        }
        arrstring = new String[arrobject.length];
        matrixCursor = new Object[arrobject.length];
        int n2 = arrobject.length;
        int n3 = 0;
        int n4 = 0;
        while (true) {
            int n5;
            if (n3 >= n2) {
                object = new String[n4];
                System.arraycopy(arrstring, 0, object, 0, n4);
                arrobject = new Object[n4];
                System.arraycopy((Object)matrixCursor, 0, arrobject, 0, n4);
                matrixCursor = new MatrixCursor((String[])object, 1);
                matrixCursor.addRow(arrobject);
                return matrixCursor;
            }
            string = arrobject[n3];
            if ("_display_name".equals(string)) {
                arrstring[n4] = "_display_name";
                n5 = n4 + 1;
                matrixCursor[n4] = ((File)object).getName();
                n4 = n5;
            } else if ("_size".equals(string)) {
                arrstring[n4] = "_size";
                n5 = n4 + 1;
                matrixCursor[n4] = Long.valueOf(((File)object).length());
                n4 = n5;
            }
            ++n3;
        }
    }

    public int update(Uri uri, ContentValues contentValues, String string, String[] arrstring) {
        throw new UnsupportedOperationException("No external updates");
    }

    static interface a {
        public Uri a(File var1);

        public File a(Uri var1);
    }

    static final class b
    implements a {
        final HashMap<String, File> a = new HashMap();
        private final String b;

        public b(String string) {
            this.b = string;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive exception aggregation
         */
        @Override
        public final Uri a(File var1_1) {
            block9: {
                try {
                    var2_2 = var1_1.getCanonicalPath();
                    var1_1 = null;
                }
                catch (IOException var6_7) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + var1_1);
                }
                block2: for (Map.Entry<String, File> var4_4 : this.a.entrySet()) {
                    var5_5 = var4_4.getValue().getPath();
                    if (!var2_2.startsWith(var5_5)) break block9;
                    var6_6 = var4_4;
                    if (var1_1 != null) {
                        if (var5_5.length() <= ((File)var1_1.getValue()).getPath().length()) break block9;
                        var6_6 = var4_4;
                    }
lbl11:
                    // 4 sources

                    while (true) {
                        var1_1 = var6_6;
                        continue block2;
                        break;
                    }
                }
                if (var1_1 == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + var2_2);
                }
                var6_6 = ((File)var1_1.getValue()).getPath();
                if (var6_6.endsWith("/")) {
                    var6_6 = var2_2.substring(var6_6.length());
lbl23:
                    // 2 sources

                    while (true) {
                        var1_1 = Uri.encode((String)((String)var1_1.getKey())) + '/' + Uri.encode(var6_6, (String)"/");
                        return new Uri.Builder().scheme("content").authority(this.b).encodedPath((String)var1_1).build();
                    }
                }
                var6_6 = var2_2.substring(var6_6.length() + 1);
                ** while (true)
            }
            var6_6 = var1_1;
            ** while (true)
        }

        @Override
        public final File a(Uri object) {
            Object object2 = object.getEncodedPath();
            int n2 = ((String)object2).indexOf(47, 1);
            Object object3 = Uri.decode((String)((String)object2).substring(1, n2));
            object2 = Uri.decode((String)((String)object2).substring(n2 + 1));
            if ((object3 = this.a.get(object3)) == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + object);
            }
            object = new File((File)object3, (String)object2);
            try {
                object2 = ((File)object).getCanonicalFile();
                if (!((File)object2).getPath().startsWith(((File)object3).getPath())) {
                    throw new SecurityException("Resolved path jumped beyond configured root");
                }
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + object);
            }
            return object2;
        }
    }
}

