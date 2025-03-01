// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.a;

import android.content.Intent;
import android.os.Handler;
import org.json.JSONException;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import android.os.Bundle;
import android.text.TextUtils;
import android.content.ServiceConnection;
import com.a.a.a.a;
import android.content.Context;

public final class b
{
    boolean a;
    String b;
    public boolean c;
    boolean d;
    boolean e;
    public boolean f;
    boolean g;
    boolean h;
    String i;
    public Context j;
    public com.a.a.a.a k;
    public ServiceConnection l;
    public int m;
    public String n;
    String o;
    public d p;
    private final Object q;
    
    public b(final Context context, final String o) {
        this.a = false;
        this.b = "IabHelper";
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.q = new Object();
        this.i = "";
        this.o = null;
        this.j = context.getApplicationContext();
        this.o = o;
        this.c("IAB helper created.");
    }
    
    private int a(final com.saterskog.a.d d, final String str) {
        final int n = 0;
        this.c("Querying owned items, item type: " + str);
        this.c("Package name: " + this.j.getPackageName());
        String string = null;
        boolean b = false;
        int a2;
        while (true) {
            this.c("Calling getPurchases with continuation token: " + string);
            final Bundle a = this.k.a(3, this.j.getPackageName(), str, string);
            a2 = this.a(a);
            this.c("Owned items response: " + String.valueOf(a2));
            if (a2 != 0) {
                this.c("getPurchases() failed: " + a(a2));
                break;
            }
            if (!a.containsKey("INAPP_PURCHASE_ITEM_LIST") || !a.containsKey("INAPP_PURCHASE_DATA_LIST") || !a.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                this.d("Bundle returned from getPurchases() doesn't contain required fields.");
                a2 = -1002;
                break;
            }
            final ArrayList stringArrayList = a.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            final ArrayList stringArrayList2 = a.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            final ArrayList stringArrayList3 = a.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            for (int i = 0; i < stringArrayList2.size(); ++i) {
                final String s = stringArrayList2.get(i);
                final String str2 = stringArrayList3.get(i);
                final String str3 = stringArrayList.get(i);
                if (com.saterskog.a.f.a(this.o, s, str2)) {
                    this.c("Sku is owned: " + str3);
                    final com.saterskog.a.e e = new com.saterskog.a.e(str, s, str2);
                    if (TextUtils.isEmpty((CharSequence)e.h)) {
                        this.e("BUG: empty/null token!");
                        this.c("Purchase data: " + s);
                    }
                    d.b.put(e.d, e);
                }
                else {
                    this.e("Purchase signature verification **FAILED**. Not adding item.");
                    this.c("   Purchase data: " + s);
                    this.c("   Signature: " + str2);
                    b = true;
                }
            }
            string = a.getString("INAPP_CONTINUATION_TOKEN");
            this.c("Continuation token: " + string);
            if (!TextUtils.isEmpty((CharSequence)string)) {
                continue;
            }
            a2 = n;
            if (b) {
                a2 = -1003;
                break;
            }
            break;
        }
        return a2;
    }
    
    private int a(final String s, final com.saterskog.a.d d, final List<String> list) {
        this.c("Querying SKU details.");
        final ArrayList<String> list2 = new ArrayList<String>();
        list2.addAll(d.c(s));
        if (list != null) {
            for (final String s2 : list) {
                if (!list2.contains(s2)) {
                    list2.add(s2);
                }
            }
        }
        int a;
        if (list2.size() == 0) {
            this.c("queryPrices: nothing to do because there are no SKUs.");
            a = 0;
        }
        else {
            final ArrayList<ArrayList<String>> list3 = new ArrayList<ArrayList<String>>();
            final int n = list2.size() / 20;
            final int n2 = list2.size() % 20;
            for (int i = 0; i < n; ++i) {
                final ArrayList<String> e = new ArrayList<String>();
                final Iterator<String> iterator2 = list2.subList(i * 20, i * 20 + 20).iterator();
                while (iterator2.hasNext()) {
                    e.add(iterator2.next());
                }
                list3.add(e);
            }
            if (n2 != 0) {
                final ArrayList<String> e2 = new ArrayList<String>();
                final Iterator<String> iterator3 = list2.subList(n * 20, n * 20 + n2).iterator();
                while (iterator3.hasNext()) {
                    e2.add(iterator3.next());
                }
                list3.add(e2);
            }
            for (final ArrayList<String> list4 : list3) {
                final Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", (ArrayList)list4);
                final Bundle a2 = this.k.a(3, this.j.getPackageName(), s, bundle);
                if (!a2.containsKey("DETAILS_LIST")) {
                    a = this.a(a2);
                    if (a != 0) {
                        this.c("getSkuDetails() failed: " + a(a));
                        return a;
                    }
                    this.d("getSkuDetails() returned a bundle with neither an error nor a detail list.");
                    a = -1002;
                    return a;
                }
                else {
                    final Iterator iterator5 = a2.getStringArrayList("DETAILS_LIST").iterator();
                    while (iterator5.hasNext()) {
                        final g obj = new g(s, iterator5.next());
                        this.c("Got sku details: " + obj);
                        d.a.put(obj.a, obj);
                    }
                }
            }
            a = 0;
        }
        return a;
    }
    
    public static String a(final int n) {
        final String[] split = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        final String[] split2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
        String s;
        if (n <= -1000) {
            final int n2 = -1000 - n;
            if (n2 >= 0 && n2 < split2.length) {
                s = split2[n2];
            }
            else {
                s = String.valueOf(n) + ":Unknown IAB Helper Error";
            }
        }
        else if (n < 0 || n >= split.length) {
            s = String.valueOf(n) + ":Unknown";
        }
        else {
            s = split[n];
        }
        return s;
    }
    
    private void e(final String str) {
        Log.w(this.b, "In-app billing warning: " + str);
    }
    
    public final int a(final Bundle bundle) {
        final Object value = bundle.get("RESPONSE_CODE");
        int intValue;
        if (value == null) {
            this.c("Bundle with null response code, assuming OK (known issue)");
            intValue = 0;
        }
        else if (value instanceof Integer) {
            intValue = (int)value;
        }
        else {
            if (!(value instanceof Long)) {
                this.d("Unexpected type for bundle response code.");
                this.d(((Long)value).getClass().getName());
                throw new RuntimeException("Unexpected type for bundle response code: " + ((Long)value).getClass().getName());
            }
            intValue = (int)(long)value;
        }
        return intValue;
    }
    
    public final com.saterskog.a.d a(final boolean b, final List<String> list, final List<String> list2) {
        this.b();
        this.a("queryInventory");
        com.saterskog.a.d d;
        try {
            d = new com.saterskog.a.d();
            final int a = this.a(d, "inapp");
            if (a != 0) {
                throw new com.saterskog.a.a(a, "Error refreshing inventory (querying owned items).");
            }
            goto Label_0068;
        }
        catch (RemoteException ex) {
            throw new com.saterskog.a.a(-1001, "Remote exception while refreshing inventory.", (Exception)ex);
        }
        catch (JSONException ex2) {
            throw new com.saterskog.a.a(-1002, "Error parsing JSON response while refreshing inventory.", (Exception)ex2);
        }
        if (this.f) {
            final int a2 = this.a(d, "subs");
            if (a2 != 0) {
                throw new com.saterskog.a.a(a2, "Error refreshing inventory (querying owned subscriptions).");
            }
            if (b) {
                final int a3 = this.a("subs", d, list2);
                if (a3 != 0) {
                    throw new com.saterskog.a.a(a3, "Error refreshing inventory (querying prices of subscriptions).");
                }
            }
        }
        return d;
    }
    
    public final void a() {
        synchronized (this.q) {
            if (this.h) {
                throw new a("Can't dispose because an async operation (" + this.i + ") is in progress.");
            }
        }
        // monitorexit(o)
        this.c("Disposing.");
        this.c = false;
        if (this.l != null) {
            this.c("Unbinding from service.");
            if (this.j != null) {
                this.j.unbindService(this.l);
            }
        }
        this.d = true;
        this.j = null;
        this.l = null;
        this.k = null;
        this.p = null;
    }
    
    public final void a(final com.saterskog.a.e e, final b b) {
        this.b();
        this.a("consume");
        final ArrayList<com.saterskog.a.e> list = new ArrayList<com.saterskog.a.e>();
        list.add(e);
        final Handler handler = new Handler();
        this.b("consume");
        new Thread(new Runnable() {
            final /* synthetic */ List a = list;
            
            @Override
            public final void run() {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: dup            
                //     4: invokespecial   java/util/ArrayList.<init>:()V
                //     7: astore_1       
                //     8: aload_0        
                //     9: getfield        com/saterskog/a/b$3.a:Ljava/util/List;
                //    12: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
                //    17: astore_2       
                //    18: aload_2        
                //    19: invokeinterface java/util/Iterator.hasNext:()Z
                //    24: ifeq            490
                //    27: aload_2        
                //    28: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                //    33: checkcast       Lcom/saterskog/a/e;
                //    36: astore_3       
                //    37: aload_0        
                //    38: getfield        com/saterskog/a/b$3.e:Lcom/saterskog/a/b;
                //    41: astore          4
                //    43: aload           4
                //    45: invokevirtual   com/saterskog/a/b.b:()V
                //    48: aload           4
                //    50: ldc             "consume"
                //    52: invokevirtual   com/saterskog/a/b.a:(Ljava/lang/String;)V
                //    55: aload_3        
                //    56: getfield        com/saterskog/a/e.a:Ljava/lang/String;
                //    59: ldc             "inapp"
                //    61: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
                //    64: ifne            127
                //    67: new             Lcom/saterskog/a/a;
                //    70: astore          5
                //    72: new             Ljava/lang/StringBuilder;
                //    75: astore          4
                //    77: aload           4
                //    79: ldc             "Items of type '"
                //    81: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                //    84: aload           5
                //    86: sipush          -1010
                //    89: aload           4
                //    91: aload_3        
                //    92: getfield        com/saterskog/a/e.a:Ljava/lang/String;
                //    95: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //    98: ldc             "' can't be consumed."
                //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   103: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //   106: invokespecial   com/saterskog/a/a.<init>:(ILjava/lang/String;)V
                //   109: aload           5
                //   111: athrow         
                //   112: astore_3       
                //   113: aload_1        
                //   114: aload_3        
                //   115: getfield        com/saterskog/a/a.a:Lcom/saterskog/a/c;
                //   118: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
                //   123: pop            
                //   124: goto            18
                //   127: aload_3        
                //   128: getfield        com/saterskog/a/e.h:Ljava/lang/String;
                //   131: astore          6
                //   133: aload_3        
                //   134: getfield        com/saterskog/a/e.d:Ljava/lang/String;
                //   137: astore          5
                //   139: aload           6
                //   141: ifnull          154
                //   144: aload           6
                //   146: ldc             ""
                //   148: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
                //   151: ifeq            274
                //   154: new             Ljava/lang/StringBuilder;
                //   157: astore          7
                //   159: aload           7
                //   161: ldc             "Can't consume "
                //   163: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                //   166: aload           4
                //   168: aload           7
                //   170: aload           5
                //   172: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   175: ldc             ". No token."
                //   177: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   180: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //   183: invokevirtual   com/saterskog/a/b.d:(Ljava/lang/String;)V
                //   186: new             Lcom/saterskog/a/a;
                //   189: astore          4
                //   191: new             Ljava/lang/StringBuilder;
                //   194: astore          7
                //   196: aload           7
                //   198: ldc             "PurchaseInfo is missing token for sku: "
                //   200: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                //   203: aload           4
                //   205: sipush          -1007
                //   208: aload           7
                //   210: aload           5
                //   212: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   215: ldc             " "
                //   217: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   220: aload_3        
                //   221: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                //   224: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //   227: invokespecial   com/saterskog/a/a.<init>:(ILjava/lang/String;)V
                //   230: aload           4
                //   232: athrow         
                //   233: astore          5
                //   235: new             Lcom/saterskog/a/a;
                //   238: astore          4
                //   240: new             Ljava/lang/StringBuilder;
                //   243: astore          7
                //   245: aload           7
                //   247: ldc             "Remote exception while consuming. PurchaseInfo: "
                //   249: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                //   252: aload           4
                //   254: sipush          -1001
                //   257: aload           7
                //   259: aload_3        
                //   260: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                //   263: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //   266: aload           5
                //   268: invokespecial   com/saterskog/a/a.<init>:(ILjava/lang/String;Ljava/lang/Exception;)V
                //   271: aload           4
                //   273: athrow         
                //   274: new             Ljava/lang/StringBuilder;
                //   277: astore          7
                //   279: aload           7
                //   281: ldc             "Consuming sku: "
                //   283: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                //   286: aload           4
                //   288: aload           7
                //   290: aload           5
                //   292: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   295: ldc             ", token: "
                //   297: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   300: aload           6
                //   302: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   305: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //   308: invokevirtual   com/saterskog/a/b.c:(Ljava/lang/String;)V
                //   311: aload           4
                //   313: getfield        com/saterskog/a/b.k:Lcom/a/a/a/a;
                //   316: iconst_3       
                //   317: aload           4
                //   319: getfield        com/saterskog/a/b.j:Landroid/content/Context;
                //   322: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
                //   325: aload           6
                //   327: invokeinterface com/a/a/a/a.b:(ILjava/lang/String;Ljava/lang/String;)I
                //   332: istore          8
                //   334: iload           8
                //   336: ifne            413
                //   339: new             Ljava/lang/StringBuilder;
                //   342: astore          7
                //   344: aload           7
                //   346: ldc             "Successfully consumed sku: "
                //   348: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                //   351: aload           4
                //   353: aload           7
                //   355: aload           5
                //   357: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   360: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //   363: invokevirtual   com/saterskog/a/b.c:(Ljava/lang/String;)V
                //   366: new             Lcom/saterskog/a/c;
                //   369: astore          4
                //   371: new             Ljava/lang/StringBuilder;
                //   374: astore          5
                //   376: aload           5
                //   378: ldc             "Successful consume of sku "
                //   380: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                //   383: aload           4
                //   385: iconst_0       
                //   386: aload           5
                //   388: aload_3        
                //   389: getfield        com/saterskog/a/e.d:Ljava/lang/String;
                //   392: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   395: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //   398: invokespecial   com/saterskog/a/c.<init>:(ILjava/lang/String;)V
                //   401: aload_1        
                //   402: aload           4
                //   404: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
                //   409: pop            
                //   410: goto            18
                //   413: new             Ljava/lang/StringBuilder;
                //   416: astore          7
                //   418: aload           7
                //   420: ldc             "Error consuming consuming sku "
                //   422: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                //   425: aload           4
                //   427: aload           7
                //   429: aload           5
                //   431: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   434: ldc             ". "
                //   436: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   439: iload           8
                //   441: invokestatic    com/saterskog/a/b.a:(I)Ljava/lang/String;
                //   444: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   447: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //   450: invokevirtual   com/saterskog/a/b.c:(Ljava/lang/String;)V
                //   453: new             Lcom/saterskog/a/a;
                //   456: astore          4
                //   458: new             Ljava/lang/StringBuilder;
                //   461: astore          7
                //   463: aload           7
                //   465: ldc             "Error consuming sku "
                //   467: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                //   470: aload           4
                //   472: iload           8
                //   474: aload           7
                //   476: aload           5
                //   478: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   481: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //   484: invokespecial   com/saterskog/a/a.<init>:(ILjava/lang/String;)V
                //   487: aload           4
                //   489: athrow         
                //   490: aload_0        
                //   491: getfield        com/saterskog/a/b$3.e:Lcom/saterskog/a/b;
                //   494: invokevirtual   com/saterskog/a/b.c:()V
                //   497: aload_0        
                //   498: getfield        com/saterskog/a/b$3.e:Lcom/saterskog/a/b;
                //   501: getfield        com/saterskog/a/b.d:Z
                //   504: ifne            531
                //   507: aload_0        
                //   508: getfield        com/saterskog/a/b$3.b:Lcom/saterskog/a/b$b;
                //   511: ifnull          531
                //   514: aload_0        
                //   515: getfield        com/saterskog/a/b$3.c:Landroid/os/Handler;
                //   518: new             Lcom/saterskog/a/b$3$1;
                //   521: dup            
                //   522: aload_0        
                //   523: aload_1        
                //   524: invokespecial   com/saterskog/a/b$3$1.<init>:(Lcom/saterskog/a/b$3;Ljava/util/List;)V
                //   527: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
                //   530: pop            
                //   531: aload_0        
                //   532: getfield        com/saterskog/a/b$3.e:Lcom/saterskog/a/b;
                //   535: getfield        com/saterskog/a/b.d:Z
                //   538: ifne            565
                //   541: aload_0        
                //   542: getfield        com/saterskog/a/b$3.d:Lcom/saterskog/a/b$c;
                //   545: ifnull          565
                //   548: aload_0        
                //   549: getfield        com/saterskog/a/b$3.c:Landroid/os/Handler;
                //   552: new             Lcom/saterskog/a/b$3$2;
                //   555: dup            
                //   556: aload_0        
                //   557: aload_1        
                //   558: invokespecial   com/saterskog/a/b$3$2.<init>:(Lcom/saterskog/a/b$3;Ljava/util/List;)V
                //   561: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
                //   564: pop            
                //   565: return         
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  37     112    112    127    Lcom/saterskog/a/a;
                //  127    139    233    274    Landroid/os/RemoteException;
                //  127    139    112    127    Lcom/saterskog/a/a;
                //  144    154    233    274    Landroid/os/RemoteException;
                //  144    154    112    127    Lcom/saterskog/a/a;
                //  154    233    233    274    Landroid/os/RemoteException;
                //  154    233    112    127    Lcom/saterskog/a/a;
                //  235    274    112    127    Lcom/saterskog/a/a;
                //  274    334    233    274    Landroid/os/RemoteException;
                //  274    334    112    127    Lcom/saterskog/a/a;
                //  339    366    233    274    Landroid/os/RemoteException;
                //  339    366    112    127    Lcom/saterskog/a/a;
                //  366    410    112    127    Lcom/saterskog/a/a;
                //  413    490    233    274    Landroid/os/RemoteException;
                //  413    490    112    127    Lcom/saterskog/a/a;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0127:
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
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
        }).start();
    }
    
    public final void a(final String s) {
        if (!this.c) {
            this.d("Illegal state for operation (" + s + "): IAB helper is not set up.");
            throw new IllegalStateException("IAB helper is not set up. Can't perform operation: " + s);
        }
    }
    
    public final boolean a(int intValue, final int i, final Intent intent) {
        boolean b = false;
        if (intValue == this.m) {
            this.b();
            this.a("handleActivityResult");
            this.c();
            if (intent == null) {
                this.d("Null data in IAB activity result.");
                final com.saterskog.a.c c = new com.saterskog.a.c(-1002, "Null data in IAB result");
                if (this.p != null) {
                    this.p.a(c, null);
                }
                b = true;
            }
            else {
                final Object value = intent.getExtras().get("RESPONSE_CODE");
                if (value == null) {
                    this.d("Intent with no response code, assuming OK (known issue)");
                    intValue = 0;
                }
                else if (value instanceof Integer) {
                    intValue = (int)value;
                }
                else {
                    if (!(value instanceof Long)) {
                        this.d("Unexpected type for intent response code.");
                        this.d(((Long)value).getClass().getName());
                        throw new RuntimeException("Unexpected type for intent response code: " + ((Long)value).getClass().getName());
                    }
                    intValue = (int)(long)value;
                }
                final String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
                final String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
                Label_0562: {
                    if (i == -1 && intValue == 0) {
                        this.c("Successful resultcode from purchase activity.");
                        this.c("Purchase data: " + stringExtra);
                        this.c("Data signature: " + stringExtra2);
                        this.c("Extras: " + intent.getExtras());
                        this.c("Expected item type: " + this.n);
                        if (stringExtra == null || stringExtra2 == null) {
                            this.d("BUG: either purchaseData or dataSignature is null.");
                            this.c("Extras: " + intent.getExtras().toString());
                            final com.saterskog.a.c c2 = new com.saterskog.a.c(-1008, "IAB returned null purchaseData or dataSignature");
                            if (this.p != null) {
                                this.p.a(c2, null);
                            }
                            b = true;
                            return b;
                        }
                    }
                    else if (i == -1) {
                        this.c("Result code was OK but in-app billing response was not OK: " + a(intValue));
                        if (this.p != null) {
                            this.p.a(new com.saterskog.a.c(intValue, "Problem purchashing item."), null);
                            break Label_0562;
                        }
                        break Label_0562;
                    }
                    else if (i == 0) {
                        this.c("Purchase canceled - Response: " + a(intValue));
                        final com.saterskog.a.c c3 = new com.saterskog.a.c(-1005, "User canceled.");
                        if (this.p != null) {
                            this.p.a(c3, null);
                            break Label_0562;
                        }
                        break Label_0562;
                    }
                    else {
                        this.d("Purchase failed. Result code: " + Integer.toString(i) + ". Response: " + a(intValue));
                        final com.saterskog.a.c c4 = new com.saterskog.a.c(-1006, "Unknown purchase response.");
                        if (this.p != null) {
                            this.p.a(c4, null);
                            break Label_0562;
                        }
                        break Label_0562;
                    }
                    try {
                        final com.saterskog.a.e e = new com.saterskog.a.e(this.n, stringExtra, stringExtra2);
                        final String d = e.d;
                        if (!com.saterskog.a.f.a(this.o, stringExtra, stringExtra2)) {
                            this.d("Purchase signature verification FAILED for sku " + d);
                            final com.saterskog.a.c c5 = new com.saterskog.a.c(-1003, "Signature verification failed for sku " + d);
                            if (this.p != null) {
                                this.p.a(c5, e);
                            }
                            b = true;
                        }
                        else {
                            this.c("Purchase signature successfully verified.");
                            if (this.p != null) {
                                this.p.a(new com.saterskog.a.c(0, "Success"), e);
                            }
                            b = true;
                        }
                    }
                    catch (JSONException ex) {
                        this.d("Failed to parse purchase data.");
                        ex.printStackTrace();
                        final com.saterskog.a.c c6 = new com.saterskog.a.c(-1002, "Failed to parse purchase data.");
                        if (this.p != null) {
                            this.p.a(c6, null);
                        }
                        b = true;
                    }
                }
            }
        }
        return b;
    }
    
    public final void b() {
        if (this.d) {
            throw new IllegalStateException("IabHelper was disposed of, so it cannot be used.");
        }
    }
    
    public final void b(final String str) {
        synchronized (this.q) {
            if (this.h) {
                throw new a("Can't start async operation (" + str + ") because another async operation (" + this.i + ") is in progress.");
            }
        }
        final String s;
        this.i = s;
        this.h = true;
        this.c("Starting async operation: " + s);
    }
    // monitorexit(o)
    
    public final void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/saterskog/a/b.q:Ljava/lang/Object;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: new             Ljava/lang/StringBuilder;
        //    10: astore_2       
        //    11: aload_2        
        //    12: ldc_w           "Ending async operation: "
        //    15: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    18: aload_0        
        //    19: aload_2        
        //    20: aload_0        
        //    21: getfield        com/saterskog/a/b.i:Ljava/lang/String;
        //    24: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    27: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    30: invokevirtual   com/saterskog/a/b.c:(Ljava/lang/String;)V
        //    33: aload_0        
        //    34: ldc             ""
        //    36: putfield        com/saterskog/a/b.i:Ljava/lang/String;
        //    39: aload_0        
        //    40: iconst_0       
        //    41: putfield        com/saterskog/a/b.h:Z
        //    44: aload_0        
        //    45: getfield        com/saterskog/a/b.e:Z
        //    48: istore_3       
        //    49: iload_3        
        //    50: ifeq            57
        //    53: aload_0        
        //    54: invokevirtual   com/saterskog/a/b.a:()V
        //    57: aload_1        
        //    58: monitorexit    
        //    59: return         
        //    60: astore_2       
        //    61: aload_1        
        //    62: monitorexit    
        //    63: aload_2        
        //    64: athrow         
        //    65: astore_2       
        //    66: goto            57
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  7      49     60     65     Any
        //  53     57     65     69     Lcom/saterskog/a/b$a;
        //  53     57     60     65     Any
        //  57     59     60     65     Any
        //  61     63     60     65     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0057:
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
    
    public final void c(final String s) {
        if (this.a) {
            Log.d(this.b, s);
        }
    }
    
    public final void d(final String str) {
        Log.e(this.b, "In-app billing error: " + str);
    }
    
    public static final class a extends Exception
    {
        public a(final String message) {
            super(message);
        }
    }
    
    public interface b
    {
        void a(final com.saterskog.a.e p0, final com.saterskog.a.c p1);
    }
    
    public interface c
    {
    }
    
    public interface d
    {
        void a(final com.saterskog.a.c p0, final com.saterskog.a.e p1);
    }
    
    public interface e
    {
        void a(final com.saterskog.a.c p0);
    }
    
    public interface f
    {
        void a(final com.saterskog.a.c p0, final com.saterskog.a.d p1);
    }
}
