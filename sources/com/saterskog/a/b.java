package com.saterskog.a;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
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

    /* renamed from: com.saterskog.a.b$b  reason: collision with other inner class name */
    public interface C0026b {
        void a(e eVar, c cVar);
    }

    public interface c {
    }

    public interface d {
        void a(c cVar, e eVar);
    }

    public interface e {
        void a(c cVar);
    }

    public interface f {
        void a(c cVar, d dVar);
    }

    public b(Context context, String str) {
        this.j = context.getApplicationContext();
        this.o = str;
        c("IAB helper created.");
    }

    public final void a() {
        synchronized (this.q) {
            if (this.h) {
                throw new a("Can't dispose because an async operation (" + this.i + ") is in progress.");
            }
        }
        c("Disposing.");
        this.c = false;
        if (this.l != null) {
            c("Unbinding from service.");
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

    public final void b() {
        if (this.d) {
            throw new IllegalStateException("IabHelper was disposed of, so it cannot be used.");
        }
    }

    public final boolean a(int i2, int i3, Intent intent) {
        int longValue;
        if (i2 != this.m) {
            return false;
        }
        b();
        a("handleActivityResult");
        c();
        if (intent == null) {
            d("Null data in IAB activity result.");
            c cVar = new c(-1002, "Null data in IAB result");
            if (this.p != null) {
                this.p.a(cVar, (e) null);
            }
            return true;
        }
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            d("Intent with no response code, assuming OK (known issue)");
            longValue = 0;
        } else if (obj instanceof Integer) {
            longValue = ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            longValue = (int) ((Long) obj).longValue();
        } else {
            d("Unexpected type for intent response code.");
            d(obj.getClass().getName());
            throw new RuntimeException("Unexpected type for intent response code: " + obj.getClass().getName());
        }
        String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (i3 == -1 && longValue == 0) {
            c("Successful resultcode from purchase activity.");
            c("Purchase data: " + stringExtra);
            c("Data signature: " + stringExtra2);
            c("Extras: " + intent.getExtras());
            c("Expected item type: " + this.n);
            if (stringExtra == null || stringExtra2 == null) {
                d("BUG: either purchaseData or dataSignature is null.");
                c("Extras: " + intent.getExtras().toString());
                c cVar2 = new c(-1008, "IAB returned null purchaseData or dataSignature");
                if (this.p != null) {
                    this.p.a(cVar2, (e) null);
                }
                return true;
            }
            try {
                e eVar = new e(this.n, stringExtra, stringExtra2);
                String str = eVar.d;
                if (!f.a(this.o, stringExtra, stringExtra2)) {
                    d("Purchase signature verification FAILED for sku " + str);
                    c cVar3 = new c(-1003, "Signature verification failed for sku " + str);
                    if (this.p != null) {
                        this.p.a(cVar3, eVar);
                    }
                    return true;
                }
                c("Purchase signature successfully verified.");
                if (this.p != null) {
                    this.p.a(new c(0, "Success"), eVar);
                }
            } catch (JSONException e2) {
                d("Failed to parse purchase data.");
                e2.printStackTrace();
                c cVar4 = new c(-1002, "Failed to parse purchase data.");
                if (this.p != null) {
                    this.p.a(cVar4, (e) null);
                }
                return true;
            }
        } else if (i3 == -1) {
            c("Result code was OK but in-app billing response was not OK: " + a(longValue));
            if (this.p != null) {
                this.p.a(new c(longValue, "Problem purchashing item."), (e) null);
            }
        } else if (i3 == 0) {
            c("Purchase canceled - Response: " + a(longValue));
            c cVar5 = new c(-1005, "User canceled.");
            if (this.p != null) {
                this.p.a(cVar5, (e) null);
            }
        } else {
            d("Purchase failed. Result code: " + Integer.toString(i3) + ". Response: " + a(longValue));
            c cVar6 = new c(-1006, "Unknown purchase response.");
            if (this.p != null) {
                this.p.a(cVar6, (e) null);
            }
        }
        return true;
    }

    public final d a(boolean z, List<String> list, List<String> list2) {
        int a2;
        b();
        a("queryInventory");
        try {
            d dVar = new d();
            int a3 = a(dVar, "inapp");
            if (a3 != 0) {
                throw new a(a3, "Error refreshing inventory (querying owned items).");
            }
            if (z) {
                int a4 = a("inapp", dVar, list);
                if (a4 != 0) {
                    throw new a(a4, "Error refreshing inventory (querying prices of items).");
                }
            }
            if (this.f) {
                int a5 = a(dVar, "subs");
                if (a5 != 0) {
                    throw new a(a5, "Error refreshing inventory (querying owned subscriptions).");
                } else if (z && (a2 = a("subs", dVar, list2)) != 0) {
                    throw new a(a2, "Error refreshing inventory (querying prices of subscriptions).");
                }
            }
            return dVar;
        } catch (RemoteException e2) {
            throw new a(-1001, "Remote exception while refreshing inventory.", e2);
        } catch (JSONException e3) {
            throw new a(-1002, "Error parsing JSON response while refreshing inventory.", e3);
        }
    }

    public final void a(e eVar, final C0026b bVar) {
        b();
        a("consume");
        final ArrayList arrayList = new ArrayList();
        arrayList.add(eVar);
        final Handler handler = new Handler();
        b("consume");
        new Thread(new Runnable() {
            final /* synthetic */ c d = null;

            public final void run() {
                final ArrayList arrayList = new ArrayList();
                for (e eVar : arrayList) {
                    try {
                        b bVar = b.this;
                        bVar.b();
                        bVar.a("consume");
                        if (!eVar.a.equals("inapp")) {
                            throw new a(-1010, "Items of type '" + eVar.a + "' can't be consumed.");
                        }
                        String str = eVar.h;
                        String str2 = eVar.d;
                        if (str == null || str.equals("")) {
                            bVar.d("Can't consume " + str2 + ". No token.");
                            throw new a(-1007, "PurchaseInfo is missing token for sku: " + str2 + " " + eVar);
                        }
                        bVar.c("Consuming sku: " + str2 + ", token: " + str);
                        int b2 = bVar.k.b(3, bVar.j.getPackageName(), str);
                        if (b2 == 0) {
                            bVar.c("Successfully consumed sku: " + str2);
                            arrayList.add(new c(0, "Successful consume of sku " + eVar.d));
                        } else {
                            bVar.c("Error consuming consuming sku " + str2 + ". " + b.a(b2));
                            throw new a(b2, "Error consuming sku " + str2);
                        }
                    } catch (RemoteException e2) {
                        throw new a(-1001, "Remote exception while consuming. PurchaseInfo: " + eVar, e2);
                    } catch (a e3) {
                        arrayList.add(e3.a);
                    }
                }
                b.this.c();
                if (!b.this.d && bVar != null) {
                    handler.post(new Runnable() {
                        public final void run() {
                            bVar.a((e) arrayList.get(0), (c) arrayList.get(0));
                        }
                    });
                }
                if (!b.this.d && this.d != null) {
                    handler.post(new Runnable() {
                        public final void run() {
                        }
                    });
                }
            }
        }).start();
    }

    public static String a(int i2) {
        String[] split = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        String[] split2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
        if (i2 <= -1000) {
            int i3 = -1000 - i2;
            if (i3 < 0 || i3 >= split2.length) {
                return String.valueOf(i2) + ":Unknown IAB Helper Error";
            }
            return split2[i3];
        } else if (i2 < 0 || i2 >= split.length) {
            return String.valueOf(i2) + ":Unknown";
        } else {
            return split[i2];
        }
    }

    public final void a(String str) {
        if (!this.c) {
            d("Illegal state for operation (" + str + "): IAB helper is not set up.");
            throw new IllegalStateException("IAB helper is not set up. Can't perform operation: " + str);
        }
    }

    public final int a(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            c("Bundle with null response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            d("Unexpected type for bundle response code.");
            d(obj.getClass().getName());
            throw new RuntimeException("Unexpected type for bundle response code: " + obj.getClass().getName());
        }
    }

    public final void b(String str) {
        synchronized (this.q) {
            if (this.h) {
                throw new a("Can't start async operation (" + str + ") because another async operation (" + this.i + ") is in progress.");
            }
            this.i = str;
            this.h = true;
            c("Starting async operation: " + str);
        }
    }

    public final void c() {
        synchronized (this.q) {
            c("Ending async operation: " + this.i);
            this.i = "";
            this.h = false;
            if (this.e) {
                try {
                    a();
                } catch (a e2) {
                }
            }
        }
    }

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    private int a(d dVar, String str) {
        boolean z;
        c("Querying owned items, item type: " + str);
        c("Package name: " + this.j.getPackageName());
        String str2 = null;
        boolean z2 = false;
        while (true) {
            c("Calling getPurchases with continuation token: " + str2);
            Bundle a2 = this.k.a(3, this.j.getPackageName(), str, str2);
            int a3 = a(a2);
            c("Owned items response: " + String.valueOf(a3));
            if (a3 != 0) {
                c("getPurchases() failed: " + a(a3));
                return a3;
            } else if (!a2.containsKey("INAPP_PURCHASE_ITEM_LIST") || !a2.containsKey("INAPP_PURCHASE_DATA_LIST") || !a2.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                d("Bundle returned from getPurchases() doesn't contain required fields.");
            } else {
                ArrayList<String> stringArrayList = a2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = a2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = a2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i2 = 0;
                boolean z3 = z2;
                while (i2 < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i2);
                    String str4 = stringArrayList3.get(i2);
                    String str5 = stringArrayList.get(i2);
                    if (f.a(this.o, str3, str4)) {
                        c("Sku is owned: " + str5);
                        e eVar = new e(str, str3, str4);
                        if (TextUtils.isEmpty(eVar.h)) {
                            e("BUG: empty/null token!");
                            c("Purchase data: " + str3);
                        }
                        dVar.b.put(eVar.d, eVar);
                        z = z3;
                    } else {
                        e("Purchase signature verification **FAILED**. Not adding item.");
                        c("   Purchase data: " + str3);
                        c("   Signature: " + str4);
                        z = true;
                    }
                    i2++;
                    z3 = z;
                }
                String string = a2.getString("INAPP_CONTINUATION_TOKEN");
                c("Continuation token: " + string);
                if (!TextUtils.isEmpty(string)) {
                    str2 = string;
                    z2 = z3;
                } else if (z3) {
                    return -1003;
                } else {
                    return 0;
                }
            }
        }
        d("Bundle returned from getPurchases() doesn't contain required fields.");
        return -1002;
    }

    private int a(String str, d dVar, List<String> list) {
        c("Querying SKU details.");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(dVar.c(str));
        if (list != null) {
            for (String next : list) {
                if (!arrayList.contains(next)) {
                    arrayList.add(next);
                }
            }
        }
        if (arrayList.size() == 0) {
            c("queryPrices: nothing to do because there are no SKUs.");
            return 0;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size() / 20;
        int size2 = arrayList.size() % 20;
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList3 = new ArrayList();
            for (String add : arrayList.subList(i2 * 20, (i2 * 20) + 20)) {
                arrayList3.add(add);
            }
            arrayList2.add(arrayList3);
        }
        if (size2 != 0) {
            ArrayList arrayList4 = new ArrayList();
            for (String add2 : arrayList.subList(size * 20, (size * 20) + size2)) {
                arrayList4.add(add2);
            }
            arrayList2.add(arrayList4);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", (ArrayList) it.next());
            Bundle a2 = this.k.a(3, this.j.getPackageName(), str, bundle);
            if (!a2.containsKey("DETAILS_LIST")) {
                int a3 = a(a2);
                if (a3 != 0) {
                    c("getSkuDetails() failed: " + a(a3));
                    return a3;
                }
                d("getSkuDetails() returned a bundle with neither an error nor a detail list.");
                return -1002;
            }
            Iterator<String> it2 = a2.getStringArrayList("DETAILS_LIST").iterator();
            while (it2.hasNext()) {
                g gVar = new g(str, it2.next());
                c("Got sku details: " + gVar);
                dVar.a.put(gVar.a, gVar);
            }
        }
        return 0;
    }

    public final void c(String str) {
        if (this.a) {
            Log.d(this.b, str);
        }
    }

    public final void d(String str) {
        Log.e(this.b, "In-app billing error: " + str);
    }

    private void e(String str) {
        Log.w(this.b, "In-app billing warning: " + str);
    }
}
