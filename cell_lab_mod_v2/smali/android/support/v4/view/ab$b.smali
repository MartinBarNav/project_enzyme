.class Landroid/support/v4/view/ab$b;
.super Landroid/support/v4/view/ab$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/ab;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0}, Landroid/support/v4/view/ab$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/ViewConfiguration;)I
    .locals 1

    .prologue
    .line 56
    invoke-static {p1}, Landroid/support/v4/view/ac;->a(Landroid/view/ViewConfiguration;)I

    move-result v0

    return v0
.end method
