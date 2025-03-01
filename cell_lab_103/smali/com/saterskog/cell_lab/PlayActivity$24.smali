.class final Lcom/saterskog/cell_lab/PlayActivity$24;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/PlayActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/EditText;

.field final synthetic b:Lcom/saterskog/cell_lab/PlayActivity;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/PlayActivity;Landroid/widget/EditText;)V
    .locals 0

    .prologue
    .line 1000
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->b:Lcom/saterskog/cell_lab/PlayActivity;

    iput-object p2, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->a:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 10

    .prologue
    const v9, 0x102000b

    const/4 v0, 0x0

    const/high16 v8, -0x10000

    const/4 v7, 0x1

    .line 1003
    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->a:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1004
    invoke-static {v1}, Lcom/saterskog/cell_lab/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1005
    iget-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v3}, Lcom/saterskog/cell_lab/PlayActivity;->fileList()[Ljava/lang/String;

    move-result-object v3

    .line 1006
    array-length v4, v3

    :goto_0
    if-ge v0, v4, :cond_1

    aget-object v5, v3, v0

    .line 1007
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v5, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->a:Landroid/widget/EditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->b:Lcom/saterskog/cell_lab/PlayActivity;

    iget-object v6, v6, Lcom/saterskog/cell_lab/PlayActivity;->t:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 1008
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->b:Lcom/saterskog/cell_lab/PlayActivity;

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->b:Lcom/saterskog/cell_lab/PlayActivity;

    const v2, 0x7f0e0108

    invoke-virtual {v1, v2}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    .line 1009
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    .line 1010
    invoke-virtual {v1}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1011
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1012
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 1046
    :goto_1
    return-void

    .line 1006
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1019
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->b:Lcom/saterskog/cell_lab/PlayActivity;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/saterskog/cell_lab/PlayActivity;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v2

    .line 1026
    iget-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->b:Lcom/saterskog/cell_lab/PlayActivity;

    .line 2277
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/saterskog/cell_lab/PlayActivity;->b(I)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/p;

    .line 2278
    if-eqz v0, :cond_2

    iget-object v4, v0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    if-eqz v4, :cond_2

    .line 2279
    iget-object v4, v0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    new-instance v5, Lcom/saterskog/cell_lab/PlayActivity$9;

    invoke-direct {v5, v3, v0, v2}, Lcom/saterskog/cell_lab/PlayActivity$9;-><init>(Lcom/saterskog/cell_lab/PlayActivity;Lcom/saterskog/cell_lab/p;Ljava/io/OutputStream;)V

    invoke-virtual {v4, v5}, Lcom/saterskog/cell_lab/r;->queueEvent(Ljava/lang/Runnable;)V

    .line 1027
    :cond_2
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v0, v1}, Lcom/saterskog/cell_lab/PlayActivity;->a(Lcom/saterskog/cell_lab/PlayActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 1028
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->b:Lcom/saterskog/cell_lab/PlayActivity;

    const/4 v2, -0x1

    iput v2, v0, Lcom/saterskog/cell_lab/PlayActivity;->s:I

    .line 1029
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->b:Lcom/saterskog/cell_lab/PlayActivity;

    iput-object v1, v0, Lcom/saterskog/cell_lab/PlayActivity;->t:Ljava/lang/String;

    .line 1030
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->b:Lcom/saterskog/cell_lab/PlayActivity;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/saterskog/cell_lab/PlayActivity;->o:Z

    .line 1031
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/PlayActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    .line 1032
    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v1}, Lcom/saterskog/cell_lab/PlayActivity;->d(Lcom/saterskog/cell_lab/PlayActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 1034
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->b:Lcom/saterskog/cell_lab/PlayActivity;

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->b:Lcom/saterskog/cell_lab/PlayActivity;

    const v2, 0x7f0e019d

    invoke-virtual {v1, v2}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    .line 1037
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    goto :goto_1

    .line 1040
    :catch_1
    move-exception v0

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    .line 1041
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->b:Lcom/saterskog/cell_lab/PlayActivity;

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$24;->b:Lcom/saterskog/cell_lab/PlayActivity;

    const v2, 0x7f0e0193

    invoke-virtual {v1, v2}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    .line 1042
    invoke-virtual {v1}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1043
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1044
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    goto/16 :goto_1
.end method
