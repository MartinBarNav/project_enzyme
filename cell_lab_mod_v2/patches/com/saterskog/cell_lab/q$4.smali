.class final Lcom/saterskog/cell_lab/q$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/saterskog/cell_lab/q;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/q;I)V
    .locals 0

    .prologue
    .line 511
    iput-object p1, p0, Lcom/saterskog/cell_lab/q$4;->b:Lcom/saterskog/cell_lab/q;

    iput p2, p0, Lcom/saterskog/cell_lab/q$4;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 515
    iget-object v0, p0, Lcom/saterskog/cell_lab/q$4;->b:Lcom/saterskog/cell_lab/q;

    invoke-static {v0}, Lcom/saterskog/cell_lab/q;->a(Lcom/saterskog/cell_lab/q;)Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/saterskog/cell_lab/q$4;->b:Lcom/saterskog/cell_lab/q;

    .line 516
    invoke-static {v2}, Lcom/saterskog/cell_lab/q;->a(Lcom/saterskog/cell_lab/q;)Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e010a

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/saterskog/cell_lab/q$4;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/saterskog/cell_lab/q$4;->b:Lcom/saterskog/cell_lab/q;

    invoke-static {v2}, Lcom/saterskog/cell_lab/q;->a(Lcom/saterskog/cell_lab/q;)Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e010b

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    .line 515
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 517
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 518
    return-void
.end method
