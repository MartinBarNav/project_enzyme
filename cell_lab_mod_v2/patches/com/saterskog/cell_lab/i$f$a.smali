.class final Lcom/saterskog/cell_lab/i$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/i$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field a:Landroid/widget/Spinner;

.field b:Landroid/widget/Spinner;

.field c:Landroid/widget/RadioButton;

.field d:Landroid/widget/RadioButton;

.field e:Landroid/app/AlertDialog$Builder;

.field final synthetic f:Lcom/saterskog/cell_lab/i$f;


# direct methods
.method public constructor <init>(Lcom/saterskog/cell_lab/i$f;)V
    .locals 12

    .prologue
    const v7, 0x7f0a0028

    const/4 v11, 0x3 # MODDED from 0x2. This controls how many equations you can chose from.

    const/high16 v10, 0x41000000    # 8.0f

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 373
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 374
    iget-object v0, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v3, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget v3, v3, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v3

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    iget v3, p1, Lcom/saterskog/cell_lab/i$f;->h:I

    aget-object v3, v0, v3

    .line 377
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v4, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v4}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v4

    invoke-direct {v0, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$f$a;->e:Landroid/app/AlertDialog$Builder;

    .line 378
    iget-object v0, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 379
    const v4, 0x7f0a0027

    const/4 v5, 0x0

    invoke-virtual {v0, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 380
    const v0, 0x7f0800b6

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$f$a;->a:Landroid/widget/Spinner;

    .line 381
    const v0, 0x7f0800b4

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$f$a;->b:Landroid/widget/Spinner;

    .line 384
    new-array v0, v11, [Ljava/lang/String;

    .line 385
    iget-object v5, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    const v6, 0x7f0e012d

    invoke-virtual {v5, v6}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v0, v2

    .line 386
    iget-object v5, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    const v6, 0x7f0e012c

    invoke-virtual {v5, v6}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v0, v1

    #MODDED AREA BEGIN-----------------------------------------------------------------

    .line 3870123456

    const/4 v8, 0x2
    const-string v5, "a × sin(input × c - b) "
    aput-object v5, v0, v8

    #MODDED AREA END  -----------------------------------------------------------------

    .line 388
    new-instance v5, Landroid/widget/ArrayAdapter;

    iget-object v6, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v6}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v6

    invoke-direct {v5, v6, v7, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 389
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$a;->b:Landroid/widget/Spinner;

    invoke-virtual {v0, v5}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 390
    # MODDED SECTION START-----------------------------------------------------

    iget-short v0, v3, Lcom/saterskog/cell_lab/Gene$a;->e:S

    const/16 v8, 0x3
    
    if-eq v0, v8, :cond_modded_enzyme_0


    const/16 v8, 0x2

    if-eq v0, v8, :cond_0

    goto :cond_modded_enzyme_1

    :cond_modded_enzyme_0
    const/4 v2, 0x2
    :cond_modded_enzyme_1

    # MODDED SECTION END  -----------------------------------------------------

    .line 391
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$a;->b:Landroid/widget/Spinner;

    invoke-virtual {v0, v2}, Landroid/widget/Spinner;->setSelection(I)V

    const/4 v2, 0x0

    .line 395
    :goto_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$a;->b:Landroid/widget/Spinner;

    new-instance v5, Lcom/saterskog/cell_lab/i$f$a$1;

    .line 396

    invoke-direct {v5, p0, p1}, Lcom/saterskog/cell_lab/i$f$a$1;-><init>(Lcom/saterskog/cell_lab/i$f$a;Lcom/saterskog/cell_lab/i$f;)V

    invoke-virtual {v0, v5}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 408
    new-instance v5, Landroid/widget/ArrayAdapter;

    iget-object v0, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {v5, v0, v7}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    move v0, v2

    .line 410
    :goto_1
    const/16 v6, 0x10 # MODDED from 0x4

    if-ge v0, v6, :cond_1

    .line 411
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    const v8, 0x7f0e0123

    invoke-virtual {v7, v8}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    add-int/lit8 v7, v0, 0x1

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " ["

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    const v8, 0x7f0e0124

    invoke-virtual {v7, v8}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "]"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    .line 410
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    #-----------------------------------------------

    .line 393
    :cond_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$a;->b:Landroid/widget/Spinner;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    goto :goto_0

    .line 412
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    const v7, 0x7f0e01ad

    invoke-virtual {v6, v7}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, " / %1.1f ng"

    new-array v7, v1, [Ljava/lang/Object;

    const-wide v8, 0x400cccccccccccccL    # 3.5999999999999996

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    .line 412420

    aput-object v8, v7, v2

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    .line 413
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    const v7, 0x7f0e01ab

    invoke-virtual {v6, v7}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, " / %1.0f h"

    new-array v7, v1, [Ljava/lang/Object;

    const-wide/high16 v8, 0x406e000000000000L    # 240.0

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    aput-object v8, v7, v2

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    .line 414
    iget-object v0, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    const v6, 0x7f0e01ae

    invoke-virtual {v0, v6}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    .line 415
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    const v7, 0x7f0e01ac

    invoke-virtual {v6, v7}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, " / 20"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    .line 418
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$a;->a:Landroid/widget/Spinner;

    invoke-virtual {v0, v5}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 420
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$a;->a:Landroid/widget/Spinner;

    iget-short v5, v3, Lcom/saterskog/cell_lab/Gene$a;->d:S

    invoke-virtual {v0, v5}, Landroid/widget/Spinner;->setSelection(I)V

    .line 422
    const v0, 0x7f080065

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$f$a;->c:Landroid/widget/RadioButton;

    .line 423
    const v0, 0x7f080066

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$f$a;->d:Landroid/widget/RadioButton;

    .line 424
    iget-object v5, p0, Lcom/saterskog/cell_lab/i$f$a;->c:Landroid/widget/RadioButton;

    iget-short v0, v3, Lcom/saterskog/cell_lab/Gene$a;->e:S

    if-nez v0, :cond_2

    move v0, v1

    :goto_2
    invoke-virtual {v5, v0}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 425
    iget-object v5, p0, Lcom/saterskog/cell_lab/i$f$a;->d:Landroid/widget/RadioButton;

    iget-short v0, v3, Lcom/saterskog/cell_lab/Gene$a;->e:S

    if-eqz v0, :cond_3

    move v0, v1

    :goto_3
    invoke-virtual {v5, v0}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 426
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$a;->c:Landroid/widget/RadioButton;

    new-instance v5, Lcom/saterskog/cell_lab/i$f$a$2;

    invoke-direct {v5, p0, p1}, Lcom/saterskog/cell_lab/i$f$a$2;-><init>(Lcom/saterskog/cell_lab/i$f$a;Lcom/saterskog/cell_lab/i$f;)V

    invoke-virtual {v0, v5}, Landroid/widget/RadioButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 438
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$a;->d:Landroid/widget/RadioButton;

    new-instance v5, Lcom/saterskog/cell_lab/i$f$a$3;

    invoke-direct {v5, p0, p1}, Lcom/saterskog/cell_lab/i$f$a$3;-><init>(Lcom/saterskog/cell_lab/i$f$a;Lcom/saterskog/cell_lab/i$f;)V

    invoke-virtual {v0, v5}, Landroid/widget/RadioButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 451
    const v0, 0x7f0800ef

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/saterskog/cell_lab/i$f;->c:Landroid/widget/TextView;

    .line 452
    const v0, 0x7f0800eb

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/saterskog/cell_lab/i$f;->d:Landroid/widget/TextView;

    .line 453
    const v0, 0x7f0800ec

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/saterskog/cell_lab/i$f;->n:Landroid/widget/TextView;

    .line 454
    const v0, 0x7f0800ed

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/saterskog/cell_lab/i$f;->o:Landroid/widget/TextView;

    .line 455
    const v0, 0x7f0800b5

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p1, Lcom/saterskog/cell_lab/i$f;->p:Landroid/widget/SeekBar;

    .line 456
    const v0, 0x7f0800b1

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p1, Lcom/saterskog/cell_lab/i$f;->q:Landroid/widget/SeekBar;

    .line 457
    const v0, 0x7f0800b2

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p1, Lcom/saterskog/cell_lab/i$f;->r:Landroid/widget/SeekBar;

    .line 458
    const v0, 0x7f0800b3

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p1, Lcom/saterskog/cell_lab/i$f;->s:Landroid/widget/SeekBar;

    .line 460
    iget-object v0, p1, Lcom/saterskog/cell_lab/i$f;->p:Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 461
    iget-object v0, p1, Lcom/saterskog/cell_lab/i$f;->q:Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 462
    iget-object v0, p1, Lcom/saterskog/cell_lab/i$f;->r:Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 463
    iget-object v0, p1, Lcom/saterskog/cell_lab/i$f;->s:Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 465
    iget-object v0, p1, Lcom/saterskog/cell_lab/i$f;->p:Landroid/widget/SeekBar;

    iget-object v5, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-static {v5}, Lcom/saterskog/cell_lab/i;->a(Lcom/saterskog/cell_lab/i;)I

    move-result v5

    invoke-virtual {v0, v5}, Landroid/widget/SeekBar;->setMax(I)V

    .line 466
    iget-object v0, p1, Lcom/saterskog/cell_lab/i$f;->q:Landroid/widget/SeekBar;

    iget-object v5, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-static {v5}, Lcom/saterskog/cell_lab/i;->a(Lcom/saterskog/cell_lab/i;)I

    move-result v5

    invoke-virtual {v0, v5}, Landroid/widget/SeekBar;->setMax(I)V

    .line 467
    iget-object v0, p1, Lcom/saterskog/cell_lab/i$f;->r:Landroid/widget/SeekBar;

    iget-object v5, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-static {v5}, Lcom/saterskog/cell_lab/i;->a(Lcom/saterskog/cell_lab/i;)I

    move-result v5

    invoke-virtual {v0, v5}, Landroid/widget/SeekBar;->setMax(I)V

    .line 468
    iget-object v0, p1, Lcom/saterskog/cell_lab/i$f;->s:Landroid/widget/SeekBar;

    iget-object v5, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-static {v5}, Lcom/saterskog/cell_lab/i;->a(Lcom/saterskog/cell_lab/i;)I

    move-result v5

    invoke-virtual {v0, v5}, Landroid/widget/SeekBar;->setMax(I)V

    .line 470
    iget-object v5, p1, Lcom/saterskog/cell_lab/i$f;->p:Landroid/widget/SeekBar;

    iget-short v0, v3, Lcom/saterskog/cell_lab/Gene$a;->e:S

    if-nez v0, :cond_4

    move v0, v1

    :goto_4
    invoke-virtual {v5, v0}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 471
    iget-object v5, p1, Lcom/saterskog/cell_lab/i$f;->q:Landroid/widget/SeekBar;

    iget-short v0, v3, Lcom/saterskog/cell_lab/Gene$a;->e:S

    if-eqz v0, :cond_5

    move v0, v1

    :goto_5
    invoke-virtual {v5, v0}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 472
    iget-object v5, p1, Lcom/saterskog/cell_lab/i$f;->r:Landroid/widget/SeekBar;

    iget-short v0, v3, Lcom/saterskog/cell_lab/Gene$a;->e:S

    if-eqz v0, :cond_6

    move v0, v1

    :goto_6
    invoke-virtual {v5, v0}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 473
    iget-object v5, p1, Lcom/saterskog/cell_lab/i$f;->s:Landroid/widget/SeekBar;

    iget-short v0, v3, Lcom/saterskog/cell_lab/Gene$a;->e:S

    # MODDED SECTION START-----------------------------------------------------

    const/16 v8, 0x0
    const/4 v2, 0x0
    const/4 v1, 0x1

    if-eq v0, v8, :cond_7

    # MODDED SECTION END  -----------------------------------------------------

    move v0, v1

    :goto_7
    invoke-virtual {v5, v0}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 474
    iget-object v5, p0, Lcom/saterskog/cell_lab/i$f$a;->a:Landroid/widget/Spinner;

    iget-short v0, v3, Lcom/saterskog/cell_lab/Gene$a;->e:S

    if-eqz v0, :cond_8

    move v0, v1

    :goto_8
    invoke-virtual {v5, v0}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 475
    iget-object v5, p0, Lcom/saterskog/cell_lab/i$f$a;->b:Landroid/widget/Spinner;

    iget-short v0, v3, Lcom/saterskog/cell_lab/Gene$a;->e:S

    if-eqz v0, :cond_9

    move v0, v1

    :goto_9
    invoke-virtual {v5, v0}, Landroid/widget/Spinner;->setEnabled(Z)V

    .line 481
    iget-object v0, p1, Lcom/saterskog/cell_lab/i$f;->p:Landroid/widget/SeekBar;

    iget-object v5, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v6, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v6, v6, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v7, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget v7, v7, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v6, v6, v7

    iget-object v6, v6, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    iget v7, p1, Lcom/saterskog/cell_lab/i$f;->h:I

    aget-object v6, v6, v7

    iget v6, v6, Lcom/saterskog/cell_lab/Gene$a;->b:F

    mul-float/2addr v6, v10

    sget-object v7, Lcom/saterskog/cell_lab/Gene;->x:[F

    iget v8, p1, Lcom/saterskog/cell_lab/i$f;->h:I

    aget v7, v7, v8

    const/4 v8, 0x0

    cmpl-float v7, v7, v8

    if-nez v7, :cond_a

    :goto_a
    invoke-virtual {v5, v6, v1}, Lcom/saterskog/cell_lab/i;->a(FZ)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    # MODDED SECTION START-----------------------------------------------------
    .line 482
    iget-short v0, v3, Lcom/saterskog/cell_lab/Gene$a;->e:S

    const/16 v8, 0x3
    if-eq v0, v8, :cond_b

    const/16 v8, 0x2
    if-ne v0, v8, :cond_b

    # MODDED SECTION END -----------------------------------------------------

    .line 483
    iget-object v0, p1, Lcom/saterskog/cell_lab/i$f;->q:Landroid/widget/SeekBar;

    iget-object v1, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v3, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v5, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget v5, v5, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v3, v3, v5

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    iget v5, p1, Lcom/saterskog/cell_lab/i$f;->h:I

    aget-object v3, v3, v5

    iget v3, v3, Lcom/saterskog/cell_lab/Gene$a;->a:F

    mul-float/2addr v3, v10

    invoke-virtual {v1, v3, v2}, Lcom/saterskog/cell_lab/i;->a(FZ)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 484
    iget-object v0, p1, Lcom/saterskog/cell_lab/i$f;->r:Landroid/widget/SeekBar;

    iget-object v1, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v3, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v5, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget v5, v5, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v3, v3, v5

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    iget v5, p1, Lcom/saterskog/cell_lab/i$f;->h:I

    aget-object v3, v3, v5

    iget v3, v3, Lcom/saterskog/cell_lab/Gene$a;->b:F

    mul-float/2addr v3, v10

    invoke-virtual {v1, v3, v2}, Lcom/saterskog/cell_lab/i;->a(FZ)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 491
    :goto_b
    iget-object v0, p1, Lcom/saterskog/cell_lab/i$f;->s:Landroid/widget/SeekBar;

    iget-object v1, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v3, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v5, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget v5, v5, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v3, v3, v5

    # MODDED----------------------------------------------
    # This patch sets slider C's progress

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;
    iget v5, p1, Lcom/saterskog/cell_lab/i$f;->h:I
    aget-object v3, v3, v5

    # ----

    iget-short v8, v3, Lcom/saterskog/cell_lab/Gene$a;->e:S
    const/16 v9, 0x3

    if-ne v8,v9, :cond_modded_enzyme_10

    const v10, 0x3c4ccccd    # 0.0125f

    :cond_modded_enzyme_10

    iget v3, v3, Lcom/saterskog/cell_lab/Gene$a;->c:F

    mul-float v3, v3, v10

    const/high16 v10, 0x41000000    # 8.0f


    # MODDED----------------------------------------------

    invoke-virtual {v1, v3, v2}, Lcom/saterskog/cell_lab/i;->a(FZ)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 493
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$a;->e:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 494
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$a;->e:Landroid/app/AlertDialog$Builder;

    iget-object v1, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e005b

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/saterskog/cell_lab/i$f$a$4;

    invoke-direct {v2, p0, p1}, Lcom/saterskog/cell_lab/i$f$a$4;-><init>(Lcom/saterskog/cell_lab/i$f$a;Lcom/saterskog/cell_lab/i$f;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 501
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$a;->e:Landroid/app/AlertDialog$Builder;

    iget-object v1, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0e005d

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/saterskog/cell_lab/ControllersE;

    invoke-direct {v2, p0, p1, p1}, Lcom/saterskog/cell_lab/ControllersE;-><init>(Lcom/saterskog/cell_lab/i$f$a;Lcom/saterskog/cell_lab/i$f;Lcom/saterskog/cell_lab/i$f;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 545
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i$f$a;->a()V

    .line 546
    return-void

    :cond_2
    move v0, v2

    .line 424
    goto/16 :goto_2

    :cond_3
    move v0, v2

    .line 425
    goto/16 :goto_3

    :cond_4
    move v0, v2

    .line 470
    goto/16 :goto_4

    :cond_5
    move v0, v2

    .line 471
    goto/16 :goto_5

    :cond_6
    move v0, v2

    .line 472
    goto/16 :goto_6

    :cond_7
    move v0, v2

    .line 473
    goto/16 :goto_7

    :cond_8
    move v0, v2

    .line 474
    goto/16 :goto_8

    :cond_9
    move v0, v2

    .line 475
    goto/16 :goto_9

    :cond_a
    move v1, v2

    .line 481
    goto/16 :goto_a

    .line 487
    :cond_b
    iget-object v0, p1, Lcom/saterskog/cell_lab/i$f;->q:Landroid/widget/SeekBar;

    iget-object v1, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v3, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v5, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget v5, v5, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v3, v3, v5

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    iget v5, p1, Lcom/saterskog/cell_lab/i$f;->h:I

    aget-object v3, v3, v5

    iget v3, v3, Lcom/saterskog/cell_lab/Gene$a;->a:F

    invoke-virtual {v1, v3, v2}, Lcom/saterskog/cell_lab/i;->a(FZ)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 488
    iget-object v0, p1, Lcom/saterskog/cell_lab/i$f;->r:Landroid/widget/SeekBar;

    iget-object v1, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v3, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v5, p1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget v5, v5, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v3, v3, v5

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    iget v5, p1, Lcom/saterskog/cell_lab/i$f;->h:I

    aget-object v3, v3, v5

    iget v3, v3, Lcom/saterskog/cell_lab/Gene$a;->b:F

    invoke-virtual {v1, v3, v2}, Lcom/saterskog/cell_lab/i;->a(FZ)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    goto/16 :goto_b
.end method


# virtual methods
.method final a()V
    .locals 13

    .prologue
    .line 558
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->y:[F

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget v1, v1, Lcom/saterskog/cell_lab/i$f;->h:I

    aget v0, v0, v1

    sget-object v1, Lcom/saterskog/cell_lab/Gene;->x:[F

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget v2, v2, Lcom/saterskog/cell_lab/i$f;->h:I

    aget v1, v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float v2, v0, v1

    .line 559
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->y:[F

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget v1, v1, Lcom/saterskog/cell_lab/i$f;->h:I

    aget v0, v0, v1

    sget-object v1, Lcom/saterskog/cell_lab/Gene;->x:[F

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget v3, v3, Lcom/saterskog/cell_lab/i$f;->h:I

    aget v1, v1, v3

    sub-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float v3, v0, v1

    .line 560
    const-string v0, "2"

    .line 561
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-static {v1}, Lcom/saterskog/cell_lab/i;->c(Lcom/saterskog/cell_lab/i;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v0, "3"

    .line 562
    :cond_0
    sget-object v1, Lcom/saterskog/cell_lab/Gene;->x:[F

    iget-object v4, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget v4, v4, Lcom/saterskog/cell_lab/i$f;->h:I

    aget v1, v1, v4

    const/4 v4, 0x0

    cmpl-float v1, v1, v4

    if-nez v1, :cond_2

    .line 563
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v4, v1, Lcom/saterskog/cell_lab/i$f;->c:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v5, v5, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    const v6, 0x7f0e0130

    invoke-virtual {v5, v6}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, " = %1$,."

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "f"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v1, 0x1

    new-array v6, v1, [Ljava/lang/Object;

    const/4 v7, 0x0

    sget-object v1, Lcom/saterskog/cell_lab/Gene;->x:[F

    iget-object v8, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget v8, v8, Lcom/saterskog/cell_lab/i$f;->h:I

    aget v8, v1, v8

    sget-object v1, Lcom/saterskog/cell_lab/Gene;->y:[F

    iget-object v9, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget v9, v9, Lcom/saterskog/cell_lab/i$f;->h:I

    aget v1, v1, v9

    sget-object v9, Lcom/saterskog/cell_lab/Gene;->x:[F

    iget-object v10, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget v10, v10, Lcom/saterskog/cell_lab/i$f;->h:I

    aget v9, v9, v10

    sub-float v9, v1, v9

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v10, v1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$f;->p:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v11

    sget-object v1, Lcom/saterskog/cell_lab/Gene;->x:[F

    iget-object v12, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget v12, v12, Lcom/saterskog/cell_lab/i$f;->h:I

    aget v1, v1, v12

    const/4 v12, 0x0

    cmpl-float v1, v1, v12

    if-nez v1, :cond_1

    const/4 v1, 0x1

    :goto_0
    invoke-virtual {v10, v11, v1}, Lcom/saterskog/cell_lab/i;->a(IZ)F

    move-result v1

    mul-float/2addr v1, v9

    const/high16 v9, 0x41000000    # 8.0f

    div-float/2addr v1, v9

    add-float/2addr v1, v8

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v6, v7

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 567
    :goto_1
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f$a;->b:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItemPosition()I
    move-result v1

    # MODDED --------------------------------------

    const/16 v8, 0x2

    if-eq v1, v8, :cond_modded_enzyme_5

    if-nez v1, :cond_4

    # MODDED --------------------------------------

    :cond_modded_enzyme_5

    .line 568
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$f;->d:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v5, v5, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    const v6, 0x7f0e0126

    invoke-virtual {v5, v6}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " = %1$,."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "f"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v7, v7, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v8, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v8, v8, Lcom/saterskog/cell_lab/i$f;->q:Landroid/widget/SeekBar;

    invoke-virtual {v8}, Landroid/widget/SeekBar;->getProgress()I

    move-result v8

    const/4 v9, 0x0

    invoke-virtual {v7, v8, v9}, Lcom/saterskog/cell_lab/i;->a(IZ)F

    move-result v7

    mul-float/2addr v7, v3

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 569
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$f;->n:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v5, v5, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    const v6, 0x7f0e0128

    invoke-virtual {v5, v6}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " = %1$,."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "f"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v7, v7, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v8, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v8, v8, Lcom/saterskog/cell_lab/i$f;->r:Landroid/widget/SeekBar;

    invoke-virtual {v8}, Landroid/widget/SeekBar;->getProgress()I

    move-result v8

    const/4 v9, 0x0

    invoke-virtual {v7, v8, v9}, Lcom/saterskog/cell_lab/i;->a(IZ)F

    move-result v7

    mul-float/2addr v3, v7

    add-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v5, v6

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 576
    :goto_2
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$f;->o:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    const v4, 0x7f0e012a

    invoke-virtual {v3, v4}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " = %1$,."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "f"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v4, v4, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v5, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v5, v5, Lcom/saterskog/cell_lab/i$f;->s:Landroid/widget/SeekBar;

    invoke-virtual {v5}, Landroid/widget/SeekBar;->getProgress()I

    move-result v5

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Lcom/saterskog/cell_lab/i;->a(IZ)F

    move-result v4

    # MODDED -----------------------------------------------------------------------------------
    # This patch sets the *text value* besides the c slider

    iget-object v6, p0, Lcom/saterskog/cell_lab/i$f$a;->b:Landroid/widget/Spinner;

    invoke-virtual {v6}, Landroid/widget/Spinner;->getSelectedItemPosition()I
    move-result v6

    const/16 v5, 0x2
    if-eq v5, v6, :cont_enzyme_modded_6
    
    const/high16 v5, 0x41000000    # 8.0f

    div-float/2addr v4, v5

    goto :cont_enzyme_modded_13

    :cont_enzyme_modded_6

    const/high16 v5, 0x42a00000    # 80.0f

    mul-float/2addr v4, v5

    const/high16 v5, 0x41000000    # restore old value 8.0f

    :cont_enzyme_modded_13
    # MODDED -----------------------------------------------------------------------------------

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 578
    return-void

    .line 563
    :cond_1
    const/4 v1, 0x0

    goto/16 :goto_0

    .line 565
    :cond_2
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v4, v1, Lcom/saterskog/cell_lab/i$f;->c:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v5, v5, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    const v6, 0x7f0e0130

    invoke-virtual {v5, v6}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, " = %1$,."

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "f"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v1, 0x1

    new-array v6, v1, [Ljava/lang/Object;

    const/4 v7, 0x0

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v8, v1, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$f;->p:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v9

    sget-object v1, Lcom/saterskog/cell_lab/Gene;->x:[F

    iget-object v10, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget v10, v10, Lcom/saterskog/cell_lab/i$f;->h:I

    aget v1, v1, v10

    const/4 v10, 0x0

    cmpl-float v1, v1, v10

    if-nez v1, :cond_3

    const/4 v1, 0x1

    :goto_3
    invoke-virtual {v8, v9, v1}, Lcom/saterskog/cell_lab/i;->a(IZ)F

    move-result v1

    mul-float/2addr v1, v3

    const/high16 v8, 0x41000000    # 8.0f

    div-float/2addr v1, v8

    add-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v6, v7

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_3
    const/4 v1, 0x0

    goto :goto_3

    .line 573
    :cond_4
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$f;->d:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v5, v5, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    const v6, 0x7f0e0126

    invoke-virtual {v5, v6}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " = %1$,."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "f"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v7, v7, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v8, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v8, v8, Lcom/saterskog/cell_lab/i$f;->q:Landroid/widget/SeekBar;

    invoke-virtual {v8}, Landroid/widget/SeekBar;->getProgress()I

    move-result v8

    const/4 v9, 0x0

    invoke-virtual {v7, v8, v9}, Lcom/saterskog/cell_lab/i;->a(IZ)F

    move-result v7

    mul-float/2addr v7, v3

    const/high16 v8, 0x41000000    # 8.0f

    div-float/2addr v7, v8

    add-float/2addr v7, v2

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 574
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$f;->n:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v5, v5, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    const v6, 0x7f0e0128

    invoke-virtual {v5, v6}, Lcom/saterskog/cell_lab/i;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " = %1$,."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "f"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v7, v7, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    iget-object v8, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v8, v8, Lcom/saterskog/cell_lab/i$f;->r:Landroid/widget/SeekBar;

    invoke-virtual {v8}, Landroid/widget/SeekBar;->getProgress()I

    move-result v8

    const/4 v9, 0x0

    invoke-virtual {v7, v8, v9}, Lcom/saterskog/cell_lab/i;->a(IZ)F

    move-result v7

    mul-float/2addr v3, v7

    const/high16 v7, 0x41000000    # 8.0f

    div-float/2addr v3, v7

    add-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v5, v6

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2
.end method

.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 1

    .prologue
    .line 359
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/i$f$a;->a()V

    .line 360
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$f$a;->f:Lcom/saterskog/cell_lab/i$f;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$f;->x:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i;->a()V

    .line 361
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .prologue
    .line 366
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .prologue
    .line 371
    return-void
.end method
