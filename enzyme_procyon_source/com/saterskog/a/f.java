// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.a;

import android.text.TextUtils;
import java.security.spec.InvalidKeySpecException;
import android.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;

public final class f
{
    private static PublicKey a(final String s) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(s, 0)));
        }
        catch (NoSuchAlgorithmException cause) {
            throw new RuntimeException(cause);
        }
        catch (InvalidKeySpecException cause2) {
            Log.e("IABUtil/Security", "Invalid key specification.");
            throw new IllegalArgumentException(cause2);
        }
    }
    
    public static boolean a(final String s, final String s2, final String s3) {
        boolean a;
        if (TextUtils.isEmpty((CharSequence)s2) || TextUtils.isEmpty((CharSequence)s) || TextUtils.isEmpty((CharSequence)s3)) {
            Log.e("IABUtil/Security", "Purchase verification failed: missing data.");
            a = false;
        }
        else {
            a = a(a(s), s2, s3);
        }
        return a;
    }
    
    private static boolean a(final PublicKey p0, final String p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_3       
        //     2: aload_2        
        //     3: iconst_0       
        //     4: invokestatic    android/util/Base64.decode:(Ljava/lang/String;I)[B
        //     7: astore_2       
        //     8: ldc             "SHA1withRSA"
        //    10: invokestatic    java/security/Signature.getInstance:(Ljava/lang/String;)Ljava/security/Signature;
        //    13: astore          4
        //    15: aload           4
        //    17: aload_0        
        //    18: invokevirtual   java/security/Signature.initVerify:(Ljava/security/PublicKey;)V
        //    21: aload           4
        //    23: aload_1        
        //    24: invokevirtual   java/lang/String.getBytes:()[B
        //    27: invokevirtual   java/security/Signature.update:([B)V
        //    30: aload           4
        //    32: aload_2        
        //    33: invokevirtual   java/security/Signature.verify:([B)Z
        //    36: ifne            61
        //    39: ldc             "IABUtil/Security"
        //    41: ldc             "Signature verification failed."
        //    43: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    46: pop            
        //    47: iload_3        
        //    48: ireturn        
        //    49: astore_0       
        //    50: ldc             "IABUtil/Security"
        //    52: ldc             "Base64 decoding failed."
        //    54: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    57: pop            
        //    58: goto            47
        //    61: iconst_1       
        //    62: istore_3       
        //    63: goto            47
        //    66: astore_0       
        //    67: ldc             "IABUtil/Security"
        //    69: ldc             "NoSuchAlgorithmException."
        //    71: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    74: pop            
        //    75: goto            47
        //    78: astore_0       
        //    79: ldc             "IABUtil/Security"
        //    81: ldc             "Invalid key specification."
        //    83: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    86: pop            
        //    87: goto            47
        //    90: astore_0       
        //    91: ldc             "IABUtil/Security"
        //    93: ldc             "Signature exception."
        //    95: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    98: pop            
        //    99: goto            47
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                    
        //  -----  -----  -----  -----  ----------------------------------------
        //  2      8      49     61     Ljava/lang/IllegalArgumentException;
        //  8      47     66     78     Ljava/security/NoSuchAlgorithmException;
        //  8      47     78     90     Ljava/security/InvalidKeyException;
        //  8      47     90     102    Ljava/security/SignatureException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0047:
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
}
