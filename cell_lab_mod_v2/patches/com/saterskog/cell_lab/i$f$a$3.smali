.class final Lcom/saterskog/cell_lab/i$f$a$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/i$f$a;-><init>(Lcom/saterskog/cell_lab/i$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/i$f;

.field final synthetic b:Lcom/saterskog/cell_lab/i$f$a;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/i$f$a;Lcom/saterskog/cell_lab/i$f;)V
    .locals 0

    .prologue
    .line 438
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$f$a$3;->b:Lcom/saterskog/cell_lab/i$f$a;

    iput-object p2, p0, Lcom/saterskog/cell_lab/i$f$a$3;->a:Lcom/saterskog/cell_lab/i$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 441
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$f$a$3;->b:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$f$a;->a:Landroid/widget/Spinner;

    invoke-virtual {v2, v0}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 442
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$f$a$3;->b:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$f$a;->b:Landroid/widget/Spinner;

    invoke-virtual {v2, v0}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 443
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$f$a$3;->b:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$f;->p:Landroid/widget/SeekBar;

    invoke-virtual {v2, v1}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 444
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$f$a$3;->b:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$f;->q:Landroid/widget/SeekBar;

    invoke-virtual {v2, v0}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 445
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$f$a$3;->b:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$f;->r:Landroid/widget/SeekBar;

    invoke-virtual {v2, v0}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 446
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$f$a$3;->b:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$f;->s:Landroid/widget/SeekBar;

    invoke-virtual {v2, v0}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 447
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$f$a$3;->b:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$f;->s:Landroid/widget/SeekBar;

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$f$a$3;->b:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f$a;->d:Landroid/widget/RadioButton;

    invoke-virtual {v3}, Landroid/widget/RadioButton;->isChecked()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$f$a$3;->b:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f$a;->b:Landroid/widget/Spinner;

    invoke-virtual {v3}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v3

    if-ne v3, v0, :cond_0

    :goto_0
    invoke-virtual {v2, v0}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 448
    return-void

    :cond_0
    move v0, v1

    .line 447
    goto :goto_0
.end method
