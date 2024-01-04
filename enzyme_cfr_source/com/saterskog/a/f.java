/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Base64
 *  android.util.Log
 */
package com.saterskog.a;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

public final class f {
    private static PublicKey a(String object) {
        try {
            object = Base64.decode((String)object, (int)0);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec((byte[])object);
            object = keyFactory.generatePublic(x509EncodedKeySpec);
            return object;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException(noSuchAlgorithmException);
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            Log.e((String)"IABUtil/Security", (String)"Invalid key specification.");
            throw new IllegalArgumentException(invalidKeySpecException);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(String string, String string2, String string3) {
        if (!TextUtils.isEmpty((CharSequence)string2) && !TextUtils.isEmpty((CharSequence)string)) {
            if (!TextUtils.isEmpty((CharSequence)string3)) return f.a(f.a(string), string2, string3);
        }
        Log.e((String)"IABUtil/Security", (String)"Purchase verification failed: missing data.");
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(PublicKey publicKey, String string, String object) {
        boolean bl = false;
        try {
            object = Base64.decode((String)object, (int)0);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            Log.e((String)"IABUtil/Security", (String)"Base64 decoding failed.");
            return bl;
        }
        try {
            Signature signature = Signature.getInstance("SHA1withRSA");
            signature.initVerify(publicKey);
            signature.update(string.getBytes());
            if (signature.verify((byte[])object)) return true;
            Log.e((String)"IABUtil/Security", (String)"Signature verification failed.");
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            Log.e((String)"IABUtil/Security", (String)"NoSuchAlgorithmException.");
            return bl;
        }
        catch (InvalidKeyException invalidKeyException) {
            Log.e((String)"IABUtil/Security", (String)"Invalid key specification.");
            return bl;
        }
        catch (SignatureException signatureException) {
            Log.e((String)"IABUtil/Security", (String)"Signature exception.");
            return bl;
        }
        return bl;
    }
}

