.class public final Lcom/saterskog/cell_lab/p;
.super Landroid/app/Fragment;
.source "SourceFile"

# interfaces
.implements Lcom/saterskog/cell_lab/q$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/saterskog/cell_lab/p$a;
    }
.end annotation


# instance fields
.field public a:Lcom/saterskog/cell_lab/r;

.field b:F

.field c:I

.field d:I

.field e:I

.field f:D

.field g:Lcom/saterskog/cell_lab/CellWorld;

.field h:Z

.field i:Ljava/lang/String;

.field j:Ljava/io/InputStream;

.field public k:Z

.field l:Z

.field m:Landroid/widget/TextView;

.field n:Landroid/widget/TextView;

.field o:Landroid/widget/TextView;

.field private p:Lcom/saterskog/cell_lab/p$a;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 34
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 52
    const/4 v0, -0x1

    iput v0, p0, Lcom/saterskog/cell_lab/p;->c:I

    .line 55
    iput-boolean v1, p0, Lcom/saterskog/cell_lab/p;->h:Z

    .line 60
    iput-boolean v1, p0, Lcom/saterskog/cell_lab/p;->l:Z

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 14

    .prologue
    const/4 v13, 0x1

    const/4 v12, 0x0

    .line 428
    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    .line 433
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->o:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 446
    :goto_0
    return-void

    .line 436
    :cond_0
    iget v0, p0, Lcom/saterskog/cell_lab/p;->b:F

    div-float/2addr v0, p1

    .line 437
    float-to-double v2, v0

    const-wide v4, 0x4072c00000000000L    # 300.0

    cmpl-double v1, v2, v4

    if-lez v1, :cond_1

    .line 438
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/p;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1, v12, v13}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 439
    :cond_1
    const/high16 v1, 0x447a0000    # 1000.0f

    cmpg-float v1, v1, v0

    if-gez v1, :cond_2

    .line 440
    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->log10(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v1, v2

    .line 441
    iget-object v2, p0, Lcom/saterskog/cell_lab/p;->o:Landroid/widget/TextView;

    const-string v3, "%.2f\u00b710<sup><small>%d</small></sup>\u00d7"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    float-to-double v6, v0

    const-wide/high16 v8, 0x4024000000000000L    # 10.0

    neg-int v0, v1

    int-to-double v10, v0

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v8

    mul-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    aput-object v0, v4, v12

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v13

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 444
    :cond_2
    iget-object v1, p0, Lcom/saterskog/cell_lab/p;->o:Landroid/widget/TextView;

    const-string v2, "%.0f\u00d7"

    new-array v3, v13, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, v3, v12

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public final a(I)V
    .locals 5

    .prologue
    const/16 v2, 0x8

    const/4 v4, 0x4

    const/4 v1, 0x0

    .line 270
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->m:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 271
    iget-object v3, p0, Lcom/saterskog/cell_lab/p;->m:Landroid/widget/TextView;

    if-ne p1, v4, :cond_2

    move v0, v1

    :goto_0
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 272
    :cond_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->m:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 273
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->n:Landroid/widget/TextView;

    if-ne p1, v4, :cond_3

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 276
    :cond_1
    return-void

    :cond_2
    move v0, v2

    .line 271
    goto :goto_0

    :cond_3
    move v1, v2

    .line 273
    goto :goto_1
.end method

.method public final a(Lcom/saterskog/cell_lab/CellWorld;)V
    .locals 1

    .prologue
    .line 423
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->p:Lcom/saterskog/cell_lab/p$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->p:Lcom/saterskog/cell_lab/p$a;

    invoke-interface {v0, p1}, Lcom/saterskog/cell_lab/p$a;->a(Lcom/saterskog/cell_lab/CellWorld;)V

    .line 424
    :cond_0
    return-void
.end method

.method public final a(Lcom/saterskog/cell_lab/CellWorld;I)V
    .locals 18

    .prologue
    .line 281
    invoke-virtual/range {p0 .. p0}, Lcom/saterskog/cell_lab/p;->isAdded()Z

    move-result v2

    if-nez v2, :cond_0

    .line 419
    :goto_0
    return-void

    .line 282
    :cond_0
    const-string v2, ""

    const-string v5, ""

    .line 285
    const/4 v3, -0x1

    move/from16 v0, p2

    if-eq v0, v3, :cond_24

    .line 286
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v6, v3, p2

    .line 288
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const v3, 0x7f0e001f

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v7, 0x0

    iget-wide v8, v6, Lcom/saterskog/cell_lab/Cell;->o:D

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    aput-object v8, v4, v7

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 289
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const v3, 0x7f0e0025

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v7, 0x0

    iget-wide v8, v6, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide/high16 v10, 0x4024000000000000L    # 10.0

    mul-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    aput-object v8, v4, v7

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 290
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const v3, 0x7f0e0021

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v7, 0x0

    iget-wide v8, v6, Lcom/saterskog/cell_lab/Cell;->d:D

    const-wide v10, 0x408f400000000000L    # 1000.0

    mul-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    aput-object v8, v4, v7

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 291
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const v3, 0x7f0e0028

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v7, 0x0

    iget-wide v8, v6, Lcom/saterskog/cell_lab/Cell;->p:D

    const-wide/high16 v10, 0x4059000000000000L    # 100.0

    mul-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    aput-object v8, v4, v7

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 292
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const v3, 0x7f0e0035

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v7, 0x0

    iget v8, v6, Lcom/saterskog/cell_lab/Cell;->X:F

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    aput-object v8, v4, v7

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const v3, 0x7f0e0124

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 293
    iget v3, v6, Lcom/saterskog/cell_lab/Cell;->Y:F

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    if-eqz v3, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const v3, 0x7f0e0022

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v7, 0x0

    const/high16 v8, 0x42c80000    # 100.0f

    iget v9, v6, Lcom/saterskog/cell_lab/Cell;->Y:F

    mul-float/2addr v8, v9

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    aput-object v8, v4, v7

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 294
    :cond_1
    iget-wide v8, v6, Lcom/saterskog/cell_lab/Cell;->q:D

    const-wide/16 v10, 0x0

    cmpl-double v3, v8, v10

    if-eqz v3, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const v3, 0x7f0e0023

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v7, 0x0

    iget-wide v8, v6, Lcom/saterskog/cell_lab/Cell;->q:D

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    aput-object v8, v4, v7

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 295
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/saterskog/cell_lab/p;->getActivity()Landroid/app/Activity;

    move-result-object v3

    const/4 v4, 0x2

    invoke-static {v3, v4}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;I)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 296
    const/4 v3, 0x0

    :goto_1
    const/16 v4, 0x10

    if-ge v3, v4, :cond_3

    .line 297
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "\n"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const v4, 0x7f0e0123

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    add-int/lit8 v4, v3, 0x1

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ": "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "%.2f "

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    const/high16 v9, -0x40800000    # -1.0f

    iget-object v12, v6, Lcom/saterskog/cell_lab/Cell;->U:[F

    aget v12, v12, v3

    invoke-static {v9, v12}, Ljava/lang/Math;->max(FF)F

    move-result v9

    float-to-double v12, v9

    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->min(DD)D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-static {v4, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const v4, 0x7f0e0124

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 296
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move-object v2, v4

    goto :goto_1

    .line 303
    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v4, 0x7f0e001e

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "<font color=\'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "#%02x%02x%02x"

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v7, 0x0

    const/high16 v8, 0x437f0000    # 255.0f

    iget-object v9, v6, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v10, 0x0

    aget v9, v9, v10

    mul-float/2addr v8, v9

    float-to-int v8, v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v5, v7

    const/4 v7, 0x1

    const/high16 v8, 0x437f0000    # 255.0f

    iget-object v9, v6, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v10, 0x1

    aget v9, v9, v10

    mul-float/2addr v8, v9

    float-to-int v8, v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v5, v7

    const/4 v7, 0x2

    const/high16 v8, 0x437f0000    # 255.0f

    iget-object v9, v6, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v10, 0x2

    aget v9, v9, v10

    mul-float/2addr v8, v9

    float-to-int v8, v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v5, v7

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\'>M"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, v6, Lcom/saterskog/cell_lab/Cell;->D:I

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "</font><br>"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 304
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v4, 0x7f0e0036

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/saterskog/cell_lab/p;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f020003

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6}, Lcom/saterskog/cell_lab/Cell;->b()Lcom/saterskog/cell_lab/Gene;

    move-result-object v5

    iget-object v5, v5, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v5}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v5

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "<br>"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 305
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v4, 0x7f0e0026

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-boolean v3, v6, Lcom/saterskog/cell_lab/Cell;->y:Z

    if-eqz v3, :cond_22

    const v3, 0x7f0e01b1

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v3

    :goto_2
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "<br>"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 306
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v4, 0x7f0e002c

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 307
    iget v4, v6, Lcom/saterskog/cell_lab/Cell;->E:I

    const/4 v5, 0x1

    if-ne v4, v5, :cond_4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v4, 0x7f0e0033

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 308
    :cond_4
    iget v4, v6, Lcom/saterskog/cell_lab/Cell;->E:I

    if-nez v4, :cond_5

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v4, 0x7f0e002d

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 309
    :cond_5
    iget v4, v6, Lcom/saterskog/cell_lab/Cell;->E:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_6

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v4, 0x7f0e002e

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 310
    :cond_6
    iget v4, v6, Lcom/saterskog/cell_lab/Cell;->E:I

    const/4 v5, 0x4

    if-ne v4, v5, :cond_7

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v4, 0x7f0e0032

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 311
    :cond_7
    iget v4, v6, Lcom/saterskog/cell_lab/Cell;->E:I

    const/4 v5, 0x3

    if-ne v4, v5, :cond_8

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v4, 0x7f0e0030

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 312
    :cond_8
    iget v4, v6, Lcom/saterskog/cell_lab/Cell;->E:I

    const/4 v5, 0x5

    if-ne v4, v5, :cond_9

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v4, 0x7f0e0031

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 313
    :cond_9
    iget v4, v6, Lcom/saterskog/cell_lab/Cell;->E:I

    const/4 v5, 0x6

    if-ne v4, v5, :cond_a

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v4, 0x7f0e002f

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 314
    :cond_a
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "<br>"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 315
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v4, 0x7f0e0027

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, v6, Lcom/saterskog/cell_lab/Cell;->G:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "<br>"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 316
    iget v4, v6, Lcom/saterskog/cell_lab/Cell;->T:I

    const/4 v5, -0x1

    if-eq v4, v5, :cond_b

    .line 317
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v4, 0x7f0e0034

    move-object/from16 v0, p0

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, v6, Lcom/saterskog/cell_lab/Cell;->T:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "<br>"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 319
    :cond_b
    const/4 v4, -0x1

    move/from16 v0, p2

    if-eq v0, v4, :cond_25

    .line 320
    invoke-virtual {v6}, Lcom/saterskog/cell_lab/Cell;->b()Lcom/saterskog/cell_lab/Gene;

    move-result-object v4

    iget-object v4, v4, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    .line 321
    sget-object v5, Lcom/saterskog/cell_lab/h;->g:Lcom/saterskog/cell_lab/h;

    if-ne v4, v5, :cond_c

    .line 323
    const/4 v5, 0x1

    const/4 v7, 0x0

    invoke-virtual {v6, v5, v7}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v5

    .line 324
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v7, 0x7f0e0020

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v7, "\u03c1<sub><small>H<sub><small>2</small></sub>O</small></sub> "

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const/4 v3, 0x0

    cmpg-float v3, v5, v3

    if-gez v3, :cond_23

    const-string v3, "- "

    :goto_3
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v7, "%.0f"

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    const/high16 v10, 0x42c80000    # 100.0f

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    mul-float/2addr v5, v10

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v8, v9

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " kg/m<sup><small>3</small></sup>"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 326
    :cond_c
    sget-object v5, Lcom/saterskog/cell_lab/h;->b:Lcom/saterskog/cell_lab/h;

    if-ne v4, v5, :cond_d

    .line 328
    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-virtual {v6, v5, v7}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v5

    .line 330
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v7, 0x7f0e002b

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    const v10, 0x4076e9e0

    mul-float/2addr v5, v10

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v8, v9

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 331
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v5, 0x7f0e002a

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    const-wide v10, 0x407f400000000000L    # 500.0

    iget-wide v12, v6, Lcom/saterskog/cell_lab/Cell;->e:D

    iget-wide v14, v6, Lcom/saterskog/cell_lab/Cell;->e:D

    mul-double/2addr v12, v14

    iget-wide v14, v6, Lcom/saterskog/cell_lab/Cell;->f:D

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->f:D

    move-wide/from16 v16, v0

    mul-double v14, v14, v16

    add-double/2addr v12, v14

    invoke-static {v12, v13}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v12

    mul-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 333
    :cond_d
    sget-object v5, Lcom/saterskog/cell_lab/h;->m:Lcom/saterskog/cell_lab/h;

    if-ne v4, v5, :cond_e

    .line 336
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v5, 0x7f0e00e2

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, ": %.2f"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    const/4 v9, 0x3

    const/4 v10, 0x0

    invoke-virtual {v6, v9, v10}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, "<br>"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 337
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v5, 0x7f0e00e1

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, ": %.2f"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-virtual {v6, v9, v10}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, "<br>"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 338
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v5, 0x7f0e00e3

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, ": %.2f"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    invoke-virtual {v6, v9, v10}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, "<br>"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 340
    :cond_e
    sget-object v5, Lcom/saterskog/cell_lab/h;->e:Lcom/saterskog/cell_lab/h;

    if-ne v4, v5, :cond_f

    .line 343
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v5, 0x7f0e0024

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    iget v9, v6, Lcom/saterskog/cell_lab/Cell;->S:F

    const/high16 v10, 0x41200000    # 10.0f

    mul-float/2addr v9, v10

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 345
    :cond_f
    sget-object v5, Lcom/saterskog/cell_lab/h;->o:Lcom/saterskog/cell_lab/h;

    if-ne v4, v5, :cond_18

    .line 347
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v5, 0x7f0e00c9

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, ": "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 348
    const/4 v5, 0x4

    invoke-virtual {v6, v5}, Lcom/saterskog/cell_lab/Cell;->b(I)I

    move-result v5

    .line 349
    const/4 v7, 0x1

    if-ne v5, v7, :cond_10

    .line 350
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v7, 0x7f0e010d

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 351
    :cond_10
    if-nez v5, :cond_11

    .line 352
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v7, 0x7f0e010e

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 353
    :cond_11
    const/4 v7, 0x4

    if-ne v5, v7, :cond_12

    .line 354
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v7, 0x7f0e010c

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 355
    :cond_12
    const/4 v7, 0x2

    if-ne v5, v7, :cond_13

    .line 356
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v7, 0x7f0e0111

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 357
    :cond_13
    const/4 v7, 0x3

    if-ne v5, v7, :cond_14

    .line 358
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v7, 0x7f0e0110

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 359
    :cond_14
    const/4 v7, 0x5

    if-ne v5, v7, :cond_15

    .line 360
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v7, 0x7f0e010f

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 361
    :cond_15
    const/4 v7, 0x6

    if-ne v5, v7, :cond_16

    .line 362
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v7, 0x7f0e0112

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 363
    :cond_16
    const/4 v7, 0x7

    if-lt v5, v7, :cond_17

    const/16 v7, 0x17

    if-ge v5, v7, :cond_17

    .line 364
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v7, "-"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v7, 0x7f0e0123

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    add-int/lit8 v7, v5, 0x1

    add-int/lit8 v7, v7, -0x7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 365
    :cond_17
    const/4 v7, 0x7

    if-lt v5, v7, :cond_18

    const/16 v7, 0x17

    if-lt v5, v7, :cond_18

    .line 366
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v7, "+"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v7, 0x7f0e0123

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v5, v5, -0x7

    add-int/lit8 v5, v5, -0x10

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 368
    :cond_18
    sget-object v5, Lcom/saterskog/cell_lab/h;->l:Lcom/saterskog/cell_lab/h;

    if-eq v4, v5, :cond_19

    sget-object v5, Lcom/saterskog/cell_lab/h;->k:Lcom/saterskog/cell_lab/h;

    if-ne v4, v5, :cond_20

    .line 369
    :cond_19
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v5, 0x7f0e009f

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, ": "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 370
    const/4 v5, 0x3

    invoke-virtual {v6, v5}, Lcom/saterskog/cell_lab/Cell;->b(I)I

    move-result v5

    .line 372
    if-nez v5, :cond_1a

    .line 373
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v7, 0x7f0e0132

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 374
    :cond_1a
    const/4 v7, 0x5

    if-ne v5, v7, :cond_1b

    .line 375
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v7, 0x7f0e0137

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 376
    :cond_1b
    const/4 v7, 0x3

    if-ne v5, v7, :cond_1c

    .line 377
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v7, 0x7f0e0134

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 378
    :cond_1c
    const/4 v7, 0x1

    if-ne v5, v7, :cond_1d

    .line 379
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v7, 0x7f0e0133

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 380
    :cond_1d
    const/4 v7, 0x2

    if-ne v5, v7, :cond_1e

    .line 381
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v7, 0x7f0e0135

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 382
    :cond_1e
    const/4 v7, 0x4

    if-ne v5, v7, :cond_1f

    .line 383
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v5, 0x7f0e0136

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 384
    :cond_1f
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, "<br>"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 386
    :cond_20
    sget-object v5, Lcom/saterskog/cell_lab/h;->n:Lcom/saterskog/cell_lab/h;

    if-eq v4, v5, :cond_21

    sget-object v5, Lcom/saterskog/cell_lab/h;->l:Lcom/saterskog/cell_lab/h;

    if-eq v4, v5, :cond_21

    sget-object v5, Lcom/saterskog/cell_lab/h;->k:Lcom/saterskog/cell_lab/h;

    if-ne v4, v5, :cond_25

    .line 388
    :cond_21
    const/4 v4, 0x0

    :goto_4
    const/16 v5, 0x10

    if-ge v4, v5, :cond_25

    .line 395
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v5, 0x7f0e0123

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    add-int/lit8 v5, v4, 0x1

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const v5, 0x7f0e001d

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    iget-object v9, v6, Lcom/saterskog/cell_lab/Cell;->V:[F

    aget v9, v9, v4

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v5, 0x7f0e0124

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, "/"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v5, 0x7f0e00d1

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, "<br>"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 388
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 305
    :cond_22
    const v3, 0x7f0e01b0

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_2

    .line 324
    :cond_23
    const-string v3, "+ "

    goto/16 :goto_3

    .line 404
    :cond_24
    const v2, 0x7f0e0029

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 405
    const-string v3, ""

    .line 411
    :cond_25
    invoke-virtual/range {p0 .. p0}, Lcom/saterskog/cell_lab/p;->getActivity()Landroid/app/Activity;

    move-result-object v4

    new-instance v5, Lcom/saterskog/cell_lab/p$2;

    move-object/from16 v0, p0

    invoke-direct {v5, v0, v2, v3}, Lcom/saterskog/cell_lab/p$2;-><init>(Lcom/saterskog/cell_lab/p;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto/16 :goto_0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 4

    .prologue
    .line 494
    invoke-super {p0, p1}, Landroid/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 496
    :try_start_0
    move-object v0, p1

    check-cast v0, Lcom/saterskog/cell_lab/p$a;

    move-object v1, v0

    iput-object v1, p0, Lcom/saterskog/cell_lab/p;->p:Lcom/saterskog/cell_lab/p$a;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 499
    return-void

    .line 498
    :catch_0
    move-exception v1

    new-instance v1, Ljava/lang/ClassCastException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " must implement CellProvider"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    .prologue
    .line 64
    invoke-super {p0, p1, p2, p3}, Landroid/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 67
    if-eqz p3, :cond_2

    .line 68
    :try_start_0
    const-string v0, "mCellWorld"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/CellWorld;

    iput-object v0, p0, Lcom/saterskog/cell_lab/p;->g:Lcom/saterskog/cell_lab/CellWorld;

    .line 69
    const-string v0, "radius"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/p;->f:D

    .line 70
    const-string v0, "challenge"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/p;->c:I

    .line 111
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->g:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Environment;->k:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/p;->f:D
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    :goto_1
    new-instance v8, Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/p;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {v8, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 123
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->g:Lcom/saterskog/cell_lab/CellWorld;

    if-eqz v0, :cond_1

    .line 124
    new-instance v0, Lcom/saterskog/cell_lab/r;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/p;->getActivity()Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lcom/saterskog/cell_lab/p;->g:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v3, p0, Lcom/saterskog/cell_lab/p;->p:Lcom/saterskog/cell_lab/p$a;

    iget v5, p0, Lcom/saterskog/cell_lab/p;->c:I

    iget-wide v6, p0, Lcom/saterskog/cell_lab/p;->f:D

    move-object v4, p0

    invoke-direct/range {v0 .. v7}, Lcom/saterskog/cell_lab/r;-><init>(Landroid/app/Activity;Lcom/saterskog/cell_lab/CellWorld;Lcom/saterskog/cell_lab/p$a;Lcom/saterskog/cell_lab/q$a;ID)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    .line 125
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    const v1, 0x7f08006f

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/r;->setId(I)V

    .line 127
    if-eqz p3, :cond_6

    .line 128
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    iget-object v0, v0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    const-string v1, "mode"

    invoke-virtual {p3, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/saterskog/cell_lab/q;->z:I

    .line 129
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    iget-object v0, v0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    const-string v1, "tool"

    invoke-virtual {p3, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/saterskog/cell_lab/q;->A:I

    .line 130
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    iget-object v0, v0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    const-string v1, "hasWon"

    invoke-virtual {p3, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/saterskog/cell_lab/q;->M:Z

    .line 137
    :goto_2
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    invoke-virtual {v8, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 139
    :cond_1
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/p;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 140
    const/4 v1, 0x1

    const/high16 v2, 0x41000000    # 8.0f

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v4, v0

    .line 142
    const/4 v1, 0x0

    .line 143
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/p;->getActivity()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/PlayActivity;

    .line 144
    if-eqz v0, :cond_a

    iget-object v2, v0, Lcom/saterskog/cell_lab/PlayActivity;->D:Ljava/io/File;

    if-eqz v2, :cond_a

    .line 145
    const/4 v3, 0x0

    .line 146
    new-instance v2, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/p;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 147
    const v1, 0x7f08006e

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setId(I)V

    .line 148
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/p;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v5, "log_stats"

    const-string v6, "none"

    invoke-interface {v1, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 149
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/p;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v6, 0x7f02000a

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v6

    .line 151
    const/4 v1, 0x0

    :goto_3
    array-length v7, v6

    if-ge v1, v7, :cond_7

    .line 152
    aget-object v7, v6, v1

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7

    .line 151
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 72
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->p:Lcom/saterskog/cell_lab/p$a;

    invoke-interface {v0}, Lcom/saterskog/cell_lab/p$a;->c()Lcom/saterskog/cell_lab/Environment;

    move-result-object v1

    .line 74
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/p;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v2, "activity"

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 75
    new-instance v2, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v2}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 76
    invoke-virtual {v0, v2}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 77
    iget-wide v2, v2, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    invoke-static {v1}, Lcom/saterskog/cell_lab/CellWorld;->a(Lcom/saterskog/cell_lab/Environment;)J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-gez v0, :cond_3

    .line 78
    const-string v0, "Estimated memory to not be enough"

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 79
    new-instance v0, Ljava/lang/OutOfMemoryError;

    invoke-direct {v0}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw v0
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    .line 113
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/cell_lab/p;->g:Lcom/saterskog/cell_lab/CellWorld;

    .line 115
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/p;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e019c

    invoke-virtual {p0, v1}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 116
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/p;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto/16 :goto_1

    .line 82
    :cond_3
    :try_start_2
    new-instance v0, Lcom/saterskog/cell_lab/CellWorld;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lcom/saterskog/cell_lab/CellWorld;-><init>(ZLcom/saterskog/cell_lab/Environment;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/p;->g:Lcom/saterskog/cell_lab/CellWorld;

    .line 83
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->j:Ljava/io/InputStream;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0

    if-eqz v0, :cond_0

    .line 87
    :try_start_3
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->g:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v1, p0, Lcom/saterskog/cell_lab/p;->j:Ljava/io/InputStream;

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->a(Ljava/io/InputStream;)I

    move-result v0

    .line 88
    iget v1, p0, Lcom/saterskog/cell_lab/p;->c:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_4

    iget-boolean v1, p0, Lcom/saterskog/cell_lab/p;->k:Z

    if-eqz v1, :cond_4

    const/16 v1, 0xbee

    if-ge v0, v1, :cond_4

    .line 89
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/p;->getActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "format conversion v"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " \u2192 Enzyme Mod"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 91
    :cond_4
    iget v0, p0, Lcom/saterskog/cell_lab/p;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    .line 92
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->g:Lcom/saterskog/cell_lab/CellWorld;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->c(I)V

    .line 93
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->g:Lcom/saterskog/cell_lab/CellWorld;

    const-wide/16 v2, 0x0

    iput-wide v2, v0, Lcom/saterskog/cell_lab/CellWorld;->M:D

    .line 95
    :cond_5
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->j:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 96
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/p;->l:Z

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->g:Lcom/saterskog/cell_lab/CellWorld;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->c(I)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/StreamCorruptedException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_0

    .line 101
    :catch_1
    move-exception v0

    :try_start_4
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    goto/16 :goto_0

    .line 104
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/io/StreamCorruptedException;->printStackTrace()V

    goto/16 :goto_0

    .line 105
    :catch_3
    move-exception v0

    .line 106
    const-string v1, "io this is bad"

    invoke-static {v1}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 107
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_0

    goto/16 :goto_0

    .line 132
    :cond_6
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    iget-object v0, v0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    iget v1, p0, Lcom/saterskog/cell_lab/p;->e:I

    iput v1, v0, Lcom/saterskog/cell_lab/q;->A:I

    goto/16 :goto_2

    .line 155
    :cond_7
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const v6, 0x7f0e00d5

    invoke-virtual {p0, v6}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/p;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f020009

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v6

    aget-object v1, v6, v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const v5, 0x7f0e00d6

    invoke-virtual {p0, v5}, Lcom/saterskog/cell_lab/p;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v5, v0, Lcom/saterskog/cell_lab/PlayActivity;->D:Ljava/io/File;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    const/4 v1, -0x1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 157
    const/4 v1, 0x1

    const/high16 v5, 0x41600000    # 14.0f

    invoke-virtual {v2, v1, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 158
    const/16 v1, 0xc0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v1, v5, v6, v7}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 159
    iget-object v0, v0, Lcom/saterskog/cell_lab/PlayActivity;->D:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    .line 160
    new-instance v1, Lcom/saterskog/cell_lab/p$1;

    invoke-direct {v1, p0, v0}, Lcom/saterskog/cell_lab/p$1;-><init>(Lcom/saterskog/cell_lab/p;Ljava/io/File;)V

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 179
    invoke-virtual {v2, v4, v4, v4, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 181
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v5, -0x2

    invoke-direct {v0, v1, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 183
    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 185
    invoke-virtual {v8, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    move-object v0, v2

    move v1, v3

    .line 188
    :goto_4
    new-instance v2, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/p;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/saterskog/cell_lab/p;->m:Landroid/widget/TextView;

    .line 190
    iget-object v2, p0, Lcom/saterskog/cell_lab/p;->m:Landroid/widget/TextView;

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 191
    iget-object v2, p0, Lcom/saterskog/cell_lab/p;->m:Landroid/widget/TextView;

    const/4 v3, 0x1

    const/high16 v5, 0x41600000    # 14.0f

    invoke-virtual {v2, v3, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 192
    iget-object v2, p0, Lcom/saterskog/cell_lab/p;->m:Landroid/widget/TextView;

    const/16 v3, 0xc0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v3, v5, v6, v7}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 194
    iget-object v2, p0, Lcom/saterskog/cell_lab/p;->m:Landroid/widget/TextView;

    invoke-virtual {v2, v4, v4, v4, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 195
    iget-object v2, p0, Lcom/saterskog/cell_lab/p;->m:Landroid/widget/TextView;

    invoke-virtual {v8}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setMinimumWidth(I)V

    .line 196
    iget-object v2, p0, Lcom/saterskog/cell_lab/p;->m:Landroid/widget/TextView;

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 198
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x2

    const/4 v5, -0x2

    invoke-direct {v2, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 200
    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v5, -0x2

    const/4 v6, -0x2

    invoke-direct {v3, v5, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 203
    if-nez v0, :cond_9

    .line 204
    const/16 v0, 0xc

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 205
    const/16 v0, 0xc

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 212
    :goto_5
    const/16 v0, 0x9

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 213
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->m:Landroid/widget/TextView;

    const v5, 0x7f08006c

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setId(I)V

    .line 214
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->m:Landroid/widget/TextView;

    invoke-virtual {v8, v0, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 216
    new-instance v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/p;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/p;->n:Landroid/widget/TextView;

    .line 218
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->n:Landroid/widget/TextView;

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 219
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->n:Landroid/widget/TextView;

    const/4 v2, 0x1

    const/high16 v5, 0x41600000    # 14.0f

    invoke-virtual {v0, v2, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 220
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->n:Landroid/widget/TextView;

    const/16 v2, 0xc0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v2, v5, v6, v7}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 222
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v4, v4, v4, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 223
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->n:Landroid/widget/TextView;

    invoke-virtual {v8}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMinimumWidth(I)V

    .line 224
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->n:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 228
    const/16 v0, 0xb

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 229
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->n:Landroid/widget/TextView;

    const v1, 0x7f08006d

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setId(I)V

    .line 230
    const/4 v0, 0x1

    const v1, 0x7f08006c

    invoke-virtual {v3, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 231
    const/4 v0, 0x6

    const v1, 0x7f08006c

    invoke-virtual {v3, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 234
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->n:Landroid/widget/TextView;

    invoke-virtual {v8, v0, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 238
    new-instance v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/p;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/p;->o:Landroid/widget/TextView;

    .line 240
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->o:Landroid/widget/TextView;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 241
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->o:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/high16 v2, 0x41900000    # 18.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 244
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v4, v4, v4, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 249
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 252
    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 254
    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 257
    iget-object v1, p0, Lcom/saterskog/cell_lab/p;->o:Landroid/widget/TextView;

    invoke-virtual {v8, v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 260
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/p;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 262
    iget v1, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x43200000    # 160.0f

    mul-float/2addr v1, v2

    float-to-double v2, v1

    .line 263
    const-wide v4, 0x3f9a027525460aa6L    # 0.0254

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-double v0, v0

    mul-double/2addr v0, v4

    div-double/2addr v0, v2

    double-to-float v0, v0

    iput v0, p0, Lcom/saterskog/cell_lab/p;->b:F

    .line 265
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->g:Lcom/saterskog/cell_lab/CellWorld;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    iget-object v0, v0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    iget v0, v0, Lcom/saterskog/cell_lab/q;->A:I

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/p;->a(I)V

    .line 267
    :cond_8
    return-object v8

    .line 208
    :cond_9
    const/4 v0, 0x2

    const v5, 0x7f08006e

    invoke-virtual {v2, v0, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 209
    const/4 v0, 0x2

    const v5, 0x7f08006e

    invoke-virtual {v3, v0, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    goto/16 :goto_5

    :cond_a
    move-object v0, v1

    move v1, v4

    goto/16 :goto_4
.end method

.method public final onDestroy()V
    .locals 0

    .prologue
    .line 462
    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    .line 464
    return-void
.end method

.method public final onPause()V
    .locals 0

    .prologue
    .line 467
    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    .line 470
    return-void
.end method

.method public final onResume()V
    .locals 0

    .prologue
    .line 473
    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    .line 476
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 479
    invoke-super {p0, p1}, Landroid/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 480
    iget-object v0, p0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    iget-object v0, v0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    .line 1797
    iget-object v1, v0, Lcom/saterskog/cell_lab/q;->F:Ljava/util/concurrent/Future;

    if-eqz v1, :cond_0

    .line 1799
    :try_start_0
    iget-object v0, v0, Lcom/saterskog/cell_lab/q;->F:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1

    .line 482
    :cond_0
    :goto_0
    :try_start_1
    const-string v0, "mCellWorld"

    iget-object v1, p0, Lcom/saterskog/cell_lab/p;->g:Lcom/saterskog/cell_lab/CellWorld;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 483
    const-string v0, "radius"

    iget-wide v2, p0, Lcom/saterskog/cell_lab/p;->f:D

    invoke-virtual {p1, v0, v2, v3}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    .line 484
    const-string v0, "mode"

    iget-object v1, p0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    iget-object v1, v1, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    iget v1, v1, Lcom/saterskog/cell_lab/q;->z:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 485
    const-string v0, "tool"

    iget-object v1, p0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    iget-object v1, v1, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    iget v1, v1, Lcom/saterskog/cell_lab/q;->A:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 486
    const-string v0, "challenge"

    iget v1, p0, Lcom/saterskog/cell_lab/p;->c:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 487
    const-string v0, "hasWon"

    iget-object v1, p0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    iget-object v1, v1, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    iget-boolean v1, v1, Lcom/saterskog/cell_lab/q;->M:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2

    .line 491
    :goto_1
    return-void

    .line 1802
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    .line 1805
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->printStackTrace()V

    goto :goto_0

    .line 489
    :catch_2
    move-exception v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/p;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "Not enough memory"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_1
.end method

.method public final onStart()V
    .locals 0

    .prologue
    .line 451
    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    .line 454
    return-void
.end method

.method public final onStop()V
    .locals 0

    .prologue
    .line 457
    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    .line 459
    return-void
.end method
