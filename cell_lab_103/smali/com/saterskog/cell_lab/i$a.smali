.class final Lcom/saterskog/cell_lab/i$a;
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
    name = "a"
.end annotation


# instance fields
.field a:Landroid/widget/SeekBar;

.field b:F

.field final synthetic c:Lcom/saterskog/cell_lab/i;


# direct methods
.method public constructor <init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;)V
    .locals 7

    .prologue
    .line 187
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$a;->c:Lcom/saterskog/cell_lab/i;

    .line 188
    const/4 v6, -0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/saterskog/cell_lab/i$e;-><init>(Lcom/saterskog/cell_lab/i;Ljava/lang/String;Ljava/lang/String;ILcom/saterskog/cell_lab/h;I)V

    .line 183
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$a;->a:Landroid/widget/SeekBar;

    .line 184
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/saterskog/cell_lab/i$a;->b:F

    .line 189
    invoke-virtual {p1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0e018a

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$a;->l:Ljava/lang/String;

    .line 190
    return-void
.end method


# virtual methods
.method final a()Landroid/view/View;
    .locals 6

    .prologue
    const/16 v5, 0xf

    const/4 v4, 0x1

    const/4 v3, -0x2

    .line 193
    new-instance v0, Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$a;->c:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$a;->f:Landroid/widget/RelativeLayout;

    .line 194
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->f:Landroid/widget/RelativeLayout;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 196
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->f:Landroid/widget/RelativeLayout;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setGravity(I)V

    .line 197
    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$a;->c:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$a;->e:Landroid/widget/TextView;

    .line 198
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->e:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$a;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 199
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setClickable(Z)V

    .line 200
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$a;->c:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 201
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$a;->e:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v1

    or-int/lit8 v1, v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPaintFlags(I)V

    .line 202
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->e:Landroid/widget/TextView;

    const v1, 0x7f080041

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setId(I)V

    .line 205
    new-instance v0, Landroid/widget/SeekBar;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$a;->c:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/i$a;->a:Landroid/widget/SeekBar;

    .line 206
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->a:Landroid/widget/SeekBar;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$a;->c:Lcom/saterskog/cell_lab/i;

    invoke-static {v1}, Lcom/saterskog/cell_lab/i;->a(Lcom/saterskog/cell_lab/i;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 207
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->a:Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 210
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 211
    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 212
    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 213
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$a;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 215
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 216
    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 217
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$a;->e:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getId()I

    move-result v1

    invoke-virtual {v0, v4, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 218
    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 219
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$a;->a:Landroid/widget/SeekBar;

    invoke-virtual {v1, v0}, Landroid/widget/SeekBar;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 222
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->f:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$a;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 223
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->f:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$a;->a:Landroid/widget/SeekBar;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 224
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->f:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 238
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->a:Landroid/widget/SeekBar;

    if-eqz v0, :cond_0

    .line 239
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->a:Landroid/widget/SeekBar;

    invoke-virtual {v0, p1}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 240
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 5

    .prologue
    .line 228
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->c:Lcom/saterskog/cell_lab/i;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$a;->c:Lcom/saterskog/cell_lab/i;

    iget v1, v1, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->v:[F

    iget v1, p0, Lcom/saterskog/cell_lab/i$a;->h:I

    aget v0, v0, v1

    sget-object v1, Lcom/saterskog/cell_lab/Gene;->z:[F

    iget v2, p0, Lcom/saterskog/cell_lab/i$a;->h:I

    aget v1, v1, v2

    sub-float/2addr v0, v1

    sget-object v1, Lcom/saterskog/cell_lab/Gene;->A:[F

    iget v2, p0, Lcom/saterskog/cell_lab/i$a;->h:I

    aget v1, v1, v2

    sget-object v2, Lcom/saterskog/cell_lab/Gene;->z:[F

    iget v3, p0, Lcom/saterskog/cell_lab/i$a;->h:I

    aget v2, v2, v3

    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$a;->c:Lcom/saterskog/cell_lab/i;

    invoke-static {v1}, Lcom/saterskog/cell_lab/i;->a(Lcom/saterskog/cell_lab/i;)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 230
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->f:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_1

    .line 231
    iget-object v2, p0, Lcom/saterskog/cell_lab/i$a;->f:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->g:Lcom/saterskog/cell_lab/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->g:Lcom/saterskog/cell_lab/h;

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$a;->c:Lcom/saterskog/cell_lab/i;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v4, p0, Lcom/saterskog/cell_lab/i$a;->c:Lcom/saterskog/cell_lab/i;

    iget v4, v4, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    if-ne v0, v3, :cond_2

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 233
    :cond_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->a:Landroid/widget/SeekBar;

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$a;->c:Lcom/saterskog/cell_lab/i;

    invoke-static {v2}, Lcom/saterskog/cell_lab/i;->a(Lcom/saterskog/cell_lab/i;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setMax(I)V

    .line 234
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->a:Landroid/widget/SeekBar;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 235
    return-void

    .line 231
    :cond_2
    const/16 v0, 0x8

    goto :goto_0
.end method

.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 7

    .prologue
    .line 244
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->c:Lcom/saterskog/cell_lab/i;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v1, p0, Lcom/saterskog/cell_lab/i$a;->c:Lcom/saterskog/cell_lab/i;

    iget v1, v1, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->v:[F

    iget v1, p0, Lcom/saterskog/cell_lab/i$a;->h:I

    sget-object v2, Lcom/saterskog/cell_lab/Gene;->z:[F

    iget v3, p0, Lcom/saterskog/cell_lab/i$a;->h:I

    aget v2, v2, v3

    sget-object v3, Lcom/saterskog/cell_lab/Gene;->A:[F

    iget v4, p0, Lcom/saterskog/cell_lab/i$a;->h:I

    aget v3, v3, v4

    sget-object v4, Lcom/saterskog/cell_lab/Gene;->z:[F

    iget v5, p0, Lcom/saterskog/cell_lab/i$a;->h:I

    aget v4, v4, v5

    sub-float/2addr v3, v4

    int-to-float v4, p2

    mul-float/2addr v3, v4

    invoke-virtual {p1}, Landroid/widget/SeekBar;->getMax()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    add-float/2addr v2, v3

    aput v2, v0, v1

    .line 246
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->c:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0800e8

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 247
    if-eqz v0, :cond_0

    .line 248
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$a;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": %1$,.2f"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget v4, p0, Lcom/saterskog/cell_lab/i$a;->b:F

    iget-object v5, p0, Lcom/saterskog/cell_lab/i$a;->c:Lcom/saterskog/cell_lab/i;

    iget-object v5, v5, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v6, p0, Lcom/saterskog/cell_lab/i$a;->c:Lcom/saterskog/cell_lab/i;

    iget v6, v6, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v5, v5, v6

    iget-object v5, v5, Lcom/saterskog/cell_lab/Gene;->v:[F

    iget v6, p0, Lcom/saterskog/cell_lab/i$a;->h:I

    aget v5, v5, v6

    mul-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 249
    :cond_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->c:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i;->a()V

    .line 250
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .prologue
    .line 255
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .prologue
    .line 259
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$a;->c:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0800e8

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 260
    if-eqz v0, :cond_0

    .line 261
    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 262
    :cond_0
    return-void
.end method
