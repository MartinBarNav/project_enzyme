.class public final Lcom/saterskog/cell_lab/o;
.super Landroid/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/saterskog/cell_lab/o$a;
    }
.end annotation


# instance fields
.field a:Lcom/saterskog/cell_lab/Environment;

.field b:Landroid/widget/TextView;

.field private c:Lcom/saterskog/cell_lab/o$a;

.field private d:Lcom/saterskog/cell_lab/GenePoolView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/cell_lab/o;->c:Lcom/saterskog/cell_lab/o$a;

    return-void
.end method

.method static synthetic a(Lcom/saterskog/cell_lab/o;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/saterskog/cell_lab/o;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method private a(IDD)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 383
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/o;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    .line 392
    :goto_0
    return-object v0

    .line 384
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/o;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0103

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%1$,.1f"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {p4, p5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/o;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e00d1

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 385
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/o;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0104

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 390
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 391
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/o;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e0105

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%1$,.1f"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/saterskog/cell_lab/o;IDD)Ljava/lang/String;
    .locals 2

    .prologue
    .line 22
    invoke-direct/range {p0 .. p5}, Lcom/saterskog/cell_lab/o;->a(IDD)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(ID)V
    .locals 4

    .prologue
    .line 307
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/o;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    .line 308
    if-eqz v0, :cond_0

    .line 309
    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v2, p2

    double-to-int v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 310
    :cond_0
    return-void
.end method

.method private a(IZ)V
    .locals 1

    .prologue
    .line 312
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/o;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 313
    if-eqz v0, :cond_0

    .line 314
    invoke-virtual {v0, p2}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 315
    :cond_0
    return-void
.end method

.method private a(Landroid/view/View;I)V
    .locals 1

    .prologue
    .line 127
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    invoke-virtual {v0, p0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 128
    return-void
.end method

.method private b()V
    .locals 2

    .prologue
    .line 259
    iget-object v0, p0, Lcom/saterskog/cell_lab/o;->c:Lcom/saterskog/cell_lab/o$a;

    iget-object v1, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    invoke-interface {v0, v1}, Lcom/saterskog/cell_lab/o$a;->a(Lcom/saterskog/cell_lab/Environment;)V

    .line 260
    return-void
.end method

.method private b(Landroid/view/View;I)V
    .locals 1

    .prologue
    .line 130
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 131
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 13

    .prologue
    const/4 v12, 0x1

    const-wide/high16 v10, 0x4020000000000000L    # 8.0

    const-wide/16 v8, 0x0

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    const/4 v1, 0x0

    .line 268
    const v0, 0x7f080096

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->c:D

    const-wide v4, 0x3fb70a3d70a3d70aL    # 0.09

    div-double/2addr v2, v4

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/o;->a(ID)V

    .line 269
    const v0, 0x7f08007c

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->a:D

    const-wide v4, 0x402dffffffffffffL    # 14.999999999999998

    div-double/2addr v2, v4

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/o;->a(ID)V

    .line 270
    const v0, 0x7f080083

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->b:D

    const-wide v4, 0x3f961e4f765fd8adL    # 0.021599999999999998

    sub-double/2addr v2, v4

    const-wide v4, 0x3ff2161e4f765fd8L    # 1.1303999999999998

    div-double/2addr v2, v4

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/o;->a(ID)V

    .line 271
    const v0, 0x7f08007f

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->p:D

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    div-double/2addr v2, v4

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/o;->a(ID)V

    .line 272
    const v0, 0x7f080080

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->q:D

    const-wide v4, 0x3f847ae147ae147bL    # 0.01

    sub-double/2addr v2, v4

    const-wide v4, 0x3fc851eb851eb852L    # 0.19

    div-double/2addr v2, v4

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/o;->a(ID)V

    .line 273
    const v0, 0x7f08007d

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget v2, v2, Lcom/saterskog/cell_lab/Environment;->o:F

    float-to-double v2, v2

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/o;->a(ID)V

    .line 274
    const v0, 0x7f080098

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget v2, v2, Lcom/saterskog/cell_lab/Environment;->n:F

    float-to-double v2, v2

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/o;->a(ID)V

    .line 275
    const v0, 0x7f08008e

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->d:D

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    div-double/2addr v2, v4

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/o;->a(ID)V

    .line 276
    const v0, 0x7f080091

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->e:D

    div-double/2addr v2, v6

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/o;->a(ID)V

    .line 277
    const v0, 0x7f08008f

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->f:D

    div-double/2addr v2, v6

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/o;->a(ID)V

    .line 278
    const v0, 0x7f08009a

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->g:D

    const-wide v4, 0x4062c00000000000L    # 150.0

    div-double/2addr v2, v4

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/o;->a(ID)V

    .line 279
    const v0, 0x7f080086

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->m:D

    div-double/2addr v2, v10

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/o;->a(ID)V

    .line 280
    const v0, 0x7f080088

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->l:D

    div-double/2addr v2, v10

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/o;->a(ID)V

    .line 281
    const v0, 0x7f08007a

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->h:D

    const-wide v4, -0x3ff599999999999aL    # -3.3

    sub-double/2addr v2, v4

    const-wide v4, 0x401a666666666666L    # 6.6

    div-double/2addr v2, v4

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/o;->a(ID)V

    .line 282
    const v0, 0x7f08008c

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->i:D

    sub-double/2addr v2, v8

    div-double/2addr v2, v6

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/o;->a(ID)V

    .line 283
    const v0, 0x7f08008a

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->j:D

    sub-double/2addr v2, v8

    const-wide/high16 v4, -0x4000000000000000L    # -2.0

    div-double/2addr v2, v4

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/o;->a(ID)V

    .line 284
    const v0, 0x7f080095

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->z:D

    invoke-direct {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/o;->a(ID)V

    .line 286
    const v0, 0x7f08001f

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-boolean v2, v2, Lcom/saterskog/cell_lab/Environment;->w:Z

    invoke-direct {p0, v0, v2}, Lcom/saterskog/cell_lab/o;->a(IZ)V

    .line 287
    const v0, 0x7f080021

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-boolean v2, v2, Lcom/saterskog/cell_lab/Environment;->x:Z

    invoke-direct {p0, v0, v2}, Lcom/saterskog/cell_lab/o;->a(IZ)V

    .line 289
    const v0, 0x7f080023

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-boolean v2, v2, Lcom/saterskog/cell_lab/Environment;->u:Z

    invoke-direct {p0, v0, v2}, Lcom/saterskog/cell_lab/o;->a(IZ)V

    .line 290
    const v0, 0x7f080020

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-boolean v2, v2, Lcom/saterskog/cell_lab/Environment;->v:Z

    invoke-direct {p0, v0, v2}, Lcom/saterskog/cell_lab/o;->a(IZ)V

    .line 291
    const v0, 0x7f080022

    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-boolean v2, v2, Lcom/saterskog/cell_lab/Environment;->y:Z

    invoke-direct {p0, v0, v2}, Lcom/saterskog/cell_lab/o;->a(IZ)V

    .line 292
    iget-object v0, p0, Lcom/saterskog/cell_lab/o;->d:Lcom/saterskog/cell_lab/GenePoolView;

    if-eqz v0, :cond_0

    move v0, v1

    .line 293
    :goto_0
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->d:Lcom/saterskog/cell_lab/GenePoolView;

    iget-object v2, v2, Lcom/saterskog/cell_lab/GenePoolView;->a:[Landroid/widget/CheckBox;

    array-length v2, v2

    if-ge v0, v2, :cond_0

    .line 294
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->d:Lcom/saterskog/cell_lab/GenePoolView;

    iget-object v2, v2, Lcom/saterskog/cell_lab/GenePoolView;->a:[Landroid/widget/CheckBox;

    aget-object v2, v2, v0

    iget-object v3, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-object v3, v3, Lcom/saterskog/cell_lab/Environment;->t:[Z

    iget-object v4, p0, Lcom/saterskog/cell_lab/o;->d:Lcom/saterskog/cell_lab/GenePoolView;

    iget-object v4, v4, Lcom/saterskog/cell_lab/GenePoolView;->b:[I

    aget v4, v4, v0

    aget-boolean v3, v3, v4

    invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 293
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 295
    :cond_0
    const/4 v0, -0x1

    move v2, v0

    move v3, v1

    move v0, v1

    .line 296
    :goto_1
    sget-object v4, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v4, v4

    if-ge v0, v4, :cond_2

    .line 297
    iget-object v4, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-object v4, v4, Lcom/saterskog/cell_lab/Environment;->t:[Z

    aget-boolean v4, v4, v0

    if-eqz v4, :cond_1

    .line 298
    add-int/lit8 v3, v3, 0x1

    move v2, v0

    .line 296
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 299
    :cond_2
    if-ne v3, v12, :cond_5

    move v0, v1

    .line 300
    :goto_2
    iget-object v3, p0, Lcom/saterskog/cell_lab/o;->d:Lcom/saterskog/cell_lab/GenePoolView;

    iget-object v3, v3, Lcom/saterskog/cell_lab/GenePoolView;->a:[Landroid/widget/CheckBox;

    array-length v3, v3

    if-ge v0, v3, :cond_3

    .line 301
    iget-object v3, p0, Lcom/saterskog/cell_lab/o;->d:Lcom/saterskog/cell_lab/GenePoolView;

    iget-object v3, v3, Lcom/saterskog/cell_lab/GenePoolView;->b:[I

    aget v3, v3, v0

    if-ne v3, v2, :cond_4

    .line 302
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->d:Lcom/saterskog/cell_lab/GenePoolView;

    iget-object v2, v2, Lcom/saterskog/cell_lab/GenePoolView;->a:[Landroid/widget/CheckBox;

    aget-object v0, v2, v0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    .line 305
    :cond_3
    return-void

    .line 300
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 303
    :cond_5
    :goto_3
    iget-object v0, p0, Lcom/saterskog/cell_lab/o;->d:Lcom/saterskog/cell_lab/GenePoolView;

    iget-object v0, v0, Lcom/saterskog/cell_lab/GenePoolView;->a:[Landroid/widget/CheckBox;

    array-length v0, v0

    if-ge v1, v0, :cond_3

    .line 304
    iget-object v0, p0, Lcom/saterskog/cell_lab/o;->d:Lcom/saterskog/cell_lab/GenePoolView;

    iget-object v0, v0, Lcom/saterskog/cell_lab/GenePoolView;->a:[Landroid/widget/CheckBox;

    aget-object v0, v0, v1

    invoke-virtual {v0, v12}, Landroid/widget/CheckBox;->setEnabled(Z)V

    .line 303
    add-int/lit8 v1, v1, 0x1

    goto :goto_3
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 4

    .prologue
    .line 141
    invoke-super {p0, p1}, Landroid/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 143
    :try_start_0
    move-object v0, p1

    check-cast v0, Lcom/saterskog/cell_lab/o$a;

    move-object v1, v0

    iput-object v1, p0, Lcom/saterskog/cell_lab/o;->c:Lcom/saterskog/cell_lab/o$a;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 146
    return-void

    .line 145
    :catch_0
    move-exception v1

    new-instance v1, Ljava/lang/ClassCastException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " must implement SampleInfoReceiver"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v1, 0x0

    .line 217
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    move v0, v1

    .line 237
    :goto_0
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->d:Lcom/saterskog/cell_lab/GenePoolView;

    iget-object v2, v2, Lcom/saterskog/cell_lab/GenePoolView;->a:[Landroid/widget/CheckBox;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 238
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->d:Lcom/saterskog/cell_lab/GenePoolView;

    iget-object v2, v2, Lcom/saterskog/cell_lab/GenePoolView;->a:[Landroid/widget/CheckBox;

    aget-object v2, v2, v0

    if-ne v2, p1, :cond_5

    .line 240
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-object v2, v2, Lcom/saterskog/cell_lab/Environment;->t:[Z

    iget-object v3, p0, Lcom/saterskog/cell_lab/o;->d:Lcom/saterskog/cell_lab/GenePoolView;

    iget-object v3, v3, Lcom/saterskog/cell_lab/GenePoolView;->b:[I

    aget v0, v3, v0

    aput-boolean p2, v2, v0

    .line 241
    const/4 v0, -0x1

    move v2, v0

    move v3, v1

    move v0, v1

    .line 242
    :goto_1
    sget-object v4, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v4, v4

    if-ge v0, v4, :cond_2

    .line 243
    iget-object v4, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iget-object v4, v4, Lcom/saterskog/cell_lab/Environment;->t:[Z

    aget-boolean v4, v4, v0

    if-eqz v4, :cond_0

    .line 244
    add-int/lit8 v3, v3, 0x1

    move v2, v0

    .line 242
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 219
    :pswitch_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iput-boolean p2, v0, Lcom/saterskog/cell_lab/Environment;->w:Z

    .line 255
    :cond_1
    :goto_2
    invoke-direct {p0}, Lcom/saterskog/cell_lab/o;->b()V

    .line 256
    return-void

    .line 222
    :pswitch_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iput-boolean p2, v0, Lcom/saterskog/cell_lab/Environment;->x:Z

    goto :goto_2

    .line 228
    :pswitch_2
    iget-object v0, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iput-boolean p2, v0, Lcom/saterskog/cell_lab/Environment;->u:Z

    goto :goto_2

    .line 231
    :pswitch_3
    iget-object v0, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iput-boolean p2, v0, Lcom/saterskog/cell_lab/Environment;->v:Z

    goto :goto_2

    .line 234
    :pswitch_4
    iget-object v0, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iput-boolean p2, v0, Lcom/saterskog/cell_lab/Environment;->y:Z

    goto :goto_2

    .line 245
    :cond_2
    if-ne v3, v5, :cond_4

    move v0, v1

    .line 246
    :goto_3
    iget-object v3, p0, Lcom/saterskog/cell_lab/o;->d:Lcom/saterskog/cell_lab/GenePoolView;

    iget-object v3, v3, Lcom/saterskog/cell_lab/GenePoolView;->a:[Landroid/widget/CheckBox;

    array-length v3, v3

    if-ge v0, v3, :cond_1

    .line 247
    iget-object v3, p0, Lcom/saterskog/cell_lab/o;->d:Lcom/saterskog/cell_lab/GenePoolView;

    iget-object v3, v3, Lcom/saterskog/cell_lab/GenePoolView;->b:[I

    aget v3, v3, v0

    if-ne v3, v2, :cond_3

    .line 248
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->d:Lcom/saterskog/cell_lab/GenePoolView;

    iget-object v2, v2, Lcom/saterskog/cell_lab/GenePoolView;->a:[Landroid/widget/CheckBox;

    aget-object v0, v2, v0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    goto :goto_2

    .line 246
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 249
    :cond_4
    :goto_4
    iget-object v0, p0, Lcom/saterskog/cell_lab/o;->d:Lcom/saterskog/cell_lab/GenePoolView;

    iget-object v0, v0, Lcom/saterskog/cell_lab/GenePoolView;->a:[Landroid/widget/CheckBox;

    array-length v0, v0

    if-ge v1, v0, :cond_1

    .line 250
    iget-object v0, p0, Lcom/saterskog/cell_lab/o;->d:Lcom/saterskog/cell_lab/GenePoolView;

    iget-object v0, v0, Lcom/saterskog/cell_lab/GenePoolView;->a:[Landroid/widget/CheckBox;

    aget-object v0, v0, v1

    invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setEnabled(Z)V

    .line 249
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 237
    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    .line 217
    :pswitch_data_0
    .packed-switch 0x7f08001f
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_4
        :pswitch_2
    .end packed-switch
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    .line 318
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 329
    :goto_0
    return-void

    .line 326
    :pswitch_0
    const v0, 0x7f0e014a

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/o;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x7f0e0149

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/o;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    .line 1331
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/o;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {v3, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1333
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/o;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 1334
    const v4, 0x7f0a0025

    const/4 v5, 0x0

    invoke-virtual {v0, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 1335
    const v0, 0x7f0800e9

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1336
    const v0, 0x7f0800d5

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1342
    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1345
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/o;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e005d

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/saterskog/cell_lab/o$1;

    invoke-direct {v1, p0}, Lcom/saterskog/cell_lab/o$1;-><init>(Lcom/saterskog/cell_lab/o;)V

    invoke-virtual {v3, v0, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1353
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0

    .line 318
    nop

    :pswitch_data_0
    .packed-switch 0x7f080069
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 107
    invoke-super {p0, p1}, Landroid/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 108
    if-nez p1, :cond_0

    .line 109
    new-instance v0, Lcom/saterskog/cell_lab/Environment;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/Environment;-><init>()V

    iput-object v0, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    .line 110
    iget-object v1, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/o;->getActivity()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/o$a;

    invoke-interface {v0}, Lcom/saterskog/cell_lab/o$a;->c()Lcom/saterskog/cell_lab/Environment;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/saterskog/cell_lab/Environment;->a(Lcom/saterskog/cell_lab/Environment;)V

    .line 114
    :goto_0
    return-void

    .line 112
    :cond_0
    const-string v0, "mEnv"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/Environment;

    iput-object v0, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    goto :goto_0
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 11

    .prologue
    const v10, 0x7f08007f

    const v9, 0x7f08007d

    const-wide/16 v2, 0x0

    const/4 v1, 0x0

    const/16 v8, 0x8

    .line 34
    const v0, 0x7f0a0023

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v7

    .line 35
    const v0, 0x7f0800df

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    move-object v0, p0

    move-wide v4, v2

    invoke-direct/range {v0 .. v5}, Lcom/saterskog/cell_lab/o;->a(IDD)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    const v0, 0x7f08001f

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->a(Landroid/view/View;I)V

    .line 37
    const v0, 0x7f080021

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->a(Landroid/view/View;I)V

    .line 39
    const v0, 0x7f080023

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->a(Landroid/view/View;I)V

    .line 40
    const v0, 0x7f080020

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->a(Landroid/view/View;I)V

    .line 41
    const v0, 0x7f080022

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->a(Landroid/view/View;I)V

    .line 45
    const v0, 0x7f080043

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/GenePoolView;

    iput-object v0, p0, Lcom/saterskog/cell_lab/o;->d:Lcom/saterskog/cell_lab/GenePoolView;

    .line 46
    const v0, 0x7f0800df

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/saterskog/cell_lab/o;->b:Landroid/widget/TextView;

    .line 47
    iget-object v0, p0, Lcom/saterskog/cell_lab/o;->d:Lcom/saterskog/cell_lab/GenePoolView;

    iget-object v2, v0, Lcom/saterskog/cell_lab/GenePoolView;->a:[Landroid/widget/CheckBox;

    array-length v3, v2

    move v0, v1

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 48
    invoke-virtual {v4, p0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 47
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 50
    :cond_0
    const v0, 0x7f08007c

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->b(Landroid/view/View;I)V

    .line 51
    const v0, 0x7f080083

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->b(Landroid/view/View;I)V

    .line 52
    invoke-direct {p0, v7, v10}, Lcom/saterskog/cell_lab/o;->b(Landroid/view/View;I)V

    .line 53
    const v0, 0x7f080080

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->b(Landroid/view/View;I)V

    .line 54
    invoke-direct {p0, v7, v9}, Lcom/saterskog/cell_lab/o;->b(Landroid/view/View;I)V

    .line 55
    const v0, 0x7f080098

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->b(Landroid/view/View;I)V

    .line 56
    const v0, 0x7f08009a

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->b(Landroid/view/View;I)V

    .line 57
    const v0, 0x7f080086

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->b(Landroid/view/View;I)V

    .line 58
    const v0, 0x7f080088

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->b(Landroid/view/View;I)V

    .line 59
    const v0, 0x7f080096

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->b(Landroid/view/View;I)V

    .line 60
    const v0, 0x7f08008e

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->b(Landroid/view/View;I)V

    .line 61
    const v0, 0x7f08008f

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->b(Landroid/view/View;I)V

    .line 62
    const v0, 0x7f080091

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->b(Landroid/view/View;I)V

    .line 63
    const v0, 0x7f08007a

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->b(Landroid/view/View;I)V

    .line 64
    const v0, 0x7f08008c

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->b(Landroid/view/View;I)V

    .line 65
    const v0, 0x7f08008a

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->b(Landroid/view/View;I)V

    .line 66
    const v0, 0x7f080095

    invoke-direct {p0, v7, v0}, Lcom/saterskog/cell_lab/o;->b(Landroid/view/View;I)V

    .line 68
    const v0, 0x7f080069

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/o;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 73
    invoke-virtual {v7, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 74
    const v0, 0x7f080082

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 76
    const v0, 0x7f080080

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 77
    const v0, 0x7f080081

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 79
    invoke-virtual {v7, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 80
    const v0, 0x7f08007e

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 82
    const v0, 0x7f080086

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 83
    const v0, 0x7f080087

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 85
    const v0, 0x7f080088

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 86
    const v0, 0x7f080089

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 88
    const v0, 0x7f08008a

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 89
    const v0, 0x7f08008b

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 91
    const v0, 0x7f080091

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 92
    const v0, 0x7f080092

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 94
    const v0, 0x7f080098

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 95
    const v0, 0x7f080099

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 97
    const v0, 0x7f080094

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 98
    const v0, 0x7f080095

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 102
    :cond_1
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/o;->a()V

    .line 103
    return-object v7
.end method

.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 10

    .prologue
    const-wide/high16 v8, 0x4020000000000000L    # 8.0

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    const-wide/16 v2, 0x0

    .line 150
    iget-object v0, p0, Lcom/saterskog/cell_lab/o;->c:Lcom/saterskog/cell_lab/o$a;

    if-nez v0, :cond_0

    .line 209
    :goto_0
    return-void

    .line 151
    :cond_0
    int-to-double v0, p2

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v4

    .line 153
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getId()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    .line 206
    :goto_1
    :pswitch_0
    if-eqz p3, :cond_1

    .line 207
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/o;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0800e1

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f0e0130

    invoke-virtual {p0, v4}, Lcom/saterskog/cell_lab/o;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, ": "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "%1$,.3f"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v5, v6

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 208
    :cond_1
    invoke-direct {p0}, Lcom/saterskog/cell_lab/o;->b()V

    goto :goto_0

    .line 155
    :pswitch_1
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    const-wide v4, 0x402dffffffffffffL    # 14.999999999999998

    mul-double/2addr v0, v4

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Environment;->a:D

    move-wide v2, v0

    .line 156
    goto :goto_1

    .line 158
    :pswitch_2
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    const-wide v4, 0x3f961e4f765fd8adL    # 0.021599999999999998

    const-wide v6, 0x3ff2161e4f765fd8L    # 1.1303999999999998

    mul-double/2addr v0, v6

    add-double/2addr v0, v4

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Environment;->b:D

    move-wide v2, v0

    .line 159
    goto :goto_1

    .line 161
    :pswitch_3
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v4

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Environment;->p:D

    move-wide v2, v0

    .line 162
    goto :goto_1

    .line 164
    :pswitch_4
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    const-wide v4, 0x3f847ae147ae147bL    # 0.01

    const-wide v6, 0x3fc851eb851eb852L    # 0.19

    mul-double/2addr v0, v6

    add-double/2addr v0, v4

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Environment;->q:D

    move-wide v2, v0

    .line 165
    goto :goto_1

    .line 167
    :pswitch_5
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    double-to-float v0, v0

    iput v0, v2, Lcom/saterskog/cell_lab/Environment;->o:F

    float-to-double v0, v0

    move-wide v2, v0

    .line 168
    goto/16 :goto_1

    .line 170
    :pswitch_6
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    double-to-float v0, v0

    iput v0, v2, Lcom/saterskog/cell_lab/Environment;->n:F

    float-to-double v0, v0

    move-wide v2, v0

    .line 171
    goto/16 :goto_1

    .line 173
    :pswitch_7
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    const-wide v4, 0x3fb70a3d70a3d70aL    # 0.09

    mul-double/2addr v0, v4

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Environment;->c:D

    move-wide v2, v0

    .line 174
    goto/16 :goto_1

    .line 176
    :pswitch_8
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    const-wide v4, 0x4062c00000000000L    # 150.0

    mul-double/2addr v0, v4

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Environment;->g:D

    move-wide v2, v0

    .line 177
    goto/16 :goto_1

    .line 179
    :pswitch_9
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    mul-double/2addr v0, v8

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Environment;->m:D

    move-wide v2, v0

    .line 180
    goto/16 :goto_1

    .line 182
    :pswitch_a
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    mul-double/2addr v0, v8

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Environment;->l:D

    move-wide v2, v0

    .line 183
    goto/16 :goto_1

    .line 185
    :pswitch_b
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    mul-double/2addr v0, v4

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Environment;->d:D

    move-wide v2, v0

    .line 186
    goto/16 :goto_1

    .line 188
    :pswitch_c
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    mul-double/2addr v0, v6

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Environment;->f:D

    move-wide v2, v0

    .line 189
    goto/16 :goto_1

    .line 191
    :pswitch_d
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Environment;->e:D

    move-wide v2, v0

    .line 192
    goto/16 :goto_1

    .line 194
    :pswitch_e
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    const-wide v4, -0x3ff599999999999aL    # -3.3

    const-wide v6, 0x401a666666666666L    # 6.6

    mul-double/2addr v0, v6

    add-double/2addr v0, v4

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Environment;->h:D

    move-wide v2, v0

    .line 195
    goto/16 :goto_1

    .line 197
    :pswitch_f
    iget-object v4, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    mul-double/2addr v0, v6

    add-double/2addr v0, v2

    iput-wide v0, v4, Lcom/saterskog/cell_lab/Environment;->i:D

    move-wide v2, v0

    .line 198
    goto/16 :goto_1

    .line 200
    :pswitch_10
    iget-object v4, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    const-wide/high16 v6, -0x4000000000000000L    # -2.0

    mul-double/2addr v0, v6

    add-double/2addr v0, v2

    iput-wide v0, v4, Lcom/saterskog/cell_lab/Environment;->j:D

    move-wide v2, v0

    .line 201
    goto/16 :goto_1

    .line 203
    :pswitch_11
    iget-object v2, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Environment;->z:D

    move-wide v2, v0

    goto/16 :goto_1

    .line 153
    nop

    :pswitch_data_0
    .packed-switch 0x7f08007a
        :pswitch_e
        :pswitch_0
        :pswitch_1
        :pswitch_5
        :pswitch_0
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_9
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_10
        :pswitch_0
        :pswitch_f
        :pswitch_0
        :pswitch_b
        :pswitch_c
        :pswitch_0
        :pswitch_d
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_11
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_0
        :pswitch_8
    .end packed-switch
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 123
    invoke-super {p0, p1}, Landroid/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 124
    const-string v0, "mEnv"

    iget-object v1, p0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 125
    return-void
.end method

.method public final onStart()V
    .locals 0

    .prologue
    .line 118
    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    .line 119
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/o;->a()V

    .line 120
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .prologue
    .line 214
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 4

    .prologue
    .line 358
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 359
    new-instance v1, Lcom/saterskog/cell_lab/o$2;

    invoke-direct {v1, p0}, Lcom/saterskog/cell_lab/o$2;-><init>(Lcom/saterskog/cell_lab/o;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 370
    return-void
.end method
