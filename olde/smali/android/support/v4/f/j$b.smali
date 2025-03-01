.class final Landroid/support/v4/f/j$b;
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
    name = "b"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 146
    check-cast p1, Landroid/widget/Scroller;

    invoke-virtual {p1}, Landroid/widget/Scroller;->getFinalY()I

    move-result v0

    return v0
.end method

.method public final a(Landroid/content/Context;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 64
    new-instance v0, Landroid/widget/Scroller;

    invoke-direct {v0, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final a(Ljava/lang/Object;I)V
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 108
    move-object v0, p1

    check-cast v0, Landroid/widget/Scroller;

    const/high16 v7, -0x80000000

    const v8, 0x7fffffff

    move v2, v1

    move v3, v1

    move v4, p2

    move v5, v1

    move v6, v1

    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 109
    return-void
.end method
