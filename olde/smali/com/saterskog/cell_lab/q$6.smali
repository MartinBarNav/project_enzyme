.class final Lcom/saterskog/cell_lab/q$6;
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
    .line 598
    iput-object p1, p0, Lcom/saterskog/cell_lab/q$6;->a:Lcom/saterskog/cell_lab/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 602
    iget-object v0, p0, Lcom/saterskog/cell_lab/q$6;->a:Lcom/saterskog/cell_lab/q;

    invoke-static {v0}, Lcom/saterskog/cell_lab/q;->a(Lcom/saterskog/cell_lab/q;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v2, v1}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 603
    iget-object v0, p0, Lcom/saterskog/cell_lab/q$6;->a:Lcom/saterskog/cell_lab/q;

    iget v0, v0, Lcom/saterskog/cell_lab/q;->z:I

    if-nez v0, :cond_0

    .line 604
    iget-object v0, p0, Lcom/saterskog/cell_lab/q$6;->a:Lcom/saterskog/cell_lab/q;

    invoke-static {v0}, Lcom/saterskog/cell_lab/q;->a(Lcom/saterskog/cell_lab/q;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x7

    invoke-static {v0, v2, v1}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 605
    :cond_0
    return-void
.end method
