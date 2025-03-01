.class final Lcom/saterskog/cell_lab/PlayActivity$15;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/PlayActivity;
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
    .line 1554
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity$15;->b:Lcom/saterskog/cell_lab/PlayActivity;

    iput-object p4, p0, Lcom/saterskog/cell_lab/PlayActivity$15;->a:[Ljava/lang/Integer;

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

    .line 1557
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 1558
    const v0, 0x1020014

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1562
    if-nez p1, :cond_2

    .line 1563
    const v1, 0x7f07005d

    .line 1564
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/saterskog/cell_lab/PlayActivity$15;->b:Lcom/saterskog/cell_lab/PlayActivity;

    const v6, 0x7f0e0109

    invoke-virtual {v5, v6}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "..."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1568
    :goto_0
    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity$15;->a:[Ljava/lang/Integer;

    array-length v4, v4

    add-int/lit8 v4, v4, -0x2

    if-ne p1, v4, :cond_0

    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity$15;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v4}, Lcom/saterskog/cell_lab/PlayActivity;->d(Lcom/saterskog/cell_lab/PlayActivity;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    const v1, 0x7f07005c

    const v4, 0x7f0e0140

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    .line 1569
    :cond_0
    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity$15;->a:[Ljava/lang/Integer;

    array-length v4, v4

    add-int/lit8 v4, v4, -0x1

    if-ne p1, v4, :cond_1

    const v1, 0x7f07005b

    const v4, 0x7f0e0141

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    .line 1572
    :cond_1
    invoke-virtual {v0, v1, v2, v2, v2}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 1579
    return-object v3

    :cond_2
    move v1, v2

    goto :goto_0
.end method
