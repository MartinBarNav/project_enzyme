.class final Landroid/support/v7/widget/a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v7/internal/view/menu/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/widget/a;


# direct methods
.method private constructor <init>(Landroid/support/v7/widget/a;)V
    .locals 0

    .prologue
    .line 719
    iput-object p1, p0, Landroid/support/v7/widget/a$f;->a:Landroid/support/v7/widget/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/widget/a;B)V
    .locals 0

    .prologue
    .line 719
    invoke-direct {p0, p1}, Landroid/support/v7/widget/a$f;-><init>(Landroid/support/v7/widget/a;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/support/v7/internal/view/menu/e;Z)V
    .locals 2

    .prologue
    .line 732
    instance-of v0, p1, Landroid/support/v7/internal/view/menu/m;

    if-eqz v0, :cond_0

    move-object v0, p1

    .line 733
    check-cast v0, Landroid/support/v7/internal/view/menu/m;

    .line 2079
    iget-object v0, v0, Landroid/support/v7/internal/view/menu/m;->i:Landroid/support/v7/internal/view/menu/e;

    .line 733
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/e;->a(Z)V

    .line 735
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/a$f;->a:Landroid/support/v7/widget/a;

    .line 2152
    iget-object v0, v0, Landroid/support/v7/internal/view/menu/b;->f:Landroid/support/v7/internal/view/menu/j$a;

    .line 736
    if-eqz v0, :cond_1

    .line 737
    invoke-interface {v0, p1, p2}, Landroid/support/v7/internal/view/menu/j$a;->a(Landroid/support/v7/internal/view/menu/e;Z)V

    .line 739
    :cond_1
    return-void
.end method

.method public final a(Landroid/support/v7/internal/view/menu/e;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 723
    if-nez p1, :cond_0

    move v0, v1

    .line 727
    :goto_0
    return v0

    .line 725
    :cond_0
    iget-object v2, p0, Landroid/support/v7/widget/a$f;->a:Landroid/support/v7/widget/a;

    move-object v0, p1

    check-cast v0, Landroid/support/v7/internal/view/menu/m;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/m;->getItem()Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    iput v0, v2, Landroid/support/v7/widget/a;->u:I

    .line 726
    iget-object v0, p0, Landroid/support/v7/widget/a$f;->a:Landroid/support/v7/widget/a;

    .line 1152
    iget-object v0, v0, Landroid/support/v7/internal/view/menu/b;->f:Landroid/support/v7/internal/view/menu/j$a;

    .line 727
    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Landroid/support/v7/internal/view/menu/j$a;->a(Landroid/support/v7/internal/view/menu/e;)Z

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_0
.end method
