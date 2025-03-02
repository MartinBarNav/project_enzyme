.class final Lcom/saterskog/cell_lab/i$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field a:Landroid/widget/Spinner;

.field b:Landroid/widget/Spinner;

.field c:Landroid/app/AlertDialog$Builder;

.field d:Landroid/widget/SeekBar;

.field e:Landroid/widget/TextView;

.field final f:F

.field final g:F

.field final h:F

.field i:F

.field final synthetic j:Lcom/saterskog/cell_lab/i;


# direct methods
.method public constructor <init>(Lcom/saterskog/cell_lab/i;)V
    .locals 12

    .prologue
    .line 686
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 668
    const/high16 v0, 0x3e800000    # 0.25f

    iput v0, p0, Lcom/saterskog/cell_lab/i$d;->f:F

    const/high16 v0, 0x41140000    # 9.25f

    iput v0, p0, Lcom/saterskog/cell_lab/i$d;->g:F

    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lcom/saterskog/cell_lab/i$d;->h:F

    .line 687
    iget-object v0, p1, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v1, p1, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    iget-short v3, v0, Lcom/saterskog/cell_lab/Gene$a;->d:S

    .line 688
    iget-object v0, p1, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v1, p1, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    iget-short v2, v0, Lcom/saterskog/cell_lab/Gene$a;->d:S

    .line 689
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->y:[F

    const/4 v1, 0x7

    aget v0, v0, v1

    iget-object v1, p1, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v4, p1, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v4

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/4 v4, 0x7

    aget-object v1, v1, v4

    iget v1, v1, Lcom/saterskog/cell_lab/Gene$a;->a:F

    mul-float v4, v0, v1

    .line 690
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->y:[F

    const/4 v1, 0x7

    aget v0, v0, v1

    iget-object v1, p1, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v5, p1, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v1, v1, v5

    iget-object v1, v1, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/16 v5, 0x9

    aget-object v1, v1, v5

    iget v1, v1, Lcom/saterskog/cell_lab/Gene$a;->a:F

    mul-float v5, v0, v1

    .line 691
    const/high16 v0, 0x40f00000    # 7.5f

    sub-float v0, v5, v0

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 692
    const/high16 v0, -0x40800000    # -1.0f

    .line 693
    if-ltz v1, :cond_0

    const/4 v6, 0x5

    if-gt v1, v6, :cond_0

    invoke-virtual {p0, v1, v5, v4}, Lcom/saterskog/cell_lab/i$d;->a(IFF)F

    move-result v0

    .line 694
    :cond_0
    const-wide/high16 v4, 0x3fc0000000000000L    # 0.125

    float-to-double v6, v0

    cmpg-double v4, v4, v6

    if-gez v4, :cond_1

    const/high16 v4, 0x3e800000    # 0.25f

    cmpg-float v4, v0, v4

    if-gez v4, :cond_1

    const/high16 v0, 0x3e800000    # 0.25f

    .line 695
    :cond_1
    const/high16 v4, 0x41140000    # 9.25f

    cmpg-float v4, v4, v0

    if-gez v4, :cond_2

    float-to-double v4, v0

    const-wide v6, 0x4022c00000000000L    # 9.375

    cmpg-double v4, v4, v6

    if-gez v4, :cond_2

    const/high16 v0, 0x41140000    # 9.25f

    .line 696
    :cond_2
    if-ltz v1, :cond_3

    const/4 v4, 0x5

    if-gt v1, v4, :cond_3

    if-ltz v3, :cond_3

    if-ltz v2, :cond_3

    const/4 v4, 0x4

    if-ge v3, v4, :cond_3

    const/4 v4, 0x4

    if-ge v2, v4, :cond_3

    if-eq v3, v2, :cond_3

    const/high16 v4, 0x3e800000    # 0.25f

    cmpg-float v4, v0, v4

    if-ltz v4, :cond_3

    const/high16 v4, 0x41140000    # 9.25f

    cmpl-float v4, v0, v4

    if-lez v4, :cond_9

    .line 698
    :cond_3
    const/4 v1, 0x1

    .line 699
    const/4 v3, 0x0

    .line 700
    const/4 v2, 0x1

    .line 701
    const/high16 v0, 0x40000000    # 2.0f

    move v4, v3

    move v3, v2

    move v2, v1

    move v1, v0

    .line 705
    :goto_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v5

    invoke-direct {v0, v5}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$d;->c:Landroid/app/AlertDialog$Builder;

    .line 706
    invoke-virtual {p1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 707
    const v5, 0x7f0a0026

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    .line 710
    const v0, 0x7f0800c5

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$d;->a:Landroid/widget/Spinner;

    .line 712
    const/4 v0, 0x6

    new-array v5, v0, [Ljava/lang/String;

    .line 713
    const/4 v0, 0x0

    :goto_1
    const/4 v6, 0x6

    if-ge v0, v6, :cond_4

    .line 714
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const v7, 0x7f0e00f4

    invoke-virtual {p1, v7}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v0

    .line 713
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 715
    :cond_4
    new-instance v0, Landroid/widget/ArrayAdapter;

    invoke-virtual {p1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v6

    const v7, 0x7f0a0028

    invoke-direct {v0, v6, v7, v5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 716
    iget-object v5, p0, Lcom/saterskog/cell_lab/i$d;->a:Landroid/widget/Spinner;

    invoke-virtual {v5, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 717
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$d;->a:Landroid/widget/Spinner;

    invoke-virtual {v0, v2}, Landroid/widget/Spinner;->setSelection(I)V

    .line 720
    const v0, 0x7f0800c4

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$d;->b:Landroid/widget/Spinner;

    .line 721
    const/16 v0, 0xc

    new-array v9, v0, [Ljava/lang/String;

    .line 722
    const/4 v5, 0x0

    const/4 v2, 0x0

    .line 723
    const/4 v0, 0x0

    move v7, v0

    :goto_2
    const/4 v0, 0x4

    if-ge v7, v0, :cond_8

    .line 724
    const/4 v0, 0x0

    move v6, v0

    move v0, v2

    move v2, v5

    :goto_3
    const/4 v5, 0x4

    if-ge v6, v5, :cond_7

    .line 725
    if-eq v7, v6, :cond_6

    .line 726
    if-ne v7, v4, :cond_5

    if-ne v6, v3, :cond_5

    move v0, v2

    .line 727
    :cond_5
    add-int/lit8 v5, v2, 0x1

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const v11, 0x7f0e00f5

    invoke-virtual {p1, v11}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    add-int/lit8 v11, v7, 0x1

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const v11, 0x7f0e00f8

    invoke-virtual {p1, v11}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    add-int/lit8 v11, v6, 0x1

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v2

    move v2, v5

    .line 724
    :cond_6
    add-int/lit8 v5, v6, 0x1

    move v6, v5

    goto :goto_3

    .line 723
    :cond_7
    add-int/lit8 v5, v7, 0x1

    move v7, v5

    move v5, v2

    move v2, v0

    goto :goto_2

    .line 729
    :cond_8
    new-instance v0, Landroid/widget/ArrayAdapter;

    invoke-virtual {p1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v3

    const v4, 0x7f0a0028

    invoke-direct {v0, v3, v4, v9}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 730
    iget-object v3, p0, Lcom/saterskog/cell_lab/i$d;->b:Landroid/widget/Spinner;

    invoke-virtual {v3, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 731
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$d;->b:Landroid/widget/Spinner;

    invoke-virtual {v0, v2}, Landroid/widget/Spinner;->setSelection(I)V

    .line 734
    const v0, 0x7f0800de

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$d;->e:Landroid/widget/TextView;

    .line 735
    const v0, 0x7f0800a6

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$d;->d:Landroid/widget/SeekBar;

    .line 737
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$d;->d:Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 739
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$d;->d:Landroid/widget/SeekBar;

    const/high16 v2, 0x3e800000    # 0.25f

    sub-float/2addr v1, v2

    const/high16 v2, 0x41100000    # 9.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x42400000    # 48.0f

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 741
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$d;->c:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0, v8}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 742
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$d;->c:Landroid/app/AlertDialog$Builder;

    invoke-virtual {p1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e005b

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/saterskog/cell_lab/i$d$1;

    invoke-direct {v2, p0, p1}, Lcom/saterskog/cell_lab/i$d$1;-><init>(Lcom/saterskog/cell_lab/i$d;Lcom/saterskog/cell_lab/i;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 748
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$d;->c:Landroid/app/AlertDialog$Builder;

    invoke-virtual {p1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e005d

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/saterskog/cell_lab/i$d$2;

    invoke-direct {v2, p0, p1}, Lcom/saterskog/cell_lab/i$d$2;-><init>(Lcom/saterskog/cell_lab/i$d;Lcom/saterskog/cell_lab/i;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 816
    invoke-direct {p0}, Lcom/saterskog/cell_lab/i$d;->a()V

    .line 817
    return-void

    :cond_9
    move v4, v3

    move v3, v2

    move v2, v1

    move v1, v0

    goto/16 :goto_0
.end method

.method private a()V
    .locals 7

    .prologue
    .line 868
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$d;->e:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    const v3, 0x7f0e00f9

    invoke-virtual {v2, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " = %1$,.2f "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$d;->j:Lcom/saterskog/cell_lab/i;

    const v3, 0x7f0e00d1

    invoke-virtual {v2, v3}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const/high16 v4, 0x3e800000    # 0.25f

    const/high16 v5, 0x41100000    # 9.0f

    iget-object v6, p0, Lcom/saterskog/cell_lab/i$d;->d:Landroid/widget/SeekBar;

    invoke-virtual {v6}, Landroid/widget/SeekBar;->getProgress()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v5, v6

    const/high16 v6, 0x42400000    # 48.0f

    div-float/2addr v5, v6

    add-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 869
    return-void
.end method


# virtual methods
.method final a(IFF)F
    .locals 16

    .prologue
    .line 820
    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    .line 821
    const/4 v4, 0x0

    .line 822
    const/4 v2, 0x0

    .line 824
    const/4 v3, 0x0

    .line 825
    move/from16 v0, p1

    new-array v10, v0, [F

    .line 826
    move/from16 v0, p1

    new-array v11, v0, [F

    .line 827
    const/4 v1, 0x1

    move v7, v1

    move v8, v5

    move v9, v6

    move v1, v2

    move v2, v4

    :goto_0
    const v4, 0x13880

    if-ge v7, v4, :cond_4

    .line 829
    const/high16 v4, -0x3f600000    # -5.0f

    mul-float/2addr v4, v9

    const/high16 v5, 0x41a00000    # 20.0f

    const/high16 v6, -0x3e600000    # -20.0f

    mul-float v12, p2, v9

    invoke-static {v6, v12}, Ljava/lang/Math;->max(FF)F

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    move-result v5

    add-float/2addr v4, v5

    const/high16 v5, 0x41a00000    # 20.0f

    const/high16 v6, -0x3e600000    # -20.0f

    mul-float v12, p3, v8

    invoke-static {v6, v12}, Ljava/lang/Math;->max(FF)F

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    move-result v5

    add-float/2addr v4, v5

    const v5, 0x3ba3d70a    # 0.005f

    mul-float/2addr v4, v5

    add-float v6, v9, v4

    .line 830
    const/high16 v4, -0x3f600000    # -5.0f

    mul-float/2addr v4, v8

    const/high16 v5, 0x41a00000    # 20.0f

    const/high16 v12, -0x3e600000    # -20.0f

    mul-float v13, p2, v8

    invoke-static {v12, v13}, Ljava/lang/Math;->max(FF)F

    move-result v12

    invoke-static {v5, v12}, Ljava/lang/Math;->min(FF)F

    move-result v5

    add-float/2addr v4, v5

    const/high16 v5, 0x41a00000    # 20.0f

    const/high16 v12, -0x3e600000    # -20.0f

    move/from16 v0, p3

    neg-float v13, v0

    mul-float/2addr v13, v9

    invoke-static {v12, v13}, Ljava/lang/Math;->max(FF)F

    move-result v12

    invoke-static {v5, v12}, Ljava/lang/Math;->min(FF)F

    move-result v5

    add-float/2addr v4, v5

    const v5, 0x3ba3d70a    # 0.005f

    mul-float/2addr v4, v5

    add-float v5, v8, v4

    .line 831
    const/4 v4, 0x0

    :goto_1
    move/from16 v0, p1

    if-ge v4, v0, :cond_0

    .line 832
    const/high16 v12, 0x40a00000    # 5.0f

    aget v13, v10, v4

    sub-float v13, v9, v13

    mul-float/2addr v12, v13

    const v13, 0x3ba3d70a    # 0.005f

    mul-float/2addr v12, v13

    sub-float/2addr v6, v12

    .line 833
    const/high16 v12, 0x40a00000    # 5.0f

    aget v13, v11, v4

    sub-float v13, v8, v13

    mul-float/2addr v12, v13

    const v13, 0x3ba3d70a    # 0.005f

    mul-float/2addr v12, v13

    sub-float/2addr v5, v12

    .line 834
    aget v12, v10, v4

    const/high16 v13, 0x40a00000    # 5.0f

    aget v14, v10, v4

    sub-float v14, v9, v14

    mul-float/2addr v13, v14

    const/high16 v14, 0x40a00000    # 5.0f

    aget v15, v10, v4

    mul-float/2addr v14, v15

    sub-float/2addr v13, v14

    const v14, 0x3ba3d70a    # 0.005f

    mul-float/2addr v13, v14

    add-float/2addr v12, v13

    aput v12, v10, v4

    .line 835
    aget v12, v11, v4

    const/high16 v13, 0x40a00000    # 5.0f

    aget v14, v11, v4

    sub-float v14, v8, v14

    mul-float/2addr v13, v14

    const/high16 v14, 0x40a00000    # 5.0f

    aget v15, v11, v4

    mul-float/2addr v14, v15

    sub-float/2addr v13, v14

    const v14, 0x3ba3d70a    # 0.005f

    mul-float/2addr v13, v14

    add-float/2addr v12, v13

    aput v12, v11, v4

    .line 831
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 840
    :cond_0
    mul-float v4, v5, v8

    const/4 v8, 0x0

    cmpg-float v4, v4, v8

    if-gez v4, :cond_2

    .line 841
    add-int/lit8 v2, v2, 0x1

    .line 842
    const/4 v4, 0x6

    if-ne v2, v4, :cond_1

    int-to-float v1, v7

    const v4, 0x3ba3d70a    # 0.005f

    mul-float/2addr v1, v4

    .line 843
    :cond_1
    const/16 v4, 0xe

    if-eq v2, v4, :cond_4

    .line 845
    :cond_2
    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v8, -0x40800000    # -1.0f

    invoke-static {v8, v6}, Ljava/lang/Math;->max(FF)F

    move-result v8

    invoke-static {v4, v8}, Ljava/lang/Math;->min(FF)F

    move-result v8

    .line 846
    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v9, -0x40800000    # -1.0f

    invoke-static {v9, v5}, Ljava/lang/Math;->max(FF)F

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    .line 847
    const/4 v4, 0x5

    if-le v2, v4, :cond_3

    cmpl-float v4, v8, v6

    if-eqz v4, :cond_3

    add-int/lit8 v3, v3, 0x1

    .line 827
    :cond_3
    add-int/lit8 v4, v7, 0x1

    move v7, v4

    move v9, v8

    move v8, v5

    goto/16 :goto_0

    .line 849
    :cond_4
    int-to-float v2, v7

    const v4, 0x3ba3d70a    # 0.005f

    mul-float/2addr v2, v4

    sub-float v1, v2, v1

    .line 850
    int-to-float v2, v3

    const v3, 0x3ba3d70a    # 0.005f

    mul-float/2addr v2, v3

    div-float/2addr v2, v1

    move-object/from16 v0, p0

    iput v2, v0, Lcom/saterskog/cell_lab/i$d;->i:F

    .line 852
    const/high16 v2, 0x40800000    # 4.0f

    div-float/2addr v1, v2

    return v1
.end method

.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    .prologue
    .line 673
    invoke-direct {p0}, Lcom/saterskog/cell_lab/i$d;->a()V

    .line 674
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .prologue
    .line 679
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .prologue
    .line 684
    return-void
.end method
