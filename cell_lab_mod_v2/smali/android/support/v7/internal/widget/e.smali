.class public final Landroid/support/v7/internal/widget/e;
.super Landroid/widget/PopupWindow;
.source "SourceFile"


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    .line 37
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    sget-object v0, Landroid/support/v7/b/a$i;->PopupWindow:[I

    invoke-static {p1, p2, v0, p3}, Landroid/support/v7/internal/widget/q;->a(Landroid/content/Context;Landroid/util/AttributeSet;[II)Landroid/support/v7/internal/widget/q;

    move-result-object v0

    .line 41
    sget v1, Landroid/support/v7/b/a$i;->PopupWindow_overlapAnchor:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/widget/q;->a(IZ)Z

    move-result v1

    iput-boolean v1, p0, Landroid/support/v7/internal/widget/e;->a:Z

    .line 43
    sget v1, Landroid/support/v7/b/a$i;->PopupWindow_android_popupBackground:I

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/q;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/e;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1173
    iget-object v0, v0, Landroid/support/v7/internal/widget/q;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 45
    return-void
.end method


# virtual methods
.method public final showAsDropDown(Landroid/view/View;II)V
    .locals 2

    .prologue
    .line 49
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/internal/widget/e;->a:Z

    if-eqz v0, :cond_0

    .line 51
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    sub-int/2addr p3, v0

    .line 53
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 54
    return-void
.end method

.method public final showAsDropDown(Landroid/view/View;III)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    .prologue
    .line 59
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/internal/widget/e;->a:Z

    if-eqz v0, :cond_0

    .line 61
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    sub-int/2addr p3, v0

    .line 63
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 64
    return-void
.end method

.method public final update(Landroid/view/View;IIII)V
    .locals 6

    .prologue
    .line 68
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/internal/widget/e;->a:Z

    if-eqz v0, :cond_0

    .line 70
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    sub-int/2addr p3, v0

    move v3, p3

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v4, p4

    move v5, p5

    .line 72
    invoke-super/range {v0 .. v5}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 73
    return-void

    :cond_0
    move v3, p3

    goto :goto_0
.end method
