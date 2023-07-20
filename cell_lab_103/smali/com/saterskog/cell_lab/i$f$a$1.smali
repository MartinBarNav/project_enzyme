.class final Lcom/saterskog/cell_lab/i$f$a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


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
    .line 395
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$f$a$1;->b:Lcom/saterskog/cell_lab/i$f$a;

    iput-object p2, p0, Lcom/saterskog/cell_lab/i$f$a$1;->a:Lcom/saterskog/cell_lab/i$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    .line 398
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f$a$1;->b:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$f;->s:Landroid/widget/SeekBar;

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$f$a$1;->b:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$f$a;->d:Landroid/widget/RadioButton;

    invoke-virtual {v2}, Landroid/widget/RadioButton;->isChecked()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$f$a$1;->b:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$f$a;->b:Landroid/widget/Spinner;

    invoke-virtual {v2}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v2

    if-ne v2, v0, :cond_0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 399
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$a$1;->b:Lcom/saterskog/cell_lab/i$f$a;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i$f$a;->a()V

    .line 400
    return-void

    .line 398
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 405
    return-void
.end method
