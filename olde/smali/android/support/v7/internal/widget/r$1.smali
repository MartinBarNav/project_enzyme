.class final Landroid/support/v7/internal/widget/r$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/internal/widget/r;-><init>(Landroid/support/v7/widget/Toolbar;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final a:Landroid/support/v7/internal/view/menu/a;

.field final synthetic b:Landroid/support/v7/internal/widget/r;


# direct methods
.method constructor <init>(Landroid/support/v7/internal/widget/r;)V
    .locals 3

    .prologue
    .line 184
    iput-object p1, p0, Landroid/support/v7/internal/widget/r$1;->b:Landroid/support/v7/internal/widget/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 185
    new-instance v0, Landroid/support/v7/internal/view/menu/a;

    iget-object v1, p0, Landroid/support/v7/internal/widget/r$1;->b:Landroid/support/v7/internal/widget/r;

    .line 1055
    iget-object v1, v1, Landroid/support/v7/internal/widget/r;->a:Landroid/support/v7/widget/Toolbar;

    .line 185
    invoke-virtual {v1}, Landroid/support/v7/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v7/internal/widget/r$1;->b:Landroid/support/v7/internal/widget/r;

    .line 2055
    iget-object v2, v2, Landroid/support/v7/internal/widget/r;->b:Ljava/lang/CharSequence;

    .line 185
    invoke-direct {v0, v1, v2}, Landroid/support/v7/internal/view/menu/a;-><init>(Landroid/content/Context;Ljava/lang/CharSequence;)V

    iput-object v0, p0, Landroid/support/v7/internal/widget/r$1;->a:Landroid/support/v7/internal/view/menu/a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 192
    return-void
.end method
