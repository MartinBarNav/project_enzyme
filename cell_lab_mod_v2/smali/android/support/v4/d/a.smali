.class public final Landroid/support/v4/d/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/d/a$c;,
        Landroid/support/v4/d/a$b;,
        Landroid/support/v4/d/a$a;
    }
.end annotation


# static fields
.field private static final a:Landroid/support/v4/d/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 55
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 56
    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 57
    new-instance v0, Landroid/support/v4/d/a$c;

    invoke-direct {v0}, Landroid/support/v4/d/a$c;-><init>()V

    sput-object v0, Landroid/support/v4/d/a;->a:Landroid/support/v4/d/a$a;

    .line 61
    :goto_0
    return-void

    .line 59
    :cond_0
    new-instance v0, Landroid/support/v4/d/a$b;

    invoke-direct {v0}, Landroid/support/v4/d/a$b;-><init>()V

    sput-object v0, Landroid/support/v4/d/a;->a:Landroid/support/v4/d/a$a;

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    sget-object v0, Landroid/support/v4/d/a;->a:Landroid/support/v4/d/a$a;

    invoke-interface {v0, p0}, Landroid/support/v4/d/a$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 96
    sget-object v0, Landroid/support/v4/d/a;->a:Landroid/support/v4/d/a$a;

    invoke-interface {v0, p0}, Landroid/support/v4/d/a$a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
