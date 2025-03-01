.class final Lcom/saterskog/cell_lab/m$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/m;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/saterskog/cell_lab/m;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/m;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/saterskog/cell_lab/m$1;->b:Lcom/saterskog/cell_lab/m;

    iput-object p2, p0, Lcom/saterskog/cell_lab/m$1;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    .line 58
    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v0, p0, Lcom/saterskog/cell_lab/m$1;->b:Lcom/saterskog/cell_lab/m;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/m;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 60
    iget-object v0, p0, Lcom/saterskog/cell_lab/m$1;->b:Lcom/saterskog/cell_lab/m;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/m;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 61
    const v2, 0x7f0a0025

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 62
    const v0, 0x7f0800e9

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v3, p0, Lcom/saterskog/cell_lab/m$1;->b:Lcom/saterskog/cell_lab/m;

    const v4, 0x7f0e00fa

    invoke-virtual {v3, v4}, Lcom/saterskog/cell_lab/m;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    const v0, 0x7f0800d5

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v3, p0, Lcom/saterskog/cell_lab/m$1;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 66
    iget-object v0, p0, Lcom/saterskog/cell_lab/m$1;->b:Lcom/saterskog/cell_lab/m;

    const v2, 0x7f0e005d

    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/m;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/saterskog/cell_lab/m$1$1;

    invoke-direct {v2, p0}, Lcom/saterskog/cell_lab/m$1$1;-><init>(Lcom/saterskog/cell_lab/m$1;)V

    invoke-virtual {v1, v0, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 72
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 73
    return-void
.end method
