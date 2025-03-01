.class final Lcom/saterskog/cell_lab/a$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/a$1$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/l;

.field final synthetic b:I

.field final synthetic c:Lcom/saterskog/cell_lab/a$1$1;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/a$1$1;Lcom/saterskog/cell_lab/l;I)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lcom/saterskog/cell_lab/a$1$1$1;->c:Lcom/saterskog/cell_lab/a$1$1;

    iput-object p2, p0, Lcom/saterskog/cell_lab/a$1$1$1;->a:Lcom/saterskog/cell_lab/l;

    iput p3, p0, Lcom/saterskog/cell_lab/a$1$1$1;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 13

    .prologue
    .line 117
    iget-object v11, p0, Lcom/saterskog/cell_lab/a$1$1$1;->a:Lcom/saterskog/cell_lab/l;

    iget v1, p0, Lcom/saterskog/cell_lab/a$1$1$1;->b:I

    .line 1323
    :try_start_0
    const-string v0, "Unknown amount"

    .line 1324
    iget-object v2, v11, Lcom/saterskog/cell_lab/l;->k:[Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 1325
    iget-object v0, v11, Lcom/saterskog/cell_lab/l;->k:[Ljava/lang/String;

    aget-object v0, v0, v1

    .line 1326
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/text/DateFormat;->getDateTimeInstance()Ljava/text/DateFormat;

    move-result-object v3

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1327
    iget-object v12, v11, Lcom/saterskog/cell_lab/l;->b:Lcom/saterskog/a/b;

    iget-object v0, v11, Lcom/saterskog/cell_lab/l;->i:[Ljava/lang/String;

    aget-object v3, v0, v1

    add-int/lit8 v6, v1, 0x1

    .line 1398
    const-string v4, "inapp"

    .line 1435
    invoke-virtual {v12}, Lcom/saterskog/a/b;->b()V

    .line 1436
    const-string v0, "launchPurchaseFlow"

    invoke-virtual {v12, v0}, Lcom/saterskog/a/b;->a(Ljava/lang/String;)V

    .line 1437
    const-string v0, "launchPurchaseFlow"

    invoke-virtual {v12, v0}, Lcom/saterskog/a/b;->b(Ljava/lang/String;)V

    .line 1440
    const-string v0, "subs"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, v12, Lcom/saterskog/a/b;->f:Z

    if-nez v0, :cond_2

    .line 1441
    new-instance v0, Lcom/saterskog/a/c;

    const/16 v1, -0x3f1

    const-string v2, "Subscriptions are not available."

    invoke-direct {v0, v1, v2}, Lcom/saterskog/a/c;-><init>(ILjava/lang/String;)V

    .line 1443
    invoke-virtual {v12}, Lcom/saterskog/a/b;->c()V

    .line 1444
    if-eqz v11, :cond_1

    const/4 v1, 0x0

    invoke-interface {v11, v0, v1}, Lcom/saterskog/a/b$d;->a(Lcom/saterskog/a/c;Lcom/saterskog/a/e;)V
    :try_end_0
    .catch Lcom/saterskog/a/b$a; {:try_start_0 .. :try_end_0} :catch_1

    .line 1501
    :cond_1
    :goto_0
    return-void

    .line 1449
    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Constructing buy intent for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", item type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 1453
    iget-object v0, v12, Lcom/saterskog/a/b;->k:Lcom/a/a/a/a;

    const/4 v1, 0x3

    iget-object v2, v12, Lcom/saterskog/a/b;->j:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-interface/range {v0 .. v5}, Lcom/a/a/a/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 1467
    invoke-virtual {v12, v0}, Lcom/saterskog/a/b;->a(Landroid/os/Bundle;)I

    move-result v1

    .line 1468
    if-eqz v1, :cond_3

    .line 1469
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Unable to buy item, Error response: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/saterskog/a/b;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/saterskog/a/b;->d(Ljava/lang/String;)V

    .line 1470
    invoke-virtual {v12}, Lcom/saterskog/a/b;->c()V

    .line 1471
    new-instance v0, Lcom/saterskog/a/c;

    const-string v2, "Unable to buy item"

    invoke-direct {v0, v1, v2}, Lcom/saterskog/a/c;-><init>(ILjava/lang/String;)V

    .line 1472
    if-eqz v11, :cond_1

    const/4 v1, 0x0

    invoke-interface {v11, v0, v1}, Lcom/saterskog/a/b$d;->a(Lcom/saterskog/a/c;Lcom/saterskog/a/e;)V
    :try_end_1
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lcom/saterskog/a/b$a; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 1486
    :catch_0
    move-exception v0

    .line 1487
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SendIntentException while launching purchase flow for sku "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v1}, Lcom/saterskog/a/b;->d(Ljava/lang/String;)V

    .line 1488
    invoke-virtual {v0}, Landroid/content/IntentSender$SendIntentException;->printStackTrace()V

    .line 1489
    invoke-virtual {v12}, Lcom/saterskog/a/b;->c()V

    .line 1491
    new-instance v0, Lcom/saterskog/a/c;

    const/16 v1, -0x3ec

    const-string v2, "Failed to send intent."

    invoke-direct {v0, v1, v2}, Lcom/saterskog/a/c;-><init>(ILjava/lang/String;)V

    .line 1492
    if-eqz v11, :cond_1

    const/4 v1, 0x0

    invoke-interface {v11, v0, v1}, Lcom/saterskog/a/b$d;->a(Lcom/saterskog/a/c;Lcom/saterskog/a/e;)V
    :try_end_2
    .catch Lcom/saterskog/a/b$a; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 1328
    :catch_1
    move-exception v0

    .line 1329
    const-string v1, "buy failed"

    invoke-static {v1, v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_0

    .line 1476
    :cond_3
    :try_start_3
    const-string v1, "BUY_INTENT"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    .line 1477
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Launching buy intent for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ". Request code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v1}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 1478
    iput v6, v12, Lcom/saterskog/a/b;->m:I

    .line 1479
    iput-object v11, v12, Lcom/saterskog/a/b;->p:Lcom/saterskog/a/b$d;

    .line 1480
    iput-object v4, v12, Lcom/saterskog/a/b;->n:Ljava/lang/String;

    .line 1481
    invoke-virtual {v0}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v5

    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    const/4 v0, 0x0

    .line 1483
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v9

    const/4 v0, 0x0

    .line 1484
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v10

    move-object v4, v11

    .line 1481
    invoke-virtual/range {v4 .. v10}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    :try_end_3
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lcom/saterskog/a/b$a; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_0

    .line 1494
    :catch_2
    move-exception v0

    .line 1495
    :try_start_4
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "RemoteException while launching purchase flow for sku "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v1}, Lcom/saterskog/a/b;->d(Ljava/lang/String;)V

    .line 1496
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    .line 1497
    invoke-virtual {v12}, Lcom/saterskog/a/b;->c()V

    .line 1499
    new-instance v0, Lcom/saterskog/a/c;

    const/16 v1, -0x3e9

    const-string v2, "Remote exception while starting purchase flow"

    invoke-direct {v0, v1, v2}, Lcom/saterskog/a/c;-><init>(ILjava/lang/String;)V

    .line 1500
    if-eqz v11, :cond_1

    const/4 v1, 0x0

    invoke-interface {v11, v0, v1}, Lcom/saterskog/a/b$d;->a(Lcom/saterskog/a/c;Lcom/saterskog/a/e;)V
    :try_end_4
    .catch Lcom/saterskog/a/b$a; {:try_start_4 .. :try_end_4} :catch_1

    goto/16 :goto_0
.end method
