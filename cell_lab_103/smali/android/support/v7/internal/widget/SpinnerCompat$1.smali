.class final Landroid/support/v7/internal/widget/SpinnerCompat$1;
.super Landroid/support/v7/widget/b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/internal/widget/SpinnerCompat;-><init>(Landroid/content/Context;IB)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/internal/widget/SpinnerCompat$c;

.field final synthetic b:Landroid/support/v7/internal/widget/SpinnerCompat;


# direct methods
.method constructor <init>(Landroid/support/v7/internal/widget/SpinnerCompat;Landroid/view/View;Landroid/support/v7/internal/widget/SpinnerCompat$c;)V
    .locals 0

    .prologue
    .line 189
    iput-object p1, p0, Landroid/support/v7/internal/widget/SpinnerCompat$1;->b:Landroid/support/v7/internal/widget/SpinnerCompat;

    iput-object p3, p0, Landroid/support/v7/internal/widget/SpinnerCompat$1;->a:Landroid/support/v7/internal/widget/SpinnerCompat$c;

    invoke-direct {p0, p2}, Landroid/support/v7/widget/b$b;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/support/v7/widget/b;
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerCompat$1;->a:Landroid/support/v7/internal/widget/SpinnerCompat$c;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 197
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerCompat$1;->b:Landroid/support/v7/internal/widget/SpinnerCompat;

    invoke-static {v0}, Landroid/support/v7/internal/widget/SpinnerCompat;->a(Landroid/support/v7/internal/widget/SpinnerCompat;)Landroid/support/v7/internal/widget/SpinnerCompat$d;

    move-result-object v0

    invoke-interface {v0}, Landroid/support/v7/internal/widget/SpinnerCompat$d;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 198
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerCompat$1;->b:Landroid/support/v7/internal/widget/SpinnerCompat;

    invoke-static {v0}, Landroid/support/v7/internal/widget/SpinnerCompat;->a(Landroid/support/v7/internal/widget/SpinnerCompat;)Landroid/support/v7/internal/widget/SpinnerCompat$d;

    move-result-object v0

    invoke-interface {v0}, Landroid/support/v7/internal/widget/SpinnerCompat$d;->c()V

    .line 200
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
