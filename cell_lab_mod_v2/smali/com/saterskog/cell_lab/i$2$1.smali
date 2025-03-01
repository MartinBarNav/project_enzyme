.class final Lcom/saterskog/cell_lab/i$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/i$2;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/TextView;

.field final synthetic b:Landroid/view/ViewGroup;

.field final synthetic c:Lcom/saterskog/cell_lab/i$2;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/i$2;Landroid/widget/TextView;Landroid/view/ViewGroup;)V
    .locals 0

    .prologue
    .line 1024
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$2$1;->c:Lcom/saterskog/cell_lab/i$2;

    iput-object p2, p0, Lcom/saterskog/cell_lab/i$2$1;->a:Landroid/widget/TextView;

    iput-object p3, p0, Lcom/saterskog/cell_lab/i$2$1;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 8

    .prologue
    const v7, 0x7f0e00b5

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 1029
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$2$1;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1030
    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    .line 1031
    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 1032
    invoke-virtual {v0, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 1034
    :cond_0
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 1040
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    .line 1042
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$2$1;->c:Lcom/saterskog/cell_lab/i$2;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$2;->b:Lcom/saterskog/cell_lab/i;

    const v4, 0x7f0e00ae

    invoke-virtual {v3, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$2$1;->c:Lcom/saterskog/cell_lab/i$2;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$2;->b:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v3, v7}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    add-int/lit8 v3, v0, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v5

    .line 1043
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$2$1;->c:Lcom/saterskog/cell_lab/i$2;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$2;->b:Lcom/saterskog/cell_lab/i;

    const v4, 0x7f0e00aa

    invoke-virtual {v3, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$2$1;->c:Lcom/saterskog/cell_lab/i$2;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$2;->b:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v3, v7}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$2$1;->c:Lcom/saterskog/cell_lab/i$2;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$2;->b:Lcom/saterskog/cell_lab/i;

    iget v3, v3, Lcom/saterskog/cell_lab/i;->c:I

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$2$1;->c:Lcom/saterskog/cell_lab/i$2;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$2;->b:Lcom/saterskog/cell_lab/i;

    const v4, 0x7f0e00ab

    invoke-virtual {v3, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " M"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    add-int/lit8 v3, v0, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v6

    .line 1045
    new-instance v2, Landroid/app/AlertDialog$Builder;

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$2$1;->c:Lcom/saterskog/cell_lab/i$2;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$2;->b:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v3}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1049
    new-instance v3, Lcom/saterskog/cell_lab/i$2$1$1;

    invoke-direct {v3, p0, v0}, Lcom/saterskog/cell_lab/i$2$1$1;-><init>(Lcom/saterskog/cell_lab/i$2$1;I)V

    invoke-virtual {v2, v1, v3}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1067
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1069
    return v5
.end method
