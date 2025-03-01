// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import android.content.res.Resources$NotFoundException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.text.TextUtils;
import android.content.res.XmlResourceParser;
import android.content.Context;

abstract class aj<T extends ai>
{
    Context a;
    a<T> b;
    
    public aj(final Context a, final a<T> b) {
        this.a = a;
        this.b = b;
    }
    
    private T a(final XmlResourceParser xmlResourceParser) {
        while (true) {
            while (true) {
                String lowerCase = null;
                try {
                    xmlResourceParser.next();
                    for (int i = xmlResourceParser.getEventType(); i != 1; i = xmlResourceParser.next()) {
                        if (xmlResourceParser.getEventType() == 2) {
                            lowerCase = xmlResourceParser.getName().toLowerCase();
                            if (lowerCase.equals("screenname")) {
                                final String attributeValue = xmlResourceParser.getAttributeValue((String)null, "name");
                                final String trim = xmlResourceParser.nextText().trim();
                                if (!TextUtils.isEmpty((CharSequence)attributeValue) && !TextUtils.isEmpty((CharSequence)trim)) {
                                    this.b.a(attributeValue, trim);
                                }
                            }
                            else {
                                if (!lowerCase.equals("string")) {
                                    goto Label_0193;
                                }
                                final String attributeValue2 = xmlResourceParser.getAttributeValue((String)null, "name");
                                final String trim2 = xmlResourceParser.nextText().trim();
                                if (!TextUtils.isEmpty((CharSequence)attributeValue2) && trim2 != null) {
                                    this.b.b(attributeValue2, trim2);
                                }
                            }
                        }
                    }
                    goto Label_0183;
                }
                catch (XmlPullParserException obj) {
                    n.a("Error parsing tracker configuration file: " + obj);
                }
                catch (IOException obj2) {
                    n.a("Error parsing tracker configuration file: " + obj2);
                    goto Label_0183;
                }
                try {
                    final String s;
                    final String s2;
                    this.b.a(s, Boolean.parseBoolean(s2));
                    continue;
                }
                catch (NumberFormatException ex) {}
                if (!lowerCase.equals("integer")) {
                    continue;
                }
                final String attributeValue3 = xmlResourceParser.getAttributeValue((String)null, "name");
                final String trim3 = xmlResourceParser.nextText().trim();
                if (!TextUtils.isEmpty((CharSequence)attributeValue3) && !TextUtils.isEmpty((CharSequence)trim3)) {
                    try {
                        this.b.a(attributeValue3, Integer.parseInt(trim3));
                        continue;
                    }
                    catch (NumberFormatException ex2) {
                        n.a("Error parsing int configuration value: " + trim3);
                        continue;
                    }
                    continue;
                }
                continue;
            }
        }
    }
    
    public final T a(final int n) {
        try {
            final ai a = this.a(this.a.getResources().getXml(n));
            return (T)a;
        }
        catch (Resources$NotFoundException obj) {
            n.d("inflate() called with unknown resourceId: " + obj);
            final ai a = null;
            return (T)a;
        }
    }
    
    public interface a<U extends ai>
    {
        U a();
        
        void a(final String p0, final int p1);
        
        void a(final String p0, final String p1);
        
        void a(final String p0, final boolean p1);
        
        void b(final String p0, final String p1);
    }
}
