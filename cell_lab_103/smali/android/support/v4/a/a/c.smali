.class final Landroid/support/v4/a/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/graphics/drawable/Drawable;Z)V
    .locals 0

    .prologue
    .line 26
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    .line 27
    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .prologue
    .line 30
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isAutoMirrored()Z

    move-result v0

    return v0
.end method
