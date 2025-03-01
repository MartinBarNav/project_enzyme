.class final Lcom/saterskog/cell_lab/k$1;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/k;->onActivityCreated(Landroid/os/Bundle;)V
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
.field final synthetic a:Lcom/saterskog/cell_lab/k;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/k;Landroid/content/Context;[Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 33
    iput-object p1, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    const v0, 0x1090004

    const v1, 0x1020014

    invoke-direct {p0, p2, v0, v1, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11

    .prologue
    .line 38
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 39
    const v0, 0x1020014

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 40
    const v1, 0x1020015

    invoke-virtual {v5, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 41
    iget-object v2, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    invoke-virtual {v2}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2}, Lcom/saterskog/cell_lab/j;->c(Landroid/content/Context;)I

    move-result v3

    .line 42
    iget-object v2, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    invoke-virtual {v2}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/saterskog/cell_lab/j$a;

    iget v6, v2, Lcom/saterskog/cell_lab/j$a;->i:I

    .line 43
    const/4 v2, 0x1

    .line 45
    const/4 v4, -0x1

    if-eq v3, v4, :cond_14

    if-ge v3, p1, :cond_14

    .line 46
    const/4 v2, 0x0

    move v4, v2

    .line 48
    :goto_0
    if-nez v4, :cond_2

    .line 49
    const v2, -0x7f7f80

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 54
    :goto_1
    const/4 v2, -0x1

    if-eq v6, v2, :cond_3

    .line 56
    invoke-virtual {p0, p1}, Lcom/saterskog/cell_lab/k$1;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    const-string v0, ""

    .line 59
    if-nez v4, :cond_0

    .line 60
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "<font color=#808080>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 61
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/j$a;->c:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 62
    if-nez v4, :cond_1

    .line 63
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "</font>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 64
    :cond_1
    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    :goto_2
    return-object v5

    .line 51
    :cond_2
    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    .line 68
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    invoke-virtual {v6}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v6

    invoke-static {p1, v6}, Lcom/saterskog/cell_lab/j;->a(ILandroid/content/Context;)I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v6, ": "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {p0, p1}, Lcom/saterskog/cell_lab/k$1;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    const-string v0, ""

    .line 71
    iget-object v2, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    invoke-virtual {v2}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/saterskog/cell_lab/j;->b(ILandroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 72
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "<font color=#38A10B>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 73
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    const v3, 0x7f0e00e7

    invoke-virtual {v2, v3}, Lcom/saterskog/cell_lab/k;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ".</font>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 82
    :goto_3
    if-nez v4, :cond_4

    .line 83
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "<font color=#808080>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 84
    :cond_4
    iget-object v2, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    invoke-virtual {v2}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/saterskog/cell_lab/j;->f(ILandroid/content/Context;)I

    move-result v2

    .line 85
    if-nez v2, :cond_5

    .line 86
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    invoke-virtual {v3}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v3

    const v6, 0x7f0e006a

    invoke-virtual {v3, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 87
    :cond_5
    const/4 v3, 0x1

    if-ne v2, v3, :cond_6

    .line 88
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    invoke-virtual {v3}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v3

    const v6, 0x7f0e006b

    invoke-virtual {v3, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 89
    :cond_6
    const/4 v3, 0x2

    if-ne v2, v3, :cond_7

    .line 90
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    invoke-virtual {v3}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v3

    const v6, 0x7f0e006c

    invoke-virtual {v3, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 91
    :cond_7
    const/4 v3, 0x3

    if-ne v2, v3, :cond_8

    .line 92
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    invoke-virtual {v2}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e006d

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 93
    :cond_8
    if-nez v4, :cond_13

    .line 94
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "</font>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 95
    :goto_4
    iget-object v0, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/j$a;->g:[Ljava/lang/String;

    if-eqz v0, :cond_c

    .line 97
    const-string v3, ""

    .line 98
    iget-object v0, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v6, v0, Lcom/saterskog/cell_lab/j$a;->g:[Ljava/lang/String;

    array-length v7, v6

    const/4 v0, 0x0

    :goto_5
    if-ge v0, v7, :cond_b

    aget-object v8, v6, v0

    .line 99
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v9, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    sget-object v10, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v8, v10}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/saterskog/cell_lab/h;->valueOf(Ljava/lang/String;)Lcom/saterskog/cell_lab/h;

    move-result-object v8

    invoke-virtual {v8}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v8

    aget-object v8, v9, v8

    iget-object v9, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    invoke-virtual {v9}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/saterskog/cell_lab/h;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v8, ", "

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 98
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 74
    :cond_9
    const/4 v2, -0x1

    if-eq v3, v2, :cond_a

    if-le p1, v3, :cond_a

    .line 76
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "<font color=#A13838>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 77
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    const v6, 0x7f0e0037

    invoke-virtual {v2, v6}, Lcom/saterskog/cell_lab/k;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    invoke-virtual {v2}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v3, v2}, Lcom/saterskog/cell_lab/j;->a(ILandroid/content/Context;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    const v3, 0x7f0e0039

    invoke-virtual {v2, v3}, Lcom/saterskog/cell_lab/k;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "</font>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_3

    .line 79
    :cond_a
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "<font color=#A1A138>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 80
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    const v3, 0x7f0e0038

    invoke-virtual {v2, v3}, Lcom/saterskog/cell_lab/k;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "</font>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_3

    .line 100
    :cond_b
    const/4 v0, 0x0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x2

    invoke-virtual {v3, v0, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 101
    if-eqz v4, :cond_11

    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "<br> <font color=#FFAA00>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 106
    :goto_6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    const v6, 0x7f0e003a

    invoke-virtual {v2, v6}, Lcom/saterskog/cell_lab/k;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 108
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    invoke-virtual {v2}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0e01aa

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "</font>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 111
    :cond_c
    iget-object v0, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget v3, v0, Lcom/saterskog/cell_lab/j$a;->j:I

    .line 112
    const/4 v0, -0x1

    if-eq v3, v0, :cond_10

    .line 113
    if-eqz v4, :cond_12

    .line 114
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "<br> <font color=#FFAA00>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 117
    :goto_7
    const/4 v0, 0x0

    .line 118
    if-nez v3, :cond_d

    iget-object v0, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    const v4, 0x7f0e01a7

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/k;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 119
    :cond_d
    const/4 v4, 0x1

    if-ne v3, v4, :cond_e

    iget-object v0, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    const v4, 0x7f0e01a6

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/k;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 120
    :cond_e
    const/4 v4, 0x2

    if-ne v3, v4, :cond_f

    iget-object v0, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    const v3, 0x7f0e01a8

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/k;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 122
    :cond_f
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/saterskog/cell_lab/k$1;->a:Lcom/saterskog/cell_lab/k;

    const v4, 0x7f0e01a9

    invoke-virtual {v3, v4}, Lcom/saterskog/cell_lab/k;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 124
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "</font>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 127
    :cond_10
    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v4, 0x10

    invoke-virtual {v1, v0, v2, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    goto/16 :goto_2

    .line 104
    :cond_11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "<br> <font color=#808080>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_6

    .line 116
    :cond_12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "<br> <font color=#808080>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    goto/16 :goto_7

    :cond_13
    move-object v2, v0

    goto/16 :goto_4

    :cond_14
    move v4, v2

    goto/16 :goto_0
.end method
