.class public final Lcom/saterskog/cell_lab/k;
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Landroid/app/ListFragment;-><init>()V

    return-void
.end method

.method private a(IZ)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 159
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/cell_lab/j;->c(Landroid/content/Context;)I

    move-result v0

    .line 160
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    if-le p1, v0, :cond_0

    .line 161
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f0e0037

    invoke-virtual {p0, v4}, Lcom/saterskog/cell_lab/k;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j;->a(ILandroid/content/Context;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const v3, 0x7f0e0039

    invoke-virtual {p0, v3}, Lcom/saterskog/cell_lab/k;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 162
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/l;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/l;->a(S)V

    .line 175
    :goto_0
    return-void

    .line 166
    :cond_0
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/l;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/l;->a(S)V

    .line 168
    new-instance v2, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-class v3, Lcom/saterskog/cell_lab/PlayActivity;

    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 169
    const-string v3, "experimentOnChallenge"

    if-eqz p2, :cond_1

    move v0, v1

    :goto_1
    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 170
    const-string v0, "challenge"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 173
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, v2, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 169
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method static synthetic a(Lcom/saterskog/cell_lab/k;I)V
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/saterskog/cell_lab/k;->a(IZ)V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 28
    invoke-super {p0, p1}, Landroid/app/ListFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 29
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/cell_lab/j;->b(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v0

    .line 32
    new-instance v1, Lcom/saterskog/cell_lab/k$1;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v1, p0, v2, v0}, Lcom/saterskog/cell_lab/k$1;-><init>(Lcom/saterskog/cell_lab/k;Landroid/content/Context;[Ljava/lang/String;)V

    iput-object v1, p0, Lcom/saterskog/cell_lab/k;->a:Landroid/widget/ArrayAdapter;

    .line 141
    iget-object v0, p0, Lcom/saterskog/cell_lab/k;->a:Landroid/widget/ArrayAdapter;

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/k;->setListAdapter(Landroid/widget/ListAdapter;)V

    .line 142
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/k;->getListView()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 143
    return-void
.end method

.method public final onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 4
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
    const/4 v3, 0x0

    .line 181
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/k;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 183
    const v1, 0x7f0e0102

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 185
    const v1, 0x7f0e00ff

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 187
    const v1, 0x7f0e005d

    invoke-virtual {p0, v1}, Lcom/saterskog/cell_lab/k;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/saterskog/cell_lab/k$2;

    invoke-direct {v2, p0, p3}, Lcom/saterskog/cell_lab/k$2;-><init>(Lcom/saterskog/cell_lab/k;I)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 193
    const v1, 0x7f0e005b

    invoke-virtual {p0, v1}, Lcom/saterskog/cell_lab/k;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/saterskog/cell_lab/k$3;

    invoke-direct {v2, p0}, Lcom/saterskog/cell_lab/k$3;-><init>(Lcom/saterskog/cell_lab/k;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 200
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 201
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 202
    invoke-virtual {v0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "android:id/titleDivider"

    invoke-virtual {v1, v2, v3, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 203
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 204
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/k;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f050014

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 233
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final onListItemClick(Landroid/widget/ListView;Landroid/view/View;IJ)V
    .locals 1

    .prologue
    .line 154
    const/4 v0, 0x0

    invoke-direct {p0, p3, v0}, Lcom/saterskog/cell_lab/k;->a(IZ)V

    .line 155
    return-void
.end method

.method public final onResume()V
    .locals 1

    .prologue
    .line 146
    invoke-super {p0}, Landroid/app/ListFragment;->onResume()V

    .line 147
    invoke-static {}, Lcom/saterskog/cell_lab/j;->a()V

    .line 148
    iget-object v0, p0, Lcom/saterskog/cell_lab/k;->a:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    .line 151
    return-void
.end method
