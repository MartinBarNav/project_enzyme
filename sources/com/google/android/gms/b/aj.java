package com.google.android.gms.b;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import com.google.android.gms.b.ai;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

abstract class aj<T extends ai> {
    Context a;
    a<T> b;

    public interface a<U extends ai> {
        U a();

        void a(String str, int i);

        void a(String str, String str2);

        void a(String str, boolean z);

        void b(String str, String str2);
    }

    public aj(Context context, a<T> aVar) {
        this.a = context;
        this.b = aVar;
    }

    private T a(XmlResourceParser xmlResourceParser) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase();
                    if (lowerCase.equals("screenname")) {
                        String attributeValue = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue) && !TextUtils.isEmpty(trim)) {
                            this.b.a(attributeValue, trim);
                        }
                    } else if (lowerCase.equals("string")) {
                        String attributeValue2 = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue2) && trim2 != null) {
                            this.b.b(attributeValue2, trim2);
                        }
                    } else if (lowerCase.equals("bool")) {
                        String attributeValue3 = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(trim3)) {
                            try {
                                this.b.a(attributeValue3, Boolean.parseBoolean(trim3));
                            } catch (NumberFormatException e) {
                                n.a("Error parsing bool configuration value: " + trim3);
                            }
                        }
                    } else if (lowerCase.equals("integer")) {
                        String attributeValue4 = xmlResourceParser.getAttributeValue((String) null, "name");
                        String trim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(trim4)) {
                            try {
                                this.b.a(attributeValue4, Integer.parseInt(trim4));
                            } catch (NumberFormatException e2) {
                                n.a("Error parsing int configuration value: " + trim4);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (XmlPullParserException e3) {
            n.a("Error parsing tracker configuration file: " + e3);
        } catch (IOException e4) {
            n.a("Error parsing tracker configuration file: " + e4);
        }
        return this.b.a();
    }

    public final T a(int i) {
        try {
            return a(this.a.getResources().getXml(i));
        } catch (Resources.NotFoundException e) {
            n.d("inflate() called with unknown resourceId: " + e);
            return null;
        }
    }
}
