.class final Lcom/saterskog/cell_lab/q$7;
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
.field final synthetic a:Z

.field final synthetic b:Lcom/saterskog/cell_lab/PlayActivity;

.field final synthetic c:Lcom/saterskog/cell_lab/q;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/q;ZLcom/saterskog/cell_lab/PlayActivity;)V
    .locals 0

    .prologue
    .line 688
    iput-object p1, p0, Lcom/saterskog/cell_lab/q$7;->c:Lcom/saterskog/cell_lab/q;

    iput-boolean p2, p0, Lcom/saterskog/cell_lab/q$7;->a:Z

    iput-object p3, p0, Lcom/saterskog/cell_lab/q$7;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 691
    iget-object v0, p0, Lcom/saterskog/cell_lab/q$7;->c:Lcom/saterskog/cell_lab/q;

    invoke-static {v0}, Lcom/saterskog/cell_lab/q;->b(Lcom/saterskog/cell_lab/q;)Lcom/saterskog/cell_lab/p$a;

    move-result-object v0

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Lcom/saterskog/cell_lab/p$a;->a(S)V

    .line 692
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/q$7;->a:Z

    if-eqz v0, :cond_0

    .line 693
    iget-object v0, p0, Lcom/saterskog/cell_lab/q$7;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/PlayActivity;->h()V

    .line 694
    :cond_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/q$7;->b:Lcom/saterskog/cell_lab/PlayActivity;

    .line 2767
    iput-boolean v3, v0, Lcom/saterskog/cell_lab/PlayActivity;->E:Z

    .line 695
    iget-object v0, p0, Lcom/saterskog/cell_lab/q$7;->c:Lcom/saterskog/cell_lab/q;

    invoke-static {v0}, Lcom/saterskog/cell_lab/q;->a(Lcom/saterskog/cell_lab/q;)Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/saterskog/cell_lab/q$7;->c:Lcom/saterskog/cell_lab/q;

    invoke-static {v1}, Lcom/saterskog/cell_lab/q;->a(Lcom/saterskog/cell_lab/q;)Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0195

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 696
    return-void
.end method
