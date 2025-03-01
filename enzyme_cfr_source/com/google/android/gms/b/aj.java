/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.XmlResourceParser
 *  android.text.TextUtils
 *  org.xmlpull.v1.XmlPullParserException
 */
package com.google.android.gms.b;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import com.google.android.gms.b.ai;
import com.google.android.gms.b.n;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

abstract class aj<T extends ai> {
    Context a;
    a<T> b;

    public aj(Context context, a<T> a2) {
        this.a = context;
        this.b = a2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private T a(XmlResourceParser xmlResourceParser) {
        block16: {
            try {
                xmlResourceParser.next();
                n2 = xmlResourceParser.getEventType();
lbl5:
                // 2 sources

                while (true) {
                    if (n2 == 1) return this.b.a();
                    if (xmlResourceParser.getEventType() != 2) break block16;
                    string = xmlResourceParser.getName().toLowerCase();
                    if (string.equals("screenname")) {
                        string = xmlResourceParser.getAttributeValue(null, "name");
                        charSequence = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty((CharSequence)string) && !TextUtils.isEmpty((CharSequence)charSequence)) {
                            this.b.a(string, (String)charSequence);
                        }
                        break block16;
                    }
                    if (string.equals("string")) {
                        charSequence = xmlResourceParser.getAttributeValue(null, "name");
                        string = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty((CharSequence)charSequence) && string != null) {
                            this.b.b((String)charSequence, string);
                        }
                        break block16;
                    }
                    if (string.equals("bool")) {
                        charSequence = xmlResourceParser.getAttributeValue(null, "name");
                        string = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty((CharSequence)charSequence) && !(bl = TextUtils.isEmpty((CharSequence)string))) {
                            try {
                                bl = Boolean.parseBoolean(string);
                                this.b.a((String)charSequence, bl);
                            }
                            catch (NumberFormatException numberFormatException) {
                                charSequence = new StringBuilder("Error parsing bool configuration value: ");
                                n.a(charSequence.append(string).toString());
                            }
                        }
                        break block16;
                    }
                    if (!string.equals("integer")) break block16;
                    charSequence = xmlResourceParser.getAttributeValue(null, "name");
                    string = xmlResourceParser.nextText().trim();
                    if (TextUtils.isEmpty((CharSequence)charSequence) || (bl = TextUtils.isEmpty((CharSequence)string))) break block16;
                    ** try [egrp 4[TRYBLOCK] [19 : 365->385)] { 
lbl38:
                    // 1 sources

                    break;
                }
            }
            catch (XmlPullParserException xmlPullParserException) {
                n.a("Error parsing tracker configuration file: " + (Object)xmlPullParserException);
            }
            return this.b.a();
            catch (IOException iOException) {
                n.a("Error parsing tracker configuration file: " + iOException);
                return this.b.a();
            }
            {
                n2 = Integer.parseInt(string);
                this.b.a((String)charSequence, n2);
            }
lbl48:
            // 1 sources

            catch (NumberFormatException numberFormatException) {
                charSequence = new StringBuilder("Error parsing int configuration value: ");
                n.a(charSequence.append(string).toString());
            }
        }
        n2 = xmlResourceParser.next();
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final T a(int n2) {
        T t2;
        try {
            t2 = this.a(this.a.getResources().getXml(n2));
        }
        catch (Resources.NotFoundException notFoundException) {
            n.d("inflate() called with unknown resourceId: " + (Object)((Object)notFoundException));
            t2 = null;
            return t2;
        }
        return t2;
    }

    public static interface a<U extends ai> {
        public U a();

        public void a(String var1, int var2);

        public void a(String var1, String var2);

        public void a(String var1, boolean var2);

        public void b(String var1, String var2);
    }
}

