// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import android.content.Context;

public enum h
{
    public static h[] B;
    
    a("PHAGOCYTE", 0, true, 0.1, 2131558411, 2131558410), 
    b("FLAGELLOCYTE", 1, false, 0.1, 2131558411, 2131558410, 2131558455, 2131558454, 0.12, true), 
    c("PHOTOCYTE", 2, true, 0.25, 2131558443, 2131558442), 
    d("DEVOROCYTE", 3, true, 0.1, 2131558411, 2131558410, 2131558428, 2131558427, 0.009, false), 
    e("LIPOCYTE", 4, false, 0.005, 2131558432, 2131558431), 
    f("KERATINOCYTE", 5, false, 0.01, 2131558426, 2131558425), 
    g("BUOYOCYTE", 6, false, 0.02, 2131558407, 2131558406), 
    h("GLUEOCYTE", 7, true, 0.01, 2131558411, 2131558410, 2131558422, 2131558421, 0.012, false), 
    i("VIROCYTE", 8, false, 0.2, 2131558411, 2131558410, 2131558462, 2131558461, 0.009, false), 
    j("NITROCYTE", 9, false, 0.02, 2131558411, 2131558410, 2131558437, 2131558436, 0.0135, false), 
    k("STEREOCYTE", 10, false, 0.01, 2131558441, 2131558440, 2131558452, 2131558451, 0.012, false), 
    l("SENSEOCYTE", 11, false, 0.01, 2131558441, 2131558440, 2131558452, 2131558447, 0.006, false), 
    m("MYOCYTE", 12, false, 0.02, 2131558439, 2131558438), 
    n("NEUROCYTE", 13, false, 0.02, 2131558441, 2131558440), 
    o("SECROCYTE", 14, false, 0.03, 2131558460, 2131558459), 
    p("STEMOCYTE", 15, false, 0.02, 2131558450, 2131558449), 
    q("GAMETE", 16, false, 0.005, 2131558420, 2131558419), 
    r("CILIOCYTE", 17, false, 0.005, 2131558411, 2131558410, 2131558457, 2131558456, 0.0045, false);
    
    final double A;
    final boolean s;
    final boolean t;
    final double u;
    final double v;
    final int w;
    final int x;
    final int y;
    final int z;
    
    static {
        h.B = values();
    }
    
    private h(final boolean p4, final double p5, final double p6) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: iload_2        
        //     3: iload_3        
        //     4: dload           4
        //     6: iload           6
        //     8: iload           7
        //    10: iconst_m1      
        //    11: iconst_m1      
        //    12: dconst_1       
        //    13: iconst_0       
        //    14: invokespecial   com/saterskog/cell_lab/h.<init>:(Ljava/lang/String;IZDIIIIDZ)V
        //    17: return         
        //    Signature:
        //  (ZDD)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:1971)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
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
    
    private h(final boolean p4, final double p5, final double p6, final int p7, final int p8, final double p9, final boolean p10) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: iload_2        
        //     3: invokespecial   java/lang/Enum.<init>:(Ljava/lang/String;I)V
        //     6: aload_0        
        //     7: iload_3        
        //     8: putfield        com/saterskog/cell_lab/h.s:Z
        //    11: aload_0        
        //    12: dload           4
        //    14: putfield        com/saterskog/cell_lab/h.u:D
        //    17: aload_0        
        //    18: dconst_0       
        //    19: putfield        com/saterskog/cell_lab/h.v:D
        //    22: aload_0        
        //    23: iload           6
        //    25: putfield        com/saterskog/cell_lab/h.w:I
        //    28: aload_0        
        //    29: iload           7
        //    31: putfield        com/saterskog/cell_lab/h.x:I
        //    34: aload_0        
        //    35: iload           8
        //    37: putfield        com/saterskog/cell_lab/h.y:I
        //    40: aload_0        
        //    41: iload           9
        //    43: putfield        com/saterskog/cell_lab/h.z:I
        //    46: aload_0        
        //    47: dload           10
        //    49: putfield        com/saterskog/cell_lab/h.A:D
        //    52: aload_0        
        //    53: iload           12
        //    55: putfield        com/saterskog/cell_lab/h.t:Z
        //    58: return         
        //    Signature:
        //  (ZDDIIDZ)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:1960)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
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
    
    public final String a(final Context context) {
        return context.getResources().getStringArray(2130837507)[this.ordinal()];
    }
}
