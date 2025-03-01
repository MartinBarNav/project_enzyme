// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.content;

import java.util.Iterator;
import android.net.Uri$Builder;
import java.util.Map;
import android.database.MatrixCursor;
import android.database.Cursor;
import android.os.ParcelFileDescriptor;
import android.content.ContentValues;
import android.webkit.MimeTypeMap;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import java.io.Serializable;
import android.text.TextUtils;
import android.os.Environment;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.net.Uri;
import android.content.Context;
import java.util.HashMap;
import java.io.File;
import android.content.ContentProvider;

public class FileProvider extends ContentProvider
{
    private static final String[] a;
    private static final File b;
    private static HashMap<String, a> c;
    private a d;
    
    static {
        a = new String[] { "_display_name", "_size" };
        b = new File("/");
        FileProvider.c = new HashMap<String, a>();
    }
    
    public static Uri a(final Context context, final String s, final File file) {
        return a(context, s).a(file);
    }
    
    private static a a(final Context context, final String ex) {
        final HashMap<String, a> c = FileProvider.c;
        // monitorenter(c)
        Serializable obj = null;
        Label_0365: {
            Object value = null;
            Label_0110: {
                XmlResourceParser loadXmlMetaData;
                try {
                    value = (obj = (Serializable)FileProvider.c.get(ex));
                    if (value != null) {
                        break Label_0365;
                    }
                    try {
                        value = new b((String)ex);
                        loadXmlMetaData = context.getPackageManager().resolveContentProvider((String)ex, 128).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                        if (loadXmlMetaData == null) {
                            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                        }
                        break Label_0110;
                    }
                    catch (IOException ex) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", ex);
                    }
                    catch (XmlPullParserException ex) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", ex);
                    }
                }
                finally {}
            Label_0191_Outer:
                while (true) {
                    while (true) {
                        Label_0370: {
                            try {
                                while (true) {
                                    String attributeValue = null;
                                    ((b)value).a.put(attributeValue, ((File)obj).getCanonicalFile());
                                    while (true) {
                                        final int next = loadXmlMetaData.next();
                                        if (next == 1) {
                                            break Label_0110;
                                        }
                                        if (next != 2) {
                                            continue Label_0191_Outer;
                                        }
                                        final String name = loadXmlMetaData.getName();
                                        attributeValue = loadXmlMetaData.getAttributeValue((String)null, "name");
                                        obj = loadXmlMetaData.getAttributeValue((String)null, "path");
                                        if ("root-path".equals(name)) {
                                            obj = a(FileProvider.b, (String)obj);
                                        }
                                        else if ("files-path".equals(name)) {
                                            final Context context2;
                                            obj = a(context2.getFilesDir(), (String)obj);
                                        }
                                        else if ("cache-path".equals(name)) {
                                            final Context context2;
                                            obj = a(context2.getCacheDir(), (String)obj);
                                        }
                                        else {
                                            if (!"external-path".equals(name)) {
                                                break Label_0370;
                                            }
                                            obj = a(Environment.getExternalStorageDirectory(), (String)obj);
                                        }
                                        if (obj != null) {
                                            break;
                                        }
                                    }
                                    if (TextUtils.isEmpty((CharSequence)attributeValue)) {
                                        break;
                                    }
                                }
                                throw new IllegalArgumentException("Name must not be empty");
                            }
                            catch (IOException cause) {
                                throw new IllegalArgumentException("Failed to resolve canonical path for " + obj, cause);
                            }
                            break;
                        }
                        obj = null;
                        continue;
                    }
                }
            }
            FileProvider.c.put((String)ex, (a)value);
            obj = (Serializable)value;
        }
        // monitorexit(c)
        return (a)obj;
    }
    
    private static File a(File parent, final String... array) {
        for (int i = 0; i <= 0; ++i) {
            final String child = array[0];
            if (child != null) {
                parent = new File(parent, child);
            }
        }
        return parent;
    }
    
    public void attachInfo(final Context context, final ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        this.d = a(context, providerInfo.authority);
    }
    
    public int delete(final Uri uri, final String s, final String[] array) {
        int n;
        if (this.d.a(uri).delete()) {
            n = 1;
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public String getType(final Uri uri) {
        final File a = this.d.a(uri);
        final int lastIndex = a.getName().lastIndexOf(46);
        if (lastIndex < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a.getName().substring(lastIndex + 1));
        if (mimeTypeFromExtension == null) {
            return "application/octet-stream";
        }
        return mimeTypeFromExtension;
        mimeTypeFromExtension = "application/octet-stream";
        return mimeTypeFromExtension;
    }
    
    public Uri insert(final Uri uri, final ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }
    
    public boolean onCreate() {
        return true;
    }
    
    public ParcelFileDescriptor openFile(final Uri uri, final String str) {
        final File a = this.d.a(uri);
        int n;
        if ("r".equals(str)) {
            n = 268435456;
        }
        else if ("w".equals(str) || "wt".equals(str)) {
            n = 738197504;
        }
        else if ("wa".equals(str)) {
            n = 704643072;
        }
        else if ("rw".equals(str)) {
            n = 939524096;
        }
        else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException("Invalid mode: " + str);
            }
            n = 1006632960;
        }
        return ParcelFileDescriptor.open(a, n);
    }
    
    public Cursor query(final Uri uri, final String[] array, final String s, String[] array2, String s2) {
        final File a = this.d.a(uri);
        String[] a2 = array;
        if (array == null) {
            a2 = FileProvider.a;
        }
        array2 = new String[a2.length];
        final Object[] array3 = new Object[a2.length];
        final int length = a2.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            s2 = a2[i];
            if ("_display_name".equals(s2)) {
                array2[n] = "_display_name";
                final int n2 = n + 1;
                array3[n] = a.getName();
                n = n2;
            }
            else if ("_size".equals(s2)) {
                array2[n] = "_size";
                final int n3 = n + 1;
                array3[n] = a.length();
                n = n3;
            }
            ++i;
        }
        final String[] array4 = new String[n];
        System.arraycopy(array2, 0, array4, 0, n);
        final Object[] array5 = new Object[n];
        System.arraycopy(array3, 0, array5, 0, n);
        final MatrixCursor matrixCursor = new MatrixCursor(array4, 1);
        matrixCursor.addRow(array5);
        return (Cursor)matrixCursor;
    }
    
    public int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        throw new UnsupportedOperationException("No external updates");
    }
    
    interface a
    {
        Uri a(final File p0);
        
        File a(final Uri p0);
    }
    
    static final class b implements a
    {
        final HashMap<String, File> a;
        private final String b;
        
        public b(final String b) {
            this.a = new HashMap<String, File>();
            this.b = b;
        }
        
        @Override
        public final Uri a(File obj) {
            String canonicalPath;
            while (true) {
                while (true) {
                    Label_0278: {
                        try {
                            canonicalPath = ((File)obj).getCanonicalPath();
                            obj = null;
                            for (final Map.Entry<String, File> entry : this.a.entrySet()) {
                                final String path = entry.getValue().getPath();
                                if (!canonicalPath.startsWith(path)) {
                                    break Label_0278;
                                }
                                Object o = entry;
                                if (obj != null) {
                                    if (path.length() <= ((Map.Entry<K, File>)obj).getValue().getPath().length()) {
                                        break Label_0278;
                                    }
                                    o = entry;
                                }
                                obj = o;
                            }
                        }
                        catch (IOException ex) {
                            throw new IllegalArgumentException("Failed to resolve canonical path for " + obj);
                        }
                        break;
                    }
                    Object o = obj;
                    continue;
                }
            }
            if (obj == null) {
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            }
            final String path2 = ((Map.Entry<K, File>)obj).getValue().getPath();
            String s;
            if (path2.endsWith("/")) {
                s = canonicalPath.substring(path2.length());
            }
            else {
                s = canonicalPath.substring(path2.length() + 1);
            }
            return new Uri$Builder().scheme("content").authority(this.b).encodedPath(Uri.encode((String)((Map.Entry<String, V>)obj).getKey()) + '/' + Uri.encode(s, "/")).build();
        }
        
        @Override
        public final File a(Uri uri) {
            final String encodedPath = uri.getEncodedPath();
            final int index = encodedPath.indexOf(47, 1);
            final String decode = Uri.decode(encodedPath.substring(1, index));
            final String decode2 = Uri.decode(encodedPath.substring(index + 1));
            final File parent = this.a.get(decode);
            if (parent == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            uri = (Uri)new File(parent, decode2);
            File canonicalFile;
            try {
                canonicalFile = ((File)uri).getCanonicalFile();
                if (!canonicalFile.getPath().startsWith(parent.getPath())) {
                    throw new SecurityException("Resolved path jumped beyond configured root");
                }
            }
            catch (IOException ex) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + uri);
            }
            return canonicalFile;
        }
    }
}
