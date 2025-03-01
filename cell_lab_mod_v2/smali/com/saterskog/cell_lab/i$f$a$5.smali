.class final Lcom/saterskog/cell_lab/ControllersE;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


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

.field final synthetic b:Lcom/saterskog/cell_lab/i$f;

.field final synthetic c:Lcom/saterskog/cell_lab/i$f$a;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/i$f$a;Lcom/saterskog/cell_lab/i$f;Lcom/saterskog/cell_lab/i$f;)V
    .locals 0

    .prologue
    .line 501
    iput-object p1, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iput-object p2, p0, Lcom/saterskog/cell_lab/ControllersE;->a:Lcom/saterskog/cell_lab/i$f;

    iput-object p3, p0, Lcom/saterskog/cell_lab/ControllersE;->b:Lcom/saterskog/cell_lab/i$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 10

    .prologue
    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v0, 0x1

    const/4 v8, 0x0

    const/high16 v7, 0x41000000    # 8.0f

    const/4 v1, 0x0

    .line 504
    iget-object v2, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v3, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget v3, v3, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    iget-object v3, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget v3, v3, Lcom/saterskog/cell_lab/i$f;->h:I

    aget-object v2, v2, v3

    .line 505
    iget-object v3, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f$a;->c:Landroid/widget/RadioButton;

    invoke-virtual {v3}, Landroid/widget/RadioButton;->isChecked()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 506
    iput-short v1, v2, Lcom/saterskog/cell_lab/Gene$a;->e:S

    .line 509
    iput v8, v2, Lcom/saterskog/cell_lab/Gene$a;->a:F

    .line 510
    iget-object v3, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v4, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v4, v4, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v4, v4, Lcom/saterskog/cell_lab/i$f;->p:Landroid/widget/SeekBar;

    invoke-virtual {v4}, Landroid/widget/SeekBar;->getProgress()I

    move-result v4

    sget-object v5, Lcom/saterskog/cell_lab/Gene;->x:[F

    iget-object v6, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v6, v6, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget v6, v6, Lcom/saterskog/cell_lab/i$f;->h:I

    aget v5, v5, v6

    cmpl-float v5, v5, v8

    if-nez v5, :cond_2

    :goto_0
    invoke-virtual {v3, v4, v0}, Lcom/saterskog/cell_lab/i;->a(IZ)F

    move-result v0

    div-float/2addr v0, v7

    iput v0, v2, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 511
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->x:[F

    iget-object v1, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget v1, v1, Lcom/saterskog/cell_lab/i$f;->h:I

    aget v0, v0, v1

    cmpl-float v0, v0, v8

    if-nez v0, :cond_0

    const/high16 v0, 0x40000000    # 2.0f

    iget v1, v2, Lcom/saterskog/cell_lab/Gene$a;->b:F

    mul-float/2addr v0, v1

    sub-float/2addr v0, v9

    iput v0, v2, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 513
    :cond_0
    iput v8, v2, Lcom/saterskog/cell_lab/Gene$a;->c:F

    .line 536
    :goto_1
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 537
    iget-object v0, p0, Lcom/saterskog/cell_lab/ControllersE;->b:Lcom/saterskog/cell_lab/i$f;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i$f;->b()V

    .line 538
    iget-object v0, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i;->a()V

    .line 540
    iget-short v0, v2, Lcom/saterskog/cell_lab/Gene$a;->d:S

    if-nez v0, :cond_1

    iget v0, v2, Lcom/saterskog/cell_lab/Gene$a;->a:F

    sub-float/2addr v0, v7

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v4, 0x3fd0000000000000L    # 0.25

    cmpg-double v0, v0, v4

    if-gez v0, :cond_1

    iget v0, v2, Lcom/saterskog/cell_lab/Gene$a;->b:F

    add-float/2addr v0, v9

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3fc3333333333333L    # 0.15

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 541
    iget-object v0, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x3

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 542
    :cond_1
    return-void

    :cond_2
    move v0, v1

    .line 510
    goto :goto_0

    .line 516
    :cond_3
    iget-object v3, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f$a;->a:Landroid/widget/Spinner;

    invoke-virtual {v3}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v3

    int-to-short v3, v3

    iput-short v3, v2, Lcom/saterskog/cell_lab/Gene$a;->d:S

    .line 517
    iget-object v3, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f$a;->b:Landroid/widget/Spinner;

    invoke-virtual {v3}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v3

    if-ne v3, v0, :cond_4

    .line 519
    const/4 v0, 0x2

    iput-short v0, v2, Lcom/saterskog/cell_lab/Gene$a;->e:S

    .line 520
    iget-object v0, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v3, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f;->q:Landroid/widget/SeekBar;

    invoke-virtual {v3}, Landroid/widget/SeekBar;->getProgress()I

    move-result v3

    invoke-virtual {v0, v3, v1}, Lcom/saterskog/cell_lab/i;->a(IZ)F

    move-result v0

    div-float/2addr v0, v7

    iput v0, v2, Lcom/saterskog/cell_lab/Gene$a;->a:F

    .line 521
    iget-object v0, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v3, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f;->r:Landroid/widget/SeekBar;

    invoke-virtual {v3}, Landroid/widget/SeekBar;->getProgress()I

    move-result v3

    invoke-virtual {v0, v3, v1}, Lcom/saterskog/cell_lab/i;->a(IZ)F

    move-result v0

    div-float/2addr v0, v7

    iput v0, v2, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 522
    iget-object v0, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v3, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f;->s:Landroid/widget/SeekBar;

    invoke-virtual {v3}, Landroid/widget/SeekBar;->getProgress()I

    move-result v3

    invoke-virtual {v0, v3, v1}, Lcom/saterskog/cell_lab/i;->a(IZ)F

    move-result v0

    div-float/2addr v0, v7

    iput v0, v2, Lcom/saterskog/cell_lab/Gene$a;->c:F

    goto/16 :goto_1

    .line 527
    :cond_4

    #MODDED-------------------------------------------------------
    # This sets the equation after the cell state dialog is closed via the save btn
    # v3 is the item selected from the list, set before jumping to cond_4.

    const/16 v0, 0x2
    if-eq v3, v0, :cond_modded_enzyme_4
    const/16 v0, 0x1
    goto :cond_modded_enzyme_5

    :cond_modded_enzyme_4
    const/16 v0, 0x3
    #MODDED-------------------------------------------------------
    :cond_modded_enzyme_5

    iput-short v0, v2, Lcom/saterskog/cell_lab/Gene$a;->e:S

    const/16 v0, 0x1

    .line 528
    iget-object v0, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v3, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f;->q:Landroid/widget/SeekBar;

    invoke-virtual {v3}, Landroid/widget/SeekBar;->getProgress()I

    move-result v3

    invoke-virtual {v0, v3, v1}, Lcom/saterskog/cell_lab/i;->a(IZ)F

    move-result v0

    iput v0, v2, Lcom/saterskog/cell_lab/Gene$a;->a:F

    .line 529
    iget-object v0, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v3, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f;->r:Landroid/widget/SeekBar;

    invoke-virtual {v3}, Landroid/widget/SeekBar;->getProgress()I

    move-result v3

    invoke-virtual {v0, v3, v1}, Lcom/saterskog/cell_lab/i;->a(IZ)F

    move-result v0

    iput v0, v2, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 530
    iget-object v0, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v3, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f;->s:Landroid/widget/SeekBar;

    invoke-virtual {v3}, Landroid/widget/SeekBar;->getProgress()I

    move-result v3

    invoke-virtual {v0, v3, v1}, Lcom/saterskog/cell_lab/i;->a(IZ)F

    move-result v0

    # MODDED -------------------------------
    # This multiplies the c slider by 80 when saving
    # only if item selected = 2 (eq#3)

    iget-object v3, p0, Lcom/saterskog/cell_lab/ControllersE;->c:Lcom/saterskog/cell_lab/i$f$a;
    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f$a;->b:Landroid/widget/Spinner;
    invoke-virtual {v3}, Landroid/widget/Spinner;->getSelectedItemPosition()I
    move-result v3

    const/16 v8, 0x2
    if-ne v8, v3, :cond_modded_enzyme_14

    const v5, 0x3c4ccccd    # 0.0125f

    div-float v0, v0, v5

    :cond_modded_enzyme_14

    iput v0, v2, Lcom/saterskog/cell_lab/Gene$a;->c:F

    # MODDED -------------------------------

    goto/16 :goto_1
.end method
