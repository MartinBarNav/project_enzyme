.class public final Lcom/saterskog/a/b$2;
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
.field final synthetic a:Z

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Ljava/util/List;

.field final synthetic d:Lcom/saterskog/a/b$f;

.field final synthetic e:Landroid/os/Handler;

.field final synthetic f:Lcom/saterskog/a/b;


# direct methods
.method public constructor <init>(Lcom/saterskog/a/b;Ljava/util/List;Lcom/saterskog/a/b$f;Landroid/os/Handler;)V
    .locals 1

    .prologue
    .line 693
    iput-object p1, p0, Lcom/saterskog/a/b$2;->f:Lcom/saterskog/a/b;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/saterskog/a/b$2;->a:Z

    iput-object p2, p0, Lcom/saterskog/a/b$2;->b:Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/a/b$2;->c:Ljava/util/List;

    iput-object p3, p0, Lcom/saterskog/a/b$2;->d:Lcom/saterskog/a/b$f;

    iput-object p4, p0, Lcom/saterskog/a/b$2;->e:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 695
    new-instance v1, Lcom/saterskog/a/c;

    const/4 v0, 0x0

    const-string v2, "Inventory refresh successful."

    invoke-direct {v1, v0, v2}, Lcom/saterskog/a/c;-><init>(ILjava/lang/String;)V

    .line 696
    const/4 v0, 0x0

    .line 698
    :try_start_0
    iget-object v2, p0, Lcom/saterskog/a/b$2;->f:Lcom/saterskog/a/b;

    iget-boolean v3, p0, Lcom/saterskog/a/b$2;->a:Z

    iget-object v4, p0, Lcom/saterskog/a/b$2;->b:Ljava/util/List;

    iget-object v5, p0, Lcom/saterskog/a/b$2;->c:Ljava/util/List;

    invoke-virtual {v2, v3, v4, v5}, Lcom/saterskog/a/b;->a(ZLjava/util/List;Ljava/util/List;)Lcom/saterskog/a/d;
    :try_end_0
    .catch Lcom/saterskog/a/a; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 704
    :goto_0
    iget-object v2, p0, Lcom/saterskog/a/b$2;->f:Lcom/saterskog/a/b;

    invoke-virtual {v2}, Lcom/saterskog/a/b;->c()V

    .line 708
    iget-object v2, p0, Lcom/saterskog/a/b$2;->f:Lcom/saterskog/a/b;

    iget-boolean v2, v2, Lcom/saterskog/a/b;->d:Z

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/saterskog/a/b$2;->d:Lcom/saterskog/a/b$f;

    if-eqz v2, :cond_0

    .line 709
    iget-object v2, p0, Lcom/saterskog/a/b$2;->e:Landroid/os/Handler;

    new-instance v3, Lcom/saterskog/a/b$2$1;

    invoke-direct {v3, p0, v1, v0}, Lcom/saterskog/a/b$2$1;-><init>(Lcom/saterskog/a/b$2;Lcom/saterskog/a/c;Lcom/saterskog/a/d;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 715
    :cond_0
    return-void

    .line 1042
    :catch_0
    move-exception v1

    iget-object v1, v1, Lcom/saterskog/a/a;->a:Lcom/saterskog/a/c;

    goto :goto_0
.end method
