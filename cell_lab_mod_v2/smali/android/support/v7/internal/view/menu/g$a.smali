.class Landroid/support/v7/internal/view/menu/g$a;
.super Landroid/support/v4/view/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/view/menu/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final b:Landroid/view/ActionProvider;

.field final synthetic c:Landroid/support/v7/internal/view/menu/g;


# direct methods
.method public constructor <init>(Landroid/support/v7/internal/view/menu/g;Landroid/content/Context;Landroid/view/ActionProvider;)V
    .locals 0

    .prologue
    .line 346
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/g$a;->c:Landroid/support/v7/internal/view/menu/g;

    .line 347
    invoke-direct {p0, p2}, Landroid/support/v4/view/d;-><init>(Landroid/content/Context;)V

    .line 348
    iput-object p3, p0, Landroid/support/v7/internal/view/menu/g$a;->b:Landroid/view/ActionProvider;

    .line 349
    return-void
.end method


# virtual methods
.method public final a()Landroid/view/View;
    .locals 1

    .prologue
    .line 353
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g$a;->b:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->onCreateActionView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final a(Landroid/view/SubMenu;)V
    .locals 2

    .prologue
    .line 368
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g$a;->b:Landroid/view/ActionProvider;

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/g$a;->c:Landroid/support/v7/internal/view/menu/g;

    invoke-virtual {v1, p1}, Landroid/support/v7/internal/view/menu/g;->a(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ActionProvider;->onPrepareSubMenu(Landroid/view/SubMenu;)V

    .line 369
    return-void
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 358
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g$a;->b:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->onPerformDefaultAction()Z

    move-result v0

    return v0
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 363
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g$a;->b:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->hasSubMenu()Z

    move-result v0

    return v0
.end method
