.class final Lcom/saterskog/cell_lab/i$f$a$2;
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
    .line 426
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$f$a$2;->b:Lcom/saterskog/cell_lab/i$f$a;

    iput-object p2, p0, Lcom/saterskog/cell_lab/i$f$a$2;->a:Lcom/saterskog/cell_lab/i$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 430
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$a$2;->b:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f;->p:Landroid/widget/SeekBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 431
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$a$2;->b:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f$a;->a:Landroid/widget/Spinner;

    invoke-virtual {v0, v2}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 432
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$a$2;->b:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f$a;->b:Landroid/widget/Spinner;

    invoke-virtual {v0, v2}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 433
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$a$2;->b:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f;->q:Landroid/widget/SeekBar;

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 434
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$a$2;->b:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f;->r:Landroid/widget/SeekBar;

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 435
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$a$2;->b:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f;->s:Landroid/widget/SeekBar;

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 436
    return-void
.end method
