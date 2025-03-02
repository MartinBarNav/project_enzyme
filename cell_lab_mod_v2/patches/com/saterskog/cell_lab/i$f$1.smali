.class final Lcom/saterskog/cell_lab/i$f$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/i$f;->a()Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/i$f;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/i$f;)V
    .locals 0

    .prologue
    .line 607
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$f$1;->a:Lcom/saterskog/cell_lab/i$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 610
    new-instance v0, Lcom/saterskog/cell_lab/i$f$a;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f$1;->a:Lcom/saterskog/cell_lab/i$f;

    invoke-direct {v0, v1}, Lcom/saterskog/cell_lab/i$f$a;-><init>(Lcom/saterskog/cell_lab/i$f;)V

    .line 1549
    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f$a;->e:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 612
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$1;->a:Lcom/saterskog/cell_lab/i$f;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget v0, v0, Lcom/saterskog/cell_lab/i;->c:I

    if-ne v0, v3, :cond_0

    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$1;->a:Lcom/saterskog/cell_lab/i$f;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x3

    const/16 v2, 0x2ee

    invoke-static {v0, v1, v3, v2}, Lcom/saterskog/cell_lab/t;->a(Landroid/app/Activity;III)V

    .line 613
    :cond_0
    return-void
.end method
