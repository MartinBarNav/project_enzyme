.class final Landroid/support/v7/internal/widget/SpinnerCompat$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/internal/widget/SpinnerCompat;->onRestoreInstanceState(Landroid/os/Parcelable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/internal/widget/SpinnerCompat;


# direct methods
.method constructor <init>(Landroid/support/v7/internal/widget/SpinnerCompat;)V
    .locals 0

    .prologue
    .line 699
    iput-object p1, p0, Landroid/support/v7/internal/widget/SpinnerCompat$2;->a:Landroid/support/v7/internal/widget/SpinnerCompat;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 1

    .prologue
    .line 702
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerCompat$2;->a:Landroid/support/v7/internal/widget/SpinnerCompat;

    invoke-static {v0}, Landroid/support/v7/internal/widget/SpinnerCompat;->a(Landroid/support/v7/internal/widget/SpinnerCompat;)Landroid/support/v7/internal/widget/SpinnerCompat$d;

    move-result-object v0

    invoke-interface {v0}, Landroid/support/v7/internal/widget/SpinnerCompat$d;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 703
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerCompat$2;->a:Landroid/support/v7/internal/widget/SpinnerCompat;

    invoke-static {v0}, Landroid/support/v7/internal/widget/SpinnerCompat;->a(Landroid/support/v7/internal/widget/SpinnerCompat;)Landroid/support/v7/internal/widget/SpinnerCompat$d;

    move-result-object v0

    invoke-interface {v0}, Landroid/support/v7/internal/widget/SpinnerCompat$d;->c()V

    .line 705
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerCompat$2;->a:Landroid/support/v7/internal/widget/SpinnerCompat;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/SpinnerCompat;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 706
    if-eqz v0, :cond_1

    .line 707
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 709
    :cond_1
    return-void
.end method
