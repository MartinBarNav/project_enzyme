.class final Landroid/support/v7/internal/view/menu/g$b;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/support/v7/c/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/view/menu/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field final a:Landroid/view/CollapsibleActionView;


# direct methods
.method constructor <init>(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 382
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    move-object v0, p1

    .line 383
    check-cast v0, Landroid/view/CollapsibleActionView;

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/g$b;->a:Landroid/view/CollapsibleActionView;

    .line 384
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/g$b;->addView(Landroid/view/View;)V

    .line 385
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 389
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g$b;->a:Landroid/view/CollapsibleActionView;

    invoke-interface {v0}, Landroid/view/CollapsibleActionView;->onActionViewExpanded()V

    .line 390
    return-void
.end method

.method public final a_()V
    .locals 1

    .prologue
    .line 394
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/g$b;->a:Landroid/view/CollapsibleActionView;

    invoke-interface {v0}, Landroid/view/CollapsibleActionView;->onActionViewCollapsed()V

    .line 395
    return-void
.end method
