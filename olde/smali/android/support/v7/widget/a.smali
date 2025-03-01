.class public final Landroid/support/v7/widget/a;
.super Landroid/support/v7/internal/view/menu/b;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/d$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/widget/a$b;,
        Landroid/support/v7/widget/a$c;,
        Landroid/support/v7/widget/a$f;,
        Landroid/support/v7/widget/a$a;,
        Landroid/support/v7/widget/a$e;,
        Landroid/support/v7/widget/a$d;
    }
.end annotation


# instance fields
.field h:Landroid/view/View;

.field i:Z

.field j:Z

.field public k:I

.field public l:I

.field public m:Z

.field public n:Z

.field public o:Z

.field p:Z

.field q:Landroid/support/v7/widget/a$e;

.field r:Landroid/support/v7/widget/a$a;

.field s:Landroid/support/v7/widget/a$c;

.field final t:Landroid/support/v7/widget/a$f;

.field u:I

.field private v:I

.field private w:I

.field private final x:Landroid/util/SparseBooleanArray;

.field private y:Landroid/view/View;

.field private z:Landroid/support/v7/widget/a$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 86
    sget v0, Landroid/support/v7/b/a$g;->abc_action_menu_layout:I

    sget v1, Landroid/support/v7/b/a$g;->abc_action_menu_item_layout:I

    invoke-direct {p0, p1, v0, v1}, Landroid/support/v7/internal/view/menu/b;-><init>(Landroid/content/Context;II)V

    .line 72
    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/a;->x:Landroid/util/SparseBooleanArray;

    .line 82
    new-instance v0, Landroid/support/v7/widget/a$f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroid/support/v7/widget/a$f;-><init>(Landroid/support/v7/widget/a;B)V

    iput-object v0, p0, Landroid/support/v7/widget/a;->t:Landroid/support/v7/widget/a$f;

    .line 87
    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/a;)Landroid/support/v7/internal/view/menu/e;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Landroid/support/v7/widget/a;->c:Landroid/support/v7/internal/view/menu/e;

    return-object v0
.end method

.method static synthetic b(Landroid/support/v7/widget/a;)Landroid/support/v7/internal/view/menu/k;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Landroid/support/v7/widget/a;->g:Landroid/support/v7/internal/view/menu/k;

    return-object v0
.end method

.method static synthetic c(Landroid/support/v7/widget/a;)Landroid/support/v7/internal/view/menu/k;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Landroid/support/v7/widget/a;->g:Landroid/support/v7/internal/view/menu/k;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/k;
    .locals 2

    .prologue
    .line 161
    invoke-super {p0, p1}, Landroid/support/v7/internal/view/menu/b;->a(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/k;

    move-result-object v1

    move-object v0, v1

    .line 162
    check-cast v0, Landroid/support/v7/widget/ActionMenuView;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/ActionMenuView;->setPresenter(Landroid/support/v7/widget/a;)V

    .line 163
    return-object v1
.end method

.method public final a(Landroid/support/v7/internal/view/menu/f;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 168
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/f;->getActionView()Landroid/view/View;

    move-result-object v0

    .line 169
    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/f;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 170
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/internal/view/menu/b;->a(Landroid/support/v7/internal/view/menu/f;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 172
    :cond_1
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/f;->isActionViewExpanded()Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 174
    check-cast p3, Landroid/support/v7/widget/ActionMenuView;

    .line 175
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 176
    invoke-virtual {p3, v1}, Landroid/support/v7/widget/ActionMenuView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 177
    invoke-static {v1}, Landroid/support/v7/widget/ActionMenuView;->a(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/widget/ActionMenuView$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 179
    :cond_2
    return-object v0

    .line 172
    :cond_3
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public final a(Landroid/content/Context;Landroid/support/v7/internal/view/menu/e;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 91
    invoke-super {p0, p1, p2}, Landroid/support/v7/internal/view/menu/b;->a(Landroid/content/Context;Landroid/support/v7/internal/view/menu/e;)V

    .line 93
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 95
    invoke-static {p1}, Landroid/support/v7/internal/view/a;->a(Landroid/content/Context;)Landroid/support/v7/internal/view/a;

    move-result-object v3

    .line 96
    iget-boolean v4, p0, Landroid/support/v7/widget/a;->j:Z

    if-nez v4, :cond_1

    .line 2050
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x13

    if-lt v4, v5, :cond_5

    .line 97
    :cond_0
    :goto_0
    iput-boolean v0, p0, Landroid/support/v7/widget/a;->i:Z

    .line 100
    :cond_1
    iget-boolean v0, p0, Landroid/support/v7/widget/a;->o:Z

    if-nez v0, :cond_2

    .line 2058
    iget-object v0, v3, Landroid/support/v7/internal/view/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v0, v0, 0x2

    .line 101
    iput v0, p0, Landroid/support/v7/widget/a;->k:I

    .line 105
    :cond_2
    iget-boolean v0, p0, Landroid/support/v7/widget/a;->m:Z

    if-nez v0, :cond_3

    .line 3046
    iget-object v0, v3, Landroid/support/v7/internal/view/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v3, Landroid/support/v7/b/a$f;->abc_max_action_buttons:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    .line 106
    iput v0, p0, Landroid/support/v7/widget/a;->l:I

    .line 109
    :cond_3
    iget v0, p0, Landroid/support/v7/widget/a;->k:I

    .line 110
    iget-boolean v3, p0, Landroid/support/v7/widget/a;->i:Z

    if-eqz v3, :cond_6

    .line 111
    iget-object v3, p0, Landroid/support/v7/widget/a;->h:Landroid/view/View;

    if-nez v3, :cond_4

    .line 112
    new-instance v3, Landroid/support/v7/widget/a$d;

    iget-object v4, p0, Landroid/support/v7/widget/a;->a:Landroid/content/Context;

    invoke-direct {v3, p0, v4}, Landroid/support/v7/widget/a$d;-><init>(Landroid/support/v7/widget/a;Landroid/content/Context;)V

    iput-object v3, p0, Landroid/support/v7/widget/a;->h:Landroid/view/View;

    .line 113
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 114
    iget-object v3, p0, Landroid/support/v7/widget/a;->h:Landroid/view/View;

    invoke-virtual {v3, v1, v1}, Landroid/view/View;->measure(II)V

    .line 116
    :cond_4
    iget-object v1, p0, Landroid/support/v7/widget/a;->h:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    sub-int/2addr v0, v1

    .line 121
    :goto_1
    iput v0, p0, Landroid/support/v7/widget/a;->v:I

    .line 123
    const/high16 v0, 0x42600000    # 56.0f

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/a;->w:I

    .line 126
    iput-object v6, p0, Landroid/support/v7/widget/a;->y:Landroid/view/View;

    .line 127
    return-void

    .line 2053
    :cond_5
    iget-object v4, v3, Landroid/support/v7/internal/view/a;->a:Landroid/content/Context;

    invoke-static {v4}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v4

    invoke-static {v4}, Landroid/support/v4/view/ab;->b(Landroid/view/ViewConfiguration;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v0, v1

    goto :goto_0

    .line 118
    :cond_6
    iput-object v6, p0, Landroid/support/v7/widget/a;->h:Landroid/view/View;

    goto :goto_1
.end method

.method public final a(Landroid/support/v7/internal/view/menu/e;Z)V
    .locals 0

    .prologue
    .line 514
    invoke-virtual {p0}, Landroid/support/v7/widget/a;->e()Z

    .line 515
    invoke-super {p0, p1, p2}, Landroid/support/v7/internal/view/menu/b;->a(Landroid/support/v7/internal/view/menu/e;Z)V

    .line 516
    return-void
.end method

.method public final a(Landroid/support/v7/internal/view/menu/f;Landroid/support/v7/internal/view/menu/k$a;)V
    .locals 2

    .prologue
    .line 184
    invoke-interface {p2, p1}, Landroid/support/v7/internal/view/menu/k$a;->a(Landroid/support/v7/internal/view/menu/f;)V

    .line 186
    iget-object v0, p0, Landroid/support/v7/widget/a;->g:Landroid/support/v7/internal/view/menu/k;

    check-cast v0, Landroid/support/v7/widget/ActionMenuView;

    .line 187
    check-cast p2, Landroid/support/v7/internal/view/menu/ActionMenuItemView;

    .line 188
    invoke-virtual {p2, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setItemInvoker(Landroid/support/v7/internal/view/menu/e$b;)V

    .line 190
    iget-object v0, p0, Landroid/support/v7/widget/a;->z:Landroid/support/v7/widget/a$b;

    if-nez v0, :cond_0

    .line 191
    new-instance v0, Landroid/support/v7/widget/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroid/support/v7/widget/a$b;-><init>(Landroid/support/v7/widget/a;B)V

    iput-object v0, p0, Landroid/support/v7/widget/a;->z:Landroid/support/v7/widget/a$b;

    .line 193
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/a;->z:Landroid/support/v7/widget/a$b;

    invoke-virtual {p2, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setPopupCallback(Landroid/support/v7/internal/view/menu/ActionMenuItemView$b;)V

    .line 194
    return-void
.end method

.method public final a(Landroid/support/v7/widget/ActionMenuView;)V
    .locals 1

    .prologue
    .line 548
    iput-object p1, p0, Landroid/support/v7/widget/a;->g:Landroid/support/v7/internal/view/menu/k;

    .line 549
    iget-object v0, p0, Landroid/support/v7/widget/a;->c:Landroid/support/v7/internal/view/menu/e;

    .line 7606
    iput-object v0, p1, Landroid/support/v7/widget/ActionMenuView;->a:Landroid/support/v7/internal/view/menu/e;

    .line 550
    return-void
.end method

.method public final a(Z)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 203
    iget-object v0, p0, Landroid/support/v7/widget/a;->g:Landroid/support/v7/internal/view/menu/k;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 207
    invoke-super {p0, p1}, Landroid/support/v7/internal/view/menu/b;->a(Z)V

    .line 209
    iget-object v0, p0, Landroid/support/v7/widget/a;->g:Landroid/support/v7/internal/view/menu/k;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 211
    iget-object v0, p0, Landroid/support/v7/widget/a;->c:Landroid/support/v7/internal/view/menu/e;

    if-eqz v0, :cond_1

    .line 212
    iget-object v0, p0, Landroid/support/v7/widget/a;->c:Landroid/support/v7/internal/view/menu/e;

    .line 3156
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/e;->f()V

    .line 3157
    iget-object v4, v0, Landroid/support/v7/internal/view/menu/e;->c:Ljava/util/ArrayList;

    .line 213
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v3, v2

    .line 214
    :goto_0
    if-ge v3, v5, :cond_1

    .line 215
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/view/menu/f;

    .line 3651
    iget-object v0, v0, Landroid/support/v7/internal/view/menu/f;->d:Landroid/support/v4/view/d;

    .line 216
    if-eqz v0, :cond_0

    .line 4226
    iput-object p0, v0, Landroid/support/v4/view/d;->a:Landroid/support/v4/view/d$a;

    .line 214
    :cond_0
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 222
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/a;->c:Landroid/support/v7/internal/view/menu/e;

    if-eqz v0, :cond_6

    iget-object v0, p0, Landroid/support/v7/widget/a;->c:Landroid/support/v7/internal/view/menu/e;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/e;->g()Ljava/util/ArrayList;

    move-result-object v0

    .line 226
    :goto_1
    iget-boolean v3, p0, Landroid/support/v7/widget/a;->i:Z

    if-eqz v3, :cond_2

    if-eqz v0, :cond_2

    .line 227
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 228
    if-ne v3, v1, :cond_8

    .line 229
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/view/menu/f;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/f;->isActionViewExpanded()Z

    move-result v0

    if-nez v0, :cond_7

    move v0, v1

    :goto_2
    move v2, v0

    .line 235
    :cond_2
    :goto_3
    if-eqz v2, :cond_a

    .line 236
    iget-object v0, p0, Landroid/support/v7/widget/a;->h:Landroid/view/View;

    if-nez v0, :cond_3

    .line 237
    new-instance v0, Landroid/support/v7/widget/a$d;

    iget-object v1, p0, Landroid/support/v7/widget/a;->a:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Landroid/support/v7/widget/a$d;-><init>(Landroid/support/v7/widget/a;Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/widget/a;->h:Landroid/view/View;

    .line 239
    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/a;->h:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 240
    iget-object v1, p0, Landroid/support/v7/widget/a;->g:Landroid/support/v7/internal/view/menu/k;

    if-eq v0, v1, :cond_5

    .line 241
    if-eqz v0, :cond_4

    .line 242
    iget-object v1, p0, Landroid/support/v7/widget/a;->h:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 244
    :cond_4
    iget-object v0, p0, Landroid/support/v7/widget/a;->g:Landroid/support/v7/internal/view/menu/k;

    check-cast v0, Landroid/support/v7/widget/ActionMenuView;

    .line 245
    iget-object v1, p0, Landroid/support/v7/widget/a;->h:Landroid/view/View;

    invoke-static {}, Landroid/support/v7/widget/ActionMenuView;->a()Landroid/support/v7/widget/ActionMenuView$c;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/ActionMenuView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 251
    :cond_5
    :goto_4
    iget-object v0, p0, Landroid/support/v7/widget/a;->g:Landroid/support/v7/internal/view/menu/k;

    check-cast v0, Landroid/support/v7/widget/ActionMenuView;

    iget-boolean v1, p0, Landroid/support/v7/widget/a;->i:Z

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionMenuView;->setOverflowReserved(Z)V

    .line 252
    return-void

    .line 222
    :cond_6
    const/4 v0, 0x0

    goto :goto_1

    :cond_7
    move v0, v2

    .line 229
    goto :goto_2

    .line 231
    :cond_8
    if-lez v3, :cond_9

    :goto_5
    move v2, v1

    goto :goto_3

    :cond_9
    move v1, v2

    goto :goto_5

    .line 247
    :cond_a
    iget-object v0, p0, Landroid/support/v7/widget/a;->h:Landroid/view/View;

    if-eqz v0, :cond_5

    iget-object v0, p0, Landroid/support/v7/widget/a;->h:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/a;->g:Landroid/support/v7/internal/view/menu/k;

    if-ne v0, v1, :cond_5

    .line 248
    iget-object v0, p0, Landroid/support/v7/widget/a;->g:Landroid/support/v7/internal/view/menu/k;

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Landroid/support/v7/widget/a;->h:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    goto :goto_4
.end method

.method public final a()Z
    .locals 19

    .prologue
    .line 379
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/widget/a;->c:Landroid/support/v7/internal/view/menu/e;

    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/e;->e()Ljava/util/ArrayList;

    move-result-object v13

    .line 380
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v14

    .line 381
    move-object/from16 v0, p0

    iget v7, v0, Landroid/support/v7/widget/a;->l:I

    .line 382
    move-object/from16 v0, p0

    iget v9, v0, Landroid/support/v7/widget/a;->v:I

    .line 383
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v15

    .line 384
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/widget/a;->g:Landroid/support/v7/internal/view/menu/k;

    check-cast v2, Landroid/view/ViewGroup;

    .line 386
    const/4 v6, 0x0

    .line 387
    const/4 v5, 0x0

    .line 388
    const/4 v8, 0x0

    .line 389
    const/4 v4, 0x0

    .line 390
    const/4 v3, 0x0

    move v10, v3

    :goto_0
    if-ge v10, v14, :cond_2

    .line 391
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/support/v7/internal/view/menu/f;

    .line 392
    invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/f;->h()Z

    move-result v11

    if-eqz v11, :cond_0

    .line 393
    add-int/lit8 v6, v6, 0x1

    .line 399
    :goto_1
    move-object/from16 v0, p0

    iget-boolean v11, v0, Landroid/support/v7/widget/a;->p:Z

    if-eqz v11, :cond_1e

    invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/f;->isActionViewExpanded()Z

    move-result v3

    if-eqz v3, :cond_1e

    .line 402
    const/4 v3, 0x0

    .line 390
    :goto_2
    add-int/lit8 v7, v10, 0x1

    move v10, v7

    move v7, v3

    goto :goto_0

    .line 394
    :cond_0
    invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/f;->g()Z

    move-result v11

    if-eqz v11, :cond_1

    .line 395
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 397
    :cond_1
    const/4 v4, 0x1

    goto :goto_1

    .line 407
    :cond_2
    move-object/from16 v0, p0

    iget-boolean v3, v0, Landroid/support/v7/widget/a;->i:Z

    if-eqz v3, :cond_4

    if-nez v4, :cond_3

    add-int v3, v6, v5

    if-le v3, v7, :cond_4

    .line 409
    :cond_3
    add-int/lit8 v7, v7, -0x1

    .line 411
    :cond_4
    sub-int v10, v7, v6

    .line 413
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/widget/a;->x:Landroid/util/SparseBooleanArray;

    move-object/from16 v16, v0

    .line 414
    invoke-virtual/range {v16 .. v16}, Landroid/util/SparseBooleanArray;->clear()V

    .line 416
    const/4 v3, 0x0

    .line 417
    const/4 v4, 0x0

    .line 418
    move-object/from16 v0, p0

    iget-boolean v5, v0, Landroid/support/v7/widget/a;->n:Z

    if-eqz v5, :cond_1d

    .line 419
    move-object/from16 v0, p0

    iget v3, v0, Landroid/support/v7/widget/a;->w:I

    div-int v4, v9, v3

    .line 420
    move-object/from16 v0, p0

    iget v3, v0, Landroid/support/v7/widget/a;->w:I

    rem-int v3, v9, v3

    .line 421
    move-object/from16 v0, p0

    iget v5, v0, Landroid/support/v7/widget/a;->w:I

    div-int/2addr v3, v4

    add-int/2addr v3, v5

    move v5, v3

    move v3, v4

    .line 425
    :goto_3
    const/4 v4, 0x0

    move v7, v8

    move v11, v4

    move v6, v3

    :goto_4
    if-ge v11, v14, :cond_18

    .line 426
    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Landroid/support/v7/internal/view/menu/f;

    .line 428
    invoke-virtual {v4}, Landroid/support/v7/internal/view/menu/f;->h()Z

    move-result v3

    if-eqz v3, :cond_8

    .line 429
    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/widget/a;->y:Landroid/view/View;

    move-object/from16 v0, p0

    invoke-virtual {v0, v4, v3, v2}, Landroid/support/v7/widget/a;->a(Landroid/support/v7/internal/view/menu/f;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    .line 430
    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/widget/a;->y:Landroid/view/View;

    if-nez v3, :cond_5

    .line 431
    move-object/from16 v0, p0

    iput-object v8, v0, Landroid/support/v7/widget/a;->y:Landroid/view/View;

    .line 433
    :cond_5
    move-object/from16 v0, p0

    iget-boolean v3, v0, Landroid/support/v7/widget/a;->n:Z

    if-eqz v3, :cond_7

    .line 434
    const/4 v3, 0x0

    invoke-static {v8, v5, v6, v15, v3}, Landroid/support/v7/widget/ActionMenuView;->a(Landroid/view/View;IIII)I

    move-result v3

    sub-int v3, v6, v3

    .line 439
    :goto_5
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    .line 440
    sub-int v8, v9, v6

    .line 441
    if-nez v7, :cond_1c

    .line 444
    :goto_6
    invoke-virtual {v4}, Landroid/support/v7/internal/view/menu/f;->getGroupId()I

    move-result v7

    .line 445
    if-eqz v7, :cond_6

    .line 446
    const/4 v9, 0x1

    move-object/from16 v0, v16

    invoke-virtual {v0, v7, v9}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 448
    :cond_6
    const/4 v7, 0x1

    invoke-virtual {v4, v7}, Landroid/support/v7/internal/view/menu/f;->c(Z)V

    move v4, v8

    move v7, v10

    .line 425
    :goto_7
    add-int/lit8 v8, v11, 0x1

    move v11, v8

    move v9, v4

    move v10, v7

    move v7, v6

    move v6, v3

    goto :goto_4

    .line 437
    :cond_7
    invoke-virtual {v8, v15, v15}, Landroid/view/View;->measure(II)V

    move v3, v6

    goto :goto_5

    .line 449
    :cond_8
    invoke-virtual {v4}, Landroid/support/v7/internal/view/menu/f;->g()Z

    move-result v3

    if-eqz v3, :cond_17

    .line 452
    invoke-virtual {v4}, Landroid/support/v7/internal/view/menu/f;->getGroupId()I

    move-result v17

    .line 453
    invoke-virtual/range {v16 .. v17}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v18

    .line 454
    if-gtz v10, :cond_9

    if-eqz v18, :cond_f

    :cond_9
    if-lez v9, :cond_f

    move-object/from16 v0, p0

    iget-boolean v3, v0, Landroid/support/v7/widget/a;->n:Z

    if-eqz v3, :cond_a

    if-lez v6, :cond_f

    :cond_a
    const/4 v3, 0x1

    .line 457
    :goto_8
    if-eqz v3, :cond_1b

    .line 458
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/widget/a;->y:Landroid/view/View;

    move-object/from16 v0, p0

    invoke-virtual {v0, v4, v8, v2}, Landroid/support/v7/widget/a;->a(Landroid/support/v7/internal/view/menu/f;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    .line 459
    move-object/from16 v0, p0

    iget-object v12, v0, Landroid/support/v7/widget/a;->y:Landroid/view/View;

    if-nez v12, :cond_b

    .line 460
    move-object/from16 v0, p0

    iput-object v8, v0, Landroid/support/v7/widget/a;->y:Landroid/view/View;

    .line 462
    :cond_b
    move-object/from16 v0, p0

    iget-boolean v12, v0, Landroid/support/v7/widget/a;->n:Z

    if-eqz v12, :cond_10

    .line 463
    const/4 v12, 0x0

    invoke-static {v8, v5, v6, v15, v12}, Landroid/support/v7/widget/ActionMenuView;->a(Landroid/view/View;IIII)I

    move-result v12

    .line 465
    sub-int/2addr v6, v12

    .line 466
    if-nez v12, :cond_c

    .line 467
    const/4 v3, 0x0

    .line 472
    :cond_c
    :goto_9
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    .line 473
    sub-int/2addr v9, v8

    .line 474
    if-nez v7, :cond_d

    move v7, v8

    .line 478
    :cond_d
    move-object/from16 v0, p0

    iget-boolean v8, v0, Landroid/support/v7/widget/a;->n:Z

    if-eqz v8, :cond_12

    .line 479
    if-ltz v9, :cond_11

    const/4 v8, 0x1

    :goto_a
    and-int/2addr v3, v8

    move v12, v3

    move v8, v6

    .line 486
    :goto_b
    if-eqz v12, :cond_14

    if-eqz v17, :cond_14

    .line 487
    const/4 v3, 0x1

    move-object/from16 v0, v16

    move/from16 v1, v17

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseBooleanArray;->put(IZ)V

    move v3, v10

    .line 501
    :goto_c
    if-eqz v12, :cond_e

    add-int/lit8 v3, v3, -0x1

    .line 503
    :cond_e
    invoke-virtual {v4, v12}, Landroid/support/v7/internal/view/menu/f;->c(Z)V

    move v6, v7

    move v4, v9

    move v7, v3

    move v3, v8

    .line 504
    goto :goto_7

    .line 454
    :cond_f
    const/4 v3, 0x0

    goto :goto_8

    .line 470
    :cond_10
    invoke-virtual {v8, v15, v15}, Landroid/view/View;->measure(II)V

    goto :goto_9

    .line 479
    :cond_11
    const/4 v8, 0x0

    goto :goto_a

    .line 482
    :cond_12
    add-int v8, v9, v7

    if-lez v8, :cond_13

    const/4 v8, 0x1

    :goto_d
    and-int/2addr v3, v8

    move v12, v3

    move v8, v6

    goto :goto_b

    :cond_13
    const/4 v8, 0x0

    goto :goto_d

    .line 488
    :cond_14
    if-eqz v18, :cond_1a

    .line 490
    const/4 v3, 0x0

    move-object/from16 v0, v16

    move/from16 v1, v17

    invoke-virtual {v0, v1, v3}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 491
    const/4 v3, 0x0

    move v6, v10

    move v10, v3

    :goto_e
    if-ge v10, v11, :cond_19

    .line 492
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/support/v7/internal/view/menu/f;

    .line 493
    invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/f;->getGroupId()I

    move-result v18

    move/from16 v0, v18

    move/from16 v1, v17

    if-ne v0, v1, :cond_16

    .line 495
    invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/f;->f()Z

    move-result v18

    if-eqz v18, :cond_15

    add-int/lit8 v6, v6, 0x1

    .line 496
    :cond_15
    const/16 v18, 0x0

    move/from16 v0, v18

    invoke-virtual {v3, v0}, Landroid/support/v7/internal/view/menu/f;->c(Z)V

    .line 491
    :cond_16
    add-int/lit8 v3, v10, 0x1

    move v10, v3

    goto :goto_e

    .line 506
    :cond_17
    const/4 v3, 0x0

    invoke-virtual {v4, v3}, Landroid/support/v7/internal/view/menu/f;->c(Z)V

    move v3, v6

    move v4, v9

    move v6, v7

    move v7, v10

    goto/16 :goto_7

    .line 509
    :cond_18
    const/4 v2, 0x1

    return v2

    :cond_19
    move v3, v6

    goto :goto_c

    :cond_1a
    move v3, v10

    goto :goto_c

    :cond_1b
    move v12, v3

    move v8, v6

    goto :goto_b

    :cond_1c
    move v6, v7

    goto/16 :goto_6

    :cond_1d
    move v5, v3

    move v3, v4

    goto/16 :goto_3

    :cond_1e
    move v3, v7

    goto/16 :goto_2
.end method

.method public final a(Landroid/support/v7/internal/view/menu/f;)Z
    .locals 1

    .prologue
    .line 198
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/f;->f()Z

    move-result v0

    return v0
.end method

.method public final a(Landroid/support/v7/internal/view/menu/m;)Z
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 261
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/m;->hasVisibleItems()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v3

    .line 278
    :goto_0
    return v0

    :cond_0
    move-object v0, p1

    .line 5065
    :goto_1
    iget-object v1, v0, Landroid/support/v7/internal/view/menu/m;->i:Landroid/support/v7/internal/view/menu/e;

    .line 264
    iget-object v2, p0, Landroid/support/v7/widget/a;->c:Landroid/support/v7/internal/view/menu/e;

    if-eq v1, v2, :cond_1

    .line 6065
    iget-object v0, v0, Landroid/support/v7/internal/view/menu/m;->i:Landroid/support/v7/internal/view/menu/e;

    .line 265
    check-cast v0, Landroid/support/v7/internal/view/menu/m;

    goto :goto_1

    .line 267
    :cond_1
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/m;->getItem()Landroid/view/MenuItem;

    move-result-object v5

    .line 6282
    iget-object v0, p0, Landroid/support/v7/widget/a;->g:Landroid/support/v7/internal/view/menu/k;

    check-cast v0, Landroid/view/ViewGroup;

    .line 6283
    if-eqz v0, :cond_3

    .line 6285
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    move v4, v3

    .line 6286
    :goto_2
    if-ge v4, v6, :cond_3

    .line 6287
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 6288
    instance-of v1, v2, Landroid/support/v7/internal/view/menu/k$a;

    if-eqz v1, :cond_2

    move-object v1, v2

    check-cast v1, Landroid/support/v7/internal/view/menu/k$a;

    invoke-interface {v1}, Landroid/support/v7/internal/view/menu/k$a;->getItemData()Landroid/support/v7/internal/view/menu/f;

    move-result-object v1

    if-ne v1, v5, :cond_2

    move-object v0, v2

    .line 268
    :goto_3
    if-nez v0, :cond_5

    .line 269
    iget-object v0, p0, Landroid/support/v7/widget/a;->h:Landroid/view/View;

    if-nez v0, :cond_4

    move v0, v3

    goto :goto_0

    .line 6286
    :cond_2
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_2

    .line 6293
    :cond_3
    const/4 v0, 0x0

    goto :goto_3

    .line 270
    :cond_4
    iget-object v0, p0, Landroid/support/v7/widget/a;->h:Landroid/view/View;

    .line 273
    :cond_5
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/m;->getItem()Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    iput v1, p0, Landroid/support/v7/widget/a;->u:I

    .line 274
    new-instance v1, Landroid/support/v7/widget/a$a;

    iget-object v2, p0, Landroid/support/v7/widget/a;->b:Landroid/content/Context;

    invoke-direct {v1, p0, v2, p1}, Landroid/support/v7/widget/a$a;-><init>(Landroid/support/v7/widget/a;Landroid/content/Context;Landroid/support/v7/internal/view/menu/m;)V

    iput-object v1, p0, Landroid/support/v7/widget/a;->r:Landroid/support/v7/widget/a$a;

    .line 275
    iget-object v1, p0, Landroid/support/v7/widget/a;->r:Landroid/support/v7/widget/a$a;

    .line 7113
    iput-object v0, v1, Landroid/support/v7/internal/view/menu/i;->b:Landroid/view/View;

    .line 276
    iget-object v0, p0, Landroid/support/v7/widget/a;->r:Landroid/support/v7/widget/a$a;

    .line 7125
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/i;->b()Z

    move-result v0

    if-nez v0, :cond_6

    .line 7126
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "MenuPopupHelper cannot be used without an anchor"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 277
    :cond_6
    invoke-super {p0, p1}, Landroid/support/v7/internal/view/menu/b;->a(Landroid/support/v7/internal/view/menu/m;)Z

    .line 278
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final a(Landroid/view/ViewGroup;I)Z
    .locals 2

    .prologue
    .line 256
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/a;->h:Landroid/view/View;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 257
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/support/v7/internal/view/menu/b;->a(Landroid/view/ViewGroup;I)Z

    move-result v0

    goto :goto_0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 130
    iget-boolean v0, p0, Landroid/support/v7/widget/a;->m:Z

    if-nez v0, :cond_0

    .line 131
    iget-object v0, p0, Landroid/support/v7/widget/a;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Landroid/support/v7/b/a$f;->abc_max_action_buttons:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/a;->l:I

    .line 134
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/a;->c:Landroid/support/v7/internal/view/menu/e;

    if-eqz v0, :cond_1

    .line 135
    iget-object v0, p0, Landroid/support/v7/widget/a;->c:Landroid/support/v7/internal/view/menu/e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/e;->b(Z)V

    .line 137
    :cond_1
    return-void
.end method

.method public final c()Z
    .locals 4

    .prologue
    .line 301
    iget-boolean v0, p0, Landroid/support/v7/widget/a;->i:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/a;->g()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/a;->c:Landroid/support/v7/internal/view/menu/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/a;->g:Landroid/support/v7/internal/view/menu/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/a;->s:Landroid/support/v7/widget/a$c;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/a;->c:Landroid/support/v7/internal/view/menu/e;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/e;->g()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 303
    new-instance v0, Landroid/support/v7/widget/a$e;

    iget-object v1, p0, Landroid/support/v7/widget/a;->b:Landroid/content/Context;

    iget-object v2, p0, Landroid/support/v7/widget/a;->c:Landroid/support/v7/internal/view/menu/e;

    iget-object v3, p0, Landroid/support/v7/widget/a;->h:Landroid/view/View;

    invoke-direct {v0, p0, v1, v2, v3}, Landroid/support/v7/widget/a$e;-><init>(Landroid/support/v7/widget/a;Landroid/content/Context;Landroid/support/v7/internal/view/menu/e;Landroid/view/View;)V

    .line 304
    new-instance v1, Landroid/support/v7/widget/a$c;

    invoke-direct {v1, p0, v0}, Landroid/support/v7/widget/a$c;-><init>(Landroid/support/v7/widget/a;Landroid/support/v7/widget/a$e;)V

    iput-object v1, p0, Landroid/support/v7/widget/a;->s:Landroid/support/v7/widget/a$c;

    .line 306
    iget-object v0, p0, Landroid/support/v7/widget/a;->g:Landroid/support/v7/internal/view/menu/k;

    check-cast v0, Landroid/view/View;

    iget-object v1, p0, Landroid/support/v7/widget/a;->s:Landroid/support/v7/widget/a$c;

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 310
    const/4 v0, 0x0

    invoke-super {p0, v0}, Landroid/support/v7/internal/view/menu/b;->a(Landroid/support/v7/internal/view/menu/m;)Z

    .line 312
    const/4 v0, 0x1

    .line 314
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 323
    iget-object v0, p0, Landroid/support/v7/widget/a;->s:Landroid/support/v7/widget/a$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/a;->g:Landroid/support/v7/internal/view/menu/k;

    if-eqz v0, :cond_0

    .line 324
    iget-object v0, p0, Landroid/support/v7/widget/a;->g:Landroid/support/v7/internal/view/menu/k;

    check-cast v0, Landroid/view/View;

    iget-object v2, p0, Landroid/support/v7/widget/a;->s:Landroid/support/v7/widget/a$c;

    invoke-virtual {v0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 325
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/a;->s:Landroid/support/v7/widget/a$c;

    move v0, v1

    .line 334
    :goto_0
    return v0

    .line 329
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/a;->q:Landroid/support/v7/widget/a$e;

    .line 330
    if-eqz v0, :cond_1

    .line 331
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/i;->c()V

    move v0, v1

    .line 332
    goto :goto_0

    .line 334
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()Z
    .locals 2

    .prologue
    .line 342
    invoke-virtual {p0}, Landroid/support/v7/widget/a;->d()Z

    move-result v0

    .line 343
    invoke-virtual {p0}, Landroid/support/v7/widget/a;->f()Z

    move-result v1

    or-int/2addr v0, v1

    .line 344
    return v0
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 353
    iget-object v0, p0, Landroid/support/v7/widget/a;->r:Landroid/support/v7/widget/a$a;

    if-eqz v0, :cond_0

    .line 354
    iget-object v0, p0, Landroid/support/v7/widget/a;->r:Landroid/support/v7/widget/a$a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a$a;->c()V

    .line 355
    const/4 v0, 0x1

    .line 357
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 364
    iget-object v0, p0, Landroid/support/v7/widget/a;->q:Landroid/support/v7/widget/a$e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/a;->q:Landroid/support/v7/widget/a$e;

    invoke-virtual {v0}, Landroid/support/v7/widget/a$e;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
