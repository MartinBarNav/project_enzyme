.class public Landroid/support/v7/internal/widget/NativeActionModeAwareLayout;
.super Landroid/support/v7/internal/widget/g;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/widget/NativeActionModeAwareLayout$a;
    }
.end annotation


# instance fields
.field private a:Landroid/support/v7/internal/widget/NativeActionModeAwareLayout$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1, p2}, Landroid/support/v7/internal/widget/g;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 36
    return-void
.end method


# virtual methods
.method public setActionModeForChildListener(Landroid/support/v7/internal/widget/NativeActionModeAwareLayout$a;)V
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Landroid/support/v7/internal/widget/NativeActionModeAwareLayout;->a:Landroid/support/v7/internal/widget/NativeActionModeAwareLayout$a;

    .line 40
    return-void
.end method

.method public startActionModeForChild(Landroid/view/View;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Landroid/support/v7/internal/widget/NativeActionModeAwareLayout;->a:Landroid/support/v7/internal/widget/NativeActionModeAwareLayout$a;

    if-eqz v0, :cond_0

    .line 44
    iget-object v0, p0, Landroid/support/v7/internal/widget/NativeActionModeAwareLayout;->a:Landroid/support/v7/internal/widget/NativeActionModeAwareLayout$a;

    invoke-interface {v0}, Landroid/support/v7/internal/widget/NativeActionModeAwareLayout$a;->a()Landroid/view/ActionMode;

    move-result-object v0

    .line 46
    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/support/v7/internal/widget/g;->startActionModeForChild(Landroid/view/View;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object v0

    goto :goto_0
.end method
