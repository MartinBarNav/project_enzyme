.class final Landroid/support/v7/internal/widget/n;
.super Landroid/support/v7/internal/widget/i;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/res/ColorStateList;

.field private final b:Landroid/graphics/PorterDuff$Mode;

.field private c:I


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    .locals 1

    .prologue
    .line 36
    sget-object v0, Landroid/support/v7/internal/widget/o;->a:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/widget/n;-><init>(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/i;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 42
    iput-object p2, p0, Landroid/support/v7/internal/widget/n;->a:Landroid/content/res/ColorStateList;

    .line 43
    iput-object p3, p0, Landroid/support/v7/internal/widget/n;->b:Landroid/graphics/PorterDuff$Mode;

    .line 44
    return-void
.end method


# virtual methods
.method public final isStateful()Z
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Landroid/support/v7/internal/widget/n;->a:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/n;->a:Landroid/content/res/ColorStateList;

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/support/v7/internal/widget/i;->isStateful()Z

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

.method public final setState([I)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 53
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/i;->setState([I)Z

    move-result v3

    .line 1059
    iget-object v2, p0, Landroid/support/v7/internal/widget/n;->a:Landroid/content/res/ColorStateList;

    if-eqz v2, :cond_3

    .line 1060
    iget-object v2, p0, Landroid/support/v7/internal/widget/n;->a:Landroid/content/res/ColorStateList;

    iget v4, p0, Landroid/support/v7/internal/widget/n;->c:I

    invoke-virtual {v2, p1, v4}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v2

    .line 1061
    iget v4, p0, Landroid/support/v7/internal/widget/n;->c:I

    if-eq v2, v4, :cond_3

    .line 1062
    if-eqz v2, :cond_2

    .line 1063
    iget-object v4, p0, Landroid/support/v7/internal/widget/n;->b:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0, v2, v4}, Landroid/support/v7/internal/widget/n;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 1067
    :goto_0
    iput v2, p0, Landroid/support/v7/internal/widget/n;->c:I

    move v2, v1

    .line 54
    :goto_1
    if-nez v2, :cond_0

    if-eqz v3, :cond_1

    :cond_0
    move v0, v1

    .line 55
    :cond_1
    return v0

    .line 1065
    :cond_2
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/n;->clearColorFilter()V

    goto :goto_0

    :cond_3
    move v2, v0

    .line 1071
    goto :goto_1
.end method
