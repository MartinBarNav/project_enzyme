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
    public static boolean a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            return a(a(str), str2, str3);
        }
        Log.e("IABUtil/Security", "Purchase verification failed: missing data.");
        return false;
    }

    private static PublicKey a(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e2) {
            Log.e("IABUtil/Security", "Invalid key specification.");
            throw new IllegalArgumentException(e2);
        }
    }

    private static boolean a(PublicKey publicKey, String str, String str2) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            try {
                Signature instance = Signature.getInstance("SHA1withRSA");
                instance.initVerify(publicKey);
                instance.update(str.getBytes());
                if (instance.verify(decode)) {
                    return true;
                }
                Log.e("IABUtil/Security", "Signature verification failed.");
                return false;
            } catch (NoSuchAlgorithmException e) {
                Log.e("IABUtil/Security", "NoSuchAlgorithmException.");
                return false;
            } catch (InvalidKeyException e2) {
                Log.e("IABUtil/Security", "Invalid key specification.");
                return false;
            } catch (SignatureException e3) {
                Log.e("IABUtil/Security", "Signature exception.");
                return false;
            }
        } catch (IllegalArgumentException e4) {
            Log.e("IABUtil/Security", "Base64 decoding failed.");
            return false;
        }
    }
}
