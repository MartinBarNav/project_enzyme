.class public Landroid/support/v7/internal/view/menu/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v7/internal/view/menu/j;
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/view/menu/i$a;
    }
.end annotation


# static fields
.field static final a:I


# instance fields
.field public b:Landroid/view/View;

.field public c:Landroid/support/v7/widget/b;

.field protected d:Landroid/support/v7/internal/view/menu/j$a;

.field protected e:Z

.field protected f:I

.field private final g:Landroid/content/Context;

.field private final h:Landroid/view/LayoutInflater;

.field private final i:Landroid/support/v7/internal/view/menu/e;

.field private final j:Landroid/support/v7/internal/view/menu/i$a;

.field private final k:Z

.field private final l:I

.field private final m:I

.field private final n:I

.field private o:Landroid/view/ViewTreeObserver;

.field private p:Landroid/view/ViewGroup;

.field private q:Z

.field private r:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 51
    sget v0, Landroid/support/v7/b/a$g;->abc_popup_menu_item_layout:I

    sput v0, Landroid/support/v7/internal/view/menu/i;->a:I

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/e;Landroid/view/View;)V
    .locals 6

    .prologue
    .line 84
    const/4 v4, 0x0

    sget v5, Landroid/support/v7/b/a$a;->popupMenuStyle:I

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Landroid/support/v7/internal/view/menu/i;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/e;Landroid/view/View;ZI)V

    .line 85
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/e;Landroid/view/View;ZI)V
    .locals 7

    .prologue
    .line 89
    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Landroid/support/v7/internal/view/menu/i;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/e;Landroid/view/View;ZIB)V

    .line 90
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/e;Landroid/view/View;ZIB)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput v2, p0, Landroid/support/v7/internal/view/menu/i;->f:I

    .line 94
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/i;->g:Landroid/content/Context;

    .line 95
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/i;->h:Landroid/view/LayoutInflater;

    .line 96
    iput-object p2, p0, Landroid/support/v7/internal/view/menu/i;->i:Landroid/support/v7/internal/view/menu/e;

    .line 97
    new-instance v0, Landroid/support/v7/internal/view/menu/i$a;

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/i;->i:Landroid/support/v7/internal/view/menu/e;

    invoke-direct {v0, p0, v1}, Landroid/support/v7/internal/view/menu/i$a;-><init>(Landroid/support/v7/internal/view/menu/i;Landroid/support/v7/internal/view/menu/e;)V

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/i;->j:Landroid/support/v7/internal/view/menu/i$a;

    .line 98
    iput-boolean p4, p0, Landroid/support/v7/internal/view/menu/i;->k:Z

    .line 99
    iput p5, p0, Landroid/support/v7/internal/view/menu/i;->m:I

    .line 100
    iput v2, p0, Landroid/support/v7/internal/view/menu/i;->n:I

    .line 102
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 103
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v1, v1, 0x2

    sget v2, Landroid/support/v7/b/a$c;->abc_config_prefDialogWidth:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Landroid/support/v7/internal/view/menu/i;->l:I

    .line 106
    iput-object p3, p0, Landroid/support/v7/internal/view/menu/i;->b:Landroid/view/View;

    .line 109
    invoke-virtual {p2, p0, p1}, Landroid/support/v7/internal/view/menu/e;->a(Landroid/support/v7/internal/view/menu/j;Landroid/content/Context;)V

    .line 110
    return-void
.end method

.method static synthetic a(Landroid/support/v7/internal/view/menu/i;)Z
    .locals 1

    .prologue
    .line 45
    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/i;->k:Z

    return v0
.end method

.method static synthetic b(Landroid/support/v7/internal/view/menu/i;)Landroid/view/LayoutInflater;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->h:Landroid/view/LayoutInflater;

    return-object v0
.end method

.method static synthetic c(Landroid/support/v7/internal/view/menu/i;)Landroid/support/v7/internal/view/menu/e;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->i:Landroid/support/v7/internal/view/menu/e;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/support/v7/internal/view/menu/e;)V
    .locals 0

    .prologue
    .line 249
    return-void
.end method

.method public final a(Landroid/support/v7/internal/view/menu/e;Z)V
    .locals 1

    .prologue
    .line 300
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->i:Landroid/support/v7/internal/view/menu/e;

    if-eq p1, v0, :cond_1

    .line 306
    :cond_0
    :goto_0
    return-void

    .line 302
    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/i;->c()V

    .line 303
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->d:Landroid/support/v7/internal/view/menu/j$a;

    if-eqz v0, :cond_0

    .line 304
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->d:Landroid/support/v7/internal/view/menu/j$a;

    invoke-interface {v0, p1, p2}, Landroid/support/v7/internal/view/menu/j$a;->a(Landroid/support/v7/internal/view/menu/e;Z)V

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 258
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/i;->q:Z

    .line 260
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->j:Landroid/support/v7/internal/view/menu/i$a;

    if-eqz v0, :cond_0

    .line 261
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->j:Landroid/support/v7/internal/view/menu/i$a;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/i$a;->notifyDataSetChanged()V

    .line 263
    :cond_0
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 310
    const/4 v0, 0x0

    return v0
.end method

.method public final a(Landroid/support/v7/internal/view/menu/m;)Z
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 272
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/m;->hasVisibleItems()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 273
    new-instance v3, Landroid/support/v7/internal/view/menu/i;

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->g:Landroid/content/Context;

    iget-object v4, p0, Landroid/support/v7/internal/view/menu/i;->b:Landroid/view/View;

    invoke-direct {v3, v0, p1, v4}, Landroid/support/v7/internal/view/menu/i;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/e;Landroid/view/View;)V

    .line 274
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->d:Landroid/support/v7/internal/view/menu/j$a;

    .line 7267
    iput-object v0, v3, Landroid/support/v7/internal/view/menu/i;->d:Landroid/support/v7/internal/view/menu/j$a;

    .line 277
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/m;->size()I

    move-result v4

    move v0, v2

    .line 278
    :goto_0
    if-ge v0, v4, :cond_3

    .line 279
    invoke-virtual {p1, v0}, Landroid/support/v7/internal/view/menu/m;->getItem(I)Landroid/view/MenuItem;

    move-result-object v5

    .line 280
    invoke-interface {v5}, Landroid/view/MenuItem;->isVisible()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_1

    move v0, v1

    .line 8117
    :goto_1
    iput-boolean v0, v3, Landroid/support/v7/internal/view/menu/i;->e:Z

    .line 287
    invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/i;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 288
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->d:Landroid/support/v7/internal/view/menu/j$a;

    if-eqz v0, :cond_0

    .line 289
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->d:Landroid/support/v7/internal/view/menu/j$a;

    invoke-interface {v0, p1}, Landroid/support/v7/internal/view/menu/j$a;->a(Landroid/support/v7/internal/view/menu/e;)Z

    .line 294
    :cond_0
    :goto_2
    return v1

    .line 278
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    move v1, v2

    .line 294
    goto :goto_2

    :cond_3
    move v0, v2

    goto :goto_1
.end method

.method public final b()Z
    .locals 12

    .prologue
    const/4 v4, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 135
    new-instance v0, Landroid/support/v7/widget/b;

    iget-object v3, p0, Landroid/support/v7/internal/view/menu/i;->g:Landroid/content/Context;

    iget v5, p0, Landroid/support/v7/internal/view/menu/i;->m:I

    iget v6, p0, Landroid/support/v7/internal/view/menu/i;->n:I

    invoke-direct {v0, v3, v4, v5, v6}, Landroid/support/v7/widget/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/i;->c:Landroid/support/v7/widget/b;

    .line 136
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->c:Landroid/support/v7/widget/b;

    .line 1684
    iget-object v0, v0, Landroid/support/v7/widget/b;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 137
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->c:Landroid/support/v7/widget/b;

    .line 2541
    iput-object p0, v0, Landroid/support/v7/widget/b;->i:Landroid/widget/AdapterView$OnItemClickListener;

    .line 138
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->c:Landroid/support/v7/widget/b;

    iget-object v3, p0, Landroid/support/v7/internal/view/menu/i;->j:Landroid/support/v7/internal/view/menu/i$a;

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/b;->a(Landroid/widget/ListAdapter;)V

    .line 139
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->d()V

    .line 141
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/i;->b:Landroid/view/View;

    .line 142
    if-eqz v3, :cond_5

    .line 143
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->o:Landroid/view/ViewTreeObserver;

    if-nez v0, :cond_4

    move v0, v1

    .line 144
    :goto_0
    invoke-virtual {v3}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v5

    iput-object v5, p0, Landroid/support/v7/internal/view/menu/i;->o:Landroid/view/ViewTreeObserver;

    .line 145
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->o:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 146
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->c:Landroid/support/v7/widget/b;

    .line 3435
    iput-object v3, v0, Landroid/support/v7/widget/b;->h:Landroid/view/View;

    .line 147
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->c:Landroid/support/v7/widget/b;

    iget v3, p0, Landroid/support/v7/internal/view/menu/i;->f:I

    .line 3481
    iput v3, v0, Landroid/support/v7/widget/b;->e:I

    .line 152
    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/i;->q:Z

    if-nez v0, :cond_3

    .line 4204
    iget-object v7, p0, Landroid/support/v7/internal/view/menu/i;->j:Landroid/support/v7/internal/view/menu/i$a;

    .line 4205
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .line 4206
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    .line 4207
    invoke-interface {v7}, Landroid/widget/ListAdapter;->getCount()I

    move-result v10

    move v6, v2

    move v3, v2

    move-object v5, v4

    .line 4208
    :goto_1
    if-ge v6, v10, :cond_2

    .line 4209
    invoke-interface {v7, v6}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v0

    .line 4210
    if-eq v0, v3, :cond_8

    move v3, v0

    move-object v0, v4

    .line 4215
    :goto_2
    iget-object v5, p0, Landroid/support/v7/internal/view/menu/i;->p:Landroid/view/ViewGroup;

    if-nez v5, :cond_1

    .line 4216
    new-instance v5, Landroid/widget/FrameLayout;

    iget-object v11, p0, Landroid/support/v7/internal/view/menu/i;->g:Landroid/content/Context;

    invoke-direct {v5, v11}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v5, p0, Landroid/support/v7/internal/view/menu/i;->p:Landroid/view/ViewGroup;

    .line 4219
    :cond_1
    iget-object v5, p0, Landroid/support/v7/internal/view/menu/i;->p:Landroid/view/ViewGroup;

    invoke-interface {v7, v6, v0, v5}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 4220
    invoke-virtual {v5, v8, v9}, Landroid/view/View;->measure(II)V

    .line 4222
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    .line 4223
    iget v11, p0, Landroid/support/v7/internal/view/menu/i;->l:I

    if-lt v0, v11, :cond_6

    .line 4224
    iget v2, p0, Landroid/support/v7/internal/view/menu/i;->l:I

    .line 153
    :cond_2
    iput v2, p0, Landroid/support/v7/internal/view/menu/i;->r:I

    .line 154
    iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/i;->q:Z

    .line 157
    :cond_3
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->c:Landroid/support/v7/widget/b;

    iget v2, p0, Landroid/support/v7/internal/view/menu/i;->r:I

    .line 4508
    iget-object v3, v0, Landroid/support/v7/widget/b;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 4509
    if-eqz v3, :cond_7

    .line 4510
    iget-object v4, v0, Landroid/support/v7/widget/b;->j:Landroid/graphics/Rect;

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 4511
    iget-object v3, v0, Landroid/support/v7/widget/b;->j:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    iget-object v4, v0, Landroid/support/v7/widget/b;->j:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v4

    add-int/2addr v2, v3

    iput v2, v0, Landroid/support/v7/widget/b;->d:I

    .line 158
    :goto_3
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->c:Landroid/support/v7/widget/b;

    .line 5710
    iget-object v0, v0, Landroid/support/v7/widget/b;->b:Landroid/widget/PopupWindow;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 159
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->c()V

    .line 160
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->c:Landroid/support/v7/widget/b;

    .line 5845
    iget-object v0, v0, Landroid/support/v7/widget/b;->c:Landroid/support/v7/widget/b$a;

    .line 160
    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 161
    :goto_4
    return v1

    :cond_4
    move v0, v2

    .line 143
    goto/16 :goto_0

    :cond_5
    move v1, v2

    .line 149
    goto :goto_4

    .line 4225
    :cond_6
    if-le v0, v2, :cond_9

    .line 4208
    :goto_5
    add-int/lit8 v2, v6, 0x1

    move v6, v2

    move v2, v0

    goto :goto_1

    .line 5498
    :cond_7
    iput v2, v0, Landroid/support/v7/widget/b;->d:I

    goto :goto_3

    :cond_8
    move-object v0, v5

    goto :goto_2

    :cond_9
    move v0, v2

    goto :goto_5
.end method

.method public final b(Landroid/support/v7/internal/view/menu/f;)Z
    .locals 1

    .prologue
    .line 314
    const/4 v0, 0x0

    return v0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 165
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/i;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->a()V

    .line 168
    :cond_0
    return-void
.end method

.method public final c(Landroid/support/v7/internal/view/menu/f;)Z
    .locals 1

    .prologue
    .line 318
    const/4 v0, 0x0

    return v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 181
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->c:Landroid/support/v7/widget/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->c:Landroid/support/v7/widget/b;

    .line 6760
    iget-object v0, v0, Landroid/support/v7/widget/b;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    .line 181
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onDismiss()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 171
    iput-object v1, p0, Landroid/support/v7/internal/view/menu/i;->c:Landroid/support/v7/widget/b;

    .line 172
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->i:Landroid/support/v7/internal/view/menu/e;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/e;->close()V

    .line 173
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->o:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_1

    .line 174
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->o:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/i;->o:Landroid/view/ViewTreeObserver;

    .line 175
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->o:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 176
    iput-object v1, p0, Landroid/support/v7/internal/view/menu/i;->o:Landroid/view/ViewTreeObserver;

    .line 178
    :cond_1
    return-void
.end method

.method public onGlobalLayout()V
    .locals 1

    .prologue
    .line 235
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/i;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 236
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->b:Landroid/view/View;

    .line 237
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-nez v0, :cond_2

    .line 238
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/i;->c()V

    .line 244
    :cond_1
    :goto_0
    return-void

    .line 239
    :cond_2
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/i;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 241
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->c:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->c()V

    goto :goto_0
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 186
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/i;->j:Landroid/support/v7/internal/view/menu/i$a;

    .line 187
    invoke-static {v0}, Landroid/support/v7/internal/view/menu/i$a;->a(Landroid/support/v7/internal/view/menu/i$a;)Landroid/support/v7/internal/view/menu/e;

    move-result-object v1

    invoke-virtual {v0, p3}, Landroid/support/v7/internal/view/menu/i$a;->a(I)Landroid/support/v7/internal/view/menu/f;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/support/v7/internal/view/menu/e;->a(Landroid/view/MenuItem;I)Z

    .line 188
    return-void
.end method

.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 191
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-ne v1, v0, :cond_0

    const/16 v1, 0x52

    if-ne p2, v1, :cond_0

    .line 192
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/i;->c()V

    .line 195
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
