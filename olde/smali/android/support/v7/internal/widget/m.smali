.class public final Landroid/support/v7/internal/widget/m;
.super Landroid/widget/HorizontalScrollView;
.source "SourceFile"

# interfaces
.implements Landroid/support/v7/internal/widget/d$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/widget/m$a;,
        Landroid/support/v7/internal/widget/m$b;
    }
.end annotation


# static fields
.field private static final i:Landroid/view/animation/Interpolator;


# instance fields
.field a:Ljava/lang/Runnable;

.field b:I

.field c:I

.field private d:Landroid/support/v7/widget/LinearLayoutCompat;

.field private e:Landroid/support/v7/internal/widget/SpinnerCompat;

.field private f:Z

.field private g:I

.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 74
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Landroid/support/v7/internal/widget/m;->i:Landroid/view/animation/Interpolator;

    return-void
.end method

.method static synthetic a(Landroid/support/v7/internal/widget/m;Landroid/support/v7/a/a$b;)Landroid/support/v7/internal/widget/m$b;
    .locals 4

    .prologue
    .line 4289
    new-instance v0, Landroid/support/v7/internal/widget/m$b;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/m;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Landroid/support/v7/internal/widget/m$b;-><init>(Landroid/support/v7/internal/widget/m;Landroid/content/Context;Landroid/support/v7/a/a$b;)V

    .line 4291
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/m$b;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4292
    new-instance v1, Landroid/widget/AbsListView$LayoutParams;

    const/4 v2, -0x1

    iget v3, p0, Landroid/support/v7/internal/widget/m;->g:I

    invoke-direct {v1, v2, v3}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/m$b;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 55
    return-object v0
.end method

.method static synthetic a(Landroid/support/v7/internal/widget/m;)Landroid/support/v7/widget/LinearLayoutCompat;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Landroid/support/v7/internal/widget/m;->d:Landroid/support/v7/widget/LinearLayoutCompat;

    return-object v0
.end method

.method private a()Z
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Landroid/support/v7/internal/widget/m;->e:Landroid/support/v7/internal/widget/SpinnerCompat;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/m;->e:Landroid/support/v7/internal/widget/SpinnerCompat;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/SpinnerCompat;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b()Z
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 170
    invoke-direct {p0}, Landroid/support/v7/internal/widget/m;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 176
    :goto_0
    return v4

    .line 172
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/m;->e:Landroid/support/v7/internal/widget/SpinnerCompat;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/m;->removeView(Landroid/view/View;)V

    .line 173
    iget-object v0, p0, Landroid/support/v7/internal/widget/m;->d:Landroid/support/v7/widget/LinearLayoutCompat;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x2

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v1}, Landroid/support/v7/internal/widget/m;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 175
    iget-object v0, p0, Landroid/support/v7/internal/widget/m;->e:Landroid/support/v7/internal/widget/SpinnerCompat;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/SpinnerCompat;->getSelectedItemPosition()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/m;->setTabSelected(I)V

    goto :goto_0
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 1

    .prologue
    .line 273
    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onAttachedToWindow()V

    .line 274
    iget-object v0, p0, Landroid/support/v7/internal/widget/m;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 276
    iget-object v0, p0, Landroid/support/v7/internal/widget/m;->a:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/m;->post(Ljava/lang/Runnable;)Z

    .line 278
    :cond_0
    return-void
.end method

.method protected final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 220
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    .line 221
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 224
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/m;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/internal/view/a;->a(Landroid/content/Context;)Landroid/support/v7/internal/view/a;

    move-result-object v2

    .line 3073
    iget-object v0, v2, Landroid/support/v7/internal/view/a;->a:Landroid/content/Context;

    const/4 v1, 0x0

    sget-object v3, Landroid/support/v7/b/a$i;->ActionBar:[I

    sget v4, Landroid/support/v7/b/a$a;->actionBarStyle:I

    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 3075
    sget v0, Landroid/support/v7/b/a$i;->ActionBar_height:I

    invoke-virtual {v3, v0, v5}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v0

    .line 3076
    iget-object v1, v2, Landroid/support/v7/internal/view/a;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 4062
    iget-object v1, v2, Landroid/support/v7/internal/view/a;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 4063
    const/16 v5, 0x10

    if-lt v1, v5, :cond_2

    .line 4064
    iget-object v1, v2, Landroid/support/v7/internal/view/a;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v5, Landroid/support/v7/b/a$b;->abc_action_bar_embed_tabs:I

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v1

    .line 3077
    :goto_0
    if-nez v1, :cond_1

    .line 3079
    sget v1, Landroid/support/v7/b/a$c;->abc_action_bar_stacked_max_height:I

    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 3082
    :cond_1
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 227
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/m;->setContentHeight(I)V

    .line 4094
    iget-object v0, v2, Landroid/support/v7/internal/view/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Landroid/support/v7/b/a$c;->abc_action_bar_stacked_tab_max_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 228
    iput v0, p0, Landroid/support/v7/internal/widget/m;->c:I

    .line 229
    return-void

    .line 4069
    :cond_2
    iget-object v1, v2, Landroid/support/v7/internal/view/a;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v5, Landroid/support/v7/b/a$b;->abc_action_bar_embed_tabs_pre_jb:I

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v1

    goto :goto_0
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 282
    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onDetachedFromWindow()V

    .line 283
    iget-object v0, p0, Landroid/support/v7/internal/widget/m;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 284
    iget-object v0, p0, Landroid/support/v7/internal/widget/m;->a:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/m;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 286
    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 9

    .prologue
    const/4 v8, -0x2

    const/high16 v7, 0x40000000    # 2.0f

    const/4 v1, 0x1

    const/4 v6, -0x1

    const/4 v2, 0x0

    .line 94
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 95
    if-ne v3, v7, :cond_6

    move v0, v1

    .line 96
    :goto_0
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/m;->setFillViewport(Z)V

    .line 98
    iget-object v4, p0, Landroid/support/v7/internal/widget/m;->d:Landroid/support/v7/widget/LinearLayoutCompat;

    invoke-virtual {v4}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildCount()I

    move-result v4

    .line 99
    if-le v4, v1, :cond_8

    if-eq v3, v7, :cond_0

    const/high16 v5, -0x80000000

    if-ne v3, v5, :cond_8

    .line 101
    :cond_0
    const/4 v3, 0x2

    if-le v4, v3, :cond_7

    .line 102
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    int-to-float v3, v3

    const v4, 0x3ecccccd    # 0.4f

    mul-float/2addr v3, v4

    float-to-int v3, v3

    iput v3, p0, Landroid/support/v7/internal/widget/m;->b:I

    .line 106
    :goto_1
    iget v3, p0, Landroid/support/v7/internal/widget/m;->b:I

    iget v4, p0, Landroid/support/v7/internal/widget/m;->c:I

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, p0, Landroid/support/v7/internal/widget/m;->b:I

    .line 111
    :goto_2
    iget v3, p0, Landroid/support/v7/internal/widget/m;->g:I

    invoke-static {v3, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 113
    if-nez v0, :cond_9

    iget-boolean v4, p0, Landroid/support/v7/internal/widget/m;->f:Z

    if-eqz v4, :cond_9

    .line 115
    :goto_3
    if-eqz v1, :cond_b

    .line 117
    iget-object v1, p0, Landroid/support/v7/internal/widget/m;->d:Landroid/support/v7/widget/LinearLayoutCompat;

    invoke-virtual {v1, v2, v3}, Landroid/support/v7/widget/LinearLayoutCompat;->measure(II)V

    .line 118
    iget-object v1, p0, Landroid/support/v7/internal/widget/m;->d:Landroid/support/v7/widget/LinearLayoutCompat;

    invoke-virtual {v1}, Landroid/support/v7/widget/LinearLayoutCompat;->getMeasuredWidth()I

    move-result v1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    if-le v1, v4, :cond_a

    .line 1151
    invoke-direct {p0}, Landroid/support/v7/internal/widget/m;->a()Z

    move-result v1

    if-nez v1, :cond_4

    .line 1153
    iget-object v1, p0, Landroid/support/v7/internal/widget/m;->e:Landroid/support/v7/internal/widget/SpinnerCompat;

    if-nez v1, :cond_1

    .line 1211
    new-instance v1, Landroid/support/v7/internal/widget/SpinnerCompat;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/m;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Landroid/support/v7/b/a$a;->actionDropDownStyle:I

    invoke-direct {v1, v4, v5}, Landroid/support/v7/internal/widget/SpinnerCompat;-><init>(Landroid/content/Context;I)V

    .line 1213
    new-instance v4, Landroid/support/v7/widget/LinearLayoutCompat$a;

    invoke-direct {v4, v8, v6}, Landroid/support/v7/widget/LinearLayoutCompat$a;-><init>(II)V

    invoke-virtual {v1, v4}, Landroid/support/v7/internal/widget/SpinnerCompat;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1215
    invoke-virtual {v1, p0}, Landroid/support/v7/internal/widget/SpinnerCompat;->a(Landroid/support/v7/internal/widget/d$b;)V

    .line 1154
    iput-object v1, p0, Landroid/support/v7/internal/widget/m;->e:Landroid/support/v7/internal/widget/SpinnerCompat;

    .line 1156
    :cond_1
    iget-object v1, p0, Landroid/support/v7/internal/widget/m;->d:Landroid/support/v7/widget/LinearLayoutCompat;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/m;->removeView(Landroid/view/View;)V

    .line 1157
    iget-object v1, p0, Landroid/support/v7/internal/widget/m;->e:Landroid/support/v7/internal/widget/SpinnerCompat;

    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v4, v8, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v1, v4}, Landroid/support/v7/internal/widget/m;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1159
    iget-object v1, p0, Landroid/support/v7/internal/widget/m;->e:Landroid/support/v7/internal/widget/SpinnerCompat;

    .line 1308
    iget-object v1, v1, Landroid/support/v7/internal/widget/AbsSpinnerCompat;->a:Landroid/widget/SpinnerAdapter;

    .line 1159
    if-nez v1, :cond_2

    .line 1160
    iget-object v1, p0, Landroid/support/v7/internal/widget/m;->e:Landroid/support/v7/internal/widget/SpinnerCompat;

    new-instance v4, Landroid/support/v7/internal/widget/m$a;

    invoke-direct {v4, p0, v2}, Landroid/support/v7/internal/widget/m$a;-><init>(Landroid/support/v7/internal/widget/m;B)V

    invoke-virtual {v1, v4}, Landroid/support/v7/internal/widget/SpinnerCompat;->a(Landroid/widget/SpinnerAdapter;)V

    .line 1162
    :cond_2
    iget-object v1, p0, Landroid/support/v7/internal/widget/m;->a:Ljava/lang/Runnable;

    if-eqz v1, :cond_3

    .line 1163
    iget-object v1, p0, Landroid/support/v7/internal/widget/m;->a:Ljava/lang/Runnable;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/m;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1164
    const/4 v1, 0x0

    iput-object v1, p0, Landroid/support/v7/internal/widget/m;->a:Ljava/lang/Runnable;

    .line 1166
    :cond_3
    iget-object v1, p0, Landroid/support/v7/internal/widget/m;->e:Landroid/support/v7/internal/widget/SpinnerCompat;

    iget v2, p0, Landroid/support/v7/internal/widget/m;->h:I

    invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/SpinnerCompat;->setSelection(I)V

    .line 127
    :cond_4
    :goto_4
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/m;->getMeasuredWidth()I

    move-result v1

    .line 128
    invoke-super {p0, p1, v3}, Landroid/widget/HorizontalScrollView;->onMeasure(II)V

    .line 129
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/m;->getMeasuredWidth()I

    move-result v2

    .line 131
    if-eqz v0, :cond_5

    if-eq v1, v2, :cond_5

    .line 133
    iget v0, p0, Landroid/support/v7/internal/widget/m;->h:I

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/m;->setTabSelected(I)V

    .line 135
    :cond_5
    return-void

    :cond_6
    move v0, v2

    .line 95
    goto/16 :goto_0

    .line 104
    :cond_7
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    iput v3, p0, Landroid/support/v7/internal/widget/m;->b:I

    goto/16 :goto_1

    .line 108
    :cond_8
    iput v6, p0, Landroid/support/v7/internal/widget/m;->b:I

    goto/16 :goto_2

    :cond_9
    move v1, v2

    .line 113
    goto/16 :goto_3

    .line 121
    :cond_a
    invoke-direct {p0}, Landroid/support/v7/internal/widget/m;->b()Z

    goto :goto_4

    .line 124
    :cond_b
    invoke-direct {p0}, Landroid/support/v7/internal/widget/m;->b()Z

    goto :goto_4
.end method

.method public final setAllowCollapse(Z)V
    .locals 0

    .prologue
    .line 147
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/m;->f:Z

    .line 148
    return-void
.end method

.method public final setContentHeight(I)V
    .locals 0

    .prologue
    .line 196
    iput p1, p0, Landroid/support/v7/internal/widget/m;->g:I

    .line 197
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/m;->requestLayout()V

    .line 198
    return-void
.end method

.method public final setTabSelected(I)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 180
    iput p1, p0, Landroid/support/v7/internal/widget/m;->h:I

    .line 181
    iget-object v0, p0, Landroid/support/v7/internal/widget/m;->d:Landroid/support/v7/widget/LinearLayoutCompat;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildCount()I

    move-result v3

    move v2, v1

    .line 182
    :goto_0
    if-ge v2, v3, :cond_3

    .line 183
    iget-object v0, p0, Landroid/support/v7/internal/widget/m;->d:Landroid/support/v7/widget/LinearLayoutCompat;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 184
    if-ne v2, p1, :cond_2

    const/4 v0, 0x1

    .line 185
    :goto_1
    invoke-virtual {v4, v0}, Landroid/view/View;->setSelected(Z)V

    .line 186
    if-eqz v0, :cond_1

    .line 2257
    iget-object v0, p0, Landroid/support/v7/internal/widget/m;->d:Landroid/support/v7/widget/LinearLayoutCompat;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/LinearLayoutCompat;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 2258
    iget-object v4, p0, Landroid/support/v7/internal/widget/m;->a:Ljava/lang/Runnable;

    if-eqz v4, :cond_0

    .line 2259
    iget-object v4, p0, Landroid/support/v7/internal/widget/m;->a:Ljava/lang/Runnable;

    invoke-virtual {p0, v4}, Landroid/support/v7/internal/widget/m;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 2261
    :cond_0
    new-instance v4, Landroid/support/v7/internal/widget/m$1;

    invoke-direct {v4, p0, v0}, Landroid/support/v7/internal/widget/m$1;-><init>(Landroid/support/v7/internal/widget/m;Landroid/view/View;)V

    iput-object v4, p0, Landroid/support/v7/internal/widget/m;->a:Ljava/lang/Runnable;

    .line 2268
    iget-object v0, p0, Landroid/support/v7/internal/widget/m;->a:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/m;->post(Ljava/lang/Runnable;)Z

    .line 182
    :cond_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_2
    move v0, v1

    .line 184
    goto :goto_1

    .line 190
    :cond_3
    iget-object v0, p0, Landroid/support/v7/internal/widget/m;->e:Landroid/support/v7/internal/widget/SpinnerCompat;

    if-eqz v0, :cond_4

    if-ltz p1, :cond_4

    .line 191
    iget-object v0, p0, Landroid/support/v7/internal/widget/m;->e:Landroid/support/v7/internal/widget/SpinnerCompat;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/SpinnerCompat;->setSelection(I)V

    .line 193
    :cond_4
    return-void
.end method
