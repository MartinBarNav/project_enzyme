.class final Lcom/saterskog/cell_lab/f$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


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

.field final synthetic d:Landroid/widget/TextView;

.field final synthetic e:Lcom/saterskog/cell_lab/f;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/f;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 345
    iput-object p1, p0, Lcom/saterskog/cell_lab/f$5;->e:Lcom/saterskog/cell_lab/f;

    iput-object p2, p0, Lcom/saterskog/cell_lab/f$5;->a:Landroid/widget/EditText;

    iput-object p3, p0, Lcom/saterskog/cell_lab/f$5;->b:Landroid/widget/EditText;

    iput-object p4, p0, Lcom/saterskog/cell_lab/f$5;->c:Landroid/widget/EditText;

    iput-object p5, p0, Lcom/saterskog/cell_lab/f$5;->d:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 6

    .prologue
    const-wide/16 v2, 0x0

    .line 361
    :try_start_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/f$5;->a:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 362
    iget-object v0, p0, Lcom/saterskog/cell_lab/f$5;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 363
    iget-object v0, p0, Lcom/saterskog/cell_lab/f$5;->c:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    .line 369
    :goto_0
    if-lez v5, :cond_0

    cmpl-double v2, v0, v2

    if-lez v2, :cond_0

    if-ltz v4, :cond_0

    .line 370
    new-instance v2, Lcom/saterskog/cell_lab/Environment;

    invoke-direct {v2}, Lcom/saterskog/cell_lab/Environment;-><init>()V

    .line 371
    iput v4, v2, Lcom/saterskog/cell_lab/Environment;->s:I

    .line 372
    iput v5, v2, Lcom/saterskog/cell_lab/Environment;->r:I

    .line 373
    iput-wide v0, v2, Lcom/saterskog/cell_lab/Environment;->k:D

    .line 374
    invoke-static {v2}, Lcom/saterskog/cell_lab/CellWorld;->a(Lcom/saterskog/cell_lab/Environment;)J

    move-result-wide v0

    .line 381
    iget-object v2, p0, Lcom/saterskog/cell_lab/f$5;->d:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, " \u2248 "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-wide/32 v4, 0x100000

    div-long/2addr v0, v4

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " MB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 383
    :cond_0
    return-void

    .line 365
    :catch_0
    move-exception v0

    const/4 v1, -0x1

    .line 366
    const/4 v0, 0x0

    move v4, v0

    move v5, v1

    move-wide v0, v2

    .line 367
    goto :goto_0
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 349
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 354
    return-void
.end method
