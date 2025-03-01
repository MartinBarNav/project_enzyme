// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.e;

public final class h<E> implements Cloneable
{
    private static final Object a;
    private boolean b;
    private int[] c;
    private Object[] d;
    private int e;
    
    static {
        a = new Object();
    }
    
    public h() {
        this((byte)0);
    }
    
    private h(final byte b) {
        this.b = false;
        this.c = new int[13];
        this.d = new Object[13];
        this.e = 0;
    }
    
    private h<E> c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.clone:()Ljava/lang/Object;
        //     4: checkcast       Landroid/support/v4/e/h;
        //     7: astore_1       
        //     8: aload_1        
        //     9: aload_0        
        //    10: getfield        android/support/v4/e/h.c:[I
        //    13: invokevirtual   [I.clone:()Ljava/lang/Object;
        //    16: checkcast       [I
        //    19: putfield        android/support/v4/e/h.c:[I
        //    22: aload_1        
        //    23: aload_0        
        //    24: getfield        android/support/v4/e/h.d:[Ljava/lang/Object;
        //    27: invokevirtual   [java/lang/Object.clone:()Ljava/lang/Object;
        //    30: checkcast       [Ljava/lang/Object;
        //    33: putfield        android/support/v4/e/h.d:[Ljava/lang/Object;
        //    36: aload_1        
        //    37: areturn        
        //    38: astore_1       
        //    39: aconst_null    
        //    40: astore_1       
        //    41: goto            36
        //    44: astore_2       
        //    45: goto            36
        //    Signature:
        //  ()Landroid/support/v4/e/h<TE;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  0      8      38     44     Ljava/lang/CloneNotSupportedException;
        //  8      36     44     48     Ljava/lang/CloneNotSupportedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0036:
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
    
    private void d() {
        final int e = this.e;
        final int[] c = this.c;
        final Object[] d = this.d;
        int i = 0;
        int e2 = 0;
        while (i < e) {
            final Object o = d[i];
            int n = e2;
            if (o != h.a) {
                if (i != e2) {
                    c[e2] = c[i];
                    d[e2] = o;
                    d[i] = null;
                }
                n = e2 + 1;
            }
            ++i;
            e2 = n;
        }
        this.b = false;
        this.e = e2;
    }
    
    public final int a() {
        if (this.b) {
            this.d();
        }
        return this.e;
    }
    
    public final int a(final int n) {
        if (this.b) {
            this.d();
        }
        return this.c[n];
    }
    
    public final E b(final int n) {
        if (this.b) {
            this.d();
        }
        return (E)this.d[n];
    }
    
    public final void b() {
        final int e = this.e;
        final Object[] d = this.d;
        for (int i = 0; i < e; ++i) {
            d[i] = null;
        }
        this.e = 0;
        this.b = false;
    }
    
    @Override
    public final String toString() {
        String string;
        if (this.a() <= 0) {
            string = "{}";
        }
        else {
            final StringBuilder sb = new StringBuilder(this.e * 28);
            sb.append('{');
            for (int i = 0; i < this.e; ++i) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(this.a(i));
                sb.append('=');
                final E b = this.b(i);
                if (b != this) {
                    sb.append(b);
                }
                else {
                    sb.append("(this Map)");
                }
            }
            sb.append('}');
            string = sb.toString();
        }
        return string;
    }
}
