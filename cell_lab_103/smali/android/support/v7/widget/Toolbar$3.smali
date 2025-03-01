.class final Landroid/support/v7/widget/Toolbar$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/Toolbar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/widget/Toolbar;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/Toolbar;)V
    .locals 0

    .prologue
    .line 1011
    iput-object p1, p0, Landroid/support/v7/widget/Toolbar$3;->a:Landroid/support/v7/widget/Toolbar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 1014
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$3;->a:Landroid/support/v7/widget/Toolbar;

    .line 1537
    iget-object v1, v0, Landroid/support/v7/widget/Toolbar;->h:Landroid/support/v7/widget/Toolbar$a;

    if-nez v1, :cond_1

    const/4 v0, 0x0

    .line 1539
    :goto_0
    if-eqz v0, :cond_0

    .line 1540
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/f;->collapseActionView()Z

    .line 1015
    :cond_0
    return-void

    .line 1537
    :cond_1
    iget-object v0, v0, Landroid/support/v7/widget/Toolbar;->h:Landroid/support/v7/widget/Toolbar$a;

    iget-object v0, v0, Landroid/support/v7/widget/Toolbar$a;->b:Landroid/support/v7/internal/view/menu/f;

    goto :goto_0
.end method
