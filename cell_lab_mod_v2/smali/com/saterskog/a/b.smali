.class public final Lcom/saterskog/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/saterskog/a/b$a;,
        Lcom/saterskog/a/b$c;,
        Lcom/saterskog/a/b$b;,
        Lcom/saterskog/a/b$f;,
        Lcom/saterskog/a/b$d;,
        Lcom/saterskog/a/b$e;
    }
.end annotation


# instance fields
.field a:Z

.field b:Ljava/lang/String;

.field public c:Z

.field d:Z

.field e:Z

.field public f:Z

.field g:Z

.field h:Z

.field i:Ljava/lang/String;

.field public j:Landroid/content/Context;

.field public k:Lcom/a/a/a/a;

.field public l:Landroid/content/ServiceConnection;

.field public m:I

.field public n:Ljava/lang/String;

.field o:Ljava/lang/String;

.field public p:Lcom/saterskog/a/b$d;

.field private final q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 176
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-boolean v1, p0, Lcom/saterskog/a/b;->a:Z

    .line 77
    const-string v0, "IabHelper"

    iput-object v0, p0, Lcom/saterskog/a/b;->b:Ljava/lang/String;

    .line 80
    iput-boolean v1, p0, Lcom/saterskog/a/b;->c:Z

    .line 83
    iput-boolean v1, p0, Lcom/saterskog/a/b;->d:Z

    .line 86
    iput-boolean v1, p0, Lcom/saterskog/a/b;->e:Z

    .line 89
    iput-boolean v1, p0, Lcom/saterskog/a/b;->f:Z

    .line 92
    iput-boolean v1, p0, Lcom/saterskog/a/b;->g:Z

    .line 96
    iput-boolean v1, p0, Lcom/saterskog/a/b;->h:Z

    .line 99
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/saterskog/a/b;->q:Ljava/lang/Object;

    .line 103
    const-string v0, ""

    iput-object v0, p0, Lcom/saterskog/a/b;->i:Ljava/lang/String;

    .line 119
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/a/b;->o:Ljava/lang/String;

    .line 177
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/a/b;->j:Landroid/content/Context;

    .line 178
    iput-object p2, p0, Lcom/saterskog/a/b;->o:Ljava/lang/String;

    .line 179
    const-string v0, "IAB helper created."

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 180
    return-void
.end method

.method private a(Lcom/saterskog/a/d;Ljava/lang/String;)I
    .locals 12

    .prologue
    const/4 v4, 0x0

    .line 938
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Querying owned items, item type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 939
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Package name: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/saterskog/a/b;->j:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 941
    const/4 v0, 0x0

    move-object v1, v0

    move v0, v4

    .line 944
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Calling getPurchases with continuation token: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 945
    iget-object v2, p0, Lcom/saterskog/a/b;->k:Lcom/a/a/a/a;

    const/4 v3, 0x3

    iget-object v5, p0, Lcom/saterskog/a/b;->j:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v3, v5, p2, v1}, Lcom/a/a/a/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v6

    .line 948
    invoke-virtual {p0, v6}, Lcom/saterskog/a/b;->a(Landroid/os/Bundle;)I

    move-result v1

    .line 949
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Owned items response: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 950
    if-eqz v1, :cond_1

    .line 951
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "getPurchases() failed: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/saterskog/a/b;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    move v4, v1

    .line 996
    :cond_0
    :goto_1
    return v4

    .line 954
    :cond_1
    const-string v1, "INAPP_PURCHASE_ITEM_LIST"

    invoke-virtual {v6, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "INAPP_PURCHASE_DATA_LIST"

    .line 955
    invoke-virtual {v6, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "INAPP_DATA_SIGNATURE_LIST"

    .line 956
    invoke-virtual {v6, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 957
    :cond_2
    const-string v0, "Bundle returned from getPurchases() doesn\'t contain required fields."

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->d(Ljava/lang/String;)V

    .line 958
    const/16 v4, -0x3ea

    goto :goto_1

    .line 961
    :cond_3
    const-string v1, "INAPP_PURCHASE_ITEM_LIST"

    invoke-virtual {v6, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    .line 963
    const-string v1, "INAPP_PURCHASE_DATA_LIST"

    invoke-virtual {v6, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    .line 965
    const-string v1, "INAPP_DATA_SIGNATURE_LIST"

    invoke-virtual {v6, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v9

    move v3, v4

    move v5, v0

    .line 968
    :goto_2
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_6

    .line 969
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 970
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 971
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 972
    iget-object v10, p0, Lcom/saterskog/a/b;->o:Ljava/lang/String;

    invoke-static {v10, v0, v1}, Lcom/saterskog/a/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_5

    .line 973
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Sku is owned: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 974
    new-instance v2, Lcom/saterskog/a/e;

    invoke-direct {v2, p2, v0, v1}, Lcom/saterskog/a/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3059
    iget-object v1, v2, Lcom/saterskog/a/e;->h:Ljava/lang/String;

    .line 976
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 977
    const-string v1, "BUG: empty/null token!"

    invoke-direct {p0, v1}, Lcom/saterskog/a/b;->e(Ljava/lang/String;)V

    .line 978
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v10, "Purchase data: "

    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 3089
    :cond_4
    iget-object v0, p1, Lcom/saterskog/a/d;->b:Ljava/util/Map;

    .line 4055
    iget-object v1, v2, Lcom/saterskog/a/e;->d:Ljava/lang/String;

    .line 3089
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v5

    .line 968
    :goto_3
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    move v5, v1

    goto :goto_2

    .line 985
    :cond_5
    const-string v2, "Purchase signature verification **FAILED**. Not adding item."

    invoke-direct {p0, v2}, Lcom/saterskog/a/b;->e(Ljava/lang/String;)V

    .line 986
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "   Purchase data: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 987
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "   Signature: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 988
    const/4 v1, 0x1

    goto :goto_3

    .line 992
    :cond_6
    const-string v0, "INAPP_CONTINUATION_TOKEN"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 993
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Continuation token: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 994
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 996
    if-eqz v5, :cond_0

    const/16 v4, -0x3eb

    goto/16 :goto_1

    :cond_7
    move-object v1, v0

    move v0, v5

    goto/16 :goto_0
.end method

.method private a(Ljava/lang/String;Lcom/saterskog/a/d;Ljava/util/List;)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/saterskog/a/d;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 1001
    const-string v0, "Querying SKU details."

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 1002
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1003
    invoke-virtual {p2, p1}, Lcom/saterskog/a/d;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1004
    if-eqz p3, :cond_1

    .line 1005
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1006
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 1007
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1012
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 1013
    const-string v0, "queryPrices: nothing to do because there are no SKUs."

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    move v0, v1

    .line 1064
    :goto_1
    return v0

    .line 1018
    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1020
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    div-int/lit8 v5, v0, 0x14

    .line 1021
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    rem-int/lit8 v6, v0, 0x14

    move v2, v1

    .line 1022
    :goto_2
    if-ge v2, v5, :cond_4

    .line 1023
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1024
    mul-int/lit8 v0, v2, 0x14

    mul-int/lit8 v8, v2, 0x14

    add-int/lit8 v8, v8, 0x14

    invoke-virtual {v3, v0, v8}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1025
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 1027
    :cond_3
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1022
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    .line 1029
    :cond_4
    if-eqz v6, :cond_6

    .line 1030
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1031
    mul-int/lit8 v0, v5, 0x14

    mul-int/lit8 v5, v5, 0x14

    add-int/2addr v5, v6

    invoke-virtual {v3, v0, v5}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1032
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 1034
    :cond_5
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1037
    :cond_6
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 1038
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 1039
    const-string v4, "ITEM_ID_LIST"

    invoke-virtual {v3, v4, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1040
    iget-object v0, p0, Lcom/saterskog/a/b;->k:Lcom/a/a/a/a;

    const/4 v4, 0x3

    iget-object v5, p0, Lcom/saterskog/a/b;->j:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v4, v5, p1, v3}, Lcom/a/a/a/a;->a(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    .line 1043
    const-string v3, "DETAILS_LIST"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_9

    .line 1044
    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->a(Landroid/os/Bundle;)I

    move-result v0

    .line 1045
    if-eqz v0, :cond_8

    .line 1046
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "getSkuDetails() failed: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/saterskog/a/b;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1049
    :cond_8
    const-string v0, "getSkuDetails() returned a bundle with neither an error nor a detail list."

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->d(Ljava/lang/String;)V

    .line 1050
    const/16 v0, -0x3ea

    goto/16 :goto_1

    .line 1054
    :cond_9
    const-string v3, "DETAILS_LIST"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 1057
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1058
    new-instance v4, Lcom/saterskog/a/g;

    invoke-direct {v4, p1, v0}, Lcom/saterskog/a/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1059
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Got sku details: "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 4085
    iget-object v0, p2, Lcom/saterskog/a/d;->a:Ljava/util/Map;

    .line 5052
    iget-object v5, v4, Lcom/saterskog/a/g;->a:Ljava/lang/String;

    .line 4085
    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_a
    move v0, v1

    .line 1064
    goto/16 :goto_1
.end method

.method public static a(I)Ljava/lang/String;
    .locals 3

    .prologue
    .line 830
    const-string v0, "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned"

    const-string v1, "/"

    .line 833
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 834
    const-string v1, "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt"

    const-string v2, "/"

    .line 843
    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 845
    const/16 v2, -0x3e8

    if-gt p0, v2, :cond_1

    .line 846
    rsub-int v0, p0, -0x3e8

    .line 847
    if-ltz v0, :cond_0

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v0, v1, v0

    .line 853
    :goto_0
    return-object v0

    .line 848
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":Unknown IAB Helper Error"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 850
    :cond_1
    if-ltz p0, :cond_2

    array-length v1, v0

    if-lt p0, v1, :cond_3

    .line 851
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":Unknown"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 853
    :cond_3
    aget-object v0, v0, p0

    goto :goto_0
.end method

.method private e(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1114
    iget-object v0, p0, Lcom/saterskog/a/b;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "In-app billing warning: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1115
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)I
    .locals 4

    .prologue
    .line 867
    const-string v0, "RESPONSE_CODE"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 868
    if-nez v0, :cond_0

    .line 869
    const-string v0, "Bundle with null response code, assuming OK (known issue)"

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 870
    const/4 v0, 0x0

    .line 873
    :goto_0
    return v0

    .line 872
    :cond_0
    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    .line 873
    :cond_1
    instance-of v1, v0, Ljava/lang/Long;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-int v0, v0

    goto :goto_0

    .line 875
    :cond_2
    const-string v1, "Unexpected type for bundle response code."

    invoke-virtual {p0, v1}, Lcom/saterskog/a/b;->d(Ljava/lang/String;)V

    .line 876
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/saterskog/a/b;->d(Ljava/lang/String;)V

    .line 877
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected type for bundle response code: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final a(ZLjava/util/List;Ljava/util/List;)Lcom/saterskog/a/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/saterskog/a/d;"
        }
    .end annotation

    .prologue
    .line 620
    invoke-virtual {p0}, Lcom/saterskog/a/b;->b()V

    .line 621
    const-string v0, "queryInventory"

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->a(Ljava/lang/String;)V

    .line 623
    :try_start_0
    new-instance v0, Lcom/saterskog/a/d;

    invoke-direct {v0}, Lcom/saterskog/a/d;-><init>()V

    .line 624
    const-string v1, "inapp"

    invoke-direct {p0, v0, v1}, Lcom/saterskog/a/b;->a(Lcom/saterskog/a/d;Ljava/lang/String;)I

    move-result v1

    .line 625
    if-eqz v1, :cond_0

    .line 626
    new-instance v0, Lcom/saterskog/a/a;

    const-string v2, "Error refreshing inventory (querying owned items)."

    invoke-direct {v0, v1, v2}, Lcom/saterskog/a/a;-><init>(ILjava/lang/String;)V

    throw v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 653
    :catch_0
    move-exception v0

    .line 654
    new-instance v1, Lcom/saterskog/a/a;

    const/16 v2, -0x3e9

    const-string v3, "Remote exception while refreshing inventory."

    invoke-direct {v1, v2, v3, v0}, Lcom/saterskog/a/a;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    throw v1

    .line 629
    :cond_0
    if-eqz p1, :cond_1

    .line 630
    :try_start_1
    const-string v1, "inapp"

    invoke-direct {p0, v1, v0, p2}, Lcom/saterskog/a/b;->a(Ljava/lang/String;Lcom/saterskog/a/d;Ljava/util/List;)I

    move-result v1

    .line 631
    if-eqz v1, :cond_1

    .line 632
    new-instance v0, Lcom/saterskog/a/a;

    const-string v2, "Error refreshing inventory (querying prices of items)."

    invoke-direct {v0, v1, v2}, Lcom/saterskog/a/a;-><init>(ILjava/lang/String;)V

    throw v0
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 656
    :catch_1
    move-exception v0

    .line 657
    new-instance v1, Lcom/saterskog/a/a;

    const/16 v2, -0x3ea

    const-string v3, "Error parsing JSON response while refreshing inventory."

    invoke-direct {v1, v2, v3, v0}, Lcom/saterskog/a/a;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    throw v1

    .line 637
    :cond_1
    :try_start_2
    iget-boolean v1, p0, Lcom/saterskog/a/b;->f:Z

    if-eqz v1, :cond_3

    .line 638
    const-string v1, "subs"

    invoke-direct {p0, v0, v1}, Lcom/saterskog/a/b;->a(Lcom/saterskog/a/d;Ljava/lang/String;)I

    move-result v1

    .line 639
    if-eqz v1, :cond_2

    .line 640
    new-instance v0, Lcom/saterskog/a/a;

    const-string v2, "Error refreshing inventory (querying owned subscriptions)."

    invoke-direct {v0, v1, v2}, Lcom/saterskog/a/a;-><init>(ILjava/lang/String;)V

    throw v0

    .line 643
    :cond_2
    if-eqz p1, :cond_3

    .line 644
    const-string v1, "subs"

    invoke-direct {p0, v1, v0, p3}, Lcom/saterskog/a/b;->a(Ljava/lang/String;Lcom/saterskog/a/d;Ljava/util/List;)I

    move-result v1

    .line 645
    if-eqz v1, :cond_3

    .line 646
    new-instance v0, Lcom/saterskog/a/a;

    const-string v2, "Error refreshing inventory (querying prices of subscriptions)."

    invoke-direct {v0, v1, v2}, Lcom/saterskog/a/a;-><init>(ILjava/lang/String;)V

    throw v0
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 651
    :cond_3
    return-object v0
.end method

.method public final a()V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 320
    iget-object v1, p0, Lcom/saterskog/a/b;->q:Ljava/lang/Object;

    monitor-enter v1

    .line 321
    :try_start_0
    iget-boolean v0, p0, Lcom/saterskog/a/b;->h:Z

    if-eqz v0, :cond_0

    .line 322
    new-instance v0, Lcom/saterskog/a/b$a;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Can\'t dispose because an async operation ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/saterskog/a/b;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ") is in progress."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/saterskog/a/b$a;-><init>(Ljava/lang/String;)V

    throw v0

    .line 325
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 326
    const-string v0, "Disposing."

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 327
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/a/b;->c:Z

    .line 328
    iget-object v0, p0, Lcom/saterskog/a/b;->l:Landroid/content/ServiceConnection;

    if-eqz v0, :cond_1

    .line 329
    const-string v0, "Unbinding from service."

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 330
    iget-object v0, p0, Lcom/saterskog/a/b;->j:Landroid/content/Context;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/saterskog/a/b;->j:Landroid/content/Context;

    iget-object v1, p0, Lcom/saterskog/a/b;->l:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 332
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/saterskog/a/b;->d:Z

    .line 333
    iput-object v2, p0, Lcom/saterskog/a/b;->j:Landroid/content/Context;

    .line 334
    iput-object v2, p0, Lcom/saterskog/a/b;->l:Landroid/content/ServiceConnection;

    .line 335
    iput-object v2, p0, Lcom/saterskog/a/b;->k:Lcom/a/a/a/a;

    .line 336
    iput-object v2, p0, Lcom/saterskog/a/b;->p:Lcom/saterskog/a/b$d;

    .line 337
    return-void
.end method

.method public final a(Lcom/saterskog/a/e;Lcom/saterskog/a/b$b;)V
    .locals 4

    .prologue
    .line 803
    invoke-virtual {p0}, Lcom/saterskog/a/b;->b()V

    .line 804
    const-string v0, "consume"

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->a(Ljava/lang/String;)V

    .line 805
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 806
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2071
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 2072
    const-string v2, "consume"

    invoke-virtual {p0, v2}, Lcom/saterskog/a/b;->b(Ljava/lang/String;)V

    .line 2073
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, Lcom/saterskog/a/b$3;

    invoke-direct {v3, p0, v0, p2, v1}, Lcom/saterskog/a/b$3;-><init>(Lcom/saterskog/a/b;Ljava/util/List;Lcom/saterskog/a/b$b;Landroid/os/Handler;)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 2102
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 808
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 859
    iget-boolean v0, p0, Lcom/saterskog/a/b;->c:Z

    if-nez v0, :cond_0

    .line 860
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Illegal state for operation ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "): IAB helper is not set up."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->d(Ljava/lang/String;)V

    .line 861
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "IAB helper is not set up. Can\'t perform operation: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 863
    :cond_0
    return-void
.end method

.method public final a(IILandroid/content/Intent;)Z
    .locals 9

    .prologue
    const/4 v6, -0x1

    const/16 v8, -0x3ea

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v7, 0x0

    .line 519
    iget v0, p0, Lcom/saterskog/a/b;->m:I

    if-eq p1, v0, :cond_0

    .line 598
    :goto_0
    return v1

    .line 521
    :cond_0
    invoke-virtual {p0}, Lcom/saterskog/a/b;->b()V

    .line 522
    const-string v0, "handleActivityResult"

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->a(Ljava/lang/String;)V

    .line 525
    invoke-virtual {p0}, Lcom/saterskog/a/b;->c()V

    .line 527
    if-nez p3, :cond_2

    .line 528
    const-string v0, "Null data in IAB activity result."

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->d(Ljava/lang/String;)V

    .line 529
    new-instance v0, Lcom/saterskog/a/c;

    const-string v1, "Null data in IAB result"

    invoke-direct {v0, v8, v1}, Lcom/saterskog/a/c;-><init>(ILjava/lang/String;)V

    .line 530
    iget-object v1, p0, Lcom/saterskog/a/b;->p:Lcom/saterskog/a/b$d;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/saterskog/a/b;->p:Lcom/saterskog/a/b$d;

    invoke-interface {v1, v0, v7}, Lcom/saterskog/a/b$d;->a(Lcom/saterskog/a/c;Lcom/saterskog/a/e;)V

    :cond_1
    move v1, v2

    .line 531
    goto :goto_0

    .line 1883
    :cond_2
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v3, "RESPONSE_CODE"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 1884
    if-nez v0, :cond_5

    .line 1885
    const-string v0, "Intent with no response code, assuming OK (known issue)"

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->d(Ljava/lang/String;)V

    move v0, v1

    .line 535
    :goto_1
    const-string v3, "INAPP_PURCHASE_DATA"

    invoke-virtual {p3, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 536
    const-string v4, "INAPP_DATA_SIGNATURE"

    invoke-virtual {p3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 538
    if-ne p2, v6, :cond_d

    if-nez v0, :cond_d

    .line 539
    const-string v0, "Successful resultcode from purchase activity."

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 540
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Purchase data: "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 541
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Data signature: "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 542
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Extras: "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 543
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Expected item type: "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/saterskog/a/b;->n:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 545
    if-eqz v3, :cond_3

    if-nez v4, :cond_8

    .line 546
    :cond_3
    const-string v0, "BUG: either purchaseData or dataSignature is null."

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->d(Ljava/lang/String;)V

    .line 547
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Extras: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 548
    new-instance v0, Lcom/saterskog/a/c;

    const/16 v1, -0x3f0

    const-string v3, "IAB returned null purchaseData or dataSignature"

    invoke-direct {v0, v1, v3}, Lcom/saterskog/a/c;-><init>(ILjava/lang/String;)V

    .line 549
    iget-object v1, p0, Lcom/saterskog/a/b;->p:Lcom/saterskog/a/b$d;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/saterskog/a/b;->p:Lcom/saterskog/a/b$d;

    invoke-interface {v1, v0, v7}, Lcom/saterskog/a/b$d;->a(Lcom/saterskog/a/c;Lcom/saterskog/a/e;)V

    :cond_4
    move v1, v2

    .line 550
    goto/16 :goto_0

    .line 1888
    :cond_5
    instance-of v3, v0, Ljava/lang/Integer;

    if-eqz v3, :cond_6

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto/16 :goto_1

    .line 1889
    :cond_6
    instance-of v3, v0, Ljava/lang/Long;

    if-eqz v3, :cond_7

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    long-to-int v0, v4

    goto/16 :goto_1

    .line 1891
    :cond_7
    const-string v1, "Unexpected type for intent response code."

    invoke-virtual {p0, v1}, Lcom/saterskog/a/b;->d(Ljava/lang/String;)V

    .line 1892
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/saterskog/a/b;->d(Ljava/lang/String;)V

    .line 1893
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected type for intent response code: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 555
    :cond_8
    :try_start_0
    new-instance v0, Lcom/saterskog/a/e;

    iget-object v5, p0, Lcom/saterskog/a/b;->n:Ljava/lang/String;

    invoke-direct {v0, v5, v3, v4}, Lcom/saterskog/a/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2055
    iget-object v5, v0, Lcom/saterskog/a/e;->d:Ljava/lang/String;

    .line 559
    iget-object v6, p0, Lcom/saterskog/a/b;->o:Ljava/lang/String;

    invoke-static {v6, v3, v4}, Lcom/saterskog/a/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_a

    .line 560
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Purchase signature verification FAILED for sku "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/saterskog/a/b;->d(Ljava/lang/String;)V

    .line 561
    new-instance v1, Lcom/saterskog/a/c;

    const/16 v3, -0x3eb

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "Signature verification failed for sku "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lcom/saterskog/a/c;-><init>(ILjava/lang/String;)V

    .line 562
    iget-object v3, p0, Lcom/saterskog/a/b;->p:Lcom/saterskog/a/b$d;

    if-eqz v3, :cond_9

    iget-object v3, p0, Lcom/saterskog/a/b;->p:Lcom/saterskog/a/b$d;

    invoke-interface {v3, v1, v0}, Lcom/saterskog/a/b$d;->a(Lcom/saterskog/a/c;Lcom/saterskog/a/e;)V

    :cond_9
    move v1, v2

    .line 563
    goto/16 :goto_0

    .line 565
    :cond_a
    const-string v3, "Purchase signature successfully verified."

    invoke-virtual {p0, v3}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 575
    iget-object v3, p0, Lcom/saterskog/a/b;->p:Lcom/saterskog/a/b$d;

    if-eqz v3, :cond_b

    .line 576
    iget-object v3, p0, Lcom/saterskog/a/b;->p:Lcom/saterskog/a/b$d;

    new-instance v4, Lcom/saterskog/a/c;

    const-string v5, "Success"

    invoke-direct {v4, v1, v5}, Lcom/saterskog/a/c;-><init>(ILjava/lang/String;)V

    invoke-interface {v3, v4, v0}, Lcom/saterskog/a/b$d;->a(Lcom/saterskog/a/c;Lcom/saterskog/a/e;)V

    :cond_b
    :goto_2
    move v1, v2

    .line 598
    goto/16 :goto_0

    .line 567
    :catch_0
    move-exception v0

    .line 568
    const-string v1, "Failed to parse purchase data."

    invoke-virtual {p0, v1}, Lcom/saterskog/a/b;->d(Ljava/lang/String;)V

    .line 569
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 570
    new-instance v0, Lcom/saterskog/a/c;

    const-string v1, "Failed to parse purchase data."

    invoke-direct {v0, v8, v1}, Lcom/saterskog/a/c;-><init>(ILjava/lang/String;)V

    .line 571
    iget-object v1, p0, Lcom/saterskog/a/b;->p:Lcom/saterskog/a/b$d;

    if-eqz v1, :cond_c

    iget-object v1, p0, Lcom/saterskog/a/b;->p:Lcom/saterskog/a/b$d;

    invoke-interface {v1, v0, v7}, Lcom/saterskog/a/b$d;->a(Lcom/saterskog/a/c;Lcom/saterskog/a/e;)V

    :cond_c
    move v1, v2

    .line 572
    goto/16 :goto_0

    .line 579
    :cond_d
    if-ne p2, v6, :cond_e

    .line 581
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Result code was OK but in-app billing response was not OK: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/saterskog/a/b;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 582
    iget-object v1, p0, Lcom/saterskog/a/b;->p:Lcom/saterskog/a/b$d;

    if-eqz v1, :cond_b

    .line 583
    new-instance v1, Lcom/saterskog/a/c;

    const-string v3, "Problem purchashing item."

    invoke-direct {v1, v0, v3}, Lcom/saterskog/a/c;-><init>(ILjava/lang/String;)V

    .line 584
    iget-object v0, p0, Lcom/saterskog/a/b;->p:Lcom/saterskog/a/b$d;

    invoke-interface {v0, v1, v7}, Lcom/saterskog/a/b$d;->a(Lcom/saterskog/a/c;Lcom/saterskog/a/e;)V

    goto :goto_2

    .line 587
    :cond_e
    if-nez p2, :cond_f

    .line 588
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Purchase canceled - Response: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/saterskog/a/b;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 589
    new-instance v0, Lcom/saterskog/a/c;

    const/16 v1, -0x3ed

    const-string v3, "User canceled."

    invoke-direct {v0, v1, v3}, Lcom/saterskog/a/c;-><init>(ILjava/lang/String;)V

    .line 590
    iget-object v1, p0, Lcom/saterskog/a/b;->p:Lcom/saterskog/a/b$d;

    if-eqz v1, :cond_b

    iget-object v1, p0, Lcom/saterskog/a/b;->p:Lcom/saterskog/a/b$d;

    invoke-interface {v1, v0, v7}, Lcom/saterskog/a/b$d;->a(Lcom/saterskog/a/c;Lcom/saterskog/a/e;)V

    goto :goto_2

    .line 593
    :cond_f
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Purchase failed. Result code: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ". Response: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 594
    invoke-static {v0}, Lcom/saterskog/a/b;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 593
    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->d(Ljava/lang/String;)V

    .line 595
    new-instance v0, Lcom/saterskog/a/c;

    const/16 v1, -0x3ee

    const-string v3, "Unknown purchase response."

    invoke-direct {v0, v1, v3}, Lcom/saterskog/a/c;-><init>(ILjava/lang/String;)V

    .line 596
    iget-object v1, p0, Lcom/saterskog/a/b;->p:Lcom/saterskog/a/b$d;

    if-eqz v1, :cond_b

    iget-object v1, p0, Lcom/saterskog/a/b;->p:Lcom/saterskog/a/b$d;

    invoke-interface {v1, v0, v7}, Lcom/saterskog/a/b$d;->a(Lcom/saterskog/a/c;Lcom/saterskog/a/e;)V

    goto/16 :goto_2
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 360
    iget-boolean v0, p0, Lcom/saterskog/a/b;->d:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "IabHelper was disposed of, so it cannot be used."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 361
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 898
    iget-object v1, p0, Lcom/saterskog/a/b;->q:Ljava/lang/Object;

    monitor-enter v1

    .line 899
    :try_start_0
    iget-boolean v0, p0, Lcom/saterskog/a/b;->h:Z

    if-eqz v0, :cond_0

    .line 900
    new-instance v0, Lcom/saterskog/a/b$a;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Can\'t start async operation ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ") because another async operation ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/saterskog/a/b;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ") is in progress."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/saterskog/a/b$a;-><init>(Ljava/lang/String;)V

    throw v0

    .line 907
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 904
    :cond_0
    :try_start_1
    iput-object p1, p0, Lcom/saterskog/a/b;->i:Ljava/lang/String;

    .line 905
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/saterskog/a/b;->h:Z

    .line 906
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Starting async operation: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 907
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method public final c()V
    .locals 3

    .prologue
    .line 911
    iget-object v1, p0, Lcom/saterskog/a/b;->q:Ljava/lang/Object;

    monitor-enter v1

    .line 912
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Ending async operation: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/saterskog/a/b;->i:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 913
    const-string v0, ""

    iput-object v0, p0, Lcom/saterskog/a/b;->i:Ljava/lang/String;

    .line 914
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/a/b;->h:Z

    .line 915
    iget-boolean v0, p0, Lcom/saterskog/a/b;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 917
    :try_start_1
    invoke-virtual {p0}, Lcom/saterskog/a/b;->a()V
    :try_end_1
    .catch Lcom/saterskog/a/b$a; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 923
    :cond_0
    :goto_0
    :try_start_2
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1106
    iget-boolean v0, p0, Lcom/saterskog/a/b;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/saterskog/a/b;->b:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1107
    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1110
    iget-object v0, p0, Lcom/saterskog/a/b;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "In-app billing error: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1111
    return-void
.end method
