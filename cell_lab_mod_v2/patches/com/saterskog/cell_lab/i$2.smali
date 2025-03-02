.class final Lcom/saterskog/cell_lab/i$2;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/i;->a(Z[Ljava/lang/String;)Landroid/widget/ArrayAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/saterskog/cell_lab/i;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/i;Landroid/content/Context;[Ljava/lang/String;Z)V
    .locals 1

    .prologue
    .line 1000
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$2;->b:Lcom/saterskog/cell_lab/i;

    iput-boolean p4, p0, Lcom/saterskog/cell_lab/i$2;->a:Z

    const v0, 0x7f0a0028

    invoke-direct {p0, p2, v0, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 1014
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    move-object v0, v1

    .line 1015
    check-cast v0, Landroid/widget/TextView;

    .line 1017
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$2;->b:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v2, v0, p1}, Lcom/saterskog/cell_lab/i;->a(Landroid/widget/TextView;I)V

    .line 1018
    const/high16 v2, 0x41800000    # 16.0f

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1022
    if-nez p2, :cond_0

    iget-boolean v2, p0, Lcom/saterskog/cell_lab/i$2;->a:Z

    if-eqz v2, :cond_0

    .line 1023
    invoke-virtual {v1, v3}, Landroid/view/View;->setLongClickable(Z)V

    .line 1024
    new-instance v2, Lcom/saterskog/cell_lab/i$2$1;

    invoke-direct {v2, p0, v0, p3}, Lcom/saterskog/cell_lab/i$2$1;-><init>(Lcom/saterskog/cell_lab/i$2;Landroid/widget/TextView;Landroid/view/ViewGroup;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1074
    invoke-virtual {v1, v3}, Landroid/view/View;->setClickable(Z)V

    .line 1075
    new-instance v2, Lcom/saterskog/cell_lab/i$2$2;

    invoke-direct {v2, p0, v0, p3}, Lcom/saterskog/cell_lab/i$2$2;-><init>(Lcom/saterskog/cell_lab/i$2;Landroid/widget/TextView;Landroid/view/ViewGroup;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1104
    :cond_0
    return-object v1
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 1003
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    move-object v0, v1

    .line 1005
    check-cast v0, Landroid/widget/TextView;

    .line 1006
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$2;->b:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v2, v0, p1}, Lcom/saterskog/cell_lab/i;->a(Landroid/widget/TextView;I)V

    .line 1008
    return-object v1
.end method
