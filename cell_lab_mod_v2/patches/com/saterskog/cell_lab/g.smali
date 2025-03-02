.class public final Lcom/saterskog/cell_lab/g;
.super Landroid/app/ListFragment;
.source "SourceFile"


# instance fields
.field a:Landroid/widget/ArrayAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/widget/ArrayAdapter",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Landroid/app/ListFragment;-><init>()V

    .line 40
    const/4 v0, -0x1

    iput v0, p0, Lcom/saterskog/cell_lab/g;->c:I

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".genome"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 158
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 159
    invoke-virtual {p0}, Landroid/content/Context;->fileList()[Ljava/lang/String;

    move-result-object v2

    .line 160
    new-instance v0, Lcom/saterskog/cell_lab/g$4;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/g$4;-><init>()V

    invoke-static {v2, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 166
    const/4 v0, 0x0

    :goto_0
    array-length v3, v2

    if-ge v0, v3, :cond_1

    .line 167
    aget-object v3, v2, v0

    .line 2176
    const-string v4, ".genome"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    .line 167
    if-eqz v3, :cond_0

    .line 168
    aget-object v3, v2, v0

    invoke-static {v3}, Lcom/saterskog/cell_lab/g;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 170
    :cond_1
    return-object v1
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 179
    const/4 v0, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x7

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method final a()V
    .locals 4

    .prologue
    .line 102
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/g;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->fileList()[Ljava/lang/String;

    move-result-object v1

    .line 103
    new-instance v0, Lcom/saterskog/cell_lab/g$2;

    invoke-direct {v0, p0}, Lcom/saterskog/cell_lab/g$2;-><init>(Lcom/saterskog/cell_lab/g;)V

    invoke-static {v1, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 109
    iget-object v0, p0, Lcom/saterskog/cell_lab/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 110
    const/4 v0, 0x0

    :goto_0
    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 111
    aget-object v2, v1, v0

    .line 1176
    const-string v3, ".genome"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    .line 111
    if-eqz v2, :cond_0

    .line 112
    iget-object v2, p0, Lcom/saterskog/cell_lab/g;->b:Ljava/util/ArrayList;

    aget-object v3, v1, v0

    invoke-static {v3}, Lcom/saterskog/cell_lab/g;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 115
    :cond_1
    new-instance v0, Lcom/saterskog/cell_lab/g$3;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/g;->getActivity()Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lcom/saterskog/cell_lab/g;->b:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1, v2}, Lcom/saterskog/cell_lab/g$3;-><init>(Lcom/saterskog/cell_lab/g;Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/g;->a:Landroid/widget/ArrayAdapter;

    .line 154
    iget-object v0, p0, Lcom/saterskog/cell_lab/g;->a:Landroid/widget/ArrayAdapter;

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/g;->setListAdapter(Landroid/widget/ListAdapter;)V

    .line 155
    return-void
.end method

.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 43
    invoke-super {p0, p1}, Landroid/app/ListFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/saterskog/cell_lab/g;->b:Ljava/util/ArrayList;

    .line 46
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/g;->a()V

    .line 48
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/g;->getListView()Landroid/widget/ListView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setChoiceMode(I)V

    .line 49
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .prologue
    .line 52
    invoke-super {p0, p1, p2, p3}, Landroid/app/ListFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    .line 53
    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/g;->registerForContextMenu(Landroid/view/View;)V

    .line 54
    return-object v0
.end method

.method public final onListItemClick(Landroid/widget/ListView;Landroid/view/View;IJ)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 58
    iput p3, p0, Lcom/saterskog/cell_lab/g;->c:I

    .line 63
    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/String;

    .line 69
    const/4 v0, 0x0

    const v2, 0x7f0e00dc

    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/g;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    .line 70
    const/4 v0, 0x1

    const v2, 0x7f0e00de

    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/g;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    .line 71
    const/4 v0, 0x2

    const v2, 0x7f0e00df

    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/g;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    .line 75
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/g;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {v2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 76
    iget-object v0, p0, Lcom/saterskog/cell_lab/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 81
    new-instance v0, Lcom/saterskog/cell_lab/g$1;

    invoke-direct {v0, p0}, Lcom/saterskog/cell_lab/g$1;-><init>(Lcom/saterskog/cell_lab/g;)V

    invoke-virtual {v2, v1, v0}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 87
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 88
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 89
    invoke-virtual {v0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "android:id/titleDivider"

    invoke-virtual {v1, v2, v3, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 90
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 91
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/g;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f050014

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 93
    return-void
.end method

.method public final onResume()V
    .locals 1

    .prologue
    .line 96
    invoke-super {p0}, Landroid/app/ListFragment;->onResume()V

    .line 97
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/g;->a()V

    .line 98
    iget-object v0, p0, Lcom/saterskog/cell_lab/g;->a:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    .line 100
    return-void
.end method
