.class public final Landroid/support/v4/f/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/f/j$d;,
        Landroid/support/v4/f/j$c;,
        Landroid/support/v4/f/j$b;,
        Landroid/support/v4/f/j$a;
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Landroid/support/v4/f/j$a;


# direct methods
.method private constructor <init>(ILandroid/content/Context;)V
    .locals 1

    .prologue
    .line 262
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 263
    const/16 v0, 0xe

    if-lt p1, v0, :cond_0

    .line 264
    new-instance v0, Landroid/support/v4/f/j$d;

    invoke-direct {v0}, Landroid/support/v4/f/j$d;-><init>()V

    iput-object v0, p0, Landroid/support/v4/f/j;->b:Landroid/support/v4/f/j$a;

    .line 270
    :goto_0
    iget-object v0, p0, Landroid/support/v4/f/j;->b:Landroid/support/v4/f/j$a;

    invoke-interface {v0, p2}, Landroid/support/v4/f/j$a;->a(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/f/j;->a:Ljava/lang/Object;

    .line 271
    return-void

    .line 265
    :cond_0
    const/16 v0, 0x9

    if-lt p1, v0, :cond_1

    .line 266
    new-instance v0, Landroid/support/v4/f/j$c;

    invoke-direct {v0}, Landroid/support/v4/f/j$c;-><init>()V

    iput-object v0, p0, Landroid/support/v4/f/j;->b:Landroid/support/v4/f/j$a;

    goto :goto_0

    .line 268
    :cond_1
    new-instance v0, Landroid/support/v4/f/j$b;

    invoke-direct {v0}, Landroid/support/v4/f/j$b;-><init>()V

    iput-object v0, p0, Landroid/support/v4/f/j;->b:Landroid/support/v4/f/j$a;

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 254
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-direct {p0, v0, p1}, Landroid/support/v4/f/j;-><init>(ILandroid/content/Context;)V

    .line 256
    return-void
.end method
