.class public final Lcom/saterskog/cell_lab/f;
.super Landroid/app/ListFragment;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


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
    .line 41
    invoke-direct {p0}, Landroid/app/ListFragment;-><init>()V

    .line 44
    const/4 v0, -0x1

    iput v0, p0, Lcom/saterskog/cell_lab/f;->c:I

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 217
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".substrate"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method final a()V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 143
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/f;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->fileList()[Ljava/lang/String;

    move-result-object v2

    .line 144
    new-instance v0, Lcom/saterskog/cell_lab/f$1;

    invoke-direct {v0, p0}, Lcom/saterskog/cell_lab/f$1;-><init>(Lcom/saterskog/cell_lab/f;)V

    invoke-static {v2, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 150
    iget-object v0, p0, Lcom/saterskog/cell_lab/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 151
    iget-object v0, p0, Lcom/saterskog/cell_lab/f;->b:Ljava/util/ArrayList;

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    array-length v3, v2

    move v0, v1

    :goto_0
    if-ge v0, v3, :cond_1

    aget-object v4, v2, v0

    .line 1220
    const-string v5, ".substrate"

    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    .line 153
    if-eqz v5, :cond_0

    .line 154
    iget-object v5, p0, Lcom/saterskog/cell_lab/f;->b:Ljava/util/ArrayList;

    .line 1223
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0xa

    invoke-virtual {v4, v1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 154
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 157
    :cond_1
    new-instance v0, Lcom/saterskog/cell_lab/f$2;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/f;->getActivity()Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lcom/saterskog/cell_lab/f;->b:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1, v2}, Lcom/saterskog/cell_lab/f$2;-><init>(Lcom/saterskog/cell_lab/f;Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/f;->a:Landroid/widget/ArrayAdapter;

    .line 214
    iget-object v0, p0, Lcom/saterskog/cell_lab/f;->a:Landroid/widget/ArrayAdapter;

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/f;->setListAdapter(Landroid/widget/ListAdapter;)V

    .line 215
    return-void
.end method

.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 47
    invoke-super {p0, p1}, Landroid/app/ListFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/saterskog/cell_lab/f;->b:Ljava/util/ArrayList;

    .line 50
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/f;->a()V

    .line 109
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/f;->getListView()Landroid/widget/ListView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setChoiceMode(I)V

    .line 110
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/f;->getListView()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 111
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .prologue
    .line 114
    invoke-super {p0, p1, p2, p3}, Landroid/app/ListFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    .line 116
    return-object v0
.end method

.method public final onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)Z"
        }
    .end annotation

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 329
    iput p3, p0, Lcom/saterskog/cell_lab/f;->c:I

    .line 330
    if-nez p3, :cond_0

    .line 332
    new-instance v6, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/f;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 334
    const v0, 0x7f0e0088

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/f;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 336
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/f;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 340
    const v1, 0x7f0a001d

    invoke-virtual {v0, v1, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 341
    const v0, 0x7f080011

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 342
    const v0, 0x7f080037

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    .line 343
    const v0, 0x7f080039

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    .line 344
    const v0, 0x7f080038

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/EditText;

    .line 345
    new-instance v0, Lcom/saterskog/cell_lab/f$5;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/saterskog/cell_lab/f$5;-><init>(Lcom/saterskog/cell_lab/f;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/TextView;)V

    .line 385
    invoke-virtual {v2, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 386
    invoke-virtual {v3, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 387
    invoke-virtual {v4, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 388
    invoke-interface {v0, v8}, Landroid/text/TextWatcher;->afterTextChanged(Landroid/text/Editable;)V

    .line 389
    invoke-virtual {v6, v7}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 408
    const v0, 0x7f0e0060

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/f;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/saterskog/cell_lab/f$6;

    invoke-direct {v1, p0, v2, v3, v4}, Lcom/saterskog/cell_lab/f$6;-><init>(Lcom/saterskog/cell_lab/f;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V

    invoke-virtual {v6, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 436
    const v0, 0x7f0e005b

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/f;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/saterskog/cell_lab/f$7;

    invoke-direct {v1, p0}, Lcom/saterskog/cell_lab/f$7;-><init>(Lcom/saterskog/cell_lab/f;)V

    invoke-virtual {v6, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 442
    invoke-virtual {v6}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 477
    :goto_0
    return v9

    .line 446
    :cond_0
    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/String;

    .line 452
    const/4 v0, 0x0

    const v2, 0x7f0e00dc

    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/f;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    .line 453
    const v0, 0x7f0e00de

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/f;->getString(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v9

    .line 454
    const/4 v0, 0x2

    const v2, 0x7f0e00df

    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/f;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    .line 458
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/f;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {v2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 459
    iget-object v0, p0, Lcom/saterskog/cell_lab/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 464
    new-instance v0, Lcom/saterskog/cell_lab/f$8;

    invoke-direct {v0, p0}, Lcom/saterskog/cell_lab/f$8;-><init>(Lcom/saterskog/cell_lab/f;)V

    invoke-virtual {v2, v1, v0}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 470
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 471
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 472
    invoke-virtual {v0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "android:id/titleDivider"

    invoke-virtual {v1, v2, v8, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 473
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 474
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/f;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f050014

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_0
.end method

.method public final onListItemClick(Landroid/widget/ListView;Landroid/view/View;IJ)V
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 120
    new-instance v3, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/f;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const-class v4, Lcom/saterskog/cell_lab/PlayActivity;

    invoke-direct {v3, v2, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 121
    const/4 v2, -0x1

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/f;->getActivity()Landroid/app/Activity;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/saterskog/cell_lab/j;->i(ILandroid/content/Context;)[Z

    move-result-object v4

    .line 123
    array-length v5, v4

    move v2, v0

    :goto_0
    if-ge v2, v5, :cond_3

    aget-boolean v6, v4, v2

    if-eqz v6, :cond_0

    move v2, v1

    .line 124
    :goto_1
    if-nez p3, :cond_1

    if-nez v2, :cond_1

    .line 125
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/f;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v2, "You currently do not have any genes available, finish a challenge first."

    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 134
    :goto_2
    return-void

    .line 123
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 129
    :cond_1
    const-string v2, "old"

    if-nez p3, :cond_2

    :goto_3
    invoke-virtual {v3, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 130
    const-string v1, "name"

    iget-object v0, p0, Lcom/saterskog/cell_lab/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 131
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/f;->getActivity()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/l;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/l;->a(S)V

    .line 132
    invoke-virtual {p0, v3}, Lcom/saterskog/cell_lab/f;->startActivity(Landroid/content/Intent;)V

    goto :goto_2

    :cond_2
    move v0, v1

    .line 129
    goto :goto_3

    :cond_3
    move v2, v0

    goto :goto_1
.end method

.method public final onResume()V
    .locals 1

    .prologue
    .line 137
    invoke-super {p0}, Landroid/app/ListFragment;->onResume()V

    .line 138
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/f;->a()V

    .line 139
    iget-object v0, p0, Lcom/saterskog/cell_lab/f;->a:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    .line 141
    return-void
.end method
