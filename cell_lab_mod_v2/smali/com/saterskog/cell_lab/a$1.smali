.class final Lcom/saterskog/cell_lab/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/saterskog/cell_lab/a;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/a;)V
    .locals 1

    .prologue
    .line 88
    iput-object p1, p0, Lcom/saterskog/cell_lab/a$1;->b:Lcom/saterskog/cell_lab/a;

    const/4 v0, 0x0

    iput v0, p0, Lcom/saterskog/cell_lab/a$1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 92
    :try_start_0
    const-string v0, "af.updateDonation(0): sleep..."

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 93
    iget v0, p0, Lcom/saterskog/cell_lab/a$1;->a:I

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 94
    const-string v0, "done!"

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 95
    iget-object v0, p0, Lcom/saterskog/cell_lab/a$1;->b:Lcom/saterskog/cell_lab/a;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/a;->getActivity()Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/saterskog/cell_lab/a$1$1;

    invoke-direct {v1, p0}, Lcom/saterskog/cell_lab/a$1$1;-><init>(Lcom/saterskog/cell_lab/a$1;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    :goto_0
    return-void

    .line 159
    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
