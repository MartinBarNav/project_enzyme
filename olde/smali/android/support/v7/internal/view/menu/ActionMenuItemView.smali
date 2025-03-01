.class public Landroid/support/v7/internal/view/menu/ActionMenuItemView;
.super Landroid/support/v7/internal/widget/f;
.source "SourceFile"

# interfaces
.implements Landroid/support/v7/internal/view/menu/k$a;
.implements Landroid/support/v7/widget/ActionMenuView$a;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/view/menu/ActionMenuItemView$b;,
        Landroid/support/v7/internal/view/menu/ActionMenuItemView$a;
    }
.end annotation


# instance fields
.field private a:Landroid/support/v7/internal/view/menu/f;

.field private b:Ljava/lang/CharSequence;

.field private c:Landroid/graphics/drawable/Drawable;

.field private d:Landroid/support/v7/internal/view/menu/e$b;

.field private e:Landroid/support/v7/widget/b$b;

.field private f:Landroid/support/v7/internal/view/menu/ActionMenuItemView$b;

.field private g:Z

.field private h:Z

.field private i:I

.field private j:I

.field private k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 68
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 69
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 72
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 73
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 76
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/internal/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 77
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 78
    sget v1, Landroid/support/v7/b/a$b;->abc_config_allowActionMenuItemTextWithIcon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v1

    iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->g:Z

    .line 80
    sget-object v1, Landroid/support/v7/b/a$i;->ActionMenuItemView:[I

    invoke-virtual {p1, p2, v1, p3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 82
    sget v2, Landroid/support/v7/b/a$i;->ActionMenuItemView_android_minWidth:I

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iput v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->i:I

    .line 84
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 86
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 87
    const/high16 v1, 0x42000000    # 32.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->k:I

    .line 89
    invoke-virtual {p0, p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    invoke-virtual {p0, p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 92
    new-instance v0, Landroid/support/v7/internal/b/a;

    invoke-direct {v0, p1}, Landroid/support/v7/internal/b/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 94
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->j:I

    .line 95
    return-void
.end method

.method static synthetic a(Landroid/support/v7/internal/view/menu/ActionMenuItemView;)Landroid/support/v7/internal/view/menu/ActionMenuItemView$b;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->f:Landroid/support/v7/internal/view/menu/ActionMenuItemView$b;

    return-object v0
.end method

.method static synthetic b(Landroid/support/v7/internal/view/menu/ActionMenuItemView;)Landroid/support/v7/internal/view/menu/e$b;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->d:Landroid/support/v7/internal/view/menu/e$b;

    return-object v0
.end method

.method static synthetic c(Landroid/support/v7/internal/view/menu/ActionMenuItemView;)Landroid/support/v7/internal/view/menu/f;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    return-object v0
.end method

.method private e()V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 179
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->b:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    .line 180
    :goto_0
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->c:Landroid/graphics/drawable/Drawable;

    if-eqz v3, :cond_0

    iget-object v3, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    .line 1585
    iget v3, v3, Landroid/support/v7/internal/view/menu/f;->c:I

    and-int/lit8 v3, v3, 0x4

    const/4 v4, 0x4

    if-ne v3, v4, :cond_3

    move v3, v1

    .line 180
    :goto_1
    if-eqz v3, :cond_1

    iget-boolean v3, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->g:Z

    if-nez v3, :cond_0

    iget-boolean v3, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->h:Z

    if-eqz v3, :cond_1

    :cond_0
    move v2, v1

    :cond_1
    and-int/2addr v0, v2

    .line 183
    if-eqz v0, :cond_4

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->b:Ljava/lang/CharSequence;

    :goto_2
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    return-void

    :cond_2
    move v0, v2

    .line 179
    goto :goto_0

    :cond_3
    move v3, v2

    .line 1585
    goto :goto_1

    .line 183
    :cond_4
    const/4 v0, 0x0

    goto :goto_2
.end method


# virtual methods
.method public final a(Landroid/support/v7/internal/view/menu/f;)V
    .locals 1

    .prologue
    .line 118
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    .line 120
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/f;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 121
    invoke-virtual {p1, p0}, Landroid/support/v7/internal/view/menu/f;->a(Landroid/support/v7/internal/view/menu/k$a;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setTitle(Ljava/lang/CharSequence;)V

    .line 122
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/f;->getItemId()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setId(I)V

    .line 124
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/f;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setVisibility(I)V

    .line 125
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/f;->isEnabled()Z

    move-result v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setEnabled(Z)V

    .line 126
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/f;->hasSubMenu()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->e:Landroid/support/v7/widget/b$b;

    if-nez v0, :cond_0

    .line 128
    new-instance v0, Landroid/support/v7/internal/view/menu/ActionMenuItemView$a;

    invoke-direct {v0, p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView$a;-><init>(Landroid/support/v7/internal/view/menu/ActionMenuItemView;)V

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->e:Landroid/support/v7/widget/b$b;

    .line 131
    :cond_0
    return-void

    .line 124
    :cond_1
    const/16 v0, 0x8

    goto :goto_0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 158
    const/4 v0, 0x1

    return v0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 209
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 228
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/f;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 232
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->b()Z

    move-result v0

    return v0
.end method

.method public getItemData()Landroid/support/v7/internal/view/menu/f;
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 144
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->d:Landroid/support/v7/internal/view/menu/e$b;

    if-eqz v0, :cond_0

    .line 145
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->d:Landroid/support/v7/internal/view/menu/e$b;

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    invoke-interface {v0, v1}, Landroid/support/v7/internal/view/menu/e$b;->a(Landroid/support/v7/internal/view/menu/f;)Z

    .line 147
    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 98
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    .line 99
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/f;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 102
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Landroid/support/v7/b/a$b;->abc_config_allowActionMenuItemTextWithIcon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->g:Z

    .line 104
    invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->e()V

    .line 105
    return-void
.end method

.method public onLongClick(Landroid/view/View;)Z
    .locals 9

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 237
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 265
    :goto_0
    return v0

    .line 242
    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 243
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 244
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getLocationOnScreen([I)V

    .line 245
    invoke-virtual {p0, v3}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 247
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 248
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getWidth()I

    move-result v5

    .line 249
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getHeight()I

    move-result v6

    .line 250
    aget v7, v0, v2

    div-int/lit8 v8, v6, 0x2

    add-int/2addr v7, v8

    .line 251
    aget v0, v0, v1

    div-int/lit8 v5, v5, 0x2

    add-int/2addr v0, v5

    .line 252
    invoke-static {p1}, Landroid/support/v4/view/u;->e(Landroid/view/View;)I

    move-result v5

    if-nez v5, :cond_1

    .line 253
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 254
    sub-int v0, v5, v0

    .line 256
    :cond_1
    iget-object v5, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    invoke-virtual {v5}, Landroid/support/v7/internal/view/menu/f;->getTitle()Ljava/lang/CharSequence;

    move-result-object v5

    invoke-static {v4, v5, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v4

    .line 257
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    if-ge v7, v3, :cond_2

    .line 259
    const v1, 0x800035

    invoke-virtual {v4, v1, v0, v6}, Landroid/widget/Toast;->setGravity(III)V

    .line 264
    :goto_1
    invoke-virtual {v4}, Landroid/widget/Toast;->show()V

    move v0, v2

    .line 265
    goto :goto_0

    .line 262
    :cond_2
    const/16 v0, 0x51

    invoke-virtual {v4, v0, v1, v6}, Landroid/widget/Toast;->setGravity(III)V

    goto :goto_1
.end method

.method protected onMeasure(II)V
    .locals 6

    .prologue
    const/high16 v5, 0x40000000    # 2.0f

    .line 270
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->b()Z

    move-result v1

    .line 271
    if-eqz v1, :cond_0

    iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->j:I

    if-ltz v0, :cond_0

    .line 272
    iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->j:I

    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getPaddingRight()I

    move-result v3

    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getPaddingBottom()I

    move-result v4

    invoke-super {p0, v0, v2, v3, v4}, Landroid/support/v7/internal/widget/f;->setPadding(IIII)V

    .line 276
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/support/v7/internal/widget/f;->onMeasure(II)V

    .line 278
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 279
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 280
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getMeasuredWidth()I

    move-result v3

    .line 281
    const/high16 v4, -0x80000000

    if-ne v2, v4, :cond_3

    iget v4, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->i:I

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 284
    :goto_0
    if-eq v2, v5, :cond_1

    iget v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->i:I

    if-lez v2, :cond_1

    if-ge v3, v0, :cond_1

    .line 286
    invoke-static {v0, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-super {p0, v0, p2}, Landroid/support/v7/internal/widget/f;->onMeasure(II)V

    .line 290
    :cond_1
    if-nez v1, :cond_2

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->c:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    .line 293
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getMeasuredWidth()I

    move-result v0

    .line 294
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    .line 295
    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getPaddingRight()I

    move-result v2

    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getPaddingBottom()I

    move-result v3

    invoke-super {p0, v0, v1, v2, v3}, Landroid/support/v7/internal/widget/f;->setPadding(IIII)V

    .line 297
    :cond_2
    return-void

    .line 281
    :cond_3
    iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->i:I

    goto :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 135
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/f;->hasSubMenu()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->e:Landroid/support/v7/widget/b$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->e:Landroid/support/v7/widget/b$b;

    invoke-virtual {v0, p0, p1}, Landroid/support/v7/widget/b$b;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 137
    const/4 v0, 0x1

    .line 139
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/f;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public setCheckable(Z)V
    .locals 0

    .prologue
    .line 163
    return-void
.end method

.method public setChecked(Z)V
    .locals 0

    .prologue
    .line 167
    return-void
.end method

.method public setExpandedFormat(Z)V
    .locals 1

    .prologue
    .line 170
    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->h:Z

    if-eq v0, p1, :cond_0

    .line 171
    iput-boolean p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->h:Z

    .line 172
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    .line 1554
    iget-object v0, v0, Landroid/support/v7/internal/view/menu/f;->b:Landroid/support/v7/internal/view/menu/e;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/e;->d()V

    .line 176
    :cond_0
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 187
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->c:Landroid/graphics/drawable/Drawable;

    .line 188
    if-eqz p1, :cond_2

    .line 189
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    .line 190
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    .line 191
    iget v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->k:I

    if-le v1, v2, :cond_0

    .line 192
    iget v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->k:I

    int-to-float v2, v2

    int-to-float v1, v1

    div-float/2addr v2, v1

    .line 193
    iget v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->k:I

    .line 194
    int-to-float v0, v0

    mul-float/2addr v0, v2

    float-to-int v0, v0

    .line 196
    :cond_0
    iget v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->k:I

    if-le v0, v2, :cond_1

    .line 197
    iget v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->k:I

    int-to-float v2, v2

    int-to-float v0, v0

    div-float/2addr v2, v0

    .line 198
    iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->k:I

    .line 199
    int-to-float v1, v1

    mul-float/2addr v1, v2

    float-to-int v1, v1

    .line 201
    :cond_1
    invoke-virtual {p1, v4, v4, v1, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 203
    :cond_2
    invoke-virtual {p0, p1, v3, v3, v3}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 205
    invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->e()V

    .line 206
    return-void
.end method

.method public setItemInvoker(Landroid/support/v7/internal/view/menu/e$b;)V
    .locals 0

    .prologue
    .line 150
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->d:Landroid/support/v7/internal/view/menu/e$b;

    .line 151
    return-void
.end method

.method public setPadding(IIII)V
    .locals 0

    .prologue
    .line 109
    iput p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->j:I

    .line 110
    invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v7/internal/widget/f;->setPadding(IIII)V

    .line 111
    return-void
.end method

.method public setPopupCallback(Landroid/support/v7/internal/view/menu/ActionMenuItemView$b;)V
    .locals 0

    .prologue
    .line 154
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->f:Landroid/support/v7/internal/view/menu/ActionMenuItemView$b;

    .line 155
    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 217
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->b:Ljava/lang/CharSequence;

    .line 219
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->b:Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 220
    invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->e()V

    .line 221
    return-void
.end method
