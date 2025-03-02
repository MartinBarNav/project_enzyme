.class final Lcom/saterskog/cell_lab/i$f;
.super Lcom/saterskog/cell_lab/i$e;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/saterskog/cell_lab/i$f$a;
    }
.end annotation


# instance fields
.field a:Landroid/widget/SeekBar;

.field b:Landroid/widget/Button;

.field c:Landroid/widget/TextView;

.field d:Landroid/widget/TextView;

.field n:Landroid/widget/TextView;

.field o:Landroid/widget/TextView;

.field p:Landroid/widget/SeekBar;

.field q:Landroid/widget/SeekBar;

.field r:Landroid/widget/SeekBar;

.field s:Landroid/widget/SeekBar;

.field t:Z

.field u:F

.field v:F

.field w:F

.field final synthetic x:Lcom/saterskog/cell_lab/i;


# direct methods
.method public constructor <init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 304
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    .line 305
    const/4 v6, -0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/saterskog/cell_lab/i$e;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;I)V

    .line 295
    iput-object v7, p0, Lcom/saterskog/cell_lab/i$f;->a:Landroid/widget/SeekBar;

    .line 296
    iput-object v7, p0, Lcom/saterskog/cell_lab/i$f;->b:Landroid/widget/Button;

    .line 306
    invoke-virtual {p1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e018a

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$f;->l:Ljava/lang/String;

    .line 307
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->x:[F

    aget v0, v0, p4

    iput v0, p0, Lcom/saterskog/cell_lab/i$f;->u:F

    .line 308
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->y:[F

    aget v0, v0, p4

    iput v0, p0, Lcom/saterskog/cell_lab/i$f;->v:F

    .line 309
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->y:[F

    aget v0, v0, p4

    sget-object v1, Lcom/saterskog/cell_lab/Gene;->x:[F

    aget v1, v1, p4

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/saterskog/cell_lab/i$f;->w:F

    .line 310
    invoke-static {p1}, Lcom/saterskog/cell_lab/i;->b(Lcom/saterskog/cell_lab/i;)Ljava/util/ArrayList;

    move-result-object v0

    sget-object v1, Lcom/saterskog/cell_lab/h;->n:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 311
    invoke-static {p1}, Lcom/saterskog/cell_lab/i;->b(Lcom/saterskog/cell_lab/i;)Ljava/util/ArrayList;

    move-result-object v0

    sget-object v1, Lcom/saterskog/cell_lab/h;->k:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 312
    invoke-static {p1}, Lcom/saterskog/cell_lab/i;->b(Lcom/saterskog/cell_lab/i;)Ljava/util/ArrayList;

    move-result-object v0

    sget-object v1, Lcom/saterskog/cell_lab/h;->l:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/i$f;->t:Z

    .line 313
    return-void

    .line 312
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method final a()Landroid/view/View;
    .locals 8

    .prologue
    const/16 v7, 0xb

    const/4 v6, 0x1

    const/4 v5, 0x0

    const/16 v4, 0xf

    const/4 v3, -0x2

    .line 585
    new-instance v0, Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$f;->f:Landroid/widget/RelativeLayout;

    .line 586
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->f:Landroid/widget/RelativeLayout;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 588
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->f:Landroid/widget/RelativeLayout;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setGravity(I)V

    .line 589
    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$f;->e:Landroid/widget/TextView;

    .line 590
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->e:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$f;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 591
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setClickable(Z)V

    .line 592
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 593
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->e:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v1

    or-int/lit8 v1, v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPaintFlags(I)V

    .line 594
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->e:Landroid/widget/TextView;

    const v1, 0x7f080041

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setId(I)V

    .line 597
    new-instance v0, Landroid/widget/SeekBar;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$f;->a:Landroid/widget/SeekBar;

    .line 598
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->a:Landroid/widget/SeekBar;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-static {v1}, Lcom/saterskog/cell_lab/i;->a(Lcom/saterskog/cell_lab/i;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 599
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->a:Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 601
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i$f;->t:Z

    if-eqz v0, :cond_0

    .line 602
    new-instance v0, Landroid/widget/Button;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$f;->b:Landroid/widget/Button;

    .line 603
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->b:Landroid/widget/Button;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e001b

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 606
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->b:Landroid/widget/Button;

    const v1, 0x7f080040

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setId(I)V

    .line 607
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->b:Landroid/widget/Button;

    new-instance v1, Lcom/saterskog/cell_lab/i$f$1;

    invoke-direct {v1, p0}, Lcom/saterskog/cell_lab/i$f$1;-><init>(Lcom/saterskog/cell_lab/i$f;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 616
    :cond_0
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 617
    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 618
    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 619
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 621
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i$f;->t:Z

    if-eqz v0, :cond_1

    .line 622
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 623
    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 624
    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 625
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->b:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 629
    :cond_1
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 630
    iget-boolean v1, p0, Lcom/saterskog/cell_lab/i$f;->t:Z

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->b:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getId()I

    move-result v1

    invoke-virtual {v0, v5, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 632
    :goto_0
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->e:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getId()I

    move-result v1

    invoke-virtual {v0, v6, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 633
    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 634
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->a:Landroid/widget/SeekBar;

    invoke-virtual {v1, v0}, Landroid/widget/SeekBar;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 637
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->f:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 638
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->f:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->a:Landroid/widget/SeekBar;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 639
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i$f;->t:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->f:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->b:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 640
    :cond_2
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/i$f;->t:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->b:Landroid/widget/Button;

    invoke-virtual {v0, v5}, Landroid/widget/Button;->setMinWidth(I)V

    .line 641
    :cond_3
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->f:Landroid/widget/RelativeLayout;

    return-object v0

    .line 631
    :cond_4
    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_0
.end method

.method public final b()V
    .locals 7

    .prologue
    const/4 v2, 0x1

    const/high16 v6, 0x41000000    # 8.0f

    const/4 v1, 0x0

    .line 645
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->f:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_1

    .line 646
    iget-object v3, p0, Lcom/saterskog/cell_lab/i$f;->f:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->g:Lcom/saterskog/cell_lab/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->g:Lcom/saterskog/cell_lab/h;

    iget-object v4, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v4, v4, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v5, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget v5, v5, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v4, v4, v5

    iget-object v4, v4, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    if-ne v0, v4, :cond_2

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 647
    :cond_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget v3, v3, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v3

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    iget v3, p0, Lcom/saterskog/cell_lab/i$f;->h:I

    aget-object v0, v0, v3

    iget v3, v0, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 648
    iget-object v4, p0, Lcom/saterskog/cell_lab/i$f;->a:Landroid/widget/SeekBar;

    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v5, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget v5, v5, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v5

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    iget v5, p0, Lcom/saterskog/cell_lab/i$f;->h:I

    aget-object v0, v0, v5

    iget-short v0, v0, Lcom/saterskog/cell_lab/Gene$a;->e:S

    if-nez v0, :cond_3

    move v0, v2

    :goto_1
    invoke-virtual {v4, v0}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 649
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->a:Landroid/widget/SeekBar;

    iget-object v4, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-static {v4}, Lcom/saterskog/cell_lab/i;->a(Lcom/saterskog/cell_lab/i;)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/SeekBar;->setMax(I)V

    .line 651
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->x:[F

    iget v4, p0, Lcom/saterskog/cell_lab/i$f;->h:I

    aget v0, v0, v4

    const/4 v4, 0x0

    cmpl-float v0, v0, v4

    if-nez v0, :cond_4

    .line 653
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->a:Landroid/widget/SeekBar;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    mul-float/2addr v3, v6

    invoke-virtual {v1, v3, v2}, Lcom/saterskog/cell_lab/i;->a(FZ)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 660
    :goto_2
    return-void

    .line 646
    :cond_2
    const/16 v0, 0x8

    goto :goto_0

    :cond_3
    move v0, v1

    .line 648
    goto :goto_1

    .line 656
    :cond_4
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->a:Landroid/widget/SeekBar;

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    mul-float/2addr v3, v6

    invoke-virtual {v2, v3, v1}, Lcom/saterskog/cell_lab/i;->a(FZ)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    goto :goto_2
.end method

.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 9

    .prologue
    const/4 v4, 0x1

    const/4 v8, 0x0

    const/high16 v3, 0x41000000    # 8.0f

    const/high16 v7, 0x3f000000    # 0.5f

    .line 317
    if-eqz p3, :cond_0

    .line 320
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->x:[F

    iget v1, p0, Lcom/saterskog/cell_lab/i$f;->h:I

    aget v0, v0, v1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 321
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget v1, v1, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    iget v1, p0, Lcom/saterskog/cell_lab/i$f;->h:I

    aget-object v0, v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v2, p2, v4}, Lcom/saterskog/cell_lab/i;->a(IZ)F

    move-result v2

    mul-float/2addr v1, v2

    div-float/2addr v1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v1, v2

    iput v1, v0, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 327
    :goto_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i;->a()V

    .line 329
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0800e8

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 330
    if-eqz v0, :cond_0

    .line 331
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$f;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": %1$,.2f"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v4, [Ljava/lang/Object;

    sget-object v3, Lcom/saterskog/cell_lab/Gene;->x:[F

    iget v4, p0, Lcom/saterskog/cell_lab/i$f;->h:I

    aget v3, v3, v4

    sget-object v4, Lcom/saterskog/cell_lab/Gene;->y:[F

    iget v5, p0, Lcom/saterskog/cell_lab/i$f;->h:I

    aget v4, v4, v5

    sget-object v5, Lcom/saterskog/cell_lab/Gene;->x:[F

    iget v6, p0, Lcom/saterskog/cell_lab/i$f;->h:I

    aget v5, v5, v6

    sub-float/2addr v4, v5

    iget-object v5, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v5, v5, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v6, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget v6, v6, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v5, v5, v6

    iget-object v5, v5, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    iget v6, p0, Lcom/saterskog/cell_lab/i$f;->h:I

    aget-object v5, v5, v6

    iget v5, v5, Lcom/saterskog/cell_lab/Gene$a;->b:F

    mul-float/2addr v5, v7

    add-float/2addr v5, v7

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    aput-object v3, v2, v8

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 333
    :cond_0
    return-void

    .line 323
    :cond_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget v1, v1, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    iget v1, p0, Lcom/saterskog/cell_lab/i$f;->h:I

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v1, p2, v8}, Lcom/saterskog/cell_lab/i;->a(IZ)F

    move-result v1

    div-float/2addr v1, v3

    iput v1, v0, Lcom/saterskog/cell_lab/Gene$a;->b:F

    goto :goto_0
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .prologue
    .line 338
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .prologue
    .line 342
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0800e8

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 343
    if-eqz v0, :cond_0

    .line 344
    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 345
    :cond_0
    return-void
.end method
