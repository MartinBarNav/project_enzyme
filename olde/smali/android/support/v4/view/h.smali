.class final Landroid/support/v4/view/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(I)I
    .locals 1

    .prologue
    .line 26
    invoke-static {p0}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v0

    return v0
.end method

.method public static b(I)Z
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x1

    invoke-static {p0, v0}, Landroid/view/KeyEvent;->metaStateHasModifiers(II)Z

    move-result v0

    return v0
.end method

.method public static c(I)Z
    .locals 1

    .prologue
    .line 34
    invoke-static {p0}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    move-result v0

    return v0
.end method
