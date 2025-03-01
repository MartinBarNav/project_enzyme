.class final Landroid/support/v4/app/c;
.super Landroid/support/v4/app/i;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/c$b;,
        Landroid/support/v4/app/c$a;
    }
.end annotation


# instance fields
.field final a:Landroid/support/v4/app/h;

.field b:Landroid/support/v4/app/c$a;

.field c:Landroid/support/v4/app/c$a;

.field d:I

.field e:I

.field f:I

.field g:I

.field h:I

.field i:I

.field j:I

.field k:Z

.field l:Z

.field m:Ljava/lang/String;

.field n:Z

.field o:I

.field p:I

.field q:Ljava/lang/CharSequence;

.field r:I

.field s:Ljava/lang/CharSequence;

.field t:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/support/v4/app/h;)V
    .locals 1

    .prologue
    .line 355
    invoke-direct {p0}, Landroid/support/v4/app/i;-><init>()V

    .line 228
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/c;->l:Z

    .line 231
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v4/app/c;->o:I

    .line 356
    iput-object p1, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    .line 357
    return-void
.end method

.method private a(Landroid/util/SparseArray;Landroid/util/SparseArray;Z)Landroid/support/v4/app/c$b;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/support/v4/app/d;",
            ">;",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/support/v4/app/d;",
            ">;Z)",
            "Landroid/support/v4/app/c$b;"
        }
    .end annotation

    .prologue
    const/4 v9, 0x1

    const/4 v7, 0x0

    .line 1018
    new-instance v2, Landroid/support/v4/app/c$b;

    invoke-direct {v2, p0}, Landroid/support/v4/app/c$b;-><init>(Landroid/support/v4/app/c;)V

    .line 1023
    new-instance v0, Landroid/view/View;

    iget-object v1, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    iget-object v1, v1, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v0, v2, Landroid/support/v4/app/c$b;->d:Landroid/view/View;

    move v6, v7

    move v8, v7

    .line 1027
    :goto_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 1028
    invoke-virtual {p1, v6}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    move-object v0, p0

    move v3, p3

    move-object v4, p1

    move-object v5, p2

    .line 1029
    invoke-direct/range {v0 .. v5}, Landroid/support/v4/app/c;->a(ILandroid/support/v4/app/c$b;ZLandroid/util/SparseArray;Landroid/util/SparseArray;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v1, v9

    .line 1027
    :goto_1
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    move v8, v1

    goto :goto_0

    .line 1036
    :cond_0
    :goto_2
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 1037
    invoke-virtual {p2, v7}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    .line 1038
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v0, p0

    move v3, p3

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroid/support/v4/app/c;->a(ILandroid/support/v4/app/c$b;ZLandroid/util/SparseArray;Landroid/util/SparseArray;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v8, v9

    .line 1036
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 1045
    :cond_2
    if-nez v8, :cond_3

    .line 1046
    const/4 v2, 0x0

    .line 1049
    :cond_3
    return-object v2

    :cond_4
    move v1, v8

    goto :goto_1
.end method

.method private a(Landroid/support/v4/app/c$b;Landroid/support/v4/app/d;Z)Landroid/support/v4/e/a;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/app/c$b;",
            "Landroid/support/v4/app/d;",
            "Z)",
            "Landroid/support/v4/e/a",
            "<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 1089
    new-instance v0, Landroid/support/v4/e/a;

    invoke-direct {v0}, Landroid/support/v4/e/a;-><init>()V

    .line 1090
    iget-object v1, p0, Landroid/support/v4/app/c;->t:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    .line 5063
    iget-object v1, p2, Landroid/support/v4/app/d;->J:Landroid/view/View;

    .line 1091
    invoke-static {v0, v1}, Landroid/support/v4/app/j;->a(Ljava/util/Map;Landroid/view/View;)V

    .line 1092
    if-eqz p3, :cond_2

    .line 1093
    iget-object v1, p0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;

    .line 5161
    invoke-static {v0, v1}, Landroid/support/v4/e/f;->a(Ljava/util/Map;Ljava/util/Collection;)Z

    .line 1100
    :cond_0
    :goto_0
    if-eqz p3, :cond_3

    .line 1101
    iget-object v1, p2, Landroid/support/v4/app/d;->Y:Landroid/support/v4/app/n;

    if-eqz v1, :cond_1

    .line 1102
    iget-object v1, p2, Landroid/support/v4/app/d;->Y:Landroid/support/v4/app/n;

    .line 1105
    :cond_1
    invoke-direct {p0, p1, v0, v3}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/c$b;Landroid/support/v4/e/a;Z)V

    .line 1114
    :goto_1
    return-object v0

    .line 1095
    :cond_2
    iget-object v1, p0, Landroid/support/v4/app/c;->t:Ljava/util/ArrayList;

    iget-object v2, p0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;

    invoke-static {v1, v2, v0}, Landroid/support/v4/app/c;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/support/v4/e/a;)Landroid/support/v4/e/a;

    move-result-object v0

    goto :goto_0

    .line 1107
    :cond_3
    iget-object v1, p2, Landroid/support/v4/app/d;->Z:Landroid/support/v4/app/n;

    if-eqz v1, :cond_4

    .line 1108
    iget-object v1, p2, Landroid/support/v4/app/d;->Z:Landroid/support/v4/app/n;

    .line 1111
    :cond_4
    invoke-static {p1, v0, v3}, Landroid/support/v4/app/c;->b(Landroid/support/v4/app/c$b;Landroid/support/v4/e/a;Z)V

    goto :goto_1
.end method

.method static synthetic a(Landroid/support/v4/app/c;Landroid/support/v4/app/c$b;ZLandroid/support/v4/app/d;)Landroid/support/v4/e/a;
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 191
    .line 18346
    new-instance v0, Landroid/support/v4/e/a;

    invoke-direct {v0}, Landroid/support/v4/e/a;-><init>()V

    .line 19063
    iget-object v1, p3, Landroid/support/v4/app/d;->J:Landroid/view/View;

    .line 18348
    if-eqz v1, :cond_0

    .line 18349
    iget-object v2, p0, Landroid/support/v4/app/c;->t:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    .line 18350
    invoke-static {v0, v1}, Landroid/support/v4/app/j;->a(Ljava/util/Map;Landroid/view/View;)V

    .line 18351
    if-eqz p2, :cond_2

    .line 18352
    iget-object v1, p0, Landroid/support/v4/app/c;->t:Ljava/util/ArrayList;

    iget-object v2, p0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;

    invoke-static {v1, v2, v0}, Landroid/support/v4/app/c;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/support/v4/e/a;)Landroid/support/v4/e/a;

    move-result-object v0

    .line 18295
    :cond_0
    :goto_0
    if-eqz p2, :cond_3

    .line 18296
    iget-object v1, p3, Landroid/support/v4/app/d;->Z:Landroid/support/v4/app/n;

    if-eqz v1, :cond_1

    .line 18297
    iget-object v1, p3, Landroid/support/v4/app/d;->Z:Landroid/support/v4/app/n;

    .line 18300
    :cond_1
    invoke-direct {p0, p1, v0, v3}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/c$b;Landroid/support/v4/e/a;Z)V

    .line 191
    :goto_1
    return-object v0

    .line 18355
    :cond_2
    iget-object v1, p0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;

    .line 19161
    invoke-static {v0, v1}, Landroid/support/v4/e/f;->a(Ljava/util/Map;Ljava/util/Collection;)Z

    goto :goto_0

    .line 18302
    :cond_3
    iget-object v1, p3, Landroid/support/v4/app/d;->Y:Landroid/support/v4/app/n;

    if-eqz v1, :cond_4

    .line 18303
    iget-object v1, p3, Landroid/support/v4/app/d;->Y:Landroid/support/v4/app/n;

    .line 18306
    :cond_4
    invoke-static {p1, v0, v3}, Landroid/support/v4/app/c;->b(Landroid/support/v4/app/c$b;Landroid/support/v4/e/a;Z)V

    goto :goto_1
.end method

.method private static a(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/support/v4/e/a;)Landroid/support/v4/e/a;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/support/v4/e/a",
            "<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;)",
            "Landroid/support/v4/e/a",
            "<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1321
    invoke-virtual {p2}, Landroid/support/v4/e/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1332
    :goto_0
    return-object p2

    .line 1324
    :cond_0
    new-instance v1, Landroid/support/v4/e/a;

    invoke-direct {v1}, Landroid/support/v4/e/a;-><init>()V

    .line 1325
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 1326
    const/4 v0, 0x0

    move v2, v0

    :goto_1
    if-ge v2, v3, :cond_2

    .line 1327
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/support/v4/e/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 1328
    if-eqz v0, :cond_1

    .line 1329
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v4, v0}, Landroid/support/v4/e/a;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1326
    :cond_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    :cond_2
    move-object p2, v1

    .line 1332
    goto :goto_0
.end method

.method private a(Landroid/support/v4/app/c$b;ILjava/lang/Object;)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 1375
    iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    iget-object v0, v0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    move v1, v2

    .line 1376
    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    iget-object v0, v0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 1377
    iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    iget-object v0, v0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 1378
    iget-object v3, v0, Landroid/support/v4/app/d;->J:Landroid/view/View;

    if-eqz v3, :cond_0

    iget-object v3, v0, Landroid/support/v4/app/d;->I:Landroid/view/ViewGroup;

    if-eqz v3, :cond_0

    iget v3, v0, Landroid/support/v4/app/d;->y:I

    if-ne v3, p2, :cond_0

    .line 1380
    iget-boolean v3, v0, Landroid/support/v4/app/d;->A:Z

    if-eqz v3, :cond_1

    .line 1381
    iget-object v3, p1, Landroid/support/v4/app/c$b;->b:Ljava/util/ArrayList;

    iget-object v4, v0, Landroid/support/v4/app/d;->J:Landroid/view/View;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1382
    iget-object v3, v0, Landroid/support/v4/app/d;->J:Landroid/view/View;

    const/4 v4, 0x1

    invoke-static {p3, v3, v4}, Landroid/support/v4/app/j;->a(Ljava/lang/Object;Landroid/view/View;Z)V

    .line 1384
    iget-object v3, p1, Landroid/support/v4/app/c$b;->b:Ljava/util/ArrayList;

    iget-object v0, v0, Landroid/support/v4/app/d;->J:Landroid/view/View;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1376
    :cond_0
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1387
    :cond_1
    iget-object v3, v0, Landroid/support/v4/app/d;->J:Landroid/view/View;

    invoke-static {p3, v3, v2}, Landroid/support/v4/app/j;->a(Ljava/lang/Object;Landroid/view/View;Z)V

    .line 1389
    iget-object v3, p1, Landroid/support/v4/app/c$b;->b:Ljava/util/ArrayList;

    iget-object v0, v0, Landroid/support/v4/app/d;->J:Landroid/view/View;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1394
    :cond_2
    return-void
.end method

.method private a(Landroid/support/v4/app/c$b;Landroid/support/v4/e/a;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/app/c$b;",
            "Landroid/support/v4/e/a",
            "<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 1422
    iget-object v1, p0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;

    if-nez v1, :cond_1

    move v2, v0

    :goto_0
    move v3, v0

    .line 1423
    :goto_1
    if-ge v3, v2, :cond_3

    .line 1424
    iget-object v0, p0, Landroid/support/v4/app/c;->t:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1425
    iget-object v1, p0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1426
    invoke-virtual {p2, v1}, Landroid/support/v4/e/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 1427
    if-eqz v1, :cond_0

    .line 1428
    invoke-static {v1}, Landroid/support/v4/app/j;->a(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    .line 1429
    if-eqz p3, :cond_2

    .line 1430
    iget-object v4, p1, Landroid/support/v4/app/c$b;->a:Landroid/support/v4/e/a;

    invoke-static {v4, v0, v1}, Landroid/support/v4/app/c;->a(Landroid/support/v4/e/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 1423
    :cond_0
    :goto_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 1422
    :cond_1
    iget-object v1, p0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v2, v1

    goto :goto_0

    .line 1432
    :cond_2
    iget-object v4, p1, Landroid/support/v4/app/c$b;->a:Landroid/support/v4/e/a;

    invoke-static {v4, v1, v0}, Landroid/support/v4/app/c;->a(Landroid/support/v4/e/a;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 1436
    :cond_3
    return-void
.end method

.method static synthetic a(Landroid/support/v4/app/c;Landroid/support/v4/app/c$b;ILjava/lang/Object;)V
    .locals 0

    .prologue
    .line 191
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/c$b;ILjava/lang/Object;)V

    return-void
.end method

.method static synthetic a(Landroid/support/v4/app/c;Landroid/support/v4/e/a;Landroid/support/v4/app/c$b;)V
    .locals 2

    .prologue
    .line 191
    .line 19278
    iget-object v0, p0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/support/v4/e/a;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 19280
    iget-object v0, p0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/support/v4/e/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 19282
    if-eqz v0, :cond_0

    .line 19283
    iget-object v1, p2, Landroid/support/v4/app/c$b;->c:Landroid/support/v4/app/j$a;

    iput-object v0, v1, Landroid/support/v4/app/j$a;->a:Landroid/view/View;

    .line 191
    :cond_0
    return-void
.end method

.method static synthetic a(Landroid/support/v4/app/d;Landroid/support/v4/app/d;ZLandroid/support/v4/e/a;)V
    .locals 2

    .prologue
    .line 191
    .line 20267
    if-eqz p2, :cond_1

    iget-object v0, p1, Landroid/support/v4/app/d;->Y:Landroid/support/v4/app/n;

    .line 20270
    :goto_0
    if-eqz v0, :cond_0

    .line 20271
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p3}, Landroid/support/v4/e/a;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 20272
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p3}, Landroid/support/v4/e/a;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 191
    :cond_0
    return-void

    .line 20267
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/d;->Y:Landroid/support/v4/app/n;

    goto :goto_0
.end method

.method private static a(Landroid/support/v4/e/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/e/a",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 1398
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1399
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/support/v4/e/a;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 1400
    invoke-virtual {p0, v0}, Landroid/support/v4/e/a;->c(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1401
    invoke-virtual {p0, v0, p2}, Landroid/support/v4/e/a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1407
    :cond_0
    :goto_1
    return-void

    .line 1399
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1405
    :cond_2
    invoke-virtual {p0, p1, p2}, Landroid/support/v4/e/a;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1
.end method

.method private static a(Landroid/util/SparseArray;Landroid/support/v4/app/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/support/v4/app/d;",
            ">;",
            "Landroid/support/v4/app/d;",
            ")V"
        }
    .end annotation

    .prologue
    .line 747
    if-eqz p1, :cond_0

    .line 748
    iget v1, p1, Landroid/support/v4/app/d;->y:I

    .line 749
    if-eqz v1, :cond_0

    .line 2761
    iget-boolean v0, p1, Landroid/support/v4/app/d;->A:Z

    .line 749
    if-nez v0, :cond_0

    .line 3703
    iget-object v0, p1, Landroid/support/v4/app/d;->u:Landroid/support/v4/app/e;

    if-eqz v0, :cond_1

    iget-boolean v0, p1, Landroid/support/v4/app/d;->m:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 749
    :goto_0
    if-eqz v0, :cond_0

    .line 4063
    iget-object v0, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    .line 749
    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 751
    invoke-virtual {p0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 754
    :cond_0
    return-void

    .line 3703
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(ILandroid/support/v4/app/c$b;ZLandroid/util/SparseArray;Landroid/util/SparseArray;)Z
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/support/v4/app/c$b;",
            "Z",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/support/v4/app/d;",
            ">;",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/support/v4/app/d;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 1131
    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    iget-object v4, v4, Landroid/support/v4/app/h;->p:Landroid/support/v4/app/f;

    move/from16 v0, p1

    invoke-interface {v4, v0}, Landroid/support/v4/app/f;->a(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup;

    .line 1132
    if-nez v6, :cond_0

    .line 1133
    const/4 v4, 0x0

    .line 1226
    :goto_0
    return v4

    .line 1135
    :cond_0
    move-object/from16 v0, p5

    move/from16 v1, p1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/support/v4/app/d;

    .line 1136
    move-object/from16 v0, p4

    move/from16 v1, p1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/support/v4/app/d;

    .line 6053
    if-nez v11, :cond_2

    .line 6054
    const/16 v20, 0x0

    .line 9070
    :goto_1
    if-eqz v11, :cond_1

    if-nez v12, :cond_5

    .line 9071
    :cond_1
    const/4 v7, 0x0

    .line 12061
    :goto_2
    if-nez v12, :cond_8

    .line 12062
    const/16 v22, 0x0

    .line 1142
    :goto_3
    if-nez v20, :cond_b

    if-nez v7, :cond_b

    if-nez v22, :cond_b

    .line 1144
    const/4 v4, 0x0

    goto :goto_0

    .line 6056
    :cond_2
    if-eqz p3, :cond_4

    .line 6533
    iget-object v4, v11, Landroid/support/v4/app/d;->T:Ljava/lang/Object;

    sget-object v5, Landroid/support/v4/app/d;->a:Ljava/lang/Object;

    if-ne v4, v5, :cond_3

    .line 7500
    iget-object v4, v11, Landroid/support/v4/app/d;->S:Ljava/lang/Object;

    .line 6056
    :goto_4
    invoke-static {v4}, Landroid/support/v4/app/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v20

    goto :goto_1

    .line 6533
    :cond_3
    iget-object v4, v11, Landroid/support/v4/app/d;->T:Ljava/lang/Object;

    goto :goto_4

    .line 8432
    :cond_4
    iget-object v4, v11, Landroid/support/v4/app/d;->Q:Ljava/lang/Object;

    goto :goto_4

    .line 9073
    :cond_5
    if-eqz p3, :cond_7

    .line 9592
    iget-object v4, v12, Landroid/support/v4/app/d;->V:Ljava/lang/Object;

    sget-object v5, Landroid/support/v4/app/d;->a:Ljava/lang/Object;

    if-ne v4, v5, :cond_6

    .line 10560
    iget-object v4, v12, Landroid/support/v4/app/d;->U:Ljava/lang/Object;

    .line 9073
    :goto_5
    invoke-static {v4}, Landroid/support/v4/app/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    goto :goto_2

    .line 9592
    :cond_6
    iget-object v4, v12, Landroid/support/v4/app/d;->V:Ljava/lang/Object;

    goto :goto_5

    .line 11560
    :cond_7
    iget-object v4, v11, Landroid/support/v4/app/d;->U:Ljava/lang/Object;

    goto :goto_5

    .line 12064
    :cond_8
    if-eqz p3, :cond_a

    .line 12466
    iget-object v4, v12, Landroid/support/v4/app/d;->R:Ljava/lang/Object;

    sget-object v5, Landroid/support/v4/app/d;->a:Ljava/lang/Object;

    if-ne v4, v5, :cond_9

    .line 13432
    iget-object v4, v12, Landroid/support/v4/app/d;->Q:Ljava/lang/Object;

    .line 12064
    :goto_6
    invoke-static {v4}, Landroid/support/v4/app/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v22

    goto :goto_3

    .line 12466
    :cond_9
    iget-object v4, v12, Landroid/support/v4/app/d;->R:Ljava/lang/Object;

    goto :goto_6

    .line 13500
    :cond_a
    iget-object v4, v12, Landroid/support/v4/app/d;->S:Ljava/lang/Object;

    goto :goto_6

    .line 1146
    :cond_b
    const/4 v4, 0x0

    .line 1147
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1148
    if-eqz v7, :cond_c

    .line 1149
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    invoke-direct {v0, v1, v12, v2}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/c$b;Landroid/support/v4/app/d;Z)Landroid/support/v4/e/a;

    move-result-object v4

    .line 1150
    invoke-virtual {v4}, Landroid/support/v4/e/a;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_12

    .line 1151
    move-object/from16 v0, p2

    iget-object v5, v0, Landroid/support/v4/app/c$b;->d:Landroid/view/View;

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1157
    :goto_7
    if-eqz p3, :cond_13

    iget-object v5, v12, Landroid/support/v4/app/d;->Y:Landroid/support/v4/app/n;

    .line 1160
    :goto_8
    if-eqz v5, :cond_c

    .line 1161
    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual {v4}, Landroid/support/v4/e/a;->keySet()Ljava/util/Set;

    move-result-object v9

    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1162
    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual {v4}, Landroid/support/v4/e/a;->values()Ljava/util/Collection;

    move-result-object v9

    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1167
    :cond_c
    new-instance v23, Ljava/util/ArrayList;

    invoke-direct/range {v23 .. v23}, Ljava/util/ArrayList;-><init>()V

    .line 14080
    if-eqz v22, :cond_d

    .line 15063
    iget-object v5, v12, Landroid/support/v4/app/d;->J:Landroid/view/View;

    .line 14081
    move-object/from16 v0, v22

    move-object/from16 v1, v23

    invoke-static {v0, v5, v1, v4}, Landroid/support/v4/app/j;->a(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v22

    .line 1172
    :cond_d
    move-object/from16 v0, p0

    iget-object v5, v0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;

    if-eqz v5, :cond_f

    if-eqz v4, :cond_f

    .line 1173
    move-object/from16 v0, p0

    iget-object v5, v0, Landroid/support/v4/app/c;->u:Ljava/util/ArrayList;

    const/4 v9, 0x0

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/support/v4/e/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    .line 1174
    if-eqz v4, :cond_f

    .line 1175
    if-eqz v22, :cond_e

    .line 1176
    move-object/from16 v0, v22

    invoke-static {v0, v4}, Landroid/support/v4/app/j;->a(Ljava/lang/Object;Landroid/view/View;)V

    .line 1178
    :cond_e
    if-eqz v7, :cond_f

    .line 1179
    invoke-static {v7, v4}, Landroid/support/v4/app/j;->a(Ljava/lang/Object;Landroid/view/View;)V

    .line 1185
    :cond_f
    new-instance v18, Landroid/support/v4/app/c$1;

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v11}, Landroid/support/v4/app/c$1;-><init>(Landroid/support/v4/app/c;Landroid/support/v4/app/d;)V

    .line 1193
    if-eqz v7, :cond_10

    .line 15233
    invoke-virtual {v6}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v13

    new-instance v4, Landroid/support/v4/app/c$2;

    move-object/from16 v5, p0

    move-object/from16 v9, p2

    move/from16 v10, p3

    invoke-direct/range {v4 .. v12}, Landroid/support/v4/app/c$2;-><init>(Landroid/support/v4/app/c;Landroid/view/View;Ljava/lang/Object;Ljava/util/ArrayList;Landroid/support/v4/app/c$b;ZLandroid/support/v4/app/d;Landroid/support/v4/app/d;)V

    invoke-virtual {v13, v4}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 1198
    :cond_10
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 1199
    new-instance v17, Landroid/support/v4/e/a;

    invoke-direct/range {v17 .. v17}, Landroid/support/v4/e/a;-><init>()V

    .line 1201
    if-eqz p3, :cond_15

    .line 15641
    iget-object v4, v11, Landroid/support/v4/app/d;->W:Ljava/lang/Boolean;

    if-nez v4, :cond_14

    const/4 v4, 0x1

    .line 1203
    :goto_9
    move-object/from16 v0, v20

    move-object/from16 v1, v22

    invoke-static {v0, v1, v7, v4}, Landroid/support/v4/app/j;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v26

    .line 1206
    if-eqz v26, :cond_11

    .line 1207
    move-object/from16 v0, p2

    iget-object v13, v0, Landroid/support/v4/app/c$b;->d:Landroid/view/View;

    move-object/from16 v0, p2

    iget-object v14, v0, Landroid/support/v4/app/c$b;->c:Landroid/support/v4/app/j$a;

    move-object/from16 v0, p2

    iget-object v15, v0, Landroid/support/v4/app/c$b;->a:Landroid/support/v4/e/a;

    move-object/from16 v9, v20

    move-object v10, v7

    move-object v11, v6

    move-object/from16 v12, v18

    move-object/from16 v18, v8

    invoke-static/range {v9 .. v18}, Landroid/support/v4/app/j;->a(Ljava/lang/Object;Ljava/lang/Object;Landroid/view/View;Landroid/support/v4/app/j$b;Landroid/view/View;Landroid/support/v4/app/j$a;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/ArrayList;)V

    .line 17364
    invoke-virtual {v6}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v4

    new-instance v9, Landroid/support/v4/app/c$3;

    move-object/from16 v10, p0

    move-object v11, v6

    move-object/from16 v12, p2

    move/from16 v13, p1

    move-object/from16 v14, v26

    invoke-direct/range {v9 .. v14}, Landroid/support/v4/app/c$3;-><init>(Landroid/support/v4/app/c;Landroid/view/View;Landroid/support/v4/app/c$b;ILjava/lang/Object;)V

    invoke-virtual {v4, v9}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 1215
    move-object/from16 v0, p2

    iget-object v4, v0, Landroid/support/v4/app/c$b;->d:Landroid/view/View;

    const/4 v5, 0x1

    move-object/from16 v0, v26

    invoke-static {v0, v4, v5}, Landroid/support/v4/app/j;->a(Ljava/lang/Object;Landroid/view/View;Z)V

    .line 1217
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p1

    move-object/from16 v3, v26

    invoke-direct {v0, v1, v2, v3}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/c$b;ILjava/lang/Object;)V

    .line 1219
    move-object/from16 v0, v26

    invoke-static {v6, v0}, Landroid/support/v4/app/j;->a(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 1221
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/support/v4/app/c$b;->d:Landroid/view/View;

    move-object/from16 v19, v0

    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/support/v4/app/c$b;->b:Ljava/util/ArrayList;

    move-object/from16 v27, v0

    move-object/from16 v18, v6

    move-object/from16 v21, v16

    move-object/from16 v24, v7

    move-object/from16 v25, v8

    move-object/from16 v28, v17

    invoke-static/range {v18 .. v28}, Landroid/support/v4/app/j;->a(Landroid/view/View;Landroid/view/View;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/Map;)V

    .line 1226
    :cond_11
    if-eqz v26, :cond_17

    const/4 v4, 0x1

    goto/16 :goto_0

    .line 1153
    :cond_12
    invoke-virtual {v4}, Landroid/support/v4/e/a;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_7

    .line 1157
    :cond_13
    iget-object v5, v11, Landroid/support/v4/app/d;->Y:Landroid/support/v4/app/n;

    goto/16 :goto_8

    .line 15641
    :cond_14
    iget-object v4, v11, Landroid/support/v4/app/d;->W:Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    goto/16 :goto_9

    .line 16617
    :cond_15
    iget-object v4, v11, Landroid/support/v4/app/d;->X:Ljava/lang/Boolean;

    if-nez v4, :cond_16

    const/4 v4, 0x1

    goto/16 :goto_9

    :cond_16
    iget-object v4, v11, Landroid/support/v4/app/d;->X:Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    goto/16 :goto_9

    .line 1226
    :cond_17
    const/4 v4, 0x0

    goto/16 :goto_0
.end method

.method private static b(Landroid/support/v4/app/c$b;Landroid/support/v4/e/a;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/app/c$b;",
            "Landroid/support/v4/e/a",
            "<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .line 1440
    invoke-virtual {p1}, Landroid/support/v4/e/a;->size()I

    move-result v3

    .line 1441
    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-ge v2, v3, :cond_1

    .line 1442
    invoke-virtual {p1, v2}, Landroid/support/v4/e/a;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1443
    invoke-virtual {p1, v2}, Landroid/support/v4/e/a;->c(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-static {v1}, Landroid/support/v4/app/j;->a(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    .line 1444
    if-eqz p2, :cond_0

    .line 1445
    iget-object v4, p0, Landroid/support/v4/app/c$b;->a:Landroid/support/v4/e/a;

    invoke-static {v4, v0, v1}, Landroid/support/v4/app/c;->a(Landroid/support/v4/e/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 1441
    :goto_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 1447
    :cond_0
    iget-object v4, p0, Landroid/support/v4/app/c$b;->a:Landroid/support/v4/e/a;

    invoke-static {v4, v1, v0}, Landroid/support/v4/app/c;->a(Landroid/support/v4/e/a;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 1450
    :cond_1
    return-void
.end method

.method private static b(Landroid/util/SparseArray;Landroid/support/v4/app/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/support/v4/app/d;",
            ">;",
            "Landroid/support/v4/app/d;",
            ")V"
        }
    .end annotation

    .prologue
    .line 757
    if-eqz p1, :cond_0

    .line 758
    iget v0, p1, Landroid/support/v4/app/d;->y:I

    .line 759
    if-eqz v0, :cond_0

    .line 760
    invoke-virtual {p0, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 763
    :cond_0
    return-void
.end method

.method private b(Landroid/util/SparseArray;Landroid/util/SparseArray;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/support/v4/app/d;",
            ">;",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/support/v4/app/d;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 776
    iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    iget-object v0, v0, Landroid/support/v4/app/h;->p:Landroid/support/v4/app/f;

    invoke-interface {v0}, Landroid/support/v4/app/f;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 821
    :cond_0
    return-void

    .line 779
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/c$a;

    move-object v3, v0

    .line 780
    :goto_0
    if-eqz v3, :cond_0

    .line 781
    iget v0, v3, Landroid/support/v4/app/c$a;->c:I

    packed-switch v0, :pswitch_data_0

    .line 819
    :goto_1
    iget-object v0, v3, Landroid/support/v4/app/c$a;->a:Landroid/support/v4/app/c$a;

    move-object v3, v0

    goto :goto_0

    .line 783
    :pswitch_0
    iget-object v0, v3, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    invoke-static {p2, v0}, Landroid/support/v4/app/c;->b(Landroid/util/SparseArray;Landroid/support/v4/app/d;)V

    goto :goto_1

    .line 786
    :pswitch_1
    iget-object v1, v3, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    .line 787
    iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    iget-object v0, v0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    .line 788
    const/4 v0, 0x0

    move-object v2, v1

    move v1, v0

    :goto_2
    iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    iget-object v0, v0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_6

    .line 789
    iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    iget-object v0, v0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 790
    if-eqz v2, :cond_2

    iget v4, v0, Landroid/support/v4/app/d;->y:I

    iget v5, v2, Landroid/support/v4/app/d;->y:I

    if-ne v4, v5, :cond_3

    .line 791
    :cond_2
    if-ne v0, v2, :cond_4

    .line 792
    const/4 v2, 0x0

    .line 788
    :cond_3
    :goto_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    .line 794
    :cond_4
    invoke-static {p1, v0}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/support/v4/app/d;)V

    goto :goto_3

    :cond_5
    move-object v2, v1

    .line 799
    :cond_6
    invoke-static {p2, v2}, Landroid/support/v4/app/c;->b(Landroid/util/SparseArray;Landroid/support/v4/app/d;)V

    goto :goto_1

    .line 803
    :pswitch_2
    iget-object v0, v3, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    invoke-static {p1, v0}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/support/v4/app/d;)V

    goto :goto_1

    .line 806
    :pswitch_3
    iget-object v0, v3, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    invoke-static {p1, v0}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/support/v4/app/d;)V

    goto :goto_1

    .line 809
    :pswitch_4
    iget-object v0, v3, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    invoke-static {p2, v0}, Landroid/support/v4/app/c;->b(Landroid/util/SparseArray;Landroid/support/v4/app/d;)V

    goto :goto_1

    .line 812
    :pswitch_5
    iget-object v0, v3, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    invoke-static {p1, v0}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/support/v4/app/d;)V

    goto :goto_1

    .line 815
    :pswitch_6
    iget-object v0, v3, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    invoke-static {p2, v0}, Landroid/support/v4/app/c;->b(Landroid/util/SparseArray;Landroid/support/v4/app/d;)V

    goto :goto_1

    .line 781
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method


# virtual methods
.method public final a(Landroid/support/v4/app/c$b;Landroid/util/SparseArray;Landroid/util/SparseArray;)Landroid/support/v4/app/c$b;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/app/c$b;",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/support/v4/app/d;",
            ">;",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/support/v4/app/d;",
            ">;)",
            "Landroid/support/v4/app/c$b;"
        }
    .end annotation

    .prologue
    const/4 v10, 0x0

    const/4 v9, 0x1

    const/4 v8, -0x1

    const/4 v2, 0x0

    .line 874
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_0

    .line 875
    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "popFromBackStack: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 876
    new-instance v0, Landroid/support/v4/e/d;

    const-string v1, "FragmentManager"

    invoke-direct {v0, v1}, Landroid/support/v4/e/d;-><init>(Ljava/lang/String;)V

    .line 877
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 878
    const-string v0, "  "

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/c;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V

    .line 882
    :cond_0
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 883
    :cond_1
    invoke-direct {p0, p2, p3, v9}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/util/SparseArray;Z)Landroid/support/v4/app/c$b;

    move-result-object p1

    .line 889
    :cond_2
    invoke-virtual {p0, v8}, Landroid/support/v4/app/c;->a(I)V

    .line 891
    if-eqz p1, :cond_3

    move v6, v2

    .line 892
    :goto_0
    if-eqz p1, :cond_4

    move v1, v2

    .line 893
    :goto_1
    iget-object v0, p0, Landroid/support/v4/app/c;->c:Landroid/support/v4/app/c$a;

    move-object v5, v0

    .line 894
    :goto_2
    if-eqz v5, :cond_9

    .line 895
    if-eqz p1, :cond_5

    move v4, v2

    .line 896
    :goto_3
    if-eqz p1, :cond_6

    move v0, v2

    .line 897
    :goto_4
    iget v3, v5, Landroid/support/v4/app/c$a;->c:I

    packed-switch v3, :pswitch_data_0

    .line 949
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown cmd: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v5, Landroid/support/v4/app/c$a;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 891
    :cond_3
    iget v0, p0, Landroid/support/v4/app/c;->j:I

    move v6, v0

    goto :goto_0

    .line 892
    :cond_4
    iget v0, p0, Landroid/support/v4/app/c;->i:I

    move v1, v0

    goto :goto_1

    .line 895
    :cond_5
    iget v0, v5, Landroid/support/v4/app/c$a;->g:I

    move v4, v0

    goto :goto_3

    .line 896
    :cond_6
    iget v0, v5, Landroid/support/v4/app/c$a;->h:I

    goto :goto_4

    .line 899
    :pswitch_0
    iget-object v3, v5, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    .line 900
    iput v0, v3, Landroid/support/v4/app/d;->H:I

    .line 901
    iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    invoke-static {v1}, Landroid/support/v4/app/h;->b(I)I

    move-result v4

    invoke-virtual {v0, v3, v4, v6}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;II)V

    .line 953
    :cond_7
    :goto_5
    iget-object v0, v5, Landroid/support/v4/app/c$a;->b:Landroid/support/v4/app/c$a;

    move-object v5, v0

    .line 954
    goto :goto_2

    .line 905
    :pswitch_1
    iget-object v3, v5, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    .line 906
    if-eqz v3, :cond_8

    .line 907
    iput v0, v3, Landroid/support/v4/app/d;->H:I

    .line 908
    iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    invoke-static {v1}, Landroid/support/v4/app/h;->b(I)I

    move-result v7

    invoke-virtual {v0, v3, v7, v6}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;II)V

    .line 911
    :cond_8
    iget-object v0, v5, Landroid/support/v4/app/c$a;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_7

    move v3, v2

    .line 912
    :goto_6
    iget-object v0, v5, Landroid/support/v4/app/c$a;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_7

    .line 913
    iget-object v0, v5, Landroid/support/v4/app/c$a;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 914
    iput v4, v0, Landroid/support/v4/app/d;->H:I

    .line 915
    iget-object v7, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    invoke-virtual {v7, v0, v2}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;Z)V

    .line 912
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_6

    .line 920
    :pswitch_2
    iget-object v0, v5, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    .line 921
    iput v4, v0, Landroid/support/v4/app/d;->H:I

    .line 922
    iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    invoke-virtual {v3, v0, v2}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;Z)V

    goto :goto_5

    .line 925
    :pswitch_3
    iget-object v0, v5, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    .line 926
    iput v4, v0, Landroid/support/v4/app/d;->H:I

    .line 927
    iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    invoke-static {v1}, Landroid/support/v4/app/h;->b(I)I

    move-result v4

    invoke-virtual {v3, v0, v4, v6}, Landroid/support/v4/app/h;->c(Landroid/support/v4/app/d;II)V

    goto :goto_5

    .line 931
    :pswitch_4
    iget-object v3, v5, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    .line 932
    iput v0, v3, Landroid/support/v4/app/d;->H:I

    .line 933
    iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    invoke-static {v1}, Landroid/support/v4/app/h;->b(I)I

    move-result v4

    invoke-virtual {v0, v3, v4, v6}, Landroid/support/v4/app/h;->b(Landroid/support/v4/app/d;II)V

    goto :goto_5

    .line 937
    :pswitch_5
    iget-object v0, v5, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    .line 938
    iput v4, v0, Landroid/support/v4/app/d;->H:I

    .line 939
    iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    invoke-static {v1}, Landroid/support/v4/app/h;->b(I)I

    move-result v4

    invoke-virtual {v3, v0, v4, v6}, Landroid/support/v4/app/h;->e(Landroid/support/v4/app/d;II)V

    goto :goto_5

    .line 943
    :pswitch_6
    iget-object v0, v5, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    .line 944
    iput v4, v0, Landroid/support/v4/app/d;->H:I

    .line 945
    iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    invoke-static {v1}, Landroid/support/v4/app/h;->b(I)I

    move-result v4

    invoke-virtual {v3, v0, v4, v6}, Landroid/support/v4/app/h;->d(Landroid/support/v4/app/d;II)V

    goto :goto_5

    .line 957
    :cond_9
    iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    iget-object v2, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    iget v2, v2, Landroid/support/v4/app/h;->n:I

    invoke-static {v1}, Landroid/support/v4/app/h;->b(I)I

    move-result v1

    invoke-virtual {v0, v2, v1, v6, v9}, Landroid/support/v4/app/h;->a(IIIZ)V

    .line 962
    iget v0, p0, Landroid/support/v4/app/c;->o:I

    if-ltz v0, :cond_c

    .line 963
    iget-object v1, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    iget v0, p0, Landroid/support/v4/app/c;->o:I

    .line 4446
    monitor-enter v1

    .line 4447
    :try_start_0
    iget-object v2, v1, Landroid/support/v4/app/h;->k:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 4448
    iget-object v2, v1, Landroid/support/v4/app/h;->l:Ljava/util/ArrayList;

    if-nez v2, :cond_a

    .line 4449
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Landroid/support/v4/app/h;->l:Ljava/util/ArrayList;

    .line 4451
    :cond_a
    sget-boolean v2, Landroid/support/v4/app/h;->a:Z

    if-eqz v2, :cond_b

    const-string v2, "FragmentManager"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Freeing back stack index "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 4452
    :cond_b
    iget-object v2, v1, Landroid/support/v4/app/h;->l:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4453
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 964
    iput v8, p0, Landroid/support/v4/app/c;->o:I

    .line 966
    :cond_c
    return-object v10

    .line 4453
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 897
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method final a(I)V
    .locals 6

    .prologue
    .line 590
    iget-boolean v0, p0, Landroid/support/v4/app/c;->k:Z

    if-nez v0, :cond_1

    .line 612
    :cond_0
    return-void

    .line 593
    :cond_1
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_2

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bump nesting in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " by "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 595
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/c$a;

    move-object v2, v0

    .line 596
    :goto_0
    if-eqz v2, :cond_0

    .line 597
    iget-object v0, v2, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    if-eqz v0, :cond_3

    .line 598
    iget-object v0, v2, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    iget v1, v0, Landroid/support/v4/app/d;->s:I

    add-int/2addr v1, p1

    iput v1, v0, Landroid/support/v4/app/d;->s:I

    .line 599
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_3

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Bump nesting of "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v2, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " to "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, v2, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    iget v3, v3, Landroid/support/v4/app/d;->s:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 602
    :cond_3
    iget-object v0, v2, Landroid/support/v4/app/c$a;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    .line 603
    iget-object v0, v2, Landroid/support/v4/app/c$a;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_1
    if-ltz v1, :cond_5

    .line 604
    iget-object v0, v2, Landroid/support/v4/app/c$a;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 605
    iget v3, v0, Landroid/support/v4/app/d;->s:I

    add-int/2addr v3, p1

    iput v3, v0, Landroid/support/v4/app/d;->s:I

    .line 606
    sget-boolean v3, Landroid/support/v4/app/h;->a:Z

    if-eqz v3, :cond_4

    const-string v3, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Bump nesting of "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " to "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v0, v0, Landroid/support/v4/app/d;->s:I

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 603
    :cond_4
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_1

    .line 610
    :cond_5
    iget-object v0, v2, Landroid/support/v4/app/c$a;->a:Landroid/support/v4/app/c$a;

    move-object v2, v0

    goto :goto_0
.end method

.method public final a(Landroid/util/SparseArray;Landroid/util/SparseArray;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/support/v4/app/d;",
            ">;",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/support/v4/app/d;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 834
    iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    iget-object v0, v0, Landroid/support/v4/app/h;->p:Landroid/support/v4/app/f;

    invoke-interface {v0}, Landroid/support/v4/app/f;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 870
    :cond_0
    return-void

    .line 837
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/c$a;

    move-object v2, v0

    .line 838
    :goto_0
    if-eqz v2, :cond_0

    .line 839
    iget v0, v2, Landroid/support/v4/app/c$a;->c:I

    packed-switch v0, :pswitch_data_0

    .line 868
    :goto_1
    iget-object v0, v2, Landroid/support/v4/app/c$a;->a:Landroid/support/v4/app/c$a;

    move-object v2, v0

    goto :goto_0

    .line 841
    :pswitch_0
    iget-object v0, v2, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    invoke-static {p1, v0}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/support/v4/app/d;)V

    goto :goto_1

    .line 844
    :pswitch_1
    iget-object v0, v2, Landroid/support/v4/app/c$a;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 845
    iget-object v0, v2, Landroid/support/v4/app/c$a;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_2
    if-ltz v1, :cond_2

    .line 846
    iget-object v0, v2, Landroid/support/v4/app/c$a;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    invoke-static {p2, v0}, Landroid/support/v4/app/c;->b(Landroid/util/SparseArray;Landroid/support/v4/app/d;)V

    .line 845
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_2

    .line 849
    :cond_2
    iget-object v0, v2, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    invoke-static {p1, v0}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/support/v4/app/d;)V

    goto :goto_1

    .line 852
    :pswitch_2
    iget-object v0, v2, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    invoke-static {p2, v0}, Landroid/support/v4/app/c;->b(Landroid/util/SparseArray;Landroid/support/v4/app/d;)V

    goto :goto_1

    .line 855
    :pswitch_3
    iget-object v0, v2, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    invoke-static {p2, v0}, Landroid/support/v4/app/c;->b(Landroid/util/SparseArray;Landroid/support/v4/app/d;)V

    goto :goto_1

    .line 858
    :pswitch_4
    iget-object v0, v2, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    invoke-static {p1, v0}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/support/v4/app/d;)V

    goto :goto_1

    .line 861
    :pswitch_5
    iget-object v0, v2, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    invoke-static {p2, v0}, Landroid/support/v4/app/c;->b(Landroid/util/SparseArray;Landroid/support/v4/app/d;)V

    goto :goto_1

    .line 864
    :pswitch_6
    iget-object v0, v2, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    invoke-static {p1, v0}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/support/v4/app/d;)V

    goto :goto_1

    .line 839
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public final a(Ljava/lang/String;Ljava/io/PrintWriter;)V
    .locals 1

    .prologue
    .line 259
    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/app/c;->a(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 260
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/io/PrintWriter;Z)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 263
    if-eqz p3, :cond_8

    .line 264
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mName="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/app/c;->m:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 265
    const-string v0, " mIndex="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/app/c;->o:I

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(I)V

    .line 266
    const-string v0, " mCommitted="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/c;->n:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 267
    iget v0, p0, Landroid/support/v4/app/c;->i:I

    if-eqz v0, :cond_0

    .line 268
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mTransition=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 269
    iget v0, p0, Landroid/support/v4/app/c;->i:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 270
    const-string v0, " mTransitionStyle=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 271
    iget v0, p0, Landroid/support/v4/app/c;->j:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 273
    :cond_0
    iget v0, p0, Landroid/support/v4/app/c;->e:I

    if-nez v0, :cond_1

    iget v0, p0, Landroid/support/v4/app/c;->f:I

    if-eqz v0, :cond_2

    .line 274
    :cond_1
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mEnterAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 275
    iget v0, p0, Landroid/support/v4/app/c;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 276
    const-string v0, " mExitAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 277
    iget v0, p0, Landroid/support/v4/app/c;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 279
    :cond_2
    iget v0, p0, Landroid/support/v4/app/c;->g:I

    if-nez v0, :cond_3

    iget v0, p0, Landroid/support/v4/app/c;->h:I

    if-eqz v0, :cond_4

    .line 280
    :cond_3
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mPopEnterAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 281
    iget v0, p0, Landroid/support/v4/app/c;->g:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 282
    const-string v0, " mPopExitAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 283
    iget v0, p0, Landroid/support/v4/app/c;->h:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 285
    :cond_4
    iget v0, p0, Landroid/support/v4/app/c;->p:I

    if-nez v0, :cond_5

    iget-object v0, p0, Landroid/support/v4/app/c;->q:Ljava/lang/CharSequence;

    if-eqz v0, :cond_6

    .line 286
    :cond_5
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mBreadCrumbTitleRes=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 287
    iget v0, p0, Landroid/support/v4/app/c;->p:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 288
    const-string v0, " mBreadCrumbTitleText="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 289
    iget-object v0, p0, Landroid/support/v4/app/c;->q:Ljava/lang/CharSequence;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 291
    :cond_6
    iget v0, p0, Landroid/support/v4/app/c;->r:I

    if-nez v0, :cond_7

    iget-object v0, p0, Landroid/support/v4/app/c;->s:Ljava/lang/CharSequence;

    if-eqz v0, :cond_8

    .line 292
    :cond_7
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mBreadCrumbShortTitleRes=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 293
    iget v0, p0, Landroid/support/v4/app/c;->r:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 294
    const-string v0, " mBreadCrumbShortTitleText="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 295
    iget-object v0, p0, Landroid/support/v4/app/c;->s:Ljava/lang/CharSequence;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 299
    :cond_8
    iget-object v0, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/c$a;

    if-eqz v0, :cond_10

    .line 300
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Operations:"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 301
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "    "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 302
    iget-object v0, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/c$a;

    move v2, v1

    move-object v3, v0

    .line 304
    :goto_0
    if-eqz v3, :cond_10

    .line 306
    iget v0, v3, Landroid/support/v4/app/c$a;->c:I

    packed-switch v0, :pswitch_data_0

    .line 315
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "cmd="

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, v3, Landroid/support/v4/app/c$a;->c:I

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 317
    :goto_1
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  Op #"

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(I)V

    .line 318
    const-string v5, ": "

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 319
    const-string v0, " "

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, v3, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 320
    if-eqz p3, :cond_c

    .line 321
    iget v0, v3, Landroid/support/v4/app/c$a;->e:I

    if-nez v0, :cond_9

    iget v0, v3, Landroid/support/v4/app/c$a;->f:I

    if-eqz v0, :cond_a

    .line 322
    :cond_9
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "enterAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 323
    iget v0, v3, Landroid/support/v4/app/c$a;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 324
    const-string v0, " exitAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 325
    iget v0, v3, Landroid/support/v4/app/c$a;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 327
    :cond_a
    iget v0, v3, Landroid/support/v4/app/c$a;->g:I

    if-nez v0, :cond_b

    iget v0, v3, Landroid/support/v4/app/c$a;->h:I

    if-eqz v0, :cond_c

    .line 328
    :cond_b
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "popEnterAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 329
    iget v0, v3, Landroid/support/v4/app/c$a;->g:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 330
    const-string v0, " popExitAnim=#"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 331
    iget v0, v3, Landroid/support/v4/app/c$a;->h:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 334
    :cond_c
    iget-object v0, v3, Landroid/support/v4/app/c$a;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_f

    iget-object v0, v3, Landroid/support/v4/app/c$a;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_f

    move v0, v1

    .line 335
    :goto_2
    iget-object v5, v3, Landroid/support/v4/app/c$a;->i:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v0, v5, :cond_f

    .line 336
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 337
    iget-object v5, v3, Landroid/support/v4/app/c$a;->i:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_d

    .line 338
    const-string v5, "Removed: "

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 346
    :goto_3
    iget-object v5, v3, Landroid/support/v4/app/c$a;->i:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 335
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 307
    :pswitch_0
    const-string v0, "NULL"

    goto/16 :goto_1

    .line 308
    :pswitch_1
    const-string v0, "ADD"

    goto/16 :goto_1

    .line 309
    :pswitch_2
    const-string v0, "REPLACE"

    goto/16 :goto_1

    .line 310
    :pswitch_3
    const-string v0, "REMOVE"

    goto/16 :goto_1

    .line 311
    :pswitch_4
    const-string v0, "HIDE"

    goto/16 :goto_1

    .line 312
    :pswitch_5
    const-string v0, "SHOW"

    goto/16 :goto_1

    .line 313
    :pswitch_6
    const-string v0, "DETACH"

    goto/16 :goto_1

    .line 314
    :pswitch_7
    const-string v0, "ATTACH"

    goto/16 :goto_1

    .line 340
    :cond_d
    if-nez v0, :cond_e

    .line 341
    const-string v5, "Removed:"

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 343
    :cond_e
    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(I)V

    .line 344
    const-string v5, ": "

    invoke-virtual {p2, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    goto :goto_3

    .line 349
    :cond_f
    iget-object v3, v3, Landroid/support/v4/app/c$a;->a:Landroid/support/v4/app/c$a;

    .line 350
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    .line 351
    goto/16 :goto_0

    .line 353
    :cond_10
    return-void

    .line 306
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public final run()V
    .locals 15

    .prologue
    const/4 v6, 0x0

    const/4 v14, 0x1

    const/4 v2, 0x0

    .line 641
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Run: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 643
    :cond_0
    iget-boolean v0, p0, Landroid/support/v4/app/c;->k:Z

    if-eqz v0, :cond_1

    .line 644
    iget v0, p0, Landroid/support/v4/app/c;->o:I

    if-gez v0, :cond_1

    .line 645
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "addToBackStack() called after commit()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 649
    :cond_1
    invoke-virtual {p0, v14}, Landroid/support/v4/app/c;->a(I)V

    .line 654
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_12

    .line 655
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 656
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 658
    invoke-direct {p0, v0, v1}, Landroid/support/v4/app/c;->b(Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    .line 660
    invoke-direct {p0, v0, v1, v2}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/util/SparseArray;Z)Landroid/support/v4/app/c$b;

    move-result-object v0

    move-object v10, v0

    .line 663
    :goto_0
    if-eqz v10, :cond_2

    move v9, v2

    .line 664
    :goto_1
    if-eqz v10, :cond_3

    move v1, v2

    .line 665
    :goto_2
    iget-object v0, p0, Landroid/support/v4/app/c;->b:Landroid/support/v4/app/c$a;

    move-object v8, v0

    .line 666
    :goto_3
    if-eqz v8, :cond_f

    .line 667
    if-eqz v10, :cond_4

    move v7, v2

    .line 668
    :goto_4
    if-eqz v10, :cond_5

    move v3, v2

    .line 669
    :goto_5
    iget v0, v8, Landroid/support/v4/app/c$a;->c:I

    packed-switch v0, :pswitch_data_0

    .line 732
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown cmd: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v8, Landroid/support/v4/app/c$a;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 663
    :cond_2
    iget v0, p0, Landroid/support/v4/app/c;->j:I

    move v9, v0

    goto :goto_1

    .line 664
    :cond_3
    iget v0, p0, Landroid/support/v4/app/c;->i:I

    move v1, v0

    goto :goto_2

    .line 667
    :cond_4
    iget v0, v8, Landroid/support/v4/app/c$a;->e:I

    move v7, v0

    goto :goto_4

    .line 668
    :cond_5
    iget v0, v8, Landroid/support/v4/app/c$a;->f:I

    move v3, v0

    goto :goto_5

    .line 671
    :pswitch_0
    iget-object v0, v8, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    .line 672
    iput v7, v0, Landroid/support/v4/app/d;->H:I

    .line 673
    iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    invoke-virtual {v3, v0, v2}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;Z)V

    .line 736
    :cond_6
    :goto_6
    iget-object v0, v8, Landroid/support/v4/app/c$a;->a:Landroid/support/v4/app/c$a;

    move-object v8, v0

    .line 737
    goto :goto_3

    .line 676
    :pswitch_1
    iget-object v0, v8, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    .line 677
    iget-object v4, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    iget-object v4, v4, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    if-eqz v4, :cond_d

    move v4, v2

    move-object v5, v0

    .line 678
    :goto_7
    iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    iget-object v0, v0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_e

    .line 679
    iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    iget-object v0, v0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 680
    sget-boolean v11, Landroid/support/v4/app/h;->a:Z

    if-eqz v11, :cond_7

    const-string v11, "FragmentManager"

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "OP_REPLACE: adding="

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, " old="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 682
    :cond_7
    if-eqz v5, :cond_8

    iget v11, v0, Landroid/support/v4/app/d;->y:I

    iget v12, v5, Landroid/support/v4/app/d;->y:I

    if-ne v11, v12, :cond_9

    .line 683
    :cond_8
    if-ne v0, v5, :cond_a

    .line 684
    iput-object v6, v8, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    move-object v5, v6

    .line 678
    :cond_9
    :goto_8
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_7

    .line 686
    :cond_a
    iget-object v11, v8, Landroid/support/v4/app/c$a;->i:Ljava/util/ArrayList;

    if-nez v11, :cond_b

    .line 687
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v8, Landroid/support/v4/app/c$a;->i:Ljava/util/ArrayList;

    .line 689
    :cond_b
    iget-object v11, v8, Landroid/support/v4/app/c$a;->i:Ljava/util/ArrayList;

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 690
    iput v3, v0, Landroid/support/v4/app/d;->H:I

    .line 691
    iget-boolean v11, p0, Landroid/support/v4/app/c;->k:Z

    if-eqz v11, :cond_c

    .line 692
    iget v11, v0, Landroid/support/v4/app/d;->s:I

    add-int/lit8 v11, v11, 0x1

    iput v11, v0, Landroid/support/v4/app/d;->s:I

    .line 693
    sget-boolean v11, Landroid/support/v4/app/h;->a:Z

    if-eqz v11, :cond_c

    const-string v11, "FragmentManager"

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "Bump nesting of "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, " to "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    iget v13, v0, Landroid/support/v4/app/d;->s:I

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 696
    :cond_c
    iget-object v11, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    invoke-virtual {v11, v0, v1, v9}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;II)V

    goto :goto_8

    :cond_d
    move-object v5, v0

    .line 701
    :cond_e
    if-eqz v5, :cond_6

    .line 702
    iput v7, v5, Landroid/support/v4/app/d;->H:I

    .line 703
    iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    invoke-virtual {v0, v5, v2}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;Z)V

    goto/16 :goto_6

    .line 707
    :pswitch_2
    iget-object v0, v8, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    .line 708
    iput v3, v0, Landroid/support/v4/app/d;->H:I

    .line 709
    iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    invoke-virtual {v3, v0, v1, v9}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;II)V

    goto/16 :goto_6

    .line 712
    :pswitch_3
    iget-object v0, v8, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    .line 713
    iput v3, v0, Landroid/support/v4/app/d;->H:I

    .line 714
    iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    invoke-virtual {v3, v0, v1, v9}, Landroid/support/v4/app/h;->b(Landroid/support/v4/app/d;II)V

    goto/16 :goto_6

    .line 717
    :pswitch_4
    iget-object v0, v8, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    .line 718
    iput v7, v0, Landroid/support/v4/app/d;->H:I

    .line 719
    iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    invoke-virtual {v3, v0, v1, v9}, Landroid/support/v4/app/h;->c(Landroid/support/v4/app/d;II)V

    goto/16 :goto_6

    .line 722
    :pswitch_5
    iget-object v0, v8, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    .line 723
    iput v3, v0, Landroid/support/v4/app/d;->H:I

    .line 724
    iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    invoke-virtual {v3, v0, v1, v9}, Landroid/support/v4/app/h;->d(Landroid/support/v4/app/d;II)V

    goto/16 :goto_6

    .line 727
    :pswitch_6
    iget-object v0, v8, Landroid/support/v4/app/c$a;->d:Landroid/support/v4/app/d;

    .line 728
    iput v7, v0, Landroid/support/v4/app/d;->H:I

    .line 729
    iget-object v3, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    invoke-virtual {v3, v0, v1, v9}, Landroid/support/v4/app/h;->e(Landroid/support/v4/app/d;II)V

    goto/16 :goto_6

    .line 739
    :cond_f
    iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    iget-object v2, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    iget v2, v2, Landroid/support/v4/app/h;->n:I

    invoke-virtual {v0, v2, v1, v9, v14}, Landroid/support/v4/app/h;->a(IIIZ)V

    .line 741
    iget-boolean v0, p0, Landroid/support/v4/app/c;->k:Z

    if-eqz v0, :cond_11

    .line 742
    iget-object v0, p0, Landroid/support/v4/app/c;->a:Landroid/support/v4/app/h;

    .line 2521
    iget-object v1, v0, Landroid/support/v4/app/h;->i:Ljava/util/ArrayList;

    if-nez v1, :cond_10

    .line 2522
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Landroid/support/v4/app/h;->i:Ljava/util/ArrayList;

    .line 2524
    :cond_10
    iget-object v1, v0, Landroid/support/v4/app/h;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2525
    invoke-virtual {v0}, Landroid/support/v4/app/h;->b()V

    .line 744
    :cond_11
    return-void

    :cond_12
    move-object v10, v6

    goto/16 :goto_0

    .line 669
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 243
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 244
    const-string v1, "BackStackEntry{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    iget v1, p0, Landroid/support/v4/app/c;->o:I

    if-ltz v1, :cond_0

    .line 247
    const-string v1, " #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    iget v1, p0, Landroid/support/v4/app/c;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 250
    :cond_0
    iget-object v1, p0, Landroid/support/v4/app/c;->m:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 251
    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    iget-object v1, p0, Landroid/support/v4/app/c;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    :cond_1
    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
