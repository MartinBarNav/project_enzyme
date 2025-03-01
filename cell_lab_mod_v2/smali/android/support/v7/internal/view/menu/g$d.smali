.class final Landroid/support/v7/internal/view/menu/g$d;
.super Landroid/support/v7/internal/view/menu/d;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/view/menu/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/internal/view/menu/d",
        "<",
        "Landroid/view/MenuItem$OnMenuItemClickListener;",
        ">;",
        "Landroid/view/MenuItem$OnMenuItemClickListener;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/internal/view/menu/g;


# direct methods
.method constructor <init>(Landroid/support/v7/internal/view/menu/g;Landroid/view/MenuItem$OnMenuItemClickListener;)V
    .locals 0

    .prologue
    .line 315
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/g$d;->a:Landroid/support/v7/internal/view/menu/g;

    .line 316
    invoke-direct {p0, p2}, Landroid/support/v7/internal/view/menu/d;-><init>(Ljava/lang/Object;)V

    .line 317
    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2

    .prologue
    .line 321
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g$d;->d:Ljava/lang/Object;

    check-cast v0, Landroid/view/MenuItem$OnMenuItemClickListener;

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/g$d;->a:Landroid/support/v7/internal/view/menu/g;

    invoke-virtual {v1, p1}, Landroid/support/v7/internal/view/menu/g;->a(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/view/MenuItem$OnMenuItemClickListener;->onMenuItemClick(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method
