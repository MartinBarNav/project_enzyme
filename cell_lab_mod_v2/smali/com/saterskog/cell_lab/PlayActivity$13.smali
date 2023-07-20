.class final Lcom/saterskog/cell_lab/PlayActivity$13;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/PlayActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/Integer;

.field final synthetic b:Lcom/saterskog/cell_lab/PlayActivity;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/PlayActivity;Landroid/content/Context;[Ljava/lang/Integer;[Ljava/lang/Integer;)V
    .locals 2

    .prologue
    .line 1437
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity$13;->b:Lcom/saterskog/cell_lab/PlayActivity;

    iput-object p4, p0, Lcom/saterskog/cell_lab/PlayActivity$13;->a:[Ljava/lang/Integer;

    const v0, 0x1090011

    const v1, 0x1020014

    invoke-direct {p0, p2, v0, v1, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 1440
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 1441
    const v0, 0x1020014

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1445
    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$13;->a:[Ljava/lang/Integer;

    aget-object v1, v1, p1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_4

    const v1, 0x7f07006f

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/saterskog/cell_lab/PlayActivity$13;->b:Lcom/saterskog/cell_lab/PlayActivity;

    const v6, 0x7f0e01a1

    invoke-virtual {v5, v6}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1446
    :goto_0
    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity$13;->a:[Ljava/lang/Integer;

    aget-object v4, v4, p1

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    const v1, 0x7f070071

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/saterskog/cell_lab/PlayActivity$13;->b:Lcom/saterskog/cell_lab/PlayActivity;

    const v6, 0x7f0e01a3

    invoke-virtual {v5, v6}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1447
    :cond_0
    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity$13;->a:[Ljava/lang/Integer;

    aget-object v4, v4, p1

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_1

    const v1, 0x7f07006e

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/saterskog/cell_lab/PlayActivity$13;->b:Lcom/saterskog/cell_lab/PlayActivity;

    const v6, 0x7f0e01a0

    invoke-virtual {v5, v6}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1448
    :cond_1
    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity$13;->a:[Ljava/lang/Integer;

    aget-object v4, v4, p1

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x3

    if-ne v4, v5, :cond_2

    const v1, 0x7f070072

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/saterskog/cell_lab/PlayActivity$13;->b:Lcom/saterskog/cell_lab/PlayActivity;

    const v6, 0x7f0e01a4

    invoke-virtual {v5, v6}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1449
    :cond_2
    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity$13;->a:[Ljava/lang/Integer;

    aget-object v4, v4, p1

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x4

    if-ne v4, v5, :cond_3

    const v1, 0x7f070070

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/saterskog/cell_lab/PlayActivity$13;->b:Lcom/saterskog/cell_lab/PlayActivity;

    const v6, 0x7f0e01a2

    invoke-virtual {v5, v6}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1451
    :cond_3
    invoke-virtual {v0, v1, v2, v2, v2}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 1458
    return-object v3

    :cond_4
    move v1, v2

    goto/16 :goto_0
.end method
