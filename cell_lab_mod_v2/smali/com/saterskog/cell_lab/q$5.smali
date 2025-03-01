.class final Lcom/saterskog/cell_lab/q$5;
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
.field final synthetic a:Lcom/saterskog/cell_lab/q;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/q;)V
    .locals 0

    .prologue
    .line 525
    iput-object p1, p0, Lcom/saterskog/cell_lab/q$5;->a:Lcom/saterskog/cell_lab/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 529
    iget-object v0, p0, Lcom/saterskog/cell_lab/q$5;->a:Lcom/saterskog/cell_lab/q;

    invoke-static {v0}, Lcom/saterskog/cell_lab/q;->a(Lcom/saterskog/cell_lab/q;)Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e0194

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 531
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 532
    return-void
.end method
