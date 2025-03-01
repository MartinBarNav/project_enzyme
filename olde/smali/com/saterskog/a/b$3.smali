.class final Lcom/saterskog/a/b$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/saterskog/a/b$b;

.field final synthetic c:Landroid/os/Handler;

.field final synthetic d:Lcom/saterskog/a/b$c;

.field final synthetic e:Lcom/saterskog/a/b;


# direct methods
.method constructor <init>(Lcom/saterskog/a/b;Ljava/util/List;Lcom/saterskog/a/b$b;Landroid/os/Handler;)V
    .locals 1

    .prologue
    .line 1073
    iput-object p1, p0, Lcom/saterskog/a/b$3;->e:Lcom/saterskog/a/b;

    iput-object p2, p0, Lcom/saterskog/a/b$3;->a:Ljava/util/List;

    iput-object p3, p0, Lcom/saterskog/a/b$3;->b:Lcom/saterskog/a/b$b;

    iput-object p4, p0, Lcom/saterskog/a/b$3;->c:Landroid/os/Handler;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/a/b$3;->d:Lcom/saterskog/a/b$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .prologue
    .line 1075
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1076
    iget-object v0, p0, Lcom/saterskog/a/b$3;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/a/e;

    .line 1078
    :try_start_0
    iget-object v1, p0, Lcom/saterskog/a/b$3;->e:Lcom/saterskog/a/b;

    .line 1734
    invoke-virtual {v1}, Lcom/saterskog/a/b;->b()V

    .line 1735
    const-string v4, "consume"

    invoke-virtual {v1, v4}, Lcom/saterskog/a/b;->a(Ljava/lang/String;)V

    .line 1737
    iget-object v4, v0, Lcom/saterskog/a/e;->a:Ljava/lang/String;

    const-string v5, "inapp"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 1738
    new-instance v1, Lcom/saterskog/a/a;

    const/16 v4, -0x3f2

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Items of type \'"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lcom/saterskog/a/e;->a:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, "\' can\'t be consumed."

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v4, v0}, Lcom/saterskog/a/a;-><init>(ILjava/lang/String;)V

    throw v1
    :try_end_0
    .catch Lcom/saterskog/a/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 1081
    :catch_0
    move-exception v0

    .line 5042
    iget-object v0, v0, Lcom/saterskog/a/a;->a:Lcom/saterskog/a/c;

    .line 1082
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 2059
    :cond_0
    :try_start_1
    iget-object v4, v0, Lcom/saterskog/a/e;->h:Ljava/lang/String;

    .line 3055
    iget-object v5, v0, Lcom/saterskog/a/e;->d:Ljava/lang/String;

    .line 1745
    if-eqz v4, :cond_1

    const-string v6, ""

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 1746
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "Can\'t consume "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, ". No token."

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/saterskog/a/b;->d(Ljava/lang/String;)V

    .line 1747
    new-instance v1, Lcom/saterskog/a/a;

    const/16 v4, -0x3ef

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "PurchaseInfo is missing token for sku: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v4, v5}, Lcom/saterskog/a/a;-><init>(ILjava/lang/String;)V

    throw v1
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/saterskog/a/a; {:try_start_1 .. :try_end_1} :catch_0

    .line 1761
    :catch_1
    move-exception v1

    .line 1762
    :try_start_2
    new-instance v4, Lcom/saterskog/a/a;

    const/16 v5, -0x3e9

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Remote exception while consuming. PurchaseInfo: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v5, v0, v1}, Lcom/saterskog/a/a;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    throw v4
    :try_end_2
    .catch Lcom/saterskog/a/a; {:try_start_2 .. :try_end_2} :catch_0

    .line 1751
    :cond_2
    :try_start_3
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Consuming sku: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ", token: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 1752
    iget-object v6, v1, Lcom/saterskog/a/b;->k:Lcom/a/a/a/a;

    const/4 v7, 0x3

    iget-object v8, v1, Lcom/saterskog/a/b;->j:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v7, v8, v4}, Lcom/a/a/a/a;->b(ILjava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 1753
    if-nez v4, :cond_3

    .line 1754
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "Successfully consumed sku: "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Lcom/saterskog/a/a; {:try_start_3 .. :try_end_3} :catch_0

    .line 1079
    :try_start_4
    new-instance v1, Lcom/saterskog/a/c;

    const/4 v4, 0x0

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Successful consume of sku "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4055
    iget-object v0, v0, Lcom/saterskog/a/e;->d:Ljava/lang/String;

    .line 1079
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v4, v0}, Lcom/saterskog/a/c;-><init>(ILjava/lang/String;)V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Lcom/saterskog/a/a; {:try_start_4 .. :try_end_4} :catch_0

    goto/16 :goto_0

    .line 1757
    :cond_3
    :try_start_5
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Error consuming consuming sku "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ". "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {v4}, Lcom/saterskog/a/b;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 1758
    new-instance v1, Lcom/saterskog/a/a;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Error consuming sku "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v4, v5}, Lcom/saterskog/a/a;-><init>(ILjava/lang/String;)V

    throw v1
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Lcom/saterskog/a/a; {:try_start_5 .. :try_end_5} :catch_0

    .line 1086
    :cond_4
    iget-object v0, p0, Lcom/saterskog/a/b$3;->e:Lcom/saterskog/a/b;

    invoke-virtual {v0}, Lcom/saterskog/a/b;->c()V

    .line 1087
    iget-object v0, p0, Lcom/saterskog/a/b$3;->e:Lcom/saterskog/a/b;

    iget-boolean v0, v0, Lcom/saterskog/a/b;->d:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/saterskog/a/b$3;->b:Lcom/saterskog/a/b$b;

    if-eqz v0, :cond_5

    .line 1088
    iget-object v0, p0, Lcom/saterskog/a/b$3;->c:Landroid/os/Handler;

    new-instance v1, Lcom/saterskog/a/b$3$1;

    invoke-direct {v1, p0, v2}, Lcom/saterskog/a/b$3$1;-><init>(Lcom/saterskog/a/b$3;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1094
    :cond_5
    iget-object v0, p0, Lcom/saterskog/a/b$3;->e:Lcom/saterskog/a/b;

    iget-boolean v0, v0, Lcom/saterskog/a/b;->d:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/saterskog/a/b$3;->d:Lcom/saterskog/a/b$c;

    if-eqz v0, :cond_6

    .line 1095
    iget-object v0, p0, Lcom/saterskog/a/b$3;->c:Landroid/os/Handler;

    new-instance v1, Lcom/saterskog/a/b$3$2;

    invoke-direct {v1, p0, v2}, Lcom/saterskog/a/b$3$2;-><init>(Lcom/saterskog/a/b$3;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1101
    :cond_6
    return-void
.end method
