.class Landroid/support/v4/f/j$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/f/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/f/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 234
    invoke-static {p1}, Landroid/support/v4/f/k;->a(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final a(Landroid/content/Context;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 153
    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroid/support/v4/f/k;->a(Landroid/content/Context;Landroid/view/animation/Interpolator;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/Object;I)V
    .locals 0

    .prologue
    .line 195
    invoke-static {p1, p2}, Landroid/support/v4/f/k;->a(Ljava/lang/Object;I)V

    .line 197
    return-void
.end method
