.class final Landroid/support/v7/widget/b$a;
.super Landroid/support/v7/internal/widget/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Landroid/support/v4/view/ae;

.field private k:Landroid/support/v4/f/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 1

    .prologue
    .line 1548
    sget v0, Landroid/support/v7/b/a$a;->dropDownListViewStyle:I

    invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/widget/k;-><init>(Landroid/content/Context;I)V

    .line 1549
    iput-boolean p2, p0, Landroid/support/v7/widget/b$a;->h:Z

    .line 1550
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/b$a;->setCacheColorHint(I)V

    .line 1551
    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/b$a;Z)Z
    .locals 0

    .prologue
    .line 1496
    iput-boolean p1, p0, Landroid/support/v7/widget/b$a;->g:Z

    return p1
.end method


# virtual methods
.method protected final a()Z
    .locals 1

    .prologue
    .line 1660
    iget-boolean v0, p0, Landroid/support/v7/widget/b$a;->i:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/support/v7/internal/widget/k;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Landroid/view/MotionEvent;I)Z
    .locals 14

    .prologue
    .line 1560
    const/4 v0, 0x1

    .line 1561
    const/4 v1, 0x0

    .line 1563
    invoke-static {p1}, Landroid/support/v4/view/n;->a(Landroid/view/MotionEvent;)I

    move-result v3

    .line 1564
    packed-switch v3, :pswitch_data_0

    :cond_0
    :goto_0
    move v13, v1

    move v1, v0

    move v0, v13

    .line 1597
    :goto_1
    if-eqz v1, :cond_1

    if-eqz v0, :cond_2

    .line 3625
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/b$a;->i:Z

    .line 3626
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/b$a;->setPressed(Z)V

    .line 3628
    invoke-virtual {p0}, Landroid/support/v7/widget/b$a;->drawableStateChanged()V

    .line 3630
    iget-object v0, p0, Landroid/support/v7/widget/b$a;->j:Landroid/support/v4/view/ae;

    if-eqz v0, :cond_2

    .line 3631
    iget-object v0, p0, Landroid/support/v7/widget/b$a;->j:Landroid/support/v4/view/ae;

    invoke-virtual {v0}, Landroid/support/v4/view/ae;->a()V

    .line 3632
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/b$a;->j:Landroid/support/v4/view/ae;

    .line 1602
    :cond_2
    if-eqz v1, :cond_e

    .line 1603
    iget-object v0, p0, Landroid/support/v7/widget/b$a;->k:Landroid/support/v4/f/f;

    if-nez v0, :cond_3

    .line 1604
    new-instance v0, Landroid/support/v4/f/f;

    invoke-direct {v0, p0}, Landroid/support/v4/f/f;-><init>(Landroid/widget/ListView;)V

    iput-object v0, p0, Landroid/support/v7/widget/b$a;->k:Landroid/support/v4/f/f;

    .line 1606
    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/b$a;->k:Landroid/support/v4/f/f;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/support/v4/f/f;->a(Z)Landroid/support/v4/f/a;

    .line 1607
    iget-object v0, p0, Landroid/support/v7/widget/b$a;->k:Landroid/support/v4/f/f;

    invoke-virtual {v0, p0, p1}, Landroid/support/v4/f/f;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 1612
    :cond_4
    :goto_2
    return v1

    .line 1566
    :pswitch_0
    const/4 v0, 0x0

    move v13, v1

    move v1, v0

    move v0, v13

    .line 1567
    goto :goto_1

    .line 1569
    :pswitch_1
    const/4 v0, 0x0

    .line 1572
    :pswitch_2
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    .line 1573
    if-gez v2, :cond_5

    .line 1574
    const/4 v0, 0x0

    move v13, v1

    move v1, v0

    move v0, v13

    .line 1575
    goto :goto_1

    .line 1578
    :cond_5
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    float-to-int v4, v4

    .line 1579
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    float-to-int v2, v2

    .line 1580
    invoke-virtual {p0, v4, v2}, Landroid/support/v7/widget/b$a;->pointToPosition(II)I

    move-result v5

    .line 1581
    const/4 v6, -0x1

    if-ne v5, v6, :cond_6

    .line 1582
    const/4 v1, 0x1

    move v13, v1

    move v1, v0

    move v0, v13

    .line 1583
    goto :goto_1

    .line 1586
    :cond_6
    invoke-virtual {p0}, Landroid/support/v7/widget/b$a;->getFirstVisiblePosition()I

    move-result v0

    sub-int v0, v5, v0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/b$a;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 1587
    int-to-float v4, v4

    int-to-float v7, v2

    .line 2637
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/b$a;->i:Z

    .line 2641
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/b$a;->setPressed(Z)V

    .line 2642
    invoke-virtual {p0}, Landroid/support/v7/widget/b$a;->layoutChildren()V

    .line 2645
    invoke-virtual {p0, v5}, Landroid/support/v7/widget/b$a;->setSelection(I)V

    .line 3180
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/k;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v8

    .line 3181
    if-eqz v8, :cond_b

    const/4 v0, -0x1

    if-eq v5, v0, :cond_b

    const/4 v0, 0x1

    move v2, v0

    .line 3182
    :goto_3
    if-eqz v2, :cond_7

    .line 3183
    const/4 v0, 0x0

    const/4 v9, 0x0

    invoke-virtual {v8, v0, v9}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 3198
    :cond_7
    iget-object v0, p0, Landroid/support/v7/internal/widget/k;->a:Landroid/graphics/Rect;

    .line 3199
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v9

    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    move-result v10

    invoke-virtual {v6}, Landroid/view/View;->getRight()I

    move-result v11

    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    move-result v12

    invoke-virtual {v0, v9, v10, v11, v12}, Landroid/graphics/Rect;->set(IIII)V

    .line 3202
    iget v9, v0, Landroid/graphics/Rect;->left:I

    iget v10, p0, Landroid/support/v7/internal/widget/k;->b:I

    sub-int/2addr v9, v10

    iput v9, v0, Landroid/graphics/Rect;->left:I

    .line 3203
    iget v9, v0, Landroid/graphics/Rect;->top:I

    iget v10, p0, Landroid/support/v7/internal/widget/k;->c:I

    sub-int/2addr v9, v10

    iput v9, v0, Landroid/graphics/Rect;->top:I

    .line 3204
    iget v9, v0, Landroid/graphics/Rect;->right:I

    iget v10, p0, Landroid/support/v7/internal/widget/k;->d:I

    add-int/2addr v9, v10

    iput v9, v0, Landroid/graphics/Rect;->right:I

    .line 3205
    iget v9, v0, Landroid/graphics/Rect;->bottom:I

    iget v10, p0, Landroid/support/v7/internal/widget/k;->e:I

    add-int/2addr v9, v10

    iput v9, v0, Landroid/graphics/Rect;->bottom:I

    .line 3210
    :try_start_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/k;->f:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    move-result v0

    .line 3211
    invoke-virtual {v6}, Landroid/view/View;->isEnabled()Z

    move-result v9

    if-eq v9, v0, :cond_8

    .line 3212
    iget-object v9, p0, Landroid/support/v7/internal/widget/k;->f:Ljava/lang/reflect/Field;

    if-nez v0, :cond_c

    const/4 v0, 0x1

    :goto_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v9, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 3213
    const/4 v0, -0x1

    if-eq v5, v0, :cond_8

    .line 3214
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/k;->refreshDrawableState()V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3188
    :cond_8
    :goto_5
    if-eqz v2, :cond_9

    .line 3189
    iget-object v0, p0, Landroid/support/v7/internal/widget/k;->a:Landroid/graphics/Rect;

    .line 3190
    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterX()F

    move-result v2

    .line 3191
    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v9

    .line 3192
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/k;->getVisibility()I

    move-result v0

    if-nez v0, :cond_d

    const/4 v0, 0x1

    :goto_6
    const/4 v10, 0x0

    invoke-virtual {v8, v0, v10}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 3193
    invoke-static {v8, v2, v9}, Landroid/support/v4/a/a/a;->a(Landroid/graphics/drawable/Drawable;FF)V

    .line 3171
    :cond_9
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/k;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 3172
    if-eqz v0, :cond_a

    const/4 v2, -0x1

    if-eq v5, v2, :cond_a

    .line 3173
    invoke-static {v0, v4, v7}, Landroid/support/v4/a/a/a;->a(Landroid/graphics/drawable/Drawable;FF)V

    .line 2651
    :cond_a
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/b$a;->setSelectorEnabled(Z)V

    .line 2655
    invoke-virtual {p0}, Landroid/support/v7/widget/b$a;->refreshDrawableState()V

    .line 1588
    const/4 v0, 0x1

    .line 1590
    const/4 v2, 0x1

    if-ne v3, v2, :cond_0

    .line 3620
    invoke-virtual {p0, v5}, Landroid/support/v7/widget/b$a;->getItemIdAtPosition(I)J

    move-result-wide v2

    .line 3621
    invoke-virtual {p0, v6, v5, v2, v3}, Landroid/support/v7/widget/b$a;->performItemClick(Landroid/view/View;IJ)Z

    goto/16 :goto_0

    .line 3181
    :cond_b
    const/4 v0, 0x0

    move v2, v0

    goto/16 :goto_3

    .line 3212
    :cond_c
    const/4 v0, 0x0

    goto :goto_4

    .line 3218
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_5

    .line 3192
    :cond_d
    const/4 v0, 0x0

    goto :goto_6

    .line 1608
    :cond_e
    iget-object v0, p0, Landroid/support/v7/widget/b$a;->k:Landroid/support/v4/f/f;

    if-eqz v0, :cond_4

    .line 1609
    iget-object v0, p0, Landroid/support/v7/widget/b$a;->k:Landroid/support/v4/f/f;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/support/v4/f/f;->a(Z)Landroid/support/v4/f/a;

    goto/16 :goto_2

    .line 1564
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public final hasFocus()Z
    .locals 1

    .prologue
    .line 1696
    iget-boolean v0, p0, Landroid/support/v7/widget/b$a;->h:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/support/v7/internal/widget/k;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final hasWindowFocus()Z
    .locals 1

    .prologue
    .line 1676
    iget-boolean v0, p0, Landroid/support/v7/widget/b$a;->h:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/support/v7/internal/widget/k;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final isFocused()Z
    .locals 1

    .prologue
    .line 1686
    iget-boolean v0, p0, Landroid/support/v7/widget/b$a;->h:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/support/v7/internal/widget/k;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final isInTouchMode()Z
    .locals 1

    .prologue
    .line 1666
    iget-boolean v0, p0, Landroid/support/v7/widget/b$a;->h:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/widget/b$a;->g:Z

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/support/v7/internal/widget/k;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method
