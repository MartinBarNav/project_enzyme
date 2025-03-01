.class public final Landroid/support/v7/internal/widget/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/res/TypedArray;

.field private final b:Landroid/content/Context;

.field private c:Landroid/support/v7/internal/widget/o;


# direct methods
.method private constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Landroid/support/v7/internal/widget/q;->b:Landroid/content/Context;

    .line 55
    iput-object p2, p0, Landroid/support/v7/internal/widget/q;->a:Landroid/content/res/TypedArray;

    .line 56
    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/util/AttributeSet;[II)Landroid/support/v7/internal/widget/q;
    .locals 2

    .prologue
    .line 49
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 50
    new-instance v1, Landroid/support/v7/internal/widget/q;

    invoke-direct {v1, p0, v0}, Landroid/support/v7/internal/widget/q;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    return-object v1
.end method


# virtual methods
.method public final a(II)I
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Landroid/support/v7/internal/widget/q;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    return v0
.end method

.method public final a(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 59
    iget-object v0, p0, Landroid/support/v7/internal/widget/q;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    iget-object v0, p0, Landroid/support/v7/internal/widget/q;->a:Landroid/content/res/TypedArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 61
    if-eqz v0, :cond_0

    .line 62
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/q;->a()Landroid/support/v7/internal/widget/o;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v7/internal/widget/o;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 65
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/q;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0
.end method

.method public final a()Landroid/support/v7/internal/widget/o;
    .locals 2

    .prologue
    .line 181
    iget-object v0, p0, Landroid/support/v7/internal/widget/q;->c:Landroid/support/v7/internal/widget/o;

    if-nez v0, :cond_0

    .line 182
    new-instance v0, Landroid/support/v7/internal/widget/o;

    iget-object v1, p0, Landroid/support/v7/internal/widget/q;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/support/v7/internal/widget/o;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/internal/widget/q;->c:Landroid/support/v7/internal/widget/o;

    .line 184
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/q;->c:Landroid/support/v7/internal/widget/o;

    return-object v0
.end method

.method public final a(IZ)Z
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Landroid/support/v7/internal/widget/q;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    return v0
.end method

.method public final b(II)I
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Landroid/support/v7/internal/widget/q;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v0

    return v0
.end method

.method public final b(I)Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Landroid/support/v7/internal/widget/q;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final c(II)I
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Landroid/support/v7/internal/widget/q;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    return v0
.end method

.method public final c(I)Z
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Landroid/support/v7/internal/widget/q;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    return v0
.end method

.method public final d(II)I
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Landroid/support/v7/internal/widget/q;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v0

    return v0
.end method

.method public final e(II)I
    .locals 1

    .prologue
    .line 145
    iget-object v0, p0, Landroid/support/v7/internal/widget/q;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    return v0
.end method
