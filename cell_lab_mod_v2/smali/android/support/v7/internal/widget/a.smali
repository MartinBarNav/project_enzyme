.class abstract Landroid/support/v7/internal/widget/a;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/widget/a$a;
    }
.end annotation


# static fields
.field private static final j:Landroid/view/animation/Interpolator;


# instance fields
.field protected final a:Landroid/support/v7/internal/widget/a$a;

.field protected final b:Landroid/content/Context;

.field protected c:Landroid/support/v7/widget/ActionMenuView;

.field protected d:Landroid/support/v7/widget/a;

.field protected e:Landroid/view/ViewGroup;

.field protected f:Z

.field protected g:Z

.field protected h:I

.field protected i:Landroid/support/v4/view/ae;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Landroid/support/v7/internal/widget/a;->j:Landroid/view/animation/Interpolator;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 57
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/widget/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 58
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 61
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/widget/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 62
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .prologue
    .line 65
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 42
    new-instance v0, Landroid/support/v7/internal/widget/a$a;

    invoke-direct {v0, p0}, Landroid/support/v7/internal/widget/a$a;-><init>(Landroid/support/v7/internal/widget/a;)V

    iput-object v0, p0, Landroid/support/v7/internal/widget/a;->a:Landroid/support/v7/internal/widget/a$a;

    .line 67
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 68
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v2, Landroid/support/v7/b/a$a;->actionBarPopupTheme:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v1, :cond_0

    .line 70
    new-instance v1, Landroid/view/ContextThemeWrapper;

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {v1, p1, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Landroid/support/v7/internal/widget/a;->b:Landroid/content/Context;

    .line 74
    :goto_0
    return-void

    .line 72
    :cond_0
    iput-object p1, p0, Landroid/support/v7/internal/widget/a;->b:Landroid/content/Context;

    goto :goto_0
.end method

.method protected static a(IIZ)I
    .locals 1

    .prologue
    .line 238
    if-eqz p2, :cond_0

    sub-int v0, p0, p1

    :goto_0
    return v0

    :cond_0
    add-int v0, p0, p1

    goto :goto_0
.end method

.method protected static a(Landroid/view/View;II)I
    .locals 2

    .prologue
    .line 228
    const/high16 v0, -0x80000000

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p0, v0, p2}, Landroid/view/View;->measure(II)V

    .line 231
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    sub-int v0, p1, v0

    .line 232
    add-int/lit8 v0, v0, 0x0

    .line 234
    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method protected static a(Landroid/view/View;IIIZ)I
    .locals 4

    .prologue
    .line 242
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    .line 243
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    .line 244
    sub-int v2, p3, v1

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v2, p2

    .line 246
    if-eqz p4, :cond_1

    .line 247
    sub-int v3, p1, v0

    add-int/2addr v1, v2

    invoke-virtual {p0, v3, v2, p1, v1}, Landroid/view/View;->layout(IIII)V

    .line 252
    :goto_0
    if-eqz p4, :cond_0

    neg-int v0, v0

    :cond_0
    return v0

    .line 249
    :cond_1
    add-int v3, p1, v0

    add-int/2addr v1, v2

    invoke-virtual {p0, p1, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    goto :goto_0
.end method


# virtual methods
.method public getAnimatedVisibility()I
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Landroid/support/v7/internal/widget/a;->i:Landroid/support/v4/view/ae;

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Landroid/support/v7/internal/widget/a;->a:Landroid/support/v7/internal/widget/a$a;

    iget v0, v0, Landroid/support/v7/internal/widget/a$a;->a:I

    .line 130
    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/a;->getVisibility()I

    move-result v0

    goto :goto_0
.end method

.method public getContentHeight()I
    .locals 1

    .prologue
    .line 116
    iget v0, p0, Landroid/support/v7/internal/widget/a;->h:I

    return v0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 78
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    .line 79
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 84
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/a;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, Landroid/support/v7/b/a$i;->ActionBar:[I

    sget v3, Landroid/support/v7/b/a$a;->actionBarStyle:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 86
    sget v1, Landroid/support/v7/b/a$i;->ActionBar_height:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/a;->setContentHeight(I)V

    .line 87
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 89
    iget-object v0, p0, Landroid/support/v7/internal/widget/a;->d:Landroid/support/v7/widget/a;

    if-eqz v0, :cond_1

    .line 90
    iget-object v0, p0, Landroid/support/v7/internal/widget/a;->d:Landroid/support/v7/widget/a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a;->b()V

    .line 92
    :cond_1
    return-void
.end method

.method public setContentHeight(I)V
    .locals 0

    .prologue
    .line 111
    iput p1, p0, Landroid/support/v7/internal/widget/a;->h:I

    .line 112
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/a;->requestLayout()V

    .line 113
    return-void
.end method

.method public setSplitToolbar(Z)V
    .locals 0

    .prologue
    .line 99
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/a;->f:Z

    .line 100
    return-void
.end method

.method public setSplitView(Landroid/view/ViewGroup;)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Landroid/support/v7/internal/widget/a;->e:Landroid/view/ViewGroup;

    .line 121
    return-void
.end method

.method public setSplitWhenNarrow(Z)V
    .locals 0

    .prologue
    .line 107
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/a;->g:Z

    .line 108
    return-void
.end method
