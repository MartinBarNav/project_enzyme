/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  android.util.Log
 *  org.json.JSONException
 */
package com.saterskog.a;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.saterskog.a.g;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

public final class b {
    boolean a = false;
    String b = "IabHelper";
    public boolean c = false;
    boolean d = false;
    boolean e = false;
    public boolean f = false;
    boolean g = false;
    boolean h = false;
    String i = "";
    public Context j;
    public com.a.a.a.a k;
    public ServiceConnection l;
    public int m;
    public String n;
    String o = null;
    public d p;
    private final Object q = new Object();

    public b(Context context, String string) {
        this.j = context.getApplicationContext();
        this.o = string;
        this.c("IAB helper created.");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private int a(com.saterskog.a.d d2, String string) {
        int n2;
        String string2;
        int n3 = 0;
        this.c("Querying owned items, item type: " + string);
        this.c("Package name: " + this.j.getPackageName());
        Object var4_4 = null;
        boolean bl = false;
        do {
            void var4_5;
            this.c("Calling getPurchases with continuation token: " + (String)var4_5);
            Bundle bundle = this.k.a(3, this.j.getPackageName(), string, (String)var4_5);
            n2 = this.a(bundle);
            this.c("Owned items response: " + String.valueOf(n2));
            if (n2 != 0) {
                this.c("getPurchases() failed: " + com.saterskog.a.b.a(n2));
                return n2;
            }
            if (!(bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundle.containsKey("INAPP_PURCHASE_DATA_LIST") && bundle.containsKey("INAPP_DATA_SIGNATURE_LIST"))) {
                this.d("Bundle returned from getPurchases() doesn't contain required fields.");
                return -1002;
            }
            ArrayList arrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList arrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList arrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            for (n2 = 0; n2 < arrayList2.size(); ++n2) {
                String string3 = (String)arrayList2.get(n2);
                String string4 = (String)arrayList3.get(n2);
                Object object = (String)arrayList.get(n2);
                if (com.saterskog.a.f.a(this.o, string3, string4)) {
                    this.c("Sku is owned: " + (String)object);
                    object = new com.saterskog.a.e(string, string3, string4);
                    if (TextUtils.isEmpty((CharSequence)((com.saterskog.a.e)object).h)) {
                        this.e("BUG: empty/null token!");
                        this.c("Purchase data: " + string3);
                    }
                    d2.b.put(((com.saterskog.a.e)object).d, (com.saterskog.a.e)object);
                    continue;
                }
                this.e("Purchase signature verification **FAILED**. Not adding item.");
                this.c("   Purchase data: " + string3);
                this.c("   Signature: " + string4);
                bl = true;
            }
            string2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
            this.c("Continuation token: " + string2);
        } while (!TextUtils.isEmpty((CharSequence)string2));
        n2 = n3;
        if (!bl) return n2;
        return -1003;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int a(String string, com.saterskog.a.d d2, List<String> iterator) {
        int n2;
        Object object;
        this.c("Querying SKU details.");
        Object object2 = new ArrayList();
        ((ArrayList)object2).addAll(d2.c(string));
        if (iterator != null) {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                object = (String)iterator.next();
                if (((ArrayList)object2).contains(object)) continue;
                ((ArrayList)object2).add(object);
            }
        }
        if (((ArrayList)object2).size() == 0) {
            this.c("queryPrices: nothing to do because there are no SKUs.");
            return 0;
        }
        iterator = new ArrayList();
        int n3 = ((ArrayList)object2).size() / 20;
        int n4 = ((ArrayList)object2).size() % 20;
        for (n2 = 0; n2 < n3; ++n2) {
            ArrayList<String> arrayList = new ArrayList<String>();
            object = ((ArrayList)object2).subList(n2 * 20, n2 * 20 + 20).iterator();
            while (object.hasNext()) {
                arrayList.add((String)object.next());
            }
            ((ArrayList)((Object)iterator)).add(arrayList);
        }
        if (n4 != 0) {
            object = new ArrayList();
            object2 = ((ArrayList)object2).subList(n3 * 20, n3 * 20 + n4).iterator();
            while (object2.hasNext()) {
                ((ArrayList)object).add((String)((String)object2.next()));
            }
            ((ArrayList)((Object)iterator)).add(object);
        }
        iterator = ((ArrayList)((Object)iterator)).iterator();
        block5: while (iterator.hasNext()) {
            object = (ArrayList)iterator.next();
            object2 = new Bundle();
            object2.putStringArrayList("ITEM_ID_LIST", object);
            object2 = this.k.a(3, this.j.getPackageName(), string, (Bundle)object2);
            if (!object2.containsKey("DETAILS_LIST")) {
                n2 = this.a((Bundle)object2);
                if (n2 != 0) {
                    this.c("getSkuDetails() failed: " + com.saterskog.a.b.a(n2));
                    return n2;
                }
                this.d("getSkuDetails() returned a bundle with neither an error nor a detail list.");
                return -1002;
            }
            object2 = object2.getStringArrayList("DETAILS_LIST").iterator();
            while (true) {
                if (!object2.hasNext()) continue block5;
                object = new g(string, (String)object2.next());
                this.c("Got sku details: " + object);
                d2.a.put(((g)object).a, (g)object);
            }
            break;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(int n2) {
        void var1_3;
        String[] arrstring = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        String[] arrstring2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
        if (n2 <= -1000) {
            int n3 = -1000 - n2;
            if (n3 >= 0 && n3 < arrstring2.length) {
                String string = arrstring2[n3];
                return var1_3;
            }
            String string = String.valueOf(n2) + ":Unknown IAB Helper Error";
            return var1_3;
        }
        if (n2 < 0 || n2 >= arrstring.length) {
            String string = String.valueOf(n2) + ":Unknown";
            return var1_3;
        }
        String string = arrstring[n2];
        return var1_3;
    }

    private void e(String string) {
        Log.w((String)this.b, (String)("In-app billing warning: " + string));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int a(Bundle object) {
        if ((object = object.get("RESPONSE_CODE")) == null) {
            this.c("Bundle with null response code, assuming OK (known issue)");
            return 0;
        }
        if (object instanceof Integer) {
            return (Integer)object;
        }
        if (object instanceof Long) {
            return (int)((Long)object).longValue();
        }
        this.d("Unexpected type for bundle response code.");
        this.d(object.getClass().getName());
        throw new RuntimeException("Unexpected type for bundle response code: " + object.getClass().getName());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final com.saterskog.a.d a(boolean bl, List<String> object, List<String> list) {
        com.saterskog.a.d d2;
        block9: {
            int n2;
            block8: {
                this.b();
                this.a("queryInventory");
                d2 = new com.saterskog.a.d();
                n2 = this.a(d2, "inapp");
                if (n2 != 0) {
                    object = new com.saterskog.a.a(n2, "Error refreshing inventory (querying owned items).");
                    throw object;
                }
                if (!bl) break block8;
                n2 = this.a("inapp", d2, (List<String>)object);
                if (n2 == 0) break block8;
                object = new com.saterskog.a.a(n2, "Error refreshing inventory (querying prices of items).");
                throw object;
            }
            try {
                if (!this.f) break block9;
                n2 = this.a(d2, "subs");
                if (n2 != 0) {
                    object = new com.saterskog.a.a(n2, "Error refreshing inventory (querying owned subscriptions).");
                    throw object;
                }
            }
            catch (RemoteException remoteException) {
                throw new com.saterskog.a.a(-1001, "Remote exception while refreshing inventory.", (Exception)((Object)remoteException));
            }
            catch (JSONException jSONException) {
                throw new com.saterskog.a.a(-1002, "Error parsing JSON response while refreshing inventory.", (Exception)((Object)jSONException));
            }
            if (bl && (n2 = this.a("subs", d2, list)) != 0) {
                object = new com.saterskog.a.a(n2, "Error refreshing inventory (querying prices of subscriptions).");
                throw object;
            }
        }
        return d2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object = this.q;
        synchronized (object) {
            if (this.h) {
                StringBuilder stringBuilder = new StringBuilder("Can't dispose because an async operation (");
                a a2 = new a(stringBuilder.append(this.i).append(") is in progress.").toString());
                throw a2;
            }
        }
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

    public final void a(com.saterskog.a.e e2, final b b2) {
        this.b();
        this.a("consume");
        final ArrayList<com.saterskog.a.e> arrayList = new ArrayList<com.saterskog.a.e>();
        arrayList.add(e2);
        e2 = new Handler();
        this.b("consume");
        new Thread(new Runnable((Handler)e2){
            final /* synthetic */ Handler c;
            final /* synthetic */ c d;
            {
                this.c = handler;
                this.d = null;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public final void run() {
                final ArrayList<Object> arrayList2 = new ArrayList<Object>();
                for (com.saterskog.a.e e2 : arrayList) {
                    try {
                        int n2;
                        StringBuilder stringBuilder;
                        Object object;
                        Object object2;
                        block12: {
                            object2 = b.this;
                            ((b)object2).b();
                            ((b)object2).a("consume");
                            if (!e2.a.equals("inapp")) {
                                object2 = new StringBuilder("Items of type '");
                                object = new com.saterskog.a.a(-1010, ((StringBuilder)object2).append(e2.a).append("' can't be consumed.").toString());
                                throw object;
                            }
                            try {
                                String string = e2.h;
                                object = e2.d;
                                if (string == null || string.equals("")) {
                                    stringBuilder = new StringBuilder("Can't consume ");
                                    ((b)object2).d(stringBuilder.append((String)object).append(". No token.").toString());
                                    stringBuilder = new StringBuilder("PurchaseInfo is missing token for sku: ");
                                    object2 = new com.saterskog.a.a(-1007, stringBuilder.append((String)object).append(" ").append(e2).toString());
                                    throw object2;
                                }
                                stringBuilder = new StringBuilder("Consuming sku: ");
                                ((b)object2).c(stringBuilder.append((String)object).append(", token: ").append(string).toString());
                                n2 = ((b)object2).k.b(3, ((b)object2).j.getPackageName(), string);
                                if (n2 != 0) break block12;
                                stringBuilder = new StringBuilder("Successfully consumed sku: ");
                                ((b)object2).c(stringBuilder.append((String)object).toString());
                                object = new StringBuilder("Successful consume of sku ");
                                object2 = new com.saterskog.a.c(0, ((StringBuilder)object).append(e2.d).toString());
                                arrayList2.add(object2);
                            }
                            catch (RemoteException remoteException) {
                                stringBuilder = new StringBuilder("Remote exception while consuming. PurchaseInfo: ");
                                object2 = new com.saterskog.a.a(-1001, stringBuilder.append(e2).toString(), (Exception)((Object)remoteException));
                                throw object2;
                            }
                            continue;
                        }
                        stringBuilder = new StringBuilder("Error consuming consuming sku ");
                        ((b)object2).c(stringBuilder.append((String)object).append(". ").append(com.saterskog.a.b.a(n2)).toString());
                        stringBuilder = new StringBuilder("Error consuming sku ");
                        object2 = new com.saterskog.a.a(n2, stringBuilder.append((String)object).toString());
                        throw object2;
                    }
                    catch (com.saterskog.a.a a2) {
                        arrayList2.add(a2.a);
                    }
                }
                b.this.c();
                if (!b.this.d && b2 != null) {
                    this.c.post(new Runnable(){

                        @Override
                        public final void run() {
                            b2.a((com.saterskog.a.e)arrayList.get(0), (com.saterskog.a.c)arrayList2.get(0));
                        }
                    });
                }
                if (!b.this.d && this.d != null) {
                    this.c.post(new Runnable(){

                        @Override
                        public final void run() {
                        }
                    });
                }
            }
        }).start();
    }

    public final void a(String string) {
        if (!this.c) {
            this.d("Illegal state for operation (" + string + "): IAB helper is not set up.");
            throw new IllegalStateException("IAB helper is not set up. Can't perform operation: " + string);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(int n2, int n3, Intent object) {
        boolean bl = false;
        if (n2 != this.m) {
            return bl;
        }
        this.b();
        this.a("handleActivityResult");
        this.c();
        if (object == null) {
            this.d("Null data in IAB activity result.");
            com.saterskog.a.c c2 = new com.saterskog.a.c(-1002, "Null data in IAB result");
            if (this.p == null) return true;
            this.p.a(c2, null);
            return true;
        }
        Object object2 = object.getExtras().get("RESPONSE_CODE");
        if (object2 == null) {
            this.d("Intent with no response code, assuming OK (known issue)");
            n2 = 0;
        } else if (object2 instanceof Integer) {
            n2 = (Integer)object2;
        } else {
            if (!(object2 instanceof Long)) {
                this.d("Unexpected type for intent response code.");
                this.d(object2.getClass().getName());
                throw new RuntimeException("Unexpected type for intent response code: " + object2.getClass().getName());
            }
            n2 = (int)((Long)object2).longValue();
        }
        CharSequence charSequence = object.getStringExtra("INAPP_PURCHASE_DATA");
        Object object3 = object.getStringExtra("INAPP_DATA_SIGNATURE");
        if (n3 == -1 && n2 == 0) {
            this.c("Successful resultcode from purchase activity.");
            this.c("Purchase data: " + (String)charSequence);
            this.c("Data signature: " + (String)object3);
            this.c("Extras: " + (Object)object.getExtras());
            this.c("Expected item type: " + this.n);
            if (charSequence == null || object3 == null) {
                this.d("BUG: either purchaseData or dataSignature is null.");
                this.c("Extras: " + object.getExtras().toString());
                com.saterskog.a.c c3 = new com.saterskog.a.c(-1008, "IAB returned null purchaseData or dataSignature");
                if (this.p == null) return true;
                this.p.a(c3, null);
                return true;
            }
            try {
                com.saterskog.a.e e2 = new com.saterskog.a.e(this.n, (String)charSequence, (String)object3);
                object2 = e2.d;
                if (!com.saterskog.a.f.a(this.o, (String)charSequence, (String)object3)) {
                    object3 = new StringBuilder("Purchase signature verification FAILED for sku ");
                    this.d(((StringBuilder)object3).append((String)object2).toString());
                    charSequence = new StringBuilder("Signature verification failed for sku ");
                    object3 = new com.saterskog.a.c(-1003, ((StringBuilder)charSequence).append((String)object2).toString());
                    if (this.p == null) return true;
                    this.p.a((com.saterskog.a.c)object3, e2);
                    return true;
                }
                this.c("Purchase signature successfully verified.");
                if (this.p == null) return true;
                this.p.a(new com.saterskog.a.c(0, "Success"), e2);
                return true;
            }
            catch (JSONException jSONException) {
                this.d("Failed to parse purchase data.");
                jSONException.printStackTrace();
                com.saterskog.a.c c4 = new com.saterskog.a.c(-1002, "Failed to parse purchase data.");
                if (this.p == null) return true;
                this.p.a(c4, null);
                return true;
            }
        } else if (n3 == -1) {
            this.c("Result code was OK but in-app billing response was not OK: " + com.saterskog.a.b.a(n2));
            if (this.p == null) return true;
            com.saterskog.a.c c5 = new com.saterskog.a.c(n2, "Problem purchashing item.");
            this.p.a(c5, null);
            return true;
        } else if (n3 == 0) {
            this.c("Purchase canceled - Response: " + com.saterskog.a.b.a(n2));
            com.saterskog.a.c c6 = new com.saterskog.a.c(-1005, "User canceled.");
            if (this.p == null) return true;
            this.p.a(c6, null);
            return true;
        } else {
            this.d("Purchase failed. Result code: " + Integer.toString(n3) + ". Response: " + com.saterskog.a.b.a(n2));
            com.saterskog.a.c c7 = new com.saterskog.a.c(-1006, "Unknown purchase response.");
            if (this.p == null) return true;
            this.p.a(c7, null);
        }
        return true;
    }

    public final void b() {
        if (this.d) {
            throw new IllegalStateException("IabHelper was disposed of, so it cannot be used.");
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(String string) {
        Object object = this.q;
        synchronized (object) {
            if (this.h) {
                StringBuilder stringBuilder = new StringBuilder("Can't start async operation (");
                a a2 = new a(stringBuilder.append(string).append(") because another async operation (").append(this.i).append(") is in progress.").toString());
                throw a2;
            }
            this.i = string;
            this.h = true;
            StringBuilder stringBuilder = new StringBuilder("Starting async operation: ");
            this.c(stringBuilder.append(string).toString());
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        Object object = this.q;
        synchronized (object) {
            StringBuilder stringBuilder = new StringBuilder("Ending async operation: ");
            this.c(stringBuilder.append(this.i).toString());
            this.i = "";
            this.h = false;
            boolean bl = this.e;
            if (bl) {
                try {
                    this.a();
                }
                catch (a a2) {}
            }
            return;
        }
    }

    public final void c(String string) {
        if (this.a) {
            Log.d((String)this.b, (String)string);
        }
    }

    public final void d(String string) {
        Log.e((String)this.b, (String)("In-app billing error: " + string));
    }

    public static final class a
    extends Exception {
        public a(String string) {
            super(string);
        }
    }

    public static interface b {
        public void a(com.saterskog.a.e var1, com.saterskog.a.c var2);
    }

    public static interface c {
    }

    public static interface d {
        public void a(com.saterskog.a.c var1, com.saterskog.a.e var2);
    }

    public static interface e {
        public void a(com.saterskog.a.c var1);
    }

    public static interface f {
        public void a(com.saterskog.a.c var1, com.saterskog.a.d var2);
    }
}

