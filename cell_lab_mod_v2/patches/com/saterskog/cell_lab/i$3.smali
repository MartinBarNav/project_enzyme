.class final Lcom/saterskog/cell_lab/i$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/i;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/i;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/i;)V
    .locals 0

    .prologue
    .line 1229
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$3;->a:Lcom/saterskog/cell_lab/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 1232
    new-instance v0, Lcom/saterskog/cell_lab/i$d;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$3;->a:Lcom/saterskog/cell_lab/i;

    invoke-direct {v0, v1}, Lcom/saterskog/cell_lab/i$d;-><init>(Lcom/saterskog/cell_lab/i;)V

    .line 1861
    iget-object v0, v0, Lcom/saterskog/cell_lab/i$d;->c:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1233
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$3;->a:Lcom/saterskog/cell_lab/i;

    iget v0, v0, Lcom/saterskog/cell_lab/i;->c:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 1234
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$3;->a:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x3

    const/4 v2, 0x5

    const/16 v3, 0x1f4

    invoke-static {v0, v1, v2, v3}, Lcom/saterskog/cell_lab/t;->a(Landroid/app/Activity;III)V

    .line 1235
    :cond_0
    return-void
.end method
