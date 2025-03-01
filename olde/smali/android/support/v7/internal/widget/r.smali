.class public final Landroid/support/v7/internal/widget/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v7/internal/widget/h;


# instance fields
.field a:Landroid/support/v7/widget/Toolbar;

.field b:Ljava/lang/CharSequence;

.field private c:I

.field private d:Landroid/view/View;

.field private e:Landroid/graphics/drawable/Drawable;

.field private f:Landroid/graphics/drawable/Drawable;

.field private g:Landroid/graphics/drawable/Drawable;

.field private h:Z

.field private i:Ljava/lang/CharSequence;

.field private j:Ljava/lang/CharSequence;

.field private k:Landroid/support/v7/internal/a/a;

.field private l:I

.field private final m:Landroid/support/v7/internal/widget/o;

.field private n:I

.field private o:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/Toolbar;)V
    .locals 2

    .prologue
    .line 88
    sget v0, Landroid/support/v7/b/a$h;->abc_action_bar_up_description:I

    sget v1, Landroid/support/v7/b/a$d;->abc_ic_ab_back_mtrl_am_alpha:I

    invoke-direct {p0, p1, v0, v1}, Landroid/support/v7/internal/widget/r;-><init>(Landroid/support/v7/widget/Toolbar;II)V

    .line 90
    return-void
.end method

.method private constructor <init>(Landroid/support/v7/widget/Toolbar;II)V
    .locals 7

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x1

    const/4 v6, -0x1

    const/4 v2, 0x0

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput v2, p0, Landroid/support/v7/internal/widget/r;->l:I

    .line 84
    iput v2, p0, Landroid/support/v7/internal/widget/r;->n:I

    .line 94
    iput-object p1, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    .line 95
    invoke-virtual {p1}, Landroid/support/v7/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/widget/r;->b:Ljava/lang/CharSequence;

    .line 96
    invoke-virtual {p1}, Landroid/support/v7/widget/Toolbar;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/widget/r;->i:Ljava/lang/CharSequence;

    .line 97
    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->b:Ljava/lang/CharSequence;

    if-eqz v0, :cond_10

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/r;->h:Z

    .line 100
    invoke-virtual {p1}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v4, Landroid/support/v7/b/a$i;->ActionBar:[I

    sget v5, Landroid/support/v7/b/a$a;->actionBarStyle:I

    invoke-static {v0, v3, v4, v5}, Landroid/support/v7/internal/widget/q;->a(Landroid/content/Context;Landroid/util/AttributeSet;[II)Landroid/support/v7/internal/widget/q;

    move-result-object v0

    .line 103
    sget v4, Landroid/support/v7/b/a$i;->ActionBar_title:I

    invoke-virtual {v0, v4}, Landroid/support/v7/internal/widget/q;->b(I)Ljava/lang/CharSequence;

    move-result-object v4

    .line 104
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 1278
    iput-boolean v1, p0, Landroid/support/v7/internal/widget/r;->h:Z

    .line 1279
    invoke-direct {p0, v4}, Landroid/support/v7/internal/widget/r;->b(Ljava/lang/CharSequence;)V

    .line 108
    :cond_0
    sget v1, Landroid/support/v7/b/a$i;->ActionBar_subtitle:I

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/q;->b(I)Ljava/lang/CharSequence;

    move-result-object v1

    .line 109
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 1296
    iput-object v1, p0, Landroid/support/v7/internal/widget/r;->i:Ljava/lang/CharSequence;

    .line 1297
    iget v4, p0, Landroid/support/v7/internal/widget/r;->c:I

    and-int/lit8 v4, v4, 0x8

    if-eqz v4, :cond_1

    .line 1298
    iget-object v4, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v4, v1}, Landroid/support/v7/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 113
    :cond_1
    sget v1, Landroid/support/v7/b/a$i;->ActionBar_logo:I

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/q;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 114
    if-eqz v1, :cond_2

    .line 115
    invoke-direct {p0, v1}, Landroid/support/v7/internal/widget/r;->b(Landroid/graphics/drawable/Drawable;)V

    .line 118
    :cond_2
    sget v1, Landroid/support/v7/b/a$i;->ActionBar_icon:I

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/q;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 119
    if-eqz v1, :cond_3

    .line 120
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/r;->a(Landroid/graphics/drawable/Drawable;)V

    .line 123
    :cond_3
    sget v1, Landroid/support/v7/b/a$i;->ActionBar_homeAsUpIndicator:I

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/q;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 124
    if-eqz v1, :cond_4

    .line 1631
    iput-object v1, p0, Landroid/support/v7/internal/widget/r;->g:Landroid/graphics/drawable/Drawable;

    .line 1632
    invoke-direct {p0}, Landroid/support/v7/internal/widget/r;->d()V

    .line 128
    :cond_4
    sget v1, Landroid/support/v7/b/a$i;->ActionBar_displayOptions:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/widget/q;->a(II)I

    move-result v1

    invoke-direct {p0, v1}, Landroid/support/v7/internal/widget/r;->c(I)V

    .line 130
    sget v1, Landroid/support/v7/b/a$i;->ActionBar_customNavigationLayout:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/widget/q;->e(II)I

    move-result v1

    .line 132
    if-eqz v1, :cond_7

    .line 133
    iget-object v4, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v4}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    iget-object v5, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v4, v1, v5, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 2586
    iget-object v4, p0, Landroid/support/v7/internal/widget/r;->d:Landroid/view/View;

    if-eqz v4, :cond_5

    iget v4, p0, Landroid/support/v7/internal/widget/r;->c:I

    and-int/lit8 v4, v4, 0x10

    if-eqz v4, :cond_5

    .line 2587
    iget-object v4, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v5, p0, Landroid/support/v7/internal/widget/r;->d:Landroid/view/View;

    invoke-virtual {v4, v5}, Landroid/support/v7/widget/Toolbar;->removeView(Landroid/view/View;)V

    .line 2589
    :cond_5
    iput-object v1, p0, Landroid/support/v7/internal/widget/r;->d:Landroid/view/View;

    .line 2590
    if-eqz v1, :cond_6

    iget v1, p0, Landroid/support/v7/internal/widget/r;->c:I

    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_6

    .line 2591
    iget-object v1, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v4, p0, Landroid/support/v7/internal/widget/r;->d:Landroid/view/View;

    invoke-virtual {v1, v4}, Landroid/support/v7/widget/Toolbar;->addView(Landroid/view/View;)V

    .line 135
    :cond_6
    iget v1, p0, Landroid/support/v7/internal/widget/r;->c:I

    or-int/lit8 v1, v1, 0x10

    invoke-direct {p0, v1}, Landroid/support/v7/internal/widget/r;->c(I)V

    .line 138
    :cond_7
    sget v1, Landroid/support/v7/b/a$i;->ActionBar_height:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/widget/q;->d(II)I

    move-result v1

    .line 139
    if-lez v1, :cond_8

    .line 140
    iget-object v4, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v4}, Landroid/support/v7/widget/Toolbar;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    .line 141
    iput v1, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 142
    iget-object v1, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v1, v4}, Landroid/support/v7/widget/Toolbar;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 145
    :cond_8
    sget v1, Landroid/support/v7/b/a$i;->ActionBar_contentInsetStart:I

    invoke-virtual {v0, v1, v6}, Landroid/support/v7/internal/widget/q;->b(II)I

    move-result v1

    .line 147
    sget v4, Landroid/support/v7/b/a$i;->ActionBar_contentInsetEnd:I

    invoke-virtual {v0, v4, v6}, Landroid/support/v7/internal/widget/q;->b(II)I

    move-result v4

    .line 149
    if-gez v1, :cond_9

    if-ltz v4, :cond_a

    .line 150
    :cond_9
    iget-object v5, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 2892
    iget-object v5, v5, Landroid/support/v7/widget/Toolbar;->g:Landroid/support/v7/internal/widget/l;

    invoke-virtual {v5, v1, v4}, Landroid/support/v7/internal/widget/l;->a(II)V

    .line 154
    :cond_a
    sget v1, Landroid/support/v7/b/a$i;->ActionBar_titleTextStyle:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/widget/q;->e(II)I

    move-result v1

    .line 155
    if-eqz v1, :cond_b

    .line 156
    iget-object v4, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v5, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v5}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v5

    .line 3659
    iput v1, v4, Landroid/support/v7/widget/Toolbar;->e:I

    .line 3660
    iget-object v6, v4, Landroid/support/v7/widget/Toolbar;->b:Landroid/widget/TextView;

    if-eqz v6, :cond_b

    .line 3661
    iget-object v4, v4, Landroid/support/v7/widget/Toolbar;->b:Landroid/widget/TextView;

    invoke-virtual {v4, v5, v1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 159
    :cond_b
    sget v1, Landroid/support/v7/b/a$i;->ActionBar_subtitleTextStyle:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/widget/q;->e(II)I

    move-result v1

    .line 161
    if-eqz v1, :cond_c

    .line 162
    iget-object v4, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v5, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v5}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v5

    .line 3670
    iput v1, v4, Landroid/support/v7/widget/Toolbar;->f:I

    .line 3671
    iget-object v6, v4, Landroid/support/v7/widget/Toolbar;->c:Landroid/widget/TextView;

    if-eqz v6, :cond_c

    .line 3672
    iget-object v4, v4, Landroid/support/v7/widget/Toolbar;->c:Landroid/widget/TextView;

    invoke-virtual {v4, v5, v1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 165
    :cond_c
    sget v1, Landroid/support/v7/b/a$i;->ActionBar_popupTheme:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/widget/q;->e(II)I

    move-result v1

    .line 166
    if-eqz v1, :cond_d

    .line 167
    iget-object v2, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v2, v1}, Landroid/support/v7/widget/Toolbar;->setPopupTheme(I)V

    .line 4173
    :cond_d
    iget-object v1, v0, Landroid/support/v7/internal/widget/q;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 172
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/q;->a()Landroid/support/v7/internal/widget/o;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/widget/r;->m:Landroid/support/v7/internal/widget/o;

    .line 5207
    iget v0, p0, Landroid/support/v7/internal/widget/r;->n:I

    if-eq p2, v0, :cond_e

    .line 5210
    iput p2, p0, Landroid/support/v7/internal/widget/r;->n:I

    .line 5211
    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 5212
    iget v0, p0, Landroid/support/v7/internal/widget/r;->n:I

    .line 5650
    if-nez v0, :cond_11

    move-object v0, v3

    .line 6644
    :goto_1
    iput-object v0, p0, Landroid/support/v7/internal/widget/r;->j:Ljava/lang/CharSequence;

    .line 6645
    invoke-direct {p0}, Landroid/support/v7/internal/widget/r;->c()V

    .line 180
    :cond_e
    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/widget/r;->j:Ljava/lang/CharSequence;

    .line 182
    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->m:Landroid/support/v7/internal/widget/o;

    invoke-virtual {v0, p3}, Landroid/support/v7/internal/widget/o;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 7218
    iget-object v1, p0, Landroid/support/v7/internal/widget/r;->o:Landroid/graphics/drawable/Drawable;

    if-eq v1, v0, :cond_f

    .line 7219
    iput-object v0, p0, Landroid/support/v7/internal/widget/r;->o:Landroid/graphics/drawable/Drawable;

    .line 7220
    invoke-direct {p0}, Landroid/support/v7/internal/widget/r;->d()V

    .line 184
    :cond_f
    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    new-instance v1, Landroid/support/v7/internal/widget/r$1;

    invoke-direct {v1, p0}, Landroid/support/v7/internal/widget/r$1;-><init>(Landroid/support/v7/internal/widget/r;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 194
    return-void

    :cond_10
    move v0, v2

    .line 97
    goto/16 :goto_0

    .line 6240
    :cond_11
    iget-object v1, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v1}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 5650
    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method private b()V
    .locals 2

    .prologue
    .line 366
    const/4 v0, 0x0

    .line 367
    iget v1, p0, Landroid/support/v7/internal/widget/r;->c:I

    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_0

    .line 368
    iget v0, p0, Landroid/support/v7/internal/widget/r;->c:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_2

    .line 369
    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->f:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->f:Landroid/graphics/drawable/Drawable;

    .line 374
    :cond_0
    :goto_0
    iget-object v1, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/Toolbar;->setLogo(Landroid/graphics/drawable/Drawable;)V

    .line 375
    return-void

    .line 369
    :cond_1
    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->e:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    .line 371
    :cond_2
    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->e:Landroid/graphics/drawable/Drawable;

    goto :goto_0
.end method

.method private b(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .prologue
    .line 361
    iput-object p1, p0, Landroid/support/v7/internal/widget/r;->f:Landroid/graphics/drawable/Drawable;

    .line 362
    invoke-direct {p0}, Landroid/support/v7/internal/widget/r;->b()V

    .line 363
    return-void
.end method

.method private b(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 283
    iput-object p1, p0, Landroid/support/v7/internal/widget/r;->b:Ljava/lang/CharSequence;

    .line 284
    iget v0, p0, Landroid/support/v7/internal/widget/r;->c:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    .line 285
    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 287
    :cond_0
    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 654
    iget v0, p0, Landroid/support/v7/internal/widget/r;->c:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    .line 655
    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->j:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 656
    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    iget v1, p0, Landroid/support/v7/internal/widget/r;->n:I

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setNavigationContentDescription(I)V

    .line 661
    :cond_0
    :goto_0
    return-void

    .line 658
    :cond_1
    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v1, p0, Landroid/support/v7/internal/widget/r;->j:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private c(I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 429
    iget v0, p0, Landroid/support/v7/internal/widget/r;->c:I

    .line 430
    xor-int/2addr v0, p1

    .line 431
    iput p1, p0, Landroid/support/v7/internal/widget/r;->c:I

    .line 432
    if-eqz v0, :cond_3

    .line 433
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    .line 434
    and-int/lit8 v1, p1, 0x4

    if-eqz v1, :cond_4

    .line 435
    invoke-direct {p0}, Landroid/support/v7/internal/widget/r;->d()V

    .line 436
    invoke-direct {p0}, Landroid/support/v7/internal/widget/r;->c()V

    .line 442
    :cond_0
    :goto_0
    and-int/lit8 v1, v0, 0x3

    if-eqz v1, :cond_1

    .line 443
    invoke-direct {p0}, Landroid/support/v7/internal/widget/r;->b()V

    .line 446
    :cond_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    .line 447
    and-int/lit8 v1, p1, 0x8

    if-eqz v1, :cond_5

    .line 448
    iget-object v1, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v2, p0, Landroid/support/v7/internal/widget/r;->b:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 449
    iget-object v1, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v2, p0, Landroid/support/v7/internal/widget/r;->i:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 456
    :cond_2
    :goto_1
    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->d:Landroid/view/View;

    if-eqz v0, :cond_3

    .line 457
    and-int/lit8 v0, p1, 0x10

    if-eqz v0, :cond_6

    .line 458
    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v1, p0, Landroid/support/v7/internal/widget/r;->d:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->addView(Landroid/view/View;)V

    .line 464
    :cond_3
    :goto_2
    return-void

    .line 438
    :cond_4
    iget-object v1, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 451
    :cond_5
    iget-object v1, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 452
    iget-object v1, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 460
    :cond_6
    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v1, p0, Landroid/support/v7/internal/widget/r;->d:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->removeView(Landroid/view/View;)V

    goto :goto_2
.end method

.method private d()V
    .locals 2

    .prologue
    .line 664
    iget v0, p0, Landroid/support/v7/internal/widget/r;->c:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    .line 665
    iget-object v1, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->g:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->g:Landroid/graphics/drawable/Drawable;

    :goto_0
    invoke-virtual {v1, v0}, Landroid/support/v7/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 667
    :cond_0
    return-void

    .line 665
    :cond_1
    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->o:Landroid/graphics/drawable/Drawable;

    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 273
    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 345
    if-eqz p1, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->m:Landroid/support/v7/internal/widget/o;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/o;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :goto_0
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/r;->a(Landroid/graphics/drawable/Drawable;)V

    .line 346
    return-void

    .line 345
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .prologue
    .line 350
    iput-object p1, p0, Landroid/support/v7/internal/widget/r;->e:Landroid/graphics/drawable/Drawable;

    .line 351
    invoke-direct {p0}, Landroid/support/v7/internal/widget/r;->b()V

    .line 352
    return-void
.end method

.method public final a(Landroid/support/v7/internal/a/a;)V
    .locals 0

    .prologue
    .line 260
    iput-object p1, p0, Landroid/support/v7/internal/widget/r;->k:Landroid/support/v7/internal/a/a;

    .line 261
    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 266
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/r;->h:Z

    if-nez v0, :cond_0

    .line 267
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/r;->b(Ljava/lang/CharSequence;)V

    .line 269
    :cond_0
    return-void
.end method

.method public final b(I)V
    .locals 1

    .prologue
    .line 356
    if-eqz p1, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/r;->m:Landroid/support/v7/internal/widget/o;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/o;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Landroid/support/v7/internal/widget/r;->b(Landroid/graphics/drawable/Drawable;)V

    .line 357
    return-void

    .line 356
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
