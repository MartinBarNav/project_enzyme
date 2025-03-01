.class public Lcom/saterskog/cell_lab/GenePoolView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field public a:[Landroid/widget/CheckBox;

.field public b:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v1, 0x0

    .line 16
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 17
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/GenePoolView;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f0e0106

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 20
    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/GenePoolView;->addView(Landroid/view/View;)V

    .line 22
    const/4 v0, -0x1

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/GenePoolView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/saterskog/cell_lab/j;->i(ILandroid/content/Context;)[Z

    move-result-object v3

    .line 23
    array-length v4, v3

    move v2, v1

    move v0, v1

    :goto_0
    if-ge v2, v4, :cond_1

    aget-boolean v5, v3, v2

    if-eqz v5, :cond_0

    add-int/lit8 v0, v0, 0x1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 24
    :cond_1
    new-array v2, v0, [Landroid/widget/CheckBox;

    iput-object v2, p0, Lcom/saterskog/cell_lab/GenePoolView;->a:[Landroid/widget/CheckBox;

    .line 25
    new-array v0, v0, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/GenePoolView;->b:[I

    .line 27
    sget-object v2, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v4, v2

    move v0, v1

    :goto_1
    if-ge v1, v4, :cond_3

    aget-object v5, v2, v1

    .line 30
    invoke-virtual {v5}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v6

    aget-boolean v6, v3, v6

    if-eqz v6, :cond_2

    .line 31
    iget-object v6, p0, Lcom/saterskog/cell_lab/GenePoolView;->b:[I

    invoke-virtual {v5}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v7

    aput v7, v6, v0

    .line 32
    iget-object v6, p0, Lcom/saterskog/cell_lab/GenePoolView;->a:[Landroid/widget/CheckBox;

    new-instance v7, Landroid/widget/CheckBox;

    invoke-direct {v7, p1}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;)V

    aput-object v7, v6, v0

    .line 33
    iget-object v6, p0, Lcom/saterskog/cell_lab/GenePoolView;->a:[Landroid/widget/CheckBox;

    aget-object v6, v6, v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/GenePoolView;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/saterskog/cell_lab/h;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/saterskog/b/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Landroid/widget/CheckBox;->setText(Ljava/lang/CharSequence;)V

    .line 42
    iget-object v5, p0, Lcom/saterskog/cell_lab/GenePoolView;->a:[Landroid/widget/CheckBox;

    aget-object v5, v5, v0

    invoke-virtual {p0, v5}, Lcom/saterskog/cell_lab/GenePoolView;->addView(Landroid/view/View;)V

    .line 44
    add-int/lit8 v0, v0, 0x1

    .line 27
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 48
    :cond_3
    invoke-virtual {p0, v8}, Lcom/saterskog/cell_lab/GenePoolView;->setOrientation(I)V

    .line 50
    return-void
.end method
