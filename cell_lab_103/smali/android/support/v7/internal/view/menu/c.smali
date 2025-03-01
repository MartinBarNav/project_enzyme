.class abstract Landroid/support/v7/internal/view/menu/c;
.super Landroid/support/v7/internal/view/menu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/support/v7/internal/view/menu/d",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final a:Landroid/content/Context;

.field b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/support/v4/b/a/b;",
            "Landroid/view/MenuItem;",
            ">;"
        }
    .end annotation
.end field

.field c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/support/v4/b/a/c;",
            "Landroid/view/SubMenu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "TT;)V"
        }
    .end annotation

    .prologue
    .line 37
    invoke-direct {p0, p2}, Landroid/support/v7/internal/view/menu/d;-><init>(Ljava/lang/Object;)V

    .line 38
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/c;->a:Landroid/content/Context;

    .line 39
    return-void
.end method


# virtual methods
.method final a(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 4

    .prologue
    .line 42
    instance-of v0, p1, Landroid/support/v4/b/a/b;

    if-eqz v0, :cond_4

    move-object v0, p1

    .line 43
    check-cast v0, Landroid/support/v4/b/a/b;

    .line 46
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/c;->b:Ljava/util/Map;

    if-nez v1, :cond_0

    .line 47
    new-instance v1, Landroid/support/v4/e/a;

    invoke-direct {v1}, Landroid/support/v4/e/a;-><init>()V

    iput-object v1, p0, Landroid/support/v7/internal/view/menu/c;->b:Ljava/util/Map;

    .line 51
    :cond_0
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/c;->b:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/MenuItem;

    .line 53
    if-nez v1, :cond_1

    .line 55
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/c;->a:Landroid/content/Context;

    .line 1043
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x10

    if-lt v1, v3, :cond_2

    .line 1044
    new-instance v1, Landroid/support/v7/internal/view/menu/h;

    invoke-direct {v1, v2, v0}, Landroid/support/v7/internal/view/menu/h;-><init>(Landroid/content/Context;Landroid/support/v4/b/a/b;)V

    .line 56
    :goto_0
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/c;->b:Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    :cond_1
    :goto_1
    return-object v1

    .line 1045
    :cond_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    if-lt v1, v3, :cond_3

    .line 1046
    new-instance v1, Landroid/support/v7/internal/view/menu/g;

    invoke-direct {v1, v2, v0}, Landroid/support/v7/internal/view/menu/g;-><init>(Landroid/content/Context;Landroid/support/v4/b/a/b;)V

    goto :goto_0

    .line 1048
    :cond_3
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :cond_4
    move-object v1, p1

    .line 61
    goto :goto_1
.end method

.method final a(Landroid/view/SubMenu;)Landroid/view/SubMenu;
    .locals 3

    .prologue
    .line 65
    instance-of v0, p1, Landroid/support/v4/b/a/c;

    if-eqz v0, :cond_3

    .line 66
    check-cast p1, Landroid/support/v4/b/a/c;

    .line 69
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/c;->c:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 70
    new-instance v0, Landroid/support/v4/e/a;

    invoke-direct {v0}, Landroid/support/v4/e/a;-><init>()V

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/c;->c:Ljava/util/Map;

    .line 73
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/c;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/SubMenu;

    .line 75
    if-nez v0, :cond_1

    .line 76
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/c;->a:Landroid/content/Context;

    .line 1052
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xe

    if-lt v0, v2, :cond_2

    .line 1053
    new-instance v0, Landroid/support/v7/internal/view/menu/n;

    invoke-direct {v0, v1, p1}, Landroid/support/v7/internal/view/menu/n;-><init>(Landroid/content/Context;Landroid/support/v4/b/a/c;)V

    .line 77
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/c;->c:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    :cond_1
    :goto_0
    return-object v0

    .line 1055
    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :cond_3
    move-object v0, p1

    .line 81
    goto :goto_0
.end method
