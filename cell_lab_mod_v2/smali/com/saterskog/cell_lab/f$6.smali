.class final Lcom/saterskog/cell_lab/f$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/f;->onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/EditText;

.field final synthetic b:Landroid/widget/EditText;

.field final synthetic c:Landroid/widget/EditText;

.field final synthetic d:Lcom/saterskog/cell_lab/f;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/f;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V
    .locals 0

    .prologue
    .line 408
    iput-object p1, p0, Lcom/saterskog/cell_lab/f$6;->d:Lcom/saterskog/cell_lab/f;

    iput-object p2, p0, Lcom/saterskog/cell_lab/f$6;->a:Landroid/widget/EditText;

    iput-object p3, p0, Lcom/saterskog/cell_lab/f$6;->b:Landroid/widget/EditText;

    iput-object p4, p0, Lcom/saterskog/cell_lab/f$6;->c:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 7

    .prologue
    const/4 v0, 0x0

    const-wide/16 v2, 0x0

    .line 412
    new-instance v6, Landroid/content/Intent;

    iget-object v1, p0, Lcom/saterskog/cell_lab/f$6;->d:Lcom/saterskog/cell_lab/f;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/f;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const-class v4, Lcom/saterskog/cell_lab/PlayActivity;

    invoke-direct {v6, v1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 413
    const-string v1, "old"

    invoke-virtual {v6, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 414
    const-string v1, "name"

    const-string v4, ""

    invoke-virtual {v6, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 418
    :try_start_0
    iget-object v1, p0, Lcom/saterskog/cell_lab/f$6;->a:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 419
    iget-object v1, p0, Lcom/saterskog/cell_lab/f$6;->b:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 420
    iget-object v1, p0, Lcom/saterskog/cell_lab/f$6;->c:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    .line 426
    :goto_0
    if-lez v5, :cond_0

    cmpl-double v2, v0, v2

    if-lez v2, :cond_0

    if-ltz v4, :cond_0

    .line 427
    const-string v2, "maxCells"

    invoke-virtual {v6, v2, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 428
    const-string v2, "maxFoods"

    invoke-virtual {v6, v2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 429
    const-string v2, "radius"

    invoke-virtual {v6, v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    .line 430
    iget-object v0, p0, Lcom/saterskog/cell_lab/f$6;->d:Lcom/saterskog/cell_lab/f;

    invoke-virtual {v0, v6}, Lcom/saterskog/cell_lab/f;->startActivity(Landroid/content/Intent;)V

    .line 434
    :cond_0
    return-void

    .line 422
    :catch_0
    move-exception v1

    const/4 v1, -0x1

    move v4, v0

    move v5, v1

    move-wide v0, v2

    .line 424
    goto :goto_0
.end method
